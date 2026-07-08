package X;

/* JADX INFO: renamed from: X.0wb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.ListenToPaymentUpdateAction", f = "ListenToPaymentUpdateAction.kt", l = {39}, m = "perform")
public final class C1786790wb7 extends AbstractC23140094w {
    public C1787830wcn LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1786850wbD LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786790wb7(C1786850wbD c1786850wbD, InterfaceC1364105Vn<? super C1786790wb7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1786850wbD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C1786910wbJ {
        C1C7U.LIZ("ListenToPaymentUpdateAction@9366.perform$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("ListenToPaymentUpdateAction@9366.perform$1");
        return objLIZ;
    }
}
