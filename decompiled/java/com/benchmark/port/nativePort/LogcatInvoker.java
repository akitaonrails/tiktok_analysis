package com.benchmark.port.nativePort;

import X.C2079408Cq;

/* JADX INFO: loaded from: classes33.dex */
public class LogcatInvoker {
    public static native void nativeSetLogLevel(byte b);

    static {
        C2079408Cq.LIZ();
        if (C2079408Cq.LIZIZ) {
            return;
        }
        C2079408Cq.LIZ();
    }

    public static void LIZ(byte b) {
        if (C2079408Cq.LIZIZ) {
            nativeSetLogLevel(b);
        }
    }
}
