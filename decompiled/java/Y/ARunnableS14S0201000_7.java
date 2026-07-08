package Y;

import X.C0ISJ;
import X.C0JFC;
import X.C1126800fQc;
import X.C1133940fc8;
import X.C1161920gLG;
import X.C1605720rt4;
import X.C19U0;
import X.C1C7U;
import X.C20441214yg;
import X.C21578619ce;
import X.C2188811AlT;
import X.C464330IIt;
import X.C469620IbI;
import X.C513100KAi;
import X.C786410Ut5;
import X.InterfaceC469640IbK;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftListWatchNSecOptSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.extension.LifecycleOwnerExtKt$onLifecycleEvent$1;
import com.ss.android.ugc.aweme.publicgroup.assem.GroupListAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.common.PrivilegeBottomSheetBehavior;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS14S0201000_7 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    public static final void run$6(ARunnableS14S0201000_7 aRunnableS14S0201000_7) {
        EnterRoomLinkSession.LIZ((EnterRoomLinkSession) aRunnableS14S0201000_7.l0, (EnterRoomLinkSession) aRunnableS14S0201000_7.l1, aRunnableS14S0201000_7.i2);
    }

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
        List<FeedItem> list;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("insert room ");
            sbLIZ.append(this.i2);
            sbLIZ.append(", room id ");
            sbLIZ.append(((Room) this.l0).getId());
            C20441214yg.LJIIIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
            EnterRoomConfig enterRoomConfigLIZJ = C464330IIt.LIZJ(false, (Room) this.l0);
            int i = this.i2 - 1;
            if (i >= 0 && i < ((C0ISJ) this.l1).LLJILJIL.size() && i < ((C0ISJ) this.l1).LLJILJILJ.size()) {
                C0ISJ c0isj = (C0ISJ) this.l1;
                c0isj.LJJLIIIJLLLLLLLZ(enterRoomConfigLIZJ, c0isj.LLJILJILJ.get(i).mRoomsData.unreadExtra);
            }
            ((C0ISJ) this.l1).LLJILJIL.add(this.i2, (Room) this.l0);
            ((C0ISJ) this.l1).LLJILJILJ.add(this.i2, enterRoomConfigLIZJ);
            C0ISJ c0isj2 = (C0ISJ) this.l1;
            if (c0isj2.LLILZIL == 2 && (list = c0isj2.LLLILZJ) != null) {
                int i2 = this.i2;
                FeedItem feedItem = new FeedItem();
                feedItem.setRoom((Room) this.l0);
                list.add(i2, feedItem);
            }
            ((C0ISJ) this.l1).LJJJJ(enterRoomConfigLIZJ);
            ((C0ISJ) this.l1).LJIILJJIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("DrawRoomListProvider", "insert room error", e);
        }
    }

    public final void LIZ$1() {
        View viewFindViewByPosition;
        RecyclerView.LayoutManager layoutManager = ((GroupListAssem) this.l0).hp().getLayoutManager();
        if (layoutManager != null && (viewFindViewByPosition = layoutManager.findViewByPosition(this.i2)) != null && viewFindViewByPosition.getHeight() > 0) {
            ((C21578619ce) ((GroupListAssem) this.l0).LLJJJJLIIL.getValue()).smoothScrollTo(0, viewFindViewByPosition.getTop() + ((ViewOnAttachStateChangeListenerC20604515jv) this.l1).getTop());
            return;
        }
        GroupListAssem groupListAssem = (GroupListAssem) this.l0;
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.l1;
        final int i = this.i2;
        final C21578619ce c21578619ce = (C21578619ce) groupListAssem.LLJJJJLIIL.getValue();
        C786410Ut5.x3(viewOnAttachStateChangeListenerC20604515jv.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0JjX
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C786410Ut5.C3(viewOnAttachStateChangeListenerC20604515jv.getViewTreeObserver(), this);
                RecyclerView.LayoutManager layoutManager2 = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                View viewFindViewByPosition2 = layoutManager2 != null ? layoutManager2.findViewByPosition(i) : null;
                if (viewFindViewByPosition2 != null) {
                    c21578619ce.smoothScrollTo(0, viewFindViewByPosition2.getTop() + viewOnAttachStateChangeListenerC20604515jv.getTop());
                } else {
                    c21578619ce.smoothScrollTo(0, viewOnAttachStateChangeListenerC20604515jv.getTop());
                }
            }
        });
    }

    public static final void run$0(ARunnableS14S0201000_7 aRunnableS14S0201000_7) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS14S0201000_7.l0;
        int i = aRunnableS14S0201000_7.i2;
        Room room = (Room) aRunnableS14S0201000_7.l1;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        C1C7U.LIZ("LivePlayFragment@afba.syncGiftResourceOpt$1L");
        if (LiveGiftListWatchNSecOptSetting.INSTANCE.isEnable() && i != 2) {
            if (room != null) {
                if (room.getRoomAuthStatus() != null) {
                    ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).syncGiftList(livePlayFragment.k2, room.getId(), i, false);
                }
            }
        } else {
            ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).resetRoomStatus(true);
            if (room != null) {
                if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().enableGift) {
                    IRevenueStrategyService iRevenueStrategyServiceLIZIZ = C1126800fQc.LIZIZ();
                    if (iRevenueStrategyServiceLIZIZ != null) {
                        C1133940fc8 c1133940fc8M92 = iRevenueStrategyServiceLIZIZ.M92();
                        room.getId();
                        room.getOwnerUserId();
                        c1133940fc8M92.getClass();
                    }
                    ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).resetGiftInfo(room.getId(), room.getOwnerUserId(), livePlayFragment.y);
                }
                if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().enableGift) {
                    ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).syncGiftList(livePlayFragment.k2, room.getId(), i, false);
                }
            }
        }
        C1C7U.LIZIZ("LivePlayFragment@afba.syncGiftResourceOpt$1L");
    }

    public static final void run$1(ARunnableS14S0201000_7 aRunnableS14S0201000_7) {
        boolean zLIZ;
        C1C7U.LIZ("PrivilegeBottomSheetBehavior@77bc.settleToStatePendingLayout$1");
        try {
            ((PrivilegeBottomSheetBehavior) aRunnableS14S0201000_7.l0).settleToState((View) aRunnableS14S0201000_7.l1, aRunnableS14S0201000_7.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrivilegeBottomSheetBehavior@77bc.settleToStatePendingLayout$1");
    }

    public static final void run$2(ARunnableS14S0201000_7 aRunnableS14S0201000_7) {
        boolean zLIZ;
        C1C7U.LIZ("StrategySDKManager@738d.processErrorData$1");
        try {
            C469620IbI c469620IbI = C469620IbI.LIZ;
            C469620IbI.LJIIIIZZ(aRunnableS14S0201000_7.i2 - 1, (InterfaceC469640IbK) aRunnableS14S0201000_7.l1, (List) aRunnableS14S0201000_7.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StrategySDKManager@738d.processErrorData$1");
    }

    public static final void run$3(ARunnableS14S0201000_7 aRunnableS14S0201000_7) {
        boolean zLIZ;
        C1C7U.LIZ("DrawRoomListProvider@3742.insertRoom$3");
        try {
            aRunnableS14S0201000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DrawRoomListProvider@3742.insertRoom$3");
    }

    public static final void run$4(ARunnableS14S0201000_7 aRunnableS14S0201000_7) {
        boolean zLIZ;
        C1C7U.LIZ("GroupListAssem@3935.scrollToTargetPosition$1");
        try {
            aRunnableS14S0201000_7.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupListAssem@3935.scrollToTargetPosition$1");
    }

    public static final void run$5(ARunnableS14S0201000_7 aRunnableS14S0201000_7) {
        boolean zLIZ;
        C1C7U.LIZ("FlashPlanSelectTabItemViewHolder@3ad1.addTab$2$1");
        try {
            int width = ((C513100KAi) aRunnableS14S0201000_7.l0).LL.getWidth();
            int i = aRunnableS14S0201000_7.i2;
            if (i == 0) {
                i = 1;
            }
            ((C19U0) aRunnableS14S0201000_7.l1).LJIIIIZZ.setMinimumWidth(width / i);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FlashPlanSelectTabItemViewHolder@3ad1.addTab$2$1");
    }

    public static final void run$7(ARunnableS14S0201000_7 aRunnableS14S0201000_7) {
        boolean zLIZ;
        C1C7U.LIZ("SocPubStatusCache@d9ef.watchLifecycleOwnerToRelease$1");
        try {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) aRunnableS14S0201000_7.l0;
            C0JFC c0jfc = new C0JFC(aRunnableS14S0201000_7.i2, lifecycleOwner, (C1605720rt4) aRunnableS14S0201000_7.l1);
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            lifecycle.addObserver(new LifecycleOwnerExtKt$onLifecycleEvent$1(Lifecycle.Event.ON_DESTROY, lifecycle, c0jfc));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocPubStatusCache@d9ef.watchLifecycleOwnerToRelease$1");
    }

    public ARunnableS14S0201000_7(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
