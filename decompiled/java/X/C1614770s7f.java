package X;

import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;

/* JADX INFO: renamed from: X.0s7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel", f = "SeriesVipSubscriptionViewModel.kt", l = {76, 91, 122}, m = "onRefresh")
public final class C1614770s7f extends AbstractC23140094w {
    public VipSubscriptionDetailResponse LL;
    public EnumC1614730s7b LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ SeriesVipSubscriptionViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614770s7f(SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModel, InterfaceC1364105Vn<? super C1614770s7f> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = seriesVipSubscriptionViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesVipSubscriptionViewModel@bda1.onRefresh$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLIZ.onRefresh(this);
        C1C7U.LIZIZ("SeriesVipSubscriptionViewModel@bda1.onRefresh$1");
        return objOnRefresh;
    }
}
