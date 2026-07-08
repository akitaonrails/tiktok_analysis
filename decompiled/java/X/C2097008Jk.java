package X;

import android.os.Looper;

/* JADX INFO: renamed from: X.08Jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2097008Jk {
    /* JADX WARN: Removed duplicated region for block: B:50:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ() {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto Lb
            java.lang.String r0 = android.app.Application.getProcessName()
            return r0
        Lb:
            r3 = 0
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "currentProcessName"
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L28
            java.lang.reflect.Method r1 = r4.getMethod(r1, r0)     // Catch: java.lang.Exception -> L28
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Exception -> L28
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L28
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch: java.lang.Exception -> L28
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L28
            return r0
        L28:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L6d
            X.0VSF r1 = new X.0VSF     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L6d
            java.lang.String r0 = "/proc/self/cmdline"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L6d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L6d
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L70
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L70
            if (r0 != 0) goto L56
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L70
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L70
            if (r0 != 0) goto L56
            r2.close()     // Catch: java.lang.Exception -> L50
            goto L55
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r1
        L55:
            return r1
        L56:
            r2.close()     // Catch: java.lang.Exception -> L7a
            return r3
        L5a:
            r1 = move-exception
            r2 = r3
        L5c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r1 = move-exception
            goto L5c
        L62:
            if (r2 == 0) goto L6c
            r2.close()     // Catch: java.lang.Exception -> L68
            throw r1
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6c:
            throw r1
        L6d:
            r0 = move-exception
            r2 = r3
            goto L71
        L70:
            r0 = move-exception
        L71:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r2 == 0) goto L7e
            r2.close()     // Catch: java.lang.Exception -> L7a
            return r3
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2097008Jk.LIZ():java.lang.String");
    }

    public static boolean LIZIZ() {
        return Looper.getMainLooper().getThread() == C786410Ut5.u3();
    }
}
