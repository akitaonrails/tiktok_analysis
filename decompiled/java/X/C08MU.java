package X;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08MU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MU {
    public static String LIZ;
    public static String LIZIZ;
    public static Boolean LIZJ;

    public static String LIZIZ() {
        BufferedReader bufferedReader;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(Process.myPid());
            sbLIZ.append("/cmdline");
            bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(C2188811AlT.LIZIZ(sbLIZ)), "iso-8859-1"));
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int i = bufferedReader.read();
                if (i <= 0) {
                    String string = sb.toString();
                    try {
                        bufferedReader.close();
                        return string;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return string;
                    }
                }
                sb.append((char) i);
            }
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                    return null;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028 A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x000f, B:11:0x0016, B:15:0x0020, B:17:0x0028, B:26:0x0057, B:28:0x005f, B:31:0x0063, B:33:0x006f, B:37:0x0075, B:39:0x008e, B:40:0x0092, B:42:0x0098, B:44:0x00a2, B:45:0x00a4, B:24:0x0053, B:13:0x001c, B:20:0x002c, B:22:0x004f), top: B:55:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String LIZ(android.content.Context r6) {
        /*
            java.lang.Class<X.08MU> r5 = X.C08MU.class
            monitor-enter(r5)
            java.lang.String r0 = X.C08MU.LIZ     // Catch: java.lang.Throwable -> La8
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto Lf
            java.lang.String r0 = X.C08MU.LIZ     // Catch: java.lang.Throwable -> La8
            monitor-exit(r5)
            return r0
        Lf:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La8
            r0 = 28
            r4 = 0
            if (r1 < r0) goto L1f
            java.lang.String r0 = android.app.Application.getProcessName()     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> La8
            goto L20
        L1b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La8
        L1f:
            r0 = r4
        L20:
            X.C08MU.LIZ = r0     // Catch: java.lang.Throwable -> La8
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L2c
            java.lang.String r0 = X.C08MU.LIZ     // Catch: java.lang.Throwable -> La8
            monitor-exit(r5)
            return r0
        L2c:
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r0 = android.app.Application.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L52
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r1, r3, r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "currentProcessName"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r1, r0)     // Catch: java.lang.Throwable -> L52
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L52
            java.lang.Object r1 = r1.invoke(r4, r0)     // Catch: java.lang.Throwable -> L52
            boolean r0 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L56
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L52
            goto L57
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La8
        L56:
            r1 = r4
        L57:
            X.C08MU.LIZ = r1     // Catch: java.lang.Throwable -> La8
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L63
            java.lang.String r0 = X.C08MU.LIZ     // Catch: java.lang.Throwable -> La8
            monitor-exit(r5)
            return r0
        L63:
            java.lang.String r0 = LIZIZ()     // Catch: java.lang.Throwable -> La8
            X.C08MU.LIZ = r0     // Catch: java.lang.Throwable -> La8
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L73
            java.lang.String r0 = X.C08MU.LIZ     // Catch: java.lang.Throwable -> La8
            monitor-exit(r5)
            return r0
        L73:
            if (r6 == 0) goto La4
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = "activity"
            java.lang.Object r2 = X.C786410Ut5.H2(r6, r0)     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Throwable -> La8
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = "dzBzEgAjS8/YVFkiQFyXf+nc+UexoGfUcGCs715vi8hoflmL8g=="
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> La8
            java.util.List r0 = X.C2204961BRm.LJII(r2, r1)     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto La4
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> La8
        L92:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto La4
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Throwable -> La8
            int r0 = r1.pid     // Catch: java.lang.Throwable -> La8
            if (r0 != r3) goto L92
            java.lang.String r4 = r1.processName     // Catch: java.lang.Throwable -> La8
        La4:
            X.C08MU.LIZ = r4     // Catch: java.lang.Throwable -> La8
            monitor-exit(r5)
            return r4
        La8:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08MU.LIZ(android.content.Context):java.lang.String");
    }

    public static String LIZJ(Context context) {
        String str;
        String str2 = LIZIZ;
        if (!C2093608Ic.LJ(str2)) {
            return str2;
        }
        String strLIZ = LIZ(context);
        if (!TextUtils.equals(strLIZ, context.getPackageName()) && strLIZ.contains(":")) {
            str = strLIZ.split(":")[1];
        } else {
            str = "";
        }
        LIZIZ = str;
        return str;
    }

    public static boolean LIZLLL(Context context) {
        Boolean bool = LIZJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        String strLIZ = LIZ(context);
        boolean z = false;
        if (strLIZ != null) {
            if (strLIZ.contains(":")) {
                return false;
            }
            if (strLIZ.equals(context.getPackageName())) {
                z = true;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        LIZJ = boolValueOf;
        return boolValueOf.booleanValue();
    }
}
