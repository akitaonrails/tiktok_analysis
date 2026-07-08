package X;

import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0s7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614860s7o extends C09AY implements Function1<C1614710s7Z, C1614710s7Z> {
    public final /* synthetic */ SeriesVipSubscriptionViewModel LL;
    public final /* synthetic */ VipSubscriptionDetailResponse LLILLJJLI;
    public final /* synthetic */ EnumC1614730s7b LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614860s7o(SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModel, VipSubscriptionDetailResponse vipSubscriptionDetailResponse, EnumC1614730s7b enumC1614730s7b, String str) {
        super(1);
        this.LL = seriesVipSubscriptionViewModel;
        this.LLILLJJLI = vipSubscriptionDetailResponse;
        this.LLILLL = enumC1614730s7b;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1614710s7Z invoke(C1614710s7Z c1614710s7Z) {
        Map mapLJ = C2097608Jq.LJ();
        Map mapLJ2 = C2097608Jq.LJ();
        Map mapLJ3 = C2097608Jq.LJ();
        Map mapLJ4 = C2097608Jq.LJ();
        SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModel = this.LL;
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = this.LLILLJJLI;
        Map mapLJ5 = C2097608Jq.LJ();
        Map mapLJ6 = C2097608Jq.LJ();
        Map mapLJ7 = C2097608Jq.LJ();
        seriesVipSubscriptionViewModel.getClass();
        return C1614710s7Z.LIZ(c1614710s7Z, null, this.LLILLJJLI, this.LLILLL, this.LLILZ, false, null, false, false, mapLJ, mapLJ3, mapLJ2, mapLJ4, null, C1612810s4V.LIZJ(vipSubscriptionDetailResponse.subsOptions, mapLJ5, mapLJ6, mapLJ7), null, false, null, null, 512113);
    }
}
