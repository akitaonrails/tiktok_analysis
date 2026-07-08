package X;

import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;

/* JADX INFO: renamed from: X.0s7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel", f = "SeriesVipSubscriptionViewModel.kt", l = {157}, m = "onLoadMore")
public final class C1614810s7j extends AbstractC23140094w {
    public C1614710s7Z LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SeriesVipSubscriptionViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614810s7j(SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModel, InterfaceC1364105Vn<? super C1614810s7j> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = seriesVipSubscriptionViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesVipSubscriptionViewModel@bda1.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(null, this);
        C1C7U.LIZIZ("SeriesVipSubscriptionViewModel@bda1.onLoadMore$1");
        return objOnLoadMore;
    }
}
