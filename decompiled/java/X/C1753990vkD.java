package X;

import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0vkD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753990vkD {
    public static final /* synthetic */ C1753990vkD LIZ = new C1753990vkD();
    public static final InterfaceC1753980vkC LIZIZ = (InterfaceC1753980vkC) ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build().create(InterfaceC1753980vkC.class);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.FreqControlExtra r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1754000vkE
            if (r0 == 0) goto L20
            r5 = r8
            X.0vkE r5 = (X.C1754000vkE) r5
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
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            goto L26
        L20:
            X.0vkE r5 = new X.0vkE
            r5.<init>(r6, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L47
            goto L4b
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.0vkC r2 = X.C1753990vkD.LIZIZ     // Catch: java.lang.Exception -> L47
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.FreqControlRequest r1 = new com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.FreqControlRequest     // Catch: java.lang.Exception -> L47
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.FreqControlScene r0 = com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.FreqControlScene.CART_BENEFIT     // Catch: java.lang.Exception -> L47
            r1.<init>(r7, r0)     // Catch: java.lang.Exception -> L47
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L47
            java.lang.Object r0 = r2.LIZ(r1, r5)     // Catch: java.lang.Exception -> L47
            if (r0 != r4) goto L4b
            return r4
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1753990vkD.LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.FreqControlExtra, X.05Vn):java.lang.Object");
    }
}
