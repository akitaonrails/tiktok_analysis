package X;

import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;

/* JADX INFO: renamed from: X.0s7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel", f = "SeriesVipSubscriptionViewModel.kt", l = {672}, m = "awaitMarketplacePrices")
public final class C1614830s7l extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SeriesVipSubscriptionViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614830s7l(SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModel, InterfaceC1364105Vn<? super C1614830s7l> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = seriesVipSubscriptionViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesVipSubscriptionViewModel@bda1.awaitMarketplacePrices$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZ.wQ2(0L, this);
        C1C7U.LIZIZ("SeriesVipSubscriptionViewModel@bda1.awaitMarketplacePrices$1");
        return objWQ2;
    }
}
