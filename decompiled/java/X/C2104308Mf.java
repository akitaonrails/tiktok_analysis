package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Mf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2104308Mf {
    public static String LIZ;
    public static Boolean LIZIZ;

    public static boolean LIZ() {
        Boolean bool = LIZIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            LIZIZ = Boolean.valueOf("harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ = Boolean.FALSE;
        }
        return LIZIZ.booleanValue();
    }

    public static boolean LIZJ() {
        String strLIZ = C2029607xG.LIZ("ro.build.characteristics");
        return strLIZ != null && "tablet".equalsIgnoreCase(strLIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:8|(1:52)(1:53)|44|16|48|17|(5:18|(1:20)(1:54)|50|30|33)|21|(1:23)|24|50|30|33) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (X.C20441214yg.LIZJ() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        X.C20441214yg.LIZIZ("Process", "processName = " + r2.processName);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        r0 = r2.processName;
        X.C2104308Mf.LIZ = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cb, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[Catch: all -> 0x00ba, LOOP:1: B:18:0x008a->B:20:0x0090, LOOP_END, TryCatch #2 {all -> 0x00ba, blocks: (B:17:0x0085, B:18:0x008a, B:20:0x0090, B:21:0x0095, B:23:0x009b, B:24:0x00b2), top: B:48:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b A[Catch: all -> 0x00ba, TryCatch #2 {all -> 0x00ba, blocks: (B:17:0x0085, B:18:0x008a, B:20:0x0090, B:21:0x0095, B:23:0x009b, B:24:0x00b2), top: B:48:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095 A[EDGE_INSN: B:54:0x0095->B:21:0x0095 BREAK  A[LOOP:1: B:18:0x008a->B:20:0x0090], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.content.Context r7) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2104308Mf.LIZIZ(android.content.Context):boolean");
    }
}
