package com.eamon.escep.exception;

/**
 * This <tt>Exception</tt> is thrown whenever jscep is unable to decode a SCEP
 * secure message object.
 */
public class ScepServerException extends Exception {
    /**
     * Serialization ID.
     */
    private static final long serialVersionUID = -6111956271602335933L;

    /**
     * Creates a new <tt>MessageDecodingException</tt> with the provided cause.
     *
     * @param cause the initial cause of the decoding exception.
     */
    public ScepServerException(final Throwable cause) {
        super(cause);
    }

    /**
     * Creates a new <tt>MessageDecodingException</tt> with the provided error
     * message.
     *
     * @param message the description of the decoding exception.
     */
    public ScepServerException(final String message) {
        super(message);
    }
}