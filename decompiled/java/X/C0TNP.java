package X;

/* JADX INFO: renamed from: X.0TNP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TNP {
    public static final C0TNP LIZ = new C0TNP();

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ() {
        /*
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r0 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            java.lang.Object r7 = r1.getService(r0)
            com.ss.android.ugc.aweme.framework.services.IUserService r7 = (com.ss.android.ugc.aweme.framework.services.IUserService) r7
            long r3 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 21
            long r11 = r2.toMillis(r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.getCurrentUser()
            long r0 = r0.getCreateTime()
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.getCurrentUser()
            long r5 = r2.getRegisterTime()
            boolean r2 = r7.isLogin()
            r8 = 0
            if (r2 != 0) goto L4b
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Exception -> L62
            if (r1 == 0) goto L66
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L62
            android.content.pm.PackageInfo r0 = X.C786410Ut5.Y3(r1, r0, r8)     // Catch: java.lang.Exception -> L62
            if (r0 == 0) goto L66
            long r9 = r0.firstInstallTime     // Catch: java.lang.Exception -> L62
            goto L68
        L4b:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r9 = r7.toMillis(r0)
            long r1 = r3 - r9
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 < 0) goto L6e
            long r9 = r7.toMillis(r5)
            long r1 = r3 - r9
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L6f
            goto L6e
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L66:
            r9 = 0
        L68:
            long r1 = r3 - r9
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L6f
        L6e:
            r8 = 1
        L6f:
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r7 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "days since registration: "
            r7.append(r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r5)
            long r3 = r3 - r0
            long r0 = r2.toDays(r3)
            r7.append(r0)
            java.lang.String r0 = " \nis new user: "
            r7.append(r0)
            r7.append(r8)
            X.C2188811AlT.LIZIZ(r7)
            r0 = r8 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TNP.LIZ():boolean");
    }
}
