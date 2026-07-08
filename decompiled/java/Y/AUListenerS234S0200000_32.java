package Y;

import X.AnonymousClass1862;
import X.AnonymousClass1865;
import X.C013C;
import X.C1295960jpS;
import X.C184Q;
import X.C184R;
import X.C184S;
import X.C185I;
import X.C18YV;
import X.C196Y;
import X.C212381189j;
import X.C21334118eJ;
import X.C21373018ka;
import X.C21373118kb;
import X.C21373318kd;
import X.C21373418ke;
import X.C473410IhP;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.broadcast.interaction.widget.BroadcastSLRDiamondsWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AUListenerS234S0200000_32 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.hc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        ((C21373318kd) aUListenerS234S0200000_32.l1).invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.hc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        ((C21373318kd) aUListenerS234S0200000_32.l1).invalidate();
    }

    public static final void onAnimationUpdate$10(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        String str = null;
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        AnonymousClass1862 anonymousClass1862 = (AnonymousClass1862) aUListenerS234S0200000_32.l0;
        TuxTextView tuxTextView = anonymousClass1862.LJIIIIZZ;
        if (tuxTextView != null) {
            List list = (List) aUListenerS234S0200000_32.l1;
            AnonymousClass1865 anonymousClass1865LJIIL = anonymousClass1862.LJIIL();
            C185I c185i = anonymousClass1862.LJIIJJI;
            if (c185i != null) {
                str = c185i.LIZLLL;
            }
            anonymousClass1865LJIIL.LJIIL(tuxTextView, str, (String) ListProtector.get(list, iIntValue), null, anonymousClass1862.LIZJ);
        }
    }

    public static final void onAnimationUpdate$11(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        String str = null;
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C184R c184r = (C184R) aUListenerS234S0200000_32.l0;
        TuxTextView tuxTextView = c184r.LJIIJJI;
        if (tuxTextView != null) {
            List list = (List) aUListenerS234S0200000_32.l1;
            C184Q c184qLJIIL = c184r.LJIIL();
            C184S c184s = c184r.LJIILJJIL;
            if (c184s != null) {
                str = c184s.LIZJ;
            }
            c184qLJIIL.LJIIJJI(tuxTextView, str, (String) ListProtector.get(list, iIntValue), null, c184r.LIZLLL);
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        ((C21334118eJ) aUListenerS234S0200000_32.l0).LIZ.LJIILIIL(valueAnimator.getAnimatedValue(), (String) ((Map.Entry) aUListenerS234S0200000_32.l1).getKey());
    }

    public static final void onAnimationUpdate$13(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        ((C21373418ke) aUListenerS234S0200000_32.l1).invalidate();
    }

    public static final void onAnimationUpdate$14(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        ((C21373418ke) aUListenerS234S0200000_32.l1).invalidate();
    }

    public static final void onAnimationUpdate$15(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        ((C18YV) aUListenerS234S0200000_32.l0).LIZ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((View) aUListenerS234S0200000_32.l1).invalidateOutline();
    }

    public static final void onAnimationUpdate$2(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.B5(((C196Y) aUListenerS234S0200000_32.l0).S3(), fFloatValue);
        C786410Ut5.X4(((C196Y) aUListenerS234S0200000_32.l0).LLJJLIIIJLLLLLLLZ(), fFloatValue);
        Function1 function1 = (Function1) aUListenerS234S0200000_32.l1;
        if (function1 != null) {
            function1.invoke(Float.valueOf(valueAnimator.getAnimatedFraction()));
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        ((C21373018ka) aUListenerS234S0200000_32.l1).invalidate();
    }

    public static final void onAnimationUpdate$4(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        ((C21373018ka) aUListenerS234S0200000_32.l1).invalidate();
    }

    public static final void onAnimationUpdate$5(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.hc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        ((C21373118kb) aUListenerS234S0200000_32.l1).invalidate();
    }

    public static final void onAnimationUpdate$6(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.hc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS234S0200000_32.l0, fFloatValue);
        ((C21373118kb) aUListenerS234S0200000_32.l1).invalidate();
    }

    public static final void onAnimationUpdate$7(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        try {
            Point point = (Point) ((ValueAnimator) aUListenerS234S0200000_32.l0).getAnimatedValue();
            C1295960jpS c1295960jpS = ((BroadcastSLRDiamondsWidget) aUListenerS234S0200000_32.l1).LLILLL;
            ViewGroup.LayoutParams layoutParams = null;
            if (c1295960jpS != null) {
                layoutParams = c1295960jpS.getLayoutParams();
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                BroadcastSLRDiamondsWidget broadcastSLRDiamondsWidget = (BroadcastSLRDiamondsWidget) aUListenerS234S0200000_32.l1;
                marginLayoutParams.topMargin = point.y;
                BroadcastSLRDiamondsWidget.y1(point.x, broadcastSLRDiamondsWidget.LLILLL);
            }
            C1295960jpS c1295960jpS2 = ((BroadcastSLRDiamondsWidget) aUListenerS234S0200000_32.l1).LLILLL;
            if (c1295960jpS2 != null) {
                c1295960jpS2.requestLayout();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() > 0.0f) {
            C013C c013c = (C013C) aUListenerS234S0200000_32.l0;
            if (c013c.element) {
                c013c.element = false;
                C473410IhP.LIZJ(new ARunnableS132S0100000_32((BroadcastSLRDiamondsWidget) aUListenerS234S0200000_32.l1, 59), 960L);
            }
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS234S0200000_32 aUListenerS234S0200000_32, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = ((ValueAnimator) aUListenerS234S0200000_32.l0).getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C212381189j c212381189j = (C212381189j) aUListenerS234S0200000_32.l1;
            float fFloatValue = f.floatValue();
            C786410Ut5.Nc(c212381189j.getClShareContainerFromXml(), c212381189j.getTransX() * fFloatValue);
            C786410Ut5.jd(c212381189j.getClShareContainerFromXml(), c212381189j.getTransY() * fFloatValue);
            float f2 = 1;
            C786410Ut5.Ub(c212381189j.getClShareContainerFromXml(), c212381189j.getExpectScaleX() - ((c212381189j.getExpectScaleX() - f2) * fFloatValue));
            C786410Ut5.uc(c212381189j.getClShareContainerFromXml(), c212381189j.getExpectScaleY() - ((c212381189j.getExpectScaleY() - f2) * fFloatValue));
        }
    }

    public AUListenerS234S0200000_32(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
