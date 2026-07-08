package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.08dZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2162308dZ {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;

    public static boolean LIZLLL() {
        try {
            String str = Build.BRAND;
            if (!C2093608Ic.LJ(str) && str.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                return true;
            }
            String str2 = Build.MANUFACTURER;
            if (!C2093608Ic.LJ(str2)) {
                if (str2.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    public static boolean LIZJ() {
        String str = Build.DISPLAY;
        if (C2093608Ic.LJ(str) || str.indexOf("Flyme") < 0) {
            return !C2093608Ic.LJ(Build.USER) && Build.USER.equals("flyme");
        }
        return true;
    }

    public static boolean LJII() {
        if (!LIZIZ) {
            try {
                Class.forName("miui.os.Build");
                LIZ = true;
                LIZIZ = true;
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LIZIZ = true;
            }
        }
        return LIZ;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:10|(1:43)(1:44)|(4:41|15|39|16)|(5:17|(1:19)(1:45)|35|27|30)|20|35|27|30) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        com.bytedance.common.utility.Logger.debug();
        r0 = r1.processName;
        X.C2162308dZ.LIZJ = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[Catch: all -> 0x008c, LOOP:1: B:17:0x0079->B:19:0x007f, LOOP_END, TryCatch #2 {all -> 0x008c, blocks: (B:16:0x0074, B:17:0x0079, B:19:0x007f, B:20:0x0084), top: B:39:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084 A[EDGE_INSN: B:45:0x0084->B:20:0x0084 BREAK  A[LOOP:1: B:17:0x0079->B:19:0x007f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r6) {
        /*
            java.lang.String r0 = X.C2103908Mb.LIZ()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La3
            java.lang.String r5 = X.C2162308dZ.LIZJ
            boolean r0 = X.C2093608Ic.LJ(r5)
            if (r0 == 0) goto La1
            r5 = 0
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = "activity"
            java.lang.Object r2 = X.C786410Ut5.H2(r6, r0)     // Catch: java.lang.Exception -> L46
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Exception -> L46
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKZTmhVITkWSj6weDpA2jrlA/pCwCo"
            r1.<init>(r0, r5)     // Catch: java.lang.Exception -> L46
            java.util.List r0 = X.C2204961BRm.LJII(r2, r1)     // Catch: java.lang.Exception -> L46
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L46
        L2e:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L4a
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L46
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L46
            int r0 = r1.pid     // Catch: java.lang.Exception -> L46
            if (r0 != r3) goto L2e
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = r1.processName     // Catch: java.lang.Exception -> L46
            X.C2162308dZ.LIZJ = r0     // Catch: java.lang.Exception -> L46
            goto La0
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4a:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L8e
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L8e
            X.0VSP r2 = new X.0VSP     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8e
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L8e
            r1.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L8e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L8e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r1.<init>()     // Catch: java.lang.Throwable -> L8c
        L79:
            int r0 = r4.read()     // Catch: java.lang.Throwable -> L8c
            if (r0 <= 0) goto L84
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L8c
            r1.append(r0)     // Catch: java.lang.Throwable -> L8c
            goto L79
        L84:
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L8c
            goto L95
        L8c:
            r0 = move-exception
            goto L90
        L8e:
            r0 = move-exception
            r4 = r5
        L90:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r4 == 0) goto L9d
        L95:
            r4.close()     // Catch: java.lang.Exception -> L99
            goto L9d
        L99:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L9d:
            X.C2162308dZ.LIZJ = r5
            goto La1
        La0:
            r5 = r0
        La1:
            X.C2103908Mb.LIZ = r5
        La3:
            java.lang.String r0 = X.C2103908Mb.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2162308dZ.LIZ(android.content.Context):java.lang.String");
    }

    public static boolean LJI(Context context) {
        String strLIZ = LIZ(context);
        if (strLIZ == null || strLIZ.contains(":") || !strLIZ.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public static Intent LIZIZ(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return launchIntentForPackage;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static boolean LJ(Context context, Intent intent) {
        List listLJJJJZ;
        if (intent == null || (listLJJJJZ = C2204961BRm.LJJJJZ(context.getPackageManager(), intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKZTmhVITkWSj6weDpA2jrlA/pCwCo", null))) == null || listLJJJJZ.size() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(Context context, String str) {
        if (context != null && !C2093608Ic.LJ(str)) {
            try {
                if (C786410Ut5.Y3(context.getPackageManager(), str, 16777216) != null) {
                    return true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
