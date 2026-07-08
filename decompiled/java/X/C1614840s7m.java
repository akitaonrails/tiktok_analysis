package X;

import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;

/* JADX INFO: renamed from: X.0s7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel", f = "SeriesVipSubscriptionViewModel.kt", l = {652}, m = "fetchTrendingPage")
public final class C1614840s7m extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SeriesVipSubscriptionViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614840s7m(SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModel, InterfaceC1364105Vn<? super C1614840s7m> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = seriesVipSubscriptionViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesVipSubscriptionViewModel@bda1.fetchTrendingPage$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILLL.AQ2(0, null, this);
        C1C7U.LIZIZ("SeriesVipSubscriptionViewModel@bda1.fetchTrendingPage$1");
        return objAQ2;
    }
}
