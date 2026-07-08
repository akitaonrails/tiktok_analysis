package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.broadcast.PerceptionDialogDismissedChannel;
import com.bytedance.android.livesdk.broadcast.TryModeCloseDialogShowing;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBeautyWidget;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.game.broadcast.fragment.DualDeviceRtcSourceFragment;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceSourceFragmentV2;
import com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraScannerFragment;
import com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraWiredFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class DialogInterfaceOnDismissListenerC786080UsY implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) throws Throwable {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
            case 8:
                onDismiss$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onDismiss$9(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onDismiss$10(this, dialogInterface);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onDismiss$11(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onDismiss$12(this, dialogInterface);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onDismiss$13(this, dialogInterface);
                break;
            case 14:
                onDismiss$14(this, dialogInterface);
                break;
            case 15:
                onDismiss$15(this, dialogInterface);
                break;
            case 16:
                onDismiss$16(this, dialogInterface);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onDismiss$17(this, dialogInterface);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onDismiss$18(this, dialogInterface);
                break;
            case 19:
                onDismiss$19(this, dialogInterface);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onDismiss$20(this, dialogInterface);
                break;
            case 21:
                onDismiss$21(this, dialogInterface);
                break;
            case 22:
                onDismiss$22(this, dialogInterface);
                break;
            case 23:
                onDismiss$23(this, dialogInterface);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onDismiss$24(this, dialogInterface);
                break;
            case 25:
                onDismiss$25(this, dialogInterface);
                break;
            case 26:
                onDismiss$26(this, dialogInterface);
                break;
            case 27:
                onDismiss$27(this, dialogInterface);
                break;
            case 28:
                onDismiss$28(this, dialogInterface);
                break;
            case 29:
                onDismiss$29(this, dialogInterface);
                break;
            case 30:
                onDismiss$30(this, dialogInterface);
                break;
            case 31:
                onDismiss$31(this, dialogInterface);
                break;
            case 32:
                onDismiss$32(this, dialogInterface);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onDismiss$33(this, dialogInterface);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onDismiss$34(this, dialogInterface);
                break;
            case 35:
                onDismiss$35(this, dialogInterface);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onDismiss$36(this, dialogInterface);
                break;
            case 37:
                onDismiss$37(this, dialogInterface);
                break;
            case 38:
                onDismiss$38(this, dialogInterface);
                break;
            case 39:
                onDismiss$39(this, dialogInterface);
                break;
            case 40:
                onDismiss$40(this, dialogInterface);
                break;
            case 41:
                onDismiss$41(this, dialogInterface);
                break;
            case 42:
                onDismiss$42(this, dialogInterface);
                break;
            case 43:
                onDismiss$43(this, dialogInterface);
                break;
            case 44:
                onDismiss$44(this, dialogInterface);
                break;
            case 45:
                onDismiss$45(this, dialogInterface);
                break;
            case 46:
                onDismiss$46(this, dialogInterface);
                break;
            case 47:
                onDismiss$47(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC786080UsY(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C776410Ucx) dialogInterfaceOnDismissListenerC786080UsY.l0).LLILLJJLI.LIZIZ().dV0(true);
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((GameDualDeviceSourceFragmentV2) dialogInterfaceOnDismissListenerC786080UsY.l0).LLJI = null;
    }

    public static final void onDismiss$10(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        C0SHX.LIZ((C19EG) dialogInterfaceOnDismissListenerC786080UsY.l0, null).LJIIJJI("ad_explain_static_dynamic", false, null);
    }

    public static final void onDismiss$11(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0).LIZ();
    }

    public static final void onDismiss$12(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0).LIZ();
    }

    public static final void onDismiss$13(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0).LIZ();
    }

    public static final void onDismiss$14(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        C20656615sK c20656615sK = (C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0;
        if (c20656615sK != null) {
            c20656615sK.LIZ();
        }
    }

    public static final void onDismiss$15(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        C20656615sK c20656615sK = (C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0;
        if (c20656615sK != null) {
            c20656615sK.LIZ();
        }
    }

    public static final void onDismiss$16(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        C20656615sK c20656615sK = (C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0;
        if (c20656615sK != null) {
            c20656615sK.LIZ();
        }
    }

    public static final void onDismiss$17(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        C20656615sK c20656615sK = (C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0;
        if (c20656615sK != null) {
            c20656615sK.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onDismiss$18(X.DialogInterfaceOnDismissListenerC786080UsY r14, android.content.DialogInterface r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnDismissListenerC786080UsY.onDismiss$18(X.0UsY, android.content.DialogInterface):void");
    }

    public static final void onDismiss$19(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (abstractC343940De4LJIIJJI instanceof C343970De7) {
            C473200Ih4.LIZ((C1ACA) dialogInterfaceOnDismissListenerC786080UsY.l0, "close");
        } else if (abstractC343940De4LJIIJJI instanceof C343980De8) {
            C473200Ih4.LIZ((C1ACA) dialogInterfaceOnDismissListenerC786080UsY.l0, "close");
        } else {
            if (!(abstractC343940De4LJIIJJI instanceof C343960De6)) {
                return;
            }
            C473200Ih4.LIZ((C1ACA) dialogInterfaceOnDismissListenerC786080UsY.l0, "back");
        }
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((DualDeviceRtcSourceFragment) dialogInterfaceOnDismissListenerC786080UsY.l0).LLJIJIL = null;
    }

    public static final void onDismiss$20(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0).LIZ();
    }

    public static final void onDismiss$21(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0).LIZ();
    }

    public static final void onDismiss$22(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0).LIZ();
    }

    public static final void onDismiss$23(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((TryModeBroadcastFragment) dialogInterfaceOnDismissListenerC786080UsY.l0).getDataChannel().zW(TryModeCloseDialogShowing.class, Boolean.FALSE);
    }

    public static final void onDismiss$24(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((TryModeBroadcastFragment) dialogInterfaceOnDismissListenerC786080UsY.l0).getDataChannel().zW(TryModeCloseDialogShowing.class, Boolean.FALSE);
    }

    public static final void onDismiss$25(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C776490Ud5) dialogInterfaceOnDismissListenerC786080UsY.l0).LLILLL.LIZIZ().dV0(true);
    }

    public static final void onDismiss$26(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        boolean z = C0URD.LJ;
        C0UQ2.LIZ().LIZJ();
        C771840UPm c771840UPm = (C771840UPm) dialogInterfaceOnDismissListenerC786080UsY.l0;
        C0ULC c0ulc = c771840UPm.LIZJ;
        if (c0ulc != null) {
            c771840UPm.LIZ.getLifecycle().removeObserver(c0ulc);
        }
        C771840UPm c771840UPm2 = (C771840UPm) dialogInterfaceOnDismissListenerC786080UsY.l0;
        c771840UPm2.LIZJ = null;
        c771840UPm2.LIZLLL = false;
    }

    public static final void onDismiss$27(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C778180Ufo) dialogInterfaceOnDismissListenerC786080UsY.l0).LJIIIZ().dV0(true);
    }

    public static final void onDismiss$28(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C778180Ufo) dialogInterfaceOnDismissListenerC786080UsY.l0).LJIIIZ().dV0(true);
    }

    public static final void onDismiss$29(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C784470Upx) dialogInterfaceOnDismissListenerC786080UsY.l0).LJFF = false;
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((GamePhoneCameraScannerFragment) dialogInterfaceOnDismissListenerC786080UsY.l0).LLJIJIL = false;
    }

    public static final void onDismiss$30(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        new C469950Ibp();
        InterfaceC1106030et7.g5.LIZJ(Double.valueOf(C469950Ibp.LIZJ() + 1));
        InterfaceC1106030et7.h5.LIZJ(Double.valueOf(System.currentTimeMillis()));
        ((C784470Upx) dialogInterfaceOnDismissListenerC786080UsY.l0).LJFF = false;
    }

    public static final void onDismiss$31(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ViewOnClickListenerC755040Tja viewOnClickListenerC755040Tja = (ViewOnClickListenerC755040Tja) dialogInterfaceOnDismissListenerC786080UsY.l0;
        if (!viewOnClickListenerC755040Tja.LLLF) {
            viewOnClickListenerC755040Tja.LLL.invoke();
        }
    }

    public static final void onDismiss$32(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((InterfaceC777420Uea) dialogInterfaceOnDismissListenerC786080UsY.l0).dV0(false);
    }

    public static final void onDismiss$33(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        C778120Ufi c778120Ufi = (C778120Ufi) dialogInterfaceOnDismissListenerC786080UsY.l0;
        c778120Ufi.LLILZIL = false;
        c778120Ufi.LIZ().dV0(true);
    }

    public static final void onDismiss$34(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((ViewOnClickListenerC937350aV3) dialogInterfaceOnDismissListenerC786080UsY.l0).LLJZIJLIL = null;
    }

    public static final void onDismiss$35(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((TuxSheet[]) dialogInterfaceOnDismissListenerC786080UsY.l0)[0] = null;
    }

    public static final void onDismiss$36(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        C20656615sK c20656615sK = (C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0;
        if (c20656615sK != null) {
            c20656615sK.LIZ();
        }
    }

    public static final void onDismiss$37(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        C20656615sK c20656615sK = (C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0;
        if (c20656615sK != null) {
            c20656615sK.LIZ();
        }
    }

    public static final void onDismiss$38(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        C20656615sK c20656615sK = (C20656615sK) dialogInterfaceOnDismissListenerC786080UsY.l0;
        if (c20656615sK != null) {
            c20656615sK.LIZ();
        }
    }

    public static final void onDismiss$39(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((Activity) dialogInterfaceOnDismissListenerC786080UsY.l0).finish();
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((GamePhoneCameraWiredFragment) dialogInterfaceOnDismissListenerC786080UsY.l0).LLJIJIL = false;
    }

    public static final void onDismiss$40(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((Function1) dialogInterfaceOnDismissListenerC786080UsY.l0).invoke(dialogInterface);
    }

    public static final void onDismiss$41(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        C778390Ug9 c778390Ug9 = (C778390Ug9) dialogInterfaceOnDismissListenerC786080UsY.l0;
        c778390Ug9.LLIZLLLIL = false;
        c778390Ug9.LLILLL.LIZIZ().dV0(true);
    }

    public static final void onDismiss$42(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C778170Ufn) dialogInterfaceOnDismissListenerC786080UsY.l0).LLILLL.LIZIZ().dV0(true);
    }

    public static final void onDismiss$43(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C778170Ufn) dialogInterfaceOnDismissListenerC786080UsY.l0).LLILLL.LIZIZ().dV0(true);
    }

    public static final void onDismiss$44(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((C756380Tlk) dialogInterfaceOnDismissListenerC786080UsY.l0).LLILLJJLI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((C756380Tlk) dialogInterfaceOnDismissListenerC786080UsY.l0, C343970De7.LIZ);
    }

    public static final void onDismiss$45(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C0U4X) dialogInterfaceOnDismissListenerC786080UsY.l0).LIZ.NR().dV0(true);
    }

    public static final void onDismiss$46(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC786080UsY.l0).invoke();
    }

    public static final void onDismiss$47(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((ProfileViewerFragment) dialogInterfaceOnDismissListenerC786080UsY.l0).WR().vQ2("pop_up", "toggle");
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        DataChannel dataChannel = ((C782020Um0) dialogInterfaceOnDismissListenerC786080UsY.l0).LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zW(PerceptionDialogDismissedChannel.class, Boolean.TRUE);
        }
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((C0UYG) dialogInterfaceOnDismissListenerC786080UsY.l0).LJII = false;
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        C0UJY c0ujyLIZ = C770730ULf.LIZ(((PreviewBeautyWidget) dialogInterfaceOnDismissListenerC786080UsY.l0).dataChannel);
        if (c0ujyLIZ != null) {
            c0ujyLIZ.LJ("beauty");
        }
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(EffectDialogShowChannel.class));
        ((PreviewBeautyWidget) dialogInterfaceOnDismissListenerC786080UsY.l0).LLILZLL = false;
    }

    public static final void onDismiss$8(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((LiveBroadcastFragment) dialogInterfaceOnDismissListenerC786080UsY.l0).LLLLIILLL = false;
    }

    public static final void onDismiss$9(DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY, DialogInterface dialogInterface) {
        ((VoiceChatBroadcastFragment) dialogInterfaceOnDismissListenerC786080UsY.l0).LLJJIJI = null;
    }
}
