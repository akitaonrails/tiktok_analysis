package X;

/* JADX INFO: renamed from: X.0oqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488860oqa {
    public static final C1488860oqa LIZ = new C1488860oqa();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(float r5, float r6) {
        /*
            int r4 = X.C2528209vU.LIZ
            X.0pRs r0 = com.ss.android.ugc.aweme.ml.api.SmartHARService.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.ml.api.ISmartHARService r0 = X.C1511980pRs.LIZ()
            int r1 = r0.getLastStatus()
            r0 = 3
            r3 = 0
            if (r1 == r0) goto L14
            r5 = 0
        L14:
            r2 = 0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L3c
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r0 = com.ss.android.ugc.aweme.services.IExternalService.class
            java.lang.Object r0 = r1.getService(r0)     // Catch: java.lang.Exception -> L3c
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0     // Catch: java.lang.Exception -> L3c
            com.ss.android.ugc.aweme.services.audio.IAudioUserPortraitService r0 = r0.audioUserPortraitService()     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L30
            int r0 = r0.getUserAgeGroup()     // Catch: java.lang.Exception -> L3c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L3c
            goto L31
        L30:
            r0 = r2
        L31:
            if (r4 <= 0) goto L40
            if (r0 == 0) goto L40
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L3c
            if (r0 < r4) goto L40
            goto L41
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L40:
            r6 = 0
        L41:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto L51
            r0 = 1
        L47:
            if (r0 == 0) goto L53
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L4e
            r1 = 0
        L4e:
            if (r1 == 0) goto L53
            return r2
        L51:
            r0 = 0
            goto L47
        L53:
            com.ss.android.ugc.aweme.feed.audio.AudioTransparentSourceData r1 = new com.ss.android.ugc.aweme.feed.audio.AudioTransparentSourceData
            r1.<init>()
            java.lang.Float r0 = java.lang.Float.valueOf(r6)
            r1.setAgeLoudnessBias(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r1.setHarLieBias(r0)
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()
            com.google.gson.Gson r0 = r0.getGson()
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1488860oqa.LIZ(float, float):java.lang.String");
    }
}
