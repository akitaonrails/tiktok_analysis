package Y;

import X.C09JN;
import X.C0IJT;
import X.C0J1R;
import X.C0TES;
import X.C0TZ0;
import X.C0U17;
import X.C0U4X;
import X.C0U6V;
import X.C0U7R;
import X.C0UD4;
import X.C0UD7;
import X.C0UO0;
import X.C0UOS;
import X.C0UQ2;
import X.C0UQX;
import X.C0URD;
import X.C0UYB;
import X.C0W78;
import X.C1086800eO6;
import X.C1124140fMK;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C13BV;
import X.C197600pS;
import X.C19EG;
import X.C20337914i1;
import X.C20441214yg;
import X.C20743716Ff;
import X.C20744116Fj;
import X.C474500IjA;
import X.C475510Ikn;
import X.C482260Ivg;
import X.C497740JfY;
import X.C500260Jjc;
import X.C743540TEq;
import X.C745350TLp;
import X.C750580TcO;
import X.C750740Tce;
import X.C758920Tpq;
import X.C762110Tuz;
import X.C763230Twn;
import X.C763760Txe;
import X.C767780U9w;
import X.C771970UPz;
import X.C773220UUu;
import X.C774850UaR;
import X.C774860UaS;
import X.C776320Uco;
import X.C776870Udh;
import X.C777840UfG;
import X.C778170Ufn;
import X.C778180Ufo;
import X.C778190Ufp;
import X.C778570UgR;
import X.C781270Ukn;
import X.C783320Uo6;
import X.C783350Uo9;
import X.C784470Upx;
import X.EnumC777330UeR;
import X.EnumC777480Ueg;
import X.EnumC778100Ufg;
import X.EnumC778210Ufr;
import X.EnumC778250Ufv;
import X.InterfaceC1106030et7;
import X.InterfaceC743640TFa;
import X.InterfaceC750520TcI;
import X.InterfaceC766830U6f;
import X.InterfaceC769940UIe;
import X.InterfaceC773750UWv;
import X.ViewOnLayoutChangeListenerC766940U6q;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokePageFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.effect.music.LiveBGMPlaylistFragment;
import com.bytedance.android.live.effect.panel.LiveMultiGuestBeautyEffectFragment;
import com.bytedance.android.live.effect.soundeffect.SoundEffectFragment;
import com.bytedance.android.live.effect.sticker.effecthouse.EffectInfoActionsDialog;
import com.bytedance.android.live.liveinteract.gamelink.v2.widget.GameLinkV2Widget;
import com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet;
import com.bytedance.android.livesdk.broadcast.LiveBroadcastEndFragment;
import com.bytedance.android.livesdk.broadcast.preview.onetap.OneTapGoLiveManager;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.record.LiveRecordManager;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LivePhoneAsCameraRetryClickEvent;
import com.bytedance.android.livesdk.game.broadcast.fragment.DualDeviceRtcSourceFragment;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceSourceFragmentV2;
import com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneAsCameraFragment;
import com.bytedance.android.livesdk.game.broadcast.interruption.PreviewMultiDeviceInterruptGuide;
import com.bytedance.android.livesdk.game.broadcast.widget.PhoneAsCameraErrorWidget;
import com.bytedance.android.livesdk.game.chatroom.ui.GamePreparationFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableUrlListSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.android.livesdk.moderator.removeself.ModeratorHostIModeratorListFragment;
import com.bytedance.android.livesdk.settings.customtab.KevaDebugFragment;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class AcS495S0100000_12 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
            case 3:
                LIZ$3(this, liveDialog);
                break;
            case 4:
                LIZ$4(this, liveDialog);
                break;
            case 5:
                LIZ$5(this, liveDialog);
                break;
            case 6:
                LIZ$6(this, liveDialog);
                break;
            case 7:
                LIZ$7(this, liveDialog);
                break;
            case 8:
                LIZ$8(this, liveDialog);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, liveDialog);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, liveDialog);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, liveDialog);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, liveDialog);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, liveDialog);
                break;
            case 14:
                LIZ$14(this, liveDialog);
                break;
            case 15:
                LIZ$15(this, liveDialog);
                break;
            case 16:
                LIZ$16(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, liveDialog);
                break;
            case 19:
                LIZ$19(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, liveDialog);
                break;
            case 21:
                LIZ$21(this, liveDialog);
                break;
            case 22:
                LIZ$22(this, liveDialog);
                break;
            case 23:
                LIZ$23(this, liveDialog);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, liveDialog);
                break;
            case 25:
                LIZ$25(this, liveDialog);
                break;
            case 26:
                LIZ$26(this, liveDialog);
                break;
            case 27:
                LIZ$27(this, liveDialog);
                break;
            case 28:
                LIZ$28(this, liveDialog);
                break;
            case 29:
                LIZ$29(this, liveDialog);
                break;
            case 30:
                LIZ$30(this, liveDialog);
                break;
            case 31:
                LIZ$31(this, liveDialog);
                break;
            case 32:
                LIZ$32(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                LIZ$34(this, liveDialog);
                break;
            case 35:
                LIZ$35(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                LIZ$36(this, liveDialog);
                break;
            case 37:
                LIZ$37(this, liveDialog);
                break;
            case 38:
                LIZ$38(this, liveDialog);
                break;
            case 39:
                LIZ$39(this, liveDialog);
                break;
            case 40:
                LIZ$40(this, liveDialog);
                break;
            case 41:
                LIZ$41(this, liveDialog);
                break;
            case 42:
                LIZ$42(this, liveDialog);
                break;
            case 43:
                LIZ$43(this, liveDialog);
                break;
            case 44:
                LIZ$44(this, liveDialog);
                break;
            case 45:
                LIZ$45(this, liveDialog);
                break;
            case 46:
                LIZ$46(this, liveDialog);
                break;
            case 47:
                LIZ$47(this, liveDialog);
                break;
            case 48:
                LIZ$48(this, liveDialog);
                break;
            case 49:
                LIZ$49(this, liveDialog);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                LIZ$50(this, liveDialog);
                break;
            case 51:
                LIZ$51(this, liveDialog);
                break;
            case 52:
                LIZ$52(this, liveDialog);
                break;
            case 53:
                LIZ$53(this, liveDialog);
                break;
            case 54:
                LIZ$54(this, liveDialog);
                break;
            case 55:
                LIZ$55(this, liveDialog);
                break;
            case 56:
                LIZ$56(this, liveDialog);
                break;
            case 57:
                LIZ$57(this, liveDialog);
                break;
            case 58:
                LIZ$58(this, liveDialog);
                break;
            case 59:
                LIZ$59(this, liveDialog);
                break;
            case 60:
                LIZ$60(this, liveDialog);
                break;
            case 61:
                LIZ$61(this, liveDialog);
                break;
            case BaseNotice.CREATOR /* 62 */:
                LIZ$62(this, liveDialog);
                break;
            case 63:
                LIZ$63(this, liveDialog);
                break;
            case 64:
                LIZ$64(this, liveDialog);
                break;
            case 65:
                LIZ$65(this, liveDialog);
                break;
            case 66:
                LIZ$66(this, liveDialog);
                break;
            case 67:
                LIZ$67(this, liveDialog);
                break;
            case 68:
                LIZ$68(this, liveDialog);
                break;
            case 69:
                LIZ$69(this, liveDialog);
                break;
            case 70:
                LIZ$70(this, liveDialog);
                break;
            case 71:
                LIZ$71(this, liveDialog);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                LIZ$72(this, liveDialog);
                break;
            case 73:
                LIZ$73(this, liveDialog);
                break;
            case 74:
                LIZ$74(this, liveDialog);
                break;
            case 75:
                LIZ$75(this, liveDialog);
                break;
            case 76:
                LIZ$76(this, liveDialog);
                break;
            case 77:
                LIZ$77(this, liveDialog);
                break;
            case 78:
                LIZ$78(this, liveDialog);
                break;
            case 79:
                LIZ$79(this, liveDialog);
                break;
            case 80:
                LIZ$80(this, liveDialog);
                break;
            case 81:
                LIZ$81(this, liveDialog);
                break;
            case 82:
                LIZ$82(this, liveDialog);
                break;
            case 83:
                LIZ$83(this, liveDialog);
                break;
            case 84:
                LIZ$84(this, liveDialog);
                break;
            case 85:
                LIZ$85(this, liveDialog);
                break;
        }
    }

    public AcS495S0100000_12(int i) {
        this.$t = i;
        this.l0 = null;
    }

    public AcS495S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((EffectInfoActionsDialog) acS495S0100000_12.l0).MR(false);
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((EffectInfoActionsDialog) acS495S0100000_12.l0).MR(true);
        C767780U9w c767780U9w = C767780U9w.LIZ;
        LiveEffect liveEffect = ((EffectInfoActionsDialog) acS495S0100000_12.l0).LLILZ;
        LiveEffect liveEffect2 = null;
        if (liveEffect == null) {
            liveEffect = null;
        }
        C767780U9w.LIZ(liveEffect);
        EffectInfoActionsDialog effectInfoActionsDialog = (EffectInfoActionsDialog) acS495S0100000_12.l0;
        effectInfoActionsDialog.getClass();
        LiveEffect liveEffect3 = effectInfoActionsDialog.LLILZ;
        if (liveEffect3 != null) {
            liveEffect2 = liveEffect3;
        }
        C767780U9w.LIZ(liveEffect2);
        effectInfoActionsDialog.dismiss();
        liveDialog.dismiss();
    }

    public static final void LIZ$10(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function0) acS495S0100000_12.l0).invoke();
    }

    public static final void LIZ$11(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C743540TEq.LJFF(((DualDeviceRtcSourceFragment) acS495S0100000_12.l0).OR(), "exit_cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$12(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        DualDeviceRtcSourceFragment dualDeviceRtcSourceFragment = (DualDeviceRtcSourceFragment) acS495S0100000_12.l0;
        if (dualDeviceRtcSourceFragment.LLILLL) {
            C743540TEq.LJFF(dualDeviceRtcSourceFragment.OR(), "exit_confirm");
        } else {
            C743540TEq.LJ("cancel", "cancel");
        }
        C19EG activity = ((DualDeviceRtcSourceFragment) acS495S0100000_12.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void LIZ$13(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C743540TEq.LJFF(((GameDualDeviceSourceFragmentV2) acS495S0100000_12.l0).LLILZ, "exit_cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$14(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        GameDualDeviceSourceFragmentV2 gameDualDeviceSourceFragmentV2 = (GameDualDeviceSourceFragmentV2) acS495S0100000_12.l0;
        if (gameDualDeviceSourceFragmentV2.LL) {
            C743540TEq.LJFF(gameDualDeviceSourceFragmentV2.LLILZ, "exit_confirm");
        } else {
            C743540TEq.LJ("cancel", "cancel");
        }
        C19EG activity = ((GameDualDeviceSourceFragmentV2) acS495S0100000_12.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void LIZ$15(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        GamePhoneAsCameraFragment gamePhoneAsCameraFragment = (GamePhoneAsCameraFragment) acS495S0100000_12.l0;
        C743540TEq.LJJIJIIJIL(gamePhoneAsCameraFragment.LLILLL, "click", "disconnect", "cancel", C0TES.LIZ(gamePhoneAsCameraFragment.LLJJ));
    }

    public static final void LIZ$16(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        GamePhoneAsCameraFragment gamePhoneAsCameraFragment = (GamePhoneAsCameraFragment) acS495S0100000_12.l0;
        C743540TEq.LJJIJIIJIL(gamePhoneAsCameraFragment.LLILLL, "click", "disconnect", "disconnect", C0TES.LIZ(gamePhoneAsCameraFragment.LLJJ));
        GamePhoneAsCameraFragment gamePhoneAsCameraFragment2 = (GamePhoneAsCameraFragment) acS495S0100000_12.l0;
        C743540TEq.LJJIJ(gamePhoneAsCameraFragment2.LLILLL, "disconnect", C0TES.LIZ(gamePhoneAsCameraFragment2.LLJJ), ((GamePhoneAsCameraFragment) acS495S0100000_12.l0).LLJILJILJ, null);
        C19EG activity = ((GamePhoneAsCameraFragment) acS495S0100000_12.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void LIZ$17(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        String str;
        PreviewMultiDeviceInterruptGuide previewMultiDeviceInterruptGuide = (PreviewMultiDeviceInterruptGuide) acS495S0100000_12.l0;
        C19EG c19eg = previewMultiDeviceInterruptGuide.LLILLJJLI;
        if (c19eg != null && (str = previewMultiDeviceInterruptGuide.LLILZLL) != null) {
            previewMultiDeviceInterruptGuide.LLILZ = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(c19eg, UriProtector.parse(str).buildUpon().appendQueryParameter("device_brand", C497740JfY.LJ()).appendQueryParameter("os_version", String.valueOf(C778190Ufp.LIZ())).appendQueryParameter("anchor_id", (String) previewMultiDeviceInterruptGuide.LLJ.getValue()).appendQueryParameter("room_id", String.valueOf(previewMultiDeviceInterruptGuide.LIZ())).appendQueryParameter("scene_type", "before_live").appendQueryParameter("enter_from", "golive_popup").build().toString(), null);
        }
        PreviewMultiDeviceInterruptGuide previewMultiDeviceInterruptGuide2 = (PreviewMultiDeviceInterruptGuide) acS495S0100000_12.l0;
        C776320Uco c776320Uco = previewMultiDeviceInterruptGuide2.LLILLL;
        if (c776320Uco != null) {
            c776320Uco.LJ(previewMultiDeviceInterruptGuide2.LIZ(), EnumC778210Ufr.GO_LIVE_POPUP, EnumC777330UeR.LEARN_MORE, EnumC778250Ufv.BEFORE_LIVE);
        }
    }

    public static final void LIZ$18(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        PreviewMultiDeviceInterruptGuide previewMultiDeviceInterruptGuide = (PreviewMultiDeviceInterruptGuide) acS495S0100000_12.l0;
        C776320Uco c776320Uco = previewMultiDeviceInterruptGuide.LLILLL;
        if (c776320Uco != null) {
            c776320Uco.LJ(previewMultiDeviceInterruptGuide.LIZ(), EnumC778210Ufr.GO_LIVE_POPUP, EnumC777330UeR.NOT_NOW, EnumC778250Ufv.BEFORE_LIVE);
        }
        ((PreviewMultiDeviceInterruptGuide) acS495S0100000_12.l0).dismiss();
    }

    public static final void LIZ$19(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((Function0) acS495S0100000_12.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$2(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function1) acS495S0100000_12.l0).invoke(liveDialog);
    }

    public static final void LIZ$20(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((Function0) acS495S0100000_12.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$21(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((Function0) acS495S0100000_12.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$22(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        Function0 function0 = (Function0) acS495S0100000_12.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$23(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C19EG c19egLIZ;
        liveDialog.dismiss();
        PhoneAsCameraErrorWidget phoneAsCameraErrorWidget = (PhoneAsCameraErrorWidget) acS495S0100000_12.l0;
        phoneAsCameraErrorWidget.LLILZIL = false;
        C743540TEq.LJJIJIIJIL(phoneAsCameraErrorWidget.LLILZ, "click", "abnormal", "cancel", C0TES.LIZ(phoneAsCameraErrorWidget.dataChannel));
        Context context = ((PhoneAsCameraErrorWidget) acS495S0100000_12.l0).context;
        if (context != null && (c19egLIZ = C1124140fMK.LIZ(context)) != null) {
            c19egLIZ.finish();
        }
    }

    public static final void LIZ$24(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        DataChannel dataChannel = ((PhoneAsCameraErrorWidget) acS495S0100000_12.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(LivePhoneAsCameraRetryClickEvent.class);
        }
        liveDialog.dismiss();
        PhoneAsCameraErrorWidget phoneAsCameraErrorWidget = (PhoneAsCameraErrorWidget) acS495S0100000_12.l0;
        phoneAsCameraErrorWidget.LLILZIL = false;
        C743540TEq.LJJIJIIJIL(phoneAsCameraErrorWidget.LLILZ, "click", "abnormal", "retry", C0TES.LIZ(phoneAsCameraErrorWidget.dataChannel));
    }

    public static final void LIZ$25(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((ModeratorHostIModeratorListFragment) acS495S0100000_12.l0).OR("cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$26(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        KevaDebugFragment kevaDebugFragment = (KevaDebugFragment) acS495S0100000_12.l0;
        kevaDebugFragment.LLILZLL.clear();
        kevaDebugFragment.LLIZ.clear();
        C745350TLp c745350TLp = kevaDebugFragment.LLILZIL;
        if (c745350TLp != null) {
            c745350TLp.LL = C13BV.INSTANCE;
            c745350TLp.notifyDataSetChanged();
        }
        C745350TLp c745350TLp2 = kevaDebugFragment.LLILZIL;
        if (c745350TLp2 != null) {
            c745350TLp2.notifyDataSetChanged();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$27(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((Function0) acS495S0100000_12.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$28(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((LiveBroadcastEndFragment) acS495S0100000_12.l0).UR("ok");
    }

    public static final void LIZ$29(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((LiveBroadcastEndFragment) acS495S0100000_12.l0).UR("ok");
    }

    public static final void LIZ$3(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((Function1) acS495S0100000_12.l0).invoke(liveDialog);
        liveDialog.dismiss();
    }

    public static final void LIZ$30(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(null, "sslocal://openRecord?enter_from=direct_shoot&tab=live", new Bundle());
        liveDialog.dismiss();
        ((LiveBroadcastEndFragment) acS495S0100000_12.l0).UR("go live again");
        ((LiveBroadcastEndFragment) acS495S0100000_12.l0).close();
    }

    public static final void LIZ$31(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((LiveBroadcastEndFragment) acS495S0100000_12.l0).UR("not now");
    }

    public static final void LIZ$32(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((LiveBroadcastEndFragment) acS495S0100000_12.l0).UR("ok");
    }

    public static final void LIZ$33(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((LiveBroadcastEndFragment) acS495S0100000_12.l0).UR("ok");
    }

    public static final void LIZ$34(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C19EG c19egLIZ;
        liveDialog.dismiss();
        PhoneAsCameraErrorWidget phoneAsCameraErrorWidget = (PhoneAsCameraErrorWidget) acS495S0100000_12.l0;
        C743540TEq.LJJIJIIJIL(phoneAsCameraErrorWidget.LLILZ, "click", "ls_deny", "got_it", C0TES.LIZ(phoneAsCameraErrorWidget.dataChannel));
        Context context = ((PhoneAsCameraErrorWidget) acS495S0100000_12.l0).context;
        if (context != null && (c19egLIZ = C1124140fMK.LIZ(context)) != null) {
            c19egLIZ.finish();
        }
    }

    public static final void LIZ$35(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((TryModeBroadcastFragment) acS495S0100000_12.l0).uS("leave");
        liveDialog.dismiss();
        ((TryModeBroadcastFragment) acS495S0100000_12.l0).mS();
    }

    public static final void LIZ$36(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((TryModeBroadcastFragment) acS495S0100000_12.l0).sS("leave");
        liveDialog.dismiss();
        ((TryModeBroadcastFragment) acS495S0100000_12.l0).mS();
    }

    public static final void LIZ$37(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((TryModeBroadcastFragment) acS495S0100000_12.l0).sS("go_live");
        liveDialog.dismiss();
        TryModeBroadcastInteractionFragment tryModeBroadcastInteractionFragment = ((TryModeBroadcastFragment) acS495S0100000_12.l0).LLJLILLLLZIIL;
        if (tryModeBroadcastInteractionFragment != null) {
            tryModeBroadcastInteractionFragment.SR();
        }
    }

    public static final void LIZ$38(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((Function0) acS495S0100000_12.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$39(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        boolean z = C0URD.LJ;
        C0UQ2.LIZ().LIZJ();
        C0UOS c0uos = C0UOS.LIZ;
        DataChannel dataChannel = (DataChannel) acS495S0100000_12.l0;
        c0uos.getClass();
        C0UOS.LIZ(dataChannel, "confirm");
    }

    public static final void LIZ$4(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C0U17 c0u17 = C0U17.LIZ;
        C0U17.LJII(((KaraokePageFragment) acS495S0100000_12.l0).LLJILJILJ, "cancel", "");
    }

    public static final void LIZ$40(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        String str;
        DataChannel dataChannel = (DataChannel) acS495S0100000_12.l0;
        LiveMode liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        if (liveMode == null || (str = liveMode.logStreamingType) == null) {
            str = LiveMode.VIDEO.logStreamingType;
        }
        C0UQX.LJJIIZ(dataChannel, "cancel", str);
        liveDialog.dismiss();
    }

    public static final void LIZ$41(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        String str;
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.v6;
        c20337914i1.LJFF(Boolean.FALSE);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_caption_off_popup");
        c474500IjALIZ.LJIL();
        Map<String, String> mapLIZIZ = ((BasePreviewSettingMainFragmentSheetInitializer) acS495S0100000_12.l0).LIZIZ();
        ((HashMap) mapLIZIZ).put("action_type", "turn_off");
        c474500IjALIZ.LJJIIZI(mapLIZIZ);
        c474500IjALIZ.LIZ();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_caption_icon_change");
        c474500IjALIZ2.LJIL();
        Map<String, String> mapLIZIZ2 = ((BasePreviewSettingMainFragmentSheetInitializer) acS495S0100000_12.l0).LIZIZ();
        if (c20337914i1.LIZIZ().booleanValue()) {
            str = "on";
        } else {
            str = "off";
        }
        ((HashMap) mapLIZIZ2).put("to_status", str);
        c474500IjALIZ2.LJJIIZI(mapLIZIZ2);
        c474500IjALIZ2.LJ("show");
        c474500IjALIZ2.LIZ();
        liveDialog.dismiss();
    }

    public static final void LIZ$42(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        String str;
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.v6;
        c20337914i1.LJFF(Boolean.FALSE);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_caption_off_popup");
        c474500IjALIZ.LJIL();
        Map<String, String> mapOR = ((BasePreviewSettingMainFragment) acS495S0100000_12.l0).OR();
        ((HashMap) mapOR).put("action_type", "turn_off");
        c474500IjALIZ.LJJIIZI(mapOR);
        c474500IjALIZ.LIZ();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_caption_icon_change");
        c474500IjALIZ2.LJIL();
        Map<String, String> mapOR2 = ((BasePreviewSettingMainFragment) acS495S0100000_12.l0).OR();
        if (c20337914i1.LIZIZ().booleanValue()) {
            str = "on";
        } else {
            str = "off";
        }
        ((HashMap) mapOR2).put("to_status", str);
        c474500IjALIZ2.LJJIIZI(mapOR2);
        c474500IjALIZ2.LJ("show");
        c474500IjALIZ2.LIZ();
        liveDialog.dismiss();
    }

    public static final void LIZ$43(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        BasePreviewSettingMainFragment basePreviewSettingMainFragment = (BasePreviewSettingMainFragment) acS495S0100000_12.l0;
        basePreviewSettingMainFragment.LLLI = true;
        basePreviewSettingMainFragment.VR().setChecked(InterfaceC1106030et7.v6.LIZIZ().booleanValue());
        liveDialog.dismiss();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_caption_off_popup");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(((BasePreviewSettingMainFragment) acS495S0100000_12.l0).OR());
        c474500IjALIZ.LJ("cancel");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZ$44(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((Function0) acS495S0100000_12.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$45(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((Function0) acS495S0100000_12.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$46(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C763230Twn.LJ(C475510Ikn.LJ((LiveBGMPlaylistFragment) acS495S0100000_12.l0), "remove_all_confirm", null);
        LiveBGMPlaylistFragment liveBGMPlaylistFragment = (LiveBGMPlaylistFragment) acS495S0100000_12.l0;
        C500260Jjc.LJJJJJ(liveBGMPlaylistFragment, null, new C762110Tuz(liveBGMPlaylistFragment, null), 3);
    }

    public static final void LIZ$47(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C763230Twn.LJ(C475510Ikn.LJ((LiveBGMPlaylistFragment) acS495S0100000_12.l0), "remove_all_cancel", null);
    }

    public static final void LIZ$48(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        String str;
        C778180Ufo c778180Ufo = (C778180Ufo) acS495S0100000_12.l0;
        C19EG activity = c778180Ufo.LL.getActivity();
        if (activity != null && (str = c778180Ufo.LLJ) != null) {
            c778180Ufo.LLJIJIL = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(activity, UriProtector.parse(str).buildUpon().appendQueryParameter("device_brand", C497740JfY.LJ()).appendQueryParameter("os_version", String.valueOf(C778190Ufp.LIZ())).appendQueryParameter("anchor_id", c778180Ufo.LJIIIIZZ()).appendQueryParameter("room_id", String.valueOf(c778180Ufo.LJIIJJI())).appendQueryParameter("scene_type", "in_live").appendQueryParameter("enter_from", "live_popup").build().toString(), null);
        }
        C778180Ufo c778180Ufo2 = (C778180Ufo) acS495S0100000_12.l0;
        C776320Uco c776320Uco = c778180Ufo2.LLJILJIL;
        if (c776320Uco != null) {
            c776320Uco.LJ(c778180Ufo2.LJIIJJI(), EnumC778210Ufr.LIVE_POPUP, EnumC777330UeR.LEARN_MORE, EnumC778250Ufv.IN_LIVE);
        }
    }

    public static final void LIZ$49(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C778180Ufo c778180Ufo = (C778180Ufo) acS495S0100000_12.l0;
        C776320Uco c776320Uco = c778180Ufo.LLJILJIL;
        if (c776320Uco != null) {
            c776320Uco.LJ(c778180Ufo.LJIIJJI(), EnumC778210Ufr.LIVE_POPUP, EnumC777330UeR.NOT_NOW, EnumC778250Ufv.IN_LIVE);
        }
        liveDialog.dismiss();
        if (((C778180Ufo) acS495S0100000_12.l0).LLIZ) {
            return;
        }
        C773220UUu c773220UUu = C773220UUu.LIZ;
        AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(154);
        c773220UUu.getClass();
        C773220UUu.LJIIL(aFwS245S0000000_12);
        ((C778180Ufo) acS495S0100000_12.l0).LLILLL.LIZ(CertProviderManagerKt.findCert("bpea-multi_device_interrupt_guide_not_now", 1476788483));
    }

    public static final void LIZ$5(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        KaraokeViewModel karaokeViewModel = ((KaraokePageFragment) acS495S0100000_12.l0).LLJIJIL;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(C763760Txe.LIZ);
        }
        C0U17 c0u17 = C0U17.LIZ;
        C0U17.LJII(((KaraokePageFragment) acS495S0100000_12.l0).LLJILJILJ, "quit", "");
    }

    public static final void LIZ$50(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((C778180Ufo) acS495S0100000_12.l0).LLILLL.LJ();
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LIZJ(EnumC777480Ueg.INTERRUPTED, "error");
        } else {
            ((C778180Ufo) acS495S0100000_12.l0).LLILLL.LJIIIZ(EnumC778100Ufg.LIVE_TIP_MESSAGE_INTERRUPTED_ERROR.ordinal(), null, "", null, false);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_unexcepted_interruption_golive_click");
        c474500IjALIZ.LJJII(((C778180Ufo) acS495S0100000_12.l0).LJIIIIZZ(), "anchor_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(((C778180Ufo) acS495S0100000_12.l0).LJIIJJI()), "room_id");
        c474500IjALIZ.LJJII(((C778180Ufo) acS495S0100000_12.l0).LJIIJ(), "enter_from");
        c474500IjALIZ.LJJII("go", "click_type");
        c474500IjALIZ.LIZ();
        ((C778180Ufo) acS495S0100000_12.l0).LLIZLLLIL = 0;
    }

    public static final void LIZ$51(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_unexcepted_interruption_golive_click");
        c474500IjALIZ.LJJII(((C778180Ufo) acS495S0100000_12.l0).LJIIIIZZ(), "anchor_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(((C778180Ufo) acS495S0100000_12.l0).LJIIJJI()), "room_id");
        c474500IjALIZ.LJJII(((C778180Ufo) acS495S0100000_12.l0).LJIIJ(), "enter_from");
        c474500IjALIZ.LJJII("not_now", "click_type");
        c474500IjALIZ.LIZ();
        C778180Ufo c778180Ufo = (C778180Ufo) acS495S0100000_12.l0;
        c778180Ufo.LLIZLLLIL = 0;
        if (c778180Ufo.LLIZ) {
            return;
        }
        C773220UUu c773220UUu = C773220UUu.LIZ;
        AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(153);
        c773220UUu.getClass();
        C773220UUu.LJIIL(aFwS245S0000000_12);
        ((C778180Ufo) acS495S0100000_12.l0).LLILLL.LIZ(CertProviderManagerKt.findCert("bpea-multi_device_interrupt_resume_not_now", 1476788483));
    }

    public static final void LIZ$52(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((C784470Upx) acS495S0100000_12.l0).LIZLLL(liveDialog);
    }

    public static final void LIZ$53(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C784470Upx c784470Upx = (C784470Upx) acS495S0100000_12.l0;
        c784470Upx.getClass();
        InterfaceC1106030et7.c5.LJFF(Boolean.FALSE);
        c784470Upx.LIZIZ("not_allowed");
        liveDialog.dismiss();
    }

    public static final void LIZ$54(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        OneTapGoLiveManager oneTapGoLiveManager = (OneTapGoLiveManager) acS495S0100000_12.l0;
        oneTapGoLiveManager.getClass();
        C20441214yg.LIZIZ("OneTapGoLiveManager", "closeRoomAsAudienceAndStartLive");
        C781270Ukn.LJIIJ().finishLivePlayActivityAndGoLiveActivity();
        oneTapGoLiveManager.LJJIII();
    }

    public static final void LIZ$55(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        if (LiveStreamEnableUrlListSetting.INSTANCE.enable()) {
            C0UYB c0uyb = (C0UYB) acS495S0100000_12.l0;
            InterfaceC769940UIe interfaceC769940UIe = c0uyb.LJ;
            if (interfaceC769940UIe != null) {
                interfaceC769940UIe.k3(c0uyb.LIZJ.getStreamUrl().pushUrlList);
            }
        } else {
            C0UYB c0uyb2 = (C0UYB) acS495S0100000_12.l0;
            InterfaceC769940UIe interfaceC769940UIe2 = c0uyb2.LJ;
            if (interfaceC769940UIe2 != null) {
                interfaceC769940UIe2.start(c0uyb2.LIZJ.getStreamUrl().LIZLLL);
            }
        }
        ((C0UYB) acS495S0100000_12.l0).LJIIJJI++;
    }

    public static final void LIZ$56(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            ((GameLinkV2Widget) acS495S0100000_12.l0).getClass();
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion()) {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((GameLinkV2Widget) acS495S0100000_12.l0).context, value);
        if (UserService.getInstance().user() != null) {
            HashMap map = new HashMap();
            map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_click_contact_us");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJIJJLI(((GameLinkV2Widget) acS495S0100000_12.l0).dataChannel);
            c474500IjALIZ.LIZ();
        }
        HashMap map2 = new HashMap();
        map2.put("choose_type", "contact_us");
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("guest_connection_underage_popup");
        c474500IjALIZ2.LJIL();
        c474500IjALIZ2.LJJIIZI(map2);
        c474500IjALIZ2.LJ("click");
        c474500IjALIZ2.LIZ();
    }

    public static final void LIZ$57(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C771970UPz c771970UPz = C771970UPz.LIZ;
        DataChannel dataChannel = (DataChannel) acS495S0100000_12.l0;
        c771970UPz.getClass();
        C771970UPz.LIZIZ(dataChannel, "not_now");
    }

    public static final void LIZ$58(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((Function0) acS495S0100000_12.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$59(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        Function2 function2 = (Function2) acS495S0100000_12.l0;
        if (function2 != null) {
            function2.invoke("click", "default_tab");
        }
    }

    public static final void LIZ$6(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        boolean zIsChecked;
        boolean zIsChecked2;
        CommercialContentToggle commercialContentToggle = new CommercialContentToggle();
        LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheet = (LiveCommercialContentToggleFragmentSheet) acS495S0100000_12.l0;
        C20743716Ff c20743716FfGS = liveCommercialContentToggleFragmentSheet.GS();
        boolean zIsChecked3 = false;
        if (c20743716FfGS != null) {
            zIsChecked = c20743716FfGS.isChecked();
        } else {
            zIsChecked = false;
        }
        commercialContentToggle.openCommercialContentToggle = zIsChecked;
        C20744116Fj c20744116FjBS = liveCommercialContentToggleFragmentSheet.BS();
        if (c20744116FjBS != null) {
            zIsChecked2 = c20744116FjBS.isChecked();
        } else {
            zIsChecked2 = false;
        }
        commercialContentToggle.promoteMyself = zIsChecked2;
        C20744116Fj c20744116FjYS = liveCommercialContentToggleFragmentSheet.yS();
        if (c20744116FjYS != null) {
            zIsChecked3 = c20744116FjYS.isChecked();
        }
        commercialContentToggle.promoteThirdParty = zIsChecked3;
        LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheet2 = (LiveCommercialContentToggleFragmentSheet) acS495S0100000_12.l0;
        if (liveCommercialContentToggleFragmentSheet2.LLLIIL) {
            C197600pS.LIZ().fV1(commercialContentToggle);
            C758920Tpq c758920Tpq = ((LiveCommercialContentToggleFragmentSheet) acS495S0100000_12.l0).LLLIZZ;
            if (c758920Tpq != null) {
                c758920Tpq.LIZLLL = true;
            }
        } else {
            liveCommercialContentToggleFragmentSheet2.RS(commercialContentToggle);
        }
        ((LiveCommercialContentToggleFragmentSheet) acS495S0100000_12.l0).QS();
        liveDialog.dismiss();
        ((LiveCommercialContentToggleFragmentSheet) acS495S0100000_12.l0).close(1);
    }

    public static final void LIZ$60(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C0TZ0 c0tz0 = (C0TZ0) acS495S0100000_12.l0;
        if (c0tz0.LLILZLL) {
            C500260Jjc.LJIILJJIL(c0tz0.getBlockWordEditEtFromXml());
        }
        ((C0TZ0) acS495S0100000_12.l0).LJII(true);
        liveDialog.dismiss();
    }

    public static final void LIZ$61(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C0UD7 c0ud7 = C0UD7.LIZ;
        LiveMultiGuestBeautyEffectFragment liveMultiGuestBeautyEffectFragment = (LiveMultiGuestBeautyEffectFragment) acS495S0100000_12.l0;
        DataChannel dataChannel = liveMultiGuestBeautyEffectFragment.LLIZ;
        String str = liveMultiGuestBeautyEffectFragment.LLJ;
        if (str == null) {
            str = "";
        }
        C0UD7.LJIILJJIL(dataChannel, str, "go back");
        liveDialog.dismiss();
    }

    public static final void LIZ$62(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C0U7R c0u7r = C0U7R.LIZ;
        ViewOnLayoutChangeListenerC766940U6q viewOnLayoutChangeListenerC766940U6q = (ViewOnLayoutChangeListenerC766940U6q) acS495S0100000_12.l0;
        DataChannel dataChannel = viewOnLayoutChangeListenerC766940U6q.LLILLJJLI;
        String str = viewOnLayoutChangeListenerC766940U6q.LLJJIJI;
        if (str == null) {
            str = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_reset_beauty_popup_window_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "tab_name");
        c474500IjALIZ.LJJII("reset", "click_type");
        c474500IjALIZ.LIZ();
        ViewOnLayoutChangeListenerC766940U6q viewOnLayoutChangeListenerC766940U6q2 = (ViewOnLayoutChangeListenerC766940U6q) acS495S0100000_12.l0;
        if (!Intrinsics.LJFF(viewOnLayoutChangeListenerC766940U6q2.LLJJIII, C0UD4.LJI)) {
            viewOnLayoutChangeListenerC766940U6q2.LLJJJIL.LJFF();
            viewOnLayoutChangeListenerC766940U6q2.LLIZLLLIL.setEnabled(false);
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$63(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C0U7R c0u7r = C0U7R.LIZ;
        ViewOnLayoutChangeListenerC766940U6q viewOnLayoutChangeListenerC766940U6q = (ViewOnLayoutChangeListenerC766940U6q) acS495S0100000_12.l0;
        DataChannel dataChannel = viewOnLayoutChangeListenerC766940U6q.LLILLJJLI;
        String str = viewOnLayoutChangeListenerC766940U6q.LLJJIJI;
        if (str == null) {
            str = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_reset_beauty_popup_window_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "tab_name");
        c474500IjALIZ.LJJII("go back", "click_type");
        c474500IjALIZ.LIZ();
        liveDialog.dismiss();
    }

    public static final void LIZ$64(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C0UD7 c0ud7 = C0UD7.LIZ;
        LiveMultiGuestBeautyEffectFragment liveMultiGuestBeautyEffectFragment = (LiveMultiGuestBeautyEffectFragment) acS495S0100000_12.l0;
        DataChannel dataChannel = liveMultiGuestBeautyEffectFragment.LLIZ;
        String str = liveMultiGuestBeautyEffectFragment.LLJ;
        if (str == null) {
            str = "";
        }
        C0UD7.LJIILJJIL(dataChannel, str, "reset");
        LiveMultiGuestBeautyEffectFragment liveMultiGuestBeautyEffectFragment2 = (LiveMultiGuestBeautyEffectFragment) acS495S0100000_12.l0;
        ((C0U6V) liveMultiGuestBeautyEffectFragment2.LL.getValue()).LJFF();
        InterfaceC766830U6f interfaceC766830U6f = liveMultiGuestBeautyEffectFragment2.LLILZLL;
        if (interfaceC766830U6f == null) {
            interfaceC766830U6f = null;
        }
        interfaceC766830U6f.LIZ(false);
        C0UD7.LJIIL = true;
        liveDialog.dismiss();
    }

    public static final void LIZ$65(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((GamePreparationFragment) acS495S0100000_12.l0).UR("confirm");
        GamePreparationFragment gamePreparationFragment = (GamePreparationFragment) acS495S0100000_12.l0;
        gamePreparationFragment.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        gamePreparationFragment.LLJILLL = false;
        gamePreparationFragment.LLJILJILJ.LJ();
        InterfaceC773750UWv interfaceC773750UWv = ((GamePreparationFragment) acS495S0100000_12.l0).LLJJI;
        if (interfaceC773750UWv == null) {
            interfaceC773750UWv = null;
        }
        interfaceC773750UWv.jC(true);
    }

    public static final void LIZ$66(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((GamePreparationFragment) acS495S0100000_12.l0).ZR();
    }

    public static final void LIZ$67(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C0W78.LJII(((C776870Udh) acS495S0100000_12.l0).LJI);
    }

    public static final void LIZ$68(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C1086800eO6.LIZ.LIZ(1, new AwS581S0100000_2((Function0) acS495S0100000_12.l0, (Function0<Unit>) 624));
        liveDialog.dismiss();
    }

    public static final void LIZ$69(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        C774850UaR.LIZIZ("click_discard");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_record_discard");
        c474500IjALIZ.LJIL();
        LiveRecordManager liveRecordManager = LiveRecordManager.LL;
        liveRecordManager.getClass();
        c474500IjALIZ.LJJII(Integer.valueOf(LiveRecordManager.LLIZ), "duration");
        c474500IjALIZ.LJJII("click_floating_ball", "discard_method");
        c474500IjALIZ.LIZ();
        ((C774860UaS) acS495S0100000_12.l0).LLILZIL = true;
        liveRecordManager.getClass();
        LiveRecordManager.LJ("manual", false, false);
        liveDialog.dismiss();
    }

    public static final void LIZ$7(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        LiveBroadcastEndFragment liveBroadcastEndFragment = (LiveBroadcastEndFragment) acS495S0100000_12.l0;
        liveBroadcastEndFragment.VR("click", "suggest_tab", liveBroadcastEndFragment.LLJILLL, liveBroadcastEndFragment.LLJILJILJ);
        LiveBroadcastEndFragment liveBroadcastEndFragment2 = (LiveBroadcastEndFragment) acS495S0100000_12.l0;
        PerceptionDialogInfo perceptionDialogInfo = liveBroadcastEndFragment2.LLJILJILJ;
        if (perceptionDialogInfo == null || (str = perceptionDialogInfo.violationDetailUrl) == null || liveBroadcastEndFragment2.getContext() == null || str.length() <= 0) {
            str = null;
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((LiveBroadcastEndFragment) acS495S0100000_12.l0).getContext(), str);
    }

    public static final void LIZ$70(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_stream_several_fail_popup_click");
        c474500IjALIZ.LJJII(String.valueOf(((C778170Ufn) acS495S0100000_12.l0).LLILLJJLI.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(((C778170Ufn) acS495S0100000_12.l0).LLILLJJLI.getIdStr(), "room_id");
        c474500IjALIZ.LJJII("retry", "action_type");
        C778570UgR c778570UgR = ((C778170Ufn) acS495S0100000_12.l0).LLJILJIL;
        if (c778570UgR != null) {
            str = c778570UgR.LIZLLL;
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "error_type");
        c474500IjALIZ.LIZ();
        ((C778170Ufn) acS495S0100000_12.l0).LLILLL.LIZLLL();
        ((C778170Ufn) acS495S0100000_12.l0).LLJILJILJ = true;
        liveDialog.dismiss();
    }

    public static final void LIZ$71(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        String str;
        int i;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_stream_several_fail_popup_click");
        c474500IjALIZ.LJJII(String.valueOf(((C778170Ufn) acS495S0100000_12.l0).LLILLJJLI.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(((C778170Ufn) acS495S0100000_12.l0).LLILLJJLI.getIdStr(), "room_id");
        c474500IjALIZ.LJJII("end_live", "action_type");
        C778570UgR c778570UgR = ((C778170Ufn) acS495S0100000_12.l0).LLJILJIL;
        if (c778570UgR != null) {
            str = c778570UgR.LIZLLL;
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "error_type");
        c474500IjALIZ.LIZ();
        C778170Ufn c778170Ufn = (C778170Ufn) acS495S0100000_12.l0;
        C778570UgR c778570UgR2 = c778170Ufn.LLJILJIL;
        if (c778570UgR2 != null) {
            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            int i2 = c778570UgR2.LIZ;
            int i3 = c778570UgR2.LIZIZ;
            String str2 = c778570UgR2.LIZJ;
            long ownerUserId = c778170Ufn.LLILLJJLI.getOwnerUserId();
            long id = c778170Ufn.LLILLJJLI.getId();
            Creator creator = c778170Ufn.LLILLJJLI.creator;
            if (creator != null) {
                i = creator.roomContinue;
            } else {
                i = 0;
            }
            iBroadcastService.reportStreamEndForLiveCore(i2, i3, str2, ownerUserId, id, false, i);
        }
        c778170Ufn.LLILLL.LIZ(CertProviderManagerKt.findCert("bpea-stop_live_net_work_error", 1476788483));
        liveDialog.dismiss();
    }

    public static final void LIZ$72(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((C778170Ufn) acS495S0100000_12.l0).LJIIJ("popup", "click_close", null);
        liveDialog.dismiss();
    }

    public static final void LIZ$73(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C750580TcO c750580TcO = (C750580TcO) acS495S0100000_12.l0;
        InterfaceC750520TcI interfaceC750520TcI = c750580TcO.LLILLJJLI;
        if (interfaceC750520TcI != null) {
            interfaceC750520TcI.LIZIZ(c750580TcO.LLILZLL);
        }
        InterfaceC750520TcI interfaceC750520TcI2 = ((C750580TcO) acS495S0100000_12.l0).LLILLJJLI;
        if (interfaceC750520TcI2 != null) {
            interfaceC750520TcI2.LIZJ(true);
        }
        ((C750580TcO) acS495S0100000_12.l0).LJIIJ("cancel");
    }

    public static final void LIZ$74(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ModeratorPermissionEditFragment moderatorPermissionEditFragment = (ModeratorPermissionEditFragment) acS495S0100000_12.l0;
        if (moderatorPermissionEditFragment.isAdded()) {
            AdminApi adminApi = (AdminApi) C482260Ivg.LIZJ(AdminApi.class);
            C750740Tce c750740Tce = moderatorPermissionEditFragment.LLILZLL;
            if (c750740Tce == null) {
                c750740Tce = null;
            }
            adminApi.updateAdmin(2, c750740Tce.LIZ, moderatorPermissionEditFragment.LLIZLLLIL, ((Number) moderatorPermissionEditFragment.LLJI.getValue()).longValue()).LJIILIIL(C0J1R.LIZIZ(moderatorPermissionEditFragment)).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(moderatorPermissionEditFragment, 296), new C09JN() { // from class: X.00KJ
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ModeratorPermissionEditFragment@751f.removeModerator$2");
                    C766270U4b.LIZLLL(2131842705);
                    C1C7U.LIZIZ("ModeratorPermissionEditFragment@751f.removeModerator$2");
                }
            });
        }
        ((ModeratorPermissionEditFragment) acS495S0100000_12.l0).ZR("click_remove");
        liveDialog.dismiss();
    }

    public static final void LIZ$75(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((ModeratorPermissionEditFragment) acS495S0100000_12.l0).ZR("click_cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$76(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet = (ModeratorPermissionEditFragmentSheet) acS495S0100000_12.l0;
        if (moderatorPermissionEditFragmentSheet.isAdded()) {
            AdminApi adminApi = (AdminApi) C482260Ivg.LIZJ(AdminApi.class);
            C750740Tce c750740Tce = moderatorPermissionEditFragmentSheet.LLJLLL;
            if (c750740Tce == null) {
                c750740Tce = null;
            }
            adminApi.updateAdmin(2, c750740Tce.LIZ, moderatorPermissionEditFragmentSheet.LLJZIJLIL, ((Number) moderatorPermissionEditFragmentSheet.LLLF.getValue()).longValue()).LJIILIIL(C0J1R.LIZIZ(moderatorPermissionEditFragmentSheet)).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(moderatorPermissionEditFragmentSheet, 301), new C09JN() { // from class: X.00KK
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ModeratorPermissionEditFragmentSheet@bb7d.removeModerator$2");
                    C766270U4b.LIZLLL(2131842705);
                    C1C7U.LIZIZ("ModeratorPermissionEditFragmentSheet@bb7d.removeModerator$2");
                }
            });
        }
        ((ModeratorPermissionEditFragmentSheet) acS495S0100000_12.l0).FS("click_remove");
        liveDialog.dismiss();
    }

    public static final void LIZ$77(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        ((ModeratorPermissionEditFragmentSheet) acS495S0100000_12.l0).FS("click_cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$78(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C19EG activity = ((C0U4X) acS495S0100000_12.l0).LIZ.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void LIZ$79(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function0) acS495S0100000_12.l0).invoke();
    }

    public static final void LIZ$8(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        LiveBroadcastEndFragment liveBroadcastEndFragment = (LiveBroadcastEndFragment) acS495S0100000_12.l0;
        liveBroadcastEndFragment.VR("click", "default_tab", liveBroadcastEndFragment.LLJILLL, liveBroadcastEndFragment.LLJILJILJ);
    }

    public static final void LIZ$80(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        Function0 function0 = (Function0) acS495S0100000_12.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$81(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((SoundEffectFragment) acS495S0100000_12.l0).dismiss();
    }

    public static final void LIZ$82(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        Function0<Unit> function0 = ((C783350Uo9) acS495S0100000_12.l0).LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$83(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        Function0<Unit> function0 = ((C783320Uo6) acS495S0100000_12.l0).LIZIZ.LIZIZ;
        if (function0 != null) {
            function0.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$84(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        Function0<Unit> function0 = ((C783320Uo6) acS495S0100000_12.l0).LIZIZ.LIZJ;
        if (function0 != null) {
            function0.invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$85(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        Function0 function0 = (Function0) acS495S0100000_12.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$9(AcS495S0100000_12 acS495S0100000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        LiveBroadcastEndFragment liveBroadcastEndFragment = (LiveBroadcastEndFragment) acS495S0100000_12.l0;
        liveBroadcastEndFragment.VR("click", "default_tab", liveBroadcastEndFragment.LLJILLL, liveBroadcastEndFragment.LLJILJILJ);
    }
}
