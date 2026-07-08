package X;

/* JADX INFO: renamed from: X.0we2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.common.action.QueryPurchasesAction", f = "QueryPurchasesAction.kt", l = {28}, m = "perform")
public final class C1788600we2 extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1788590we1 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788600we2(C1788590we1 c1788590we1, InterfaceC1364105Vn<? super C1788600we2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1788590we1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QueryPurchasesAction@b308.perform$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("QueryPurchasesAction@b308.perform$1");
        return objLIZIZ;
    }
}
