package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vhn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.recommend.PdpProductRecommendationMgr$triggerRequest$1", f = "PdpProductRecommendationMgr.kt", l = {91, 103}, m = "invokeSuspend")
public final class C1752490vhn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1752480vhm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752490vhn(C1752480vhm c1752480vhm, InterfaceC1364105Vn<? super C1752490vhn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1752480vhm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1752490vhn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[PHI: r1
      0x0053: PHI (r1v1 java.util.List<java.lang.String>) = (r1v0 java.util.List<java.lang.String>), (r1v3 java.util.List<java.lang.String>) binds: [B:22:0x0050, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "PdpProductRecommendationMgr@bb0e.triggerRequest$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r11.LL
            r5 = 2
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L1d
            if (r0 == r6) goto L55
            if (r0 != r5) goto L7d
            X.C155000ia.LIZIZ(r12)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r12)
            X.0vhp r9 = X.InterfaceC1752540vhs.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendationFeedRequest r8 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendationFeedRequest
            X.0vhm r0 = r11.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r0.LIZ
            java.lang.String r7 = r0.getProductId()
            X.0vhm r0 = r11.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r0.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r2 = r0.LLJILLL
            if (r2 == 0) goto L4f
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendationContext r0 = r2.productRecommendContext
            if (r0 == 0) goto L4f
            java.util.List<java.lang.String> r1 = r0.scenes
        L3a:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendationContext r0 = r2.productRecommendContext
            if (r0 == 0) goto L53
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.passThroughMap
        L40:
            r8.<init>(r7, r1, r0)
            r11.LL = r6
            java.lang.Object r12 = r9.LIZ(r8, r11)
            if (r12 != r4) goto L58
            X.C1C7U.LIZIZ(r10)
            return r4
        L4f:
            r1 = r3
            if (r2 == 0) goto L53
            goto L3a
        L53:
            r0 = r3
            goto L40
        L55:
            X.C155000ia.LIZIZ(r12)
        L58:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductRecommendResponse r12 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductRecommendResponse) r12
            X.0vhm r2 = r11.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductRecommendData r1 = r12.data
            if (r1 == 0) goto L64
            java.lang.Integer r0 = r12.code
            r1.code = r0
        L64:
            r2.LIZIZ = r1
            r2.LIZLLL = r6
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0vho r0 = new X.0vho
            r0.<init>(r2, r3)
            r11.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r11, r1, r0)
            if (r0 != r4) goto L17
            X.C1C7U.LIZIZ(r10)
            return r4
        L7d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1752490vhn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
