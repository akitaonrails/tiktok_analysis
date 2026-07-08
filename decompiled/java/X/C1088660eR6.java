package X;

import Y.ARunnableS117S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eR6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088660eR6 extends FrameLayout {
    public final C16F5 LL;
    public AnimatorSet LLILLJJLI;
    public ValueAnimator LLILLL;
    public ARunnableS117S0100000_17 LLILZ;
    public List<? extends View> LLILZIL;
    public Function0<Unit> LLILZLL;
    public Function0<Unit> LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public int LLJIJIL;
    public final int LLJILJIL;
    public boolean LLJILJILJ;

    public C1088660eR6(Context context) {
        Number numberValueOf;
        super(context);
        C16F5 c16f5 = new C16F5(context, null);
        this.LL = c16f5;
        this.LLILZIL = C13BV.INSTANCE;
        int iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.exm, context));
        setBackground(gradientDrawable);
        C497740JfY.LJIIIZ(R.dimen.atd);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(C20736316Cj.LIZIZ(R.attr.exe, context));
        c16f5.setBackground(gradientDrawable2);
        c16f5.setTextAppearance(R.style.rn);
        c16f5.setGravity(17);
        c16f5.setSingleLine(true);
        c16f5.setIncludeFontPadding(false);
        c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.fx1, context));
        c16f5.setMarqueeRepeatLimit(1);
        c16f5.setText(C497740JfY.LJIJI(2131832635));
        c16f5.setPadding(iLIZIZ, 0, iLIZIZ, 0);
        TextPaint paint = c16f5.getPaint();
        if (paint != null) {
            CharSequence text = c16f5.getText();
            numberValueOf = Float.valueOf(paint.measureText(text != null ? text.toString() : null));
        } else {
            numberValueOf = 0;
        }
        this.LLJILJIL = numberValueOf.intValue() + (iLIZIZ * 2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        addView(c16f5, layoutParams);
    }

    public final void LIZ(boolean z) {
        ViewGroup viewGroup;
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        this.LLJ = false;
        AnimatorSet animatorSet = this.LLILLJJLI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLILLJJLI = null;
        ValueAnimator valueAnimator = this.LLILLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLILLL = null;
        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = this.LLILZ;
        if (aRunnableS117S0100000_17 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS117S0100000_17);
        }
        this.LLILZ = null;
        Iterator<? extends View> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            C786410Ut5.T4(it2.next(), 1.0f);
        }
        ViewParent parent = getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this, viewGroup);
        }
        if (z) {
            Function0<Unit> function0 = this.LLIZ;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function0<Unit> function02 = this.LLILZLL;
            if (function02 != null) {
                function02.invoke();
            }
        }
        this.LLILZLL = null;
        this.LLIZ = null;
    }
}
