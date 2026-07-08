package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03Q9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PaymentPricingHelper$queryPaymentPrice$1$1$2", f = "PaymentPricingHelper.kt", l = {}, m = "invokeSuspend")
public final class C03Q9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C03Q9(InterfaceC1364105Vn<? super C03Q9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03Q9(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentPricingHelper@c559.queryPaymentPrice$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C03Q4.LIZ.getClass();
        C03Q4.LJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentPricingHelper@c559.queryPaymentPrice$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C03Q9(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
