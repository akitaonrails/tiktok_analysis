package X;

/* JADX INFO: renamed from: X.0wbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.external.ListenToWebPaymentUpdateAction", f = "ListenToWebPaymentUpdateAction.kt", l = {52}, m = "perform")
public final class C1787230wbp extends AbstractC23140094w {
    public C1787830wcn LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1787220wbo LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787230wbp(C1787220wbo c1787220wbo, InterfaceC1364105Vn<? super C1787230wbp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1787220wbo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C1786940wbM {
        C1C7U.LIZ("ListenToWebPaymentUpdateAction@dbeb.perform$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("ListenToWebPaymentUpdateAction@dbeb.perform$1");
        return objLIZ;
    }
}
