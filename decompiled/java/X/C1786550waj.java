package X;

/* JADX INFO: renamed from: X.0waj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.LaunchPaymentFlowAction", f = "LaunchPaymentFlowAction.kt", l = {27}, m = "perform")
public final class C1786550waj extends AbstractC23140094w {
    public C1787830wcn LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1786580wam LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786550waj(C1786580wam c1786580wam, InterfaceC1364105Vn<? super C1786550waj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1786580wam;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LaunchPaymentFlowAction@bcb.perform$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("LaunchPaymentFlowAction@bcb.perform$1");
        return objLIZ;
    }
}
