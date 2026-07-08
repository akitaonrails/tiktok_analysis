package X;

import Y.ARunnableS105S0100000_5;
import android.view.TextureView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.SmartTrimFragment;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FX3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FX3 implements INLEListenerSeek {
    public final int $t;
    public Object l0;

    @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSeek
    public final void onSeekDone(int i) {
        switch (this.$t) {
            case 0:
                onSeekDone$0(this, i);
                break;
            case 1:
                onSeekDone$1(this, i);
                break;
            case 2:
                onSeekDone$2(this, i);
                break;
            case 3:
                onSeekDone$3(this, i);
                break;
            case 4:
                onSeekDone$4(this, i);
                break;
            case 5:
                onSeekDone$5(this, i);
                break;
            case 6:
                onSeekDone$6(this, i);
                break;
            case 7:
                onSeekDone$7(this, i);
                break;
            case 8:
                onSeekDone$8(this, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onSeekDone$9(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onSeekDone$10(this, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onSeekDone$11(this, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onSeekDone$12(this, i);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onSeekDone$13(this, i);
                break;
            case 14:
                onSeekDone$14(this, i);
                break;
            case 15:
                onSeekDone$15(this, i);
                break;
            case 16:
                onSeekDone$16(this, i);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onSeekDone$17(this, i);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onSeekDone$18(this, i);
                break;
            case 19:
                onSeekDone$19(this, i);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onSeekDone$20(this, i);
                break;
            case 21:
                onSeekDone$21(this, i);
                break;
            case 22:
                onSeekDone$22(this, i);
                break;
            case 23:
                onSeekDone$23(this, i);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onSeekDone$24(this, i);
                break;
            case 25:
                onSeekDone$25(this, i);
                break;
            case 26:
                onSeekDone$26(this, i);
                break;
        }
    }

    public C0FX3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onSeekDone$0(C0FX3 c0fx3, int i) {
        C0E55 player;
        C0E48 c0e48C3 = ((C356720Dyg) c0fx3.l0).c3();
        if (c0e48C3 != null && (player = c0e48C3.getPlayer()) != null) {
            player.LJIJJ();
        }
    }

    public static final void onSeekDone$1(C0FX3 c0fx3, int i) {
        ((C0E55) c0fx3.l0).pause(false);
    }

    public static final void onSeekDone$10(C0FX3 c0fx3, int i) {
        C0E55 player;
        C0E48 c0e48F4 = ((C0E3T) c0fx3.l0).F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.LLIL(false);
        }
    }

    public static final void onSeekDone$11(C0FX3 c0fx3, int i) {
        C0E55 player;
        C0E48 c0e48F4 = ((C0E3T) c0fx3.l0).F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.LLIL(false);
        }
    }

    public static final void onSeekDone$12(C0FX3 c0fx3, int i) {
        C1524705y1.LIZIZ(16L, new ARunnableS105S0100000_5((C374880Ems) c0fx3.l0, 62));
    }

    public static final void onSeekDone$13(C0FX3 c0fx3, int i) {
        ((Runnable) c0fx3.l0).run();
    }

    public static final void onSeekDone$14(C0FX3 c0fx3, int i) {
        C0E55 player;
        C0E48 c0e48 = ((SmartTrimFragment) c0fx3.l0).LL;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.LLIL(false);
        }
    }

    public static final void onSeekDone$15(C0FX3 c0fx3, int i) {
        C0E55 player;
        C0E48 c0e48 = ((SmartTrimFragment) c0fx3.l0).LL;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.LLIL(false);
        }
    }

    public static final void onSeekDone$16(C0FX3 c0fx3, int i) {
        C0E55 player;
        C0E48 c0e48 = ((SmartTrimFragment) c0fx3.l0).LL;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.LLIL(false);
        }
    }

    public static final void onSeekDone$17(C0FX3 c0fx3, int i) {
        C0E55 player;
        C0E48 c0e48 = ((SmartTrimFragment) c0fx3.l0).LL;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.LLIL(false);
        }
    }

    public static final void onSeekDone$18(C0FX3 c0fx3, int i) {
        ((C359010E5r) c0fx3.l0).LIZ.getPlayer().LLIL(false);
    }

    public static final void onSeekDone$19(C0FX3 c0fx3, int i) {
        ((C359010E5r) c0fx3.l0).LIZ.getPlayer().LLIL(false);
    }

    public static final void onSeekDone$2(C0FX3 c0fx3, int i) {
        C0E55 player;
        C0E48 c0e48F4 = ((C0E3M) c0fx3.l0).F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.LLIL(false);
        }
    }

    public static final void onSeekDone$20(C0FX3 c0fx3, int i) {
        ((C359010E5r) c0fx3.l0).LIZ.getPlayer().LLIL(false);
    }

    public static final void onSeekDone$21(C0FX3 c0fx3, int i) {
        ((C359010E5r) c0fx3.l0).LIZ.getPlayer().LLIL(false);
    }

    public static final void onSeekDone$22(C0FX3 c0fx3, int i) {
        C0E55 player;
        C0E48 c0e48F4 = ((C369740Eea) c0fx3.l0).F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.LLIL(false);
        }
    }

    public static final void onSeekDone$23(C0FX3 c0fx3, int i) {
        INLEPlayer playerApi;
        INLEPlayer playerApi2;
        TextureView textureView = ((C385230F8n) c0fx3.l0).LJIIL;
        if (textureView != null && textureView.getVisibility() == 8) {
            return;
        }
        C1463860oCG c1463860oCG = ((C385230F8n) c0fx3.l0).LJIIIZ;
        if (c1463860oCG != null && (playerApi2 = c1463860oCG.getPlayerApi()) != null) {
            ((C389960FQs) playerApi2).refreshCurrentFrame();
        }
        C1463860oCG c1463860oCG2 = ((C385230F8n) c0fx3.l0).LJIIIZ;
        if (c1463860oCG2 != null && (playerApi = c1463860oCG2.getPlayerApi()) != null) {
            ((C389960FQs) playerApi).play();
        }
        TextureView textureView2 = ((C385230F8n) c0fx3.l0).LJIIL;
        if (textureView2 != null) {
            C786410Ut5.LLIIIILZ(textureView2, 0);
        }
        TextureView textureView3 = ((C385230F8n) c0fx3.l0).LJIIL;
        if (textureView3 != null) {
            C786410Ut5.Q4(1.0f, textureView3);
        }
    }

    public static final void onSeekDone$24(C0FX3 c0fx3, int i) {
        ((Function0) c0fx3.l0).invoke();
    }

    public static final void onSeekDone$25(C0FX3 c0fx3, int i) {
        C0E55 player;
        C0E48 c0e48F4 = ((C369770Eed) c0fx3.l0).F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.LLIL(false);
        }
    }

    public static final void onSeekDone$26(C0FX3 c0fx3, int i) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c0fx3.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC20236714Gf.resumeWith(unit);
    }

    public static final void onSeekDone$3(C0FX3 c0fx3, int i) {
        ((C0E55) c0fx3.l0).LLIL(false);
    }

    public static final void onSeekDone$4(C0FX3 c0fx3, int i) {
        ((C0E48) c0fx3.l0).getPlayer().pause(false);
    }

    public static final void onSeekDone$5(C0FX3 c0fx3, int i) {
        ((C0E48) c0fx3.l0).getPlayer().pause(false);
    }

    public static final void onSeekDone$6(C0FX3 c0fx3, int i) {
        C354270Duj.LIZJ(0L, new AwS549S0100000_5((Function0) c0fx3.l0, (Function0<Unit>) 547));
    }

    public static final void onSeekDone$7(C0FX3 c0fx3, int i) {
        ((C373720El0) c0fx3.l0).H4();
    }

    public static final void onSeekDone$8(C0FX3 c0fx3, int i) {
        ((C373740El2) c0fx3.l0).H4();
    }

    public static final void onSeekDone$9(C0FX3 c0fx3, int i) {
        C0E55 player;
        C0E48 c0e48F4 = ((C0E3T) c0fx3.l0).F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.LLIL(false);
        }
    }
}
