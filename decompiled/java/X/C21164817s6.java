package X;

/* JADX INFO: renamed from: X.17s6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21164817s6 {
    public static final /* synthetic */ C21164817s6 LIZ = new C21164817s6();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommercelive.audience.sea.api.SeaRoomApi.GetLiveRoomCommonInfoResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C21164717s5
            if (r0 == 0) goto L21
            r5 = r9
            X.17s5 r5 = (X.C21164717s5) r5
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
            goto L4c
        L21:
            X.17s5 r5 = new X.17s5
            r5.<init>(r6, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C0NSL.LIZ()     // Catch: java.lang.Exception -> L5e
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.audience.sea.api.SeaRoomApi> r0 = com.ss.android.ugc.aweme.ecommercelive.audience.sea.api.SeaRoomApi.class
            java.lang.Object r1 = r1.create(r0)     // Catch: java.lang.Exception -> L5e
            com.ss.android.ugc.aweme.ecommercelive.audience.sea.api.SeaRoomApi r1 = (com.ss.android.ugc.aweme.ecommercelive.audience.sea.api.SeaRoomApi) r1     // Catch: java.lang.Exception -> L5e
            com.ss.android.ugc.aweme.ecommercelive.audience.sea.api.SeaRoomApi$GetLiveRoomCommonInfoRequest r0 = new com.ss.android.ugc.aweme.ecommercelive.audience.sea.api.SeaRoomApi$GetLiveRoomCommonInfoRequest     // Catch: java.lang.Exception -> L5e
            r0.<init>(r7, r8)     // Catch: java.lang.Exception -> L5e
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L5e
            java.lang.Object r1 = r1.getLiveRoomCommonInfo(r0, r5)     // Catch: java.lang.Exception -> L5e
            if (r1 != r4) goto L4f
            return r4
        L4c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L5e
        L4f:
            com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse r1 = (com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse) r1     // Catch: java.lang.Exception -> L5e
            boolean r0 = r1.isSuccess()     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L62
            java.lang.Object r0 = r1.getData()     // Catch: java.lang.Exception -> L5e
            com.ss.android.ugc.aweme.ecommercelive.audience.sea.api.SeaRoomApi$GetLiveRoomCommonInfoResponse r0 = (com.ss.android.ugc.aweme.ecommercelive.audience.sea.api.SeaRoomApi.GetLiveRoomCommonInfoResponse) r0     // Catch: java.lang.Exception -> L5e
            return r0
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21164817s6.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
