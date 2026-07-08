package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.PreviewCoverEditVisibilityChannel;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.livesdk.broadcast.LivePreviewWidgetsLoaded;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCoverEditWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCustomPollRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDescriptionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewFilterStyleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPromoteRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionCoverTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionCustomBaseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewVoiceRevisionCustomFiveWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewVoiceRevisionCustomFourWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewVoiceRevisionCustomOneWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewVoiceRevisionCustomThreeWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewVoiceRevisionCustomTwoWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livegoal.PreviewLiveGoalEffectWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livevoice.PreviewLiveVoiceMicListWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewBannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewCampaignCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewDecouplingCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewLIVECenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.upsell.PreviewFansClubRevisionWidget;
import com.bytedance.android.livesdk.comp.api.decoration.ILiveEventStickerService;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEventStickerDraggingChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveSimplifiedVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewNonSimpleModeComponentChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorHashTagHideSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyDownloadOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AFwS296S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.BottomContainerComponent;

/* JADX INFO: renamed from: X.0UJM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UJM extends C0ULK implements InterfaceC1141530foN {
    public C20516015Pq LLILLL;
    public C20516015Pq LLILZ;
    public C20516015Pq LLILZIL;
    public C20516015Pq LLILZLL;
    public C20516015Pq LLIZ;
    public C20516015Pq LLIZLLLIL;
    public C20516015Pq LLJ;
    public C20516015Pq LLJI;
    public C20516015Pq LLJIJIL;
    public final DataChannel LLJILJIL;
    public final ViewGroup LLJILJILJ;
    public final Set<Integer> LLJILLL;
    public C20516015Pq LLJJ;
    public C20516015Pq LLJJI;
    public C20516015Pq LLJJIII;
    public C20516015Pq LLJJIJI;
    public C20516015Pq LLJJIJIIJIL;
    public C426160GnO LLJJIJIL;
    public C20516015Pq LLJJJ;
    public C20516015Pq LLJJJIL;
    public final ViewGroup LLJJJJ;
    public ConstraintLayout LLJJJJJIL;
    public int LLJJJJLIIL;
    public final List<C13IQ<? extends PreviewWidget>> LLJJL;

    static {
        ((ISlotService) C1161920gLG.LIZJ(ISlotService.class)).registerSlot(new C756670TmD());
    }

    @Override // X.C0ULK
    public final void LIZJ() {
        DataChannel dataChannel = this.LLJILJIL;
        if (dataChannel != null) {
            dataChannel.FQ2(LivePreviewWidgetsLoaded.class);
        }
    }

    @Override // X.C0ULK
    public final void LIZLLL() {
        Pair pair;
        DataChannel dataChannel = this.LLJILJIL;
        if (C500260Jjc.LJJIJIIJIL((dataChannel == null || (pair = (Pair) dataChannel.gg0(StartLiveSuccessChannel.class)) == null) ? null : (Boolean) pair.getFirst())) {
            C774610Ua3.LL.LLLZZIL(false);
            C768460UCm.LIZIZ().release();
            ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).K42();
            ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).releaseGalleryModule();
            C781270Ukn.LJI().releasePanelResource(false);
            if (!LiveBeautyDownloadOptSetting.INSTANCE.inExperiment()) {
                ((C0U79) C781270Ukn.LJI().getLiveEffectRestoreManager()).LIZ(this.LLJILJIL);
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
        C0UKC.LIZ(C13LE.LIZ(PreviewDecouplingCenterWidget.class), this.LLJJIII, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCampaignCenterWidget.class), this.LLJJIJI, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewLIVECenterWidget.class), this.LLJJIJIIJIL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewBannerWidget.class), this.LLJJI, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewNonSimpleModeComponentChannel.class)}, true);
        AFwS296S0000000_12.get$arr$(11).invoke(Integer.valueOf(C20736316Cj.LIZIZ(R.attr.ep5, getContext())), null);
        ConstraintLayout constraintLayout = this.LLJJJJJIL;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundResource(R.drawable.f_l);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewTitleWidget.class), getTitleWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewDescriptionWidget.class), getDescriptionWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
        LJII(false, null);
        C0UKC.LIZ(C13LE.LIZ(PreviewStartLiveWidget.class), getStartLiveContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewRevisionCoverTitleWidget.class), this.LLJJJ, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCoverEditWidget.class), this.LLJJJIL, new C13IQ[0], true);
        C19719912Dl c19719912DlJc1 = ((ILiveEventStickerService) C781270Ukn.LJJIIZ.getValue()).Jc1();
        if ((c19719912DlJc1 instanceof C13IQ) && c19719912DlJc1 != null) {
            C0UKC.LIZ(c19719912DlJc1, getLiveEventStickerContainerFromXml(), new C13IQ[0], true);
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
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            C0UKC.LIZ(C13LE.LIZ(PreviewLiveGoalEffectWidget.class), getLiveGoalEffectContainerFromXml(), new C13IQ[]{C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewLiveVoiceMicListWidget.class), this.LLJJ, new C13IQ[0], true);
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

    public final C20516015Pq getDescriptionWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fpk);
            this.LLILZLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getFilterStyleContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hye);
            this.LLJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getHashtagContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jgy);
            this.LLJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveEventStickerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mxm);
            this.LLIZLLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveGoalEffectContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.myo);
            this.LLJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStartLiveContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vyx);
            this.LLIZ = (C20516015Pq) callbackFindViewById;
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

    private final C426160GnO getFlowLayout() {
        return this.LLJJIJIL;
    }

    public C0UJM(Fragment fragment) {
        boolean z;
        int iIntValue;
        boolean z2;
        Room room;
        super(fragment.requireContext(), R.layout.hii);
        DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        this.LLJILJIL = dataChannelLJ;
        this.LLJILJILJ = (ViewGroup) findViewById(R.id.ax2);
        this.LLJILLL = new LinkedHashSet();
        this.LLJJJJ = (ViewGroup) findViewById(R.id.ax2);
        this.LLJJL = new ArrayList();
        if (C753070TgP.LIZIZ(dataChannelLJ) == C0UFE.ON) {
            z = true;
        } else {
            z = false;
        }
        C0UJN.LIZJ = z;
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
            C0UFI.LIZJ = dataChannelLJ;
            C0UFI.LIZLLL = true;
            if (dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C0UFI.LJI(AFwS245S0000000_12.get$arr$(6), z2);
            C768460UCm.LIZLLL();
            C766720U5u.LJIIJ(this.LLJILJIL);
        }
        C500260Jjc.LJJZ(C497740JfY.LJIJ(), findViewById(R.id.w0u));
        this.LLJJI = (C20516015Pq) findViewById(R.id.brb);
        this.LLJJIII = (C20516015Pq) findViewById(R.id.mw5);
        this.LLJJIJI = (C20516015Pq) findViewById(R.id.d_y);
        this.LLJJIJIIJIL = (C20516015Pq) findViewById(R.id.mvj);
        this.LLJJIJIL = (C426160GnO) findViewById(R.id.weak_flow_layout);
        this.LLJJJJJIL = (ConstraintLayout) findViewById(R.id.pxh);
        this.LLJJJ = (C20516015Pq) findViewById(R.id.f5o);
        findViewById(R.id.uu7);
        this.LLJJ = (C20516015Pq) findViewById(R.id.m_n);
        this.LLJJJIL = (C20516015Pq) findViewById(R.id.f54);
        View viewFindViewById = findViewById(R.id.voice_cover_mask);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c95, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        viewFindViewById.setBackgroundColor(iIntValue);
        C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ())) - 28), this.LLJJIJIL);
        C1548820qPI.LIZLLL("live_goal_update_event", this);
        if (dataChannelLJ != null) {
            String str = (String) dataChannelLJ.gg0(C0UJD.class);
            if (str != null && str.length() != 0) {
                C781270Ukn.LJI().getLiveGoalEffectHelper();
                C0UFI.LJIILL();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0UJI(str, null), 3);
            }
            dataChannelLJ.BQ2(fragment, LiveEventStickerDraggingChannel.class, new AwS591S0100000_12(this, 860));
            dataChannelLJ.BQ2(fragment, PreviewCoverEditVisibilityChannel.class, new AwS591S0100000_12(this, 861));
            dataChannelLJ.EQ2(fragment, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 862));
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
            DataChannel dataChannel = this.LLJILJIL;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                z = true;
            }
            liveGoalEffectHelper.getClass();
            C0UFI.LJI(AFwS245S0000000_12.get$arr$(9), z);
            C0UFI.LJ = null;
        }
    }

    public final void setCloseWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZ = c20516015Pq;
    }

    public final void setCoverWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILLL = c20516015Pq;
    }

    public final void setDescriptionWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZLL = c20516015Pq;
    }

    public final void setFilterStyleContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJ = c20516015Pq;
    }

    public final void setHashtagContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJI = c20516015Pq;
    }

    public final void setLiveEventStickerContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZLLLIL = c20516015Pq;
    }

    public final void setLiveGoalEffectContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJIJIL = c20516015Pq;
    }

    public final void setStartLiveContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZ = c20516015Pq;
    }

    public final void setTitleWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZIL = c20516015Pq;
    }

    public final void LJII(boolean z, List list) {
        int iLIZ;
        C426160GnO flowLayout;
        this.LLJJJJLIIL = 0;
        if (!z && (flowLayout = getFlowLayout()) != null) {
            C786410Ut5.LJJJJZ(flowLayout);
        }
        if (list == null || list.isEmpty()) {
            list = C0UJN.LIZIZ();
        }
        ((LinkedHashMap) C0UJN.LIZIZ).clear();
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    BottomContainerComponent bottomContainerComponent = (BottomContainerComponent) obj;
                    C20516015Pq c20516015Pq = new C20516015Pq(getContext(), null, 6);
                    C426160GnO flowLayout2 = getFlowLayout();
                    if (flowLayout2 != null) {
                        int i3 = bottomContainerComponent.type;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        if (i3 != 8 && i3 != 15 && i3 != 21) {
                            iLIZ = C439101nJ.LIZ(16);
                        } else {
                            iLIZ = 0;
                        }
                        layoutParams.topMargin = iLIZ;
                        flowLayout2.addView(c20516015Pq, layoutParams);
                    }
                    if (C0UJN.LIZ.contains(Integer.valueOf(bottomContainerComponent.type))) {
                        int i4 = bottomContainerComponent.type;
                        if (i4 != 7) {
                            if (i4 != 11) {
                                if (i4 != 17) {
                                    if (i4 != 23) {
                                        if (i4 != 14) {
                                            if (i4 == 15 && C753070TgP.LIZIZ(this.LLJILJIL) == C0UFE.ON) {
                                                C0UKC.LIZ(C13LE.LIZ(PreviewPromoteRevisionWidget.class), c20516015Pq, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                                                ((ArrayList) this.LLJJL).add(C13LE.LIZ(PreviewPromoteRevisionWidget.class));
                                            }
                                        } else {
                                            C0UKC.LIZ(C13LE.LIZ(PreviewSubscriptionRevisionWidget.class), c20516015Pq, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                                            ((ArrayList) this.LLJJL).add(C13LE.LIZ(PreviewSubscriptionRevisionWidget.class));
                                        }
                                    } else {
                                        C0UKC.LIZ(C13LE.LIZ(PreviewFansClubRevisionWidget.class), c20516015Pq, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                                        ((ArrayList) this.LLJJL).add(C13LE.LIZ(PreviewFansClubRevisionWidget.class));
                                    }
                                } else {
                                    C0UKC.LIZ(C13LE.LIZ(PreviewCustomPollRevisionWidget.class), c20516015Pq, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                                    ((ArrayList) this.LLJJL).add(C13LE.LIZ(PreviewCustomPollRevisionWidget.class));
                                }
                            } else {
                                C0UKC.LIZ(C13LE.LIZ(PreviewShareRevisionWidget.class), c20516015Pq, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                                ((ArrayList) this.LLJJL).add(C13LE.LIZ(PreviewShareRevisionWidget.class));
                            }
                        } else {
                            C0UKC.LIZ(C13LE.LIZ(PreviewSettingRevisionWidget.class), c20516015Pq, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                            ((ArrayList) this.LLJJL).add(C13LE.LIZ(PreviewSettingRevisionWidget.class));
                        }
                    } else {
                        int i5 = this.LLJJJJLIIL;
                        if (i5 == 0) {
                            C0UJN.LIZIZ.put(1, Integer.valueOf(bottomContainerComponent.type));
                            C0UKC.LIZ(C13LE.LIZ(PreviewVoiceRevisionCustomOneWidget.class), c20516015Pq, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                            PreviewRevisionCustomBaseWidget previewRevisionCustomBaseWidget = (PreviewRevisionCustomBaseWidget) C0UKC.LJFF(C13LE.LIZ(PreviewVoiceRevisionCustomOneWidget.class));
                            if (previewRevisionCustomBaseWidget != null) {
                                previewRevisionCustomBaseWidget.LLILZLL = bottomContainerComponent.type;
                            }
                            ((ArrayList) this.LLJJL).add(C13LE.LIZ(PreviewVoiceRevisionCustomOneWidget.class));
                        } else if (i5 == 1) {
                            C0UJN.LIZIZ.put(2, Integer.valueOf(bottomContainerComponent.type));
                            C0UKC.LIZ(C13LE.LIZ(PreviewVoiceRevisionCustomTwoWidget.class), c20516015Pq, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                            PreviewRevisionCustomBaseWidget previewRevisionCustomBaseWidget2 = (PreviewRevisionCustomBaseWidget) C0UKC.LJFF(C13LE.LIZ(PreviewVoiceRevisionCustomTwoWidget.class));
                            if (previewRevisionCustomBaseWidget2 != null) {
                                previewRevisionCustomBaseWidget2.LLILZLL = bottomContainerComponent.type;
                            }
                            ((ArrayList) this.LLJJL).add(C13LE.LIZ(PreviewVoiceRevisionCustomTwoWidget.class));
                        } else if (i5 == 2) {
                            C0UJN.LIZIZ.put(3, Integer.valueOf(bottomContainerComponent.type));
                            C0UKC.LIZ(C13LE.LIZ(PreviewVoiceRevisionCustomThreeWidget.class), c20516015Pq, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                            PreviewRevisionCustomBaseWidget previewRevisionCustomBaseWidget3 = (PreviewRevisionCustomBaseWidget) C0UKC.LJFF(C13LE.LIZ(PreviewVoiceRevisionCustomThreeWidget.class));
                            if (previewRevisionCustomBaseWidget3 != null) {
                                previewRevisionCustomBaseWidget3.LLILZLL = bottomContainerComponent.type;
                            }
                            ((ArrayList) this.LLJJL).add(C13LE.LIZ(PreviewVoiceRevisionCustomThreeWidget.class));
                        } else if (i5 == 3) {
                            C0UJN.LIZIZ.put(4, Integer.valueOf(bottomContainerComponent.type));
                            C0UKC.LIZ(C13LE.LIZ(PreviewVoiceRevisionCustomFourWidget.class), c20516015Pq, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                            PreviewRevisionCustomBaseWidget previewRevisionCustomBaseWidget4 = (PreviewRevisionCustomBaseWidget) C0UKC.LJFF(C13LE.LIZ(PreviewVoiceRevisionCustomFourWidget.class));
                            if (previewRevisionCustomBaseWidget4 != null) {
                                previewRevisionCustomBaseWidget4.LLILZLL = bottomContainerComponent.type;
                            }
                            ((ArrayList) this.LLJJL).add(C13LE.LIZ(PreviewVoiceRevisionCustomFourWidget.class));
                        } else if (i5 == 4) {
                            C0UJN.LIZIZ.put(5, Integer.valueOf(bottomContainerComponent.type));
                            C0UKC.LIZ(C13LE.LIZ(PreviewVoiceRevisionCustomFiveWidget.class), c20516015Pq, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
                            PreviewRevisionCustomBaseWidget previewRevisionCustomBaseWidget5 = (PreviewRevisionCustomBaseWidget) C0UKC.LJFF(C13LE.LIZ(PreviewVoiceRevisionCustomFiveWidget.class));
                            if (previewRevisionCustomBaseWidget5 != null) {
                                previewRevisionCustomBaseWidget5.LLILZLL = bottomContainerComponent.type;
                            }
                            ((ArrayList) this.LLJJL).add(C13LE.LIZ(PreviewVoiceRevisionCustomFiveWidget.class));
                        }
                        this.LLJJJJLIIL++;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
