package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS393S0200000_27;
import njp.a;

/* JADX INFO: renamed from: X.0wb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.restore.action.ListenToPurchaseUpdateAction$perform$3", f = "ListenToPurchaseUpdateAction.kt", l = {}, m = "invokeSuspend")
public final class C1786810wb9 extends C09AX implements Function2<InterfaceC1786840wbC, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1787350wc1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786810wb9(C1787350wc1 c1787350wc1, InterfaceC1364105Vn<? super C1786810wb9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1787350wc1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1786810wb9 c1786810wb9 = new C1786810wb9(this.LLILLJJLI, interfaceC1364105Vn);
        c1786810wb9.LL = obj;
        return c1786810wb9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListenToPurchaseUpdateAction@815b.perform$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1786840wbC interfaceC1786840wbC = (InterfaceC1786840wbC) this.LL;
        C1787350wc1 c1787350wc1 = this.LLILLJJLI;
        InterfaceC1786480wac interfaceC1786480wac = c1787350wc1.LIZ;
        C1786830wbB c1786830wbB = C1786830wbB.LIZJ;
        AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(interfaceC1786840wbC, c1787350wc1, 93);
        c1786830wbB.getClass();
        interfaceC1786480wac.LIZ(new C1786590wan(c1786830wbB, awS393S0200000_27));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ListenToPurchaseUpdateAction@815b.perform$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1786840wbC interfaceC1786840wbC, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1786840wbC, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
