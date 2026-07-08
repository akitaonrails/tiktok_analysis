package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightToolbarIconBridgeAssem;
import com.ss.android.ugc.aweme.detail.panel.PoiCollectPanel;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.feed.consume.FollowingFeedConsumeMonitorConfigModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.sidebar.components.SidebarContainerAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconAssem;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS98S1000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620930sHb implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$10(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$11(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$14(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$15(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$16(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$17(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$18(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$3(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$4(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$5(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$6(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$7(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrollStateChanged$8(C1620930sHb c1620930sHb, int i) {
    }

    public static final void onPageScrolled$0(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$10(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$11(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$14(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$15(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$16(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$17(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$18(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$3(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$4(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$5(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$6(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$7(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$8(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageScrolled$9(C1620930sHb c1620930sHb, int i, float f, int i2) {
    }

    public static final void onPageSelected$12(C1620930sHb c1620930sHb, int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
            case 2:
                onPageScrollStateChanged$2(this, i);
                break;
            case 3:
                onPageScrollStateChanged$3(this, i);
                break;
            case 4:
                onPageScrollStateChanged$4(this, i);
                break;
            case 5:
                onPageScrollStateChanged$5(this, i);
                break;
            case 6:
                onPageScrollStateChanged$6(this, i);
                break;
            case 7:
                onPageScrollStateChanged$7(this, i);
                break;
            case 8:
                onPageScrollStateChanged$8(this, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onPageScrollStateChanged$9(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onPageScrollStateChanged$10(this, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onPageScrollStateChanged$11(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onPageScrollStateChanged$12(this, i);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onPageScrollStateChanged$13(this, i);
                break;
            case 14:
                onPageScrollStateChanged$14(this, i);
                break;
            case 15:
                onPageScrollStateChanged$15(this, i);
                break;
            case 16:
                onPageScrollStateChanged$16(this, i);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onPageScrollStateChanged$17(this, i);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onPageScrollStateChanged$18(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                break;
            case 3:
                onPageScrolled$3(this, i, f, i2);
                break;
            case 4:
                onPageScrolled$4(this, i, f, i2);
                break;
            case 5:
                onPageScrolled$5(this, i, f, i2);
                break;
            case 6:
                onPageScrolled$6(this, i, f, i2);
                break;
            case 7:
                onPageScrolled$7(this, i, f, i2);
                break;
            case 8:
                onPageScrolled$8(this, i, f, i2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onPageScrolled$9(this, i, f, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onPageScrolled$10(this, i, f, i2);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onPageScrolled$11(this, i, f, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onPageScrolled$12(this, i, f, i2);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onPageScrolled$13(this, i, f, i2);
                break;
            case 14:
                onPageScrolled$14(this, i, f, i2);
                break;
            case 15:
                onPageScrolled$15(this, i, f, i2);
                break;
            case 16:
                onPageScrolled$16(this, i, f, i2);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onPageScrolled$17(this, i, f, i2);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onPageScrolled$18(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
            case 3:
                onPageSelected$3(this, i);
                break;
            case 4:
                onPageSelected$4(this, i);
                break;
            case 5:
                onPageSelected$5(this, i);
                break;
            case 6:
                onPageSelected$6(this, i);
                break;
            case 7:
                onPageSelected$7(this, i);
                break;
            case 8:
                onPageSelected$8(this, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onPageSelected$9(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onPageSelected$10(this, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onPageSelected$11(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onPageSelected$12(this, i);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onPageSelected$13(this, i);
                break;
            case 14:
                onPageSelected$14(this, i);
                break;
            case 15:
                onPageSelected$15(this, i);
                break;
            case 16:
                onPageSelected$16(this, i);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onPageSelected$17(this, i);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onPageSelected$18(this, i);
                break;
        }
    }

    public C1620930sHb(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$1(C1620930sHb c1620930sHb, int i) {
        ((C1602750roH) c1620930sHb.l0).LJII = i;
    }

    public static final void onPageScrollStateChanged$12(C1620930sHb c1620930sHb, int i) {
        if (i == 0 && !((C1570610qyR) c1620930sHb.l0).LIZIZ.FQ2("page_sidebar")) {
            ((C1570610qyR) c1620930sHb.l0).LIZIZ(8);
        }
    }

    public static final void onPageScrollStateChanged$13(C1620930sHb c1620930sHb, int i) {
        boolean zLJI = MethodIDManager.LJI(72070);
        ScrollSwitchStateManager scrollSwitchStateManager = ((DetailFragment) c1620930sHb.l0).LLILLL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LLJ.setValue(Integer.valueOf(i));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void onPageScrollStateChanged$2(C1620930sHb c1620930sHb, int i) {
        StoryToolBarIconAbility storyToolBarIconAbilityUo;
        View viewAq0;
        if (((FeedSkylightToolbarIconBridgeAssem) c1620930sHb.l0).vo() && i == 0 && (storyToolBarIconAbilityUo = ((FeedSkylightToolbarIconBridgeAssem) c1620930sHb.l0).uo()) != null && (viewAq0 = storyToolBarIconAbilityUo.aq0()) != null) {
            C786410Ut5.T4(viewAq0, 1.0f);
        }
    }

    public static final void onPageScrollStateChanged$9(C1620930sHb c1620930sHb, int i) {
        ScrollSwitchStateManager scrollSwitchStateManager;
        String strWQ2;
        if (i == 0 && (scrollSwitchStateManager = ((SidebarContainerAssem) c1620930sHb.l0).LLJJIJIL) != null && (strWQ2 = scrollSwitchStateManager.wQ2()) != null) {
            SidebarContainerAssem sidebarContainerAssem = (SidebarContainerAssem) c1620930sHb.l0;
            if (Intrinsics.LJFF(sidebarContainerAssem.LLJLILLLLZIIL, "page_sidebar") && Intrinsics.LJFF(strWQ2, "page_feed")) {
                sidebarContainerAssem.kp();
            }
            sidebarContainerAssem.LLJLILLLLZIIL = strWQ2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$0(X.C1620930sHb r2, int r3) {
        /*
            boolean r0 = X.C1492500owS.LIZ()
            if (r0 == 0) goto L39
            r1 = 1
            if (r3 == 0) goto L1c
            if (r3 <= 0) goto L32
            java.lang.Object r0 = r2.l0     // Catch: java.lang.Exception -> L35
            com.ss.android.ugc.aweme.toptab.ui.LiveSingleFeedFragment r0 = (com.ss.android.ugc.aweme.toptab.ui.LiveSingleFeedFragment) r0     // Catch: java.lang.Exception -> L35
            com.ss.android.ugc.aweme.toptab.panel.LiveSingleFeedFragmentPanel r0 = r0.WR()     // Catch: java.lang.Exception -> L35
            X.0SR4 r0 = r0.LLJL     // Catch: java.lang.Exception -> L35
            int r0 = r0.getCount()     // Catch: java.lang.Exception -> L35
            int r0 = r0 - r1
            if (r3 != r0) goto L32
        L1c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L35
            java.util.concurrent.atomic.AtomicBoolean r0 = com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper.LIZ     // Catch: java.lang.Exception -> L35
            boolean r0 = X.C1492500owS.LIZ()     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L39
            java.util.concurrent.atomic.AtomicBoolean r1 = com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper.LJIJJLI     // Catch: java.lang.Exception -> L35
            boolean r0 = r2.booleanValue()     // Catch: java.lang.Exception -> L35
            r1.set(r0)     // Catch: java.lang.Exception -> L35
            goto L34
        L32:
            r1 = 0
            goto L1c
        L34:
            return
        L35:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620930sHb.onPageSelected$0(X.0sHb, int):void");
    }

    public static final void onPageSelected$1(C1620930sHb c1620930sHb, int i) {
        ((C1602750roH) c1620930sHb.l0).LJII = 0;
    }

    public static final void onPageSelected$10(C1620930sHb c1620930sHb, int i) {
        if (i == 0) {
            StoryToolBarIconAssem storyToolBarIconAssem = (StoryToolBarIconAssem) c1620930sHb.l0;
            if (storyToolBarIconAssem.LLJLLIL) {
                storyToolBarIconAssem.So().yQ2(true, true);
            }
        }
    }

    public static final void onPageSelected$11(C1620930sHb c1620930sHb, int i) {
        String strSr2;
        EnumC584570MwJ enumC584570MwJ;
        AutoScrollComponent autoScrollComponent = (AutoScrollComponent) c1620930sHb.l0;
        if (autoScrollComponent.LLJJJ == EnumC584570MwJ.AUTO_SCROLL_STATE_STOP) {
            return;
        }
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) autoScrollComponent.LLJZIJLIL.getValue();
        if (homePageViewPagerAbility != null) {
            strSr2 = homePageViewPagerAbility.sr2(i);
        } else {
            strSr2 = null;
        }
        if (!Intrinsics.LJFF(strSr2, "page_feed")) {
            enumC584570MwJ = EnumC584570MwJ.AUTO_SCROLL_STATE_PAUSE;
        } else {
            enumC584570MwJ = EnumC584570MwJ.AUTO_SCROLL_STATE_START;
        }
        autoScrollComponent.LLJJJ = enumC584570MwJ;
    }

    public static final void onPageSelected$13(C1620930sHb c1620930sHb, int i) {
        String strLJJIL;
        DetailFragment detailFragment = (DetailFragment) c1620930sHb.l0;
        C1590670rUn c1590670rUn = detailFragment.LLILZ;
        CommonPageFragment commonPageFragmentLJJIJLIJ = detailFragment.LLILZLL.LJJIJLIJ("page_feed");
        c1590670rUn.getClass();
        if (commonPageFragmentLJJIJLIJ != null && (strLJJIL = ((DetailFragment) c1620930sHb.l0).LLILZLL.LJJIL(i)) != null) {
            if (Intrinsics.LJFF("page_feed", strLJJIL)) {
                C1578630rBN.LJI(3, commonPageFragmentLJJIJLIJ);
            } else if (Intrinsics.LJFF(c1590670rUn.LIZ, "page_feed")) {
                C1578630rBN.LJFF(3, commonPageFragmentLJJIJLIJ);
            }
            c1590670rUn.LIZ = strLJJIL;
        }
        ScrollSwitchStateManager scrollSwitchStateManager = ((DetailFragment) c1620930sHb.l0).LLILLL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LLIZLLLIL.setValue(Integer.valueOf(i));
        }
    }

    public static final void onPageSelected$14(C1620930sHb c1620930sHb, int i) {
        ((C1578690rBT) c1620930sHb.l0).LJIJJLI(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$15(X.C1620930sHb r2, int r3) {
        /*
            boolean r0 = X.C1492500owS.LIZ()
            if (r0 == 0) goto L39
            r1 = 1
            if (r3 == 0) goto L1c
            if (r3 <= 0) goto L32
            java.lang.Object r0 = r2.l0     // Catch: java.lang.Exception -> L35
            com.ss.android.ugc.aweme.stemfeed.ui.StemFeedFragment r0 = (com.ss.android.ugc.aweme.stemfeed.ui.StemFeedFragment) r0     // Catch: java.lang.Exception -> L35
            com.ss.android.ugc.aweme.stemfeed.panel.StemFeedFragmentPanel r0 = r0.ZR()     // Catch: java.lang.Exception -> L35
            X.0SR4 r0 = r0.LLJL     // Catch: java.lang.Exception -> L35
            int r0 = r0.getCount()     // Catch: java.lang.Exception -> L35
            int r0 = r0 - r1
            if (r3 != r0) goto L32
        L1c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L35
            java.util.concurrent.atomic.AtomicBoolean r0 = com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper.LIZ     // Catch: java.lang.Exception -> L35
            boolean r0 = X.C1492500owS.LIZ()     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L39
            java.util.concurrent.atomic.AtomicBoolean r1 = com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper.LJIJI     // Catch: java.lang.Exception -> L35
            boolean r0 = r2.booleanValue()     // Catch: java.lang.Exception -> L35
            r1.set(r0)     // Catch: java.lang.Exception -> L35
            goto L34
        L32:
            r1 = 0
            goto L1c
        L34:
            return
        L35:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620930sHb.onPageSelected$15(X.0sHb, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$16(X.C1620930sHb r3, int r4) {
        /*
            boolean r0 = X.C1492500owS.LIZ()
            if (r0 == 0) goto L47
            r1 = 1
            if (r4 == 0) goto L1c
            if (r4 <= 0) goto L3a
            java.lang.Object r0 = r3.l0     // Catch: java.lang.Exception -> L43
            com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment r0 = (com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment) r0     // Catch: java.lang.Exception -> L43
            com.ss.android.ugc.aweme.topicfeed.panel.TopicFeedFragmentPanel r0 = r0.aS()     // Catch: java.lang.Exception -> L43
            X.0SR4 r0 = r0.LLJL     // Catch: java.lang.Exception -> L43
            int r0 = r0.getCount()     // Catch: java.lang.Exception -> L43
            int r0 = r0 - r1
            if (r4 != r0) goto L3a
        L1c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L43
            java.lang.Object r0 = r3.l0     // Catch: java.lang.Exception -> L43
            com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment r0 = (com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment) r0     // Catch: java.lang.Exception -> L43
            int r1 = r0.LLILLL     // Catch: java.lang.Exception -> L43
            java.util.concurrent.atomic.AtomicBoolean r0 = com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper.LIZ     // Catch: java.lang.Exception -> L43
            boolean r0 = X.C1492500owS.LIZ()     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L47
            boolean r0 = r2.booleanValue()     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L3d
            java.util.BitSet r0 = com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper.LJIILL     // Catch: java.lang.Exception -> L43
            r0.set(r1)     // Catch: java.lang.Exception -> L43
            goto L3c
        L3a:
            r1 = 0
            goto L1c
        L3c:
            return
        L3d:
            java.util.BitSet r0 = com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper.LJIILL     // Catch: java.lang.Exception -> L43
            r0.clear(r1)     // Catch: java.lang.Exception -> L43
            return
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620930sHb.onPageSelected$16(X.0sHb, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$17(X.C1620930sHb r4, int r5) {
        /*
            boolean r0 = X.C1492500owS.LIZ()
            if (r0 == 0) goto L36
            r1 = 1
            if (r5 == 0) goto L1a
            if (r5 <= 0) goto L30
            java.lang.Object r0 = r4.l0     // Catch: java.lang.Exception -> L32
            com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment r0 = (com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment) r0     // Catch: java.lang.Exception -> L32
            com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT r0 = r0.LLJJJ     // Catch: java.lang.Exception -> L32
            X.0SR4 r0 = r0.LLJL     // Catch: java.lang.Exception -> L32
            int r0 = r0.getCount()     // Catch: java.lang.Exception -> L32
            int r0 = r0 - r1
            if (r5 != r0) goto L30
        L1a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L32
            java.util.concurrent.atomic.AtomicBoolean r0 = com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper.LIZ     // Catch: java.lang.Exception -> L32
            boolean r0 = X.C1492500owS.LIZ()     // Catch: java.lang.Exception -> L32
            if (r0 == 0) goto L36
            java.util.concurrent.atomic.AtomicBoolean r1 = com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper.LJFF     // Catch: java.lang.Exception -> L32
            boolean r0 = r2.booleanValue()     // Catch: java.lang.Exception -> L32
            r1.set(r0)     // Catch: java.lang.Exception -> L32
            goto L36
        L30:
            r1 = 0
            goto L1a
        L32:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L36:
            long r3 = X.C1588640rRW.LIZ
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L63
            int r0 = X.C1588640rRW.LIZIZ
            if (r0 == r5) goto L63
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = X.C1588640rRW.LIZ
            long r3 = r3 - r0
            int r0 = X.C1588640rRW.LIZIZ
            if (r5 <= r0) goto L60
            java.lang.String r2 = "up"
        L4f:
            long r0 = java.lang.System.currentTimeMillis()
            X.C1588640rRW.LIZ = r0
            X.C1588640rRW.LIZIZ = r5
            X.00bG r0 = new X.00bG
            r0.<init>(r3, r2, r5)
            X.C2252408s6.LIZ(r0)
            return
        L60:
            java.lang.String r2 = "down"
            goto L4f
        L63:
            long r0 = java.lang.System.currentTimeMillis()
            X.C1588640rRW.LIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620930sHb.onPageSelected$17(X.0sHb, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[Catch: Exception -> 0x0035, TRY_LEAVE, TryCatch #0 {Exception -> 0x0035, blocks: (B:6:0x000c, B:11:0x001f, B:13:0x002b), top: B:48:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$18(X.C1620930sHb r6, int r7) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620930sHb.onPageSelected$18(X.0sHb, int):void");
    }

    public static final void onPageSelected$2(C1620930sHb c1620930sHb, int i) {
        StoryToolBarIconAbility storyToolBarIconAbilityUo;
        View viewAq0;
        if (((FeedSkylightToolbarIconBridgeAssem) c1620930sHb.l0).vo() && (storyToolBarIconAbilityUo = ((FeedSkylightToolbarIconBridgeAssem) c1620930sHb.l0).uo()) != null && (viewAq0 = storyToolBarIconAbilityUo.aq0()) != null) {
            C786410Ut5.T4(viewAq0, 1.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$3(X.C1620930sHb r4, int r5) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620930sHb.onPageSelected$3(X.0sHb, int):void");
    }

    public static final void onPageSelected$4(C1620930sHb c1620930sHb, int i) {
        InterfaceC1605290rsN interfaceC1605290rsN = (InterfaceC1605290rsN) ((PoiCollectPanel) c1620930sHb.l0).A0.getValue();
        if (interfaceC1605290rsN != null) {
            interfaceC1605290rsN.LLILLL(((PoiCollectPanel) c1620930sHb.l0).o());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$5(X.C1620930sHb r6, int r7) {
        /*
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel r0 = (com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel) r0
            boolean r0 = r0.F0()
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel r0 = (com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel) r0
            X.01GW r0 = r0.J0
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            r0.clear()
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel r1 = (com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel) r1
            X.0rpG r3 = r1.n
            boolean r0 = r3 instanceof X.C1607980rwi
            r2 = 0
            if (r0 == 0) goto L8d
            X.0rwi r3 = (X.C1607980rwi) r3
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r3.LLJJ
            int r0 = r0.size()
            if (r7 < r0) goto L7c
            X.1E8h r5 = X.C2276411E8h.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getMessageIndexAt at position "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " but list size is "
            r1.append(r0)
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r3.LLJJ
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r1)
            r3 = 6
            java.lang.String r1 = "ExtDetailChatOperator2"
            java.lang.String r0 = "detail_feed"
            r5.LIZJ(r0, r3, r1, r4)
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L5d:
            if (r0 == 0) goto La8
            java.lang.String r3 = r0.toString()
        L63:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel r0 = (com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel) r0
            android.os.Bundle r1 = r0.z0
            if (r1 == 0) goto Laa
            java.lang.String r0 = "key_from_quoted_video"
            boolean r1 = r1.getBoolean(r0)
            r0 = 1
            if (r1 != r0) goto Laa
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel r0 = (com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel) r0
            r0.N0(r2)
            return
        L7c:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r3.LLJJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = r0.getAid()
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            goto L5d
        L8d:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r1.B0
            if (r0 == 0) goto La8
            int r0 = r0.size()
            if (r7 >= r0) goto La8
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r1.B0
            if (r0 == 0) goto La8
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r7, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto La8
            java.lang.String r3 = r0.getAid()
            goto L63
        La8:
            r3 = r2
            goto L63
        Laa:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel r0 = (com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel) r0
            r0.N0(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620930sHb.onPageSelected$5(X.0sHb, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[PHI: r3
      0x00a8: PHI (r3v3 com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility) = 
      (r3v2 com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility)
      (r3v5 com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility)
     binds: [B:13:0x0053, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$6(X.C1620930sHb r8, int r9) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620930sHb.onPageSelected$6(X.0sHb, int):void");
    }

    public static final void onPageSelected$7(C1620930sHb c1620930sHb, int i) {
        String aid;
        Aweme awemeD2 = ((FeedFollowFragment) c1620930sHb.l0).LLJJJ.d2(i);
        if (awemeD2 != null && (aid = awemeD2.getAid()) != null) {
            C805030Vi1.LIZ.getClass();
            AwS98S1000000_13 awS98S1000000_13 = new AwS98S1000000_13(aid, 20);
            AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(630);
            if (!((FollowingFeedConsumeMonitorConfigModel) C805030Vi1.LIZJ.getValue()).enable) {
                C2252408s6.LIZ(new AwS557S0100000_13(aFwS213S0000000_24, 185));
            } else {
                C2252408s6.LIZ(new AwS557S0100000_13(awS98S1000000_13, 186));
            }
            C607520NsE c607520NsE = C607520NsE.LIZ;
            EnumC607570NsJ[] enumC607570NsJArr = {EnumC607570NsJ.ONLY_FOLLOW};
            c607520NsE.getClass();
            C607520NsE.LIZJ(aid, enumC607570NsJArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:20:0x0048, B:22:0x0054, B:23:0x005d, B:15:0x0039), top: B:40:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$8(X.C1620930sHb r6, int r7) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620930sHb.onPageSelected$8(X.0sHb, int):void");
    }

    public static final void onPageSelected$9(C1620930sHb c1620930sHb, int i) {
        String strCQ2;
        ScrollSwitchStateManager scrollSwitchStateManager = ((SidebarContainerAssem) c1620930sHb.l0).LLJJIJIL;
        if (scrollSwitchStateManager != null && (strCQ2 = scrollSwitchStateManager.CQ2(i)) != null) {
            SidebarContainerAssem sidebarContainerAssem = (SidebarContainerAssem) c1620930sHb.l0;
            if (Intrinsics.LJFF(sidebarContainerAssem.LLJLILLLLZIIL, "page_sidebar") && Intrinsics.LJFF(strCQ2, "page_feed")) {
                sidebarContainerAssem.kp();
            }
            sidebarContainerAssem.LLJLILLLLZIIL = strCQ2;
        }
    }

    public static final void onPageScrolled$12(C1620930sHb c1620930sHb, int i, float f, int i2) {
        if (Intrinsics.LJFF(((C1570610qyR) c1620930sHb.l0).LIZIZ.BQ2(i), "page_sidebar")) {
            ((C1570610qyR) c1620930sHb.l0).LIZIZ(0);
            C1570610qyR c1570610qyR = (C1570610qyR) c1620930sHb.l0;
            if (i2 > 0) {
                View view = (View) c1570610qyR.LJ.getValue();
                if (view != null && view.getVisibility() == 0) {
                    float fLIZLLL = C13LZ.LIZLLL((c1570610qyR.LIZLLL - i2) / c1570610qyR.LIZJ, 0.0f, 1.0f) * 0.5f;
                    View view2 = (View) c1570610qyR.LJ.getValue();
                    if (view2 != null) {
                        C786410Ut5.T4(view2, fLIZLLL);
                        return;
                    }
                    return;
                }
                return;
            }
            c1570610qyR.getClass();
            return;
        }
        ((C1570610qyR) c1620930sHb.l0).LIZIZ(8);
    }

    public static final void onPageScrolled$13(C1620930sHb c1620930sHb, int i, float f, int i2) {
        ScrollSwitchStateManager scrollSwitchStateManager = ((DetailFragment) c1620930sHb.l0).LLILLL;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.JQ2(f, i, i2);
        }
    }

    public static final void onPageScrolled$2(C1620930sHb c1620930sHb, int i, float f, int i2) {
        View viewAq0;
        int iIntValue;
        Integer numLJIL;
        if (((FeedSkylightToolbarIconBridgeAssem) c1620930sHb.l0).vo() && !C1581510rG1.LIZLLL()) {
            StoryToolBarIconAbility storyToolBarIconAbilityUo = ((FeedSkylightToolbarIconBridgeAssem) c1620930sHb.l0).uo();
            if (storyToolBarIconAbilityUo != null) {
                viewAq0 = storyToolBarIconAbilityUo.aq0();
            } else {
                viewAq0 = null;
            }
            if ((viewAq0 != null && viewAq0.getVisibility() == 8) || f == 0.0f) {
                return;
            }
            HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) ((FeedSkylightToolbarIconBridgeAssem) c1620930sHb.l0).LLILZLL.getValue();
            if (homeViewPagerAbility != null && (numLJIL = homeViewPagerAbility.LJIL()) != null) {
                iIntValue = numLJIL.intValue();
            } else {
                iIntValue = -1;
            }
            if (iIntValue > i) {
                if (viewAq0 == null) {
                    return;
                }
                C786410Ut5.T4(viewAq0, f * 1.0f);
            } else {
                if (viewAq0 == null) {
                    return;
                }
                C786410Ut5.T4(viewAq0, (1 - f) * 1.0f);
            }
        }
    }
}
