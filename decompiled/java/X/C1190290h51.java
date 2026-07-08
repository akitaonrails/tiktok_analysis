package X;

import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;

/* JADX INFO: renamed from: X.0h51, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel", f = "PoiReviewsListViewModel.kt", l = {257}, m = "onLoadMore")
public final class C1190290h51 extends AbstractC23140094w {
    public Object LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PoiReviewsListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190290h51(PoiReviewsListViewModel poiReviewsListViewModel, InterfaceC1364105Vn<? super C1190290h51> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = poiReviewsListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiReviewsListViewModel@e0d9.onLoadMore$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILZ.onLoadMore(0L, this);
        C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.onLoadMore$1");
        return objOnLoadMore;
    }
}
