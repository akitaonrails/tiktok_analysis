package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* JADX INFO: renamed from: X.0vkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.CartBenefitManager", f = "CartBenefitManager.kt", l = {232, 237}, m = "realRequestCartBenefit")
public final class C1754120vkQ extends AbstractC23140094w {
    public Response LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1754020vkG LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1754120vkQ(C1754020vkG c1754020vkG, InterfaceC1364105Vn<? super C1754120vkQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1754020vkG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CartBenefitManager@e516.realRequestCartBenefit$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLL.LJIIJ(null, this);
        C1C7U.LIZIZ("CartBenefitManager@e516.realRequestCartBenefit$1");
        return objLJIIJ;
    }
}
