package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0wb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.ListenToPaymentUpdateAction$perform$event$1$eventJob$1$2", f = "ListenToPaymentUpdateAction.kt", l = {}, m = "invokeSuspend")
public final class C1786770wb5 extends C09AX implements Function2<InterfaceC1786840wbC, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1787830wcn LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786770wb5(C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1786770wb5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1787830wcn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1786770wb5 c1786770wb5 = new C1786770wb5(this.LLILLJJLI, interfaceC1364105Vn);
        c1786770wb5.LL = obj;
        return c1786770wb5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLJFF;
        C1C7U.LIZ("ListenToPaymentUpdateAction@9366.perform$event$1$eventJob$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1786840wbC interfaceC1786840wbC = (InterfaceC1786840wbC) this.LL;
        if (interfaceC1786840wbC instanceof C790750V0f) {
            zLJFF = Intrinsics.LJFF(((C790750V0f) interfaceC1786840wbC).LIZLLL.LIZLLL, this.LLILLJJLI.LJFF.LJIIJJI.getValue());
        } else {
            if (!(interfaceC1786840wbC instanceof C790740V0e) && !(interfaceC1786840wbC instanceof C790730V0d)) {
                throw new C1954807lC();
            }
            zLJFF = true;
        }
        Boolean boolValueOf = Boolean.valueOf(zLJFF);
        C1C7U.LIZIZ("ListenToPaymentUpdateAction@9366.perform$event$1$eventJob$1$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1786840wbC interfaceC1786840wbC, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1786840wbC, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
