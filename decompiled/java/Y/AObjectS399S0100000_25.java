package Y;

import X.C05P0;
import X.C0QSJ;
import X.C1309570kBP;
import X.C1622820sKe;
import X.C1672790tdF;
import X.C1673180tds;
import X.C1685380txY;
import X.C533930Kwp;
import X.C687700QyG;
import X.InterfaceC1625410sOp;
import X.InterfaceC1670460tZU;
import X.InterfaceC1682240tsU;
import X.InterfaceC1690500u5o;
import X.InterfaceC2217461Bqa;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem;
import com.ss.android.ugc.aweme.tako.aivideo.detail.cell.TakoAIVideoFeedInfoAreaAssem;
import com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AIVideoBottomTextInputViewModel;
import com.ss.android.ugc.aweme.tako.aivideo.detail.vm.AiVideoViewModel;
import com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.ITakoRTCAbility;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS399S0100000_25 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        InterfaceC1682240tsU interfaceC1682240tsU;
        TakoAIVideoInputAssem takoAIVideoInputAssem = (TakoAIVideoInputAssem) aObjectS399S0100000_25.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoAIVideoInputAssem.LLJJJ;
        C0QSJ c0qsjSo = takoAIVideoInputAssem.So();
        if (c0qsjSo != null) {
            interfaceC1682240tsU = (InterfaceC1682240tsU) c0qsjSo.getAbility(InterfaceC1682240tsU.class);
            C687700QyG.LJ(interfaceC1682240tsU, InterfaceC1682240tsU.class);
        } else {
            interfaceC1682240tsU = null;
        }
        return new AiVideoViewModel(interfaceC1682240tsU);
    }

    public static final Object invoke$1(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ITakoRTCAbility iTakoRTCAbility;
        TakoAIVideoInputAssem takoAIVideoInputAssem = (TakoAIVideoInputAssem) aObjectS399S0100000_25.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoAIVideoInputAssem.LLJJJ;
        C0QSJ c0qsjSo = takoAIVideoInputAssem.So();
        if (c0qsjSo != null) {
            iTakoRTCAbility = (ITakoRTCAbility) c0qsjSo.getAbility(ITakoRTCAbility.class);
            C687700QyG.LJ(iTakoRTCAbility, ITakoRTCAbility.class);
        } else {
            iTakoRTCAbility = null;
        }
        return new AIVideoBottomTextInputViewModel(iTakoRTCAbility);
    }

    public static final Object invoke$10(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ((ExteriorVideoRecordScene) aObjectS399S0100000_25.l0).finish();
        return null;
    }

    public static final Object invoke$11(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ((ExteriorVideoRecordScene) aObjectS399S0100000_25.l0).finish();
        return null;
    }

    public static final Object invoke$12(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ((Runnable) aObjectS399S0100000_25.l0).run();
        return null;
    }

    public static final Object invoke$13(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        if (!C533930Kwp.LIZIZ(new String[]{"android.permission.RECORD_AUDIO"})) {
            ((l0) aObjectS399S0100000_25.l0).w4().LIZJ(C1622820sKe.LIZ(null, null, 7));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ((Function0) aObjectS399S0100000_25.l0).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$15(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        Function0 function0 = (Function0) aObjectS399S0100000_25.l0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        return Float.valueOf(((InterfaceC1690500u5o) aObjectS399S0100000_25.l0).LJJJJLL(C1672790tdF.LIZJ));
    }

    public static final Object invoke$17(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        Function0 function0 = (Function0) aObjectS399S0100000_25.l0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        Function0 function0 = (Function0) aObjectS399S0100000_25.l0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ((C05P0) aObjectS399S0100000_25.l0).setValue(Boolean.FALSE);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        TabHost tabHost = (TabHost) aObjectS399S0100000_25.l0;
        tabHost.getClass();
        HandlerHook.viewPost(tabHost, new ARunnableS125S0100000_25(tabHost, 3));
        return null;
    }

    public static final Object invoke$20(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        return Float.valueOf(((InterfaceC1690500u5o) aObjectS399S0100000_25.l0).LJJJJLL(C1672790tdF.LIZJ));
    }

    public static final Object invoke$21(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ((C05P0) aObjectS399S0100000_25.l0).setValue(Boolean.FALSE);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        C1673180tds c1673180tds = (C1673180tds) aObjectS399S0100000_25.l0;
        c1673180tds.LIZ(null);
        c1673180tds.LIZJ(null);
        c1673180tds.LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ((Function0) aObjectS399S0100000_25.l0).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$24(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ((Function0) aObjectS399S0100000_25.l0).invoke();
        return Boolean.TRUE;
    }

    public static final Object invoke$25(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ((Function0) aObjectS399S0100000_25.l0).invoke();
        return Boolean.TRUE;
    }

    public static final Object invoke$26(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ((C05P0) aObjectS399S0100000_25.l0).setValue(Boolean.FALSE);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ((Function1) aObjectS399S0100000_25.l0).invoke(Boolean.FALSE);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        final C1685380txY c1685380txY = (C1685380txY) aObjectS399S0100000_25.l0;
        return new Drawable.Callback() { // from class: X.0txZ
            @Override // android.graphics.drawable.Drawable.Callback
            public final void invalidateDrawable(Drawable drawable) {
                int iLIZLLL = ((C13FG) c1685380txY.LLIZ).LIZLLL();
                ((C13FG) c1685380txY.LLIZ).LJIIJ(iLIZLLL + 1);
                C1685380txY c1685380txY2 = c1685380txY;
                long jLIZ = C1668830tWr.LIZ(c1685380txY2.LLILZLL);
                ((C13FE) c1685380txY2.LLIZLLLIL).setValue(new C1680770tq7(jLIZ));
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                ((Handler) C1668830tWr.LIZ.getValue()).removeCallbacks(runnable);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C786410Ut5.LJLI(j, (Handler) C1668830tWr.LIZ.getValue(), runnable);
            }
        };
    }

    public static final Object invoke$29(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        return ((TTEPEffectPreviewActivity) aObjectS399S0100000_25.l0).LLJI;
    }

    public static final Object invoke$3(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        TakoAIVideoFeedInfoAreaAssem takoAIVideoFeedInfoAreaAssem = (TakoAIVideoFeedInfoAreaAssem) aObjectS399S0100000_25.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoAIVideoFeedInfoAreaAssem.LLJZIJLIL;
        return new AiVideoViewModel(takoAIVideoFeedInfoAreaAssem.cp());
    }

    public static final Object invoke$30(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        return ((TTEPEffectPreviewActivity) aObjectS399S0100000_25.l0).LLIZLLLIL;
    }

    public static final Object invoke$31(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        return ((TTEPEffectPreviewActivity) aObjectS399S0100000_25.l0).LLJZIJLIL;
    }

    public static final Object invoke$32(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        return ((TTEPEffectPreviewActivity) aObjectS399S0100000_25.l0).LLJZ;
    }

    public static final Object invoke$33(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = (TTEPEffectPreviewActivity) aObjectS399S0100000_25.l0;
        String str = TTEPEffectPreviewActivity._pnsPageId;
        tTEPEffectPreviewActivity.finish();
        return null;
    }

    public static final Object invoke$34(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) aObjectS399S0100000_25.l0;
        String str = FTCVideoRecordNewActivity._pnsPageId;
        fTCVideoRecordNewActivity.finish();
        return null;
    }

    public static final Object invoke$35(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) aObjectS399S0100000_25.l0;
        String str = FTCVideoRecordNewActivity._pnsPageId;
        fTCVideoRecordNewActivity.getClass();
        return C1309570kBP.LIZ(fTCVideoRecordNewActivity);
    }

    public static final Object invoke$36(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        return Float.valueOf(((InterfaceC1670460tZU) aObjectS399S0100000_25.l0).getProgress());
    }

    public static final Object invoke$4(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        if (!C533930Kwp.LIZIZ(new String[]{"android.permission.RECORD_AUDIO"})) {
            ((InterfaceC1625410sOp) aObjectS399S0100000_25.l0).LIZJ(C1622820sKe.LIZ(null, null, 7));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        ExteriorVideoRecordScene exteriorVideoRecordScene = (ExteriorVideoRecordScene) aObjectS399S0100000_25.l0;
        exteriorVideoRecordScene.LLLFZ.addView(exteriorVideoRecordScene.LLLLL.St2().getViewFunction().getView());
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        return ((ExteriorVideoRecordScene) aObjectS399S0100000_25.l0).LLL;
    }

    public static final Object invoke$7(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        return ((ExteriorVideoRecordScene) aObjectS399S0100000_25.l0).LLJZIJLIL;
    }

    public static final Object invoke$8(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        return ((ExteriorVideoRecordScene) aObjectS399S0100000_25.l0).LLLLLIL;
    }

    public static final Object invoke$9(AObjectS399S0100000_25 aObjectS399S0100000_25) {
        return ((ExteriorVideoRecordScene) aObjectS399S0100000_25.l0).LLLLL;
    }

    public AObjectS399S0100000_25(ExteriorVideoRecordScene exteriorVideoRecordScene, int i) {
        this.$t = i;
        if (5 - i != 0) {
            this.l0 = exteriorVideoRecordScene;
        } else {
            this.l0 = exteriorVideoRecordScene;
        }
    }

    public AObjectS399S0100000_25(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
