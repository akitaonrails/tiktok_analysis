package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.friendstab.helper.FriendsVideoScrollTracker;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;

/* JADX INFO: renamed from: X.0Usr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786270Usr implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(C786270Usr c786270Usr, int i) {
    }

    public static final void onPageScrollStateChanged$1(C786270Usr c786270Usr, int i) {
    }

    public static final void onPageScrolled$0(C786270Usr c786270Usr, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C786270Usr c786270Usr, int i, float f, int i2) {
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
        }
    }

    public C786270Usr(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$0(C786270Usr c786270Usr, int i) {
        Object c098200Yq;
        Fragment fragment;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C0SZ8 c0sz8F;
        Object c098200Yq2;
        Fragment fragment2;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ2;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb2;
        C0SZ8 c0sz8D;
        FriendsVideoScrollTracker friendsVideoScrollTracker = (FriendsVideoScrollTracker) c786270Usr.l0;
        int i2 = friendsVideoScrollTracker.LJFF;
        if (i2 == i) {
            return;
        }
        Object obj = "";
        if (i2 > i) {
            try {
                FriendsFeedFragmentPanel friendsFeedFragmentPanel = friendsVideoScrollTracker.LJ;
                if (friendsFeedFragmentPanel == null || (fragment = friendsFeedFragmentPanel.getFragment()) == null || (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityLIZJ.Mb()) == null || (c0sz8F = iViewPagerComponentAbilityMb.F()) == null || (c098200Yq = FriendsVideoScrollTracker.LIZ(c0sz8F)) == null) {
                    c098200Yq = "";
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            friendsVideoScrollTracker.LIZLLL = (String) obj;
        } else {
            try {
                FriendsFeedFragmentPanel friendsFeedFragmentPanel2 = friendsVideoScrollTracker.LJ;
                if (friendsFeedFragmentPanel2 == null || (fragment2 = friendsFeedFragmentPanel2.getFragment()) == null || (iFeedPanelPlatformAbilityLIZJ2 = C0T1R.LIZJ(fragment2)) == null || (iViewPagerComponentAbilityMb2 = iFeedPanelPlatformAbilityLIZJ2.Mb()) == null || (c0sz8D = iViewPagerComponentAbilityMb2.D()) == null || (c098200Yq2 = FriendsVideoScrollTracker.LIZ(c0sz8D)) == null) {
                    c098200Yq2 = "";
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            friendsVideoScrollTracker.LIZLLL = (String) obj;
        }
        ((FriendsVideoScrollTracker) c786270Usr.l0).LJFF = i;
    }

    public static final void onPageSelected$1(C786270Usr c786270Usr, int i) {
        View view = ((C0TJB) c786270Usr.l0).LJIILIIL;
        if (view != null && view.getVisibility() == 0) {
            ((C0TJB) c786270Usr.l0).LIZ();
        }
    }
}
