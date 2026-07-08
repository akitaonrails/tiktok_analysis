package Y;

import X.C0SZ8;
import X.C0TEX;
import X.C0TW3;
import X.C0UCZ;
import X.C1389890mGx;
import X.C1603970rqF;
import X.C1909107dp;
import X.C1C7U;
import X.C2382909Vj;
import X.C497740JfY;
import X.C772830UTh;
import X.C786410Ut5;
import X.InterfaceC748050TVz;
import android.app.Activity;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.PickYourPlanPageFragment;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedFragmentPanel;
import com.ss.android.ugc.aweme.setting.page.datasave.SpeedModeSettingImpl;
import com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS18S0201000_12 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
        PlayerComponentTemp playerComponentTemp;
        FollowFeedFragmentPanelMT followFeedFragmentPanelMT = (FollowFeedFragmentPanelMT) this.l1;
        if (followFeedFragmentPanelMT.LLJJIJI != null) {
            followFeedFragmentPanelMT.LLJLILLLLZIIL = 0;
            if (this.i2 == 0) {
                Aweme aweme = (Aweme) this.l0;
                if (!followFeedFragmentPanelMT.LLZILL() && (playerComponentTemp = followFeedFragmentPanelMT.LLLLIILLL) != null) {
                    playerComponentTemp.jF0(aweme);
                }
                ((FollowFeedFragmentPanelMT) this.l1).LLLZIL(false);
            } else {
                followFeedFragmentPanelMT.LLLZIL(true);
                FollowFeedFragmentPanelMT followFeedFragmentPanelMT2 = (FollowFeedFragmentPanelMT) this.l1;
                followFeedFragmentPanelMT2.LLJJIJI.LJJIJLIJ(followFeedFragmentPanelMT2.LLJLILLLLZIIL, true);
            }
            FeedFollowFragment feedFollowFragment = ((FollowFeedFragmentPanelMT) this.l1).d0;
            if (feedFollowFragment != null) {
                feedFollowFragment.N8();
            }
        }
    }

    public final void LIZ$1() {
        if (this.i2 == 1 && C497740JfY.LJIL()) {
            CompletionBlock completionBlock = (CompletionBlock) this.l0;
            ((C0TW3) this.l1).getClass();
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC748050TVz.class, null), "");
        } else {
            if (this.i2 != 1 && !C497740JfY.LJIL()) {
                CompletionBlock completionBlock2 = (CompletionBlock) this.l0;
                ((C0TW3) this.l1).getClass();
                completionBlock2.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC748050TVz.class, null), "");
                return;
            }
            C0TW3 c0tw3 = (C0TW3) this.l1;
            int i = c0tw3.LLILLL;
            c0tw3.LLILLL = i + 1;
            if (i < 5) {
                C786410Ut5.LJLIIL(200L, (Handler) c0tw3.LLILZ.getValue(), this);
            } else {
                C2382909Vj.LIZ((CompletionBlock) this.l0, 0, "change orientation fail", null, 4);
            }
        }
    }

    public final void LIZ$2() {
        ((LiveBroadcastFragment) this.l0).CT();
        ((LiveBroadcastFragment) this.l0).RS(1);
        ((LiveBroadcastFragment) this.l0).vT((Cert) this.l1, null);
        Creator creator = ((LiveBroadcastFragment) this.l0).PR().creator;
        if (creator != null) {
            int i = creator.roomContinue;
            LiveBroadcastFragment liveBroadcastFragment = (LiveBroadcastFragment) this.l0;
            C772830UTh.LIZIZ(10001, liveBroadcastFragment.RR(), liveBroadcastFragment.getRoomId(), liveBroadcastFragment.LLJLILLLLZIIL, i, this.i2);
        }
    }

    public static final void run$0(ARunnableS18S0201000_12 aRunnableS18S0201000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GameLiveCrossPlatformSdk@70af.sdkCallback$1$onHandleMessage$1");
        try {
            ((C0TEX) aRunnableS18S0201000_12.l0).LIZJ(aRunnableS18S0201000_12.i2, aRunnableS18S0201000_12.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameLiveCrossPlatformSdk@70af.sdkCallback$1$onHandleMessage$1");
    }

    public static final void run$1(ARunnableS18S0201000_12 aRunnableS18S0201000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PickYourPlanPageFragment@c526.computeAndApplyTextShrink$2");
        try {
            ((PickYourPlanPageFragment) aRunnableS18S0201000_12.l0).MR(aRunnableS18S0201000_12.i2 + 1, (Function0) aRunnableS18S0201000_12.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PickYourPlanPageFragment@c526.computeAndApplyTextShrink$2");
    }

    public static final void run$2(ARunnableS18S0201000_12 aRunnableS18S0201000_12) {
        boolean zLIZ;
        C1C7U.LIZ("FollowFeedFragmentPanelMT@59d6.onRefreshResult$1");
        try {
            aRunnableS18S0201000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FollowFeedFragmentPanelMT@59d6.onRefreshResult$1");
    }

    public static final void run$3(ARunnableS18S0201000_12 aRunnableS18S0201000_12) {
        boolean zLIZ;
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$3$onPageSelectedInternal$2");
        try {
            if (!((C1603970rqF) aRunnableS18S0201000_12.l1).LLJ.LLILLL()) {
                ((C0SZ8) aRunnableS18S0201000_12.l0).onPageSelected(aRunnableS18S0201000_12.i2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$3$onPageSelectedInternal$2");
    }

    public static final void run$4(ARunnableS18S0201000_12 aRunnableS18S0201000_12) {
        boolean zLIZ;
        PlayerComponentTemp playerComponentTemp;
        C1C7U.LIZ("FriendsFeedFragmentPanel@5b4e.onRefreshResult$1$1");
        try {
            FriendsFeedFragmentPanel friendsFeedFragmentPanel = (FriendsFeedFragmentPanel) aRunnableS18S0201000_12.l0;
            if (friendsFeedFragmentPanel.LLJJIJI != null) {
                friendsFeedFragmentPanel.LLJLILLLLZIIL = 0;
                if (aRunnableS18S0201000_12.i2 == 0) {
                    Aweme aweme = (Aweme) aRunnableS18S0201000_12.l1;
                    if (!friendsFeedFragmentPanel.LLZILL() && (playerComponentTemp = friendsFeedFragmentPanel.LLLLIILLL) != null) {
                        playerComponentTemp.jF0(aweme);
                    }
                    ((FriendsFeedFragmentPanel) aRunnableS18S0201000_12.l0).LLLZIL(false);
                } else {
                    friendsFeedFragmentPanel.LLLZIL(true);
                    FriendsFeedFragmentPanel friendsFeedFragmentPanel2 = (FriendsFeedFragmentPanel) aRunnableS18S0201000_12.l0;
                    friendsFeedFragmentPanel2.LLJJIJI.LJJIJLIJ(friendsFeedFragmentPanel2.LLJLILLLLZIIL, true);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsFeedFragmentPanel@5b4e.onRefreshResult$1$1");
    }

    public static final void run$5(ARunnableS18S0201000_12 aRunnableS18S0201000_12) {
        boolean zLIZ;
        C1C7U.LIZ("SpeedModeSettingImpl@3ecd.internalShowCellularToast$1");
        try {
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) aRunnableS18S0201000_12.l0);
            c1389890mGx.LJIIIZ(aRunnableS18S0201000_12.i2);
            c1389890mGx.LIZLLL(2000L);
            c1389890mGx.LJIIJJI();
            ((SpeedModeSettingImpl) aRunnableS18S0201000_12.l1).LIZIZ++;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpeedModeSettingImpl@3ecd.internalShowCellularToast$1");
    }

    public static final void run$6(ARunnableS18S0201000_12 aRunnableS18S0201000_12) {
        boolean zLIZ;
        C1C7U.LIZ("ChangeScreenOrientationMethod@1f6d.isOrientationSuccess$1");
        try {
            aRunnableS18S0201000_12.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChangeScreenOrientationMethod@1f6d.isOrientationSuccess$1");
    }

    public static final void run$7(ARunnableS18S0201000_12 aRunnableS18S0201000_12) {
        boolean zLIZ;
        C1C7U.LIZ("NaviAvatarListAdapter@92ce.notifyItemChangedSafely$1");
        try {
            RecyclerView recyclerView = ((C0UCZ) aRunnableS18S0201000_12.l0).LLILZ;
            if (recyclerView == null) {
                recyclerView = null;
            }
            if (recyclerView.getParent() != null) {
                ((C0UCZ) aRunnableS18S0201000_12.l0).notifyItemChanged(aRunnableS18S0201000_12.i2, aRunnableS18S0201000_12.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NaviAvatarListAdapter@92ce.notifyItemChangedSafely$1");
    }

    public static final void run$8(ARunnableS18S0201000_12 aRunnableS18S0201000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBroadcastFragment@d956.onFinishBroadcastConfirmClick$1");
        try {
            aRunnableS18S0201000_12.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBroadcastFragment@d956.onFinishBroadcastConfirmClick$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS18S0201000_12(int i, int i2, CompletionBlock<InterfaceC748050TVz> completionBlock, C0TW3 c0tw3) {
        this.$t = c0tw3;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = completionBlock;
    }
}
