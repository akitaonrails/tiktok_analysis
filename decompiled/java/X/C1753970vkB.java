package X;

import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.FreqControlExtra;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitBehave;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartEntryFrom;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.CartBenefitManager$reportBehave$6", f = "CartBenefitManager.kt", l = {525}, m = "invokeSuspend")
public final class C1753970vkB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1754020vkG LLILLJJLI;
    public final /* synthetic */ CartBenefitBehave LLILLL;
    public final /* synthetic */ CartBenefitInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1753970vkB(C1754020vkG c1754020vkG, CartBenefitBehave cartBenefitBehave, CartBenefitInfo cartBenefitInfo, InterfaceC1364105Vn<? super C1753970vkB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1754020vkG;
        this.LLILLL = cartBenefitBehave;
        this.LLILZ = cartBenefitInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1753970vkB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CartBenefitManager@e516.reportBehave$6");
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
            C1753990vkD c1753990vkD = InterfaceC1753980vkC.LIZ;
            CartEntryFrom cartEntryFrom = this.LLILLJJLI.LJIJ;
            CartBenefitBehave cartBenefitBehave = this.LLILLL;
            CartBenefitInfo cartBenefitInfo = this.LLILZ;
            FreqControlExtra freqControlExtra = new FreqControlExtra(cartEntryFrom, cartBenefitBehave, cartBenefitInfo.cartBenefitBizType, cartBenefitInfo.cartBenefitStyleType, cartBenefitInfo.cartServerPromo);
            this.LL = 1;
            if (c1753990vkD.LIZ(freqControlExtra, this) == objLJFF) {
                C1C7U.LIZIZ("CartBenefitManager@e516.reportBehave$6");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CartBenefitManager@e516.reportBehave$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
