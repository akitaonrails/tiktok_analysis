package X;

import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;

/* JADX INFO: renamed from: X.0s7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel", f = "SeriesVipSubscriptionViewModel.kt", l = {695}, m = "resolveClientParamForPurchase")
public final class C1614820s7k extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SeriesVipSubscriptionViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614820s7k(SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModel, InterfaceC1364105Vn<? super C1614820s7k> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = seriesVipSubscriptionViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesVipSubscriptionViewModel@bda1.resolveClientParamForPurchase$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objHQ2 = this.LLILLJJLI.HQ2(null, null, this);
        C1C7U.LIZIZ("SeriesVipSubscriptionViewModel@bda1.resolveClientParamForPurchase$1");
        return objHQ2;
    }
}
