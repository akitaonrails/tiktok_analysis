package X;

import Y.AgS307S0100000_27;

/* JADX INFO: renamed from: X.0wbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.external.ListenToWebPaymentUpdateAction$perform$paymentStatus$1$invokeSuspend$$inlined$map$1$2", f = "ListenToWebPaymentUpdateAction.kt", l = {224, 223}, m = "emit")
public final class C1787260wbs extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ AgS307S0100000_27 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787260wbs(AgS307S0100000_27 agS307S0100000_27, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS307S0100000_27;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListenToWebPaymentUpdateAction@dbeb.perform$paymentStatus$1$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("ListenToWebPaymentUpdateAction@dbeb.perform$paymentStatus$1$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
