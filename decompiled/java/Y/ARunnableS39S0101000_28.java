package Y;

import X.C01U6;
import X.C1868430yin;
import X.C1900610zYh;
import X.C1910460zoa;
import X.C19654211v2;
import X.C1C7U;
import X.C21578619ce;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.ViewPagerLoginView;
import com.ss.android.ugc.aweme.notification.v2.assem.NotificationCreatorBarAssem;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveContactsUnit;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveFBFriendsUnit;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveMLBBFriendsUnit;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS166S0101000_28;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS39S0101000_28 implements Runnable {
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
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        LinearLayoutManager linearLayoutManager;
        View viewFindViewByPosition;
        NotificationCreatorBarAssem notificationCreatorBarAssem = (NotificationCreatorBarAssem) this.l0;
        C1900610zYh c1900610zYhLIZ = notificationCreatorBarAssem.Go().getState().LLILZIL.LIZ();
        notificationCreatorBarAssem.Jo(c1900610zYhLIZ != null ? c1900610zYhLIZ.LIZJ : null);
        NotificationCreatorBarAssem notificationCreatorBarAssem2 = (NotificationCreatorBarAssem) this.l0;
        int i = this.i1;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvHo = notificationCreatorBarAssem2.Ho();
        if (viewOnAttachStateChangeListenerC20604515jvHo == null || i < 0 || i >= viewOnAttachStateChangeListenerC20604515jvHo.getState().LJIIIIZZ()) {
            return;
        }
        LinearLayoutManager linearLayoutManager2 = notificationCreatorBarAssem2.LLJI;
        if (linearLayoutManager2 == null || linearLayoutManager2.getChildAt(i) == null) {
            LinearLayoutManager linearLayoutManager3 = notificationCreatorBarAssem2.LLJI;
            if (linearLayoutManager3 != null) {
                linearLayoutManager3.scrollToPosition(i);
                return;
            }
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvHo2 = notificationCreatorBarAssem2.Ho();
        if (viewOnAttachStateChangeListenerC20604515jvHo2 == null || (linearLayoutManager = notificationCreatorBarAssem2.LLJI) == null) {
            return;
        }
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if ((i < iFindFirstCompletelyVisibleItemPosition || i > iFindLastCompletelyVisibleItemPosition) && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(i)) != null && (viewFindViewByPosition.getBottom() - viewOnAttachStateChangeListenerC20604515jvHo2.getTop()) / viewFindViewByPosition.getHeight() < 1.0f) {
            viewOnAttachStateChangeListenerC20604515jvHo2.smoothScrollToPosition(i);
        }
    }

    public final void LIZ$1() {
        if (((C1910460zoa) this.l0).LJII.contains(Integer.valueOf(this.i1))) {
            return;
        }
        C1868430yin c1868430yin = ((C1910460zoa) this.l0).LJI;
        int i = this.i1;
        if (c1868430yin.LIZLLL.containsKey(Integer.valueOf(i))) {
            return;
        }
        c1868430yin.LIZLLL.put(Integer.valueOf(i), Boolean.TRUE);
    }

    public static final void run$0(ARunnableS39S0101000_28 aRunnableS39S0101000_28) {
        boolean zLIZ;
        C1C7U.LIZ("NotificationCreatorBarAssem@564d.onViewCreated$4$1");
        try {
            aRunnableS39S0101000_28.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NotificationCreatorBarAssem@564d.onViewCreated$4$1");
    }

    public static final void run$1(ARunnableS39S0101000_28 aRunnableS39S0101000_28) {
        boolean zLIZ;
        C1C7U.LIZ("NewsAnchorPublishViewHolder@8b0d.onOpened$2$2$1$2$1");
        try {
            C21578619ce c21578619ce = ((C19654211v2) aRunnableS39S0101000_28.l0).LLIZ;
            if (c21578619ce != null) {
                c21578619ce.smoothScrollTo(0, aRunnableS39S0101000_28.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewsAnchorPublishViewHolder@8b0d.onOpened$2$2$1$2$1");
    }

    public static final void run$2(ARunnableS39S0101000_28 aRunnableS39S0101000_28) {
        boolean zLIZ;
        C1C7U.LIZ("RemoveContactsUnit@efff.setRemoveIVState$1");
        try {
            int i = aRunnableS39S0101000_28.i1;
            if (i != 0) {
                if (i == 1) {
                    ((RemoveContactsUnit) aRunnableS39S0101000_28.l0).LJI(AFwS271S0000000_28.get$arr$(281));
                }
            } else {
                ((RemoveContactsUnit) aRunnableS39S0101000_28.l0).LJI(AFwS271S0000000_28.get$arr$(280));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RemoveContactsUnit@efff.setRemoveIVState$1");
    }

    public static final void run$3(ARunnableS39S0101000_28 aRunnableS39S0101000_28) {
        boolean zLIZ;
        C1C7U.LIZ("RemoveFBFriendsUnit@d586.setRemoveIVState$1");
        try {
            int i = aRunnableS39S0101000_28.i1;
            if (i != 0) {
                if (i == 1) {
                    ((RemoveFBFriendsUnit) aRunnableS39S0101000_28.l0).LJI(AFwS271S0000000_28.get$arr$(285));
                }
            } else {
                ((RemoveFBFriendsUnit) aRunnableS39S0101000_28.l0).LJI(AFwS271S0000000_28.get$arr$(284));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RemoveFBFriendsUnit@d586.setRemoveIVState$1");
    }

    public static final void run$4(ARunnableS39S0101000_28 aRunnableS39S0101000_28) {
        boolean zLIZ;
        C1C7U.LIZ("RemoveMLBBFriendsUnit@db1c.setRemoveIVState$1");
        try {
            int i = aRunnableS39S0101000_28.i1;
            if (i != 0) {
                if (i == 1) {
                    ((RemoveMLBBFriendsUnit) aRunnableS39S0101000_28.l0).LJI(AFwS271S0000000_28.get$arr$(289));
                }
            } else {
                ((RemoveMLBBFriendsUnit) aRunnableS39S0101000_28.l0).LJI(AFwS271S0000000_28.get$arr$(288));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RemoveMLBBFriendsUnit@db1c.setRemoveIVState$1");
    }

    public static final void run$5(ARunnableS39S0101000_28 aRunnableS39S0101000_28) {
        boolean zLIZ;
        C1C7U.LIZ("NewsAnchorPublishViewHolder@8b0d.setupLinkInputBox$1$3$1$onFocusChange$1$1");
        try {
            C21578619ce c21578619ce = ((C19654211v2) aRunnableS39S0101000_28.l0).LLIZ;
            if (c21578619ce != null) {
                c21578619ce.smoothScrollTo(0, aRunnableS39S0101000_28.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewsAnchorPublishViewHolder@8b0d.setupLinkInputBox$1$3$1$onFocusChange$1$1");
    }

    public static final void run$6(ARunnableS39S0101000_28 aRunnableS39S0101000_28) {
        boolean zLIZ;
        C1C7U.LIZ("ECReferralManager@1d57.uploadButtonAction$1");
        try {
            C01U6.LIZIZ(new AwS166S0101000_28(aRunnableS39S0101000_28.i1, (ReferralFeedBanner) aRunnableS39S0101000_28.l0, 7));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECReferralManager@1d57.uploadButtonAction$1");
    }

    public static final void run$7(ARunnableS39S0101000_28 aRunnableS39S0101000_28) {
        boolean zLIZ;
        C1C7U.LIZ("SearchPhotoImageLoadHelper@5fbb.onImageShown$1");
        try {
            aRunnableS39S0101000_28.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchPhotoImageLoadHelper@5fbb.onImageShown$1");
    }

    public static final void run$8(ARunnableS39S0101000_28 aRunnableS39S0101000_28) {
        boolean zLIZ;
        C1C7U.LIZ("ViewPagerLoginView@ab0e.initView$6$onMoreClicked$2");
        try {
            View childAt = ((ViewPagerLoginView) aRunnableS39S0101000_28.l0).LIZIZ().getChildAt(aRunnableS39S0101000_28.i1);
            if (childAt != null) {
                childAt.sendAccessibilityEvent(8);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewPagerLoginView@ab0e.initView$6$onMoreClicked$2");
    }

    public ARunnableS39S0101000_28(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
