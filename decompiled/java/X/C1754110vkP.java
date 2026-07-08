package X;

import com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0vkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1754110vkP {
    public static final /* synthetic */ C1754110vkP LIZ = new C1754110vkP();
    public static final InterfaceC1754160vkU LIZIZ;

    static {
        ICartService iCartService = (ICartService) PluggableExtentionKt.pluggableSpi$default(ICartService.class, false, false, false, 14, null);
        LIZIZ = iCartService != null ? iCartService.LJ() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryRequest r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryResponseData>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1754150vkT
            if (r0 == 0) goto L21
            r5 = r8
            X.0vkT r5 = (X.C1754150vkT) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            goto L3f
        L21:
            X.0vkT r5 = new X.0vkT
            r5.<init>(r6, r8)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r4)
            X.0vkU r0 = X.C1754110vkP.LIZIZ     // Catch: java.lang.Exception -> L45
            if (r0 == 0) goto L49
            r5.LLILLL = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r4 = r0.LIZ(r7, r5)     // Catch: java.lang.Exception -> L45
            if (r4 != r3) goto L42
            return r3
        L3f:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L45
        L42:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r4 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r4     // Catch: java.lang.Exception -> L45
            return r4
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L49:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1754110vkP.LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryRequest, X.05Vn):java.lang.Object");
    }
}
