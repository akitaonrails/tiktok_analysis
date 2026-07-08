package X;

import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.08fU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2174208fU {
    public static final /* synthetic */ C2174208fU LIZ = new C2174208fU();
    public static final C01K1 LIZIZ = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build();

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.ss.android.ugc.aweme.ecommerce.ecc.PreGetDslResponse>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C2174108fT
            if (r0 == 0) goto L3d
            r4 = r6
            X.08fT r4 = (X.C2174108fT) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 != r2) goto L43
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0X52 r1 = (X.C0X52) r1
            T r0 = r1.LIZIZ
            return r0
        L27:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C2174208fU.LIZIZ
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.ecc.ECCDslApi> r0 = com.ss.android.ugc.aweme.ecommerce.ecc.ECCDslApi.class
            java.lang.Object r0 = r1.create(r0)
            com.ss.android.ugc.aweme.ecommerce.ecc.ECCDslApi r0 = (com.ss.android.ugc.aweme.ecommerce.ecc.ECCDslApi) r0
            r4.LLILLL = r2
            java.lang.Object r1 = r0.getDslList(r4)
            if (r1 != r3) goto L22
            return r3
        L3d:
            X.08fT r4 = new X.08fT
            r4.<init>(r5, r6)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2174208fU.LIZ(X.05Vn):java.lang.Object");
    }
}
