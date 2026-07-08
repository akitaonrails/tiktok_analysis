package X;

import com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM;

/* JADX INFO: renamed from: X.0h52, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM", f = "PoiCommentReviewListVM.kt", l = {222}, m = "onLoadMore")
public final class C1190300h52 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PoiCommentReviewListVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190300h52(PoiCommentReviewListVM poiCommentReviewListVM, InterfaceC1364105Vn<? super C1190300h52> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = poiCommentReviewListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiCommentReviewListVM@4feb.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(0L, this);
        C1C7U.LIZIZ("PoiCommentReviewListVM@4feb.onLoadMore$1");
        return objOnLoadMore;
    }
}
