package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.181E, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C181E {
    public static final /* synthetic */ C181E LIZ = new C181E();
    public static final InterfaceC2661011f LIZIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com").build();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Long r7, java.lang.String r8, X.InterfaceC1364105Vn r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C21162817rm
            if (r0 == 0) goto L20
            r5 = r9
            X.17rm r5 = (X.C21162817rm) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L4a
        L20:
            X.17rm r5 = new X.17rm
            r5.<init>(r6, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.011f r1 = X.C181E.LIZIZ     // Catch: java.lang.Exception -> L50
            java.lang.Class<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.BcToggleApi> r0 = com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.BcToggleApi.class
            java.lang.Object r2 = r1.create(r0)     // Catch: java.lang.Exception -> L50
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.BcToggleApi r2 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.BcToggleApi) r2     // Catch: java.lang.Exception -> L50
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.SelfSaleModeRequestBody r1 = new com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.SelfSaleModeRequestBody     // Catch: java.lang.Exception -> L50
            r0 = 2
            r1.<init>(r8, r0, r7)     // Catch: java.lang.Exception -> L50
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L50
            java.lang.Object r1 = r2.getCreatorSaleMode(r1, r5)     // Catch: java.lang.Exception -> L50
            if (r1 != r4) goto L4d
            return r4
        L4a:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L50
        L4d:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse r1 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse) r1     // Catch: java.lang.Exception -> L50
            return r1
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse r1 = new com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse
            r1.<init>()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setMessage(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C181E.LIZ(java.lang.Long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
