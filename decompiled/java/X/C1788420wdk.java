package X;

/* JADX INFO: renamed from: X.0wdk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.CreateOrderAction", f = "CreateOrderAction.kt", l = {37}, m = "perform")
public final class C1788420wdk extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1788400wdi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788420wdk(C1788400wdi c1788400wdi, InterfaceC1364105Vn<? super C1788420wdk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1788400wdi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateOrderAction@4e6d.perform$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("CreateOrderAction@4e6d.perform$1");
        return objLIZ;
    }
}
