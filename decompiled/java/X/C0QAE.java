package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM;

/* JADX INFO: renamed from: X.0QAE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM", f = "SearchVisualInspirationSharedVM.kt", l = {172}, m = "onLoadMore")
public final class C0QAE extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SearchVisualInspirationSharedVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QAE(SearchVisualInspirationSharedVM searchVisualInspirationSharedVM, InterfaceC1364105Vn<? super C0QAE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = searchVisualInspirationSharedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchVisualInspirationSharedVM@f5c4.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(0, this);
        C1C7U.LIZIZ("SearchVisualInspirationSharedVM@f5c4.onLoadMore$1");
        return objOnLoadMore;
    }
}
