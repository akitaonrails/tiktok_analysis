package X;

/* JADX INFO: renamed from: X.0wey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.IAPImpl", f = "IAPImpl.kt", l = {86}, m = "queryOngoingPurchases")
public final class C1789180wey extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1789140weu LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789180wey(C1789140weu c1789140weu, InterfaceC1364105Vn<? super C1789180wey> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1789140weu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAPImpl@b899.queryOngoingPurchases$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ(null, this);
        C1C7U.LIZIZ("IAPImpl@b899.queryOngoingPurchases$1");
        return objLJIIIIZZ;
    }
}
