package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.pay.CashierPayHelper$payInternal$1$2$1", f = "CashierPayHelper.kt", l = {}, m = "invokeSuspend")
public final class C1707250uWp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1707310uWv LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707250uWp(InterfaceC1707310uWv interfaceC1707310uWv, Throwable th, InterfaceC1364105Vn<? super C1707250uWp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1707310uWv;
        this.LLILLJJLI = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1707250uWp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CashierPayHelper@4352.payInternal$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(String.valueOf(EnumC1707350uWz.PAY_RESULT_CLIENT_ERROR_DEFAULT.getErrorCode()), this.LLILLJJLI.getMessage(), null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CashierPayHelper@4352.payInternal$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
