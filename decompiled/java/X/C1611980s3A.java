package X;

import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;

/* JADX INFO: renamed from: X.0s3A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel", f = "SeriesInnerFeedViewModel.kt", l = {780}, m = "loadMoreRecommend")
public final class C1611980s3A extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SeriesInnerFeedViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611980s3A(SeriesInnerFeedViewModel seriesInnerFeedViewModel, InterfaceC1364105Vn<? super C1611980s3A> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = seriesInnerFeedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesInnerFeedViewModel@ef4a.loadMoreRecommend$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objJQ2 = this.LLILLJJLI.JQ2(this);
        C1C7U.LIZIZ("SeriesInnerFeedViewModel@ef4a.loadMoreRecommend$1");
        return objJQ2;
    }
}
