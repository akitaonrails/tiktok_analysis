package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DFF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ecp.handlers.EcPaymentInstrumentsChangeRequestHandler$PipoOpenInstrumentsChangePageOnSubscribe$invoke$1$1", f = "EcPaymentInstrumentsChangeRequestHandler.kt", l = {}, m = "invokeSuspend")
public final class C0DFF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0DFG LL;
    public final /* synthetic */ AbstractC335880DEs LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DFF(C0DFG c0dfg, AbstractC335880DEs abstractC335880DEs, InterfaceC1364105Vn<? super C0DFF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0dfg;
        this.LLILLJJLI = abstractC335880DEs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DFF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2329309At<AbstractC335880DEs> interfaceC2329309At;
        C1C7U.LIZ("EcPaymentInstrumentsChangeRequestHandler$PipoOpenInstrumentsChangePageOnSubscribe@75d8.invoke$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC2329309At<AbstractC335880DEs> interfaceC2329309At2 = this.LL.LLILLL;
        if ((interfaceC2329309At2 == null || !interfaceC2329309At2.isDisposed()) && (interfaceC2329309At = this.LL.LLILLL) != null) {
            interfaceC2329309At.onSuccess(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcPaymentInstrumentsChangeRequestHandler$PipoOpenInstrumentsChangePageOnSubscribe@75d8.invoke$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
