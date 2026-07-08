package X;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.PreviewCoverEditVisibilityChannel;
import com.bytedance.android.livesdk.broadcast.LivePreviewWidgetsLoaded;
import com.bytedance.android.livesdk.broadcast.PreviewMoreIsExpandDataGame;
import com.bytedance.android.livesdk.broadcast.preview.modecontainer.PreviewRevisionGameMoreWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.GamePreviewDecouplingBannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCastRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCoverEditWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCustomPollRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDefinitionSelectionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDualDeviceRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuessingRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewHelpRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewInGameRankBannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewOrientationRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPhoneCameraRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPlayTogetherRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPromoteRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionCoverTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.GamePreviewLOPAgeAssuranceNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.GamePreviewLevelUpNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livepro.GamePreviewLiveProNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.PreviewLiveStudioTipsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewCommonNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameDropsPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameEventPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameGpppaPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewCampaignCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewDecouplingCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewLIVECenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.upsell.PreviewFansClubRevisionWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.GameTagIdListForceUpdate;
import com.bytedance.android.livesdk.dataChannel.GuessEnableChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveStudioTagShowChannel;
import com.bytedance.android.livesdk.dataChannel.PlayTogetherEnableChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewStartLiveContinueMsgChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayInfluenceBannerChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameLiveSupportDecoupling;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameGuideGuessEnableSetting;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UL3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UL3 extends C0ULK {
    public final Fragment LLILLL;
    public C1324720kZq LLILZ;
    public C20516015Pq LLILZIL;
    public C20516015Pq LLILZLL;
    public C20516015Pq LLIZ;
    public C20516015Pq LLIZLLLIL;
    public C20516015Pq LLJ;
    public C20516015Pq LLJI;
    public C20516015Pq LLJIJIL;
    public C20516015Pq LLJILJIL;
    public C425960Gn4 LLJILJILJ;
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
    public C20516015Pq LLLI;
    public C20516015Pq LLLII;
    public ScrollView LLLIIII;
    public C20516015Pq LLLIIIIL;
    public C20516015Pq LLLIIIL;
    public C20516015Pq LLLIIL;
    public C20516015Pq LLLIILIL;
    public C20516015Pq LLLIL;
    public ViewGroup LLLILZ;
    public ConstraintLayout LLLILZJ;
    public final DataChannel LLLILZLLLI;
    public final C0ULE LLLIZZ;
    public final C770660UKy LLLJ;
    public C771840UPm LLLJIL;
    public boolean LLLJL;
    public float LLLL;
    public float LLLLII;
    public Boolean LLLLIIIILLL;

    public final int getWeakY() {
        int[] iArr = new int[2];
        C425960Gn4 flowLayoutFromXml = getFlowLayoutFromXml();
        if (flowLayoutFromXml != null) {
            flowLayoutFromXml.getLocationOnScreen(iArr);
        }
        return iArr[1];
    }

    @Override // X.C0ULK
    public final void LIZ() {
        C770660UKy c770660UKy = this.LLLJ;
        if (c770660UKy != null) {
            c770660UKy.LIZJ.clear();
            c770660UKy.LIZLLL.clear();
            c770660UKy.LJII = true;
        }
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 778);
        C425960Gn4 flowLayoutFromXml = getFlowLayoutFromXml();
        if (flowLayoutFromXml != null) {
            flowLayoutFromXml.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC785940UsK(awS556S0100000_12, 4));
        } else {
            awS556S0100000_12.invoke();
        }
        C0UKC.LIZ(C13LE.LIZ(GamePreviewLevelUpNotifyWidget.class), getAnchorLevelUpNotifyContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(GamePreviewLiveProNotifyWidget.class), getLiveProNotifyContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(GamePreviewLOPAgeAssuranceNotifyWidget.class), getAnchorLopAgeNotifyContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class)}, true);
        C19719912Dl c19719912DlCH0 = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).CH0();
        if ((c19719912DlCH0 instanceof C13IQ) && c19719912DlCH0 != null) {
            C0UKC.LIZ(c19719912DlCH0, getNewGameBroadcastEducationWidgetFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewLiveStudioTipsWidget.class), getLiveStudioTipsWidgetFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(LiveStudioTagShowChannel.class)}, true);
        C19719912Dl c19719912DlXG0 = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).xG0();
        if ((c19719912DlXG0 instanceof C13IQ) && c19719912DlXG0 != null) {
            C0UKC.LIZ(c19719912DlXG0, getGameLiveHighlightWidgetFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(GameGpppaPreviewBanner.class), getGpppaContainerFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewInGameRankBannerWidget.class), getInGameRankBannerContainerFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        if (GameLivePartnershipDropsSetting.INSTANCE.getConfig().enable) {
            C0UKC.LIZ(C13LE.LIZ(GameDropsPreviewBanner.class), getPsDropsContainerFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(GameEventPreviewBanner.class), getGameEventContainerFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCommonNotifyWidget.class), getNotifyContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(LiveAccessRecallWidget.class), getObsAccessRecallContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        if (LiveGameLiveSupportDecoupling.INSTANCE.enable() && getDecouplingContainer() != null) {
            C0UKC.LIZ(C13LE.LIZ(GamePreviewDecouplingBannerWidget.class), getDecouplingContainer(), new C13IQ[0], true);
        }
        if (C0UKV.LIZLLL(getContext())) {
            return;
        }
        C19719912Dl c19719912DlRG = C781270Ukn.LIZJ().RG();
        if (!(c19719912DlRG instanceof C13IQ) || c19719912DlRG == null) {
            return;
        }
        C0UKC.LIZ(c19719912DlRG, getBannerContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(ReplayInfluenceBannerChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class)}, true);
    }

    @Override // X.C0ULK
    public final void LIZJ() {
        DataChannel dataChannel = this.LLLILZLLLI;
        if (dataChannel != null) {
            dataChannel.FQ2(LivePreviewWidgetsLoaded.class);
        }
    }

    @Override // X.C0ULK
    public final void LIZLLL() throws Exception {
        C0ULC c0ulc;
        C770660UKy c770660UKy = this.LLLJ;
        if (c770660UKy != null) {
            c770660UKy.LIZIZ(true);
        }
        this.LLLIZZ.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        C1548820qPI.LJIIIIZZ("enter_game_live_guide", new C0ULB());
        C771840UPm c771840UPm = this.LLLJIL;
        if (c771840UPm == null || (c0ulc = c771840UPm.LIZJ) == null) {
            return;
        }
        c0ulc.dismiss();
    }

    @Override // X.C0ULK
    public final void LJFF() throws Exception {
        C770660UKy c770660UKy = this.LLLJ;
        if (c770660UKy != null) {
            c770660UKy.LIZIZ(false);
        }
    }

    public final C20516015Pq getAnchorLevelUpNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b0s);
            this.LLJLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getAnchorLopAgeNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b0w);
            this.LLJLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getBannerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFFI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ipn);
            this.LLLFFI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final ScrollView getBannerScrollerView() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rrk);
            this.LLLIIII = (ScrollView) callbackFindViewById;
        }
        return (ScrollView) callbackFindViewById;
    }

    public final C20516015Pq getChangeOrientationWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dnq);
            this.LLJILLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCloseWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e2y);
            this.LLILZLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCoverWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f5x);
            this.LLILZIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getDecouplingContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLLFZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fhu);
            this.LLLFZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getDefinitionSelectionWidget() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iq9);
            this.LLJJL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getDualDevicePreviewContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rq5);
            this.LLLI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getFansClubWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ho4);
            this.LLJJJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C425960Gn4 getFlowLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.idc);
            this.LLJILJILJ = (C425960Gn4) callbackFindViewById;
        }
        return (C425960Gn4) callbackFindViewById;
    }

    public final C20516015Pq getGameDropsWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iqg);
            this.LLJJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGameEventContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iqi);
            this.LLLFF = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGameLiveHighlightWidgetFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ir5);
            this.LLJZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGpppaContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZIJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.j47);
            this.LLJZIJLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGuessWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.j9s);
            this.LLJILJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getHelpWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jlk);
            this.LLJJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getInGameRankBannerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kic);
            this.LLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveEventsWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mxs);
            this.LLJJIII = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveProNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n4d);
            this.LLJLILLLLZIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveStudioTipsWidgetFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n80);
            this.LLJLLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getMirrorCastWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.oh3);
            this.LLJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getMoreLessWidgetContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLLII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ol3);
            this.LLLII = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getNewGameBroadcastEducationWidgetFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p6m);
            this.LLJLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pfn);
            this.LLIZLLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getObsAccessRecallContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.phe);
            this.LLJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPartnershipWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q3c);
            this.LLJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPlayTogetherWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnr);
            this.LLJJJJJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPollWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rgi);
            this.LLJJJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPromoteWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.irq);
            this.LLJJJJLIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPsDropsContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.seb);
            this.LLLF = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C1324720kZq getRadioCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.spj);
            this.LLILZ = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C20516015Pq getReplayContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t72);
            this.LLJL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getSettingWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.is1);
            this.LLJJIJIIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getShareWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.is2);
            this.LLJJIJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStartLiveContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vyx);
            this.LLJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStreamGoalFirstLineContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wao);
            this.LLJJLIIIJLLLLLLLZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getSubscribeWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wil);
            this.LLJJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getTitleWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y3r);
            this.LLIZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    @Override // X.C0ULK
    public final void LIZIZ() {
        View viewFindViewById = findViewById(R.id.rrk);
        viewFindViewById.setFadingEdgeLength(0);
        viewFindViewById.getLayoutParams().height = -2;
        C770660UKy c770660UKy = this.LLLJ;
        if (c770660UKy != null) {
            c770660UKy.LJII = false;
        }
    }

    @Override // X.C0ULK
    public final void LJ() {
        if (C20441214yg.LIZJ()) {
            C20441214yg.LIZIZ("test_lzk_dynamic", "GameModeContainer onSelect");
        }
        C0THG.LIZ(this.LLILLL);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LLLJL) {
            DataChannelGlobal.LLILZ.JQ2(C931240aLC.class, Long.valueOf(jCurrentTimeMillis));
            this.LLLJL = false;
        }
        DataChannelGlobal.LLILZ.JQ2(C931250aLD.class, Long.valueOf(jCurrentTimeMillis));
        C0UKC.LIZ(C13LE.LIZ(PreviewCoverWidget.class), getCoverWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCloseWidget.class), getCloseWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewDecouplingCenterWidget.class), this.LLLIIIIL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCampaignCenterWidget.class), this.LLLIIIL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewLIVECenterWidget.class), this.LLLIIL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        ConstraintLayout constraintLayout = this.LLLILZJ;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundResource(R.drawable.f_k);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewRevisionCoverTitleWidget.class), this.LLLIILIL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewTitleWidget.class), getTitleWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCoverEditWidget.class), this.LLLIL, new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewPartnershipRevisionWidget.class), getPartnershipWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewStartLiveWidget.class), getStartLiveContainerFromXml(), new C13IQ[0], true);
        if (getDualDevicePreviewContainer() != null) {
            C20516015Pq dualDevicePreviewContainer = getDualDevicePreviewContainer();
            if (dualDevicePreviewContainer != null) {
                C500260Jjc.LLFFF(dualDevicePreviewContainer);
            }
            C0UKC.LIZ(C13LE.LIZ(PreviewDualDeviceRevisionWidget.class), getDualDevicePreviewContainer(), new C13IQ[0], true);
        }
        boolean value = TtliveGameGuideGuessEnableSetting.INSTANCE.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guessSwitch: ");
        sbLIZ.append(value);
        C20441214yg.LIZIZ("GameModeContainer", C2188811AlT.LIZIZ(sbLIZ));
        if (value) {
            C0UKC.LIZ(C13LE.LIZ(PreviewGuessingRevisionWidget.class), getGuessWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(GuessEnableChannel.class)}, true);
        }
        if (this.LLLJIL == null) {
            this.LLLJIL = new C771840UPm(this.LLILLL, this.LLLILZLLLI);
        }
        C771840UPm c771840UPm = this.LLLJIL;
        Boolean boolValueOf = c771840UPm != null ? Boolean.valueOf(c771840UPm.LIZ()) : null;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolValueOf, bool)) {
            return;
        }
        DataChannel dataChannel = this.LLLILZLLLI;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(PreviewStartLiveContinueMsgChannel.class), bool)) {
            C770780ULk.LL.LIZJ(this.LLLILZLLLI, getContext());
        }
        C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ())) - 28), getFlowLayoutFromXml());
        C0UKC.LIZ(C13LE.LIZ(PreviewOrientationRevisionWidget.class), getChangeOrientationWidgetContainerFromXml(), new C13IQ[0], true);
        if (C0UQN.LIZ()) {
            C0UKC.LIZ(C13LE.LIZ(PreviewCastRevisionWidget.class), getMirrorCastWidgetContainerFromXml(), new C13IQ[0], true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewPhoneCameraRevisionWidget.class), (C20516015Pq) findViewById(R.id.qax), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewGameDropsRevisionWidget.class), getGameDropsWidgetContainerFromXml(), new C13IQ[0], true);
        if (!((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount()) {
            C0UKC.LIZ(C13LE.LIZ(PreviewShareRevisionWidget.class), getShareWidgetContainerFromXml(), new C13IQ[0], true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewSettingRevisionWidget.class), getSettingWidgetContainerFromXml(), new C13IQ[0], true);
        C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.g6;
        Integer numLIZIZ = c20337914i1.LIZIZ();
        if (numLIZIZ.intValue() < 3) {
            C0UKC.LIZ(C13LE.LIZ(PreviewHelpRevisionWidget.class), getHelpWidgetContainerFromXml(), new C13IQ[0], true);
            c20337914i1.LJFF(Integer.valueOf(numLIZIZ.intValue() + 1));
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewFansClubRevisionWidget.class), getFansClubWidgetContainerFromXml(), new C13IQ[0], true);
        C0UFE c0ufeLIZ = C753070TgP.LIZ(this.LLLILZLLLI);
        C0UFE c0ufe = C0UFE.ON;
        if (c0ufeLIZ == c0ufe) {
            C0UKC.LIZ(C13LE.LIZ(PreviewCustomPollRevisionWidget.class), getPollWidgetContainerFromXml(), new C13IQ[0], true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewPlayTogetherRevisionWidget.class), getPlayTogetherWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(PlayTogetherEnableChannel.class)}, true);
        if (C753070TgP.LIZIZ(this.LLLILZLLLI) == c0ufe) {
            C0UKC.LIZ(C13LE.LIZ(PreviewPromoteRevisionWidget.class), getPromoteWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewDefinitionSelectionWidget.class), getDefinitionSelectionWidget(), new C13IQ[0], true);
        C425960Gn4 flowLayoutFromXml = getFlowLayoutFromXml();
        if (flowLayoutFromXml != null) {
            flowLayoutFromXml.setLineCurrentCallback(new AwS591S0100000_12(this, 894));
        }
    }

    public final Fragment getFragment() {
        return this.LLILLL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Boolean boolValueOf;
        if (motionEvent.getAction() == 0) {
            PreviewRevisionGameMoreWidget previewRevisionGameMoreWidget = (PreviewRevisionGameMoreWidget) C0UKC.LJFF(C13LE.LIZ(PreviewRevisionGameMoreWidget.class));
            if (previewRevisionGameMoreWidget != null) {
                boolValueOf = Boolean.valueOf(previewRevisionGameMoreWidget.G1(motionEvent.getY()));
            } else {
                boolValueOf = null;
            }
            this.LLLLIIIILLL = boolValueOf;
            this.LLLL = motionEvent.getX();
            this.LLLLII = motionEvent.getY();
        }
        boolean z = false;
        if (motionEvent.getAction() == 2) {
            float fAbs = (float) Math.abs(motionEvent.getY() - this.LLLLII);
            if (fAbs > ((float) Math.abs(motionEvent.getX() - this.LLLL)) && fAbs > 5.0f && Intrinsics.LJFF(this.LLLLIIIILLL, Boolean.TRUE)) {
                PreviewRevisionGameMoreWidget previewRevisionGameMoreWidget2 = (PreviewRevisionGameMoreWidget) C0UKC.LJFF(C13LE.LIZ(PreviewRevisionGameMoreWidget.class));
                if (previewRevisionGameMoreWidget2 != null) {
                    float y = motionEvent.getY();
                    float f = this.LLLLII;
                    if (y - f > 0.0f) {
                        z = true;
                    }
                    if (previewRevisionGameMoreWidget2.G1(f)) {
                        if (z) {
                            if (!previewRevisionGameMoreWidget2.LLILZLL) {
                                previewRevisionGameMoreWidget2.onClick(null);
                            }
                        } else if (previewRevisionGameMoreWidget2.LLILZLL) {
                            previewRevisionGameMoreWidget2.onClick(null);
                            return true;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void setAnchorLevelUpNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLIL = c20516015Pq;
    }

    public final void setAnchorLopAgeNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLL = c20516015Pq;
    }

    public final void setBannerContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLFFI = c20516015Pq;
    }

    public final void setBannerScrollerView(ScrollView scrollView) {
        this.LLLIIII = scrollView;
    }

    public final void setChangeOrientationWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILLL = c20516015Pq;
    }

    public final void setCloseWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZLL = c20516015Pq;
    }

    public final void setCoverWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZIL = c20516015Pq;
    }

    public final void setDecouplingContainer(C20516015Pq c20516015Pq) {
        this.LLLFZ = c20516015Pq;
    }

    public final void setDefinitionSelectionWidget(C20516015Pq c20516015Pq) {
        this.LLJJL = c20516015Pq;
    }

    public final void setDualDevicePreviewContainer(C20516015Pq c20516015Pq) {
        this.LLLI = c20516015Pq;
    }

    public final void setFansClubWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJIL = c20516015Pq;
    }

    public final void setFlowLayoutFromXml(C425960Gn4 c425960Gn4) {
        this.LLJILJILJ = c425960Gn4;
    }

    public final void setGameDropsWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJI = c20516015Pq;
    }

    public final void setGameEventContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLFF = c20516015Pq;
    }

    public final void setGameLiveHighlightWidgetFromXml(C20516015Pq c20516015Pq) {
        this.LLJZ = c20516015Pq;
    }

    public final void setGpppaContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJZIJLIL = c20516015Pq;
    }

    public final void setGuessWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILJIL = c20516015Pq;
    }

    public final void setHelpWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJIL = c20516015Pq;
    }

    public final void setInGameRankBannerContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLL = c20516015Pq;
    }

    public final void setLiveEventsWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIII = c20516015Pq;
    }

    public final void setLiveProNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLILLLLZIIL = c20516015Pq;
    }

    public final void setLiveStudioTipsWidgetFromXml(C20516015Pq c20516015Pq) {
        this.LLJLLL = c20516015Pq;
    }

    public final void setMirrorCastWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJ = c20516015Pq;
    }

    public final void setMoreLessWidgetContainer(C20516015Pq c20516015Pq) {
        this.LLLII = c20516015Pq;
    }

    public final void setNewGameBroadcastEducationWidgetFromXml(C20516015Pq c20516015Pq) {
        this.LLJLLIL = c20516015Pq;
    }

    public final void setNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZLLLIL = c20516015Pq;
    }

    public final void setObsAccessRecallContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJIJIL = c20516015Pq;
    }

    public final void setPartnershipWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJ = c20516015Pq;
    }

    public final void setPlayTogetherWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJJIL = c20516015Pq;
    }

    public final void setPollWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJ = c20516015Pq;
    }

    public final void setPromoteWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJLIIL = c20516015Pq;
    }

    public final void setPsDropsContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLF = c20516015Pq;
    }

    public final void setRadioCoverFromXml(C1324720kZq c1324720kZq) {
        this.LLILZ = c1324720kZq;
    }

    public final void setReplayContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJL = c20516015Pq;
    }

    public final void setSettingWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJIIJIL = c20516015Pq;
    }

    public final void setShareWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJI = c20516015Pq;
    }

    public final void setStartLiveContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJI = c20516015Pq;
    }

    public final void setStreamGoalFirstLineContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJLIIIJLLLLLLLZ = c20516015Pq;
    }

    public final void setSubscribeWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJ = c20516015Pq;
    }

    public final void setTitleWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZ = c20516015Pq;
    }

    public C0UL3(Fragment fragment, C0UL6 c0ul6) {
        C770660UKy c770660UKy;
        View viewFindViewById;
        super(fragment.requireContext(), R.layout.hhg);
        this.LLILLL = fragment;
        DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        this.LLLILZLLLI = dataChannelLJ;
        this.LLLIZZ = new C0ULE();
        if (c0ul6 != null) {
            c770660UKy = c0ul6.LIZIZ;
        } else {
            c770660UKy = null;
        }
        this.LLLJ = c770660UKy;
        this.LLLJL = true;
        C500260Jjc.LJJZ(C497740JfY.LJIJ(), findViewById(R.id.w0u));
        this.LLLIIIIL = (C20516015Pq) findViewById(R.id.mw5);
        this.LLLIIIL = (C20516015Pq) findViewById(R.id.d_y);
        this.LLLIIL = (C20516015Pq) findViewById(R.id.mvj);
        this.LLLIILIL = (C20516015Pq) findViewById(R.id.f5o);
        this.LLLIL = (C20516015Pq) findViewById(R.id.f54);
        this.LLLILZ = (ViewGroup) findViewById(R.id.ax2);
        this.LLLILZJ = (ConstraintLayout) findViewById(R.id.pxh);
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).iu1();
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).jN();
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).Oz0(fragment, dataChannelLJ);
        Map<String, Object> map = C1338270kvh.LIZ;
        C1548820qPI.LIZLLL("enter_game_live_guide", new C018V());
        if (!C011Z.LIZ.LJJII() && (viewFindViewById = findViewById(R.id.rrk)) != null) {
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: X.0UL9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        C769220UFk.LIZIZ(C769220UFk.LIZ, getContext(), null, findViewById(R.id.is4), findViewById(R.id.is5), false, 0.0f, true, false, 176);
        C466100IPo.LIZ(getContext(), getRadioCoverFromXml());
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(fragment, GameTagIdListForceUpdate.class, new AwS591S0100000_12(this, 864));
            dataChannelLJ.BQ2(fragment, PreviewMoreIsExpandDataGame.class, new AwS591S0100000_12(this, 865));
            dataChannelLJ.BQ2(fragment, PreviewCoverEditVisibilityChannel.class, new AwS591S0100000_12(this, 866));
        }
        this.LLLLIIIILLL = Boolean.FALSE;
    }
}
