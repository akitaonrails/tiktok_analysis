package X;

import Y.ARunnableS117S0100000_17;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.enteranim.MatchItemEnterAnimAssem;
import com.bytedance.android.livesdk.broadcast.feedback.FeedbackAnimWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0g5B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151950g5B extends C1143950fsH {
    public final int $t;
    public Object l0;

    public static final void LIZ$0(C1151950g5B c1151950g5B, Animatable animatable, int i, int i2) {
    }

    public static final void LJ$1(C1151950g5B c1151950g5B, Animatable animatable) {
    }

    public static final void LJFF$1(C1151950g5B c1151950g5B, Animatable animatable) {
    }

    public static final void LJFF$2(C1151950g5B c1151950g5B, Animatable animatable) {
    }

    @Override // X.C1143950fsH
    public final void LIZ(Animatable animatable, int i, int i2) {
        switch (this.$t) {
            case 1:
                LIZ$0(this, animatable, i, i2);
                break;
            case 2:
                LIZ$1(this, animatable, i, i2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$2(this, animatable, i, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$3(this, animatable, i, i2);
                break;
            default:
                super.LIZ(animatable, i, i2);
                break;
        }
    }

    @Override // X.C1143950fsH
    public final void LIZLLL() {
        switch (this.$t) {
            case 4:
                LIZLLL$0(this);
                break;
            case 5:
                LIZLLL$1(this);
                break;
            case 6:
                LIZLLL$2(this);
                break;
            case 7:
            default:
                super.LIZLLL();
                break;
            case 8:
                LIZLLL$3(this);
                break;
        }
    }

    @Override // X.C1143950fsH
    public final void LJ(Animatable animatable) {
        switch (this.$t) {
            case 1:
                LJ$0(this, animatable);
                break;
            case 2:
            case 4:
            default:
                super.LJ(animatable);
                break;
            case 3:
                LJ$1(this, animatable);
                break;
            case 5:
                LJ$2(this, animatable);
                break;
            case 6:
                LJ$3(this, animatable);
                break;
        }
    }

    @Override // X.C1143950fsH
    public final void LJFF(Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, animatable);
                break;
            case 1:
                LJFF$1(this, animatable);
                break;
            case 2:
                LJFF$2(this, animatable);
                break;
            case 3:
                LJFF$3(this, animatable);
                break;
            case 4:
                LJFF$4(this, animatable);
                break;
            case 5:
                LJFF$5(this, animatable);
                break;
            case 6:
                LJFF$6(this, animatable);
                break;
            case 7:
                LJFF$7(this, animatable);
                break;
            case 8:
                LJFF$8(this, animatable);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJFF$9(this, animatable);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJFF$10(this, animatable);
                break;
            default:
                super.LJFF(animatable);
                break;
        }
    }

    public static final void LIZLLL$0(C1151950g5B c1151950g5B) {
        C786410Ut5.LLJJI(((C1117710fBx) c1151950g5B.l0).LLJJIII, 0);
    }

    public static final void LIZLLL$1(C1151950g5B c1151950g5B) {
        ((C1110120ezi) c1151950g5B.l0).getClass();
    }

    public static final void LIZLLL$2(C1151950g5B c1151950g5B) {
        ((C1110120ezi) c1151950g5B.l0).getClass();
    }

    public static final void LIZLLL$3(C1151950g5B c1151950g5B) {
        ImageView imageView = ((C1120950fHB) c1151950g5B.l0).LLILZ;
        if (imageView != null) {
            C500260Jjc.LJLJLJ(imageView, false);
        }
        C1324720kZq c1324720kZq = ((C1120950fHB) c1151950g5B.l0).LLILZIL;
        if (c1324720kZq != null) {
            C500260Jjc.LJLJLJ(c1324720kZq, true);
        }
    }

    public C1151950g5B(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJ$0(C1151950g5B c1151950g5B, Animatable animatable) {
        Long lValueOf;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator startDelay;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        String str = ((C1126410fPz) c1151950g5B.l0).LLLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playLevelGiftUnlockAnimation() -> onStart anim ");
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = ((C1126410fPz) c1151950g5B.l0).LLJJLIIIJLLLLLLLZ;
        String strLJIIIZ = null;
        if (abstractC1126600fQI != null) {
            lValueOf = Long.valueOf(abstractC1126600fQI.LJI());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", name = ");
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = ((C1126410fPz) c1151950g5B.l0).LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 != null) {
            strLJIIIZ = abstractC1126600fQI2.LJIIIZ();
        }
        sbLIZ.append(strLJIIIZ);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        InterpolatorC1125410fON interpolatorC1125410fON = new InterpolatorC1125410fON(0.4f, 0.8f, 0.74f, 1.0f);
        ImageView imageView = ((C1126410fPz) c1151950g5B.l0).LLLJIL;
        if (imageView != null && (viewPropertyAnimatorAnimate = imageView.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(240L)) != null && (interpolator = duration.setInterpolator(interpolatorC1125410fON)) != null && (startDelay = interpolator.setStartDelay(1000L)) != null && (viewPropertyAnimatorWithEndAction = startDelay.withEndAction(new ARunnableS117S0100000_17((C1126410fPz) c1151950g5B.l0, 154))) != null) {
            viewPropertyAnimatorWithEndAction.start();
        }
    }

    public static final void LJ$2(C1151950g5B c1151950g5B, Animatable animatable) {
        C500260Jjc.LJIILIIL((View) ((C1110120ezi) c1151950g5B.l0).LIZLLL.getValue());
    }

    public static final void LJ$3(C1151950g5B c1151950g5B, Animatable animatable) {
        C1324720kZq c1324720kZq = (C1324720kZq) ((C1110120ezi) c1151950g5B.l0).LJFF.getValue();
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 0);
        }
    }

    public static final void LJFF$0(C1151950g5B c1151950g5B, Animatable animatable) {
        ((FeedbackAnimWidget) c1151950g5B.l0).hide();
        LiveBroadcastPictureMemOpt.cleanGeckoWebPResources(new AwS561S0100000_17((FeedbackAnimWidget) c1151950g5B.l0, 113));
    }

    public static final void LJFF$10(C1151950g5B c1151950g5B, Animatable animatable) {
        C12ES.LJIILL(0, ((C1095930ecp) c1151950g5B.l0).LJIIIZ);
    }

    public static final void LJFF$3(C1151950g5B c1151950g5B, Animatable animatable) {
        C20441214yg.LJIIIZ("LiveShowAnimationManager", "startGeckoWebpController onStop");
        C1090610eUF c1090610eUF = (C1090610eUF) c1151950g5B.l0;
        HandlerHook.viewPost(c1090610eUF.LIZ, new ARunnableS117S0100000_17(c1090610eUF, 198));
        InterfaceC1090600eUE interfaceC1090600eUE = ((C1090610eUF) c1151950g5B.l0).LIZIZ;
        if (interfaceC1090600eUE != null) {
            interfaceC1090600eUE.LIZ();
        }
    }

    public static final void LJFF$4(C1151950g5B c1151950g5B, Animatable animatable) {
        C786410Ut5.LLJJI(((C1117710fBx) c1151950g5B.l0).LLJJIII, 8);
    }

    public static final void LJFF$5(C1151950g5B c1151950g5B, Animatable animatable) {
        C1324720kZq c1324720kZqLJFF = ((C1110120ezi) c1151950g5B.l0).LJFF();
        if (c1324720kZqLJFF != null) {
            HandlerHook.viewPostDelay(c1324720kZqLJFF, new ARunnableS117S0100000_17((C1110120ezi) c1151950g5B.l0, 259), 200L);
        }
    }

    public static final void LJFF$6(C1151950g5B c1151950g5B, Animatable animatable) {
        View view = (View) ((C1110120ezi) c1151950g5B.l0).LJFF.getValue();
        if (view != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS117S0100000_17((C1110120ezi) c1151950g5B.l0, 260), 200L);
        }
    }

    public static final void LJFF$7(C1151950g5B c1151950g5B, Animatable animatable) {
        C20441214yg.LJIIIZ("MatchItemEnterAnim", "playEnigmaMatchEntranceAnim onStop");
        C1324720kZq c1324720kZq = ((MatchItemEnterAnimAssem) c1151950g5B.l0).LLJJ;
        if (c1324720kZq != null) {
            C500260Jjc.LJIILIIL(c1324720kZq);
        }
    }

    public static final void LJFF$8(C1151950g5B c1151950g5B, Animatable animatable) {
        ImageView imageView = ((C1120950fHB) c1151950g5B.l0).LLILZ;
        if (imageView != null) {
            C500260Jjc.LJLJLJ(imageView, true);
        }
        C1324720kZq c1324720kZq = ((C1120950fHB) c1151950g5B.l0).LLILZIL;
        if (c1324720kZq != null) {
            C500260Jjc.LJLJLJ(c1324720kZq, false);
        }
    }

    public static final void LJFF$9(C1151950g5B c1151950g5B, Animatable animatable) {
        ((Function0) c1151950g5B.l0).invoke();
    }

    public static final void LIZ$1(C1151950g5B c1151950g5B, Animatable animatable, int i, int i2) {
        C1324720kZq c1324720kZq;
        if (i == i2 && (c1324720kZq = ((C1126410fPz) c1151950g5B.l0).LLLIZZ) != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
    }

    public static final void LIZ$2(C1151950g5B c1151950g5B, Animatable animatable, int i, int i2) {
        if (i == i2) {
            ((Function0) c1151950g5B.l0).invoke();
        }
    }

    public static final void LIZ$3(C1151950g5B c1151950g5B, Animatable animatable, int i, int i2) {
        if (i == i2) {
            C12ES.LJIILL(0, ((C1095930ecp) c1151950g5B.l0).LJIIIZ);
        }
    }
}
