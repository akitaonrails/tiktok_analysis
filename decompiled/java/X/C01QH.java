package X;

/* JADX INFO: renamed from: X.01QH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01QH {
    public static final /* synthetic */ C01QH LIZ = new C01QH();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C01QG
            if (r0 == 0) goto L57
            r5 = r8
            X.01QG r5 = (X.C01QG) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 != r2) goto L5d
            X.C155000ia.LIZIZ(r4)
        L22:
            com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse r4 = (com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse) r4
            boolean r0 = r4.isSuccess()
            r1 = 0
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.getData()
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.ReportLiveStartResponse r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.ReportLiveStartResponse) r0
            if (r0 == 0) goto L35
            boolean r1 = r0.success
        L35:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L3a:
            X.C155000ia.LIZIZ(r4)
            X.01K1 r1 = X.C0NSL.LIZ()
            java.lang.Class<com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.BroadcasterBagApi> r0 = com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.BroadcasterBagApi.class
            java.lang.Object r1 = r1.create(r0)
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.BroadcasterBagApi r1 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.BroadcasterBagApi) r1
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.ReportLiveStartRequest r0 = new com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.ReportLiveStartRequest
            r0.<init>(r7)
            r5.LLILLL = r2
            java.lang.Object r4 = r1.creatorReportLiveStart(r0, r5)
            if (r4 != r3) goto L22
            return r3
        L57:
            X.01QG r5 = new X.01QG
            r5.<init>(r6, r8)
            goto L12
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01QH.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
