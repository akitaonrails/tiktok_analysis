package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryRequest;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vkI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.CartBenefitManager$requestCartBenefit$1", f = "CartBenefitManager.kt", l = {225}, m = "invokeSuspend")
public final class C1754040vkI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Response<GetCartEntryResponseData>>, Object> {
    public int LL;
    public final /* synthetic */ C1754020vkG LLILLJJLI;
    public final /* synthetic */ GetCartEntryRequest LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1754040vkI(C1754020vkG c1754020vkG, GetCartEntryRequest getCartEntryRequest, InterfaceC1364105Vn<? super C1754040vkI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1754020vkG;
        this.LLILLL = getCartEntryRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1754040vkI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CartBenefitManager@e516.requestCartBenefit$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1754020vkG c1754020vkG = this.LLILLJJLI;
            GetCartEntryRequest getCartEntryRequest = this.LLILLL;
            this.LL = 1;
            obj = c1754020vkG.LJIIJ(getCartEntryRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CartBenefitManager@e516.requestCartBenefit$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CartBenefitManager@e516.requestCartBenefit$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Response<GetCartEntryResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
