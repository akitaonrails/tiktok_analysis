package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS236S0300000_27;
import njp.a;

/* JADX INFO: renamed from: X.0wb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.ListenToPaymentUpdateAction$perform$event$1$eventJob$1$1", f = "ListenToPaymentUpdateAction.kt", l = {}, m = "invokeSuspend")
public final class C1786780wb6 extends C09AX implements Function2<InterfaceC1786840wbC, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1786850wbD LLILLJJLI;
    public final /* synthetic */ C1787830wcn LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786780wb6(C1786850wbD c1786850wbD, C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1786780wb6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1786850wbD;
        this.LLILLL = c1787830wcn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1786780wb6 c1786780wb6 = new C1786780wb6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1786780wb6.LL = obj;
        return c1786780wb6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListenToPaymentUpdateAction@9366.perform$event$1$eventJob$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1786840wbC interfaceC1786840wbC = (InterfaceC1786840wbC) this.LL;
        InterfaceC1786480wac interfaceC1786480wacLJ = this.LLILLJJLI.LIZIZ.LJ();
        C1786830wbB c1786830wbB = C1786830wbB.LIZJ;
        AwS236S0300000_27 awS236S0300000_27 = new AwS236S0300000_27(interfaceC1786840wbC, this.LLILLL, this.LLILLJJLI, 45);
        c1786830wbB.getClass();
        interfaceC1786480wacLJ.LIZ(new C1786590wan(c1786830wbB, awS236S0300000_27));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ListenToPaymentUpdateAction@9366.perform$event$1$eventJob$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1786840wbC interfaceC1786840wbC, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1786840wbC, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
