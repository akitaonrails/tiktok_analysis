package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.postpayment.impl.PaymentSignalGuideActionHandler$onPrimaryAction$1$3", f = "PostPaymentGuideActionHandlers.kt", l = {}, m = "invokeSuspend")
public final class C1702790uPd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1702850uPj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702790uPd(InterfaceC1702850uPj interfaceC1702850uPj, InterfaceC1364105Vn<? super C1702790uPd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1702850uPj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702790uPd(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentSignalGuideActionHandler@a4ad.onPrimaryAction$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.nF()) {
            this.LL.Ur("enable", true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentSignalGuideActionHandler@a4ad.onPrimaryAction$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
