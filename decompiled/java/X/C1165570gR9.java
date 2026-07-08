package X;

import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0gR9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierViewModel$requestRefund$2$1", f = "RefundCashierViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1165570gR9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RefundCashierViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165570gR9(RefundCashierViewModel refundCashierViewModel, InterfaceC1364105Vn<? super C1165570gR9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = refundCashierViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165570gR9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RefundCashierViewModel@2a78.requestRefund$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(AFwS268S0000000_26.get$arr$(499));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RefundCashierViewModel@2a78.requestRefund$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
