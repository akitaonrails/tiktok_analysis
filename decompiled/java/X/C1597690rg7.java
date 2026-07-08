package X;

/* JADX INFO: renamed from: X.0rg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.platform.data.fetch.FetcherSuiteExecutor", f = "FetcherSuiteExecutor.kt", l = {99}, m = "refreshFetcher")
public final class C1597690rg7 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1597620rg0 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1597690rg7(C1597620rg0 c1597620rg0, InterfaceC1364105Vn<? super C1597690rg7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1597620rg0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FetcherSuiteExecutor@1dfd.refreshFetcher$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(null, null, this);
        C1C7U.LIZIZ("FetcherSuiteExecutor@1dfd.refreshFetcher$1");
        return objLJI;
    }
}
