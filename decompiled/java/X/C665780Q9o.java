package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationDetailVideoVM;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Q9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationDetailVideoVM", f = "SearchReviewAggregationDetailVideoVM.kt", l = {214}, m = "searchLoadMore")
public final class C665780Q9o extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SearchReviewAggregationDetailVideoVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665780Q9o(SearchReviewAggregationDetailVideoVM searchReviewAggregationDetailVideoVM, InterfaceC1364105Vn<? super C665780Q9o> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = searchReviewAggregationDetailVideoVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchReviewAggregationDetailVideoVM@e114.searchLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objHQ2 = this.LLILLL.HQ2(null, null, null, this);
        C1C7U.LIZIZ("SearchReviewAggregationDetailVideoVM@e114.searchLoadMore$1");
        return objHQ2;
    }
}
