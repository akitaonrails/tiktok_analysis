package X;

import Y.AsS15S0110000_5;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.common.logic.VideoCropService;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.SmartTrimFragment;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS132S0201000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FX2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FX2 implements INLEListenerSeek {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void onSeekDone$0(C0FX2 c0fx2, int i) {
        C0E48 c0e48 = ((C0F52) c0fx2.l0).LIZ.LIZIZ;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(new C358740E4q((NLETrackSlot) c0fx2.l1, 0, null, false, 0, 254), "select_slot_event", false);
        }
    }

    public static final void onSeekDone$1(C0FX2 c0fx2, int i) {
        C0E48 c0e48 = ((C0F52) c0fx2.l0).LIZ.LIZIZ;
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(new C358740E4q((NLETrackSlot) c0fx2.l1, 0, null, false, 0, 254), "select_slot_event", false);
        }
    }

    public static final void onSeekDone$10(C0FX2 c0fx2, int i) {
        C354270Duj.LIZJ(0L, new AwS132S0201000_5((C013C) c0fx2.l0, (INLEListenerSeek) c0fx2.l1, i, 3));
    }

    public static final void onSeekDone$11(C0FX2 c0fx2, int i) {
        C354270Duj.LIZJ(0L, new AwS132S0201000_5((C013C) c0fx2.l0, (INLEListenerSeek) c0fx2.l1, i, 8));
    }

    public static final void onSeekDone$12(C0FX2 c0fx2, int i) {
        if (!((AtomicBoolean) c0fx2.l0).get()) {
            AtomicBoolean atomicBoolean = (AtomicBoolean) c0fx2.l0;
            INLEListenerSeek iNLEListenerSeek = (INLEListenerSeek) c0fx2.l1;
            synchronized (atomicBoolean) {
                try {
                    if (!atomicBoolean.get()) {
                        atomicBoolean.set(true);
                        iNLEListenerSeek.onSeekDone(i);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static final void onSeekDone$13(C0FX2 c0fx2, int i) {
        if (Intrinsics.LJFF((Boolean) c0fx2.l0, Boolean.TRUE)) {
            LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(3);
            Function0 function0 = (Function0) c0fx2.l1;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void onSeekDone$14(C0FX2 c0fx2, int i) {
        C0E48 c0e48F4;
        C0E55 player;
        C369850Eel c369850Eel = (C369850Eel) c0fx2.l0;
        if (c369850Eel.LL >= c369850Eel.LLILLJJLI - ((long) 50) && (c0e48F4 = ((C369770Eed) c0fx2.l1).F4()) != null && (player = c0e48F4.getPlayer()) != null) {
            player.pause(false);
        }
    }

    public static final void onSeekDone$15(C0FX2 c0fx2, int i) {
        ((C350770Dp5) c0fx2.l0).LIZLLL.LJJIIZI(((NLETrackSlot) c0fx2.l1).getStartTime(), ((NLETrackSlot) c0fx2.l1).getEndTime(), false, true);
    }

    public static final void onSeekDone$2(C0FX2 c0fx2, int i) {
        ((C0E55) c0fx2.l0).LJJIIZI(((NLETrackSlot) c0fx2.l1).getStartTime() + ((long) LSPassThroughRecordSizeConfig.DEFAULT), ((NLETrackSlot) c0fx2.l1).getEndTime() - ((long) 30000), false, true);
    }

    public static final void onSeekDone$3(C0FX2 c0fx2, int i) {
        AsS15S0110000_5 asS15S0110000_5 = (AsS15S0110000_5) c0fx2.l0;
        if (asS15S0110000_5.z1) {
            asS15S0110000_5.z1 = false;
            ((C0E55) c0fx2.l1).LLIL(false);
        }
    }

    public static final void onSeekDone$4(C0FX2 c0fx2, int i) {
        ((C0EV3) c0fx2.l0).LLJLLIL = true;
        ((C0E55) c0fx2.l1).LLIL(false);
    }

    public static final void onSeekDone$5(C0FX2 c0fx2, int i) {
        C354270Duj.LIZJ(0L, new AwS132S0201000_5((C013C) c0fx2.l0, (INLEListenerSeek) c0fx2.l1, i, 1));
    }

    public static final void onSeekDone$6(C0FX2 c0fx2, int i) {
        ((VideoCropService) c0fx2.l0).isCropPanelShowing = false;
        float[] fArrLLJLLIL = ((C0E48) c0fx2.l1).getPlayer().LLJLLIL();
        if (fArrLLJLLIL != null) {
            ((C0E48) c0fx2.l1).getPlayer().LJIILJJIL(fArrLLJLLIL[0], fArrLLJLLIL[1], fArrLLJLLIL[2], fArrLLJLLIL[3], null);
        }
        C0E69.LIZ((C0E48) c0fx2.l1, false, false, 0L, null, 28);
    }

    public static final void onSeekDone$7(C0FX2 c0fx2, int i) {
        C0E48 c0e48;
        C0E69.LIZ(((SmartTrimFragment) c0fx2.l0).LL, false, true, 0L, null, 24);
        SmartTrimFragment smartTrimFragment = (SmartTrimFragment) c0fx2.l0;
        if (!smartTrimFragment.LLLII && (c0e48 = smartTrimFragment.LL) != null) {
            c0e48.S7().LIZIZ(new C358740E4q((NLETrackSlot) c0fx2.l1, 0, null, false, 0, 238), "select_slot_event", true);
        }
    }

    public static final void onSeekDone$8(C0FX2 c0fx2, int i) {
        C0E55 player;
        AsS15S0110000_5 asS15S0110000_5 = (AsS15S0110000_5) c0fx2.l0;
        if (asS15S0110000_5.z1) {
            asS15S0110000_5.z1 = false;
            C0E48 c0e48 = ((C384320F5a) c0fx2.l1).LIZ.LIZIZ;
            if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
                player.LLIL(false);
            }
        }
    }

    public static final void onSeekDone$9(C0FX2 c0fx2, int i) {
        C0E48 c0e48F4;
        C0E55 player;
        C369860Eem c369860Eem = (C369860Eem) c0fx2.l0;
        if (c369860Eem.LL >= c369860Eem.LLILLJJLI - ((long) 50) && (c0e48F4 = ((C369740Eea) c0fx2.l1).F4()) != null && (player = c0e48F4.getPlayer()) != null) {
            player.pause(false);
        }
    }

    public C0FX2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
