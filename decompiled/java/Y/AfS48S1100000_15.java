package Y;

import X.AbstractC1143290frD;
import X.C09JN;
import X.C1143300frE;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C915980Zwa;
import X.C919390a25;
import X.C919870a2r;
import X.C939700aYq;
import X.C941390abZ;
import X.C943900afc;
import X.C943920afe;
import X.C944860ahA;
import X.C945060ahU;
import X.C956740b0K;
import X.EnumC919060a1Y;
import X.InterfaceC920110a3F;
import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AwS131S1200000_15;
import kotlin.jvm.internal.AwS164S1100000_15;
import webcast.im.SoundWareEffectExtra;

/* JADX INFO: loaded from: classes16.dex */
public class AfS48S1100000_15 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS48S1100000_15 afS48S1100000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostNudgeTooltipBuilder$MultiCoHostNudgeTooltipBuilderParams@1777.startCountDown$2");
        long jLongValue = ((Number) obj).longValue() - 1;
        if (jLongValue <= 0) {
            C943900afc c943900afc = (C943900afc) afS48S1100000_15.l1;
            c943900afc.LJJIIJ = jLongValue;
            C500260Jjc.LJJLIIIJILLIZJL(new AwS164S1100000_15(c943900afc, afS48S1100000_15.s0, 1));
        } else {
            C943900afc c943900afc2 = (C943900afc) afS48S1100000_15.l1;
            c943900afc2.LJJIIJ = jLongValue;
            C500260Jjc.LJJLIIIJILLIZJL(new C943920afe(c943900afc2, afS48S1100000_15.s0, jLongValue));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bubble startCountDown, value = ");
        sbLIZ.append(jLongValue);
        C20441214yg.LJIIIZ("NudgeToolTip", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("MultiCoHostNudgeTooltipBuilder$MultiCoHostNudgeTooltipBuilderParams@1777.startCountDown$2");
    }

    public static final void accept$1(AfS48S1100000_15 afS48S1100000_15, Object obj) {
        C1C7U.LIZ("BaseLayoutAction@e477.zoom$1");
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS48S1100000_15.l1;
        if (interfaceC920110a3F != null) {
            interfaceC920110a3F.LIZJ(afS48S1100000_15.s0);
        }
        C1C7U.LIZIZ("BaseLayoutAction@e477.zoom$1");
    }

    public static final void accept$10(AfS48S1100000_15 afS48S1100000_15, Object obj) {
        C1C7U.LIZ("MultiGuestV3AnchorMask@7f93.addVoiceWaveEffectChangedListener$1$1$1");
        SoundWareEffectExtra soundWareEffectExtra = (SoundWareEffectExtra) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateVoiceWave: linkMicId:");
        sbLIZ.append(afS48S1100000_15.s0);
        sbLIZ.append(", ");
        sbLIZ.append(soundWareEffectExtra.staticImageName);
        sbLIZ.append(", ");
        sbLIZ.append(soundWareEffectExtra.dynamicImageName);
        C20441214yg.LIZIZ("MultiGuestV3AnchorMask", C2188811AlT.LIZIZ(sbLIZ));
        C941390abZ voiceWaveView = ((C939700aYq) afS48S1100000_15.l1).getVoiceWaveView();
        if (voiceWaveView != null) {
            voiceWaveView.LIZ(soundWareEffectExtra);
        }
        C1C7U.LIZIZ("MultiGuestV3AnchorMask@7f93.addVoiceWaveEffectChangedListener$1$1$1");
    }

    public static final void accept$2(AfS48S1100000_15 afS48S1100000_15, Object obj) {
        C1C7U.LIZ("GuestLayoutAction@b82a.guestSelfCancelZoom$1");
        C919870a2r.LIZJ(3, String.valueOf(UserService.getInstance().user().getCurrentUserId()), "cancel_enlarge");
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS48S1100000_15.l1;
        if (interfaceC920110a3F != null) {
            interfaceC920110a3F.LIZJ(afS48S1100000_15.s0);
        }
        C1C7U.LIZIZ("GuestLayoutAction@b82a.guestSelfCancelZoom$1");
    }

    public static final void accept$3(AfS48S1100000_15 afS48S1100000_15, Object obj) {
        C1C7U.LIZ("GuestLayoutAction@b82a.guestSelfCancelZoom$2");
        Throwable th = (Throwable) obj;
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS48S1100000_15.l1;
        if (interfaceC920110a3F != null) {
            String str = afS48S1100000_15.s0;
            int iOrdinal = EnumC919060a1Y.E_C_DEFAULT.ordinal();
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            interfaceC920110a3F.LIZ(iOrdinal, str, message, null);
        }
        C1C7U.LIZIZ("GuestLayoutAction@b82a.guestSelfCancelZoom$2");
    }

    public static final void accept$4(AfS48S1100000_15 afS48S1100000_15, Object obj) {
        C945060ahU c945060ahU;
        C1C7U.LIZ("ToolbarCoHostBehavior@a5e6.onCohostAvatarAnimationShow$animationListener$1$onStart$1$1");
        DataChannel dataChannel = ((C944860ahA) afS48S1100000_15.l1).LLJJLIIIJLLLLLLLZ;
        if (dataChannel != null && (c945060ahU = (C945060ahU) dataChannel.gg0(C956740b0K.class)) != null) {
            c945060ahU.LIZ = 0L;
        }
        C915980Zwa.LJI().LIZ().LJJJLIIL("");
        CoHostFriendNoticeService coHostFriendNoticeService = ((C944860ahA) afS48S1100000_15.l1).LLL;
        String str = afS48S1100000_15.s0;
        DataChannel dataChannel2 = coHostFriendNoticeService.LLILZLL;
        if (dataChannel2 != null) {
            CoHostFriendNoticeService.LIZJ(coHostFriendNoticeService, new AwS131S1200000_15(coHostFriendNoticeService, dataChannel2, str, 1), null, 5);
            coHostFriendNoticeService.LLJ = 0;
            coHostFriendNoticeService.LLJI = 0;
        }
        C1C7U.LIZIZ("ToolbarCoHostBehavior@a5e6.onCohostAvatarAnimationShow$animationListener$1$onStart$1$1");
    }

    public static final void accept$5(AfS48S1100000_15 afS48S1100000_15, Object obj) {
        C1C7U.LIZ("VoiceChatToolsKt@1928.addVoiceWaveEffectChangedListener$1$1");
        SoundWareEffectExtra soundWareEffectExtra = (SoundWareEffectExtra) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateVoiceWave: linkMicId:");
        sbLIZ.append(afS48S1100000_15.s0);
        sbLIZ.append(", ");
        sbLIZ.append(soundWareEffectExtra.staticImageName);
        sbLIZ.append(", ");
        sbLIZ.append(soundWareEffectExtra.dynamicImageName);
        C20441214yg.LIZIZ("VoiceChatBasicMask", C2188811AlT.LIZIZ(sbLIZ));
        ((C941390abZ) afS48S1100000_15.l1).LIZ(soundWareEffectExtra);
        C1C7U.LIZIZ("VoiceChatToolsKt@1928.addVoiceWaveEffectChangedListener$1$1");
    }

    public static final void accept$6(AfS48S1100000_15 afS48S1100000_15, Object obj) {
        C1C7U.LIZ("MultiGuestAsGuestModeratorPresenter@37f1.permitCountDown$1");
        ((C919390a25) afS48S1100000_15.l1).LLILZ.remove(afS48S1100000_15.s0);
        C1C7U.LIZIZ("MultiGuestAsGuestModeratorPresenter@37f1.permitCountDown$1");
    }

    public static final void accept$7(AfS48S1100000_15 afS48S1100000_15, Object obj) {
        StackTraceElement[] stackTrace;
        C1C7U.LIZ("ZoomGuestPresent@c8ea.tryZoomToMin$3");
        Throwable th = (Throwable) obj;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        if (th != null) {
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = null;
        }
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJIIJ(stackTrace, 0);
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS48S1100000_15.l1;
        if (interfaceC920110a3F != null) {
            String str = afS48S1100000_15.s0;
            int iOrdinal = EnumC919060a1Y.E_C_HTTP_ERROR.ordinal();
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            interfaceC920110a3F.LIZ(iOrdinal, str, message, th);
        }
        C1C7U.LIZIZ("ZoomGuestPresent@c8ea.tryZoomToMin$3");
    }

    public static final void accept$8(AfS48S1100000_15 afS48S1100000_15, Object obj) {
        C1C7U.LIZ("ZoomGuestPresenterV2@dbe4.guestZoom$2");
        Throwable th = (Throwable) obj;
        InterfaceC920110a3F interfaceC920110a3F = (InterfaceC920110a3F) afS48S1100000_15.l1;
        if (interfaceC920110a3F != null) {
            String str = afS48S1100000_15.s0;
            int iOrdinal = EnumC919060a1Y.E_C_DEFAULT.ordinal();
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            interfaceC920110a3F.LIZ(iOrdinal, str, message, null);
        }
        C1C7U.LIZIZ("ZoomGuestPresenterV2@dbe4.guestZoom$2");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$9(Y.AfS48S1100000_15 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS48S1100000_15.accept$9(Y.AfS48S1100000_15, java.lang.Object):void");
    }

    public AfS48S1100000_15(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
