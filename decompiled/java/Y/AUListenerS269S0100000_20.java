package Y;

import X.AbstractC1313520kHm;
import X.C1290850jhD;
import X.C1291330jhz;
import X.C1291380ji4;
import X.C1291430ji9;
import X.C1291600jiQ;
import X.C1294740jnU;
import X.C1295950jpR;
import X.C1313330kHT;
import X.C1313490kHj;
import X.C1313530kHn;
import X.C1336560ksw;
import X.C1336570ksx;
import X.C1337250ku3;
import X.C1337270ku5;
import X.C1337280ku6;
import X.C1337290ku7;
import X.C1337400kuI;
import X.C1337410kuJ;
import X.C1337420kuK;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1296010jpX;
import X.InterfaceC1298200jt4;
import X.InterfaceC1313090kH5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes21.dex */
public class AUListenerS269S0100000_20 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                break;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                break;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                break;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                break;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationUpdate$9(this, valueAnimator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationUpdate$10(this, valueAnimator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationUpdate$12(this, valueAnimator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                break;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                break;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                break;
            case 16:
                onAnimationUpdate$16(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationUpdate$17(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationUpdate$18(this, valueAnimator);
                break;
            case 19:
                onAnimationUpdate$19(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationUpdate$20(this, valueAnimator);
                break;
            case 21:
                onAnimationUpdate$21(this, valueAnimator);
                break;
            case 22:
                onAnimationUpdate$22(this, valueAnimator);
                break;
            case 23:
                onAnimationUpdate$23(this, valueAnimator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationUpdate$24(this, valueAnimator);
                break;
            case 25:
                onAnimationUpdate$25(this, valueAnimator);
                break;
            case 26:
                onAnimationUpdate$26(this, valueAnimator);
                break;
            case 27:
                onAnimationUpdate$27(this, valueAnimator);
                break;
            case 28:
                onAnimationUpdate$28(this, valueAnimator);
                break;
            case 29:
                onAnimationUpdate$29(this, valueAnimator);
                break;
        }
    }

    public AUListenerS269S0100000_20(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        C1295950jpR c1295950jpR = (C1295950jpR) aUListenerS269S0100000_20.l0;
        if (c1295950jpR.LLLFF == EnumC1296010jpX.ENABLED) {
            c1295950jpR.invalidateSelf();
            return;
        }
        C1294740jnU c1294740jnU = c1295950jpR.LLJJIJIIJIL;
        if (c1294740jnU == null) {
            return;
        }
        c1294740jnU.LJIJ(c1295950jpR.LLILLJJLI.LJFF());
    }

    public static final void onAnimationUpdate$1(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        ((C1336560ksw) aUListenerS269S0100000_20.l0).LLJ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1336560ksw c1336560ksw = (C1336560ksw) aUListenerS269S0100000_20.l0;
        float f = c1336560ksw.LLJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1336560ksw);
        c1336560ksw.setAlpha(f);
        ((C1336560ksw) aUListenerS269S0100000_20.l0).getClass();
    }

    public static final void onAnimationUpdate$10(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            ((LynxBaseUI) aUListenerS269S0100000_20.l0).mLynxBackground.LJIILIIL(((Integer) animatedValue).intValue());
            ((LynxBaseUI) aUListenerS269S0100000_20.l0).invalidate();
        }
    }

    public static final void onAnimationUpdate$11(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            C786410Ut5.T4(((LynxUI) aUListenerS269S0100000_20.l0).mView, ((Float) animatedValue).floatValue());
            InterfaceC1313090kH5 interfaceC1313090kH5 = ((LynxUI) aUListenerS269S0100000_20.l0).mParent;
            if (interfaceC1313090kH5 instanceof UIShadowProxy) {
                ((UIShadowProxy) interfaceC1313090kH5).LJJIJ();
            }
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        AbstractC1313520kHm abstractC1313520kHm = ((C1313530kHn) aUListenerS269S0100000_20.l0).LIZIZ.get();
        if (abstractC1313520kHm != null) {
            InterfaceC1298200jt4 interfaceC1298200jt4 = abstractC1313520kHm.LLILZLL;
            if (interfaceC1298200jt4 instanceof C1313490kHj) {
                ((SDUIBaseUI) interfaceC1298200jt4).LJJJJZ();
            }
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            ((SDUIBaseUI) aUListenerS269S0100000_20.l0).LJL(((Integer) animatedValue).intValue());
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            int iIntValue = ((Integer) animatedValue).intValue();
            SDUIBaseUI sDUIBaseUI = (SDUIBaseUI) aUListenerS269S0100000_20.l0;
            sDUIBaseUI.LLJJJIL = iIntValue;
            sDUIBaseUI.LJJLIIIJJIZ();
        }
    }

    public static final void onAnimationUpdate$15(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            int iIntValue = ((Integer) animatedValue).intValue();
            SDUIBaseUI sDUIBaseUI = (SDUIBaseUI) aUListenerS269S0100000_20.l0;
            sDUIBaseUI.LLJJJJ = iIntValue;
            sDUIBaseUI.LJJLIIIJJIZ();
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            ((SDUIBaseUI) aUListenerS269S0100000_20.l0).LJJZ(((Integer) animatedValue).intValue());
        }
    }

    public static final void onAnimationUpdate$17(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            ((SDUIBaseUI) aUListenerS269S0100000_20.l0).LLJ.LIZJ(((Integer) animatedValue).intValue());
            ((SDUIBaseUI) aUListenerS269S0100000_20.l0).LJJJJZ();
        }
    }

    public static final void onAnimationUpdate$18(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            C786410Ut5.T4(((AbstractC1313520kHm) aUListenerS269S0100000_20.l0).LLLLLILLIL, ((Float) animatedValue).floatValue());
            InterfaceC1298200jt4 interfaceC1298200jt4 = ((AbstractC1313520kHm) aUListenerS269S0100000_20.l0).LLILZLL;
            if (interfaceC1298200jt4 instanceof C1313490kHj) {
                ((SDUIBaseUI) interfaceC1298200jt4).LJJJJZ();
            }
        }
    }

    public static final void onAnimationUpdate$19(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            C786410Ut5.T4(((AbstractC1313520kHm) aUListenerS269S0100000_20.l0).LLLLLILLIL, ((Float) animatedValue).floatValue());
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        ((C1336570ksx) aUListenerS269S0100000_20.l0).LLJ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1336570ksx c1336570ksx = (C1336570ksx) aUListenerS269S0100000_20.l0;
        float f = c1336570ksx.LLJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1336570ksx);
        c1336570ksx.setAlpha(f);
        ((C1336570ksx) aUListenerS269S0100000_20.l0).getClass();
    }

    public static final void onAnimationUpdate$20(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        ((AnimatedDrawable2) aUListenerS269S0100000_20.l0).setLevel(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$21(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() >= 1.0f) {
            ((C1337290ku7) aUListenerS269S0100000_20.l0).LJIIIZ();
        }
    }

    public static final void onAnimationUpdate$22(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() >= 1.0f) {
            ((C1337280ku6) aUListenerS269S0100000_20.l0).LJIIIZ();
        }
    }

    public static final void onAnimationUpdate$23(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() >= 1.0f) {
            ((C1337410kuJ) aUListenerS269S0100000_20.l0).LJIIIZ();
        }
    }

    public static final void onAnimationUpdate$24(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() >= 1.0f) {
            ((C1337250ku3) aUListenerS269S0100000_20.l0).LJIIIZ();
        }
    }

    public static final void onAnimationUpdate$25(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() >= 1.0f) {
            ((C1337420kuK) aUListenerS269S0100000_20.l0).LJIIIZ();
        }
    }

    public static final void onAnimationUpdate$26(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() >= 1.0f) {
            ((C1337270ku5) aUListenerS269S0100000_20.l0).LJIIIZ();
        }
    }

    public static final void onAnimationUpdate$27(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() >= 1.0f) {
            ((C1337400kuI) aUListenerS269S0100000_20.l0).LJIIIZ();
        }
    }

    public static final void onAnimationUpdate$28(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        AppBarLayout$Behavior appBarLayout$Behavior = (AppBarLayout$Behavior) aUListenerS269S0100000_20.l0;
        if (appBarLayout$Behavior != null) {
            appBarLayout$Behavior.setTopAndBottomOffset(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$29(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        C1290850jhD c1290850jhD = (C1290850jhD) aUListenerS269S0100000_20.l0;
        C1291600jiQ composition = ((C1291330jhz) c1290850jhD.LLLLLILLIL).getComposition();
        if (composition != null && valueAnimator.getAnimatedValue() != null && c1290850jhD.LLLLZLLLI) {
            try {
                float f = composition.LJIIIZ;
                float f2 = composition.LJIIJ - f;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    c1290850jhD.LLLLLZIL = C814420VxA.LIZIZ(f + (f2 * ((Float) animatedValue).floatValue()));
                    c1290850jhD.LLLLLZL = (int) (composition.LJIIJ - composition.LJIIIZ);
                    if (((ArrayList) c1290850jhD.LLLZL).size() < ((ArrayList) c1290850jhD.LLLZIL).size()) {
                        int iIntValue = ((Number) ((ArrayList) c1290850jhD.LLLZIL).get(((ArrayList) c1290850jhD.LLLZL).size())).intValue();
                        if (iIntValue <= c1290850jhD.LLLLLZIL) {
                            ((ArrayList) c1290850jhD.LLLZL).add(Integer.valueOf(iIntValue));
                            c1290850jhD.LJZ("update", C1290850jhD.LJLLI(c1290850jhD.LLLLLZIL, c1290850jhD.LLLLLZL, c1290850jhD.LLLLZ, c1290850jhD.LLLZI));
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.toString();
            }
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        C1291430ji9 c1291430ji9 = (C1291430ji9) aUListenerS269S0100000_20.l0;
        if (c1291430ji9.LLJIJIL != null) {
            if (C1291380ji4.LIZ) {
                if (C1291380ji4.LIZIZ == null) {
                    C1291380ji4.LIZIZ = new Random();
                }
                if (C1291380ji4.LIZIZ.nextFloat() < 0.01d) {
                    c1291430ji9.getClass();
                }
            }
            ((C1291430ji9) aUListenerS269S0100000_20.l0).getClass();
            C1291430ji9 c1291430ji92 = (C1291430ji9) aUListenerS269S0100000_20.l0;
            c1291430ji92.LLJIJIL.LJIILJJIL(c1291430ji92.LLILLL.LIZJ());
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        LynxBytedLottieView lynxBytedLottieView = (LynxBytedLottieView) aUListenerS269S0100000_20.l0;
        C1291600jiQ composition = ((C1291330jhz) lynxBytedLottieView.mView).getComposition();
        if (composition != null && valueAnimator.getAnimatedValue() != null && lynxBytedLottieView.LLJILJILJ) {
            try {
                float f = composition.LJIIIZ;
                float f2 = composition.LJIIJ - f;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    lynxBytedLottieView.LLILZIL = C814420VxA.LIZIZ(f + (f2 * ((Float) animatedValue).floatValue()));
                    lynxBytedLottieView.LLILZLL = (int) (composition.LJIIJ - composition.LJIIIZ);
                    Iterator it2 = ((ArrayList) lynxBytedLottieView.LLJJIJI).iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        if (iIntValue <= lynxBytedLottieView.LLILZIL) {
                            int i = lynxBytedLottieView.LLJJJJLIIL;
                            if (iIntValue <= lynxBytedLottieView.LLJJL && i <= iIntValue && !lynxBytedLottieView.LLJJIJIIJIL.contains(Integer.valueOf(iIntValue))) {
                                lynxBytedLottieView.LLJJIJIIJIL.add(Integer.valueOf(iIntValue));
                                lynxBytedLottieView.LJJJIL("update", lynxBytedLottieView.LJJIJ(iIntValue, lynxBytedLottieView.LLILZLL, lynxBytedLottieView.LLIZ, lynxBytedLottieView.LLJJ));
                            }
                        }
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.e("byted-lottie", e.toString());
            }
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        LynxUI lynxUI = ((C1313330kHT) aUListenerS269S0100000_20.l0).LIZIZ.get();
        if (lynxUI != null) {
            InterfaceC1313090kH5 interfaceC1313090kH5 = lynxUI.mParent;
            if (interfaceC1313090kH5 instanceof UIShadowProxy) {
                ((UIShadowProxy) interfaceC1313090kH5).LJJIJ();
            }
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            ((LynxBaseUI) aUListenerS269S0100000_20.l0).setTop(((Integer) animatedValue).intValue());
            InterfaceC1313090kH5 interfaceC1313090kH5 = ((LynxBaseUI) aUListenerS269S0100000_20.l0).mParent;
            if (interfaceC1313090kH5 instanceof UIShadowProxy) {
                ((UIShadowProxy) interfaceC1313090kH5).LJJIJ();
            }
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            ((LynxBaseUI) aUListenerS269S0100000_20.l0).setWidth(((Integer) animatedValue).intValue());
            InterfaceC1313090kH5 interfaceC1313090kH5 = ((LynxBaseUI) aUListenerS269S0100000_20.l0).mParent;
            if (interfaceC1313090kH5 instanceof UIShadowProxy) {
                ((UIShadowProxy) interfaceC1313090kH5).LJJIJ();
            }
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            ((LynxBaseUI) aUListenerS269S0100000_20.l0).setHeight(((Integer) animatedValue).intValue());
            InterfaceC1313090kH5 interfaceC1313090kH5 = ((LynxBaseUI) aUListenerS269S0100000_20.l0).mParent;
            if (interfaceC1313090kH5 instanceof UIShadowProxy) {
                ((UIShadowProxy) interfaceC1313090kH5).LJJIJ();
            }
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS269S0100000_20 aUListenerS269S0100000_20, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            ((LynxBaseUI) aUListenerS269S0100000_20.l0).setLeft(((Integer) animatedValue).intValue());
            InterfaceC1313090kH5 interfaceC1313090kH5 = ((LynxBaseUI) aUListenerS269S0100000_20.l0).mParent;
            if (interfaceC1313090kH5 instanceof UIShadowProxy) {
                ((UIShadowProxy) interfaceC1313090kH5).LJJIJ();
            }
        }
    }
}
