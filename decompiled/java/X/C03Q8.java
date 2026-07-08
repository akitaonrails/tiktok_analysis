package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Q8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PaymentPricingHelper$queryPaymentPrice$1$1$3", f = "PaymentPricingHelper.kt", l = {}, m = "invokeSuspend")
public final class C03Q8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PaymentMethod LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C03QH LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03Q8(PaymentMethod paymentMethod, boolean z, boolean z2, C03QH c03qh, InterfaceC1364105Vn<? super C03Q8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = paymentMethod;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c03qh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03Q8(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentPricingHelper@c559.queryPaymentPrice$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C03Q4 c03q4 = C03Q4.LIZ;
        PaymentMethod paymentMethod = this.LL;
        boolean z = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        C03QH c03qh = this.LLILZ;
        c03q4.getClass();
        C03Q4.LJIILL(true, paymentMethod, z, z2, null, c03qh);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentPricingHelper@c559.queryPaymentPrice$1$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
