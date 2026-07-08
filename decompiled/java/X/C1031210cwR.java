package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.Pair;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031210cwR {
    public final C0RAE<?, ?> LIZ;
    public final Fragment LIZIZ;
    public final IVideoPlayTaskManager LIZJ;
    public Pair<Long, Long> LJ;
    public Aweme LJFF;
    public int LIZLLL = -1;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1016));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1017));

    public final void LIZIZ() {
        long jLongValue;
        FeedRecommendFragment feedRecommendFragment;
        RecommendFeedFragmentPanel recommendFeedFragmentPanel;
        Pair<Long, Long> pair = this.LJ;
        long jLongValue2 = 0;
        if (pair != null) {
            jLongValue = pair.getFirst().longValue();
            jLongValue2 = pair.getSecond().longValue();
        } else {
            jLongValue = 0;
        }
        Aweme aweme = this.LJFF;
        Integer numValueOf = Integer.valueOf(this.LIZLLL);
        Fragment fragment = this.LIZIZ;
        Integer numValueOf2 = null;
        if ((fragment instanceof FeedRecommendFragment) && (feedRecommendFragment = (FeedRecommendFragment) fragment) != null && (recommendFeedFragmentPanel = feedRecommendFragment.LLIZLLLIL) != null) {
            numValueOf2 = Integer.valueOf(recommendFeedFragmentPanel.getItemCount());
        }
        C1031080cwE c1031080cwE = new C1031080cwE(aweme, numValueOf, numValueOf2, Long.valueOf(jLongValue), Long.valueOf(jLongValue2));
        ISplashAdService iSplashAdService = (ISplashAdService) PluggableExtentionKt.pluggableSpi$default(ISplashAdService.class, false, false, false, 14, null);
        if (iSplashAdService != null) {
            iSplashAdService.LJIIL(c1031080cwE);
        }
    }

    public final void LIZ(String str) {
        int currentItem;
        FeedRecommendFragment feedRecommendFragment;
        RecommendFeedFragmentPanel recommendFeedFragmentPanel;
        VerticalViewPager verticalViewPager;
        LIZLLL(true);
        LIZJ(true);
        if (TextUtils.equals(str, "homepage_hot") && (this.LIZIZ instanceof FeedRecommendFragment)) {
            Fragment fragment = this.LIZIZ;
            if ((fragment instanceof FeedRecommendFragment) && (feedRecommendFragment = (FeedRecommendFragment) fragment) != null && (recommendFeedFragmentPanel = feedRecommendFragment.LLIZLLLIL) != null && (verticalViewPager = recommendFeedFragmentPanel.LLJJIJI) != null) {
                currentItem = verticalViewPager.getCurrentItem();
            } else {
                currentItem = -1;
            }
            this.LIZLLL = currentItem;
        }
    }

    public final void LIZJ(boolean z) {
        ILoadMoreAbility iLoadMoreAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(this.LIZIZ);
        if (interfaceC665370Q7zLJ != null && (iLoadMoreAbility = (ILoadMoreAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, ILoadMoreAbility.class, null)) != null) {
            iLoadMoreAbility.jb1((C0OCC) this.LJII.getValue());
            if (!z) {
                return;
            }
            iLoadMoreAbility.p41((C0OCC) this.LJII.getValue());
        }
    }

    public final void LIZLLL(boolean z) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this.LIZ);
        if (interfaceC665370Q7zLIZIZ != null && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, IFeedPanelPlatformAbility.class, null)) != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null) {
            iViewPagerComponentAbilityMb.Xl0((C1031220cwS) this.LJI.getValue());
            if (!z) {
                return;
            }
            iViewPagerComponentAbilityMb.Bv0((C1031220cwS) this.LJI.getValue());
        }
    }

    public C1031210cwR(C0RAE c0rae, Fragment fragment, VideoPlayTaskManager videoPlayTaskManager) {
        this.LIZ = c0rae;
        this.LIZIZ = fragment;
        this.LIZJ = videoPlayTaskManager;
    }
}
