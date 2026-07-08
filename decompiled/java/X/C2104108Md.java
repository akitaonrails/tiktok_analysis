package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Md, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2104108Md {
    public static String LIZ;
    public static Boolean LIZIZ;
    public static Boolean LIZJ;

    /* JADX WARN: Can't wrap try/catch for region: R(11:10|(1:43)(1:44)|37|15|35|16|(5:17|(1:19)(1:45)|39|27|30)|20|39|27|30) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        r0 = r1.processName;
        X.C2104108Md.LIZ = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[Catch: all -> 0x0086, LOOP:1: B:17:0x0076->B:19:0x007c, LOOP_END, TryCatch #0 {all -> 0x0086, blocks: (B:16:0x0071, B:17:0x0076, B:19:0x007c, B:20:0x0081), top: B:35:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081 A[EDGE_INSN: B:45:0x0081->B:20:0x0081 BREAK  A[LOOP:1: B:17:0x0076->B:19:0x007c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r6) {
        /*
            java.lang.String r0 = X.C2103908Mb.LIZ()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9d
            java.lang.String r5 = X.C2104108Md.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L9b
            r5 = 0
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = "activity"
            java.lang.Object r2 = X.C786410Ut5.H2(r6, r0)     // Catch: java.lang.Exception -> L43
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Exception -> L43
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJCAySbz6pct8E6T6/Y4d7SUZPEU"
            r1.<init>(r0, r5)     // Catch: java.lang.Exception -> L43
            java.util.List r0 = X.C2204961BRm.LJII(r2, r1)     // Catch: java.lang.Exception -> L43
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L43
        L2e:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L47
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L43
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L43
            int r0 = r1.pid     // Catch: java.lang.Exception -> L43
            if (r0 != r3) goto L2e
            java.lang.String r0 = r1.processName     // Catch: java.lang.Exception -> L43
            X.C2104108Md.LIZ = r0     // Catch: java.lang.Exception -> L43
            goto L9a
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L47:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L88
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L88
            X.0VSP r2 = new X.0VSP     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L88
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L88
            r1.append(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L88
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L88
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r1.<init>()     // Catch: java.lang.Throwable -> L86
        L76:
            int r0 = r4.read()     // Catch: java.lang.Throwable -> L86
            if (r0 <= 0) goto L81
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L86
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            goto L76
        L81:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L86
            goto L8f
        L86:
            r0 = move-exception
            goto L8a
        L88:
            r0 = move-exception
            r4 = r5
        L8a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r4 == 0) goto L97
        L8f:
            r4.close()     // Catch: java.lang.Exception -> L93
            goto L97
        L93:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L97:
            X.C2104108Md.LIZ = r5
            goto L9b
        L9a:
            r5 = r0
        L9b:
            X.C2103908Mb.LIZ = r5
        L9d:
            java.lang.String r0 = X.C2103908Mb.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2104108Md.LIZ(android.content.Context):java.lang.String");
    }

    public static boolean LIZIZ(Context context) {
        try {
            return LIZ(context).contains("jobInfoSchedulerService");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean LIZJ(Context context) {
        try {
            Boolean bool = LIZJ;
            if (bool != null) {
                return bool.booleanValue();
            }
            Boolean boolValueOf = Boolean.valueOf(LIZ(context).contains("launch_protect"));
            LIZJ = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean LIZLLL(Context context) {
        String strLIZ = LIZ(context);
        if (strLIZ == null || strLIZ.contains(":") || !strLIZ.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public static boolean LJ(Context context) {
        try {
            if (LIZLLL(context)) {
                return false;
            }
            Boolean bool = LIZIZ;
            if (bool != null) {
                return bool.booleanValue();
            }
            Boolean boolValueOf = Boolean.valueOf(LIZ(context).contains("sandboxed_process"));
            LIZIZ = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
