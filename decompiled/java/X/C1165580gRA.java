package X;

import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0gRA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierViewModel$requestCashierBasicInfo$2$2$2$1", f = "RefundCashierViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1165580gRA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RefundCashierViewModel LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165580gRA(RefundCashierViewModel refundCashierViewModel, Throwable th, InterfaceC1364105Vn<? super C1165580gRA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = refundCashierViewModel;
        this.LLILLJJLI = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165580gRA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RefundCashierViewModel@2a78.requestCashierBasicInfo$2$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new AwS605S0100000_26(this.LLILLJJLI, 381));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RefundCashierViewModel@2a78.requestCashierBasicInfo$2$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
