package Y;

import X.C500260Jjc;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.PlayCardFeedCellV2;

/* JADX INFO: loaded from: classes8.dex */
public class AUListenerS76S0110000_7 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public boolean z1;

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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS76S0110000_7 aUListenerS76S0110000_7, ValueAnimator valueAnimator) {
        if (aUListenerS76S0110000_7.z1) {
            View view = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILLJJLI;
            if (view != null) {
                C786410Ut5.ed(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            float animatedFraction = (valueAnimator.getAnimatedFraction() / 10) + 0.9f;
            View view2 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILLJJLI;
            if (view2 != null) {
                C786410Ut5.Ob(view2, animatedFraction);
            }
            View view3 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILLJJLI;
            if (view3 != null) {
                C786410Ut5.pc(view3, animatedFraction);
            }
            if (((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).M1()) {
                View view4 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILLL;
                if (view4 != null) {
                    C786410Ut5.ed(view4, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                View view5 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILLL;
                if (view5 != null) {
                    C786410Ut5.pc(view5, animatedFraction);
                }
                View view6 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILZ;
                if (view6 != null) {
                    C786410Ut5.ed(view6, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                View view7 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILZ;
                if (view7 != null) {
                    C786410Ut5.pc(view7, animatedFraction);
                }
                RecommendSwipeNewWidget recommendSwipeNewWidget = (RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0;
                View view8 = recommendSwipeNewWidget.LLILLJJLI;
                if (view8 != null) {
                    float fIntValue = ((Number) recommendSwipeNewWidget.LLLFZ.getValue()).intValue() * (1 - view8.getScaleX());
                    float f = 2;
                    int i = (int) (fIntValue / f);
                    View view9 = recommendSwipeNewWidget.LLILZ;
                    if (view9 != null) {
                        C786410Ut5.Jc(view9, (-i) / f);
                    }
                    View view10 = recommendSwipeNewWidget.LLILLL;
                    if (view10 != null) {
                        ViewGroup.LayoutParams layoutParams = view10.getLayoutParams();
                        layoutParams.width = i;
                        C786410Ut5.W5(view10, layoutParams);
                    }
                    View view11 = recommendSwipeNewWidget.LLILZ;
                    if (view11 != null) {
                        ViewGroup.LayoutParams layoutParams2 = view11.getLayoutParams();
                        layoutParams2.width = i;
                        C786410Ut5.W5(view11, layoutParams2);
                    }
                }
            }
        } else {
            View view12 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLJLLL;
            if (view12 != null) {
                C786410Ut5.ed(view12, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLJJJ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RecommendSwipeNewWidget recommendSwipeNewWidget2 = (RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0;
            if (recommendSwipeNewWidget2.LLJJJJ) {
                recommendSwipeNewWidget2.P1();
            } else {
                recommendSwipeNewWidget2.z1();
            }
        }
        if (valueAnimator.getAnimatedFraction() >= 0.98f) {
            if (aUListenerS76S0110000_7.z1) {
                View view13 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILLJJLI;
                if (view13 != null) {
                    C786410Ut5.ed(view13, 0.0f);
                }
                View view14 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILLJJLI;
                if (view14 != null) {
                    C786410Ut5.Ob(view14, 1.0f);
                }
                View view15 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILLJJLI;
                if (view15 != null) {
                    C786410Ut5.pc(view15, 1.0f);
                }
                if (((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).M1()) {
                    View view16 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILLL;
                    if (view16 != null) {
                        C786410Ut5.ed(view16, 0.0f);
                    }
                    View view17 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILLL;
                    if (view17 != null) {
                        C786410Ut5.pc(view17, 1.0f);
                    }
                    View view18 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILZ;
                    if (view18 != null) {
                        C786410Ut5.ed(view18, 0.0f);
                    }
                    View view19 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILZ;
                    if (view19 != null) {
                        C786410Ut5.pc(view19, 1.0f);
                    }
                    C500260Jjc.LJIILIIL(((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILLL);
                    C500260Jjc.LJIILIIL(((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLILZ);
                }
            } else {
                View view20 = ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).LLJLLL;
                if (view20 != null) {
                    C786410Ut5.ed(view20, 0.0f);
                }
            }
            RecommendSwipeNewWidget recommendSwipeNewWidget3 = (RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0;
            recommendSwipeNewWidget3.LLJJJJLIIL = 0.0f;
            recommendSwipeNewWidget3.hide();
            ((RecommendSwipeNewWidget) aUListenerS76S0110000_7.l0).O1();
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS76S0110000_7 aUListenerS76S0110000_7, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (aUListenerS76S0110000_7.z1) {
            ((PlayCardFeedCellV2) aUListenerS76S0110000_7.l0).q6(iIntValue);
            return;
        }
        LinearLayout linearLayoutW5 = ((PlayCardFeedCellV2) aUListenerS76S0110000_7.l0).W5();
        ViewGroup.LayoutParams layoutParams = ((PlayCardFeedCellV2) aUListenerS76S0110000_7.l0).W5().getLayoutParams();
        layoutParams.width = iIntValue;
        C786410Ut5.d6(linearLayoutW5, layoutParams);
    }

    public static final void onAnimationUpdate$2(AUListenerS76S0110000_7 aUListenerS76S0110000_7, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (aUListenerS76S0110000_7.z1) {
            ((PlayCardFeedCellV2) aUListenerS76S0110000_7.l0).q6(iIntValue);
            return;
        }
        LinearLayout linearLayoutW5 = ((PlayCardFeedCellV2) aUListenerS76S0110000_7.l0).W5();
        ViewGroup.LayoutParams layoutParams = ((PlayCardFeedCellV2) aUListenerS76S0110000_7.l0).W5().getLayoutParams();
        layoutParams.width = iIntValue;
        C786410Ut5.d6(linearLayoutW5, layoutParams);
    }

    public AUListenerS76S0110000_7(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
