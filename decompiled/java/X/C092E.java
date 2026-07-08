package X;

/* JADX INFO: renamed from: X.092E, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C092E implements C092F {
    public static final C092E LIZ = new C092E();

    @Override // X.C092F
    public final void post() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    @Override // X.C092F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r13, java.lang.String r14, java.util.Map r15, org.json.JSONObject r16) {
        /*
            r12 = this;
            r11 = 1
            r0 = 202535(0x31727, float:2.83812E-40)
            boolean r4 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            com.ss.android.ugc.tiktok.location_api.service.net.TikTokLocationApi r3 = com.ss.android.ugc.tiktok.location_api.service.net.TikTokLocationApi.LIZ
            com.bytedance.retrofit2.mime.TypedString r9 = new com.bytedance.retrofit2.mime.TypedString
            java.lang.String r0 = java.lang.String.valueOf(r16)
            r9.<init>(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            X.080U r2 = new X.080U
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "application/json; encoding=utf-8"
            r2.<init>(r1, r0)
            r10.add(r2)
            r3.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L62
            r7 = r14
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L62
            if (r13 == 0) goto L71
            r3.getClass()     // Catch: java.lang.Exception -> L6a
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L6a
            java.lang.Class<com.bytedance.ies.ugc.aweme.network.IRetrofitFactory> r0 = com.bytedance.ies.ugc.aweme.network.IRetrofitFactory.class
            java.lang.Object r0 = r1.getService(r0)     // Catch: java.lang.Exception -> L6a
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r0 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r0     // Catch: java.lang.Exception -> L6a
            X.011f r1 = r0.LIZ(r13)     // Catch: java.lang.Exception -> L6a
            java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.net.TikTokLocationApi$RealApi> r0 = com.ss.android.ugc.tiktok.location_api.service.net.TikTokLocationApi.RealApi.class
            java.lang.Object r5 = r1.create(r0)     // Catch: java.lang.Exception -> L6a
            com.ss.android.ugc.tiktok.location_api.service.net.TikTokLocationApi$RealApi r5 = (com.ss.android.ugc.tiktok.location_api.service.net.TikTokLocationApi.RealApi) r5     // Catch: java.lang.Exception -> L6a
            if (r7 == 0) goto L71
            r6 = -1
            r8 = r15
            X.0X9S r0 = r5.doPostJson(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L6a
            X.0X52 r0 = r0.execute()     // Catch: java.lang.Exception -> L6a
            T r0 = r0.LIZIZ     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L6a
            goto L72
        L62:
            java.lang.String r1 = "TikTokLocationApi"
            java.lang.String r0 = "baseUrl or relativePath is null or empty"
            X.C2344809Gs.LJFF(r1, r0)
            goto L71
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C2344809Gs.LJI(r0)
        L71:
            r0 = 0
        L72:
            if (r4 == 0) goto L77
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C092E.LIZ(java.lang.String, java.lang.String, java.util.Map, org.json.JSONObject):java.lang.String");
    }
}
