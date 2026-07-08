package Y;

import X.C0CUK;
import X.C0RJN;
import X.C0RRR;
import X.C0S4U;
import X.C1577320r9G;
import X.C1598650rhf;
import X.C1603970rqF;
import X.C1846010y8d;
import X.C19EG;
import X.C1C7U;
import X.C20287314Zr;
import X.InterfaceC1577520r9a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.friendstab.ability.FriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem;
import com.ss.android.ugc.aweme.model.DramaFeedCardInsertScene;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.nujinsertion.component.DramaNUJCardPanelComponent;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconAssem;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoMediaChooseView;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS35S0101000_24 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Fragment fragment;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        Fragment fragment2;
        C19EG activity;
        MainActivityScope mainActivityScopeLIZJ;
        HomeViewPagerAbility homeViewPagerAbilityLIZ;
        Fragment fragment3;
        FragmentManager parentFragmentManager;
        C0RJN panelContext = ((DramaNUJCardPanelComponent) this.l0).getPanelContext();
        if (panelContext == null || (fragment = panelContext.LJ) == null || !fragment.isAdded()) {
            return;
        }
        C0RJN panelContext2 = ((DramaNUJCardPanelComponent) this.l0).getPanelContext();
        if (panelContext2 == null || (fragment3 = panelContext2.LJ) == null || (parentFragmentManager = fragment3.getParentFragmentManager()) == null || !parentFragmentManager.LJLJJI()) {
            C0RJN panelContext3 = ((DramaNUJCardPanelComponent) this.l0).getPanelContext();
            if (panelContext3 != null && (fragment2 = panelContext3.LJ) != null && (activity = fragment2.getActivity()) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(activity)) != null && (homeViewPagerAbilityLIZ = C0CUK.LIZ(mainActivityScopeLIZJ)) != null) {
                homeViewPagerAbilityLIZ.Cl2(this.i1, false, false);
            }
            ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
            if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null) {
                C1577320r9G.LIZ.getClass();
                interfaceC1577520r9aLIZIZ.LJ("homepage_series", "series_dnu_insertion", "pgc_drama_dnu_video");
            }
            ((DramaNUJCardPanelComponent) this.l0).LLIZ = true;
            C1577320r9G.LIZ.LIZJ(DramaFeedCardInsertScene.DRAMA_FEED_CARD_INSERT_SCENE_DRAMA_TAB);
        }
    }

    public static final void run$0(ARunnableS35S0101000_24 aRunnableS35S0101000_24) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreTabBar@c245.animateToTab$1");
        try {
            ((C1846010y8d) aRunnableS35S0101000_24.l0).LJIIIIZZ(aRunnableS35S0101000_24.i1, 0.0f, true, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreTabBar@c245.animateToTab$1");
    }

    public static final void run$1(ARunnableS35S0101000_24 aRunnableS35S0101000_24) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsV3FeedListAssem@36ba.scrollToPosition$1");
        try {
            if (((FriendsV3FeedListAssem) aRunnableS35S0101000_24.l0).Go().getParent() != null) {
                ((FriendsV3FeedListAssem) aRunnableS35S0101000_24.l0).Go().scrollToPosition(aRunnableS35S0101000_24.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsV3FeedListAssem@36ba.scrollToPosition$1");
    }

    public static final void run$2(ARunnableS35S0101000_24 aRunnableS35S0101000_24) {
        boolean zLIZ;
        C1C7U.LIZ("StoryToolBarIconAssem@f5cd.onViewCreatedDelayed$3$1");
        try {
            ((StoryToolBarIconAssem) aRunnableS35S0101000_24.l0).cp(aRunnableS35S0101000_24.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryToolBarIconAssem@f5cd.onViewCreatedDelayed$3$1");
    }

    public static final void run$3(ARunnableS35S0101000_24 aRunnableS35S0101000_24) {
        boolean zLIZ;
        C1C7U.LIZ("TakoMediaChooseView@829c.locateToPositionWithSnapBottom$1$1");
        try {
            ((TakoMediaChooseView) aRunnableS35S0101000_24.l0).mp(aRunnableS35S0101000_24.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoMediaChooseView@829c.locateToPositionWithSnapBottom$1$1");
    }

    public static final void run$4(ARunnableS35S0101000_24 aRunnableS35S0101000_24) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsTabLayoutAbility@f2a.updateTabMarginConstraint$1");
        try {
            ((FriendsTabLayoutAbility) aRunnableS35S0101000_24.l0).LLILLL.setScrollPosition(aRunnableS35S0101000_24.i1, 0.0f, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsTabLayoutAbility@f2a.updateTabMarginConstraint$1");
    }

    public static final void run$5(ARunnableS35S0101000_24 aRunnableS35S0101000_24) {
        C1603970rqF c1603970rqF = (C1603970rqF) aRunnableS35S0101000_24.l0;
        int i = aRunnableS35S0101000_24.i1;
        c1603970rqF.getClass();
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelectedInternal$3L");
        c1603970rqF.LLJ.LLLLZ(i);
        C20287314Zr c20287314Zr = C20287314Zr.LIZ;
        Aweme awemeLJIIIIZZ = c1603970rqF.LLJ.LJIIIIZZ();
        String eventType = c1603970rqF.LLJ.getEventType();
        BaseListFragmentPanel baseListFragmentPanel = c1603970rqF.LLJ;
        c20287314Zr.getClass();
        C20287314Zr.LIZIZ(i, awemeLJIIIIZZ, baseListFragmentPanel, eventType);
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelectedInternal$3L");
    }

    public static final void run$6(ARunnableS35S0101000_24 aRunnableS35S0101000_24) {
        boolean zLIZ;
        C1C7U.LIZ("DramaNUJCardPanelComponent@ef78.activeDramaTab$2");
        try {
            aRunnableS35S0101000_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DramaNUJCardPanelComponent@ef78.activeDramaTab$2");
    }

    public static final void run$7(ARunnableS35S0101000_24 aRunnableS35S0101000_24) {
        boolean zLIZ;
        C1C7U.LIZ("SkylightContainerVH@6dc0.subscribeState$4$1");
        try {
            ((C1598650rhf) aRunnableS35S0101000_24.l0).d6(aRunnableS35S0101000_24.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkylightContainerVH@6dc0.subscribeState$4$1");
    }

    public ARunnableS35S0101000_24(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }

    public ARunnableS35S0101000_24(DramaNUJCardPanelComponent dramaNUJCardPanelComponent, int i, Aweme aweme, int i2) {
        this.$t = i2;
        this.l0 = dramaNUJCardPanelComponent;
        this.i1 = i;
    }
}
