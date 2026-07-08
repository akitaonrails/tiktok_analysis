package X;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.broadcast.LiveGoalFeatureEnableChannel;
import com.bytedance.android.livesdk.broadcast.LivePreviewWidgetsLoaded;
import com.bytedance.android.livesdk.broadcast.preview.widget.GamePreviewDecouplingWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveAccessRecallWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewApplyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDefinitionSelectionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGameDualDeviceWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewInGameRankBannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewTitleWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewToolGuessWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.GamePreviewLOPAgeAssuranceNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.GamePreviewLevelUpNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livepro.GamePreviewLiveProNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.PreviewLiveStudioTipsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.notify.PreviewCommonNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameDropsPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameEventPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameGpppaPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.AccessRecallVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.GameFirstGoLiveTs;
import com.bytedance.android.livesdk.dataChannel.GameTagIdListForceUpdate;
import com.bytedance.android.livesdk.dataChannel.GuessEnableChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveGoalVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveSimplifiedVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveStudioTagShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewStartLiveContinueMsgChannel;
import com.bytedance.android.livesdk.dataChannel.ReplayInfluenceBannerChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameLiveSupportDecoupling;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameGuideGuessEnableSetting;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UL4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UL4 extends C0ULK {
    public static final /* synthetic */ int LLLILZLLLI = 0;
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
    public C20516015Pq LLLIIII;
    public ScrollView LLLIIIIL;
    public final DataChannel LLLIIIL;
    public final C0ULE LLLIIL;
    public final C770660UKy LLLIILIL;
    public C771840UPm LLLIL;
    public boolean LLLILZ;
    public AnonymousClass0956 LLLILZJ;

    @Override // X.C0ULK
    public final void LIZ() {
        C770660UKy c770660UKy = this.LLLIILIL;
        if (c770660UKy != null) {
            c770660UKy.LIZJ.clear();
            c770660UKy.LIZLLL.clear();
            c770660UKy.LJII = true;
        }
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 775);
        C426160GnO flowLayoutFromXml = getFlowLayoutFromXml();
        if (flowLayoutFromXml != null) {
            flowLayoutFromXml.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC785940UsK(awS556S0100000_12, 2));
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
        DataChannel dataChannel = this.LLLIIIL;
        if (dataChannel != null) {
            dataChannel.FQ2(LivePreviewWidgetsLoaded.class);
        }
    }

    @Override // X.C0ULK
    public final void LIZLLL() throws Exception {
        C0ULC c0ulc;
        AnonymousClass0956 anonymousClass0956 = this.LLLILZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLILZJ = null;
        C770660UKy c770660UKy = this.LLLIILIL;
        if (c770660UKy != null) {
            c770660UKy.LIZIZ(true);
        }
        this.LLLIIL.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        C1548820qPI.LJIIIIZZ("enter_game_live_guide", new C0ULB());
        C771840UPm c771840UPm = this.LLLIL;
        if (c771840UPm == null || (c0ulc = c771840UPm.LIZJ) == null) {
            return;
        }
        c0ulc.dismiss();
    }

    @Override // X.C0ULK
    public final void LJFF() throws Exception {
        AnonymousClass0956 anonymousClass0956 = this.LLLILZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C770660UKy c770660UKy = this.LLLIILIL;
        if (c770660UKy != null) {
            c770660UKy.LIZIZ(true);
        }
    }

    public final void LJII() {
        DataChannel dataChannel = this.LLLIIIL;
        if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(LiveGoalFeatureEnableChannel.class), Boolean.FALSE)) {
            if (!LiveLOP0OptSetting.INSTANCE.enable()) {
                C0UKC.LIZ(C13LE.LIZ(LiveGoalPreviewWidget.class), getStreamGoalFirstLineContainerFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(LiveGoalVisibilityChannel.class)}, true);
            } else if (C753070TgP.LJFF(this.LLLIIIL, AFwS245S0000000_12.get$arr$(129), null) == C0UFE.ON) {
                C0UKC.LIZ(C13LE.LIZ(LiveGoalPreviewWidget.class), getStreamGoalFirstLineContainerFromXml(), new C13IQ[]{C13LE.LIZ(AccessRecallVisibilityChannel.class), C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(LiveGoalVisibilityChannel.class)}, true);
            } else {
                C500260Jjc.LJIILIIL(getStreamGoalFirstLineContainerFromXml());
            }
        }
    }

    public final C20516015Pq getAnchorLevelUpNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b0s);
            this.LLJLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getAnchorLopAgeNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b0w);
            this.LLJLLL = (C20516015Pq) callbackFindViewById;
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

    public final C20516015Pq getBannerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.brb);
            this.LLLI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final ScrollView getBannerScrollerView() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rrk);
            this.LLLIIIIL = (ScrollView) callbackFindViewById;
        }
        return (ScrollView) callbackFindViewById;
    }

    public final C20516015Pq getChangeOrientationWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dnq);
            this.LLJJIII = (C20516015Pq) callbackFindViewById;
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

    public final C20516015Pq getCustomWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fdt);
            this.LLJJL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getDecouplingContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLLII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fhu);
            this.LLLII = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getDefinitionSelectionWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fke);
            this.LLJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getDualDevicePreviewContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLLIIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rq5);
            this.LLLIIII = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getFansClubWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ho4);
            this.LLJJJJLIIL = (C20516015Pq) callbackFindViewById;
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

    public final C20516015Pq getGameDropsWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iqg);
            this.LLJJIJIIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGameEventContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iqi);
            this.LLLFZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGameLiveHighlightWidgetFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ir5);
            this.LLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGpppaContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.j47);
            this.LLLF = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getGuessWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.j9s);
            this.LLJILLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getHashtagContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jgy);
            this.LLJILJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getHelpWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jlk);
            this.LLJJJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getInGameRankBannerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFF;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kic);
            this.LLLFF = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveEventsWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mxs);
            this.LLJJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveProNotifyContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n4d);
            this.LLJLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveStudioTipsWidgetFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZIJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n80);
            this.LLJZIJLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getMirrorCastWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.oh3);
            this.LLJJIJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getNewGameBroadcastEducationWidgetFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p6m);
            this.LLJZ = (C20516015Pq) callbackFindViewById;
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
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.phe);
            this.LLJILJILJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPartnershipWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q3c);
            this.LLJI = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPlayTogetherWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnr);
            this.LLJJLIIIJLLLLLLLZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPromoteWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.s_u);
            this.LLJL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPsDropsContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLLFFI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.seb);
            this.LLLFFI = (C20516015Pq) callbackFindViewById;
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
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t72);
            this.LLJLILLLLZIIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getSettingWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uvz);
            this.LLJJJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getShareWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v30);
            this.LLJJJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStartLiveContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vyx);
            this.LLJIJIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getStreamGoalFirstLineContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wao);
            this.LLJLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getSubscribeWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wil);
            this.LLJJJJJIL = (C20516015Pq) callbackFindViewById;
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
        View viewFindViewById = findViewById(R.id.iqo);
        if (viewFindViewById != null) {
            C500260Jjc.LJIILIIL(viewFindViewById);
        }
        View viewFindViewById2 = findViewById(R.id.rrk);
        viewFindViewById2.setFadingEdgeLength(0);
        viewFindViewById2.getLayoutParams().height = -2;
        C770660UKy c770660UKy = this.LLLIILIL;
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
        if (this.LLLILZ) {
            DataChannelGlobal.LLILZ.JQ2(C931240aLC.class, Long.valueOf(jCurrentTimeMillis));
            this.LLLILZ = false;
        }
        DataChannelGlobal.LLILZ.JQ2(C931250aLD.class, Long.valueOf(jCurrentTimeMillis));
        C0UKC.LIZ(C13LE.LIZ(PreviewCoverWidget.class), getCoverWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCloseWidget.class), getCloseWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewTitleWidget.class), getTitleWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewCommonNotifyWidget.class), getNotifyContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewDefinitionSelectionWidget.class), getDefinitionSelectionWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewPartnershipWidget.class), getPartnershipWidgetContainerFromXml(), new C13IQ[0], true);
        this.LLLILZJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLL), null, null, new C754340TiS(this, null), 3);
        C19719912Dl c19719912DlRH = C781270Ukn.LJIIIZ().RH();
        if (!(c19719912DlRH instanceof C13IQ)) {
            c19719912DlRH = null;
        }
        if (c19719912DlRH != null) {
            C0UKC.LIZ(c19719912DlRH, getHashtagContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class), C13LE.LIZ(AccessRecallVisibilityChannel.class)}, true);
        }
        if (LiveGameLiveSupportDecoupling.INSTANCE.enable() && getDecouplingContainer() != null) {
            GamePreviewDecouplingWidget gamePreviewDecouplingWidget = (GamePreviewDecouplingWidget) C0UKC.LIZ(C13LE.LIZ(GamePreviewDecouplingWidget.class), getDecouplingContainer(), new C13IQ[]{C13LE.LIZ(StickerDialogShowChannel.class), C13LE.LIZ(EffectDialogShowChannel.class), C13LE.LIZ(LiveGoalDialogShowChannel.class), C13LE.LIZ(LiveSimplifiedVisibilityChannel.class)}, true);
            C426160GnO flowLayoutFromXml = getFlowLayoutFromXml();
            if (flowLayoutFromXml != null) {
                gamePreviewDecouplingWidget.LLIZLLLIL = flowLayoutFromXml;
            }
        }
        if (getDualDevicePreviewContainer() != null) {
            C20516015Pq dualDevicePreviewContainer = getDualDevicePreviewContainer();
            if (dualDevicePreviewContainer != null) {
                C500260Jjc.LLFFF(dualDevicePreviewContainer);
            }
            C0UKC.LIZ(C13LE.LIZ(PreviewGameDualDeviceWidget.class), getDualDevicePreviewContainer(), new C13IQ[0], true);
        }
        C0UKC.LIZ(C13LE.LIZ(LiveAccessRecallWidget.class), getObsAccessRecallContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class)}, true);
        DataChannel dataChannel = this.LLLIIIL;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(LiveGoalFeatureEnableChannel.class), Boolean.TRUE)) {
            LJII();
        }
        boolean value = TtliveGameGuideGuessEnableSetting.INSTANCE.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guessSwitch: ");
        sbLIZ.append(value);
        C20441214yg.LIZIZ("GameModeContainer", C2188811AlT.LIZIZ(sbLIZ));
        if (value) {
            C0UKC.LIZ(C13LE.LIZ(PreviewToolGuessWidget.class), getGuessWidgetContainerFromXml(), new C13IQ[]{C13LE.LIZ(GuessEnableChannel.class)}, true);
        }
        C0UKC.LIZ(C13LE.LIZ(PreviewApplyWidget.class), getApplyWidgetContainerFromXml(), new C13IQ[0], true);
        PreviewApplyWidget previewApplyWidget = (PreviewApplyWidget) C0UKC.LJFF(C13LE.LIZ(PreviewApplyWidget.class));
        if (previewApplyWidget != null) {
            previewApplyWidget.LLJ = getFlowLayoutFromXml();
        }
        if (this.LLLIL == null) {
            this.LLLIL = new C771840UPm(this.LLILLL, this.LLLIIIL);
        }
        C771840UPm c771840UPm = this.LLLIL;
        Boolean boolValueOf = c771840UPm != null ? Boolean.valueOf(c771840UPm.LIZ()) : null;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolValueOf, bool)) {
            return;
        }
        DataChannel dataChannel2 = this.LLLIIIL;
        if (dataChannel2 != null && Intrinsics.LJFF(dataChannel2.gg0(PreviewStartLiveContinueMsgChannel.class), bool)) {
            C770780ULk.LL.LIZJ(this.LLLIIIL, getContext());
        }
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 773);
        if (C0UOJ.LIZIZ() && !C0UOJ.LIZJ()) {
            this.LLILLL.getContext();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    Long lLIZIZ = InterfaceC772390URp.g.LIZIZ();
                    Long lLIZIZ2 = InterfaceC772390URp.h.LIZIZ();
                    long j = C0UOJ.LJFF;
                    if (lLIZIZ2 == null || lLIZIZ2.longValue() != j) {
                        C20441214yg.LIZIZ("test_lzk_dynamic", "GameModeContainer - initDynamicStrategy user change");
                    } else {
                        C0UOJ.LJ(lLIZIZ.longValue(), AFwS199S0000000_12.get$arr$(344));
                        C20441214yg.LIZIZ("test_lzk_dynamic", "GameModeContainer - initDynamicStrategy load firstTimestamp from local");
                    }
                    if (C0UOJ.LIZJ()) {
                        awS556S0100000_12.invoke();
                        return;
                    }
                    DataChannel dataChannel3 = this.LLLIIIL;
                    if (dataChannel3 != null) {
                        dataChannel3.EQ2(this.LLILLL, GameFirstGoLiveTs.class, new AwS591S0100000_12(awS556S0100000_12, 863));
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        awS556S0100000_12.invoke();
    }

    public final Fragment getFragment() {
        return this.LLILLL;
    }

    public final void setAnchorLevelUpNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLL = c20516015Pq;
    }

    public final void setAnchorLopAgeNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLLL = c20516015Pq;
    }

    public final void setApplyWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJ = c20516015Pq;
    }

    public final void setBannerContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLI = c20516015Pq;
    }

    public final void setBannerScrollerView(ScrollView scrollView) {
        this.LLLIIIIL = scrollView;
    }

    public final void setChangeOrientationWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIII = c20516015Pq;
    }

    public final void setCloseWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZLL = c20516015Pq;
    }

    public final void setCoverWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZIL = c20516015Pq;
    }

    public final void setCustomWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJL = c20516015Pq;
    }

    public final void setDecouplingContainer(C20516015Pq c20516015Pq) {
        this.LLLII = c20516015Pq;
    }

    public final void setDefinitionSelectionWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJ = c20516015Pq;
    }

    public final void setDualDevicePreviewContainer(C20516015Pq c20516015Pq) {
        this.LLLIIII = c20516015Pq;
    }

    public final void setFansClubWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJLIIL = c20516015Pq;
    }

    public final void setFlowLayoutFromXml(C426160GnO c426160GnO) {
        this.LLJJI = c426160GnO;
    }

    public final void setGameDropsWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJIIJIL = c20516015Pq;
    }

    public final void setGameEventContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLFZ = c20516015Pq;
    }

    public final void setGameLiveHighlightWidgetFromXml(C20516015Pq c20516015Pq) {
        this.LLL = c20516015Pq;
    }

    public final void setGpppaContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLF = c20516015Pq;
    }

    public final void setGuessWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILLL = c20516015Pq;
    }

    public final void setHashtagContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILJIL = c20516015Pq;
    }

    public final void setHelpWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJ = c20516015Pq;
    }

    public final void setInGameRankBannerContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLFF = c20516015Pq;
    }

    public final void setLiveEventsWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJIL = c20516015Pq;
    }

    public final void setLiveProNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLLIL = c20516015Pq;
    }

    public final void setLiveStudioTipsWidgetFromXml(C20516015Pq c20516015Pq) {
        this.LLJZIJLIL = c20516015Pq;
    }

    public final void setMirrorCastWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJIJI = c20516015Pq;
    }

    public final void setNewGameBroadcastEducationWidgetFromXml(C20516015Pq c20516015Pq) {
        this.LLJZ = c20516015Pq;
    }

    public final void setNotifyContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZLLLIL = c20516015Pq;
    }

    public final void setObsAccessRecallContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJILJILJ = c20516015Pq;
    }

    public final void setPartnershipWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJI = c20516015Pq;
    }

    public final void setPlayTogetherWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJLIIIJLLLLLLLZ = c20516015Pq;
    }

    public final void setPromoteWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJL = c20516015Pq;
    }

    public final void setPsDropsContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLLFFI = c20516015Pq;
    }

    public final void setRadioCoverFromXml(C1324720kZq c1324720kZq) {
        this.LLILZ = c1324720kZq;
    }

    public final void setReplayContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLILLLLZIIL = c20516015Pq;
    }

    public final void setSettingWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJIL = c20516015Pq;
    }

    public final void setShareWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJ = c20516015Pq;
    }

    public final void setStartLiveContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJIJIL = c20516015Pq;
    }

    public final void setStreamGoalFirstLineContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJLIL = c20516015Pq;
    }

    public final void setSubscribeWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJJJJJIL = c20516015Pq;
    }

    public final void setTitleWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZ = c20516015Pq;
    }

    public C0UL4(Fragment fragment, C0UL6 c0ul6) {
        C770660UKy c770660UKy;
        View viewFindViewById;
        super(fragment.getContext(), R.layout.hhd);
        this.LLILLL = fragment;
        DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        this.LLLIIIL = dataChannelLJ;
        this.LLLIIL = new C0ULE();
        if (c0ul6 != null) {
            c770660UKy = c0ul6.LIZIZ;
        } else {
            c770660UKy = null;
        }
        this.LLLIILIL = c770660UKy;
        this.LLLILZ = true;
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).iu1();
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).jN();
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).Oz0(fragment, dataChannelLJ);
        Map<String, Object> map = C1338270kvh.LIZ;
        C1548820qPI.LIZLLL("enter_game_live_guide", new C018V());
        if (!C011Z.LIZ.LJJII() && (viewFindViewById = findViewById(R.id.rrk)) != null) {
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: X.0UL8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        C466100IPo.LIZ(getContext(), getRadioCoverFromXml());
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(fragment, LiveGoalFeatureEnableChannel.class, new AwS591S0100000_12(this, 852));
            dataChannelLJ.BQ2(fragment, GameTagIdListForceUpdate.class, new AwS591S0100000_12(this, 853));
        }
        findViewById(R.id.uu7);
    }
}
