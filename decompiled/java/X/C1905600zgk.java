package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.util.LiveBubbleUtil;
import com.ss.android.ugc.aweme.feed.util.LiveBubbleUtil$handler$1;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zgk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905600zgk implements InterfaceC519500KYy {
    public static final C1905600zgk LIZ = C1905630zgn.LIZ;

    @Override // X.InterfaceC519500KYy
    public final boolean LIZIZ() {
        LiveBubbleUtil.LIZ.getClass();
        if (!LiveBubbleUtil.LIZIZ()) {
            return false;
        }
        if (System.currentTimeMillis() < LiveBubbleUtil.LJJ) {
            LiveBubbleData liveBubbleData = LiveBubbleUtil.LJI;
            LiveBubbleUtil.LJII = liveBubbleData;
            return (liveBubbleData == null || liveBubbleData.roomData == null) ? false : true;
        }
        LiveBubbleData liveBubbleData2 = LiveBubbleUtil.LJI;
        if (liveBubbleData2 == null) {
            return false;
        }
        liveBubbleData2.setRoomData(null);
        return false;
    }

    @Override // X.InterfaceC519500KYy
    public final boolean LIZLLL() {
        LiveBubbleUtil.LIZ.getClass();
        return LiveBubbleUtil.LJIJJ;
    }

    @Override // X.InterfaceC519500KYy
    public final void LJ() {
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleUtil.LIZJ("push_avoid", true);
        C0J9F.LIZ();
    }

    @Override // X.InterfaceC519500KYy
    public final void LJFF() {
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleUtil.LIZJ("ad_avoid", false);
        C0J9F.LIZ();
    }

    @Override // X.InterfaceC519500KYy
    public final void LJI() {
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleUtil.LJIL = true;
        LiveBubbleUtil.LIZJ("draw_guide", false);
        C0J9F.LIZ();
    }

    @Override // X.InterfaceC519500KYy
    public final boolean LJIIIZ() {
        LiveBubbleUtil.LIZ.getClass();
        return LiveBubbleUtil.LJIILIIL;
    }

    @Override // X.InterfaceC519500KYy
    public final void LJIIL() throws Throwable {
        try {
            LiveBubbleUtil.LIZ.getClass();
            LiveBubbleUtil.LJIIJJI();
            C519480KYw.LIZ.getClass();
            C519480KYw.LJIIIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("TopLiveService", e);
        }
    }

    @Override // X.InterfaceC519500KYy
    public final C0J6U mk() {
        return new C467460IUu();
    }

    @Override // X.InterfaceC519500KYy
    public final void onDestroy() {
        C1905680zgs c1905680zgs;
        LiveBubbleUtil.LIZ.getClass();
        C1905610zgl.LJFF("livesdk_bubble_onDestroy");
        if (LiveBubbleUtil.LIZJ) {
            LiveBubbleUtil.LIZJ = false;
            return;
        }
        C1905680zgs c1905680zgs2 = LiveBubbleUtil.LJIIZILJ;
        if (c1905680zgs2 != null) {
            c1905680zgs2.LLJILLL = false;
        }
        if (c1905680zgs2 != null && c1905680zgs2.isShowing() && (c1905680zgs = LiveBubbleUtil.LJIIZILJ) != null) {
            c1905680zgs.dismiss();
        }
        LiveBubbleUtil.LJIIZILJ = null;
        LiveBubbleUtil.LJI = null;
        LiveBubbleUtil.LJII = null;
        LiveBubbleUtil.LJIIIZ = new WeakReference<>(null);
        LiveBubbleUtil.LJIILLIIL = null;
        LiveBubbleUtil.LJIIIIZZ = null;
        LiveBubbleUtil.LJIJJ = false;
        LiveBubbleUtil.LJIILIIL = true;
        LiveBubbleUtil.LJIJI = true;
        LiveBubbleUtil.LJFF = false;
        LiveBubbleUtil.LJJI.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC519500KYy
    public final void I9() {
        boolean zLJI = MethodIDManager.LJI(71861);
        ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).I9();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC519500KYy
    public final void LIZJ(View view) {
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleUtil.LJIIJ = new WeakReference<>(view);
    }

    @Override // X.InterfaceC519500KYy
    public final void LJII(View view) {
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleUtil.LJIIJJI = new WeakReference<>(view);
    }

    @Override // X.InterfaceC519500KYy
    public final void LJIIIIZZ(View view) {
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleUtil.LJIIL = new WeakReference<>(view);
    }

    @Override // X.InterfaceC519500KYy
    public final void LJIIJJI(String str) {
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleUtil.LJIILJJIL = str;
        LiveBubbleUtil.LJIIIZ(0, 1);
    }

    @Override // X.InterfaceC519500KYy
    public final void LJIILIIL(boolean z) {
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleUtil.LJIJI = z;
        if (LiveBubbleUtil.LJFF) {
            if (z) {
                if (LiveBubbleUtil.LJI != null && !LiveBubbleUtil.LJIJ) {
                    LiveBubbleUtil$handler$1 liveBubbleUtil$handler$1 = LiveBubbleUtil.LJJI;
                    RunnableC1905570zgh runnableC1905570zgh = LiveBubbleUtil.LJJIFFI;
                    liveBubbleUtil$handler$1.removeCallbacks(runnableC1905570zgh);
                    C786410Ut5.LJLIIL(3000L, liveBubbleUtil$handler$1, runnableC1905570zgh);
                    return;
                }
                return;
            }
            LiveBubbleUtil.LJJI.removeCallbacks(LiveBubbleUtil.LJJIFFI);
        }
    }

    @Override // X.InterfaceC519500KYy
    public final void LJIILJJIL(Context context) {
        LiveBubbleUtil.LIZ.getClass();
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.fromNewStyle = true;
        enterRoomConfig.mLogData.toplivePosition = LiveBubbleUtil.LJIILJJIL;
        roomsData.enterFromMerge = "follow_widget";
        roomsData.enterMethod = "live_merge";
        if (Intrinsics.LJFF("follow_widget", "follow_widget")) {
            C0J9A c0j9aV3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3();
            enterRoomConfig.mRoomsData.widgetType = c0j9aV3.LIZJ();
            enterRoomConfig.mRoomsData.widgetAnchorNum = c0j9aV3.getWidgetAnchorNum();
            enterRoomConfig.mRoomsData.anchorPosition = c0j9aV3.getAnchorPosition();
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().z5().LJII(enterRoomConfig, "homepage_hot");
    }

    @Override // X.InterfaceC519500KYy
    public final void LIZ(String str, boolean z) {
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleUtil.LIZJ(str, z);
    }

    @Override // X.InterfaceC519500KYy
    public final void LJIIJ(int i, View view, boolean z) {
        String str;
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleUtil.LJIIIZ = new WeakReference<>(view);
        if (i == 8388627) {
            str = "top_left";
        } else {
            str = "top_right";
        }
        LiveBubbleUtil.LJIILJJIL = str;
        LiveBubbleUtil.LJIILIIL = z;
    }
}
