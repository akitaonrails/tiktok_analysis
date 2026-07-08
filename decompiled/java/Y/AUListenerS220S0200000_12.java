package Y;

import X.C098200Yq;
import X.C0T89;
import X.C0U3I;
import X.C1324720kZq;
import X.C189200o6;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C746320TPi;
import X.C752230Tf3;
import X.C786410Ut5;
import X.C817403Hg;
import X.EnumC744950TKb;
import X.EnumC744970TKd;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.android.live.effect.karaoke.KaraokeHoverWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.adapter.widget.realtimecomment.PreviewRealTimeCommentWidget;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public class AUListenerS220S0200000_12 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS220S0200000_12 aUListenerS220S0200000_12, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            num = (Integer) animatedValue;
        } else {
            num = null;
        }
        if (((View) aUListenerS220S0200000_12.l0) != null && num != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aUListenerS220S0200000_12.l1;
            if (layoutParams != null) {
                layoutParams.bottomMargin = num.intValue();
            }
            C786410Ut5.W5((View) aUListenerS220S0200000_12.l0, (RelativeLayout.LayoutParams) aUListenerS220S0200000_12.l1);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS220S0200000_12 aUListenerS220S0200000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.T4((View) aUListenerS220S0200000_12.l0, fFloatValue);
        C786410Ut5.B5((TuxTextView) aUListenerS220S0200000_12.l1, fFloatValue);
    }

    public static final void onAnimationUpdate$2(AUListenerS220S0200000_12 aUListenerS220S0200000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (((EnumC744970TKd) aUListenerS220S0200000_12.l0) != EnumC744970TKd.LLILZLL) {
            float f = r1.LLJJJJJIL * (1 - fFloatValue);
            View view = ((PreviewRealTimeCommentWidget) aUListenerS220S0200000_12.l1).getView();
            if (view != null) {
                C500260Jjc.LJJZ((int) f, view);
            }
        }
        View view2 = ((PreviewRealTimeCommentWidget) aUListenerS220S0200000_12.l1).getView();
        if (view2 != null) {
            C786410Ut5.T4(view2, 1 - fFloatValue);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS220S0200000_12 aUListenerS220S0200000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (((EnumC744950TKb) aUListenerS220S0200000_12.l0) != EnumC744950TKb.LL) {
            float f = r1.LLJJJJJIL * fFloatValue;
            View view = ((PreviewRealTimeCommentWidget) aUListenerS220S0200000_12.l1).getView();
            if (view != null) {
                C500260Jjc.LJJZ((int) f, view);
            }
        }
        View view2 = ((PreviewRealTimeCommentWidget) aUListenerS220S0200000_12.l1).getView();
        if (view2 != null) {
            C786410Ut5.T4(view2, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS220S0200000_12 aUListenerS220S0200000_12, ValueAnimator valueAnimator) {
        float fSignum;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fSignum = f.floatValue();
        } else {
            fSignum = 0.0f;
        }
        if (Math.abs(fSignum) >= 0.5d) {
            fSignum = Math.signum(fSignum) - fSignum;
        }
        float fLIZIZ = ((int) C497740JfY.LIZIZ(60.0f)) * fSignum;
        C786410Ut5.md((C1324720kZq) aUListenerS220S0200000_12.l0, fLIZIZ);
        C0U3I c0u3i = ((KaraokeHoverWidget) aUListenerS220S0200000_12.l1).LLILLJJLI;
        if (c0u3i != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0u3i);
            c0u3i.setTranslationY(fLIZIZ);
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS220S0200000_12 aUListenerS220S0200000_12, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aUListenerS220S0200000_12.l0;
        layoutParams.height = iIntValue;
        C0T89 c0t89 = (C0T89) aUListenerS220S0200000_12.l1;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0t89);
        c0t89.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$6(AUListenerS220S0200000_12 aUListenerS220S0200000_12, ValueAnimator valueAnimator) {
        Float f;
        Integer numValueOf;
        CharSequence text;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Float fValueOf = null;
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C746320TPi c746320TPi = (C746320TPi) aUListenerS220S0200000_12.l0;
            TuxTextView tuxTextView = c746320TPi.LLILZLL;
            if (tuxTextView != null) {
                ValueAnimator valueAnimator2 = (ValueAnimator) aUListenerS220S0200000_12.l1;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("zoomOutAnimation holder:");
                sbLIZ.append(valueAnimator2.hashCode());
                sbLIZ.append(", textView: ");
                TuxTextView tuxTextView2 = c746320TPi.LLILZLL;
                if (tuxTextView2 != null) {
                    numValueOf = Integer.valueOf(tuxTextView2.hashCode());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(", text: ");
                TuxTextView tuxTextView3 = c746320TPi.LLILZLL;
                if (tuxTextView3 != null) {
                    text = tuxTextView3.getText();
                } else {
                    text = null;
                }
                sbLIZ.append((Object) text);
                sbLIZ.append(", preScale:");
                TuxTextView tuxTextView4 = c746320TPi.LLILZLL;
                if (tuxTextView4 != null) {
                    fValueOf = Float.valueOf(tuxTextView4.getScaleX());
                }
                sbLIZ.append(fValueOf);
                sbLIZ.append(", new: ");
                sbLIZ.append(fFloatValue);
                C2188811AlT.LIZIZ(sbLIZ);
                C786410Ut5.ic(tuxTextView, fFloatValue);
                C786410Ut5.Dc(tuxTextView, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS220S0200000_12 aUListenerS220S0200000_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = fFloatValue - ((C817403Hg) aUListenerS220S0200000_12.l0).element;
        VerticalViewPager verticalViewPager = (VerticalViewPager) aUListenerS220S0200000_12.l1;
        if (verticalViewPager.LLLLIILLL) {
            verticalViewPager.LLLLZIL(f * C418440Gaw.LIZIZ(54));
        }
        ((C817403Hg) aUListenerS220S0200000_12.l0).element = fFloatValue;
    }

    public static final void onAnimationUpdate$8(AUListenerS220S0200000_12 aUListenerS220S0200000_12, ValueAnimator valueAnimator) {
        float measuredWidth;
        View view = (View) aUListenerS220S0200000_12.l0;
        C752230Tf3 c752230Tf3 = (C752230Tf3) aUListenerS220S0200000_12.l1;
        try {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (view != null) {
                if (!c752230Tf3.LLILZIL) {
                    fFloatValue = 1.8f - fFloatValue;
                }
                C786410Ut5.Ob(view, fFloatValue);
                if (!C497740JfY.LJJ()) {
                    measuredWidth = 0.0f;
                } else {
                    measuredWidth = view.getMeasuredWidth();
                }
                view.setPivotX(measuredWidth);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS220S0200000_12 aUListenerS220S0200000_12, ValueAnimator valueAnimator) {
        View view = (View) aUListenerS220S0200000_12.l0;
        C752230Tf3 c752230Tf3 = (C752230Tf3) aUListenerS220S0200000_12.l1;
        try {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (view != null) {
                if (!c752230Tf3.LLILZIL) {
                    fFloatValue = 1.0f - fFloatValue;
                }
                C786410Ut5.T4(view, fFloatValue);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public AUListenerS220S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
