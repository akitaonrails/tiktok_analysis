package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.livesdk.broadcast.LiveGoalFeatureEnableChannel;
import com.bytedance.android.livesdk.broadcast.LivePreviewWidgetsLoaded;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewApplyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCustomPollWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDescriptionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewFansClubWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewFilterStyleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPromoteWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.PreviewLevelUpNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livegoal.PreviewLiveGoalEffectWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livepro.PreviewLiveProNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livevoice.PreviewLiveVoiceMicListWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewCommonNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.comp.api.decoration.ILiveEventStickerService;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LevelupNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEventStickerDraggingChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveSimplifiedVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayEnableChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorHashTagHideSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyDownloadOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UJJ extends C0ULK implements InterfaceC1141530foN {
    public C20516015Pq LLILLL;
    public C20516015Pq LLILZ;
    public C20516015Pq LLILZIL;
    public C20516015Pq LLILZLL;
    public C20516015Pq LLIZ;
    public C20516015Pq LLIZLLLIL;
    public C20516015Pq LLJ;
    public C20516015Pq LLJI;
    public C20516015Pq LLJIJIL;
    public C20516015Pq LLJILJIL;
    public C20516015Pq LLJILJILJ;
    public C20516015Pq LLJILLL;
    public C20516015Pq LLJJ;
    public C426160GnO LLJJI;
    public C20516015Pq LLJJIII;
    public C20516015Pq LLJJIJI;
    public C20516015Pq LLJJIJIIJIL;
    public C20516015Pq LLJJIJIL;
    public C20516015Pq LLJJJ;
    public C20516015Pq LLJJJIL;
    public C20516015Pq LLJJJJ;
    public C20516015Pq LLJJJJJIL;
    public C20516015Pq LLJJJJLIIL;
    public C20516015Pq LLJJL;
    public final DataChannel LLJJLIIIJLLLLLLLZ;
    public final ViewGroup LLJL;
    public final Set<Integer> LLJLIL;
    public C20516015Pq LLJLILLLLZIIL;

    static {
        ((ISlotService) C1161920gLG.LIZJ(ISlotService.class)).registerSlot(new C756670TmD());
    }

    @Override // X.C0ULK
    public final void LIZJ() {
        DataChannel dataChannel = this.LLJJLIIIJLLLLLLLZ;
        if (dataChannel != null) {
            dataChannel.FQ2(LivePreviewWidgetsLoaded.class);
        }
    }

    @Override // X.C0ULK
    public final void LIZLLL() {
        Pair pair;
        DataChannel dataChannel = this.LLJJLIIIJLLLLLLLZ;
        if (C500260Jjc.LJJIJIIJIL((dataChannel == null || (pair = (Pair) dataChannel.gg0(StartLiveSuccessChannel.class)) == null) ? null : (Boolean) pair.getFirst())) {
            C774610Ua3.LL.LLLZZIL(false);
            C768460UCm.LIZIZ().release();
            ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).K42();
            ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).releaseGalleryModule();
            C781270Ukn.LJI().releasePanelResource(false);
            if (!LiveBeautyDownloadOptSetting.INSTANCE.inExperiment()) {
                ((C0U79) C781270Ukn.LJI().getLiveEffectRestoreManager()).LIZ(this.LLJJLIIIJLLLLLLLZ);
            }
            C768460UCm.LIZJ().release();
            C768460UCm.LJFF();
            C767120U7i.LIZLLL(true);
            C768460UCm.LJII().release(false);
            C760080Tri.LIZ();
        }
        C1548820qPI.LJIIIIZZ("live_goal_update_event", this);
        C0UKJ.LIZIZ();
        if (LinkmicVoiceChatLayoutSetting.INSTANCE.getValue().optPreviewWidget && LiveAbLabelSetting.INSTANCE.getBooleanValue("linkmic_sdk_layout_refactor_voice")) {
            C0UKC.LIZLLL(C13LE.LIZ(PreviewLiveVoiceMicListWidget.class));
            C0UKC.LJI(C13LE.LIZ(PreviewLiveVoiceMicListWidget.class));
        }
    }

    @Override // X.C0ULK
    public final void LJ() {
        C0UKC.LIZ(C13LE.LIZ(PreviewCoverWidget.class), getCoverWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCloseWidget.class), getCloseWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewTitleWidget.class), getTitleWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewDescriptionWidget.class), getDescriptionWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCommonNotifyWidget.class), getNotifyContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewReplayWidget.class), getReplayContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(ReplayEnableChannel.class)}, true);
        if (!((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount()) {
            C0UKC.LIZ(C13LE.LIZ(PreviewShareWidget.class), getShareWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewSettingWidget.class), getSettingWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        DataChannel dataChannel = this.LLJJLIIIJLLLLLLLZ;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(LiveGoalFeatureEnableChannel.class), Boolean.TRUE)) {
            LJIIIIZZ();
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewLevelUpNotifyWidget.class), getAnchorLevelUpNotifyContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewLiveProNotifyWidget.class), getLiveProNotifyContainerFromXml(), new C13IQ[]{C13LE.LIZ(LevelupNotifyBannerChannel.class), C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewLiveCenterWidget.class), getLiveEventsWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewStartLiveWidget.class), getStartLiveContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewApplyWidget.class), getApplyWidgetContainerFromXml(), new C13IQ[0], true);
        PreviewApplyWidget previewApplyWidget = (PreviewApplyWidget) C0UKC.LJFF(C13LE.LIZ(PreviewApplyWidget.class));
        if (previewApplyWidget != null) {
            previewApplyWidget.LLJ = getFlowLayoutFromXml();
        }
        C19719912Dl c19719912DlJc1 = ((ILiveEventStickerService) C781270Ukn.LJJIIZ.getValue()).Jc1();
        if ((c19719912DlJc1 instanceof C13IQ) && c19719912DlJc1 != null) {
            C0UKC.LIZ(c19719912DlJc1, getLiveEventStickerContainerFromXml(), new C13IQ[0], true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewSubscriptionWidget.class), getSubscribeWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewFansClubWidget.class), getFansClubWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UFE c0ufeLIZ = C753070TgP.LIZ(this.LLJJLIIIJLLLLLLLZ);
        C0UFE c0ufe = C0UFE.ON;
        if (c0ufeLIZ == c0ufe) {
            C0UKC.LIZ(C13LE.LIZ(PreviewCustomPollWidget.class), getCustomWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewFilterStyleWidget.class), getFilterStyleContainerFromXml(), new C13IQ[0], true);
        if (LiveAnchorHashTagHideSetting.INSTANCE.enable()) {
            C500260Jjc.LJIILIIL(getHashtagContainerFromXml());
        } else {
            C19719912Dl c19719912DlRH = C781270Ukn.LJIIIZ().RH();
            if ((c19719912DlRH instanceof C13IQ) && c19719912DlRH != null) {
                C0UKC.LIZ(c19719912DlRH, getHashtagContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class)}, true);
            }
        }
        C500260Jjc.LJLJLJ(getBusinessWidgetContainerFromXml(), false);
        if (C753070TgP.LIZIZ(this.LLJJLIIIJLLLLLLLZ) == c0ufe) {
            C0UKC.LIZ(C13LE.LIZ(PreviewPromoteWidget.class), getPromoteWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        }
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            C0UKC.LIZ(C13LE.LIZ(PreviewLiveGoalEffectWidget.class), getLiveGoalEffectContainerFromXml(), new C13IQ[]{C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewLiveVoiceMicListWidget.class), this.LLJLILLLLZIIL, new C13IQ[0], true);
    }

    public final void LJII() {
        C0UKC.LIZ(C13LE.LIZ(LiveGoalPreviewWidget.class), getStreamGoalFirstLineContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(LiveGoalVisibilityChannel.class)}, true);
    }

    public final void LJIIIIZZ() {
        DataChannel dataChannel = this.LLJJLIIIJLLLLLLLZ;
        if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(LiveGoalFeatureEnableChannel.class), Boolean.FALSE)) {
            if (!LiveLOP0OptSetting.INSTANCE.enable()) {
                LJII();
            } else if (C753070TgP.LJFF(this.LLJJLIIIJLLLLLLLZ, AFwS245S0000000_12.get$arr$(129), null) == C0UFE.ON) {
                LJII();
            } else {
                C500260Jjc.LJIILIIL(getStreamGoalFirstLineContainerFromXml());
            }
        }
    }

    public final C20516015Pq getAnchorLevelUpNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b0s);
            this.LLJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getApplyWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b7_);
            this.LLJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBusinessWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6f);
            this.LLJJJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCloseWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e2y);
            this.LLILZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCoverWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f5x);
            this.LLILLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCustomWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fdt);
            this.LLJJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getDescriptionWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fpk);
            this.LLILZLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getFansClubWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ho4);
            this.LLJJIJIIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getFilterStyleContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hye);
            this.LLJJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C426160GnO getFlowLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.idc);
            this.LLJJI = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final C20516015Pq getHashtagContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jgy);
            this.LLJJJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveEventStickerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mxm);
            this.LLJJIII = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveEventsWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mxs);
            this.LLJILJILJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveGoalEffectContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.myo);
            this.LLJJJJLIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveProNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n4d);
            this.LLJILJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pfn);
            this.LLIZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPromoteWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.s_u);
            this.LLJJJJJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getReplayContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t72);
            this.LLIZLLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getSettingWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uvz);
            this.LLJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getShareWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v30);
            this.LLJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStartLiveContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vyx);
            this.LLJILLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStreamGoalFirstLineContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wao);
            this.LLJJL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getSubscribeWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wil);
            this.LLJJIJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getTitleWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y3r);
            this.LLILZIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public C0UJJ(Fragment fragment) {
        int iIntValue;
        boolean z;
        Room room;
        super(fragment.requireContext(), R.layout.hih);
        DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        this.LLJJLIIIJLLLLLLLZ = dataChannelLJ;
        this.LLJL = (ViewGroup) findViewById(R.id.ax2);
        this.LLJLIL = new LinkedHashSet();
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
            C0UFI.LIZJ = dataChannelLJ;
            C0UFI.LIZLLL = true;
            if (dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                z = true;
            } else {
                z = false;
            }
            C0UFI.LJI(AFwS245S0000000_12.get$arr$(6), z);
            C768460UCm.LIZLLL();
            C766720U5u.LJIIJ(this.LLJJLIIIJLLLLLLLZ);
        }
        findViewById(R.id.uu7);
        this.LLJLILLLLZIIL = (C20516015Pq) findViewById(R.id.m_n);
        View viewFindViewById = findViewById(R.id.voice_cover_mask);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c95, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        viewFindViewById.setBackgroundColor(iIntValue);
        C1548820qPI.LIZLLL("live_goal_update_event", this);
        if (dataChannelLJ != null) {
            String str = (String) dataChannelLJ.gg0(C0UJD.class);
            if (str != null && str.length() != 0) {
                C781270Ukn.LJI().getLiveGoalEffectHelper();
                C0UFI.LJIILL();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0UJH(str, null), 3);
            }
            dataChannelLJ.BQ2(fragment, LiveGoalFeatureEnableChannel.class, new AwS591S0100000_12(this, 858));
            dataChannelLJ.BQ2(fragment, LiveEventStickerDraggingChannel.class, new AwS591S0100000_12(this, 859));
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        Room room;
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_goal_update_event") && (interfaceC1107590evd = c262100zr.LIZIZ) != null) {
            C0U6C liveGoalEffectHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
            boolean z = false;
            if (C1871910yoP.LIZIZ(interfaceC1107590evd, "isQuit", false)) {
                ((C0UFI) liveGoalEffectHelper).LJIILLIIL();
                return;
            }
            if (C1871910yoP.LIZLLL(interfaceC1107590evd, "live_goal_background_position", 0) == 0) {
                ((C0UFI) liveGoalEffectHelper).LJIIJJI();
            } else {
                C0UFI.LJJIFFI();
                C0UFI.LJJI();
            }
            DataChannel dataChannel = this.LLJJLIIIJLLLLLLLZ;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                z = true;
            }
            liveGoalEffectHelper.getClass();
            C0UFI.LJI(AFwS245S0000000_12.get$arr$(9), z);
            C0UFI.LJ = null;
        }
    }

    public final void setAnchorLevelUpNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJIJIL = c20516015Pq;
    }

    public final void setApplyWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJ = c20516015Pq;
    }

    public final void setBusinessWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJ = c20516015Pq;
    }

    public final void setCloseWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZ = c20516015Pq;
    }

    public final void setCoverWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILLL = c20516015Pq;
    }

    public final void setCustomWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJIL = c20516015Pq;
    }

    public final void setDescriptionWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZLL = c20516015Pq;
    }

    public final void setFansClubWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJIIJIL = c20516015Pq;
    }

    public final void setFilterStyleContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJ = c20516015Pq;
    }

    public final void setFlowLayoutFromXml(C426160GnO c426160GnO) {
        this.LLJJI = c426160GnO;
    }

    public final void setHashtagContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJIL = c20516015Pq;
    }

    public final void setLiveEventStickerContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIII = c20516015Pq;
    }

    public final void setLiveEventsWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILJILJ = c20516015Pq;
    }

    public final void setLiveGoalEffectContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJLIIL = c20516015Pq;
    }

    public final void setLiveProNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILJIL = c20516015Pq;
    }

    public final void setNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZ = c20516015Pq;
    }

    public final void setPromoteWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJJIL = c20516015Pq;
    }

    public final void setReplayContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZLLLIL = c20516015Pq;
    }

    public final void setSettingWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJI = c20516015Pq;
    }

    public final void setShareWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJ = c20516015Pq;
    }

    public final void setStartLiveContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILLL = c20516015Pq;
    }

    public final void setStreamGoalFirstLineContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJL = c20516015Pq;
    }

    public final void setSubscribeWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJI = c20516015Pq;
    }

    public final void setTitleWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZIL = c20516015Pq;
    }
}
