package Y;

import X.AbstractC21673619ry;
import X.AbstractC498530Jgp;
import X.C0IJT;
import X.C0IS4;
import X.C0IXA;
import X.C0KXC;
import X.C1113800f5e;
import X.C1117710fBx;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1537480q70;
import X.C1C7U;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C259800zU;
import X.C354201Zc;
import X.C474500IjA;
import X.C482800IwY;
import X.C497740JfY;
import X.C521110Kc9;
import X.C521210KcJ;
import X.C521980KdY;
import X.C766270U4b;
import X.C785230UrB;
import X.C785270UrF;
import X.C786410Ut5;
import X.EnumC1120860fH2;
import X.InterfaceC254600ye;
import X.InterfaceC482090IvP;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.PreviewBottomBubbleShowEvent;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewButtonRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalRevisionPreviewWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade.LiveInnerFlowDowngradePipeline;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.PlayCardFeedCellV2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS121S1100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS12S1100000_7 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

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
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        LiveMode liveMode;
        DataChannel dataChannel = ((LiveGoalPreviewButtonRevisionWidget) this.l1).dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null || !C354201Zc.LJFF(liveMode)) {
            return;
        }
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C785230UrB c785230UrB = new C785230UrB(((LiveGoalPreviewButtonRevisionWidget) this.l1).contentView);
        c785230UrB.LJIJJ = C497740JfY.LJIJI(2131852621);
        final String str = this.s0;
        c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0JlK
            @Override // X.InterfaceC254600ye
            public final void onShow() {
                C20337914i1<Map<String, Boolean>> c20337914i1 = C0UKZ.LLILLL;
                Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
                mapLIZIZ.put(str, Boolean.TRUE);
                c20337914i1.LJFF(mapLIZIZ);
            }
        };
        c1113800f5e.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.REVISION_LIVE_GOAL, ((LiveGoalPreviewButtonRevisionWidget) this.l1).dataChannel);
    }

    public final void LIZ$1() {
        LiveMode liveMode;
        DataChannel dataChannel = ((LiveGoalRevisionPreviewWidget) this.l1).dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null || !C354201Zc.LJFF(liveMode)) {
            return;
        }
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C785230UrB c785230UrB = new C785230UrB(((LiveGoalRevisionPreviewWidget) this.l1).contentView);
        c785230UrB.LJIJJ = C497740JfY.LJIJI(2131852621);
        final String str = this.s0;
        c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0JlN
            @Override // X.InterfaceC254600ye
            public final void onShow() {
                C20337914i1<Map<String, Boolean>> c20337914i1 = C0UKZ.LLILLJJLI;
                Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
                mapLIZIZ.put(str, Boolean.TRUE);
                c20337914i1.LJFF(mapLIZIZ);
            }
        };
        c1113800f5e.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.REVISION_LIVE_GOAL, ((LiveGoalRevisionPreviewWidget) this.l1).dataChannel);
    }

    public final void LIZ$2() {
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C785230UrB c785230UrB = new C785230UrB(((PreviewSettingWidget) this.l1).contentView);
        c785230UrB.LJIJJ = C497740JfY.LJIJI(2131856059);
        final String str = this.s0;
        c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0JjZ
            @Override // X.InterfaceC254600ye
            public final void onShow() {
                C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC1106030et7.s9;
                Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
                mapLIZIZ.put(str, Boolean.TRUE);
                c20337914i1.LJFF(mapLIZIZ);
            }
        };
        c1113800f5e.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.PREVIEW_SETTING_VISIBLE_SCOPE_BUBBLE, ((PreviewSettingWidget) this.l1).dataChannel);
    }

    public final void LIZ$3() {
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C785230UrB c785230UrB = new C785230UrB(((PreviewSettingWidget) this.l1).contentView);
        c785230UrB.LJIJJ = this.s0;
        c785230UrB.LJIILL = new C521980KdY((PreviewSettingWidget) this.l1, 1);
        c1113800f5e.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.SHOW_LOCATION_IN_PREVIEW, ((PreviewSettingWidget) this.l1).dataChannel);
    }

    public final void LIZ$4() {
        View view = ((PlayCardFeedCellV2) this.l1).itemView;
        if (!view.isShown() || view.getVisibility() != 0 || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        Rect rect = new Rect();
        if (view.getLocalVisibleRect(rect)) {
            int iWidth = rect.width();
            if (iWidth < 0) {
                iWidth = 0;
            }
            int iHeight = rect.height();
            if (iHeight < 0) {
                iHeight = 0;
            }
            if (iWidth <= 0 || iHeight <= 0) {
                return;
            }
            long j = ((long) iWidth) * ((long) iHeight);
            long width = ((long) view.getWidth()) * ((long) view.getHeight());
            if (width <= 0 || j / width <= 0.0d) {
                return;
            }
            ((PlayCardFeedCellV2) this.l1).c6(this.s0);
        }
    }

    public final void LIZ$5() {
        for (AbstractC498530Jgp abstractC498530Jgp : (ArrayList) ((C1117710fBx) this.l1).LLJJI.getBadgeManager().LJ) {
            if (abstractC498530Jgp instanceof C521110Kc9) {
                C521110Kc9 c521110Kc9 = (C521110Kc9) abstractC498530Jgp;
                C521210KcJ c521210KcJ = c521110Kc9.LJIJJ;
                if (c521210KcJ != null) {
                    c521210KcJ.LJJLIIIIJ = this.s0;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("change text animation: ");
                sbLIZ.append(this.s0);
                C20441214yg.LIZIZ("UserLevelPanel", C2188811AlT.LIZIZ(sbLIZ));
                C521210KcJ c521210KcJ2 = c521110Kc9.LJIJJ;
                if (c521210KcJ2 != null) {
                    c521210KcJ2.LJJLI = 0;
                    c521210KcJ2.LJJL = 255;
                    ((ValueAnimator) c521210KcJ2.LJJLIIIJL.getValue()).start();
                    ((ValueAnimator) c521210KcJ2.LJJLIIIJJIZ.getValue()).start();
                }
            }
        }
    }

    public final void LIZ$6() {
        if (((RecyclerView) this.l1).getParent() == null) {
            return;
        }
        try {
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) this.l1).getLayoutManager();
            if (layoutManager == null) {
                C20441214yg.LJIIL(this.s0, "refreshRecyclerViewLayout: layoutManager is null");
                return;
            }
            int iFindFirstVisibleItemPosition = layoutManager instanceof GridLayoutManager ? ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition() : layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() : 0;
            String str = this.s0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refreshRecyclerViewLayout: saving position=");
            sbLIZ.append(iFindFirstVisibleItemPosition);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            ((RecyclerView) this.l1).getRecycledViewPool().clear();
            AbstractC21673619ry adapter = ((RecyclerView) this.l1).getAdapter();
            ((RecyclerView) this.l1).setAdapter(null);
            ((RecyclerView) this.l1).setAdapter(adapter);
            ((RecyclerView) this.l1).requestLayout();
            RecyclerView recyclerView = (RecyclerView) this.l1;
            HandlerHook.viewPost(recyclerView, new ARunnableS18S0101000_7(iFindFirstVisibleItemPosition, recyclerView, 7));
            C20441214yg.LIZIZ(this.s0, "refreshRecyclerViewLayout: layout refreshed");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF(this.s0, "refreshRecyclerViewLayout error", e);
        }
    }

    public static final void run$0(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGoalPreviewButtonRevisionWidget@4218.onShow$1");
        try {
            aRunnableS12S1100000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGoalPreviewButtonRevisionWidget@4218.onShow$1");
    }

    public static final void run$1(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGoalRevisionPreviewWidget@c07e.onShow$1");
        try {
            aRunnableS12S1100000_7.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGoalRevisionPreviewWidget@c07e.onShow$1");
    }

    public static final void run$10(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("RoomPlayerLogger@98b3.upload$1");
        try {
            ((C0IXA) aRunnableS12S1100000_7.l1).LJII(aRunnableS12S1100000_7.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RoomPlayerLogger@98b3.upload$1");
    }

    public static final void run$11(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("UserLevelPanel@7018.changeTextAnimator$runnable$1");
        try {
            aRunnableS12S1100000_7.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UserLevelPanel@7018.changeTextAnimator$runnable$1");
    }

    public static final void run$12(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("UserHelper@bc71.queryUserIfLogin$1");
        try {
            ((C0KXC) aRunnableS12S1100000_7.l1).LJ(aRunnableS12S1100000_7.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UserHelper@bc71.queryUserIfLogin$1");
    }

    public static final void run$13(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveDrawerDialogV3@d1bf.onTabVisible$1");
        try {
            LiveDrawerDialogV3 liveDrawerDialogV3 = (LiveDrawerDialogV3) aRunnableS12S1100000_7.l1;
            String str = aRunnableS12S1100000_7.s0;
            liveDrawerDialogV3.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_tab_name_show");
            c474500IjALIZ.LJIJJLI(liveDrawerDialogV3.LLJJIII);
            c474500IjALIZ.LJJII(str, "tab_type");
            if (Intrinsics.LJFF(str, "auction")) {
                c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
            }
            c474500IjALIZ.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveDrawerDialogV3@d1bf.onTabVisible$1");
    }

    public static final void run$14(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        int iIntValue;
        C1C7U.LIZ("LiveInnerFlowDowngradePipeline@6461.registerDowngradeReceiver$1");
        try {
            InterfaceC482090IvP interfaceC482090IvP = (InterfaceC482090IvP) aRunnableS12S1100000_7.l1;
            Integer num = (Integer) ((LinkedHashMap) LiveInnerFlowDowngradePipeline.LIZJ).get(aRunnableS12S1100000_7.s0);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            interfaceC482090IvP.LIZ(new C0IS4(iIntValue, -1, C2097608Jq.LJ(), null, false, 48));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveInnerFlowDowngradePipeline@6461.registerDowngradeReceiver$1");
    }

    public static final void run$15(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("SubPrivilegeDetailFullPage@8e7b.uploadBitmapToUrl$1$onLoadSuccess$2");
        try {
            ((Function1) aRunnableS12S1100000_7.l1).invoke(aRunnableS12S1100000_7.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubPrivilegeDetailFullPage@8e7b.uploadBitmapToUrl$1$onLoadSuccess$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$16(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("PreloadManager@9c8d.createContainer$2");
        try {
            C1537060q6K.LJIIJJI(C1529590puH.LIZ, aRunnableS12S1100000_7.s0, "tiktok_promote_spark_biz", (C1537480q70) ((C259800zU) aRunnableS12S1100000_7.l1).element, null, true, null, 40);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadManager@9c8d.createContainer$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$17(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("PreloadManager@9c8d.preloadPage$2");
        try {
            C1537060q6K.LJIIJJI(C1529590puH.LIZ, aRunnableS12S1100000_7.s0, "tiktok_promote_spark_biz", (C1537480q70) ((C259800zU) aRunnableS12S1100000_7.l1).element, null, true, null, 40);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadManager@9c8d.preloadPage$2");
    }

    public static final void run$18(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("ConfigurationChangeHelper@6c65.refreshRecyclerViewLayout$1");
        try {
            aRunnableS12S1100000_7.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ConfigurationChangeHelper@6c65.refreshRecyclerViewLayout$1");
    }

    public static final void run$2(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewSettingWidget@ad1d.onShow$4");
        try {
            PreviewSettingWidget previewSettingWidget = (PreviewSettingWidget) aRunnableS12S1100000_7.l1;
            DataChannel dataChannel = previewSettingWidget.dataChannel;
            if (dataChannel != null) {
                dataChannel.EQ2(previewSettingWidget, PreviewBottomBubbleShowEvent.class, new AwS121S1100000_7(previewSettingWidget, aRunnableS12S1100000_7.s0, 0));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewSettingWidget@ad1d.onShow$4");
    }

    public static final void run$3(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewSettingWidget@ad1d.onShow$6");
        try {
            aRunnableS12S1100000_7.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewSettingWidget@ad1d.onShow$6");
    }

    public static final void run$4(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewSettingWidget@ad1d.onShow$7");
        try {
            aRunnableS12S1100000_7.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewSettingWidget@ad1d.onShow$7");
    }

    public static final void run$5(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("PlayCardFeedCellV2@6bc1.onItemShow$1");
        try {
            aRunnableS12S1100000_7.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayCardFeedCellV2@6bc1.onItemShow$1");
    }

    public static final void run$6(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("TopLiveBubbleManager@e3c2.show$1");
        try {
            ((C482800IwY) aRunnableS12S1100000_7.l1).LJJII(aRunnableS12S1100000_7.s0, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TopLiveBubbleManager@e3c2.show$1");
    }

    public static final void run$7(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("SwitchDefinitionTipsWidget@a4ce.showToast$1");
        try {
            C766270U4b.LJIIJJI(aRunnableS12S1100000_7.s0);
            ((SwitchDefinitionTipsWidget) aRunnableS12S1100000_7.l1).LLILZ.run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SwitchDefinitionTipsWidget@a4ce.showToast$1");
    }

    public static final void run$8(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("DownloadReceiver@6dd4.autoRefreshUnsuccessDownloadTask$1");
        try {
            Intent intent = new Intent((Context) aRunnableS12S1100000_7.l1, (Class<?>) DownloadNotificationService.class);
            intent.setAction(aRunnableS12S1100000_7.s0);
            C786410Ut5.s3((Context) aRunnableS12S1100000_7.l1, intent);
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("DownloadReceiver@6dd4.autoRefreshUnsuccessDownloadTask$1");
    }

    public static final void run$9(ARunnableS12S1100000_7 aRunnableS12S1100000_7) {
        boolean zLIZ;
        C1C7U.LIZ("DownloadReceiver@6dd4.forceStopAllDownloadTask$1");
        try {
            Intent intent = new Intent((Context) aRunnableS12S1100000_7.l1, (Class<?>) DownloadNotificationService.class);
            intent.setAction(aRunnableS12S1100000_7.s0);
            C786410Ut5.s3((Context) aRunnableS12S1100000_7.l1, intent);
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("DownloadReceiver@6dd4.forceStopAllDownloadTask$1");
    }

    public ARunnableS12S1100000_7(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
