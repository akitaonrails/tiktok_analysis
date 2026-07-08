package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.bind.CashierBindPaymentMethodHelper$requestNewBindInfo$1$2$1", f = "CashierBindPaymentMethodHelper.kt", l = {}, m = "invokeSuspend")
public final class C1702520uPC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1708270uYT LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702520uPC(InterfaceC1708270uYT interfaceC1708270uYT, InterfaceC1364105Vn<? super C1702520uPC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1708270uYT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702520uPC(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CashierBindPaymentMethodHelper@213b.requestNewBindInfo$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(1, EnumC1708300uYW.BIND_ERROR_ERROR_EXCEPTION.getErrorMessageForToast());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CashierBindPaymentMethodHelper@213b.requestNewBindInfo$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
