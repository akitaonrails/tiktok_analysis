package com.benchmark.port.nativePort;

import X.C2079408Cq;
import X.C21309218aI;
import X.C21309418aK;
import X.C2188811AlT;
import X.C806930Vl5;

/* JADX INFO: loaded from: classes33.dex */
public class ApplogUtilsInvoker {
    public static native void nativeInit();

    public static void Init() {
        if (C2079408Cq.LIZIZ) {
            nativeInit();
        }
    }

    static {
        C2079408Cq.LIZ();
        if (C2079408Cq.LIZIZ) {
            return;
        }
        C2079408Cq.LIZ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isInSampleList(java.lang.String r3) {
        /*
            r3.getClass()
            int r0 = r3.hashCode()
            r2 = 1
            r1 = 0
            switch(r0) {
                case -1204796109: goto Ld;
                case 1066706310: goto L16;
                case 1600846586: goto L1f;
                default: goto Lc;
            }
        Lc:
            return r1
        Ld:
            java.lang.String r0 = "bytebench_strategy_get_operation_result"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L28
            return r1
        L16:
            java.lang.String r0 = "bytebench_collection_report_task"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L28
            return r1
        L1f:
            java.lang.String r0 = "bytebench_strategy_request"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L28
            return r1
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.port.nativePort.ApplogUtilsInvoker.isInSampleList(java.lang.String):boolean");
    }

    public static void onNativeCallback_onAppLogJson(String str, String str2) {
        if (isInSampleList(str) && !C21309218aI.LIZ(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Event: ");
            sbLIZ.append(str);
            sbLIZ.append(", filter upload by sample");
            C2188811AlT.LIZIZ(sbLIZ);
            C806930Vl5.LIZ("AppLogOpt");
            return;
        }
        C21309418aK.LIZIZ(str, str2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Event:");
        sbLIZ2.append(str);
        sbLIZ2.append(",json: ");
        sbLIZ2.append(str2);
        C2188811AlT.LIZIZ(sbLIZ2);
        C806930Vl5.LIZ("ApplogUtilsInvoker");
    }
}
