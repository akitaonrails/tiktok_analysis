package X;

/* JADX INFO: renamed from: X.0wcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.PaymentEngine", f = "PaymentEngine.kt", l = {169}, m = "process")
public final class C1787710wcb extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1787700wca LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787710wcb(C1787700wca c1787700wca, InterfaceC1364105Vn<? super C1787710wcb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1787700wca;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentEngine@5404.process$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIJJI = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("PaymentEngine@5404.process$1");
        return objLJIIJJI;
    }
}
