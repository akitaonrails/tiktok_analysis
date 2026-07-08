package X;

import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.viewmodel.SearchBaseCardListViewModel;

/* JADX INFO: renamed from: X.0Q9V, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.viewmodel.SearchBaseCardListViewModel", f = "SearchBaseCardListViewModel.kt", l = {164, 176}, m = "onLoadMore$suspendImpl")
public final class C0Q9V extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SearchBaseCardListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Q9V(SearchBaseCardListViewModel searchBaseCardListViewModel, InterfaceC1364105Vn<? super C0Q9V> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = searchBaseCardListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchBaseCardListViewModel@b75c.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = SearchBaseCardListViewModel.wQ2(this.LLILLJJLI, this);
        C1C7U.LIZIZ("SearchBaseCardListViewModel@b75c.onLoadMore$1");
        return objWQ2;
    }
}
