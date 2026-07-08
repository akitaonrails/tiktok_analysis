package X;

/* JADX INFO: renamed from: X.0Vt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811890Vt5 {
    public static volatile AbstractC19852312lt<Boolean> LIZ = AbstractC19852312lt.absent();
    public static final Object LIZIZ = new Object();

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #1 {all -> 0x0096, blocks: (B:11:0x0026, B:13:0x002e, B:14:0x003a, B:16:0x003c, B:18:0x0048, B:22:0x0058, B:24:0x005e, B:33:0x007e, B:34:0x0088, B:26:0x0068, B:27:0x006c, B:28:0x0072, B:32:0x007b), top: B:43:0x0026, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.content.Context r6, android.net.Uri r7) {
        /*
            java.lang.String r1 = r7.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r1)
            r4 = 0
            if (r0 != 0) goto Le
            return r4
        Le:
            X.12lt<java.lang.Boolean> r0 = X.C811890Vt5.LIZ
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L23
            X.12lt<java.lang.Boolean> r0 = X.C811890Vt5.LIZ
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L23:
            java.lang.Object r5 = X.C811890Vt5.LIZIZ
            monitor-enter(r5)
            X.12lt<java.lang.Boolean> r0 = X.C811890Vt5.LIZ     // Catch: java.lang.Throwable -> L96
            boolean r0 = r0.isPresent()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L3c
            X.12lt<java.lang.Boolean> r0 = X.C811890Vt5.LIZ     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L96
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L96
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L96
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L96
            return r0
        L3c:
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r0 = r6.getPackageName()     // Catch: java.lang.Throwable -> L96
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L68
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L96
            r0 = 29
            if (r1 >= r0) goto L56
            r0 = 0
            goto L58
        L56:
            r0 = 268435456(0x10000000, float:2.524355E-29)
        L58:
            android.content.pm.ProviderInfo r0 = r3.resolveContentProvider(r2, r0)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L7e
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L96
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L7e
        L68:
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r0 = X.C786410Ut5.V3(r1, r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7a java.lang.Throwable -> L96
            int r0 = r0.flags     // Catch: java.lang.Throwable -> L96
            r0 = r0 & 129(0x81, float:1.81E-43)
            if (r0 == 0) goto L7e
            r4 = 1
            goto L7e
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L96
        L7e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L96
            X.12lt r0 = X.AbstractC19852312lt.of(r0)     // Catch: java.lang.Throwable -> L96
            X.C811890Vt5.LIZ = r0     // Catch: java.lang.Throwable -> L96
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L96
            X.12lt<java.lang.Boolean> r0 = X.C811890Vt5.LIZ
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L96:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L96
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C811890Vt5.LIZ(android.content.Context, android.net.Uri):boolean");
    }
}
