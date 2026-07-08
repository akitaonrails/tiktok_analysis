package Y;

import X.AbstractC1273900jFs;
import X.AbstractC785360UrO;
import X.C001A;
import X.C0IJT;
import X.C0U3O;
import X.C0U3P;
import X.C0U3Q;
import X.C0U4R;
import X.C0U78;
import X.C0UE0;
import X.C0UE7;
import X.C0UF9;
import X.C0UGY;
import X.C0UHA;
import X.C0UI0;
import X.C0UIM;
import X.C0UVE;
import X.C0UVZ;
import X.C0UWA;
import X.C0UX6;
import X.C1078580eAq;
import X.C1111930f2d;
import X.C1148180fz6;
import X.C1161920gLG;
import X.C19322110iZ;
import X.C19EG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import X.C497420Jf2;
import X.C500260Jjc;
import X.C520010KaN;
import X.C748880TZe;
import X.C756830TmT;
import X.C757730Tnv;
import X.C757740Tnw;
import X.C758370Tox;
import X.C765720U1y;
import X.C766270U4b;
import X.C767020U6y;
import X.C768460UCm;
import X.C768680UDi;
import X.C768790UDt;
import X.C768810UDv;
import X.C768820UDw;
import X.C769010UEp;
import X.C769470UGj;
import X.C769490UGl;
import X.C769500UGm;
import X.C769630UGz;
import X.C773220UUu;
import X.C773300UVc;
import X.C773310UVd;
import X.C773830UXd;
import X.C776250Uch;
import X.C781270Ukn;
import X.C781930Ulr;
import X.C781940Uls;
import X.C786410Ut5;
import X.C842240X2g;
import X.C930540aK4;
import X.EnumC1102750enp;
import X.EnumC748580TYa;
import X.EnumC776090UcR;
import X.InterfaceC1097760efm;
import X.InterfaceC1112060f2q;
import X.InterfaceC1268640j7O;
import X.InterfaceC765730U1z;
import X.InterfaceC769000UEo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.broadcast.BroadcastLiveBoardEvent;
import com.bytedance.android.live.broadcast.api.FloatWindowCoHostEvent;
import com.bytedance.android.live.broadcast.api.StickerShortcutPanelChannel;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.NoNewInsertStickerInPreviewEvent;
import com.bytedance.android.live.effect.api.ScrollToInsertStickerEvent;
import com.bytedance.android.live.effect.api.SelectH5StickerInPreview;
import com.bytedance.android.live.effect.livegoal.LiveGoalBackgroundDialogFragment;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractUnifiedStateChangeChannel;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.api.OpenMultiLivePanelEvent;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common.AbsMultiGuestNewPreviewViewModel;
import com.bytedance.android.live.moderator.IModeratorService;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.LiveECShopShowEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.broadcast.aisummary.LiveAISummaryDialogFragment;
import com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveShowMoreDialogEvent;
import com.bytedance.android.livesdk.dataChannel.PerceptionMessageChannel;
import com.bytedance.android.livesdk.dataChannel.ShowInteractionFeatureDialogEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LyraxSceneStrategySettings;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceConfigSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalPresetWebLinkSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveModeratorNewSuggestionSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.BeansArtifacts;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdkapi.depend.model.live.KaraokeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.DialogController;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS296S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class AObjectS355S0100000_12 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            default:
                return null;
        }
    }

    public AObjectS355S0100000_12(DataChannel dataChannel, int i) {
        this.$t = i;
        if (17 - i != 0) {
            this.l0 = dataChannel;
        } else {
            this.l0 = dataChannel;
        }
    }

    public static final Object invoke$0(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        C0U3O c0u3o = (C0U3O) obj;
        c0u3o.LJFF(new AwS591S0100000_12((LiveGoalBackgroundDialogFragment) aObjectS355S0100000_12.l0, 86));
        c0u3o.LIZIZ(AFwS296S0000000_12.get$arr$(3));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) aObjectS355S0100000_12.l0;
        Iterator it2 = ((PriorityBlockingQueue) bottomLeftSlotWidget.LLJI).iterator();
        while (it2.hasNext()) {
            ((IIconSlot.SlotViewModel) ((HashMap) bottomLeftSlotWidget.LLJIJIL).get(it2.next())).LLILZIL.postValue(obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        ((AbstractC785360UrO) aObjectS355S0100000_12.l0).LJJIIJ(true);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        return Integer.valueOf(((C1111930f2d) aObjectS355S0100000_12.l0).LLIFFJFJJ((InterfaceC1112060f2q) obj));
    }

    public static final Object invoke$12(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        InterfaceC769000UEo interfaceC769000UEo = ((GuestMediaManageFragment) aObjectS355S0100000_12.l0).LLLLJ;
        if (interfaceC769000UEo instanceof C0U78) {
            AbsMultiGuestNewPreviewViewModel.vQ2((C0U78) interfaceC769000UEo);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        Object obj2;
        GuestMediaManageFragment guestMediaManageFragment = (GuestMediaManageFragment) aObjectS355S0100000_12.l0;
        if (guestMediaManageFragment.LLLLILI && (obj2 = guestMediaManageFragment.LLILLJJLI) != null && (obj2 instanceof SurfaceView)) {
            View view = (View) obj2;
            if (view.getParent() != null && view.getParent() != guestMediaManageFragment.LLJJIJIL) {
                C930540aK4.LJJIJL(view);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, 0, 0, 0);
                C786410Ut5.U5((SurfaceView) guestMediaManageFragment.LLILLJJLI, layoutParams);
                guestMediaManageFragment.LLJJIJIL.addView(view);
            } else {
                ViewGroup.LayoutParams layoutParams2 = ((View) guestMediaManageFragment.LLILLJJLI).getLayoutParams();
                if (layoutParams2 != null && (layoutParams2 instanceof FrameLayout.LayoutParams)) {
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                    layoutParams3.setMargins(0, 0, 0, 0);
                    layoutParams3.width = -1;
                    layoutParams3.height = -1;
                    C786410Ut5.U5((SurfaceView) guestMediaManageFragment.LLILLJJLI, layoutParams3);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        GuestMediaManageFragment guestMediaManageFragment = (GuestMediaManageFragment) aObjectS355S0100000_12.l0;
        guestMediaManageFragment.getClass();
        if ("business_mute_guest_close_by_host".equals(((C0UI0) obj).LIZIZ)) {
            guestMediaManageFragment.LLL = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        Room room = (Room) aObjectS355S0100000_12.l0;
        obj.getClass();
        C773220UUu.LJFF.put("room_id", String.valueOf(room.getId()));
        return Unit.LIZ;
    }

    public static final Object invoke$16(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        DialogController dialogController = (DialogController) aObjectS355S0100000_12.l0;
        dialogController.getClass();
        dialogController.LLILZIL = new WeakReference<>(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        if (obj != null) {
            ((DataChannel) aObjectS355S0100000_12.l0).LC0(SelectH5StickerInPreview.class, obj);
        }
        ((DataChannel) aObjectS355S0100000_12.l0).FQ2(NoNewInsertStickerInPreviewEvent.class);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        String str = (String) obj;
        videoWidget.getClass();
        if (!str.isEmpty()) {
            videoWidget.dataChannel.SX0(C767020U6y.class, str);
        }
        C768460UCm.LIZ(videoWidget.context, videoWidget.dataChannel).show((FragmentManager) videoWidget.dataChannel.gg0(C748880TZe.class), "");
        return Unit.LIZ;
    }

    public static final Object invoke$19(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        DataChannel dataChannel;
        final VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        final Bundle bundle = (Bundle) obj;
        videoWidget.getClass();
        if (bundle != null && !bundle.isEmpty()) {
            final String string = bundle.getString("show_entrance");
            if (string == null) {
                string = "broadcast";
            }
            if (videoWidget.dataChannel.gg0(C748880TZe.class) != null) {
                if (C758370Tox.LIZ() && C758370Tox.LIZJ() && (dataChannel = videoWidget.dataChannel) != null) {
                    C758370Tox.LIZIZ(dataChannel, new Function2() { // from class: X.0Toz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            VideoWidget videoWidget2 = videoWidget;
                            String str = string;
                            Bundle bundle2 = bundle;
                            videoWidget2.getClass();
                            ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LIZJ(str, String.valueOf(videoWidget2.x1()), (DataChannel) obj2, bundle2, null);
                            return null;
                        }
                    });
                } else {
                    ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LIZJ(string, String.valueOf(videoWidget.x1()), videoWidget.dataChannel, bundle, null);
                }
            }
            DataChannelGlobal.LLILZ.FQ2(BroadcastLiveBoardEvent.class, new Bundle());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) aObjectS355S0100000_12.l0;
        Boolean bool = (Boolean) obj;
        if (bottomLeftSlotWidget.LLJJIII != null) {
            if (bool.booleanValue() && bottomLeftSlotWidget.isShowing()) {
                bottomLeftSlotWidget.z1(bottomLeftSlotWidget.LLJJIII, false);
            } else if (!bool.booleanValue() && !bottomLeftSlotWidget.isShowing()) {
                bottomLeftSlotWidget.z1(bottomLeftSlotWidget.LLJJIII, true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        EnumC1102750enp.MUSIC.setRedDotVisible((DataChannel) aObjectS355S0100000_12.l0, ((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$21(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        videoWidget.dataChannel.SX0(C769010UEp.class, Boolean.FALSE);
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveStickerLogManager().LIZLLL(false);
        if (videoWidget.context != null && videoWidget.dataChannel != null) {
            C781270Ukn.LJ().openBackgroundPanelDialog(videoWidget.dataChannel, videoWidget.context, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        InterfaceC765730U1z karaokeModule;
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        Boolean bool = (Boolean) obj;
        videoWidget.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAutoKaraokeChannel: ");
        sbLIZ.append(bool);
        C20441214yg.LIZIZ("KDeeplink", C2188811AlT.LIZIZ(sbLIZ));
        KaraokeInfo karaokeInfo = videoWidget.LLJJIJI.karaokeInfo;
        if (karaokeInfo != null && karaokeInfo.displayKaraoke && bool.booleanValue() && (karaokeModule = C781270Ukn.LJI().getKaraokeModule()) != null) {
            ((C765720U1y) karaokeModule).LIZIZ(videoWidget.dataChannel, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        Boolean bool = (Boolean) obj;
        videoWidget.getClass();
        if (bool.booleanValue() && (C781270Ukn.LJI().isUsingAccompanimentBusiness() || C768460UCm.LJIIJ())) {
            IEffectService iEffectServiceLJI = C781270Ukn.LJI();
            Boolean bool2 = Boolean.TRUE;
            iEffectServiceLJI.pauseAccompanimentPlay(bool2);
            C781270Ukn.LJI().pauseBGM(bool2);
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            C0U3P.LJ(C0U3Q.BGM);
            HashMap map = new HashMap();
            map.put("extra", "background_music");
            C0U4R c0u4r = new C0U4R();
            c0u4r.LIZLLL = 2131842667;
            c0u4r.LJI = map;
            c0u4r.LJFF = true;
            c0u4r.LJII = videoWidget.dataChannel;
            c0u4r.LIZJ = "pm_live_bgmusic_playlist_music_cannot_enter";
            C766270U4b.LJIIJ(c0u4r);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_conflict_toast_show");
            c474500IjALIZ.LJIJJLI(videoWidget.dataChannel);
            c474500IjALIZ.LIZ();
        }
        if (bool.booleanValue()) {
            ConcurrentHashSet<C0U3Q> concurrentHashSet2 = C0U3P.LIZ;
            C0U3P.LIZLLL(C0U3Q.COMMERCE_GOODS);
        } else {
            ConcurrentHashSet<C0U3Q> concurrentHashSet3 = C0U3P.LIZ;
            C0U3P.LJ(C0U3Q.COMMERCE_GOODS);
        }
        if (LyraxSceneStrategySettings.isECLiveStatusEnable()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setECLiveStatus: ");
            sbLIZ.append(bool);
            C20441214yg.LIZIZ("ECLiveStatusChangeChannel", C2188811AlT.LIZIZ(sbLIZ));
            videoWidget.LLILZIL.O3(bool);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        C500260Jjc.LJLJLJ(((C0UF9) aObjectS355S0100000_12.l0).LL, ((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$25(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        Boolean bool = (Boolean) obj;
        if (videoWidget.LLJLLL != bool.booleanValue()) {
            videoWidget.LLJLLL = bool.booleanValue();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        videoWidget.getClass();
        EnumC1102750enp.MUSIC.unload(videoWidget.dataChannel);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        if (videoWidget.LLLF == null) {
            videoWidget.LLLF = C781270Ukn.LJI().getLiveBGMDialog();
        }
        if (videoWidget.LLJJLIIIJLLLLLLLZ != null && !videoWidget.LLLF.isShowing()) {
            videoWidget.LLLF.show(videoWidget.LLJJLIIIJLLLLLLLZ, "MUSIC");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        Pair pair = (Pair) obj;
        ((VideoWidget) aObjectS355S0100000_12.l0).LLLILZLLLI.LJIILLIIL((String) pair.getFirst(), (String) pair.getSecond());
        return Unit.LIZ;
    }

    public static final Object invoke$29(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        videoWidget.getClass();
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, C768810UDv.LIZIZ, new ARunnableS112S0100000_12(videoWidget, 375));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS355S0100000_12.l0;
        if (absAudienceInteractionFragment.LLLILZLLLI == null) {
            absAudienceInteractionFragment.LLLILZLLLI = ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).L42(absAudienceInteractionFragment, absAudienceInteractionFragment.LLJIJIL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        videoWidget.getClass();
        if (LiveHostAutoAdaptiveParams.INSTANCE.isDisable("host_normal")) {
            videoWidget.LLLFZ = LiveHostAutoAdaptiveParams.getValue().getDetectFaceIntervalTime();
        } else {
            videoWidget.LLLFZ = TryModeGuidanceConfigSetting.INSTANCE.faceDetectDelayDuration();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        VideoWidget.D1(videoWidget.dataChannel, videoWidget.LLLFFI.LLILLJJLI, false);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        IMessageManager iMessageManager;
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        videoWidget.getClass();
        if (C0UVE.LJIIJ(videoWidget.context, videoWidget.dataChannel)) {
            if (videoWidget.LLLII == null) {
                videoWidget.LLLII = new C781930Ulr();
            }
            C781930Ulr c781930Ulr = videoWidget.LLLII;
            DataChannel dataChannel = videoWidget.dataChannel;
            c781930Ulr.LLJJIJIIJIL = dataChannel;
            C781940Uls c781940Uls = c781930Ulr.LLJJL;
            if (c781940Uls != null) {
                c781940Uls.LLILZ = dataChannel;
                C786410Ut5.LJLILLLLZI(c781940Uls.LLILZIL, 1);
                if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
                    iMessageManager.addMessageListener(C001A.CHAT.getIntType(), c781940Uls);
                    iMessageManager.addMessageListener(C001A.MEMBER.getIntType(), c781940Uls);
                    iMessageManager.addMessageListener(C001A.GIFT.getIntType(), c781940Uls);
                }
                ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).EM(c781940Uls.LLJI);
                if (dataChannel != null) {
                    dataChannel.CQ2(PerceptionMessageChannel.class, c781940Uls, new AwS591S0100000_12(c781940Uls, 1039));
                    dataChannel.CQ2(FloatWindowCoHostEvent.class, c781940Uls, new AwS591S0100000_12(c781940Uls, 1040));
                }
            }
            DataChannel dataChannel2 = c781930Ulr.LLJJIJIIJIL;
            if (dataChannel2 != null) {
                dataChannel2.CQ2(MultiLiveRTCLayoutChannel.class, c781930Ulr, new AwS591S0100000_12(c781930Ulr, 1041));
            }
            DataChannel dataChannel3 = c781930Ulr.LLJJIJIIJIL;
            if (dataChannel3 != null) {
                dataChannel3.CQ2(InteractUnifiedStateChangeChannel.class, c781930Ulr, new AwS594S0100000_15(c781930Ulr, 950));
            }
            videoWidget.LLLII.LIZIZ(true, null);
            C0UHA c0uha = videoWidget.LLJILJILJ;
            TextureView textureView = videoWidget.LLLII.LLJJJIL;
            if (textureView != null) {
                c0uha.LLIZ.setDisplayView(textureView);
            } else {
                c0uha.getClass();
            }
            C786410Ut5.LLIIIILZ(videoWidget.LLLII.LLJJJIL, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        videoWidget.getClass();
        videoWidget.A1(C0UGY.ENTER_FOREGROUND);
        return Unit.LIZ;
    }

    public static final Object invoke$34(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        videoWidget.getClass();
        videoWidget.LLLIIL = ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$35(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        videoWidget.getClass();
        videoWidget.A1(C0UGY.PLAYING_NO_OVER_LAY_PERMISSION);
        return Unit.LIZ;
    }

    public static final Object invoke$36(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        C768790UDt c768790UDt = (C768790UDt) obj;
        videoWidget.getClass();
        try {
            n nVar = new n();
            nVar.LJJIII(Integer.valueOf(c768790UDt.LIZ), "bomb_type");
            InterfaceC1268640j7O interfaceC1268640j7O = videoWidget.LLILZLL;
            if (interfaceC1268640j7O != null) {
                int iSendEffectMsg = interfaceC1268640j7O.sendEffectMsg(117, 100, 1002, nVar.toString());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("drop_bombret: ");
                sbLIZ.append(iSendEffectMsg);
                sbLIZ.append(",sendEffectMsg: ");
                C20441214yg.LIZIZ("match_game", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$37(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        Pair pair = (Pair) obj;
        videoWidget.getClass();
        if (pair.getFirst() == C0UE0.EFFECT && ((Map) pair.getSecond()).size() > 0) {
            videoWidget.F1(false, false, false, false, false, new HashMap((Map) pair.getSecond()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        C768820UDw c768820UDw = (C768820UDw) obj;
        videoWidget.getClass();
        try {
            n nVar = new n();
            h hVar = new h();
            Iterator<Long> it2 = c768820UDw.LIZ.iterator();
            while (it2.hasNext()) {
                hVar.LJJII(it2.next());
            }
            nVar.LJJIFFI("system_bomb_intervals", hVar);
            nVar.LJJIII(Long.valueOf(c768820UDw.LIZIZ), "current_duration");
            InterfaceC1268640j7O interfaceC1268640j7O = videoWidget.LLILZLL;
            if (interfaceC1268640j7O != null) {
                int iSendEffectMsg = interfaceC1268640j7O.sendEffectMsg(117, 100, 1005, nVar.toString());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("drop_system_bombret: ");
                sbLIZ.append(iSendEffectMsg);
                sbLIZ.append(",sendEffectMsg: ");
                sbLIZ.append(nVar);
                C20441214yg.LIZIZ("match_game", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        Object objLH1;
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        FragmentManager fragmentManager = (FragmentManager) videoWidget.dataChannel.gg0(C748880TZe.class);
        String str = "";
        switch (C757740Tnw.LIZ[((C0UE0) obj).ordinal()]) {
            case 1:
                videoWidget.F1(false, false, false, false, false, null);
                break;
            case 2:
                VideoWidget.D1(videoWidget.dataChannel, videoWidget.LLLFFI.LLILLJJLI, false);
                break;
            case 3:
                String value = LiveStreamGoalPresetWebLinkSetting.INSTANCE.getValue();
                try {
                    Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
                    if (videoWidget.dataChannel.gg0(LiveModeChannel.class) != null) {
                        str = ((LiveMode) videoWidget.dataChannel.gg0(LiveModeChannel.class)).logStreamingType;
                    }
                    builderBuildUpon.appendQueryParameter("entrance", "broadcast").appendQueryParameter("live_type", str);
                    value = builderBuildUpon.build().toString();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(videoWidget.context, value);
                break;
            case 4:
                videoWidget.dataChannel.LC0(OpenMultiLivePanelEvent.class, new C757730Tnv("broadcast_schema", new HashMap()));
                break;
            case 5:
                DataChannelGlobal.LLILZ.JQ2(C1148180fz6.class, "more_page_setting");
                if (LiveHostSettingsUIConfig.enable()) {
                    if (videoWidget.LLJJIJI != null && fragmentManager != null) {
                        C19322110iZ.LJ(fragmentManager, new LiveHostSettingFragmentSheet(videoWidget.y1(), videoWidget.dataChannel, null), null, "live_host_settings_more_settings", null, 0, null);
                    }
                } else {
                    LiveAdminSettingDialog liveAdminSettingDialogXu2 = C781270Ukn.LIZIZ().xu2(false);
                    if (videoWidget.LLJJIJI != null && fragmentManager != null && liveAdminSettingDialogXu2 != null) {
                        liveAdminSettingDialogXu2.show(fragmentManager, "VideoWidget");
                    }
                }
                break;
            case 6:
                LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheetPn1 = ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).pn1("from_page_broadcast", new AObjectS115S0000000_12(9));
                if (liveCommentSettingFragmentSheetPn1 != null) {
                    C19322110iZ.LJFF((FragmentManager) videoWidget.dataChannel.gg0(C748880TZe.class), liveCommentSettingFragmentSheetPn1, "live_comment_setting", null, 0);
                }
                break;
            case 7:
                if (LiveModeratorNewSuggestionSetting.INSTANCE.isEnable()) {
                    objLH1 = ((IModeratorService) C1161920gLG.LIZJ(IModeratorService.class)).wj2("");
                } else {
                    objLH1 = ((IModeratorService) C1161920gLG.LIZJ(IModeratorService.class)).lH1();
                }
                if (objLH1 != null) {
                    C19322110iZ.LIZLLL((FragmentManager) videoWidget.dataChannel.gg0(C748880TZe.class), objLH1.getClass(), "moderator_list", null, null);
                }
                break;
            case 8:
                EnumC748580TYa enumC748580TYa = EnumC748580TYa.BLOCK_KEYWORDS_OPT;
                FragmentManager fragmentManager2 = (FragmentManager) videoWidget.dataChannel.gg0(C748880TZe.class);
                LiveAdminSettingDialog liveAdminSettingDialogFv2 = ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).Fv2(enumC748580TYa, "schema");
                if (fragmentManager2 != null && liveAdminSettingDialogFv2 != null) {
                    liveAdminSettingDialogFv2.show(fragmentManager2, "LiveAdminSettingDialog");
                }
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                if (!C0UIM.LJFF() && !((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(videoWidget.dataChannel).LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) {
                    videoWidget.dataChannel.FQ2(ShowInteractionFeatureDialogEvent.class);
                } else {
                    videoWidget.dataChannel.LC0(LiveShowMoreDialogEvent.class, new C773830UXd("", "", ""));
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LiveAISummaryDialogFragment liveAISummaryDialogFragment = new LiveAISummaryDialogFragment(1);
                if (fragmentManager != null) {
                    liveAISummaryDialogFragment.show(fragmentManager, "LiveAISummaryDialog");
                }
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                C19EG c19egLJIJJLI = C520010KaN.LJIJJLI(videoWidget.context, false);
                if (c19egLJIJJLI != null) {
                    C497420Jf2.LIZ(c19egLJIJJLI, false, false);
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJ(3, videoWidget.dataChannel);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJI(videoWidget.dataChannel, 3);
                break;
            case 14:
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJ(4, videoWidget.dataChannel);
                break;
            case 15:
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJI(videoWidget.dataChannel, 4);
                break;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS355S0100000_12.l0;
        RemindMessage remindMessage = (RemindMessage) obj;
        if (absAudienceInteractionFragment.LLLI == null) {
            absAudienceInteractionFragment.LLLI = new CopyrightViolationHelper(absAudienceInteractionFragment, new ARunnableS107S0100000_7(absAudienceInteractionFragment, 63));
        }
        absAudienceInteractionFragment.LLLI.LIZ(absAudienceInteractionFragment.getContext(), remindMessage, absAudienceInteractionFragment.LLJILJIL, absAudienceInteractionFragment.LLILZIL);
        return null;
    }

    public static final Object invoke$40(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        C769500UGm c769500UGm = (C769500UGm) obj;
        videoWidget.getClass();
        try {
            n nVar = new n();
            nVar.LJJIII(Long.valueOf(c769500UGm.LIZ), "num_comments");
            nVar.LJJIII(Long.valueOf(c769500UGm.LIZJ), "version");
            h hVar = new h();
            for (BeansArtifacts.AnchorInfo.GiftInfo giftInfo : c769500UGm.LIZIZ) {
                n nVar2 = new n();
                nVar2.LJJIII(Long.valueOf(giftInfo.giftId), "gift_id");
                nVar2.LJJIII(Long.valueOf(giftInfo.numberGifts), "number_gifts");
                nVar2.LJJIII(Long.valueOf(giftInfo.coinsPerGift), "coins_per_gift");
                nVar2.LJJIII(Long.valueOf(giftInfo.numberBeans), "number_beans");
                hVar.LJJIFFI(nVar2);
            }
            nVar.LJJIFFI("gifts", hVar);
            InterfaceC1268640j7O interfaceC1268640j7O = videoWidget.LLILZLL;
            if (interfaceC1268640j7O != null) {
                int iSendEffectMsg = interfaceC1268640j7O.sendEffectMsg(117, 100, 1001, nVar.toString());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("drop_bean ret: ");
                sbLIZ.append(iSendEffectMsg);
                sbLIZ.append(",sendEffectMsg: ");
                C20441214yg.LIZIZ("match_game", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$41(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        C769490UGl c769490UGl = (C769490UGl) obj;
        videoWidget.getClass();
        videoWidget.F1(c769490UGl.LIZ, c769490UGl.LIZIZ, c769490UGl.LIZJ, false, false, null);
        return Unit.LIZ;
    }

    public static final Object invoke$42(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        videoWidget.getClass();
        try {
            InterfaceC1268640j7O interfaceC1268640j7O = videoWidget.LLILZLL;
            if (interfaceC1268640j7O != null) {
                int iSendEffectMsg = interfaceC1268640j7O.sendEffectMsg(117, 100, 1003, "");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("settle_startret: ");
                sbLIZ.append(iSendEffectMsg);
                sbLIZ.append(",sendEffectMsg: ");
                C20441214yg.LIZIZ("match_game", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$43(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        boolean z;
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        String str = (String) obj;
        videoWidget.getClass();
        if (LiveHostSettingsUIConfig.enable()) {
            FragmentManager fragmentManager = (FragmentManager) videoWidget.dataChannel.gg0(C748880TZe.class);
            DataChannelGlobal.LLILZ.JQ2(C1148180fz6.class, "more_page_setting");
            if (fragmentManager != null) {
                EnumC776090UcR.Companion.getClass();
                int i = 0;
                if (str != null && str.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                Integer numValueOf = null;
                if (!z) {
                    EnumC776090UcR[] enumC776090UcRArrValues = EnumC776090UcR.values();
                    int length = enumC776090UcRArrValues.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        EnumC776090UcR enumC776090UcR = enumC776090UcRArrValues[i];
                        if (Intrinsics.LJFF(enumC776090UcR.getEventKey(), str)) {
                            numValueOf = Integer.valueOf(enumC776090UcR.getTag());
                            break;
                        }
                        i++;
                    }
                }
                C19322110iZ.LJ(fragmentManager, new LiveHostSettingFragmentSheet(videoWidget.y1(), videoWidget.dataChannel, numValueOf), null, "live_host_settings_more_settings", null, 0, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        videoWidget.getClass();
        try {
            InterfaceC1268640j7O interfaceC1268640j7O = videoWidget.LLILZLL;
            if (interfaceC1268640j7O != null) {
                int iSendEffectMsg = interfaceC1268640j7O.sendEffectMsg(117, 100, 1004, "");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("settle_endret: ");
                sbLIZ.append(iSendEffectMsg);
                sbLIZ.append(",sendEffectMsg: ");
                C20441214yg.LIZIZ("match_game", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$45(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        Boolean bool = (Boolean) obj;
        if (Boolean.TRUE.equals(videoWidget.dataChannel.gg0(StickerShortcutPanelChannel.class))) {
            videoWidget.dataChannel.LC0(ScrollToInsertStickerEvent.class, bool);
        } else {
            videoWidget.F1(false, false, false, bool.booleanValue(), true, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        C769470UGj c769470UGj = (C769470UGj) obj;
        videoWidget.getClass();
        try {
            n nVar = new n();
            nVar.LJJIII(Long.valueOf(c769470UGj.LIZ), "gift_id");
            if (C842240X2g.LIZ(c769470UGj.LIZIZ) != null && !C842240X2g.LIZ(c769470UGj.LIZIZ).isEmpty()) {
                Iterator<String> it2 = C842240X2g.LIZ(c769470UGj.LIZIZ).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    if (!next.contains(".webp")) {
                        nVar.LJJIIJ("url", next);
                        break;
                    }
                }
            }
            nVar.LJJIII(Long.valueOf(c769470UGj.LIZJ), "number_avatars");
            InterfaceC1268640j7O interfaceC1268640j7O = videoWidget.LLILZLL;
            if (interfaceC1268640j7O != null) {
                interfaceC1268640j7O.sendEffectMsg(117, 100, 1008, nVar.toString());
                ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).qF0(System.currentTimeMillis() - c769470UGj.LIZLLL);
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("beans avatar eventgift id = uri = ");
        sbLIZ.append(c769470UGj.LIZIZ.mUri);
        C20441214yg.LIZIZ("match_game", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$47(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        String str;
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        Pair pair = (Pair) obj;
        videoWidget.getClass();
        if (TextUtils.isEmpty((CharSequence) pair.getFirst())) {
            str = "broadcast_schema";
        } else {
            str = (String) pair.getFirst();
        }
        HashMap map = new HashMap();
        map.putAll((Map) pair.getSecond());
        videoWidget.dataChannel.LC0(OpenMultiLivePanelEvent.class, new C757730Tnv(str, map));
        return Unit.LIZ;
    }

    public static final Object invoke$48(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        C768680UDi c768680UDi = (C768680UDi) obj;
        videoWidget.getClass();
        try {
            n nVar = new n();
            nVar.LJJIIJ("url", c768680UDi.LIZ);
            nVar.LJJII(Boolean.valueOf(c768680UDi.LIZIZ), "isSuccess");
            if (videoWidget.LLILZLL != null) {
                videoWidget.LLJJIJIL.post(new ARunnableS81S0200000_12(nVar, videoWidget, 123));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AVATAR_DOWNLOAD_STATUSurl = ");
                sbLIZ.append(c768680UDi.LIZ);
                sbLIZ.append("\n");
                sbLIZ.append(c768680UDi.LIZIZ);
                C20441214yg.LIZIZ("match_game", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$49(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        C0UE7 c0ue7 = (C0UE7) obj;
        videoWidget.getClass();
        if (c0ue7.LIZ == C0UE0.AUTO_POST_LIVING_PANEL) {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openAutoPostLivingPanelDialog(C500260Jjc.LJII(videoWidget.dataChannel), c0ue7.LIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS355S0100000_12.l0;
        absAudienceInteractionFragment.getClass();
        return ((InterfaceC1097760efm) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).LIZ(absAudienceInteractionFragment.LLJIJIL, (List) obj);
    }

    public static final Object invoke$50(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        Number number = (Number) obj;
        videoWidget.getClass();
        try {
            n nVar = new n();
            nVar.LJJIII(number, "score");
            InterfaceC1268640j7O interfaceC1268640j7O = videoWidget.LLILZLL;
            if (interfaceC1268640j7O != null) {
                interfaceC1268640j7O.sendEffectMsg(117, 100, 1006, nVar.toString());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("room score sent to gamescore = ");
                sbLIZ.append(number);
                C20441214yg.LIZIZ("match_game", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$51(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        C769630UGz c769630UGz = (C769630UGz) aObjectS355S0100000_12.l0;
        c769630UGz.getClass();
        if (obj == C0UE0.STICKER) {
            c769630UGz.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$52(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        ((VideoWidget) aObjectS355S0100000_12.l0).dataChannel.LC0(LiveShowMoreDialogEvent.class, obj);
        return Unit.LIZ;
    }

    public static final Object invoke$53(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        videoWidget.getClass();
        try {
            if (videoWidget.LLILZLL != null) {
                n nVar = new n();
                nVar.LJJIII(2, "source_type");
                videoWidget.LLILZLL.sendEffectMsg(117, 100, 1012, nVar.toString());
                C20441214yg.LIZIZ("match_game", "beans request load statistics sent to game");
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$54(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        C500260Jjc.LJLJLJ(((C769630UGz) aObjectS355S0100000_12.l0).LL, ((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$55(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        String str = (String) obj;
        boolean z = videoWidget.LLJJL.LL;
        if ((str.equals("front") && !z) || ((str.equals("back") && z) || str.equals("reverse"))) {
            videoWidget.LLJJL.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$56(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        Boolean bool = (Boolean) obj;
        videoWidget.getClass();
        if (!bool.booleanValue()) {
            C20441214yg.LJIIIZ("LiveMicMute", "mic unmuted, remove callbacks");
            C768810UDv.LIZIZ.removeCallbacksAndMessages(null);
        }
        AbstractC1273900jFs liveCore = videoWidget.LLILZIL.getLiveCore();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive MuteMicChannel: ");
        sbLIZ.append(bool);
        C20441214yg.LJIIIZ("LiveMicMute", C2188811AlT.LIZIZ(sbLIZ));
        if (liveCore != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("set volumeMute: ");
            sbLIZ2.append(bool);
            C20441214yg.LJIIIZ("LiveMicMute", C2188811AlT.LIZIZ(sbLIZ2));
            boolean z = C768810UDv.LIZ;
            C768810UDv.LIZ = bool.booleanValue();
            C773300UVc c773300UVcLIZ = C0UVZ.LIZ();
            if (c773300UVcLIZ != null) {
                boolean zBooleanValue = bool.booleanValue();
                if (!c773300UVcLIZ.LIZ()) {
                    C773310UVd c773310UVd = (C773310UVd) c773300UVcLIZ.LJIIJ.getValue();
                    if (zBooleanValue != c773310UVd.LIZ.LIZIZ()) {
                        c773310UVd.LIZ.LIZJ(zBooleanValue);
                        long jLIZ = c773310UVd.LIZLLL.LIZ();
                        if (zBooleanValue) {
                            c773310UVd.LIZLLL.LIZIZ(System.currentTimeMillis());
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("mute start: ");
                            sbLIZ3.append(c773310UVd.LIZLLL.LIZ());
                            C20441214yg.LIZIZ("DeviceSignalInfo", C2188811AlT.LIZIZ(sbLIZ3));
                        } else if (jLIZ > 0) {
                            C0UWA c0uwa = c773310UVd.LIZJ;
                            c0uwa.LIZ.addAndGet((System.currentTimeMillis() - jLIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("muteduration: ");
                            sbLIZ4.append(c773310UVd.LIZJ.LIZ());
                            C20441214yg.LIZIZ("DeviceSignalInfo", C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    }
                }
            }
            liveCore.LJLLI().setAudioCaptureMute(bool.booleanValue());
            C768810UDv.LIZIZ(liveCore, bool.booleanValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$57(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        VideoWidget videoWidget = (VideoWidget) aObjectS355S0100000_12.l0;
        videoWidget.getClass();
        if (((Boolean) obj).booleanValue() ^ videoWidget.LLJJIII) {
            videoWidget.LLJJJJLIIL.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$58(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        ((C756830TmT) aObjectS355S0100000_12.l0).LL.LIZ = (Boolean) obj;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        RecyclableWidgetManager recyclableWidgetManager;
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS355S0100000_12.l0;
        absAudienceInteractionFragment.getClass();
        if (((Boolean) obj).booleanValue()) {
            absAudienceInteractionFragment.LLLLIILLL.lock();
            IGoodyBagService iGoodyBagService = (IGoodyBagService) C1161920gLG.LIZJ(IGoodyBagService.class);
            if (iGoodyBagService != null && iGoodyBagService.ul2(absAudienceInteractionFragment.LLJIJIL) && absAudienceInteractionFragment.LLLJL == 0 && (recyclableWidgetManager = absAudienceInteractionFragment.LLJJI) != null) {
                absAudienceInteractionFragment.LLLJL = 1;
                recyclableWidgetManager.load(recyclableWidgetManager.getRecyclableWidgetFromCacheOrNew(iGoodyBagService.Fa0(), null, new AObjectS387S0100000_12(iGoodyBagService, 3)));
                long jLIZIZ = C1078580eAq.LIZIZ(20, absAudienceInteractionFragment.LLJILJIL, absAudienceInteractionFragment.LLJIJIL);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("low device -> GoodyBagService.getRoomGoodyBag is invoked on ");
                sbLIZ.append(C786410Ut5.u3().getName());
                sbLIZ.append(" at ");
                sbLIZ.append(jElapsedRealtime);
                C20441214yg.LIZIZ("AbsInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
                if (jLIZIZ > 0) {
                    absAudienceInteractionFragment.LL.postDelayed(new ARunnableS12S0200100_7(iGoodyBagService, jElapsedRealtime, absAudienceInteractionFragment, 3), jLIZIZ);
                } else {
                    iGoodyBagService.B51(absAudienceInteractionFragment.LLJILJIL.getIdStr(), absAudienceInteractionFragment.LLJIJIL, absAudienceInteractionFragment, absAudienceInteractionFragment.LLLLZIL);
                }
            }
            absAudienceInteractionFragment.LLLLIILLL.unlock();
        }
        return null;
    }

    public static final Object invoke$7(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS355S0100000_12.l0;
        absAudienceInteractionFragment.getClass();
        RedDotExtensionKt.LIZ(C0UX6.RED_DOT_AUDIENCE_SHARE_MODERATOR_SETTING);
        FragmentManager fragmentManager = (FragmentManager) absAudienceInteractionFragment.LLJIJIL.gg0(C748880TZe.class);
        if (fragmentManager != null) {
            ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).xu2(false).show(fragmentManager, "LiveAdminSettingDialog");
            EnumC1102750enp.SHARE.hideRedDot(absAudienceInteractionFragment.LLJIJIL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS355S0100000_12.l0;
        Pair pair = (Pair) obj;
        absAudienceInteractionFragment.getClass();
        if (((Long) pair.getFirst()).longValue() == absAudienceInteractionFragment.LLJILJIL.getId()) {
            absAudienceInteractionFragment.LLJIJIL.LC0(LiveECShopShowEvent.class, pair);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS355S0100000_12 aObjectS355S0100000_12, Object obj) {
        boolean z;
        RecyclableWidgetManager recyclableWidgetManager;
        LiveRecyclableWidget recyclableWidgetFromCacheOrNew;
        RecyclableWidgetManager recyclableWidgetManager2;
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS355S0100000_12.l0;
        absAudienceInteractionFragment.getClass();
        if (((Boolean) obj).booleanValue()) {
            absAudienceInteractionFragment.LLLLIILL.lock();
            IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
            if (iGiftService != null && (iGiftService.enableRedEnvelope() || iGiftService.enablePlatformPortal() || iGiftService.enableRedEnvelopeForSuperFan())) {
                z = true;
                if (absAudienceInteractionFragment.LLLL == 0 && (recyclableWidgetManager2 = absAudienceInteractionFragment.LLJJI) != null) {
                    absAudienceInteractionFragment.LLLL = 1;
                    recyclableWidgetManager2.load(recyclableWidgetManager2.getRecyclableWidgetFromCacheOrNew(iGiftService.getRedEnvelopeWidgetClass(), null, new AObjectS387S0100000_12(iGiftService, 2)));
                }
            } else {
                z = false;
            }
            ITreasureBoxService iTreasureBoxService = (ITreasureBoxService) C1161920gLG.LIZJ(ITreasureBoxService.class);
            boolean zPD = iTreasureBoxService.pD();
            if (zPD && absAudienceInteractionFragment.LLLLII == 0 && (recyclableWidgetManager = absAudienceInteractionFragment.LLJJI) != null && (recyclableWidgetFromCacheOrNew = recyclableWidgetManager.getRecyclableWidgetFromCacheOrNew(iTreasureBoxService.j61(), null, new AObjectS387S0100000_12(iTreasureBoxService, 4))) != null) {
                absAudienceInteractionFragment.LLLLII++;
                recyclableWidgetFromCacheOrNew.args = new Object[]{Boolean.valueOf(absAudienceInteractionFragment.LLLLZIL)};
                absAudienceInteractionFragment.LLJJI.load(recyclableWidgetFromCacheOrNew);
            }
            RecyclableWidgetManager recyclableWidgetManager3 = absAudienceInteractionFragment.LLJJI;
            if (recyclableWidgetManager3 != null && absAudienceInteractionFragment.LLLLIIIILLL == 0) {
                LiveRecyclableWidget recyclableWidgetFromCacheOrNew2 = recyclableWidgetManager3.getRecyclableWidgetFromCacheOrNew(iTreasureBoxService.ax2(), null, new AObjectS387S0100000_12(iTreasureBoxService, 5));
                if (recyclableWidgetFromCacheOrNew2 != null) {
                    absAudienceInteractionFragment.LLLLIIIILLL++;
                }
                absAudienceInteractionFragment.LLJJI.load(R.id.yjr, recyclableWidgetFromCacheOrNew2);
            }
            if (z || zPD) {
                long jLIZIZ = C1078580eAq.LIZIZ(20, absAudienceInteractionFragment.LLJILJIL, absAudienceInteractionFragment.LLJIJIL);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jLIZIZ > 0) {
                    absAudienceInteractionFragment.LL.postDelayed(new ARunnableS13S0100100_7(absAudienceInteractionFragment, jElapsedRealtime, 4), jLIZIZ);
                } else {
                    ((ITreasureBoxService) C1161920gLG.LIZJ(ITreasureBoxService.class)).y71(absAudienceInteractionFragment.LLJILJIL.getIdStr(), absAudienceInteractionFragment.LLJIJIL, absAudienceInteractionFragment.LLLLZIL);
                }
            }
            absAudienceInteractionFragment.LLLLIILL.unlock();
        }
        return null;
    }

    public AObjectS355S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
