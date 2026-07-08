package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS23S0101000_12;
import Y.ATListenerS446S0100000_12;
import Y.AfS181S0100000_12;
import android.app.Dialog;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.PreviewBoardPlaceHolderVisibility;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.broadcast.LiveGoalFeatureEnableChannel;
import com.bytedance.android.livesdk.broadcast.LivePreviewWidgetsLoaded;
import com.bytedance.android.livesdk.broadcast.PreviewHideLiveModeChannel;
import com.bytedance.android.livesdk.broadcast.PreviewMoreClickEvent;
import com.bytedance.android.livesdk.broadcast.RestartLiveChannel;
import com.bytedance.android.livesdk.broadcast.ShowExposureGuideAnimEvent;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.broadcast.preview.PreviewECommerceGrowthTaskWidget;
import com.bytedance.android.livesdk.broadcast.preview.PreviewLiveGrowthCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.PreviewLiveJourneyBannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewButtonWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewApplyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBeautyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBillboardOverlayWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCampaignWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCommercialWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCustomPollWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDecouplingWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDescriptionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewECIndependentWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewFansClubWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewFilterStyleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewIncentiveCampaignWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveDetailWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveGrowthMVPWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewMoreWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewMultiCoHostOffliveBannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewNotLOPNewCreatorWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewProbationBannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPromoteWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewReverseCameraWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerHintWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSubscriptionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewViewerWishesWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.boards.LiveBoardsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.PreviewLOPAgeAssuranceNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.PreviewLevelUpNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livegoal.PreviewLiveGoalEffectWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livepro.PreviewLiveProNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewCommonNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.playbook.PlaybookBannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.playbook.PreviewInteractWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.playbook.PreviewPlaybookWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.serviceplus.PreviewServicePlusWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.LiveTryModeUseTTLHSplitSetting;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.comp.api.decoration.ILiveEventStickerService;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BillboardOverlayVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.ECommerceGrowthTaskChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.IncentiveCampaignBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LOPAgeAssuranceNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LeaveVideoModeVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LevelupNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterGrowthBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEventStickerDraggingChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGrowthMVPBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveJourney2BannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveProNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveSimplifiedVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.MultiCoHostOffliveBannerVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.NewAnchorIncentiveChannel;
import com.bytedance.android.livesdk.dataChannel.PlaybookBannerOthersCanShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewBulletinEditVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewMoreLessVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewViolationVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.ProbationBannerChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayEnableChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayInfluenceBannerChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorHashTagHideSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveExposureOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewProbationSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.SupportBillboardOverlaySetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveAsiaBeautyGenderOpt;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectFaceDetectAllowlistSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalAnchorAccessControlSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePreviewMemLeakOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.HideEffectEntrySetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0UJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770200UJe extends C0ULK implements InterfaceC1141530foN {
    public final Fragment LLILLL;
    public ConstraintLayout LLILZ;
    public C426160GnO LLILZIL;
    public C20516015Pq LLILZLL;
    public C20516015Pq LLIZ;
    public ConstraintLayout LLIZLLLIL;
    public C20516015Pq LLJ;
    public C20516015Pq LLJI;
    public C20516015Pq LLJIJIL;
    public C20516015Pq LLJILJIL;
    public ConstraintLayout LLJILJILJ;
    public C20516015Pq LLJILLL;
    public C20516015Pq LLJJ;
    public C20516015Pq LLJJI;
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
    public C20516015Pq LLJJLIIIJLLLLLLLZ;
    public C20516015Pq LLJL;
    public C20516015Pq LLJLIL;
    public C20516015Pq LLJLILLLLZIIL;
    public C20516015Pq LLJLL;
    public C20516015Pq LLJLLIL;
    public C20516015Pq LLJLLL;
    public C20516015Pq LLJZ;
    public C20516015Pq LLJZIJLIL;
    public C20516015Pq LLL;
    public C20516015Pq LLLF;
    public C20516015Pq LLLFF;
    public C20516015Pq LLLFFI;
    public C20516015Pq LLLFZ;
    public FrameLayout LLLI;
    public C20516015Pq LLLII;
    public C20516015Pq LLLIIII;
    public C20516015Pq LLLIIIIL;
    public C20516015Pq LLLIIIL;
    public C20516015Pq LLLIIL;
    public C20516015Pq LLLIILIL;
    public C20516015Pq LLLIL;
    public C20516015Pq LLLILZ;
    public C20516015Pq LLLILZJ;
    public C20516015Pq LLLILZLLLI;
    public C20516015Pq LLLIZZ;
    public C20516015Pq LLLJ;
    public C20516015Pq LLLJIL;
    public C20516015Pq LLLJL;
    public C20516015Pq LLLL;
    public C20516015Pq LLLLII;
    public C20516015Pq LLLLIIIILLL;
    public C20516015Pq LLLLIIL;
    public C0UKT LLLLIILL;
    public C20516015Pq LLLLIILLL;
    public C20516015Pq LLLLIL;
    public final DataChannel LLLLILI;
    public boolean LLLLJ;
    public final C01GW LLLLJI;
    public final C1120000fFe LLLLL;
    public final ScaleGestureDetectorOnScaleGestureListenerC21656519pD LLLLLIL;
    public final C769230UFl LLLLLILLIL;
    public final C0UKN LLLLLJIL;
    public final InterfaceC767150U7l<? extends LiveEffect> LLLLLJLJLL;
    public long LLLLLL;
    public int LLLLLLIL;
    public boolean LLLLLLJ;
    public int LLLLLLL;
    public int LLLLLLLLL;
    public final ViewGroup LLLLLLLLLL;
    public C2185991Agv LLLLLLLZIL;
    public final C0UKK LLLLLLZ;
    public final View LLLLLLZZ;
    public final View LLLLLZ;
    public C11JF LLLLLZIL;
    public long LLLLLZL;
    public final C0UAL LLLLZ;
    public C20516015Pq LLLLZI;
    public final C770390UJx LLLLZIL;
    public float LLLLZLL;
    public float LLLLZLLIL;
    public boolean LLLLZLLLI;
    public AnonymousClass0956 LLLZ;
    public final ARunnableS112S0100000_12 LLLZI;
    public final C0UJ9 LLLZIIL;
    public String LLLZIL;
    public boolean LLLZL;
    public final AwS591S0100000_12 LLLZLL;

    private final C0UJY getLiveParamsListener() {
        return (C0UJY) this.LLLLJI.getValue();
    }

    @Override // X.C0ULK
    public final void LIZJ() {
        C0UOP c0uop;
        DataChannel dataChannel = this.LLLLILI;
        if (dataChannel != null && (c0uop = (C0UOP) dataChannel.gg0(C758410Tp1.class)) != null) {
            c0uop.LIZLLL = System.currentTimeMillis() - c0uop.LIZJ;
        }
        DataChannel dataChannel2 = this.LLLLILI;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(LivePreviewWidgetsLoaded.class);
        }
    }

    @Override // X.C0ULK
    public final void LIZLLL() {
        Pair pair;
        C770390UJx c770390UJx = this.LLLLZIL;
        if (c770390UJx != null) {
            ((C11NJ) c770390UJx.LIZ.getValue()).LJ();
        }
        ((HashMap) C0UI9.LIZIZ).clear();
        C0UI9.LIZ().clear();
        C0UAL c0ual = this.LLLLZ;
        if (c0ual != null) {
            ((C768740UDo) c0ual).LIZIZ();
        }
        C1120000fFe c1120000fFe = this.LLLLL;
        if (c1120000fFe != null) {
            c1120000fFe.LIZJ(this.LLLLLIL);
        }
        C1120000fFe c1120000fFe2 = this.LLLLL;
        if (c1120000fFe2 != null) {
            c1120000fFe2.LIZJ(this.LLLLLILLIL);
        }
        C1120000fFe c1120000fFe3 = this.LLLLL;
        if (c1120000fFe3 != null) {
            c1120000fFe3.LIZJ(this.LLLLLJIL);
        }
        C786410Ut5.LJL(C783270Uo1.LIZJ(), new Runnable() { // from class: X.0UJo
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VideoModeContainer@8970.onDestroy$1");
                try {
                    C1D4I.LJIIIZ(false);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VideoModeContainer@8970.onDestroy$1");
            }
        });
        C768460UCm.LIZIZ().tr(this.LLLZIIL);
        DataChannel dataChannel = this.LLLLILI;
        if (C500260Jjc.LJJIJIIJIL((dataChannel == null || (pair = (Pair) dataChannel.gg0(StartLiveSuccessChannel.class)) == null) ? null : (Boolean) pair.getFirst())) {
            if (this.LLLLLLZ != null) {
                C769540UGq.LIZ = 500;
                C769540UGq.LIZIZ = false;
                C769540UGq.LIZJ = false;
                C0UK0.LIZ = false;
                C0UK0.LIZIZ = false;
                C0UK0.LIZJ = false;
            }
            C774610Ua3.LL.LLLZZIL(false);
            C781270Ukn.LJI().onLeavePreview();
            C768460UCm.LIZIZ().release();
            ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).K42();
            ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).releaseGalleryModule();
            C781270Ukn.LJI().releasePanelResource(false);
            ((C0U79) C781270Ukn.LJI().getLiveEffectRestoreManager()).LIZ(this.LLLLILI);
            C768460UCm.LIZJ().release();
            C768460UCm.LJFF();
            C767120U7i.LIZLLL(true);
            C768460UCm.LJII().release(false);
            C760080Tri.LIZ();
            InterfaceC1814530xJr boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
            if (boardsDisplayStateManager != null) {
                boardsDisplayStateManager.LJIILIIL();
            }
            InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
            if (effectBoardService != null) {
                effectBoardService.release();
            }
        } else {
            C0UKK c0ukk = this.LLLLLLZ;
            if (c0ukk != null) {
                c0ukk.LLJJ = null;
            }
            C781270Ukn.LJI().composerManagerB().LJIJJ();
        }
        C11JF c11jf = this.LLLLLZIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1548820qPI.LJIIIIZZ("live_goal_update_event", this);
        C0UKJ.LIZIZ();
        C0UKN c0ukn = this.LLLLLJIL;
        if (c0ukn != null) {
            c0ukn.LJI();
        }
        if (LivePreviewMemLeakOpt.enable()) {
            C0UJY liveParamsListener = getLiveParamsListener();
            if (liveParamsListener != null) {
                liveParamsListener.LJIL(null);
            }
            C0UJY liveParamsListener2 = getLiveParamsListener();
            if (liveParamsListener2 != null) {
                liveParamsListener2.LJJI(null);
            }
        }
    }

    @Override // X.C0ULK
    public final void LJ() {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
            C0UKC.LIZLLL = new AwS626S0100000_12(this, 48);
        }
        Object objGg0 = DataChannelGlobal.LLILZ.gg0(RestartLiveChannel.class);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(objGg0, bool)) {
            C0UKC.LIZ(C13LE.LIZ(PreviewStartLiveWidget.class), getStartLiveContainerFromXml(), new C13IQ[0], true);
            return;
        }
        C0UKZ.LLIFFJFJJ.LJFF(Long.valueOf(System.currentTimeMillis()));
        C0UKC.LIZ(C13LE.LIZ(PreviewCloseWidget.class), getCloseWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        DataChannel dataChannel = this.LLLLILI;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(LiveGoalFeatureEnableChannel.class), bool)) {
            LJII();
        }
        LivePreviewComponentsSimplifyTypeSetting livePreviewComponentsSimplifyTypeSetting = LivePreviewComponentsSimplifyTypeSetting.INSTANCE;
        if (livePreviewComponentsSimplifyTypeSetting.inExperiment()) {
            C0UKC.LIZ(C13LE.LIZ(PreviewLiveDetailWidget.class), getFullTitleWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
            if (livePreviewComponentsSimplifyTypeSetting.showFullLiveGoalBtn()) {
                getCoverTitleContainerFromXml().setBackgroundResource(R.drawable.dlu);
            } else {
                getCoverTitleContainerFromXml().setBackgroundResource(R.color.a1d);
            }
            C500260Jjc.LJIILIIL(getCoverWidgetContainerFromXml());
        } else {
            C0UKC.LIZ(C13LE.LIZ(PreviewCoverWidget.class), getCoverWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
            C0UKC.LIZ(C13LE.LIZ(PreviewTitleWidget.class), getTitleWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
            if (LiveAnchorHashTagHideSetting.INSTANCE.enable()) {
                C500260Jjc.LJIILIIL(getHashtagContainerFromXml());
            } else {
                C19719912Dl c19719912DlRH = C781270Ukn.LJIIIZ().RH();
                if ((c19719912DlRH instanceof C13IQ) && c19719912DlRH != null) {
                    C0UKC.LIZ(c19719912DlRH, getHashtagContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class)}, true);
                }
            }
            C0UKC.LIZ(C13LE.LIZ(PreviewDescriptionWidget.class), getDescriptionWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
        }
        ((PreviewDecouplingWidget) C0UKC.LIZ(C13LE.LIZ(PreviewDecouplingWidget.class), getDecouplingCenterBannerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(LiveSimplifiedVisibilityChannel.class)}, true)).H1(getFlowLayoutFromXml());
        C0UKC.LIZ(C13LE.LIZ(PreviewCommonNotifyWidget.class), getNotifyContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewMultiCoHostOffliveBannerWidget.class), getCoHostOffliveBannerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class)}, true);
        if (LivePreviewProbationSettings.enable()) {
            C0UKC.LIZ(C13LE.LIZ(PreviewProbationBannerWidget.class), getProbationBannerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewNotLOPNewCreatorWidget.class), getNewAnchorIncentiveContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class), C13LE.LIZ(ProbationBannerChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewLOPAgeAssuranceNotifyWidget.class), getAnchorLopAgeNotifyContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class), C13LE.LIZ(ProbationBannerChannel.class), C13LE.LIZ(NewAnchorIncentiveChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewIncentiveCampaignWidget.class), getAnchorIncentiveCampaignContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class), C13LE.LIZ(LOPAgeAssuranceNotifyBannerChannel.class), C13LE.LIZ(ProbationBannerChannel.class), C13LE.LIZ(NewAnchorIncentiveChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewLevelUpNotifyWidget.class), getAnchorLevelUpNotifyContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class), C13LE.LIZ(LOPAgeAssuranceNotifyBannerChannel.class), C13LE.LIZ(IncentiveCampaignBannerChannel.class), C13LE.LIZ(ProbationBannerChannel.class), C13LE.LIZ(NewAnchorIncentiveChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewLiveProNotifyWidget.class), getLiveProNotifyContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class), C13LE.LIZ(LOPAgeAssuranceNotifyBannerChannel.class), C13LE.LIZ(IncentiveCampaignBannerChannel.class), C13LE.LIZ(LevelupNotifyBannerChannel.class), C13LE.LIZ(ProbationBannerChannel.class), C13LE.LIZ(NewAnchorIncentiveChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewLiveJourneyBannerWidget.class), getLiveJourney2BannerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class), C13LE.LIZ(LOPAgeAssuranceNotifyBannerChannel.class), C13LE.LIZ(IncentiveCampaignBannerChannel.class), C13LE.LIZ(LevelupNotifyBannerChannel.class), C13LE.LIZ(LiveProNotifyBannerChannel.class), C13LE.LIZ(ProbationBannerChannel.class), C13LE.LIZ(NewAnchorIncentiveChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewECommerceGrowthTaskWidget.class), getEcommerceGrowthTaskContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class), C13LE.LIZ(LOPAgeAssuranceNotifyBannerChannel.class), C13LE.LIZ(IncentiveCampaignBannerChannel.class), C13LE.LIZ(LevelupNotifyBannerChannel.class), C13LE.LIZ(LiveProNotifyBannerChannel.class), C13LE.LIZ(ProbationBannerChannel.class), C13LE.LIZ(NewAnchorIncentiveChannel.class), C13LE.LIZ(LiveJourney2BannerChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewLiveGrowthMVPWidget.class), getLiveGrowthMvpContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class), C13LE.LIZ(LOPAgeAssuranceNotifyBannerChannel.class), C13LE.LIZ(IncentiveCampaignBannerChannel.class), C13LE.LIZ(LevelupNotifyBannerChannel.class), C13LE.LIZ(LiveProNotifyBannerChannel.class), C13LE.LIZ(ProbationBannerChannel.class), C13LE.LIZ(NewAnchorIncentiveChannel.class), C13LE.LIZ(LiveJourney2BannerChannel.class), C13LE.LIZ(ECommerceGrowthTaskChannel.class)}, true);
        if (InterfaceC1106030et7.B7.LIZIZ().intValue() < 3) {
            C0UKC.LIZ(C13LE.LIZ(PreviewLiveGrowthCenterWidget.class), getGrowthCenterBannerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class), C13LE.LIZ(LOPAgeAssuranceNotifyBannerChannel.class), C13LE.LIZ(IncentiveCampaignBannerChannel.class), C13LE.LIZ(LevelupNotifyBannerChannel.class), C13LE.LIZ(LiveProNotifyBannerChannel.class), C13LE.LIZ(LiveGrowthMVPBannerChannel.class), C13LE.LIZ(ProbationBannerChannel.class), C13LE.LIZ(NewAnchorIncentiveChannel.class), C13LE.LIZ(LiveJourney2BannerChannel.class), C13LE.LIZ(ECommerceGrowthTaskChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewReplayWidget.class), getReplayContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class), C13LE.LIZ(LOPAgeAssuranceNotifyBannerChannel.class), C13LE.LIZ(IncentiveCampaignBannerChannel.class), C13LE.LIZ(LevelupNotifyBannerChannel.class), C13LE.LIZ(LiveProNotifyBannerChannel.class), C13LE.LIZ(LiveGrowthMVPBannerChannel.class), C13LE.LIZ(LiveCenterGrowthBannerChannel.class), C13LE.LIZ(LiveJourney2BannerChannel.class), C13LE.LIZ(ECommerceGrowthTaskChannel.class), C13LE.LIZ(ReplayEnableChannel.class), C13LE.LIZ(ProbationBannerChannel.class), C13LE.LIZ(NewAnchorIncentiveChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class)}, true);
        if (!C0UKV.LIZLLL(getContext())) {
            C19719912Dl c19719912DlRG = C781270Ukn.LIZJ().RG();
            if ((c19719912DlRG instanceof C13IQ) && c19719912DlRG != null) {
                C0UKC.LIZ(c19719912DlRG, getBannerContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class), C13LE.LIZ(MultiCoHostOffliveBannerVisibilityChannel.class), C13LE.LIZ(LOPAgeAssuranceNotifyBannerChannel.class), C13LE.LIZ(IncentiveCampaignBannerChannel.class), C13LE.LIZ(LevelupNotifyBannerChannel.class), C13LE.LIZ(LiveProNotifyBannerChannel.class), C13LE.LIZ(LiveGrowthMVPBannerChannel.class), C13LE.LIZ(LiveJourney2BannerChannel.class), C13LE.LIZ(ECommerceGrowthTaskChannel.class), C13LE.LIZ(LiveCenterGrowthBannerChannel.class), C13LE.LIZ(ReplayInfluenceBannerChannel.class), C13LE.LIZ(ProbationBannerChannel.class), C13LE.LIZ(NewAnchorIncentiveChannel.class), C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class)}, true);
            }
        }
        C19719912Dl c19719912DlJc1 = ((ILiveEventStickerService) C781270Ukn.LJJIIZ.getValue()).Jc1();
        if ((c19719912DlJc1 instanceof C13IQ) && c19719912DlJc1 != null) {
            C0UKC.LIZ(c19719912DlJc1, getLiveEventStickerContainerFromXml(), new C13IQ[0], true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewReverseCameraWidget.class), getReverseCameraWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewSettingWidget.class), getSettingWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewMoreWidget.class), getMoreWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(LiveBoardsWidget.class), getLiveBoardsWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewShareWidget.class), getShareWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
        if (HideEffectEntrySetting.INSTANCE.shouldHide()) {
            C770220UJg c770220UJg = C770220UJg.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(PreviewShareWidget.class);
            C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PreviewMoreLessVisibilityChannel.class);
            Set set = (Set) ((LinkedHashMap) C770220UJg.LIZLLL).get(c19719912DlLIZ);
            if (set != null) {
                set.remove(c19719912DlLIZ2);
            }
            C770220UJg.LIZIZ(c19719912DlLIZ);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewLiveCenterWidget.class), getLiveEventsWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewStartLiveWidget.class), getStartLiveContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewBeautyWidget.class), getBeautyWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewStickerWidget.class), getStickerWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        PreviewStickerWidget previewStickerWidget = (PreviewStickerWidget) C0UKC.LJFF(C13LE.LIZ(PreviewStickerWidget.class));
        if (previewStickerWidget != null) {
            previewStickerWidget.LLIZ = getStickerContainerFromXml();
        }
        PreviewStickerWidget previewStickerWidget2 = (PreviewStickerWidget) C0UKC.LJFF(C13LE.LIZ(PreviewStickerWidget.class));
        if (previewStickerWidget2 != null) {
            previewStickerWidget2.LLIZLLLIL = this;
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewApplyWidget.class), getApplyWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewSubscriptionWidget.class), getSubscribeWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewFansClubWidget.class), getFansClubWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewServicePlusWidget.class), this.LLLLZI, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
        C0UFE c0ufeLIZ = C753070TgP.LIZ(this.LLLLILI);
        C0UFE c0ufe = C0UFE.ON;
        boolean z = c0ufeLIZ == c0ufe;
        boolean zJF0 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).JF0();
        if (z || zJF0) {
            C0UKC.LIZ(C13LE.LIZ(PreviewInteractWidget.class), getInteractWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
            if (z) {
                if (!zJF0) {
                    C0UKC.LIZ(C13LE.LIZ(PreviewCustomPollWidget.class), getCustomWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
                }
            } else if (zJF0) {
                C0UKC.LIZ(C13LE.LIZ(PreviewPlaybookWidget.class), getPlaybookWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
            }
            C0UKC.LIZ(C13LE.LIZ(PreviewViewerWishesWidget.class), getViewerWishesContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
        } else {
            C0UKC.LIZ(C13LE.LIZ(PreviewViewerWishesWidget.class), getViewerWishesContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewFilterStyleWidget.class), getFilterStyleContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewStickerHintWidget.class), getGestureMagicTipContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCommercialWidget.class), getBusinessWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
        PreviewCommercialWidget previewCommercialWidget = (PreviewCommercialWidget) C0UKC.LJFF(C13LE.LIZ(PreviewCommercialWidget.class));
        if (previewCommercialWidget != null) {
            previewCommercialWidget.R1();
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewECIndependentWidget.class), getEcIndependentWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
        if (C753070TgP.LIZIZ(this.LLLLILI) == c0ufe) {
            C0UKC.LIZ(C13LE.LIZ(PreviewPromoteWidget.class), getPromoteWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
        }
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            C0UKC.LIZ(C13LE.LIZ(PreviewLiveGoalEffectWidget.class), getLiveGoalEffectContainerFromXml(), new C13IQ[]{C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        }
        if (SupportBillboardOverlaySetting.INSTANCE.enable()) {
            C0UKC.LIZ(C13LE.LIZ(PreviewBillboardOverlayWidget.class), getBillboardOverlayContainerFromXml(), new C13IQ[0], true);
        }
        C19719912Dl c19719912DlLIZ3 = C781270Ukn.LJIJ().ZI2().LIZ();
        if ((c19719912DlLIZ3 instanceof C13IQ) && c19719912DlLIZ3 != null) {
            C0UKC.LIZ(c19719912DlLIZ3, getBulltinEditContainerFromXml(), new C13IQ[]{C13LE.LIZ(PreviewBulletinEditVisibilityChannel.class)}, true);
        }
        C19719912Dl c19719912DlLJI = C781270Ukn.LJIJ().ZI2().LJI();
        if ((c19719912DlLJI instanceof C13IQ) && c19719912DlLJI != null) {
            C0UKC.LIZ(c19719912DlLJI, getLiveBoardTipWidgetContainerFromXml(), new C13IQ[0], true);
        }
        C19719912Dl c19719912DlLIZIZ = C781270Ukn.LJIJ().ZI2().LIZIZ();
        if ((c19719912DlLIZIZ instanceof C13IQ) && c19719912DlLIZIZ != null) {
            C0UKC.LIZ(c19719912DlLIZIZ, getBoardsDisplayViewWidgetContainerFromXml(), new C13IQ[0], true);
        }
        C0UKK c0ukk = this.LLLLLLZ;
        if (c0ukk != null) {
            C500260Jjc.LJIILLIIL(c0ukk.LLILZLL);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewCampaignWidget.class), getCampaignWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class), C13LE.LIZ(LeaveVideoModeVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PlaybookBannerWidget.class), getPlaybookDetailContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(PreviewViolationVisibilityChannel.class)}, true);
        try {
            C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(C781270Ukn.LJJII().getECBillboardSlotWidgetClass());
            if (c19719912DlLIZ4 != null) {
                C0UKC.LIZ(c19719912DlLIZ4, getEcBillboardPreviewContainerFromXml(), new C13IQ[0], true);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C769220UFk.LIZIZ(C769220UFk.LIZ, getContext(), null, this.LLLLLLZZ, this.LLLLLZ, false, 0.0f, false, false, 240);
        C768460UCm.LIZIZ().Fr(C769200UFi.LIZ(0, 0, this.LLLLLLL, this.LLLLLLLLL, true, getContext(), true));
        DataChannel dataChannel2 = this.LLLLILI;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this.LLILLL, PreviewMoreClickEvent.class, new AwS591S0100000_12(this, 876));
        }
    }

    public final void LJII() {
        LivePreviewComponentsSimplifyTypeSetting livePreviewComponentsSimplifyTypeSetting = LivePreviewComponentsSimplifyTypeSetting.INSTANCE;
        if (!livePreviewComponentsSimplifyTypeSetting.inExperiment()) {
            if (LiveGoalAnchorAccessControlSetting.INSTANCE.showPreviewWidget()) {
                DataChannel dataChannel = this.LLLLILI;
                if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(LiveGoalFeatureEnableChannel.class), Boolean.FALSE)) {
                    C0UKC.LIZ(C13LE.LIZ(LiveGoalPreviewWidget.class), getStreamGoalFirstLineContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
                    return;
                }
                return;
            }
            return;
        }
        if (LiveGoalAnchorAccessControlSetting.INSTANCE.showPreviewWidget()) {
            DataChannel dataChannel2 = this.LLLLILI;
            if (dataChannel2 == null || !Intrinsics.LJFF(dataChannel2.gg0(LiveGoalFeatureEnableChannel.class), Boolean.FALSE)) {
                if (!livePreviewComponentsSimplifyTypeSetting.showFullLiveGoalBtn()) {
                    C0UKC.LIZ(C13LE.LIZ(LiveGoalPreviewButtonWidget.class), getLiveGoalBtnWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(PreviewMoreLessVisibilityChannel.class)}, true);
                    C500260Jjc.LJIILIIL(getFirstLineAreaFromXml());
                    return;
                }
                C500260Jjc.LJIILIIL(getHashtagContainerFromXml());
                if (C753070TgP.LJFF(this.LLLLILI, AFwS245S0000000_12.get$arr$(142), null) == C0UFE.OFF) {
                    C500260Jjc.LJLJL(0, getFirstLineAreaFromXml());
                } else {
                    C0UKC.LIZ(C13LE.LIZ(LiveGoalPreviewWidget.class), getStreamGoalFirstLineContainerFromXml(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
                }
            }
        }
    }

    public final ConstraintLayout getAllBannerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.aws);
            this.LLILZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C20516015Pq getAnchorIncentiveCampaignContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b02);
            this.LLJJJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getAnchorLevelUpNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b0s);
            this.LLJJJJJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getAnchorLopAgeNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b0w);
            this.LLJJJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getApplyWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b7_);
            this.LLLII = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBannerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.brb);
            this.LLJLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBeautyWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFFI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bv1);
            this.LLLFFI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBillboardOverlayContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c17);
            this.LLLJL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBoardsDisplayViewWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c7c);
            this.LLLLIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBulltinEditContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d5u);
            this.LLLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBusinessWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLILZJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.d6f);
            this.LLLILZJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCampaignWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLLII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.da_);
            this.LLLLII = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCloseWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e2y);
            this.LLJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCoHostOffliveBannerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.omi);
            this.LLJJIJIIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final ConstraintLayout getCoverTitleContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f5n);
            this.LLJILJILJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C20516015Pq getCoverWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f5x);
            this.LLJILLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCustomWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fdt);
            this.LLLIIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getDecouplingCenterBannerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fhu);
            this.LLJJIII = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getDescriptionWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fpk);
            this.LLJJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getEcBillboardPreviewContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gf2);
            this.LLLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getEcIndependentWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLILZLLLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gf9);
            this.LLLILZLLLI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getEcommerceGrowthTaskContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gig);
            this.LLJJLIIIJLLLLLLLZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getFansClubWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ho4);
            this.LLLIIIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getFilterStyleContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hye);
            this.LLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final ConstraintLayout getFirstLineAreaFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i08);
            this.LLIZLLLIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C426160GnO getFlowLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.idc);
            this.LLILZIL = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final C20516015Pq getFullTitleWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.io8);
            this.LLJILJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGestureMagicTipContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iuw);
            this.LLLILZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C0UKT getGoLiveLoadingViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLLIILL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.j38);
            this.LLLLIILL = (C0UKT) callbackFindViewById;
        }
        return (C0UKT) callbackFindViewById;
    }

    public final C20516015Pq getGrowthCenterBannerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.j8k);
            this.LLJLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getHashtagContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jgy);
            this.LLIZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getInteractWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kvi);
            this.LLLIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveBoardTipWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLLIIIILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mu9);
            this.LLLLIIIILLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveBoardsWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mua);
            this.LLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveEventStickerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mxm);
            this.LLJLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveEventsWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mxs);
            this.LLLFF = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveGoalBtnWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f757myl);
            this.LLJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveGoalEffectContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.myo);
            this.LLLJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveGrowthMvpContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.myv);
            this.LLJL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveJourney2BannerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n0v);
            this.LLJJL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveProNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n4d);
            this.LLJJJJLIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getMoreWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZIJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.olv);
            this.LLJZIJLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getNewAnchorIncentiveContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p5s);
            this.LLJJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pfn);
            this.LLJJIJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPlaybookDetailContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLLIILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qpy);
            this.LLLLIILLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPlaybookWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLIILIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qt1);
            this.LLLIILIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getProbationBannerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rwf);
            this.LLJJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPromoteWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLIZZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.s_u);
            this.LLLIZZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getReplayContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t72);
            this.LLJLILLLLZIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getReverseCameraWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tft);
            this.LLJLLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getSettingWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uvz);
            this.LLJZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getShareWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v30);
            this.LLLF = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStartLiveContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vyx);
            this.LLILZLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final FrameLayout getStickerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w4u);
            this.LLLI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final C20516015Pq getStickerWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w7u);
            this.LLLFZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStreamGoalFirstLineContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wao);
            this.LLJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getSubscribeWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wil);
            this.LLLIIII = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getTitleWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y3r);
            this.LLJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getViewerWishesContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.viewer_wishes_widget_container);
            this.LLLJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final boolean LJIIJ() {
        Map<String, LiveEffect> map;
        Map<String, LiveEffect> map2;
        Collection<LiveEffect> collectionValues;
        List listLLIIII;
        Map<String, Map<String, LiveEffect>> mapJr = C768460UCm.LIZIZ().jr();
        String str = C0UD4.LIZIZ;
        if (mapJr.containsKey(str) && (map = mapJr.get(str)) != null && (!map.isEmpty()) && (map2 = mapJr.get(str)) != null && (collectionValues = map2.values()) != null && (listLLIIII = C13LP.LLIIII(collectionValues)) != null) {
            ArrayList<String> arrayList = new ArrayList();
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((LiveEffect) it2.next()).LLJJ(), arrayList);
            }
            if (!arrayList.isEmpty()) {
                for (String str2 : arrayList) {
                    for (String str3 : LiveEffectFaceDetectAllowlistSetting.INSTANCE.getALLOWLIST()) {
                        if (u.LJJIIJZLJL(str2, str3, false)) {
                            C19EG activity = this.LLILLL.getActivity();
                            if (activity == null) {
                                return true;
                            }
                            activity.runOnUiThread(new ARunnableS112S0100000_12(this, 304));
                            return true;
                        }
                    }
                }
            }
            C19EG activity2 = this.LLILLL.getActivity();
            if (activity2 != null) {
                activity2.runOnUiThread(new ARunnableS112S0100000_12(this, 305));
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0U86, X.0UJ9] */
    public C770200UJe(Fragment fragment) {
        int iLJIIZILJ;
        boolean z;
        Room room;
        super(fragment.requireContext(), R.layout.hie);
        this.LLILLL = fragment;
        DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        this.LLLLILI = dataChannelLJ;
        this.LLLLJI = C292401Bi.LIZ(new AwS556S0100000_12(this, 777));
        ScaleGestureDetectorOnScaleGestureListenerC21656519pD scaleGestureDetectorOnScaleGestureListenerC21656519pD = new ScaleGestureDetectorOnScaleGestureListenerC21656519pD(getContext(), dataChannelLJ, 1);
        this.LLLLLIL = scaleGestureDetectorOnScaleGestureListenerC21656519pD;
        this.LLLLLJLJLL = C768460UCm.LJI();
        if (C497740JfY.LJJ()) {
            iLJIIZILJ = -C497740JfY.LJIIZILJ();
        } else {
            iLJIIZILJ = C497740JfY.LJIIZILJ();
        }
        float f = iLJIIZILJ;
        this.LLLLLLIL = -100;
        this.LLLLLLLLLL = (ViewGroup) findViewById(R.id.ax2);
        this.LLLZI = new ARunnableS112S0100000_12(this, 306);
        ?? r5 = new C0U86() { // from class: X.0UJ9
            /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
            @Override // X.C0U86
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.bytedance.android.livesdkapi.depend.model.LiveEffect r5, java.lang.String r6, boolean r7) {
                /*
                    r4 = this;
                    X.0UEo r0 = X.C768460UCm.LIZIZ()
                    java.util.Map r2 = r0.jr()
                    X.0UJe r3 = r4.LIZ
                    java.lang.String r1 = X.C0UD4.LIZIZ
                    boolean r0 = r2.containsKey(r1)
                    if (r0 == 0) goto L46
                    java.lang.Object r0 = r2.get(r1)
                    java.util.Map r0 = (java.util.Map) r0
                    boolean r0 = r0.isEmpty()
                    r1 = 1
                    r0 = r0 ^ 1
                    if (r0 == 0) goto L46
                L21:
                    r3.LLLLJ = r1
                    X.0UJe r1 = r4.LIZ
                    boolean r0 = r1.LLLLJ
                    if (r0 == 0) goto L45
                    boolean r0 = r1.LJIIJ()
                    if (r0 == 0) goto L45
                    X.0UJe r0 = r4.LIZ
                    androidx.fragment.app.Fragment r0 = r0.LLILLL
                    X.19EG r3 = r0.getActivity()
                    if (r3 == 0) goto L45
                    Y.ARunnableS112S0100000_12 r2 = new Y.ARunnableS112S0100000_12
                    X.0UJe r1 = r4.LIZ
                    r0 = 307(0x133, float:4.3E-43)
                    r2.<init>(r1, r0)
                    r3.runOnUiThread(r2)
                L45:
                    return
                L46:
                    X.0UJe r0 = r4.LIZ
                    com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.LLLLILI
                    if (r2 == 0) goto L53
                    java.lang.Class<com.bytedance.android.live.effect.api.FaceDetectEvent> r1 = com.bytedance.android.live.effect.api.FaceDetectEvent.class
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r2.LC0(r1, r0)
                L53:
                    r1 = 0
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0UJ9.LIZ(com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, boolean):void");
            }
        };
        this.LLLZIIL = r5;
        InterfaceC770090UIt interfaceC770090UIt = new InterfaceC770090UIt() { // from class: X.0UJj
            @Override // X.InterfaceC770090UIt
            public final void onResult(int i) {
                C19EG activity;
                C770200UJe c770200UJe = this.LIZ;
                if (c770200UJe.LLLLJ && c770200UJe.LJIIJ()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C770200UJe c770200UJe2 = this.LIZ;
                    if (jCurrentTimeMillis - c770200UJe2.LLLLLL > 100 || i != c770200UJe2.LLLLLLIL) {
                        c770200UJe2.LLLLLL = System.currentTimeMillis();
                        C770200UJe c770200UJe3 = this.LIZ;
                        c770200UJe3.LLLLLLIL = i;
                        if (c770200UJe3.LL && (activity = c770200UJe3.LLILLL.getActivity()) != null) {
                            activity.runOnUiThread(new ARunnableS23S0101000_12(i, this.LIZ, 16));
                        }
                    }
                }
            }
        };
        this.LLLZIL = EnumC770010UIl.DEFAULT.value;
        InterfaceC770070UIr interfaceC770070UIr = new InterfaceC770070UIr() { // from class: X.0UJ6
            @Override // X.InterfaceC770070UIr
            public final void LIZ(boolean z2, EnumC770010UIl enumC770010UIl) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C770200UJe c770200UJe = this.LIZ;
                if (jCurrentTimeMillis - c770200UJe.LLLLLZL > 1000) {
                    c770200UJe.LLLLLLJ = z2;
                }
                if (LiveAsiaBeautyGenderOpt.INSTANCE.enable()) {
                    String str = this.LIZ.LLLZIL;
                    EnumC770010UIl enumC770010UIl2 = EnumC770010UIl.DEFAULT;
                    if (Intrinsics.LJFF(str, enumC770010UIl2.value) && enumC770010UIl != enumC770010UIl2) {
                        this.LIZ.LLLZIL = enumC770010UIl.value;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("result: ");
                        sbLIZ.append(this.LIZ.LLLZIL);
                        C20441214yg.LJIIIZ("BeautyGenderDetect", C2188811AlT.LIZIZ(sbLIZ));
                        InterfaceC766480U4w.LJJJJZI.LIZJ(this.LIZ.LLLZIL);
                    }
                }
            }
        };
        C500260Jjc.LJIILLIIL(getAllBannerContainerFromXml());
        getAllBannerContainerFromXml().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC785940UsK(this, 3));
        this.LLLZL = true;
        if (C500260Jjc.LJJIJIIJIL((Boolean) DataChannelGlobal.LLILZ.gg0(RestartLiveChannel.class))) {
            C0UJY liveParamsListener = getLiveParamsListener();
            if (liveParamsListener != null) {
                liveParamsListener.LJIL(interfaceC770090UIt);
            }
            C0UJY liveParamsListener2 = getLiveParamsListener();
            if (liveParamsListener2 != null) {
                liveParamsListener2.LJJI(interfaceC770070UIr);
            }
            InterfaceC769000UEo interfaceC769000UEoLIZIZ = C768460UCm.LIZIZ();
            C20441214yg.LIZIZ("EffectMonitor#PreviewInit", interfaceC769000UEoLIZIZ.toString());
            C0UGC c0ugc = new C0UGC();
            c0ugc.LIZ = C0UD4.LJII;
            c0ugc.LIZLLL = "broadcast";
            c0ugc.LIZJ = C781270Ukn.LJI().getComposerHandler(C770730ULf.LIZ(dataChannelLJ));
            interfaceC769000UEoLIZIZ.or(new C0UG8(c0ugc));
            interfaceC769000UEoLIZIZ.Dr(r5);
            C768460UCm.LJ();
            if (dataChannelLJ != null) {
                getContext();
                C0U79.LIZIZ(dataChannelLJ, fragment, true);
            }
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
                C766720U5u.LJIIJ(this.LLLLILI);
            }
            this.LLLLZI = (C20516015Pq) findViewById(R.id.uu7);
            setOnTouchListener(new ATListenerS446S0100000_12(this, 20));
            this.LLLLZ = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).createMagicGestureEffectAnchorHelper(dataChannelLJ, this, null);
            C770390UJx c770390UJx = new C770390UJx();
            this.LLLLZIL = c770390UJx;
            if (dataChannelLJ != null) {
                dataChannelLJ.EQ2(fragment, RoomCreateInfoChannel.class, new AwS378S0200000_12(dataChannelLJ, c770390UJx, 42));
            }
            C1D4I.LIZ = new C2250021D4u(fragment);
            C1548820qPI.LIZLLL("live_goal_update_event", this);
            if (dataChannelLJ != null && (fragment instanceof BaseFragment)) {
                C1120000fFe c1120000fFe = new C1120000fFe(dataChannelLJ);
                this.LLLLL = c1120000fFe;
                BaseFragment baseFragment = (BaseFragment) fragment;
                C0UKN c0ukn = new C0UKN(getContext(), dataChannelLJ, 3, baseFragment);
                this.LLLLLJIL = c0ukn;
                C769230UFl c769230UFl = new C769230UFl(getContext(), dataChannelLJ, f, baseFragment);
                this.LLLLLILLIL = c769230UFl;
                c1120000fFe.LIZIZ(scaleGestureDetectorOnScaleGestureListenerC21656519pD);
                c1120000fFe.LIZIZ(c0ukn);
                c1120000fFe.LIZIZ(c769230UFl);
            }
            C20337914i1<Boolean> c20337914i1 = InterfaceC772190UQv.A3;
            if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
                LJIIIZ(true);
                c20337914i1.LJFF(Boolean.TRUE);
            }
            this.LLLLLZ = findViewById(R.id.wq7);
            this.LLLLLLZZ = findViewById(R.id.wq1);
            C0UKT goLiveLoadingViewFromXml = getGoLiveLoadingViewFromXml();
            if (goLiveLoadingViewFromXml != null) {
                goLiveLoadingViewFromXml.setLifecycleOwner(fragment);
                goLiveLoadingViewFromXml.setDataChannel(dataChannelLJ);
            }
            C0UKK c0ukk = new C0UKK(getContext());
            this.LLLLLLZ = c0ukk;
            c0ukk.setDataChannel(dataChannelLJ);
            addView(c0ukk, new FrameLayout.LayoutParams(-1, -1));
            C0UKN c0ukn2 = this.LLLLLJIL;
            if (c0ukn2 != null) {
                c0ukn2.LLJILJILJ = new C0UKO() { // from class: X.0UKB
                    @Override // X.C0UKO
                    public final Pair<Integer, Integer> LIZ() {
                        RoomCreateInfo roomCreateInfo;
                        BannerInRoomCollection.BannerInfo bannerInfo;
                        List<BannerInRoom> list;
                        if (LiveExposureOptSetting.INSTANCE.enable()) {
                            return new Pair<>(Integer.valueOf(this.LIZ.getFirstLineAreaFromXml().getBottom()), Integer.valueOf(this.LIZ.getFlowLayoutFromXml().getTop()));
                        }
                        DataChannel dataChannel = this.LIZ.LLLLILI;
                        return new Pair<>(Integer.valueOf((dataChannel == null || (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null || (bannerInfo = roomCreateInfo.bannerInfo) == null || (list = bannerInfo.bannerList) == null || list.size() != 0) ? this.LIZ.getFirstLineAreaFromXml().getBottom() + ((int) C497740JfY.LIZIZ(66.0f)) : this.LIZ.getFirstLineAreaFromXml().getBottom()), Integer.valueOf(this.LIZ.getHeight() - this.LIZ.getFlowLayoutFromXml().getTop()));
                    }

                    @Override // X.C0UKO
                    public final void LIZIZ() {
                        C0UKK c0ukk2 = this.LIZ.LLLLLLZ;
                        if (c0ukk2 != null) {
                            c0ukk2.LIZIZ();
                        }
                    }

                    @Override // X.C0UKO
                    public final void LIZJ(boolean z2) {
                        if (z2) {
                            C0UKK c0ukk2 = this.LIZ.LLLLLLZ;
                            if (c0ukk2 != null) {
                                c0ukk2.LJI();
                                return;
                            }
                            return;
                        }
                        C0UKK c0ukk3 = this.LIZ.LLLLLLZ;
                        if (c0ukk3 == null) {
                            return;
                        }
                        c0ukk3.LJFF();
                    }

                    @Override // X.C0UKO
                    public final void LIZLLL(int i) {
                        C780540Ujc c780540Ujc;
                        C0UKK c0ukk2 = this.LIZ.LLLLLLZ;
                        if (c0ukk2 != null && (c780540Ujc = c0ukk2.LLJ) != null) {
                            c780540Ujc.LJI(i);
                        }
                    }
                };
            }
            if (dataChannelLJ != null) {
                dataChannelLJ.EQ2(fragment, PreviewHideLiveModeChannel.class, new AwS591S0100000_12(this, 869));
                dataChannelLJ.BQ2(fragment, BillboardOverlayVisibilityChannel.class, new AwS591S0100000_12(this, 870));
                dataChannelLJ.BQ2(fragment, PreviewBoardPlaceHolderVisibility.class, new AwS591S0100000_12(this, 871));
                dataChannelLJ.BQ2(fragment, LiveEventStickerDraggingChannel.class, new AwS591S0100000_12(this, 872));
                dataChannelLJ.EQ2(fragment, BlockVisibilityChannel.class, new AwS591S0100000_12(this, 873));
                dataChannelLJ.BQ2(fragment, LiveGoalFeatureEnableChannel.class, new AwS591S0100000_12(this, 874));
                dataChannelLJ.BQ2(fragment, ShowExposureGuideAnimEvent.class, new AwS591S0100000_12(this, 868));
                String str = (String) dataChannelLJ.gg0(C0UJD.class);
                if (str != null && str.length() != 0) {
                    C781270Ukn.LJI().getLiveGoalEffectHelper();
                    C0UFI.LJIILL();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0UJA(str, this, null), 3);
                }
            }
            C0UJK.LIZ();
            if (dataChannelLJ != null) {
                C774610Ua3.LL.LLLZIIL(fragment, dataChannelLJ);
            }
            if (!LiveTryModeUseTTLHSplitSetting.INSTANCE.enable()) {
                C0UNJ.LIZ(fragment);
            }
            C20441214yg.LIZIZ("KDeeplink", "enterFrom: " + C0IUA.LJIJI);
            if (Intrinsics.LJFF(C0IUA.LJIJI, "h5_karaoke")) {
                C500260Jjc.LJJLIIIJJI(1000L, new AwS556S0100000_12(this, 776));
            }
        }
        this.LLLZLL = new AwS591S0100000_12(this, 875);
    }

    public final void LJIIIIZZ(boolean z) {
        if (z) {
            if (this.LLLLLLLLLL.getVisibility() != 0) {
                C500260Jjc.LLFFF(this.LLLLLLLLLL);
                C0UJY liveParamsListener = getLiveParamsListener();
                if (liveParamsListener != null) {
                    liveParamsListener.showBottomTab();
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLLLLLLLLL.getVisibility() != 0) {
            return;
        }
        C500260Jjc.LJIILLIIL(this.LLLLLLLLLL);
        C0UJY liveParamsListener2 = getLiveParamsListener();
        if (liveParamsListener2 == null) {
            return;
        }
        liveParamsListener2.hideBottomTab();
    }

    public final void LJIIIZ(boolean z) {
        Boolean bool;
        DataChannel dataChannel = this.LLLLILI;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C753750ThV.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIFFI(bool)) {
            DataChannel dataChannel2 = this.LLLLILI;
            if (dataChannel2 != null) {
                dataChannel2.SX0(C753750ThV.class, Boolean.TRUE);
            }
            C1113800f5e.LJIIIIZZ = false;
            if (z) {
                this.LLLLLZIL = (C11JF) C11NZ.LJLJJLL(3L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJIILIIL(C0J1R.LIZIZ(this.LLILLL)).LJJLJLI(new AfS181S0100000_12(this, 176));
                return;
            }
            C0UKJ.LJII = true;
            C0UKJ.LJIIIIZZ = "dark_detect";
            C0UKJ.LIZ(this, this.LLLLILI);
            C0UKZ.LJLZ.LJFF(Long.valueOf(System.currentTimeMillis()));
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
            DataChannel dataChannel = this.LLLLILI;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                z = true;
            }
            liveGoalEffectHelper.getClass();
            C0UFI.LJI(AFwS245S0000000_12.get$arr$(9), z);
            C0UFI.LJ = null;
        }
    }

    public final void setAllBannerContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILZ = constraintLayout;
    }

    public final void setAnchorIncentiveCampaignContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJ = c20516015Pq;
    }

    public final void setAnchorLevelUpNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJJIL = c20516015Pq;
    }

    public final void setAnchorLopAgeNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJIL = c20516015Pq;
    }

    public final void setApplyWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLII = c20516015Pq;
    }

    public final void setBannerContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLL = c20516015Pq;
    }

    public final void setBeautyWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLFFI = c20516015Pq;
    }

    public final void setBillboardOverlayContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLJL = c20516015Pq;
    }

    public final void setBoardsDisplayViewWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLLIIL = c20516015Pq;
    }

    public final void setBulltinEditContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLL = c20516015Pq;
    }

    public final void setBusinessWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLILZJ = c20516015Pq;
    }

    public final void setCampaignWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLLII = c20516015Pq;
    }

    public final void setCloseWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJIJIL = c20516015Pq;
    }

    public final void setCoHostOffliveBannerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJIIJIL = c20516015Pq;
    }

    public final void setCoverTitleContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLJILJILJ = constraintLayout;
    }

    public final void setCoverWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILLL = c20516015Pq;
    }

    public final void setCustomWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLIIIL = c20516015Pq;
    }

    public final void setDecouplingCenterBannerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIII = c20516015Pq;
    }

    public final void setDescriptionWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJI = c20516015Pq;
    }

    public final void setEcBillboardPreviewContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLLIL = c20516015Pq;
    }

    public final void setEcIndependentWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLILZLLLI = c20516015Pq;
    }

    public final void setEcommerceGrowthTaskContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJLIIIJLLLLLLLZ = c20516015Pq;
    }

    public final void setFansClubWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLIIIIL = c20516015Pq;
    }

    public final void setFilterStyleContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLIL = c20516015Pq;
    }

    public final void setFirstLineAreaFromXml(ConstraintLayout constraintLayout) {
        this.LLIZLLLIL = constraintLayout;
    }

    public final void setFlowLayoutFromXml(C426160GnO c426160GnO) {
        this.LLILZIL = c426160GnO;
    }

    public final void setFullTitleWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILJIL = c20516015Pq;
    }

    public final void setGestureMagicTipContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLILZ = c20516015Pq;
    }

    public final void setGoLiveLoadingViewFromXml(C0UKT c0ukt) {
        this.LLLLIILL = c0ukt;
    }

    public final void setGrowthCenterBannerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLIL = c20516015Pq;
    }

    public final void setHashtagContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZ = c20516015Pq;
    }

    public final void setInteractWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLIIL = c20516015Pq;
    }

    public final void setLiveBoardTipWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLLIIIILLL = c20516015Pq;
    }

    public final void setLiveBoardsWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLL = c20516015Pq;
    }

    public final void setLiveEventStickerContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLLIL = c20516015Pq;
    }

    public final void setLiveEventsWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLFF = c20516015Pq;
    }

    public final void setLiveFilterPos$livebroadcast_impl_release(int i) {
        DialogFragment dialogFragment;
        Dialog dialog;
        if (this.LLILLL.isAdded()) {
            Fragment fragmentLJJJJZI = this.LLILLL.getChildFragmentManager().LJJJJZI("LiveBeautyFilterDialogFragment");
            if ((fragmentLJJJJZI instanceof DialogFragment) && (dialogFragment = (DialogFragment) fragmentLJJJJZI) != null && (dialog = dialogFragment.getDialog()) != null && dialog.isShowing()) {
                return;
            }
        }
        Integer numLIZIZ = InterfaceC766480U4w.LIZ.LIZIZ();
        if (numLIZIZ != null && numLIZIZ.intValue() == i) {
            return;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJIFFI;
        if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
            c20337914i1.LJFF(Boolean.TRUE);
        }
        InterfaceC767150U7l<? extends LiveEffect> interfaceC767150U7l = this.LLLLLJLJLL;
        if (interfaceC767150U7l != null) {
            interfaceC767150U7l.LIZJ(i);
        }
        C768460UCm.LJFF();
        C767120U7i.LIZJ("VideoModeContainer#setLiveFilterPos", false);
        C768460UCm.LJFF();
        C767120U7i.LJI(this.LLLLILI, "VideoModeContainer#setLiveFilterPos", false, false);
        C768460UCm.LJFF();
        C767120U7i.LIZ("VideoModeContainer#setLiveFilterPos");
    }

    public final void setLiveGoalBtnWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJI = c20516015Pq;
    }

    public final void setLiveGoalEffectContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLJIL = c20516015Pq;
    }

    public final void setLiveGrowthMvpContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJL = c20516015Pq;
    }

    public final void setLiveJourney2BannerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJL = c20516015Pq;
    }

    public final void setLiveProNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJLIIL = c20516015Pq;
    }

    public final void setMoreWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJZIJLIL = c20516015Pq;
    }

    public final void setNewAnchorIncentiveContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJ = c20516015Pq;
    }

    public final void setNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJI = c20516015Pq;
    }

    public final void setPlaybookDetailContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLLIILLL = c20516015Pq;
    }

    public final void setPlaybookWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLIILIL = c20516015Pq;
    }

    public final void setProbationBannerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJIL = c20516015Pq;
    }

    public final void setPromoteWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLIZZ = c20516015Pq;
    }

    public final void setReplayContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLILLLLZIIL = c20516015Pq;
    }

    public final void setReverseCameraWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLLL = c20516015Pq;
    }

    public final void setSettingWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJZ = c20516015Pq;
    }

    public final void setShareWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLF = c20516015Pq;
    }

    public final void setStartLiveContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZLL = c20516015Pq;
    }

    public final void setStickerContainerFromXml(FrameLayout frameLayout) {
        this.LLLI = frameLayout;
    }

    public final void setStickerWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLFZ = c20516015Pq;
    }

    public final void setStreamGoalFirstLineContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJ = c20516015Pq;
    }

    public final void setSubscribeWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLIIII = c20516015Pq;
    }

    public final void setTitleWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJ = c20516015Pq;
    }

    public final void setViewerWishesContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLJ = c20516015Pq;
    }
}
