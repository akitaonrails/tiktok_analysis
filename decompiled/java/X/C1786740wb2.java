package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.ListenToPaymentUpdateAction$perform$event$1", f = "ListenToPaymentUpdateAction.kt", l = {79}, m = "invokeSuspend")
public final class C1786740wb2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1786840wbC>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1786850wbD LLILLL;
    public final /* synthetic */ C1787830wcn LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786740wb2(C1786850wbD c1786850wbD, C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1786740wb2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1786850wbD;
        this.LLILZ = c1787830wcn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1786740wb2 c1786740wb2 = new C1786740wb2(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1786740wb2.LLILLJJLI = obj;
        return c1786740wb2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C09AE c09aeLIZLLL;
        C1C7U.LIZ("ListenToPaymentUpdateAction@9366.perform$event$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                c09aeLIZLLL = (C09AE) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            c09aeLIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1786750wb3(this.LLILLL, null), 3);
            C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1786760wb4(this.LLILLL, this.LLILZ, null), 3);
            this.LLILLJJLI = c09aeLIZLLL;
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ListenToPaymentUpdateAction@9366.perform$event$1");
                return objLJFF;
            }
        }
        c09aeLIZLLL.LIZIZ(null);
        C1C7U.LIZIZ("ListenToPaymentUpdateAction@9366.perform$event$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1786840wbC> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
