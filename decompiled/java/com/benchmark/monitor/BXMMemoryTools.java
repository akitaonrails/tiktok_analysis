package com.benchmark.monitor;

import com.bytedance.ttnet.TTNetInit;

/* JADX INFO: loaded from: classes14.dex */
public class BXMMemoryTools {
    public static double getJavaHeapFreeMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    public static double getJavaHeapMaxMemory() {
        return Runtime.getRuntime().maxMemory();
    }

    public static double getJavaHeapMemoryUsage() {
        double d = Runtime.getRuntime().totalMemory();
        return ((d - Runtime.getRuntime().freeMemory()) * 1.0d) / d;
    }

    public static double getJavaHeapTotalMemory() {
        return Runtime.getRuntime().totalMemory();
    }

    public static double getNetWorkLevel() {
        return TTNetInit.getEffectiveConnectionType();
    }
}
