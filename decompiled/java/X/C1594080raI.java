package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.contentlanguage.api.ContentLanguageGuideServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainRootFragment;
import com.ss.android.ugc.aweme.main.MainRootFragmentBase;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0raI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594080raI extends C09AY implements Function0<C1594060raG> {
    public final /* synthetic */ MainRootFragmentBase LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1594080raI(MainRootFragmentBase mainRootFragmentBase) {
        super(0);
        this.LL = mainRootFragmentBase;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0raG] */
    @Override // kotlin.jvm.functions.Function0
    public final C1594060raG invoke() {
        final MainRootFragment mainRootFragment = (MainRootFragment) this.LL;
        return new Object(mainRootFragment) { // from class: X.0raG
            public final WeakReference<MainRootFragment> LIZ;

            {
                this.LIZ = new WeakReference<>(mainRootFragment);
            }

            @C14EU
            public final void onCCTEvent(C1594170raR c1594170raR) {
                MainRootFragment mainRootFragment2 = this.LIZ.get();
                if (mainRootFragment2 != null) {
                    mainRootFragment2.nS().mCommerceActivityObserver.LIZIZ();
                }
            }

            @C14EU
            public final void onHideLivePopupWindowEvent(C1594070raH c1594070raH) {
                if (((Boolean) C279180Awu.LIZ.getValue()).booleanValue()) {
                    return;
                }
                C1908480zlO.LIZIZ.LIZ("ad");
            }

            @C14EU
            public final void onMobEnterFromEvent(C1567240qt0 c1567240qt0) {
                HomePageDataViewModel homePageDataViewModel;
                MainRootFragment mainRootFragment2 = this.LIZ.get();
                if (mainRootFragment2 != null && (homePageDataViewModel = mainRootFragment2.LLJLL) != null) {
                    homePageDataViewModel.setEventType(c1567240qt0.LIZ);
                }
            }

            @C14EU
            public final void onMobRequestIdEvent(C739490Szb c739490Szb) {
                HomePageDataViewModel homePageDataViewModel;
                MainRootFragment mainRootFragment2 = this.LIZ.get();
                if (mainRootFragment2 != null && (homePageDataViewModel = mainRootFragment2.LLJLL) != null) {
                    homePageDataViewModel.LLJ = c739490Szb.LIZ;
                }
            }

            @C14EU
            public final void onScrollToDetailEvent(C690450R6l c690450R6l) {
                HomePageViewPagerAbility homePageViewPagerAbilityMS;
                MainRootFragment mainRootFragment2 = this.LIZ.get();
                if (mainRootFragment2 != null && c690450R6l != null && (homePageViewPagerAbilityMS = mainRootFragment2.mS()) != null && homePageViewPagerAbilityMS.O82()) {
                    mainRootFragment2.LLJLL.setEventType(c690450R6l.LIZ);
                }
            }

            @C14EU
            public final void onScrollToProfileEvent(C0SPE c0spe) {
                SAFFragmentRootScene sAFFragmentRootSceneIb;
                C488600JEc c488600JEcLIZ;
                Context sceneContext;
                MainRootFragment mainRootFragment2 = this.LIZ.get();
                if (mainRootFragment2 == null) {
                    return;
                }
                String str = c0spe.LIZJ;
                if (str == null) {
                    str = "";
                }
                int i = c0spe.LIZ;
                MainRootFragment mainRootFragment3 = this.LIZ.get();
                if (mainRootFragment3 != null) {
                    MainActivity mainActivityNS = mainRootFragment3.nS();
                    if (i != mainActivityNS.hashCode() && (((sAFFragmentRootSceneIb = mainRootFragment3.ib()) == null || (sceneContext = sAFFragmentRootSceneIb.getSceneContext()) == null || i != sceneContext.hashCode()) && ((c488600JEcLIZ = C682840QqQ.LIZ(mainRootFragment3, mainActivityNS)) == null || i != c488600JEcLIZ.hashCode()))) {
                        return;
                    }
                    HomePageDataViewModel homePageDataViewModel = mainRootFragment2.LLJLL;
                    HomePageViewPagerAbility homePageViewPagerAbilityMS = mainRootFragment2.mS();
                    boolean z = c0spe.LIZLLL;
                    homePageDataViewModel.LLJJ = z;
                    if (z) {
                        if (C690970R8l.LIZ()) {
                            if (homePageViewPagerAbilityMS != null) {
                                homePageViewPagerAbilityMS.ph(c0spe.LIZIZ, homePageDataViewModel.LLJILJILJ, str);
                                return;
                            }
                            return;
                        } else {
                            if (homePageViewPagerAbilityMS == null) {
                                return;
                            }
                            homePageViewPagerAbilityMS.ph(null, homePageDataViewModel.LLJILJILJ, str);
                            return;
                        }
                    }
                    if (!mainRootFragment2.nS().mCommerceActivityObserver.LIZ(str, homePageDataViewModel.getEventType())) {
                        if (C690970R8l.LIZ()) {
                            if (homePageViewPagerAbilityMS != null) {
                                homePageViewPagerAbilityMS.ph(c0spe.LIZIZ, homePageDataViewModel.LLJILJILJ, str);
                            }
                        } else {
                            if (homePageViewPagerAbilityMS == null) {
                                return;
                            }
                            homePageViewPagerAbilityMS.ph(null, homePageDataViewModel.LLJILJILJ, str);
                        }
                    }
                }
            }

            @C14EU
            public final void onVideoPageChangeEvent(C714530S1b c714530S1b) {
                Aweme aweme;
                String aid;
                MainRootFragment mainRootFragment2 = this.LIZ.get();
                if (mainRootFragment2 == null || (aweme = c714530S1b.LIZ) == null) {
                    return;
                }
                String authorUid = AwemeExtKt.getAuthorUid(aweme);
                HomePageDataViewModel homePageDataViewModel = mainRootFragment2.LLJLL;
                Aweme aweme2 = c714530S1b.LIZ;
                homePageDataViewModel.LLJILJILJ = aweme2;
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                C1398110mUD.LIZIZ = aid;
                Aweme aweme3 = homePageDataViewModel.LLJILJILJ;
                if (aweme3 != null) {
                    aweme3.getAid();
                }
                if (TextUtils.equals(homePageDataViewModel.LLILZ, authorUid)) {
                    return;
                }
                homePageDataViewModel.LLILZ = authorUid;
                mainRootFragment2.nS().mCommerceActivityObserver.LIZJ.onVideoPageChangeEvent(c714530S1b.LIZ, c714530S1b.LIZIZ);
                final MainRootFragment mainRootFragment3 = this.LIZ.get();
                if (mainRootFragment3 != null) {
                    if (!AwemeExtKt.isAdTraffic(c714530S1b.LIZ) || !C1017070cZd.LL(c714530S1b.LIZ)) {
                        C810560Vqw.LIZLLL(new Runnable() { // from class: X.0rZV
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                HomePageDataViewModel homePageDataViewModel2;
                                C1C7U.LIZ("MainRootEventBusHolder@a661.onVideoPageChangeEventDelay$1");
                                try {
                                    if (!mainRootFragment3.nS().isFinishing() && (homePageDataViewModel2 = mainRootFragment3.LLJLL) != null) {
                                        Aweme aweme4 = homePageDataViewModel2.LLJILJILJ;
                                        homePageDataViewModel2.LLILZIL = aweme4;
                                        if (aweme4 != null) {
                                            AwemeBizExtKt.setPreloadScroll(aweme4, false);
                                        }
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("MainRootEventBusHolder@a661.onVideoPageChangeEventDelay$1");
                            }
                        }, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                    }
                    mainRootFragment3.nS().mCommerceActivityObserver.LIZIZ();
                    ContentLanguageGuideServiceImpl.LIZ().LJ(mainRootFragment3.getContext(), mainRootFragment3);
                    if (AwemeExtKt.isAdTraffic(c714530S1b.LIZ)) {
                        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LJFF();
                    }
                }
            }
        };
    }
}
