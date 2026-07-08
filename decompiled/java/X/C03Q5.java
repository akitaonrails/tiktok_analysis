package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentRenderData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRenderResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LeadingElevatorBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Q5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PaymentPricingHelper$queryPaymentSummary$1$1$4", f = "PaymentPricingHelper.kt", l = {}, m = "invokeSuspend")
public final class C03Q5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PaymentMethodsData LL;
    public final /* synthetic */ PaymentRenderData LLILLJJLI;
    public final /* synthetic */ C03QD LLILLL;
    public final /* synthetic */ PaymentMethod LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C03QH LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03Q5(PaymentMethodsData paymentMethodsData, PaymentRenderData paymentRenderData, C03QD c03qd, PaymentMethod paymentMethod, boolean z, String str, C03QH c03qh, String str2, InterfaceC1364105Vn<? super C03Q5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = paymentMethodsData;
        this.LLILLJJLI = paymentRenderData;
        this.LLILLL = c03qd;
        this.LLILZ = paymentMethod;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = c03qh;
        this.LLIZLLLIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03Q5(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LeadingElevatorBar leadingElevatorBar;
        Boolean bool;
        C1C7U.LIZ("PaymentPricingHelper@c559.queryPaymentSummary$1$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C03Q4 c03q4 = C03Q4.LIZ;
        PaymentMethodsData paymentMethodsData = this.LL;
        PaymentRenderData paymentRenderData = this.LLILLJJLI;
        BillInfoRenderResponse billInfoRenderResponse = (BillInfoRenderResponse) this.LLILLL.data;
        if (billInfoRenderResponse != null) {
            leadingElevatorBar = billInfoRenderResponse.elevatorBar;
        } else {
            leadingElevatorBar = null;
        }
        PaymentMethod paymentMethod = this.LLILZ;
        boolean z = this.LLILZIL;
        String str = this.LLILZLL;
        C03QH c03qh = this.LLIZ;
        String str2 = this.LLIZLLLIL;
        c03q4.getClass();
        paymentMethodsData.LIZ = paymentRenderData;
        paymentMethodsData.LIZIZ = paymentRenderData.paymentSummary;
        paymentMethodsData.LJFF = paymentRenderData.paymentServiceFeeToken;
        paymentMethodsData.LIZJ = str2;
        C03Q4.LJJII(paymentMethodsData, paymentRenderData.paymentMethods, paymentMethod, z, str, paymentRenderData.paymentMethodsData);
        if (EcPaymentIndependentPriceConfigSettings.LIZIZ() && ((bool = EcPaymentIndependentPriceConfigSettings.LIZJ().checkAndRefreshOriginData) == null || bool.booleanValue())) {
            C1440005kM.LIZ(new C03OC(paymentMethodsData, paymentRenderData.paymentMethods, paymentMethod, z, false, paymentRenderData.paymentMethodsData));
        }
        if (c03qh != null) {
            c03qh.onSuccess();
        } else {
            C1440005kM.LIZ(new C03OD(true, false, paymentMethod, z, null, leadingElevatorBar, 16));
        }
        C03Q4.LJIIIIZZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentPricingHelper@c559.queryPaymentSummary$1$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
