package X;

/* JADX INFO: renamed from: X.0W4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817430W4v {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Intent r10) {
        /*
            r6 = 0
            if (r10 == 0) goto L2d
            java.lang.String r0 = "result"
            java.lang.String r2 = r10.getStringExtra(r0)     // Catch: java.lang.Exception -> L24
            if (r2 == 0) goto L2d
            int r0 = r2.length()
            if (r0 <= 0) goto L2d
            X.01GW r0 = X.C817450W4x.LIZ     // Catch: java.lang.Exception -> L29
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L29
            com.google.gson.Gson r1 = (com.google.gson.Gson) r1     // Catch: java.lang.Exception -> L29
            java.lang.Class<com.ss.n_project.opensdk_tt.bean.AuthResultBeanV2> r0 = com.ss.n_project.opensdk_tt.bean.AuthResultBeanV2.class
            java.lang.Object r4 = r1.LJII(r2, r0)     // Catch: java.lang.Exception -> L29
            com.ss.n_project.opensdk_tt.bean.AuthResultBeanV2 r4 = (com.ss.n_project.opensdk_tt.bean.AuthResultBeanV2) r4     // Catch: java.lang.Exception -> L29
            if (r4 != 0) goto L37
            goto L2d
        L24:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L2d
        L29:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2d:
            com.ss.n_project.opensdk_tt.bean.AuthResultBeanV2 r4 = new com.ss.n_project.opensdk_tt.bean.AuthResultBeanV2
            r5 = 0
            r7 = r6
            r8 = r5
            r9 = r6
            r10 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L37:
            X.0W4w r3 = X.C817410W4t.LIZ
            if (r3 == 0) goto L44
            boolean r2 = r4.success
            java.lang.String r1 = r4.authCode
            int r0 = r4.errorCode
            r3.LIZ(r0, r1, r2)
        L44:
            X.C817410W4t.LIZ = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C817430W4v.LIZ(android.content.Intent):void");
    }
}
