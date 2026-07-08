package X;

/* JADX INFO: renamed from: X.04rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1231604rq {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig LIZ(com.google.gson.Gson r3, java.lang.String r4) {
        /*
            boolean r0 = kotlin.text.a0.LJJJIL(r4)
            if (r0 == 0) goto Lb
            r0 = 1
        L7:
            r2 = 0
            if (r0 == 0) goto Ld
            return r2
        Lb:
            r0 = 0
            goto L7
        Ld:
            java.lang.Class<com.google.gson.k> r0 = com.google.gson.k.class
            java.lang.Object r1 = r3.LJII(r4, r0)     // Catch: java.lang.Throwable -> L78
            com.google.gson.k r1 = (com.google.gson.k) r1     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L76
            boolean r0 = r1 instanceof com.google.gson.n     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L76
            com.google.gson.n r1 = r1.LJIILIIL()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "data"
            boolean r0 = r1.LJJIJIIJIL(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L3b
            java.lang.String r0 = "status_code"
            boolean r0 = r1.LJJIJIIJIL(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L3b
            java.lang.Class<com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig> r0 = com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig.class
            java.lang.Object r1 = r3.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L78
            com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig r1 = (com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig) r1     // Catch: java.lang.Throwable -> L78
        L37:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L78
            goto L84
        L3b:
            java.lang.Class<com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoPrefetchResponse> r0 = com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoPrefetchResponse.class
            java.lang.Object r1 = r3.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L78
            com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoPrefetchResponse r1 = (com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoPrefetchResponse) r1     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L76
            int r0 = r1.statusCode     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L76
            X.04rq r0 = com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoPrefetchResponse.LIZ     // Catch: java.lang.Throwable -> L78
            com.google.gson.k r1 = r1.data     // Catch: java.lang.Throwable -> L78
            r0.getClass()     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L76
            boolean r0 = r1 instanceof com.google.gson.n     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L5f
            java.lang.Class<com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig> r0 = com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig.class
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r1, r0)     // Catch: java.lang.Throwable -> L78
            com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig r1 = (com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig) r1     // Catch: java.lang.Throwable -> L78
            goto L37
        L5f:
            boolean r0 = r1 instanceof com.google.gson.q     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L76
            java.lang.String r1 = r1.LJIL()     // Catch: java.lang.Throwable -> L78
            boolean r0 = kotlin.text.a0.LJJJIL(r1)     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L76
            java.lang.Class<com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig> r0 = com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig.class
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r1, r0)     // Catch: java.lang.Throwable -> L78
            com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig r1 = (com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig) r1     // Catch: java.lang.Throwable -> L78
            goto L37
        L76:
            r1 = r2
            goto L37
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L84:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L8b
            r2 = r1
        L8b:
            com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig r2 = (com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1231604rq.LIZ(com.google.gson.Gson, java.lang.String):com.ss.android.ugc.aweme.rich.reward.gecko.api.RewardGeckoChannelConfig");
    }
}
