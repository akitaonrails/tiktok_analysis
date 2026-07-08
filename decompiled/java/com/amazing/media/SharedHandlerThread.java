package com.amazing.media;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes21.dex */
public class SharedHandlerThread {
    public static SharedHandlerThread LIZJ;
    public HandlerThread LIZ;
    public int LIZIZ;

    public final synchronized void LIZIZ() {
        this.LIZIZ++;
        HandlerThread handlerThread = this.LIZ;
        if (handlerThread == null || !handlerThread.isAlive()) {
            HandlerThread handlerThread2 = this.LIZ;
            if (handlerThread2 != null && !handlerThread2.isAlive()) {
                this.LIZ = null;
            }
            HandlerThread handlerThread3 = new HandlerThread("AMG-MediaCodec", -10);
            this.LIZ = handlerThread3;
            handlerThread3.start();
        }
        HandlerThread handlerThread4 = this.LIZ;
        if (handlerThread4 != null) {
            handlerThread4.isAlive();
        }
    }

    public static synchronized SharedHandlerThread LIZ() {
        if (LIZJ == null) {
            LIZJ = new SharedHandlerThread();
        }
        return LIZJ;
    }
}
