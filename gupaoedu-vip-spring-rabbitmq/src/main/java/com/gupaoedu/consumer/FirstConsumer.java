package com.gupaoedu.consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * @Author: qingshan
 * @Description: 咕泡学院，只为更好的你
 */
public class FirstConsumer implements MessageListener {
    private Logger logger = LoggerFactory.getLogger(FirstConsumer.class);

    public void onMessage(Message message) {
        logger.info("The first consumer received message : " + message.getBody());
    }
}