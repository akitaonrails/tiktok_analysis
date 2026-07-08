package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03XB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.domain.plugin.OspAsyncInflatePlugin$onCompleteFetchBillInfo$2$1", f = "OspAsyncInflatePlugin.kt", l = {}, m = "invokeSuspend")
public final class C03XB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PaymentMethodsData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03XB(PaymentMethodsData paymentMethodsData, InterfaceC1364105Vn<? super C03XB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = paymentMethodsData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03XB(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OspAsyncInflatePlugin@d0bf.onCompleteFetchBillInfo$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OspAsyncInflatePlugin@d0bf.onCompleteFetchBillInfo$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
