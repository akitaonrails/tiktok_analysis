package Y;

import X.C1143100fqu;
import X.C118300cf;
import X.C1324720kZq;
import X.C15CT;
import X.C15CU;
import X.C15D3;
import X.C15D6;
import X.C15DV;
import X.C15FX;
import X.C1619980sG4;
import X.C16F5;
import X.C16FS;
import X.C194305110d;
import X.C197039127h;
import X.C19MB;
import X.C204741159n;
import X.C20481615Ck;
import X.C20481815Cm;
import X.C20489115Fh;
import X.C20575915fJ;
import X.C20581915gH;
import X.C20632215oO;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C497740JfY;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817403Hg;
import X.C971140bNY;
import X.C978940ba8;
import X.EnumC20482415Cs;
import X.EnumC20580215g0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import com.bytedance.android.livesdk.chatroom.model.AnchorFinishEncourageData;
import com.bytedance.android.livesdk.impl.revenue.enigma.paywall.EnigmaPaywallDialog;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;
import com.tts.oecverify.BdTuring;
import tikcast.api.anchor_data.FinishEncourageLiveJourney;
import tikcast.api.anchor_data.FinishEncourageTask;

/* JADX INFO: loaded from: classes32.dex */
public class AUListenerS233S0200000_31 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.dc((C1143100fqu) aUListenerS233S0200000_31.l0, fFloatValue);
        C786410Ut5.Ac((C1143100fqu) aUListenerS233S0200000_31.l0, fFloatValue);
        C786410Ut5.Yb(((C978940ba8) aUListenerS233S0200000_31.l1).LL, fFloatValue);
        C786410Ut5.xc(((C978940ba8) aUListenerS233S0200000_31.l1).LL, fFloatValue);
    }

    public static final void onAnimationUpdate$1(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.dc((C1143100fqu) aUListenerS233S0200000_31.l0, fFloatValue);
        C786410Ut5.Ac((C1143100fqu) aUListenerS233S0200000_31.l0, fFloatValue);
        C786410Ut5.Yb(((C978940ba8) aUListenerS233S0200000_31.l1).LL, fFloatValue);
        C786410Ut5.xc(((C978940ba8) aUListenerS233S0200000_31.l1).LL, fFloatValue);
    }

    public static final void onAnimationUpdate$10(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        EnigmaPaywallDialog.uS((ColorStateList) aUListenerS233S0200000_31.l0, (C16FS) aUListenerS233S0200000_31.l1, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$11(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() >= 1.0f) {
            C20481815Cm c20481815Cm = (C20481815Cm) aUListenerS233S0200000_31.l0;
            FinishEncourageLiveJourney finishEncourageLiveJourney = (FinishEncourageLiveJourney) aUListenerS233S0200000_31.l1;
            c20481815Cm.getClass();
            if (C20481815Cm.LIZJ(finishEncourageLiveJourney)) {
                ((C20481815Cm) aUListenerS233S0200000_31.l0).LJI.OC(340L);
            }
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.dc((C1143100fqu) aUListenerS233S0200000_31.l0, fFloatValue);
        C786410Ut5.Ac((C1143100fqu) aUListenerS233S0200000_31.l0, fFloatValue);
        C1324720kZq c1324720kZq = ((C15DV) aUListenerS233S0200000_31.l1).LIZIZ;
        if (c1324720kZq != null) {
            C786410Ut5.Yb(c1324720kZq, fFloatValue);
        }
        C1324720kZq c1324720kZq2 = ((C15DV) aUListenerS233S0200000_31.l1).LIZIZ;
        if (c1324720kZq2 != null) {
            C786410Ut5.xc(c1324720kZq2, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.dc((C1143100fqu) aUListenerS233S0200000_31.l0, fFloatValue);
        C786410Ut5.Ac((C1143100fqu) aUListenerS233S0200000_31.l0, fFloatValue);
        C1324720kZq c1324720kZq = ((C15DV) aUListenerS233S0200000_31.l1).LIZIZ;
        if (c1324720kZq != null) {
            C786410Ut5.Yb(c1324720kZq, fFloatValue);
        }
        C1324720kZq c1324720kZq2 = ((C15DV) aUListenerS233S0200000_31.l1).LIZIZ;
        if (c1324720kZq2 != null) {
            C786410Ut5.xc(c1324720kZq2, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        ((C817403Hg) aUListenerS233S0200000_31.l0).element = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.Ob(((C20575915fJ) aUListenerS233S0200000_31.l1).LIZ, ((C817403Hg) aUListenerS233S0200000_31.l0).element);
        C786410Ut5.pc(((C20575915fJ) aUListenerS233S0200000_31.l1).LIZ, ((C817403Hg) aUListenerS233S0200000_31.l0).element);
    }

    public static final void onAnimationUpdate$15(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        ((C118300cf) aUListenerS233S0200000_31.l0).element = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((C20575915fJ) aUListenerS233S0200000_31.l1).LIZIZ.setText(((C20575915fJ) aUListenerS233S0200000_31.l1).LJI.subSequence(0, ((C118300cf) aUListenerS233S0200000_31.l0).element).toString());
    }

    public static final void onAnimationUpdate$16(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            C16F5 c16f5 = ((C204741159n) aUListenerS233S0200000_31.l0).LJ;
            if (c16f5 != null) {
                ((C19MB) aUListenerS233S0200000_31.l1).LJJIIJZLJL(c16f5.getId(), 7, iIntValue);
            }
            ((C19MB) aUListenerS233S0200000_31.l1).LIZIZ(((C204741159n) aUListenerS233S0200000_31.l0).LIZLLL);
        }
    }

    public static final void onAnimationUpdate$17(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        if ((valueAnimator.getAnimatedValue() instanceof Integer) && ((C15FX) aUListenerS233S0200000_31.l0).LL) {
            ((ProgressBar) aUListenerS233S0200000_31.l1).setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.Yb(((C978940ba8) aUListenerS233S0200000_31.l0).LL, fFloatValue);
        C786410Ut5.xc(((C978940ba8) aUListenerS233S0200000_31.l0).LL, fFloatValue);
        C786410Ut5.dc((C1143100fqu) aUListenerS233S0200000_31.l1, fFloatValue);
        C786410Ut5.Ac((C1143100fqu) aUListenerS233S0200000_31.l1, fFloatValue);
    }

    public static final void onAnimationUpdate$3(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.dc((C1143100fqu) aUListenerS233S0200000_31.l0, fFloatValue);
        C786410Ut5.Ac((C1143100fqu) aUListenerS233S0200000_31.l0, fFloatValue);
        C786410Ut5.Yb(((C978940ba8) aUListenerS233S0200000_31.l1).LL, fFloatValue);
        C786410Ut5.xc(((C978940ba8) aUListenerS233S0200000_31.l1).LL, fFloatValue);
    }

    public static final void onAnimationUpdate$4(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        if ((valueAnimator.getAnimatedValue() instanceof Integer) && ((C15FX) aUListenerS233S0200000_31.l0).LL) {
            C971140bNY.LIZJ(((Integer) valueAnimator.getAnimatedValue()).intValue(), ((C20489115Fh) aUListenerS233S0200000_31.l1).LIZLLL);
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        Float f;
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        int i;
        int i2;
        Object animatedValue = valueAnimator.getAnimatedValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (animatedValue instanceof Float) {
            f = (Float) animatedValue;
        } else {
            f = null;
        }
        if (f != null) {
            C15CT c15ct = (C15CT) aUListenerS233S0200000_31.l0;
            AnchorFinishEncourageData.Task task = (AnchorFinishEncourageData.Task) aUListenerS233S0200000_31.l1;
            float fFloatValue = f.floatValue();
            ProgressBar taskProgressBarFromXml = c15ct.getTaskProgressBarFromXml();
            if (taskProgressBarFromXml != null) {
                taskProgressBarFromXml.setProgress((int) fFloatValue);
            }
            if (fFloatValue == c15ct.LLJILJIL) {
                z = true;
            } else {
                z = false;
            }
            String strLIZIZ = "";
            if (z) {
                int[] iArr = new int[2];
                View taskThumbFromXml = c15ct.getTaskThumbFromXml();
                if (taskThumbFromXml != null) {
                    taskThumbFromXml.getLocationOnScreen(iArr);
                }
                C15CU c15cu = c15ct.LLJ;
                if (c15cu != null) {
                    c15cu.lJ(iArr[0], iArr[1], c15ct.LLJI);
                }
                View taskThumbFromXml2 = c15ct.getTaskThumbFromXml();
                if (taskThumbFromXml2 != null) {
                    C786410Ut5.LJLLLLLL(8, taskThumbFromXml2);
                }
                ProgressBar subTaskProgressBarFromXml = c15ct.getSubTaskProgressBarFromXml();
                if (subTaskProgressBarFromXml != null) {
                    if (fFloatValue <= 1.0f) {
                        i2 = 1;
                    } else {
                        i2 = (int) fFloatValue;
                    }
                    subTaskProgressBarFromXml.setProgress(i2);
                }
                ProgressBar taskProgressBarFromXml2 = c15ct.getTaskProgressBarFromXml();
                if (taskProgressBarFromXml2 != null) {
                    if (fFloatValue <= 1.0f) {
                        i = 1;
                    } else {
                        i = (int) fFloatValue;
                    }
                    taskProgressBarFromXml2.setProgress(i);
                }
                C16F5 progressTextFromXml = c15ct.getProgressTextFromXml();
                if (progressTextFromXml != null) {
                    if (!task.aggregated) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(task.currentNum);
                        sbLIZ.append('/');
                        sbLIZ.append(task.targetNum);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    progressTextFromXml.setText(strLIZIZ);
                }
                if (c15ct.getSubTaskProgressBarFromXml() != null) {
                    ProgressBar subTaskProgressBarFromXml2 = c15ct.getSubTaskProgressBarFromXml();
                    if (subTaskProgressBarFromXml2 != null) {
                        subTaskProgressBarFromXml2.setPivotX(0.0f);
                    }
                    ProgressBar subTaskProgressBarFromXml3 = c15ct.getSubTaskProgressBarFromXml();
                    if (subTaskProgressBarFromXml3 != null) {
                        C786410Ut5.LLIIJLIL(subTaskProgressBarFromXml3, 0);
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c15ct.getSubTaskProgressBarFromXml(), (Property<ProgressBar, Float>) View.SCALE_X, 1.0f, 1.04f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c15ct.getSubTaskProgressBarFromXml(), (Property<ProgressBar, Float>) View.SCALE_Y, 1.0f, 1.4f);
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c15ct.getSubTaskProgressBarFromXml(), (Property<ProgressBar, Float>) View.SCALE_X, 1.04f, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c15ct.getSubTaskProgressBarFromXml(), (Property<ProgressBar, Float>) View.SCALE_Y, 1.4f, 1.0f);
                    objectAnimatorOfFloat.setDuration(100L);
                    objectAnimatorOfFloat2.setDuration(100L);
                    objectAnimatorOfFloat3.setDuration(200L);
                    objectAnimatorOfFloat3.setStartDelay(100L);
                    objectAnimatorOfFloat4.setDuration(200L);
                    objectAnimatorOfFloat4.setStartDelay(100L);
                    AnimatorSet animatorSet = new AnimatorSet();
                    c15ct.LLJILJILJ = animatorSet;
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                    AnimatorSet animatorSet2 = c15ct.LLJILJILJ;
                    if (animatorSet2 != null) {
                        animatorSet2.addListener(new ALAdapterS25S0100000_31(c15ct, 31));
                    }
                    AnimatorSet animatorSet3 = c15ct.LLJILJILJ;
                    if (animatorSet3 != null) {
                        animatorSet3.start();
                    }
                }
            } else {
                View taskThumbFromXml3 = c15ct.getTaskThumbFromXml();
                if (taskThumbFromXml3 != null) {
                    C786410Ut5.LJLLLLLL(0, taskThumbFromXml3);
                }
                float width = ((c15ct.getTaskProgressBarFromXml().getWidth() * fFloatValue) * 0.01f) - C497740JfY.LIZIZ(30);
                View taskThumbFromXml4 = c15ct.getTaskThumbFromXml();
                if (taskThumbFromXml4 != null) {
                    layoutParams = taskThumbFromXml4.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMarginStart((int) width);
                }
                View taskThumbFromXml5 = c15ct.getTaskThumbFromXml();
                if (taskThumbFromXml5 != null) {
                    C786410Ut5.W5(taskThumbFromXml5, marginLayoutParams);
                }
                float f2 = (fFloatValue / c15ct.LLJILJIL) * task.currentNum;
                C16F5 progressTextFromXml2 = c15ct.getProgressTextFromXml();
                if (progressTextFromXml2 != null) {
                    if (!task.aggregated) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append((int) f2);
                        sbLIZ2.append('/');
                        sbLIZ2.append(task.targetNum);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    progressTextFromXml2.setText(strLIZIZ);
                }
            }
        }
        if (valueAnimator.getAnimatedFraction() >= 1.0f) {
            C194305110d.LIZIZ();
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        Float f;
        boolean z;
        double d;
        boolean z2;
        C15D6 c15d6;
        C15D3 c15d3;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C20481615Ck c20481615Ck = (C20481615Ck) aUListenerS233S0200000_31.l0;
            FinishEncourageTask finishEncourageTask = (FinishEncourageTask) aUListenerS233S0200000_31.l1;
            float fFloatValue = f.floatValue();
            if (fFloatValue >= c20481615Ck.LLJILJILJ - 0.001f) {
                z = true;
            } else {
                z = false;
            }
            ProgressBar taskProgressBarFromXml = c20481615Ck.getTaskProgressBarFromXml();
            if (taskProgressBarFromXml != null) {
                taskProgressBarFromXml.setProgress((int) fFloatValue);
            }
            if (z) {
                FinishEncourageTask finishEncourageTask2 = c20481615Ck.LLJ;
                if (finishEncourageTask2 != null) {
                    d = finishEncourageTask2.progress;
                    double d2 = finishEncourageTask2.target;
                    if (d > d2) {
                        d = d2;
                    }
                } else {
                    d = 0.0d;
                }
            } else {
                d = ((double) (fFloatValue / 100.0f)) * finishEncourageTask.target;
            }
            if (c20481615Ck.LLJJI == EnumC20482415Cs.PERCENTAGE) {
                z2 = true;
            } else {
                z2 = false;
            }
            double d3 = finishEncourageTask.target;
            if (d > d3) {
                d = d3;
            }
            String strE0 = C20481615Ck.e0(z2, d);
            String strE02 = C20481615Ck.e0(z2, finishEncourageTask.target);
            if (z) {
                if (finishEncourageTask.progress == finishEncourageTask.target && (c15d3 = c20481615Ck.LLJJIII) != null) {
                    c15d3.LIZIZ();
                }
                ProgressBar subTaskProgressBarFromXml = c20481615Ck.getSubTaskProgressBarFromXml();
                if (subTaskProgressBarFromXml != null) {
                    subTaskProgressBarFromXml.setProgress((int) c20481615Ck.LLJILJILJ);
                }
                ProgressBar taskProgressBarFromXml2 = c20481615Ck.getTaskProgressBarFromXml();
                if (taskProgressBarFromXml2 != null) {
                    taskProgressBarFromXml2.setProgress((int) c20481615Ck.LLJILJILJ);
                }
                C16F5 progressTextView = c20481615Ck.getProgressTextView();
                if (progressTextView != null) {
                    progressTextView.setText(strE0);
                }
                C16F5 progressTargetTextView = c20481615Ck.getProgressTargetTextView();
                if (progressTargetTextView != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" / ");
                    sbLIZ.append(strE02);
                    progressTargetTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
                C16F5 c16f5 = c20481615Ck.LLILZIL;
                if (c16f5 != null) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.0f, 1.9f);
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.0f, 1.9f);
                    objectAnimatorOfFloat2.setDuration(200L);
                    objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJI());
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.9f, 0.8f);
                    objectAnimatorOfFloat3.setDuration(200L);
                    objectAnimatorOfFloat3.setStartDelay(200L);
                    objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJI());
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.9f, 0.8f);
                    objectAnimatorOfFloat4.setDuration(200L);
                    objectAnimatorOfFloat4.setStartDelay(200L);
                    objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJI());
                    ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 0.8f, 1.0f);
                    objectAnimatorOfFloat5.setDuration(230L);
                    objectAnimatorOfFloat5.setStartDelay(400L);
                    objectAnimatorOfFloat5.setInterpolator(C1619980sG4.LJI());
                    ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 0.8f, 1.0f);
                    objectAnimatorOfFloat6.setDuration(230L);
                    objectAnimatorOfFloat6.setStartDelay(400L);
                    objectAnimatorOfFloat6.setInterpolator(C1619980sG4.LJI());
                    AnimatorSet animatorSet = new AnimatorSet();
                    c20481615Ck.LLJJ = animatorSet;
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
                    AnimatorSet animatorSet2 = c20481615Ck.LLJJ;
                    if (animatorSet2 != null) {
                        animatorSet2.addListener(new ALAdapterS25S0100000_31(c20481615Ck, 34));
                    }
                    AnimatorSet animatorSet3 = c20481615Ck.LLJJ;
                    if (animatorSet3 != null) {
                        animatorSet3.start();
                    }
                }
                if (finishEncourageTask.progress == finishEncourageTask.target) {
                    ProgressBar progressBar = c20481615Ck.LLILLL;
                    if (progressBar != null) {
                        progressBar.setPivotX(0.0f);
                        C786410Ut5.LLIIJLIL(progressBar, 0);
                        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_X, 1.0f, 1.25f);
                        objectAnimatorOfFloat7.setDuration(200L);
                        objectAnimatorOfFloat7.setInterpolator(C1619980sG4.LIZLLL());
                        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_Y, 1.0f, 1.25f);
                        objectAnimatorOfFloat8.setDuration(200L);
                        objectAnimatorOfFloat8.setInterpolator(C1619980sG4.LIZLLL());
                        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_X, 1.25f, 0.9f);
                        objectAnimatorOfFloat9.setDuration(200L);
                        objectAnimatorOfFloat9.setStartDelay(200L);
                        objectAnimatorOfFloat9.setInterpolator(C1619980sG4.LJI());
                        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_Y, 1.25f, 0.9f);
                        objectAnimatorOfFloat10.setDuration(200L);
                        objectAnimatorOfFloat10.setStartDelay(200L);
                        objectAnimatorOfFloat10.setInterpolator(C1619980sG4.LJI());
                        ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_X, 0.9f, 1.0f);
                        objectAnimatorOfFloat11.setDuration(230L);
                        objectAnimatorOfFloat11.setStartDelay(400L);
                        objectAnimatorOfFloat11.setInterpolator(C1619980sG4.LJI());
                        ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(progressBar, (Property<ProgressBar, Float>) View.SCALE_Y, 0.9f, 1.0f);
                        objectAnimatorOfFloat12.setDuration(230L);
                        objectAnimatorOfFloat12.setStartDelay(400L);
                        objectAnimatorOfFloat12.setInterpolator(C1619980sG4.LJI());
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        c20481615Ck.LLJILLL = animatorSet4;
                        animatorSet4.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat10, objectAnimatorOfFloat11, objectAnimatorOfFloat12);
                        AnimatorSet animatorSet5 = c20481615Ck.LLJILLL;
                        if (animatorSet5 != null) {
                            animatorSet5.addListener(new ALAdapterS25S0100000_31(c20481615Ck, 32));
                        }
                        AnimatorSet animatorSet6 = c20481615Ck.LLJILLL;
                        if (animatorSet6 != null) {
                            animatorSet6.start();
                        }
                    }
                    View progressCenterAnchor = c20481615Ck.getProgressCenterAnchor();
                    if (progressCenterAnchor != null && (c15d6 = c20481615Ck.LLJI) != null) {
                        c15d6.le(c20481615Ck.LLJIJIL, progressCenterAnchor);
                    }
                }
            } else {
                ProgressBar subTaskProgressBarFromXml2 = c20481615Ck.getSubTaskProgressBarFromXml();
                if (subTaskProgressBarFromXml2 != null) {
                    subTaskProgressBarFromXml2.setProgress((int) fFloatValue);
                }
                C16F5 progressTextView2 = c20481615Ck.getProgressTextView();
                if (progressTextView2 != null) {
                    progressTextView2.setText(strE0);
                }
                C16F5 progressTargetTextView2 = c20481615Ck.getProgressTargetTextView();
                if (progressTargetTextView2 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" / ");
                    sbLIZ2.append(strE02);
                    progressTargetTextView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        if (valueAnimator.getAnimatedFraction() >= 1.0f) {
            C194305110d.LIZIZ();
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        ((GradientDrawable) aUListenerS233S0200000_31.l0).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        ((ViewGroup) aUListenerS233S0200000_31.l1).invalidate();
    }

    public static final void onAnimationUpdate$8(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        EnumC20580215g0 enumC20580215g0 = ((StoryThoughtCreationFragment) aUListenerS233S0200000_31.l0).SR().LLILZ;
        int iIntValue = C20632215oO.LIZ(fFloatValue, -1, -16777216).intValue();
        int iIntValue2 = C20632215oO.LIZ(fFloatValue, -16777216, -1).intValue();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC20580215g0.getScrollViewPaddingBottomOnSoftInputShownDp() + ((enumC20580215g0.getScrollViewPaddingBottomOnSoftInputHiddenDp() - enumC20580215g0.getScrollViewPaddingBottomOnSoftInputShownDp()) * (1.0f - fFloatValue)))));
        ((StoryThoughtCreationFragment) aUListenerS233S0200000_31.l0).SR().LLJILJIL = iIntValue2;
        C197039127h c197039127h = ((C20581915gH) aUListenerS233S0200000_31.l1).LLJJIJI;
        if (c197039127h != null) {
            c197039127h.setBackgroundTintList(ColorStateList.valueOf(iIntValue));
        }
        C197039127h c197039127h2 = ((C20581915gH) aUListenerS233S0200000_31.l1).LLJJIJI;
        if (c197039127h2 != null) {
            c197039127h2.setTextColor(iIntValue2);
        }
        C197039127h c197039127h3 = ((C20581915gH) aUListenerS233S0200000_31.l1).LLJJIJI;
        if (c197039127h3 != null) {
            c197039127h3.setIconTintColor(iIntValue2);
        }
        ScrollView scrollView = ((C20581915gH) aUListenerS233S0200000_31.l1).LLJILJIL;
        if (scrollView != null) {
            scrollView.setPadding(scrollView.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((StoryThoughtCreationFragment) aUListenerS233S0200000_31.l0).SR().LLILZ.getScrollViewPaddingTopDp()))), scrollView.getPaddingRight(), iLIZIZ);
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS233S0200000_31 aUListenerS233S0200000_31, ValueAnimator valueAnimator) {
        EnigmaPaywallDialog.uS((ColorStateList) aUListenerS233S0200000_31.l0, (C16FS) aUListenerS233S0200000_31.l1, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS233S0200000_31(X.C978940ba8 r2, X.C1143100fqu r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                case 1: goto Le;
                case 2: goto L5;
                case 3: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS233S0200000_31.<init>(X.0ba8, X.0fqu, int):void");
    }

    public AUListenerS233S0200000_31(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
