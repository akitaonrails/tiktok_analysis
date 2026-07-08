package X;

/* JADX INFO: renamed from: X.0i1F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newselector.template.streak.IMSelectConvContentTabDataSourceProtocol", f = "IMSelectConvContentTabDataSourceProtocol.kt", l = {114}, m = "onRefresh")
public final class C1226390i1F extends AbstractC23140094w {
    public C1226380i1E LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1226380i1E LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226390i1F(C1226380i1E c1226380i1E, InterfaceC1364105Vn<? super C1226390i1F> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1226380i1E;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSelectConvContentTabDataSourceProtocol@90b3.onRefresh$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJIL = this.LLILLL.LJJIL(this);
        C1C7U.LIZIZ("IMSelectConvContentTabDataSourceProtocol@90b3.onRefresh$1");
        return objLJJIL;
    }
}
