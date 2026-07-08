package X;

import java.lang.Thread;

/* JADX INFO: renamed from: X.09br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2406509br implements Thread.UncaughtExceptionHandler {
    public static final Object LIZ = new Object();
    public static volatile long LIZIZ = 0;
    public static Thread.UncaughtExceptionHandler LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r12, java.lang.Throwable r13) {
        /*
            r11 = this;
            r2 = r13
        L1:
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto Lc
            java.lang.Throwable r2 = r2.getCause()
            goto L1
        Lc:
            boolean r0 = r2 instanceof java.lang.OutOfMemoryError
            if (r0 == 0) goto Lbd
            X.09c1 r0 = X.C2406809bu.LIZIZ
            r10 = 1
            r5 = 0
            if (r0 == 0) goto Lbd
            X.01GW r0 = X.C2407309bz.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L43
            X.01GW r0 = X.C2368509Pv.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L43
            X.01GW r0 = X.C2368509Pv.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbd
        L43:
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L55
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "Failed to allocate"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L83
        L55:
            X.09c1 r0 = X.C2406809bu.LIZIZ     // Catch: java.lang.Throwable -> Laf
            r1 = 0
            if (r0 == 0) goto Lbd
            X.01GW r0 = X.C2407109bx.LIZ     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Laf
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> Laf
            double r8 = r0.doubleValue()     // Catch: java.lang.Throwable -> Laf
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lbd
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> Laf
            long r6 = r4.totalMemory()     // Catch: java.lang.Throwable -> Laf
            long r0 = r4.freeMemory()     // Catch: java.lang.Throwable -> Laf
            long r6 = r6 - r0
            double r2 = (double) r6     // Catch: java.lang.Throwable -> Laf
            long r6 = r4.maxMemory()     // Catch: java.lang.Throwable -> Laf
            double r0 = (double) r6     // Catch: java.lang.Throwable -> Laf
            double r2 = r2 / r0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 < 0) goto Lbd
        L83:
            java.lang.Object r6 = X.C2406509br.LIZ
            monitor-enter(r6)
            long r3 = X.C2406509br.LIZIZ     // Catch: java.lang.Throwable -> La9
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L96
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> La9
            X.C2406509br.LIZIZ = r0     // Catch: java.lang.Throwable -> La9
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La9
            goto Lb4
        L96:
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> La9
            long r0 = X.C2406509br.LIZIZ     // Catch: java.lang.Throwable -> La9
            long r3 = r3 - r0
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto La5
            r10 = 0
        La5:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La9
            if (r10 == 0) goto Lb4
            return
        La9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La9
            throw r0
        Laf:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto Lbd
        Lb4:
            X.09bq r1 = new X.09bq
            r1.<init>(r5, r5)
            r0 = 0
            X.C2405709bj.LIZ(r1, r5, r0)
        Lbd:
            java.lang.Thread$UncaughtExceptionHandler r0 = X.C2406509br.LIZJ
            if (r0 == 0) goto Lc4
            r0.uncaughtException(r12, r13)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2406509br.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
