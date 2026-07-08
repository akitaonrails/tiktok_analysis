package Y;

import X.C0J3X;
import X.C0J3Y;
import X.C1C7U;
import X.C21601619gM;
import X.C500260Jjc;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightListAssem;
import com.ss.android.ugc.aweme.business.followinguser.FollowingSkylightUserCell;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectPagingScene;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS18S0101000_7 implements Runnable {
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
        List<C0J3X> list = (List) this.l0;
        int i = this.i1;
        for (C0J3X c0j3x : list) {
            C0J3Y.LIZ.getClass();
            c0j3x.LJI = C0J3Y.LJIIIZ(c0j3x);
            c0j3x.LJIIIIZZ = false;
            if (C0J3Y.LJIIIIZZ != null) {
                View view = c0j3x.LJI;
                if (view != null) {
                    C0J3Y.LJIJI(view);
                }
            } else {
                CopyOnWriteArrayList<C0J3X> copyOnWriteArrayList = C0J3Y.LJFF.get(Integer.valueOf(i));
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(c0j3x);
                }
            }
        }
        LockSupport.unpark(C0J3Y.LIZJ);
    }

    public static final void run$0(ARunnableS18S0101000_7 aRunnableS18S0101000_7) {
        boolean zLIZ;
        View view;
        C1C7U.LIZ("WindowMaskAssem@cbd6.onViewCreated$5$1");
        try {
            FrameLayout frameLayout = ((WindowMaskAssem) aRunnableS18S0101000_7.l0).LLJJIJIIJIL;
            Object parent = null;
            if (frameLayout != null) {
                parent = frameLayout.getParent();
            }
            if ((parent instanceof View) && (view = (View) parent) != null) {
                int height = view.getHeight();
                FrameLayout frameLayout2 = ((WindowMaskAssem) aRunnableS18S0101000_7.l0).LLJJIJIIJIL;
                if (frameLayout2 != null) {
                    C500260Jjc.LJJZ(height - aRunnableS18S0101000_7.i1, frameLayout2);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WindowMaskAssem@cbd6.onViewCreated$5$1");
    }

    public static final void run$1(ARunnableS18S0101000_7 aRunnableS18S0101000_7) {
        LiveRoomFragment liveRoomFragment = (LiveRoomFragment) aRunnableS18S0101000_7.l0;
        int i = aRunnableS18S0101000_7.i1;
        liveRoomFragment.getClass();
        C1C7U.LIZ("LiveRoomFragment@108c.insertRoomAndSwipe$1L");
        C21601619gM c21601619gM = liveRoomFragment.LLLJIL;
        if (c21601619gM != null) {
            c21601619gM.LJIL(i, false);
        }
        C1C7U.LIZIZ("LiveRoomFragment@108c.insertRoomAndSwipe$1L");
    }

    public static final void run$2(ARunnableS18S0101000_7 aRunnableS18S0101000_7) {
        boolean zLIZ;
        C1C7U.LIZ("MaterialSelectPagingScene@7b25.setAlbumData$3");
        try {
            RecyclerView recyclerView = ((MaterialSelectPagingScene) aRunnableS18S0101000_7.l0).LLJL;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(aRunnableS18S0101000_7.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MaterialSelectPagingScene@7b25.setAlbumData$3");
    }

    public static final void run$3(ARunnableS18S0101000_7 aRunnableS18S0101000_7) {
        boolean zLIZ;
        FollowingSkylightUserCell followingSkylightUserCell;
        C1C7U.LIZ("FeedSkylightListAssem@8394.subscribeListViewModelStates$8$1");
        try {
            ((FeedSkylightListAssem) aRunnableS18S0101000_7.l0).sp(aRunnableS18S0101000_7.i1);
            RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = ((FeedSkylightListAssem) aRunnableS18S0101000_7.l0).Go().findViewHolderForLayoutPosition(aRunnableS18S0101000_7.i1);
            if ((viewHolderFindViewHolderForLayoutPosition instanceof FollowingSkylightUserCell) && (followingSkylightUserCell = (FollowingSkylightUserCell) viewHolderFindViewHolderForLayoutPosition) != null) {
                followingSkylightUserCell.V5();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedSkylightListAssem@8394.subscribeListViewModelStates$8$1");
    }

    public static final void run$4(ARunnableS18S0101000_7 aRunnableS18S0101000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LayoutPreloadManager@a384.doPreload$1");
        try {
            C0J3X c0j3x = (C0J3X) aRunnableS18S0101000_7.l0;
            C0J3Y.LIZ.getClass();
            c0j3x.LJI = C0J3Y.LJIIIZ(c0j3x);
            C0J3Y.LIZLLL(aRunnableS18S0101000_7.i1, (C0J3X) aRunnableS18S0101000_7.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LayoutPreloadManager@a384.doPreload$1");
    }

    public static final void run$5(ARunnableS18S0101000_7 aRunnableS18S0101000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LayoutPreloadManager@a384.doPreloadMulti$2");
        try {
            aRunnableS18S0101000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LayoutPreloadManager@a384.doPreloadMulti$2");
    }

    public static final void run$6(ARunnableS18S0101000_7 aRunnableS18S0101000_7) {
        boolean zLIZ;
        LinearLayoutManager linearLayoutManager;
        int height;
        C1C7U.LIZ("SubscriptionPrivilegeDetailFragment@c114.initPageContentLiveData$1$3");
        try {
            RecyclerView recyclerView = ((SubscriptionPrivilegeDetailFragment) aRunnableS18S0101000_7.l0).LLLLLLL;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int i = aRunnableS18S0101000_7.i1;
                ConstraintLayout constraintLayoutWS = ((SubscriptionPrivilegeDetailFragment) aRunnableS18S0101000_7.l0).wS();
                if (constraintLayoutWS != null) {
                    height = constraintLayoutWS.getHeight();
                } else {
                    height = 0;
                }
                linearLayoutManager.scrollToPositionWithOffset(i, height);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubscriptionPrivilegeDetailFragment@c114.initPageContentLiveData$1$3");
    }

    public static final void run$7(ARunnableS18S0101000_7 aRunnableS18S0101000_7) {
        boolean zLIZ;
        C1C7U.LIZ("ConfigurationChangeHelper@6c65.refreshRecyclerViewLayout$1$1");
        try {
            int i = aRunnableS18S0101000_7.i1;
            if (i > 0) {
                ((RecyclerView) aRunnableS18S0101000_7.l0).scrollToPosition(i);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ConfigurationChangeHelper@6c65.refreshRecyclerViewLayout$1$1");
    }

    public ARunnableS18S0101000_7(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
