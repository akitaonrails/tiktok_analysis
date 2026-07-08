package X;

/* JADX INFO: renamed from: X.0lfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.datamgr.repo.SortedListPrefetcherImpl", f = "SortedListPrefetcherImpl.kt", l = {91, 92}, m = "prefetchContact")
public final class C1366800lfi extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1366770lff LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1366800lfi(C1366770lff c1366770lff, InterfaceC1364105Vn<? super C1366800lfi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1366770lff;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SortedListPrefetcherImpl@222a.prefetchContact$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, null, this);
        C1C7U.LIZIZ("SortedListPrefetcherImpl@222a.prefetchContact$1");
        return objLIZJ;
    }
}
