package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.bind.CashierBindPaymentMethodHelper$Companion$requestAuthPreRisk$1$1$2$1", f = "CashierBindPaymentMethodHelper.kt", l = {}, m = "invokeSuspend")
public final class C1702510uPB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<String, Unit> LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1702510uPB(Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, InterfaceC1364105Vn<? super C1702510uPB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702510uPB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CashierBindPaymentMethodHelper$Companion@bd31.requestAuthPreRisk$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(null);
        this.LLILLJJLI.invoke(EnumC1708300uYW.BIND_ERROR_ERROR_EXCEPTION.getErrorMessageForToast());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CashierBindPaymentMethodHelper$Companion@bd31.requestAuthPreRisk$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
