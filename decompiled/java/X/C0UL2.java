package X;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.PreviewCoverEditVisibilityChannel;
import com.bytedance.android.livesdk.broadcast.LiveGoalFeatureEnableChannel;
import com.bytedance.android.livesdk.broadcast.LivePreviewWidgetsLoaded;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCommercialRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCoverEditWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCustomPollRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuessingRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPlayTogetherRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewPromoteRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionCoverTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livepro.GamePreviewLiveProNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.PreviewLiveStudioTipsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewCommonNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameDropsPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameGpppaPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewLIVECenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewStartLiveWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.upsell.PreviewFansClubRevisionWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.GuessEnableChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveStudioTagShowChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayEnableChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayInfluenceBannerChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameGuideGuessEnableSetting;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalAnchorAccessControlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameObsLiveGoalAndGuessingAdaptSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UL2, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UL2 extends C0ULK {
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
    public C20516015Pq LLJILJILJ;
    public C20516015Pq LLJILLL;
    public C20516015Pq LLJJ;
    public C20516015Pq LLJJI;
    public C20516015Pq LLJJIII;
    public C426160GnO LLJJIJI;
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
    public final C770660UKy LLJLLIL;
    public final DataChannel LLJLLL;
    public C20516015Pq LLJZ;
    public C20516015Pq LLJZIJLIL;
    public C20516015Pq LLL;
    public ViewGroup LLLF;
    public ConstraintLayout LLLFF;

    @Override // X.C0ULK
    public final void LIZ() {
        C770660UKy c770660UKy = this.LLJLLIL;
        if (c770660UKy != null) {
            c770660UKy.LIZJ.clear();
            c770660UKy.LIZLLL.clear();
            c770660UKy.LJII = true;
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewCommonNotifyWidget.class), getNotifyContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(LiveAccessRecallWidget.class), getObsAccessRecallContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewLiveStudioTipsWidget.class), getLiveStudioTipsWidgetFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(LiveStudioTagShowChannel.class)}, true);
        C19719912Dl c19719912DlXG0 = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).xG0();
        if ((c19719912DlXG0 instanceof C13IQ) && c19719912DlXG0 != null) {
            C0UKC.LIZ(c19719912DlXG0, getGameLiveHighlightWidgetFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewReplayWidget.class), getReplayContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(ReplayEnableChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(GameGpppaPreviewBanner.class), getGpppaContainerFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        if (GameLivePartnershipDropsSetting.INSTANCE.getConfig().enable) {
            C0UKC.LIZ(C13LE.LIZ(GameDropsPreviewBanner.class), getPsDropsContainerFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(GamePreviewLiveProNotifyWidget.class), getLiveProNotifyContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class)}, true);
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
    public final void LIZIZ() {
        C770660UKy c770660UKy = this.LLJLLIL;
        if (c770660UKy != null) {
            c770660UKy.LJII = false;
        }
    }

    @Override // X.C0ULK
    public final void LIZJ() {
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel != null) {
            dataChannel.FQ2(LivePreviewWidgetsLoaded.class);
        }
    }

    @Override // X.C0ULK
    public final void LIZLLL() throws Exception {
        C770660UKy c770660UKy = this.LLJLLIL;
        if (c770660UKy != null) {
            c770660UKy.LIZIZ(true);
        }
    }

    @Override // X.C0ULK
    public final void LJ() {
        C0UKC.LIZ(C13LE.LIZ(PreviewLIVECenterWidget.class), this.LLJZ, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCoverWidget.class), getCoverWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCloseWidget.class), getCloseWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewTitleWidget.class), getTitleWidgetContainerFromXml(), new C13IQ[0], true);
        ConstraintLayout constraintLayout = this.LLLFF;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundResource(R.drawable.f_k);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewSettingRevisionWidget.class), getSettingWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewPartnershipRevisionWidget.class), getPartnershipWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewGameDropsRevisionWidget.class), getGameDropsWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewStartLiveWidget.class), getStartLiveContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewRevisionCoverTitleWidget.class), this.LLJZIJLIL, new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCoverEditWidget.class), this.LLL, new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewFansClubRevisionWidget.class), getFansClubWidgetContainerFromXml(), new C13IQ[0], true);
        if (C753070TgP.LIZ(this.LLJLLL) == C0UFE.ON) {
            C0UKC.LIZ(C13LE.LIZ(PreviewCustomPollRevisionWidget.class), getPollWidgetContainerFromXml(), new C13IQ[0], true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewPlayTogetherRevisionWidget.class), getPlayTogetherWidgetContainerFromXml(), new C13IQ[0], true);
        if (!((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount()) {
            C0UKC.LIZ(C13LE.LIZ(PreviewShareRevisionWidget.class), getShareWidgetContainerFromXml(), new C13IQ[0], true);
        }
        boolean value = TtliveGameGuideGuessEnableSetting.INSTANCE.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guessSwitch: ");
        sbLIZ.append(value);
        C20441214yg.LIZIZ("ObsModeContainerRevision", C2188811AlT.LIZIZ(sbLIZ));
        if (value) {
            C0UKC.LIZ(C13LE.LIZ(PreviewGuessingRevisionWidget.class), getGuessWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(GuessEnableChannel.class)}, true);
        }
        TtliveGameObsLiveGoalAndGuessingAdaptSetting ttliveGameObsLiveGoalAndGuessingAdaptSetting = TtliveGameObsLiveGoalAndGuessingAdaptSetting.INSTANCE;
        C20516015Pq hashtagContainer2FromXml = ttliveGameObsLiveGoalAndGuessingAdaptSetting.enable() ? getHashtagContainer2FromXml() : getHashtagContainerFromXml();
        C19719912Dl c19719912DlRH = C781270Ukn.LJIIIZ().RH();
        if ((c19719912DlRH instanceof C13IQ) && c19719912DlRH != null) {
            C0UKC.LIZ(c19719912DlRH, hashtagContainer2FromXml, new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewCommercialRevisionWidget.class), getBusinessWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        C0UKC.LIZ(C13LE.LIZ(PreviewPromoteRevisionWidget.class), getPromoteWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        if (ttliveGameObsLiveGoalAndGuessingAdaptSetting.enable() && LiveGoalAnchorAccessControlSetting.INSTANCE.showPreviewWidget()) {
            DataChannel dataChannel = this.LLJLLL;
            if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(LiveGoalFeatureEnableChannel.class), Boolean.TRUE)) {
                DataChannel dataChannel2 = this.LLJLLL;
                if (dataChannel2 != null) {
                    dataChannel2.EQ2(this.LLILLL, LiveGoalFeatureEnableChannel.class, new AwS591S0100000_12(this, 900));
                }
            } else {
                LJIIIIZZ();
            }
        }
        C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ())) - 28), getFlowLayoutFromXml());
    }

    @Override // X.C0ULK
    public final void LJFF() throws Exception {
        C770660UKy c770660UKy = this.LLJLLIL;
        if (c770660UKy != null) {
            c770660UKy.LIZIZ(false);
        }
    }

    public final void LJII() {
        C0UKC.LIZ(C13LE.LIZ(LiveGoalPreviewWidget.class), getStreamGoalFirstLineContainerFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(LiveGoalVisibilityChannel.class)}, true);
    }

    public final void LJIIIIZZ() {
        if (!LiveLOP0OptSetting.INSTANCE.enable()) {
            LJII();
        } else if (C753070TgP.LJFF(this.LLJLLL, AFwS245S0000000_12.get$arr$(129), null) == C0UFE.ON) {
            LJII();
        } else {
            C500260Jjc.LJIILIIL(getStreamGoalFirstLineContainerFromXml());
        }
    }

    public final C20516015Pq getBannerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cjw);
            this.LLJLL = (C20516015Pq) callbackFindViewById;
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

    public final C20516015Pq getFansClubWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ho4);
            this.LLJILLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C426160GnO getFlowLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.idc);
            this.LLJJIJI = (C426160GnO) callbackFindViewById;
        }
        return (C426160GnO) callbackFindViewById;
    }

    public final C20516015Pq getGameDropsWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iqg);
            this.LLJILJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGameLiveHighlightWidgetFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ir5);
            this.LLJJLIIIJLLLLLLLZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGpppaContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.j47);
            this.LLJLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGuessWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.j9s);
            this.LLJJIII = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getHashtagContainer2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jgz);
            this.LLJJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getHashtagContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jgy);
            this.LLJJJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveProNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n4d);
            this.LLJJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveStudioTipsWidgetFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n80);
            this.LLJJL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pfn);
            this.LLJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getObsAccessRecallContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.phe);
            this.LLJJIJIIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPartnershipWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q3c);
            this.LLJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPlayTogetherWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnr);
            this.LLJJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPollWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rgi);
            this.LLJJ = (C20516015Pq) callbackFindViewById;
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

    public final C20516015Pq getPsDropsContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.seb);
            this.LLJLILLLLZIIL = (C20516015Pq) callbackFindViewById;
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
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uvz);
            this.LLJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getShareWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v30);
            this.LLIZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStartLiveContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vyx);
            this.LLJILJILJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStreamGoalFirstLineContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wao);
            this.LLJJJJLIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getTitleWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y3r);
            this.LLIZLLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final Fragment getFragment() {
        return this.LLILLL;
    }

    public final void setBannerContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLL = c20516015Pq;
    }

    public final void setBusinessWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJ = c20516015Pq;
    }

    public final void setCloseWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZLL = c20516015Pq;
    }

    public final void setCoverWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZIL = c20516015Pq;
    }

    public final void setFansClubWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILLL = c20516015Pq;
    }

    public final void setFlowLayoutFromXml(C426160GnO c426160GnO) {
        this.LLJJIJI = c426160GnO;
    }

    public final void setGameDropsWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILJIL = c20516015Pq;
    }

    public final void setGameLiveHighlightWidgetFromXml(C20516015Pq c20516015Pq) {
        this.LLJJLIIIJLLLLLLLZ = c20516015Pq;
    }

    public final void setGpppaContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLIL = c20516015Pq;
    }

    public final void setGuessWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIII = c20516015Pq;
    }

    public final void setHashtagContainer2FromXml(C20516015Pq c20516015Pq) {
        this.LLJJJ = c20516015Pq;
    }

    public final void setHashtagContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJIL = c20516015Pq;
    }

    public final void setLiveProNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJIL = c20516015Pq;
    }

    public final void setLiveStudioTipsWidgetFromXml(C20516015Pq c20516015Pq) {
        this.LLJJL = c20516015Pq;
    }

    public final void setNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJ = c20516015Pq;
    }

    public final void setObsAccessRecallContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJIIJIL = c20516015Pq;
    }

    public final void setPartnershipWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJIJIL = c20516015Pq;
    }

    public final void setPlayTogetherWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJI = c20516015Pq;
    }

    public final void setPollWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJ = c20516015Pq;
    }

    public final void setPromoteWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJJIL = c20516015Pq;
    }

    public final void setPsDropsContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLILLLLZIIL = c20516015Pq;
    }

    public final void setRadioCoverFromXml(C1324720kZq c1324720kZq) {
        this.LLILZ = c1324720kZq;
    }

    public final void setReplayContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJL = c20516015Pq;
    }

    public final void setSettingWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJI = c20516015Pq;
    }

    public final void setShareWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZ = c20516015Pq;
    }

    public final void setStartLiveContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILJILJ = c20516015Pq;
    }

    public final void setStreamGoalFirstLineContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJLIIL = c20516015Pq;
    }

    public final void setTitleWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZLLLIL = c20516015Pq;
    }

    public C0UL2(Fragment fragment, C0UL6 c0ul6) {
        C770660UKy c770660UKy;
        View viewFindViewById;
        super(fragment.requireContext(), R.layout.hhx);
        this.LLILLL = fragment;
        if (c0ul6 != null) {
            c770660UKy = c0ul6.LIZ;
        } else {
            c770660UKy = null;
        }
        this.LLJLLIL = c770660UKy;
        DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        this.LLJLLL = dataChannelLJ;
        C500260Jjc.LJJZ(C497740JfY.LJIJ(), findViewById(R.id.w0u));
        this.LLLFF = (ConstraintLayout) findViewById(R.id.pxh);
        findViewById(R.id.mw5);
        findViewById(R.id.d_y);
        this.LLJZ = (C20516015Pq) findViewById(R.id.mvj);
        this.LLJZIJLIL = (C20516015Pq) findViewById(R.id.f5o);
        this.LLL = (C20516015Pq) findViewById(R.id.f54);
        this.LLLF = (ViewGroup) findViewById(R.id.ax2);
        if (!C011Z.LIZ.LJJII() && (viewFindViewById = findViewById(R.id.rrk)) != null) {
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ULD
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        C769220UFk.LIZIZ(C769220UFk.LIZ, getContext(), null, findViewById(R.id.phi), findViewById(R.id.phj), false, 0.0f, true, false, 176);
        C466100IPo.LIZ(getContext(), getRadioCoverFromXml());
        C0UJK.LIZ();
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(fragment, PreviewCoverEditVisibilityChannel.class, new AwS591S0100000_12(this, 899));
        }
    }
}
