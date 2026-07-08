package Y;

import X.AbstractC1842530y31;
import X.C0FNZ;
import X.C1323170kXL;
import X.C16F5;
import X.C1838180xw0;
import X.C1842830y3V;
import X.C1842980y3k;
import X.C1843040y3q;
import X.C1843150y41;
import X.C1843170y43;
import X.C1843210y47;
import X.C1843220y48;
import X.C1845060y76;
import X.C1856470yPV;
import X.C1856720yPu;
import X.C20743516Fd;
import X.C2188811AlT;
import X.C324800CoI;
import X.C426320Gne;
import X.C786410Ut5;
import X.C817403Hg;
import X.EnumC1322650kWV;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.list.TakoAnswerImageListItemAssem;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor_data.FinishEncourageTask;

/* JADX INFO: loaded from: classes28.dex */
public class AUListenerS230S0200000_27 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        AbstractC1842530y31.LJIILJJIL(((C1842830y3V) aUListenerS230S0200000_27.l0).LIZJ, ((Integer) ((ValueAnimator) aUListenerS230S0200000_27.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$1(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        AbstractC1842530y31.LJIILJJIL(((C1842830y3V) aUListenerS230S0200000_27.l0).LIZJ, ((Integer) ((ValueAnimator) aUListenerS230S0200000_27.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$10(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        LiveIconView liveIconView;
        C20743516Fd c20743516Fd = (C20743516Fd) aUListenerS230S0200000_27.l0;
        if (c20743516Fd != null) {
            c20743516Fd.setTint(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        ImageView imageView = ((C1843170y43) aUListenerS230S0200000_27.l1).LJIILL;
        if ((imageView instanceof LiveIconView) && (liveIconView = (LiveIconView) imageView) != null) {
            liveIconView.setIcon((C20743516Fd) aUListenerS230S0200000_27.l0);
        }
    }

    public static final void onAnimationUpdate$11(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        AbstractC1842530y31.LJIILJJIL(((C1843210y47) aUListenerS230S0200000_27.l0).LIZJ, ((Integer) ((ValueAnimator) aUListenerS230S0200000_27.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$12(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        AbstractC1842530y31.LJIILJJIL(((C1843210y47) aUListenerS230S0200000_27.l0).LIZJ, ((Integer) ((ValueAnimator) aUListenerS230S0200000_27.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$13(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C817403Hg c817403Hg = (C817403Hg) aUListenerS230S0200000_27.l0;
            C1856470yPV c1856470yPV = (C1856470yPV) aUListenerS230S0200000_27.l1;
            float fFloatValue = f.floatValue();
            c1856470yPV.getClass();
            c817403Hg.element = (fFloatValue * 1.0f) + 0.0f;
            float f2 = 3 * fFloatValue;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            float f3 = (fFloatValue * 1.5f) - 0.5f;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            } else if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            View view = c1856470yPV.LLILZIL;
            if (view != null) {
                C786410Ut5.T4(view, (f2 * (-1.0f)) + 1.0f);
            }
            float f4 = 0.0f + (1.0f * f3);
            TuxTextView tuxTextView = c1856470yPV.LLILZLL;
            if (tuxTextView != null) {
                C786410Ut5.B5(tuxTextView, f4);
            }
            C0FNZ c0fnz = c1856470yPV.LLIZ;
            if (c0fnz != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0fnz);
                c0fnz.setAlpha(f4);
            }
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        Float f;
        boolean z;
        double d;
        double d2;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C1838180xw0 c1838180xw0 = (C1838180xw0) aUListenerS230S0200000_27.l0;
            FinishEncourageTask finishEncourageTask = (FinishEncourageTask) aUListenerS230S0200000_27.l1;
            float fFloatValue = f.floatValue();
            boolean z2 = true;
            if (fFloatValue >= c1838180xw0.LLIZLLLIL - 0.001f) {
                z = true;
            } else {
                z = false;
            }
            ProgressBar taskProgressBarFromXml = c1838180xw0.getTaskProgressBarFromXml();
            if (taskProgressBarFromXml != null) {
                taskProgressBarFromXml.setProgress((int) fFloatValue);
            }
            if (z) {
                FinishEncourageTask finishEncourageTask2 = c1838180xw0.LLILZLL;
                d = 0.0d;
                if (finishEncourageTask2 != null) {
                    double d3 = finishEncourageTask2.progress;
                    d = finishEncourageTask2.target;
                    if (d3 <= d) {
                        d = d3;
                    }
                }
            } else {
                d = ((double) (fFloatValue / 100.0f)) * finishEncourageTask.target;
            }
            if (c1838180xw0.LLJIJIL != EnumC1322650kWV.PERCENTAGE) {
                z2 = false;
            }
            double d4 = finishEncourageTask.target;
            if (d > d4) {
                d = d4;
            }
            if (z2) {
                d /= d4;
            }
            String strH0 = C1838180xw0.h0(z2, d);
            if (z2) {
                d2 = 1.0d;
            } else {
                d2 = finishEncourageTask.target;
            }
            String strH02 = C1838180xw0.h0(z2, d2);
            if (z) {
                ProgressBar subTaskProgressBarFromXml = c1838180xw0.getSubTaskProgressBarFromXml();
                if (subTaskProgressBarFromXml != null) {
                    subTaskProgressBarFromXml.setProgress((int) c1838180xw0.LLIZLLLIL);
                }
                ProgressBar taskProgressBarFromXml2 = c1838180xw0.getTaskProgressBarFromXml();
                if (taskProgressBarFromXml2 != null) {
                    taskProgressBarFromXml2.setProgress((int) c1838180xw0.LLIZLLLIL);
                }
                C16F5 progressTextView = c1838180xw0.getProgressTextView();
                if (progressTextView != null) {
                    progressTextView.setText(strH0);
                }
                C16F5 progressTargetTextView = c1838180xw0.getProgressTargetTextView();
                if (progressTargetTextView != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" / ");
                    sbLIZ.append(strH02);
                    progressTargetTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            C16F5 progressTextView2 = c1838180xw0.getProgressTextView();
            if (progressTextView2 != null) {
                progressTextView2.setText(strH0);
            }
            C16F5 progressTargetTextView2 = c1838180xw0.getProgressTargetTextView();
            if (progressTargetTextView2 == null) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" / ");
            sbLIZ2.append(strH02);
            progressTargetTextView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static final void onAnimationUpdate$15(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        Integer num;
        String str = ((TakoAnswerImageListItemAssem) aUListenerS230S0200000_27.l0).LLLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1856720yPu) aUListenerS230S0200000_27.l1).LL.LJJIJLIJ());
        sbLIZ.append('#');
        sbLIZ.append(((C1856720yPu) aUListenerS230S0200000_27.l1).LLILLJJLI);
        if (!Intrinsics.LJFF(str, C2188811AlT.LIZIZ(sbLIZ))) {
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            TakoAnswerImageListItemAssem takoAnswerImageListItemAssem = (TakoAnswerImageListItemAssem) aUListenerS230S0200000_27.l0;
            int iIntValue = num.intValue();
            C1323170kXL c1323170kXL = takoAnswerImageListItemAssem.LLJLL;
            if (c1323170kXL != null) {
                c1323170kXL.setProgress(iIntValue);
            }
            takoAnswerImageListItemAssem.Ep(iIntValue);
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            ((C1845060y76) aUListenerS230S0200000_27.l0).LIZLLL = fFloatValue;
            ((C426320Gne) aUListenerS230S0200000_27.l1).LIZ(fFloatValue, false);
        }
    }

    public static final void onAnimationUpdate$17(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        View view = (View) aUListenerS230S0200000_27.l0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            C786410Ut5.W5(view, layoutParams);
            C324800CoI.LIZ.getClass();
            if (!C324800CoI.LIZ()) {
                View view2 = (View) aUListenerS230S0200000_27.l0;
                view2.setPadding(view2.getPaddingLeft(), (int) (((Number) ((TakoSheetFragment) aUListenerS230S0200000_27.l1).LLLLLLL.getValue()).intValue() * valueAnimator.getAnimatedFraction()), view2.getPaddingRight(), view2.getPaddingBottom());
            }
            ((TakoSheetFragment) aUListenerS230S0200000_27.l1).BS(valueAnimator.getAnimatedFraction());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationUpdate$2(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        AbstractC1842530y31.LJIILJJIL(((C1843220y48) aUListenerS230S0200000_27.l0).LIZJ, ((Integer) ((ValueAnimator) aUListenerS230S0200000_27.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$3(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        AbstractC1842530y31.LJIILJJIL(((C1842980y3k) aUListenerS230S0200000_27.l0).LIZJ, ((Integer) ((ValueAnimator) aUListenerS230S0200000_27.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$4(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        AbstractC1842530y31.LJIILJJIL(((C1843040y3q) aUListenerS230S0200000_27.l0).LIZJ, ((Integer) ((ValueAnimator) aUListenerS230S0200000_27.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$5(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        AbstractC1842530y31.LJIILJJIL(((C1843220y48) aUListenerS230S0200000_27.l0).LIZJ, ((Integer) ((ValueAnimator) aUListenerS230S0200000_27.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$6(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = ((C1842980y3k) aUListenerS230S0200000_27.l0).LJJIFFI;
        if (viewGroup != null) {
            AbstractC1842530y31.LJIILJJIL(viewGroup, ((Integer) ((ValueAnimator) aUListenerS230S0200000_27.l1).getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        AbstractC1842530y31.LJIILJJIL(((C1843150y41) aUListenerS230S0200000_27.l0).LIZJ, ((Integer) ((ValueAnimator) aUListenerS230S0200000_27.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$8(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        AbstractC1842530y31.LJIILJJIL(((C1843170y43) aUListenerS230S0200000_27.l0).LIZJ, ((Integer) ((ValueAnimator) aUListenerS230S0200000_27.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$9(AUListenerS230S0200000_27 aUListenerS230S0200000_27, ValueAnimator valueAnimator) {
        LiveIconView liveIconView;
        C20743516Fd c20743516Fd = (C20743516Fd) aUListenerS230S0200000_27.l0;
        if (c20743516Fd != null) {
            c20743516Fd.setTint(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        ImageView imageView = ((C1843170y43) aUListenerS230S0200000_27.l1).LJIIL;
        if ((imageView instanceof LiveIconView) && (liveIconView = (LiveIconView) imageView) != null) {
            liveIconView.setIcon((C20743516Fd) aUListenerS230S0200000_27.l0);
        }
    }

    public AUListenerS230S0200000_27(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
