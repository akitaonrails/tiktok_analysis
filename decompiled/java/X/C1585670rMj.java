package X;

import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.explore.service.IExploreFeedService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.appdiff.ISeriesDiscoverAppDiffProtocol;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl;
import com.ss.android.ugc.aweme.stemfeed.service.IStemFeedService;
import com.ss.android.ugc.aweme.story.homepage.StoryHomepageService;
import com.ss.android.ugc.aweme.tako.ITakoFeedIconService;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585670rMj extends C09AY implements Function0<Set<AbstractC1585770rMt>> {
    public final /* synthetic */ C1585200rLy LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1585670rMj(C1585200rLy c1585200rLy) {
        super(0);
        this.LL = c1585200rLy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Set<AbstractC1585770rMt> invoke() {
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        AbstractC1585770rMt[] abstractC1585770rMtArr = new AbstractC1585770rMt[34];
        this.LL.getClass();
        abstractC1585770rMtArr[0] = ((INearbyFeedService) ServiceManager.get().getService(INearbyFeedService.class)).LJIILLIIL();
        this.LL.getClass();
        abstractC1585770rMtArr[1] = ((IExploreFeedService) ServiceManager.get().getService(IExploreFeedService.class)).LJJI();
        this.LL.getClass();
        Object objLJJI = ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).LJJI();
        if (!(objLJJI instanceof AbstractC1585770rMt)) {
            objLJJI = null;
        }
        abstractC1585770rMtArr[2] = objLJJI;
        this.LL.getClass();
        Object objLJIL = ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).LJIL();
        if (!(objLJIL instanceof AbstractC1585770rMt)) {
            objLJIL = null;
        }
        abstractC1585770rMtArr[3] = objLJIL;
        this.LL.getClass();
        abstractC1585770rMtArr[4] = new C1570080qxa();
        this.LL.getClass();
        abstractC1585770rMtArr[5] = new C1555050qZL();
        this.LL.getClass();
        abstractC1585770rMtArr[6] = ProfileDependentComponentImpl.createIProfileDependentComponentServicebyMonsterPlugin(false).getDiscoverTabProtocol();
        this.LL.getClass();
        abstractC1585770rMtArr[7] = ProfileDependentComponentImpl.createIProfileDependentComponentServicebyMonsterPlugin(false).getProfileTabProtocol();
        this.LL.getClass();
        abstractC1585770rMtArr[8] = ((INoticeService) ServiceManager.get().getService(INoticeService.class)).LJLLILLLL();
        this.LL.getClass();
        abstractC1585770rMtArr[9] = new C1585680rMk();
        abstractC1585770rMtArr[10] = new C1555040qZK();
        abstractC1585770rMtArr[11] = new C1555020qZI();
        this.LL.getClass();
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        abstractC1585770rMtArr[12] = (iSeriesFeedServiceLIZIZ == null || (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) == null) ? null : interfaceC1577520r9aLIZIZ.LJIIZILJ();
        this.LL.getClass();
        ISeriesDiscoverAppDiffProtocol.LIZ.getClass();
        C1585900rN6.LIZIZ.getValue().LIZ();
        abstractC1585770rMtArr[13] = 0;
        this.LL.getClass();
        abstractC1585770rMtArr[14] = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).U4().LJI();
        this.LL.getClass();
        abstractC1585770rMtArr[15] = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).U4().LJ();
        this.LL.getClass();
        IStemFeedService iStemFeedService = (IStemFeedService) PluggableExtentionKt.pluggableSpi$default(IStemFeedService.class, false, false, false, 14, null);
        abstractC1585770rMtArr[16] = iStemFeedService != null ? iStemFeedService.LIZ() : null;
        C1585200rLy c1585200rLy = this.LL;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.TOPIC0;
        c1585200rLy.getClass();
        abstractC1585770rMtArr[17] = C1585200rLy.LJ(enumC1584360rKc);
        C1585200rLy c1585200rLy2 = this.LL;
        EnumC1584360rKc enumC1584360rKc2 = EnumC1584360rKc.TOPIC1;
        c1585200rLy2.getClass();
        abstractC1585770rMtArr[18] = C1585200rLy.LJ(enumC1584360rKc2);
        C1585200rLy c1585200rLy3 = this.LL;
        EnumC1584360rKc enumC1584360rKc3 = EnumC1584360rKc.TOPIC2;
        c1585200rLy3.getClass();
        abstractC1585770rMtArr[19] = C1585200rLy.LJ(enumC1584360rKc3);
        C1585200rLy c1585200rLy4 = this.LL;
        EnumC1584360rKc enumC1584360rKc4 = EnumC1584360rKc.TOPIC3;
        c1585200rLy4.getClass();
        abstractC1585770rMtArr[20] = C1585200rLy.LJ(enumC1584360rKc4);
        C1585200rLy c1585200rLy5 = this.LL;
        EnumC1584360rKc enumC1584360rKc5 = EnumC1584360rKc.TOPIC_GAMING;
        c1585200rLy5.getClass();
        abstractC1585770rMtArr[21] = C1585200rLy.LJ(enumC1584360rKc5);
        C1585200rLy c1585200rLy6 = this.LL;
        EnumC1584360rKc enumC1584360rKc6 = EnumC1584360rKc.TOPIC_FASHION;
        c1585200rLy6.getClass();
        abstractC1585770rMtArr[22] = C1585200rLy.LJ(enumC1584360rKc6);
        C1585200rLy c1585200rLy7 = this.LL;
        EnumC1584360rKc enumC1584360rKc7 = EnumC1584360rKc.TOPIC_FOOD;
        c1585200rLy7.getClass();
        abstractC1585770rMtArr[23] = C1585200rLy.LJ(enumC1584360rKc7);
        C1585200rLy c1585200rLy8 = this.LL;
        EnumC1584360rKc enumC1584360rKc8 = EnumC1584360rKc.TOPIC_SPORTS;
        c1585200rLy8.getClass();
        abstractC1585770rMtArr[24] = C1585200rLy.LJ(enumC1584360rKc8);
        C1585200rLy c1585200rLy9 = this.LL;
        EnumC1584360rKc enumC1584360rKc9 = EnumC1584360rKc.PERSONALIZED_TOPIC_0;
        c1585200rLy9.getClass();
        abstractC1585770rMtArr[25] = C1585200rLy.LJ(enumC1584360rKc9);
        C1585200rLy c1585200rLy10 = this.LL;
        EnumC1584360rKc enumC1584360rKc10 = EnumC1584360rKc.PERSONALIZED_TOPIC_1;
        c1585200rLy10.getClass();
        abstractC1585770rMtArr[26] = C1585200rLy.LJ(enumC1584360rKc10);
        abstractC1585770rMtArr[27] = this.LL.LIZ.LIZIZ();
        abstractC1585770rMtArr[28] = this.LL.LIZ.LIZ();
        this.LL.getClass();
        abstractC1585770rMtArr[29] = C1619800sFm.LIZIZ.LIZ();
        this.LL.getClass();
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        StoryHomepageService storyHomepageServiceLJJJJZ = c1618440sDa.LJJJJZ();
        abstractC1585770rMtArr[30] = storyHomepageServiceLJJJJZ != null ? storyHomepageServiceLJJJJZ.LIZ() : null;
        this.LL.getClass();
        StoryHomepageService storyHomepageServiceLJJJJZ2 = c1618440sDa.LJJJJZ();
        abstractC1585770rMtArr[31] = storyHomepageServiceLJJJJZ2 != null ? storyHomepageServiceLJJJJZ2.LIZJ() : null;
        this.LL.getClass();
        abstractC1585770rMtArr[32] = new C1585690rMl();
        this.LL.getClass();
        ITakoFeedIconService iTakoFeedIconService = (ITakoFeedIconService) PluggableExtentionKt.pluggableSpi$default(ITakoFeedIconService.class, false, false, false, 14, null);
        abstractC1585770rMtArr[33] = iTakoFeedIconService != null ? iTakoFeedIconService.LIZ() : null;
        return C093Y.LJ(abstractC1585770rMtArr);
    }
}
