package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03XE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.domain.plugin.PaymentAppInstallOptPlugin$onCompleteFetchBillInfo$1$1", f = "PaymentAppInstallOptPlugin.kt", l = {}, m = "invokeSuspend")
public final class C03XE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PaymentMethodsData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03XE(PaymentMethodsData paymentMethodsData, InterfaceC1364105Vn<? super C03XE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = paymentMethodsData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03XE(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentAppInstallOptPlugin@de0c.onCompleteFetchBillInfo$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentAppInstallOptPlugin@de0c.onCompleteFetchBillInfo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
