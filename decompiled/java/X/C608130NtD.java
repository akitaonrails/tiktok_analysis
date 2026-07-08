package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;

/* JADX INFO: renamed from: X.0NtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel", f = "HighlightsListViewModel.kt", l = {85}, m = "onLoadMore")
public final class C608130NtD extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ HighlightsListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C608130NtD(HighlightsListViewModel highlightsListViewModel, InterfaceC1364105Vn<? super C608130NtD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = highlightsListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighlightsListViewModel@8591.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(0, this);
        C1C7U.LIZIZ("HighlightsListViewModel@8591.onLoadMore$1");
        return objOnLoadMore;
    }
}
