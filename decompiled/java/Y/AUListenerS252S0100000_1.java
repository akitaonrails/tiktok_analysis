package Y;

import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C936503lL;
import X.C953703o7;
import X.InterfaceC10458047c;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuHeaderReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;

/* JADX INFO: loaded from: classes2.dex */
public class AUListenerS252S0100000_1 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public AUListenerS252S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS252S0100000_1 aUListenerS252S0100000_1, ValueAnimator valueAnimator) {
        C786410Ut5.G5(((C936503lL) aUListenerS252S0100000_1.l0).LL, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$1(AUListenerS252S0100000_1 aUListenerS252S0100000_1, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.ed((View) aUListenerS252S0100000_1.l0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) * fFloatValue);
        C786410Ut5.T4((View) aUListenerS252S0100000_1.l0, 1.0f - fFloatValue);
    }

    public static final void onAnimationUpdate$2(AUListenerS252S0100000_1 aUListenerS252S0100000_1, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C936503lL c936503lL = (C936503lL) aUListenerS252S0100000_1.l0;
        int i = c936503lL.LLIZ;
        int i2 = (int) (fFloatValue * i);
        TuxIconView tuxIconView = c936503lL.LLILZ;
        tuxIconView.setPadding(tuxIconView.getPaddingLeft(), i2, ((C936503lL) aUListenerS252S0100000_1.l0).LLILZ.getPaddingRight(), i - i2);
    }

    public static final void onAnimationUpdate$3(AUListenerS252S0100000_1 aUListenerS252S0100000_1, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object obj = (InterfaceC10458047c) aUListenerS252S0100000_1.l0;
        TuxTextView tuxTextView = ((SkuHeaderReusedAssem) obj).LLJLILLLLZIIL;
        if (tuxTextView != null) {
            C953703o7.LIZ(tuxTextView, ((SkuPanelBaseReusedAssem) obj).getViewModel().LLJLIL);
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        TuxTextView tuxTextView2 = ((SkuHeaderReusedAssem) ((InterfaceC10458047c) aUListenerS252S0100000_1.l0)).LLJLILLLLZIIL;
        if (tuxTextView2 != null) {
            C786410Ut5.wd(tuxTextView2, fFloatValue);
        }
        TuxTextView tuxTextView3 = ((SkuHeaderReusedAssem) ((InterfaceC10458047c) aUListenerS252S0100000_1.l0)).LLJLILLLLZIIL;
        if (tuxTextView3 != null) {
            C786410Ut5.B5(tuxTextView3, 1 - (fFloatValue / C418440Gaw.LIZIZ(4)));
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS252S0100000_1 aUListenerS252S0100000_1, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            View view = (View) aUListenerS252S0100000_1.l0;
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))));
            }
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }
}
