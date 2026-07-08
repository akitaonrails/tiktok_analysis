package X;

/* JADX INFO: renamed from: X.0Nzv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612290Nzv {
    public static final /* synthetic */ C612290Nzv LIZ = new C612290Nzv();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.LivePreviewECIconInfoResponse> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C612300Nzw
            if (r0 == 0) goto L21
            r5 = r7
            X.0Nzw r5 = (X.C612300Nzw) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L48
        L21:
            X.0Nzw r5 = new X.0Nzw
            r5.<init>(r6, r7)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C0NSL.LIZ()     // Catch: java.lang.Exception -> L60
            java.lang.Class<com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.LivePreviewECIconInfoApi> r0 = com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.LivePreviewECIconInfoApi.class
            java.lang.Object r1 = r1.create(r0)     // Catch: java.lang.Exception -> L60
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.LivePreviewECIconInfoApi r1 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.LivePreviewECIconInfoApi) r1     // Catch: java.lang.Exception -> L60
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L60
            r0 = 2
            java.lang.Object r1 = r1.getLivePreviewECIconInfo(r0, r5)     // Catch: java.lang.Exception -> L60
            if (r1 != r4) goto L4b
            return r4
        L48:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L60
        L4b:
            com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse r1 = (com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse) r1     // Catch: java.lang.Exception -> L60
            if (r1 == 0) goto L56
            boolean r0 = r1.isSuccess()     // Catch: java.lang.Exception -> L60
            if (r0 != r2) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            if (r2 == 0) goto L64
            java.lang.Object r0 = r1.getData()     // Catch: java.lang.Exception -> L60
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.LivePreviewECIconInfoResponse r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.LivePreviewECIconInfoResponse) r0     // Catch: java.lang.Exception -> L60
            return r0
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C612290Nzv.LIZ(X.05Vn):java.lang.Object");
    }
}
