package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.ListenToPaymentUpdateAction$perform$event$1$eventJob$1", f = "ListenToPaymentUpdateAction.kt", l = {67}, m = "invokeSuspend")
public final class C1786760wb4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1786840wbC>, Object> {
    public int LL;
    public final /* synthetic */ C1786850wbD LLILLJJLI;
    public final /* synthetic */ C1787830wcn LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786760wb4(C1786850wbD c1786850wbD, C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1786760wb4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1786850wbD;
        this.LLILLL = c1787830wcn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1786760wb4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListenToPaymentUpdateAction@9366.perform$event$1$eventJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C861640Xr8 c861640Xr8 = new C861640Xr8(new C1786780wb6(this.LLILLJJLI, this.LLILLL, null), this.LLILLJJLI.LIZ.getPurchaseUpdate());
            C1786770wb5 c1786770wb5 = new C1786770wb5(this.LLILLL, null);
            this.LL = 1;
            obj = C09IC.LJIJ(c861640Xr8, this, c1786770wb5);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ListenToPaymentUpdateAction@9366.perform$event$1$eventJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ListenToPaymentUpdateAction@9366.perform$event$1$eventJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1786840wbC> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
