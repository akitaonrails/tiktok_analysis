package X;

/* JADX INFO: renamed from: X.09jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2456009jq {
    public static long LIZ;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ() {
        /*
            long r6 = java.lang.System.currentTimeMillis()
            long r4 = X.C2456009jq.LIZ
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r3 = 0
            if (r0 != 0) goto L37
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            if (r0 == 0) goto L19
            goto L1c
        L19:
            r4 = 0
            goto L2e
        L1c:
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto L19
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L31
            android.content.pm.PackageInfo r0 = X.C786410Ut5.Y3(r1, r0, r3)     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L19
            long r4 = r0.firstInstallTime     // Catch: java.lang.Exception -> L31
        L2e:
            X.C2456009jq.LIZ = r4     // Catch: java.lang.Exception -> L31
            goto L37
        L31:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r4 = 0
        L37:
            long r6 = r6 - r4
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7
            long r1 = r2.toMillis(r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r2 = 1
            if (r0 > 0) goto L53
            r1 = 1
        L46:
            java.lang.Boolean r0 = X.C1514430pVp.LIZLLL()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L55
            if (r1 != 0) goto L55
            return r3
        L53:
            r1 = 0
            goto L46
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2456009jq.LIZ():boolean");
    }
}
