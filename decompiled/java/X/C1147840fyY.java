package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147840fyY extends ConstraintLayout {
    public static final /* synthetic */ int LLJJI = 0;
    public final TextPaint LL;
    public final float LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public final TextSwitcher LLILZIL;
    public final LiveIconView LLILZLL;
    public TranslateAnimation LLIZ;
    public TranslateAnimation LLIZLLLIL;
    public TranslateAnimation LLJ;
    public TranslateAnimation LLJI;
    public ObjectAnimator LLJIJIL;
    public ObjectAnimator LLJILJIL;
    public final float LLJILJILJ;
    public final boolean LLJILLL;
    public int LLJJ;

    public final void e0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f = (this.LLILZ / 2) + (this.LLILLL / 2);
        ViewGroup.LayoutParams layoutParams = this.LLILZLL.getLayoutParams();
        if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.setMarginStart(((int) f) + ((int) C497740JfY.LIZIZ(this.LLJILJILJ)));
        C786410Ut5.w6(this.LLILZLL, marginLayoutParams);
    }

    public static TranslateAnimation h0(int i) {
        if (i == 1) {
            return new TranslateAnimation(0, 0.0f, 0, 0.0f, 2, 1.0f, 0, 0.0f);
        }
        return new TranslateAnimation(0, 0.0f, 0, 0.0f, 2, -1.0f, 0, 0.0f);
    }

    public static TranslateAnimation i0(int i) {
        if (i == 1) {
            return new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, 0.0f, 2, -1.0f);
        }
        return new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, 0.0f, 2, 1.0f);
    }

    public final void n0(int i) {
        if (i == 1) {
            this.LLILZIL.setInAnimation(this.LLIZ);
            this.LLILZIL.setOutAnimation(this.LLIZLLLIL);
            C786410Ut5.Db(this.LLILZLL, 0.0f);
        } else {
            this.LLILZIL.setInAnimation(this.LLJ);
            this.LLILZIL.setOutAnimation(this.LLJI);
            C786410Ut5.Db(this.LLILZLL, 180.0f);
        }
    }

    public C1147840fyY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void j0(float f, String str) {
        this.LLILZIL.setCurrentText(str);
        TextPaint textPaint = this.LL;
        if (f == 0.0f) {
            f = this.LLILLJJLI;
        }
        textPaint.setTextSize(f);
        this.LLILLL = this.LL.measureText(str);
    }

    public C1147840fyY(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new TextPaint();
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C2268791DrB c2268791DrB = new C2268791DrB(0.76f, 0.0f, 0.24f, 1.0f);
        this.LLJILJILJ = 4.0f;
        this.LLJILLL = true;
        this.LLJJ = 1;
        ViewGroup.inflate(context, R.layout.g2y, this);
        C786410Ut5.LLLIIL(this, 0);
        TextSwitcher textSwitcher = (TextSwitcher) findViewById(R.id.xqx);
        this.LLILZIL = textSwitcher;
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.k55);
        this.LLILZLL = liveIconView;
        this.LLIZ = h0(1);
        this.LLIZLLLIL = i0(1);
        TranslateAnimation translateAnimation = this.LLIZ;
        if (translateAnimation != null) {
            translateAnimation.setDuration(700L);
        }
        TranslateAnimation translateAnimation2 = this.LLIZLLLIL;
        if (translateAnimation2 != null) {
            translateAnimation2.setDuration(700L);
        }
        TranslateAnimation translateAnimation3 = this.LLIZ;
        if (translateAnimation3 != null) {
            translateAnimation3.setAnimationListener(new AnimationAnimationListenerC1151570g4Z(this, 9));
        }
        this.LLJ = h0(2);
        this.LLJI = i0(2);
        TranslateAnimation translateAnimation4 = this.LLJ;
        if (translateAnimation4 != null) {
            translateAnimation4.setDuration(700L);
        }
        TranslateAnimation translateAnimation5 = this.LLJ;
        if (translateAnimation5 != null) {
            translateAnimation5.setInterpolator(c2268791DrB);
        }
        TranslateAnimation translateAnimation6 = this.LLJI;
        if (translateAnimation6 != null) {
            translateAnimation6.setDuration(700L);
        }
        TranslateAnimation translateAnimation7 = this.LLJI;
        if (translateAnimation7 != null) {
            translateAnimation7.setInterpolator(c2268791DrB);
        }
        TranslateAnimation translateAnimation8 = this.LLJ;
        if (translateAnimation8 != null) {
            translateAnimation8.setAnimationListener(new AnimationAnimationListenerC1151570g4Z(this, 8));
        }
        this.LLJIJIL = ObjectAnimator.ofFloat(liveIconView, (Property<LiveIconView, Float>) View.ALPHA, 0.0f, 1.0f);
        this.LLJILJIL = ObjectAnimator.ofFloat(liveIconView, (Property<LiveIconView, Float>) View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator objectAnimator = this.LLJIJIL;
        if (objectAnimator != null) {
            objectAnimator.setDuration(700L);
        }
        ObjectAnimator objectAnimator2 = this.LLJILJIL;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(700L);
        }
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: X.0eVc
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                C1147840fyY c1147840fyY = this.LIZ;
                Context context2 = context;
                c1147840fyY.getClass();
                C16F5 c16f5 = new C16F5(context2, null);
                c16f5.setEllipsize(TextUtils.TruncateAt.END);
                c16f5.setGravity(17);
                c16f5.setTextAlignment(4);
                c16f5.setMaxLines(1);
                c16f5.setSingleLine();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ezt, context2);
                c16f5.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
                c16f5.setTextSize(1, 12.0f);
                c16f5.LJJJI(R.style.rn);
                c16f5.setIncludeFontPadding(false);
                return c16f5;
            }
        });
        n0(this.LLJJ);
        C786410Ut5.x3(getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1151700g4m(this, 6));
    }

    public final void l0(float f, String str, int i) {
        if (this.LLJJ != i) {
            this.LLJJ = i;
            n0(i);
        }
        this.LLILZIL.setText(str);
        TextPaint textPaint = this.LL;
        if (f == 0.0f) {
            f = this.LLILLJJLI;
        }
        textPaint.setTextSize(f);
        this.LLILLL = this.LL.measureText(str);
        e0();
    }
}
