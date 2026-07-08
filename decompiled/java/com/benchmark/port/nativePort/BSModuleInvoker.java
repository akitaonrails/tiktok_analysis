package com.benchmark.port.nativePort;

import X.C2079408Cq;

/* JADX INFO: loaded from: classes33.dex */
public class BSModuleInvoker {
    public static native void nativeSetJsWorker(long j);

    static {
        C2079408Cq.LIZ();
        if (C2079408Cq.LIZIZ) {
            return;
        }
        C2079408Cq.LIZ();
    }

    public static void LIZ(long j) {
        if (C2079408Cq.LIZIZ) {
            nativeSetJsWorker(j);
        }
    }
}
