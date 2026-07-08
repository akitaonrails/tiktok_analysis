package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CalcPaymentMethodPriceData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Q6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PaymentPricingHelper$queryPaymentPrice$1$1$4", f = "PaymentPricingHelper.kt", l = {}, m = "invokeSuspend")
public final class C03Q6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PaymentMethodsData LL;
    public final /* synthetic */ CalcPaymentMethodPriceData LLILLJJLI;
    public final /* synthetic */ PaymentMethod LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C03QH LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03Q6(PaymentMethodsData paymentMethodsData, CalcPaymentMethodPriceData calcPaymentMethodPriceData, PaymentMethod paymentMethod, boolean z, String str, C03QH c03qh, InterfaceC1364105Vn<? super C03Q6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = paymentMethodsData;
        this.LLILLJJLI = calcPaymentMethodPriceData;
        this.LLILLL = paymentMethod;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = c03qh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03Q6(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        C1C7U.LIZ("PaymentPricingHelper@c559.queryPaymentPrice$1$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C03Q4 c03q4 = C03Q4.LIZ;
        PaymentMethodsData paymentMethodsData = this.LL;
        CalcPaymentMethodPriceData calcPaymentMethodPriceData = this.LLILLJJLI;
        PaymentMethod paymentMethod = this.LLILLL;
        boolean z = this.LLILZ;
        String str = this.LLILZIL;
        C03QH c03qh = this.LLILZLL;
        c03q4.getClass();
        paymentMethodsData.LIZLLL = calcPaymentMethodPriceData;
        paymentMethodsData.LJ = calcPaymentMethodPriceData.paymentPrice;
        paymentMethodsData.LJFF = calcPaymentMethodPriceData.paymentServiceFeeToken;
        C03Q4.LJJII(paymentMethodsData, calcPaymentMethodPriceData.paymentMethods, paymentMethod, z, str, calcPaymentMethodPriceData.paymentMethodsData);
        if (EcPaymentIndependentPriceConfigSettings.LIZIZ() && ((bool = EcPaymentIndependentPriceConfigSettings.LIZJ().checkAndRefreshOriginData) == null || bool.booleanValue())) {
            C1440005kM.LIZ(new C03OC(paymentMethodsData, calcPaymentMethodPriceData.paymentMethods, paymentMethod, z, true, calcPaymentMethodPriceData.paymentMethodsData));
        }
        if (c03qh != null) {
            c03qh.onSuccess();
        } else {
            C1440005kM.LIZ(new C03OD(true, true, paymentMethod, z, null, null, 48));
        }
        C03Q4.LJIIIIZZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentPricingHelper@c559.queryPaymentPrice$1$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
