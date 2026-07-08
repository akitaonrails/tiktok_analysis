package Y;

import X.C1439600nZ8;
import X.C19383110sP;
import X.C19383310sR;
import X.C19713012Au;
import X.C377070EqP;
import X.C817403Hg;
import X.InterfaceC19383210sQ;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public class AUListenerS157S0300000_29 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS157S0300000_29 aUListenerS157S0300000_29, ValueAnimator valueAnimator) {
        int marginStart;
        boolean z;
        TuxTextView tuxTextView;
        int marginStart2;
        ((C19713012Au) aUListenerS157S0300000_29.l0).B0((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
        float x = ((C19713012Au) aUListenerS157S0300000_29.l0).getBgView().getX();
        ViewGroup.LayoutParams layoutParams = ((C19713012Au) aUListenerS157S0300000_29.l0).getTvTitle().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        float x2 = (x + marginStart) - ((C19713012Au) aUListenerS157S0300000_29.l0).getTvTitle().getX();
        C817403Hg c817403Hg = (C817403Hg) aUListenerS157S0300000_29.l1;
        if (x2 == c817403Hg.element) {
            z = true;
        } else {
            z = false;
        }
        if (!z && x2 >= 0.0f) {
            c817403Hg.element = x2;
            C19713012Au.s0(((C19713012Au) aUListenerS157S0300000_29.l0).getTvTitle(), Math.min(((C817403Hg) aUListenerS157S0300000_29.l1).element, ((C19713012Au) aUListenerS157S0300000_29.l0).getTvTitle().getWidth()), R.attr.zi);
            ((C19713012Au) aUListenerS157S0300000_29.l0).getTvTitle().invalidate();
        }
        TextSwitcher textSwitcher = ((C19713012Au) aUListenerS157S0300000_29.l0).LLJ;
        View currentView = null;
        if (textSwitcher != null) {
            currentView = textSwitcher.getCurrentView();
        }
        if ((currentView instanceof TuxTextView) && (tuxTextView = (TuxTextView) currentView) != null) {
            C19713012Au c19713012Au = (C19713012Au) aUListenerS157S0300000_29.l0;
            C817403Hg c817403Hg2 = (C817403Hg) aUListenerS157S0300000_29.l2;
            float x3 = c19713012Au.getBgView().getX();
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
            } else {
                marginStart2 = 0;
            }
            float x4 = (x3 + marginStart2) - tuxTextView.getX();
            if (x4 != c817403Hg2.element && x4 >= 0.0f) {
                c817403Hg2.element = x4;
                C19713012Au.s0(tuxTextView, Math.min(x4, tuxTextView.getWidth()), R.attr.zl);
                tuxTextView.invalidate();
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS157S0300000_29 aUListenerS157S0300000_29, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float width = (((C377070EqP) aUListenerS157S0300000_29.l0).getWidth() / 2.0f) * animatedFraction;
        float height = ((((C377070EqP) aUListenerS157S0300000_29.l0).getHeight() - ((C377070EqP) aUListenerS157S0300000_29.l0).getWidth()) / 2.0f) * animatedFraction;
        if (animatedFraction >= C19383310sR.LIZ().ratio) {
            C1439600nZ8 c1439600nZ8 = (C1439600nZ8) aUListenerS157S0300000_29.l1;
            if (!c1439600nZ8.LJI) {
                c1439600nZ8.LJI = true;
                ((Function0) aUListenerS157S0300000_29.l2).invoke();
            }
        }
        ((C377070EqP) aUListenerS157S0300000_29.l0).setRenderRadius(width);
        C377070EqP c377070EqP = (C377070EqP) aUListenerS157S0300000_29.l0;
        float[] fArr = c377070EqP.LLILLL;
        fArr[0] = 0.0f;
        fArr[1] = height;
        fArr[2] = 0.0f;
        fArr[3] = height;
        c377070EqP.invalidate();
        Iterator it2 = new ArrayList(C19383110sP.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC19383210sQ) it2.next()).LIZIZ();
        }
    }

    public AUListenerS157S0300000_29(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
