package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel$refresh$2$4", f = "PaymentViewModel.kt", l = {}, m = "invokeSuspend")
public final class C863403Yy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PaymentViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863403Yy(PaymentViewModel paymentViewModel, InterfaceC1364105Vn<? super C863403Yy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = paymentViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863403Yy(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentViewModel@e450.refresh$2$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(AFwS228S0000000_1.get$arr$(259));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentViewModel@e450.refresh$2$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
