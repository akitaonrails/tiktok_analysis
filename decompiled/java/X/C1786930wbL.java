package X;

import Y.AgS307S0100000_27;

/* JADX INFO: renamed from: X.0wbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.ListenToPaymentUpdateAction$perform$event$1$timeoutJob$1$1", f = "ListenToPaymentUpdateAction.kt", l = {45}, m = "emit")
public final class C1786930wbL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AgS307S0100000_27<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1786930wbL(AgS307S0100000_27<? super T> agS307S0100000_27, InterfaceC1364105Vn<? super C1786930wbL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = agS307S0100000_27;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C1786940wbM {
        C1C7U.LIZ("ListenToPaymentUpdateAction@9366.perform$event$1$timeoutJob$1$1$emit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ$2 = this.LLILLJJLI.LIZ$2(null, this);
        C1C7U.LIZIZ("ListenToPaymentUpdateAction@9366.perform$event$1$timeoutJob$1$1$emit$1");
        return objLIZ$2;
    }
}
