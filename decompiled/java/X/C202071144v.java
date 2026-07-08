package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.144v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202071144v {
    public static final /* synthetic */ C202071144v LIZ = new C202071144v();
    public static final InterfaceC2661011f LIZIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com").build();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.BagAssembleRequest r7, X.InterfaceC1364105Vn<java.lang.Object> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C202072144w
            if (r0 == 0) goto L20
            r4 = r8
            X.144w r4 = (X.C202072144w) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            goto L26
        L20:
            X.144w r4 = new X.144w
            r4.<init>(r5, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4c
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.011f r1 = X.C202071144v.LIZIZ     // Catch: java.lang.Exception -> L4c
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.BagAssembleApi> r0 = com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.BagAssembleApi.class
            java.lang.Object r1 = r1.create(r0)     // Catch: java.lang.Exception -> L4c
            com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.BagAssembleApi r1 = (com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.BagAssembleApi) r1     // Catch: java.lang.Exception -> L4c
            com.google.gson.n r0 = r7.mergeParamsToJsonObject()     // Catch: java.lang.Exception -> L4c
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4c
            java.lang.Object r1 = r1.getBagAssemble(r6, r0, r4)     // Catch: java.lang.Exception -> L4c
            if (r1 != r3) goto L51
            return r3
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = 0
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202071144v.LIZ(java.lang.String, com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.BagAssembleRequest, X.05Vn):java.lang.Object");
    }
}
