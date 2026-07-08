package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0vkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.CartBenefitManager$updateView$1", f = "CartBenefitManager.kt", l = {115, 117}, m = "invokeSuspend")
public final class C1754010vkF extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1754020vkG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1754010vkF(C1754020vkG c1754020vkG, InterfaceC1364105Vn<? super C1754010vkF> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1754020vkG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1754010vkF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "CartBenefitManager@e516.updateView$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 0
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L1d
            if (r0 == r1) goto L34
            if (r0 != r2) goto L55
            X.C155000ia.LIZIZ(r7)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r7)
            X.0vkG r0 = r6.LLILLJJLI
            X.099G r0 = r0.LIZLLL
            if (r0 == 0) goto L32
            r6.LL = r1
            java.lang.Object r7 = r0.LJLIIIL(r6)
            if (r7 != r4) goto L37
            X.C1C7U.LIZIZ(r5)
            return r4
        L32:
            r7 = r3
            goto L39
        L34:
            X.C155000ia.LIZIZ(r7)
        L37:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r7 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r7
        L39:
            X.0vkG r1 = r6.LLILLJJLI
            X.099G r0 = r1.LIZLLL
            if (r0 == 0) goto L17
            if (r7 == 0) goto L17
            T r0 = r7.data
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryResponseData r0 = (com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryResponseData) r0
            if (r0 == 0) goto L49
            java.util.List<com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo> r3 = r0.cartBenefits
        L49:
            r6.LL = r2
            java.lang.Object r0 = r1.LJIIIZ(r3, r6)
            if (r0 != r4) goto L17
            X.C1C7U.LIZIZ(r5)
            return r4
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1754010vkF.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
