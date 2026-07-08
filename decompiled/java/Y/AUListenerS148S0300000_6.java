package Y;

import X.AbstractC422350GhF;
import X.C0HD5;
import X.C1901500za8;
import X.C19ME;
import X.C384050F3z;
import X.C418860Gbc;
import X.C419180Gc8;
import X.C419220GcC;
import X.C422360GhG;
import X.C422370GhH;
import X.C422380GhI;
import X.C786410Ut5;
import X.InterfaceC422390GhJ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugListCardAssem;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS148S0300000_6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS148S0300000_6 aUListenerS148S0300000_6, ValueAnimator valueAnimator) {
        InterfaceC422390GhJ c422370GhH;
        AbstractC422350GhF abstractC422350GhF = (AbstractC422350GhF) aUListenerS148S0300000_6.l0;
        C422360GhG c422360GhG = (C422360GhG) aUListenerS148S0300000_6.l1;
        C422360GhG c422360GhG2 = (C422360GhG) aUListenerS148S0300000_6.l2;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        abstractC422350GhF.getClass();
        if (animatedFraction > 0.0f) {
            if (animatedFraction >= 1.0f) {
                c422360GhG = c422360GhG2;
            } else {
                float f = c422360GhG.LIZLLL;
                float f2 = f + ((c422360GhG2.LIZLLL - f) * animatedFraction);
                float f3 = c422360GhG.LIZJ;
                float f4 = f3 + ((c422360GhG2.LIZJ - f3) * animatedFraction);
                float f5 = c422360GhG.LIZIZ;
                float f6 = f5 + ((c422360GhG2.LIZIZ - f5) * animatedFraction);
                InterfaceC422390GhJ interfaceC422390GhJ = c422360GhG.LIZ;
                InterfaceC422390GhJ interfaceC422390GhJ2 = c422360GhG2.LIZ;
                boolean z = interfaceC422390GhJ instanceof C422380GhI;
                if (z && (interfaceC422390GhJ2 instanceof C422380GhI)) {
                    float f7 = ((C422380GhI) interfaceC422390GhJ).LIZ;
                    c422370GhH = new C422380GhI(f7 + ((((C422380GhI) interfaceC422390GhJ2).LIZ - f7) * animatedFraction));
                } else if (z && (interfaceC422390GhJ2 instanceof C422370GhH)) {
                    if (animatedFraction <= 0.5f) {
                        float f8 = ((C422380GhI) interfaceC422390GhJ).LIZ;
                        c422370GhH = new C422380GhI(f8 + ((0.0f - f8) * animatedFraction * 2));
                    } else {
                        c422370GhH = new C422370GhH((animatedFraction * 2) - 1.0f);
                    }
                } else if ((interfaceC422390GhJ instanceof C422370GhH) && (interfaceC422390GhJ2 instanceof C422380GhI)) {
                    if (animatedFraction <= 0.5f) {
                        c422370GhH = new C422370GhH(1 - (animatedFraction * 2));
                    } else {
                        c422370GhH = new C422380GhI(((((C422380GhI) interfaceC422390GhJ2).LIZ - 0.0f) * ((animatedFraction * 2) - 1.0f)) + 0.0f);
                    }
                } else {
                    c422370GhH = new C422370GhH(0);
                }
                c422360GhG = new C422360GhG(c422370GhH, f6, f4, f2);
            }
        }
        abstractC422350GhF.LIZ = c422360GhG;
        ((AbstractC422350GhF) aUListenerS148S0300000_6.l0).LIZJ();
        ((AbstractC422350GhF) aUListenerS148S0300000_6.l0).invalidateSelf();
    }

    public static final void onAnimationUpdate$1(AUListenerS148S0300000_6 aUListenerS148S0300000_6, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C1901500za8 c1901500za8 = (C1901500za8) aUListenerS148S0300000_6.l0;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aUListenerS148S0300000_6.l1;
            ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) aUListenerS148S0300000_6.l2;
            float fFloatValue = 1 - f.floatValue();
            if (((int) (c1901500za8.LIZJ() * fFloatValue)) > 0) {
                C786410Ut5.x5(c1901500za8.LIZIZ(), fFloatValue);
                layoutParams.width = (int) (c1901500za8.LIZJ() * fFloatValue);
                layoutParams2.width = c1901500za8.LIZJ();
                C786410Ut5.M6(c1901500za8.LIZIZ(), layoutParams2);
                C786410Ut5.W5(c1901500za8.LIZLLL(), layoutParams);
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS148S0300000_6 aUListenerS148S0300000_6, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C1901500za8 c1901500za8 = (C1901500za8) aUListenerS148S0300000_6.l0;
            C19ME c19me = (C19ME) aUListenerS148S0300000_6.l1;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aUListenerS148S0300000_6.l2;
            float fFloatValue = f.floatValue();
            int iLIZJ = (int) (c1901500za8.LIZJ() * fFloatValue);
            if (iLIZJ > 0) {
                C786410Ut5.x5(c1901500za8.LIZIZ(), fFloatValue);
                if (c19me != null) {
                    ((ViewGroup.MarginLayoutParams) c19me).width = iLIZJ;
                }
                layoutParams.width = c1901500za8.LIZJ();
                C786410Ut5.M6(c1901500za8.LIZIZ(), layoutParams);
                C786410Ut5.W5(c1901500za8.LIZLLL(), c19me);
                C786410Ut5.LJLLLLLL(0, c1901500za8.LIZLLL());
            }
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS148S0300000_6 aUListenerS148S0300000_6, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = (View) aUListenerS148S0300000_6.l0;
        C418860Gbc c418860Gbc = (C418860Gbc) aUListenerS148S0300000_6.l1;
        if (fFloatValue <= 0.5f) {
            float f = 2 * fFloatValue;
            float f2 = 1 - f;
            c418860Gbc.setScale(f2);
            if (f < 0.2f) {
                float f3 = f * 50.0f;
                C786410Ut5.ed(view, f3);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418860Gbc);
                c418860Gbc.setTranslationY(f3);
            } else if (0.2f <= f && f <= 0.5f) {
                float f4 = (0.4f - f) * 50.0f;
                C786410Ut5.ed(view, f4);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418860Gbc);
                c418860Gbc.setTranslationY(f4);
            } else if (0.5f <= f && f <= 0.8f) {
                float f5 = (f - 0.6f) * 50.0f;
                C786410Ut5.ed(view, f5);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418860Gbc);
                c418860Gbc.setTranslationY(f5);
            } else {
                float f6 = f2 * 50.0f;
                C786410Ut5.ed(view, f6);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418860Gbc);
                c418860Gbc.setTranslationY(f6);
            }
        } else {
            C786410Ut5.ed(view, 0.0f);
        }
        ((C419220GcC) aUListenerS148S0300000_6.l2).LIZ((View) aUListenerS148S0300000_6.l0, fFloatValue);
    }

    public static final void onAnimationUpdate$4(AUListenerS148S0300000_6 aUListenerS148S0300000_6, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = ((ValueAnimator) aUListenerS148S0300000_6.l0).getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            C419180Gc8 c419180Gc8 = (C419180Gc8) aUListenerS148S0300000_6.l1;
            Context context = (Context) aUListenerS148S0300000_6.l2;
            int iIntValue = num.intValue();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(iIntValue);
            c384050F3z.LIZJ = Float.valueOf(C0HD5.LIZIZ(c419180Gc8, Float.valueOf(4.0f)));
            c419180Gc8.setBackground(c384050F3z.LIZ(context));
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS148S0300000_6 aUListenerS148S0300000_6, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            TakoMiddlePageSugListCardAssem takoMiddlePageSugListCardAssem = (TakoMiddlePageSugListCardAssem) aUListenerS148S0300000_6.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS148S0300000_6.l1;
            takoMiddlePageSugListCardAssem.getClass();
            if (marginLayoutParams.topMargin != iIntValue) {
                marginLayoutParams.topMargin = iIntValue;
            }
            C786410Ut5.W5((View) aUListenerS148S0300000_6.l2, (ViewGroup.MarginLayoutParams) aUListenerS148S0300000_6.l1);
        }
    }

    public AUListenerS148S0300000_6(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
