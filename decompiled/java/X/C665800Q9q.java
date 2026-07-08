package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationDetailVideoVM;

/* JADX INFO: renamed from: X.0Q9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationDetailVideoVM", f = "SearchReviewAggregationDetailVideoVM.kt", l = {104, 112}, m = "onRefresh")
public final class C665800Q9q extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SearchReviewAggregationDetailVideoVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665800Q9q(SearchReviewAggregationDetailVideoVM searchReviewAggregationDetailVideoVM, InterfaceC1364105Vn<? super C665800Q9q> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = searchReviewAggregationDetailVideoVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchReviewAggregationDetailVideoVM@e114.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("SearchReviewAggregationDetailVideoVM@e114.onRefresh$1");
        return objOnRefresh;
    }
}
