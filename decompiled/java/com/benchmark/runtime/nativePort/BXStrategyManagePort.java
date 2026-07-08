package com.benchmark.runtime.nativePort;

import X.C2079408Cq;

/* JADX INFO: loaded from: classes33.dex */
public class BXStrategyManagePort {
    private native void native_createBenchStrategy(int i);

    private native void native_releaseByteBenchStrategy(int i);

    public final void LIZ(int i) {
        if (!C2079408Cq.LIZIZ) {
            return;
        }
        native_createBenchStrategy(i);
    }
}
