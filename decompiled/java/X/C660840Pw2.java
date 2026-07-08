package X;

import Y.AUListenerS260S0100000_10;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Pw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660840Pw2 extends ConstraintLayout {
    public final AlphaAnimation LL;
    public final C0Q0P LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final TuxIconView LLILZLL;
    public final TuxIconView LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final ValueAnimator LLJ;
    public Function0<Unit> LLJI;

    public final boolean e0() {
        CharSequence text = this.LLIZLLLIL.getText();
        return !(text == null || text.length() == 0);
    }

    public final int getMeasureWidthWhenPlay() {
        if (((Number) C07BW.LIZ.getValue()).intValue() == 0) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.LLILZLL.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.LLILLJJLI.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.LLIZ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        ViewGroup.LayoutParams layoutParams = this.LLILZLL.getLayoutParams();
        int marginStart = (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0) + this.LLILZLL.getMeasuredWidth() + this.LLILLJJLI.getMeasuredWidth() + this.LLIZ.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams2 = this.LLIZ.getLayoutParams();
        int marginEnd = marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0) + getPaddingStart() + getPaddingEnd();
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        int marginStart2 = marginEnd + (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart() : 0);
        ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
        return marginStart2 + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd() : 0);
    }

    public final int getSecondLineCurrentHeight() {
        if (this.LLIZLLLIL.getVisibility() == 0) {
            return this.LLIZLLLIL.getHeight();
        }
        return 0;
    }

    public final int getCurrentTotalHeight() {
        return this.LLILLL + getSecondLineCurrentHeight() + getPaddingTop() + getPaddingBottom();
    }

    public final TuxIconView getArrowView() {
        return this.LLIZ;
    }

    public final TuxIconView getPoiIconView() {
        return this.LLILZLL;
    }

    public final TuxTextView getSecondLineTextView() {
        return this.LLIZLLLIL;
    }

    public final void setOnHeightChangeListener(Function0<Unit> function0) {
        this.LLJI = function0;
    }

    public C660840Pw2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.y2);
    }

    public C660840Pw2(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        int iIntValue2;
        super(context, attributeSet, i);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200L);
        this.LL = alphaAnimation;
        C0Q0P c0q0p = new C0Q0P(context, null, 6);
        c0q0p.setId(R.id.u6t);
        c0q0p.setScrollingSpeedPxPerSecond(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        c0q0p.setMarqueeRepeatLimit(1);
        this.LLILLJJLI = c0q0p;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLILLL = iLIZIZ;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLILZ = iLIZIZ2;
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LLILZIL = iLIZIZ3;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setId(R.id.u6v);
        tuxIconView.setIconRes(R.raw.icon_map_thumbtack_fill);
        tuxIconView.setIconWidth(iLIZIZ3);
        tuxIconView.setIconHeight(iLIZIZ3);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = R.attr.zi;
        }
        tuxIconView.setTintColor(iIntValue);
        this.LLILZLL = tuxIconView;
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        tuxIconView2.setId(R.id.u6s);
        tuxIconView2.setIconRes(R.raw.icon_chevron_right_ltr);
        tuxIconView2.setIconWidth(iLIZIZ3);
        tuxIconView2.setIconHeight(iLIZIZ3);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zi, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = R.attr.zi;
        }
        tuxIconView2.setTintColor(iIntValue2);
        this.LLIZ = tuxIconView2;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setLayoutDirection(2);
        tuxTextView.setMaxLines(1);
        tuxTextView.setSingleLine();
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(16);
        tuxTextView.setTuxFont(72);
        int i2 = R.attr.zl;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zl, context);
        tuxTextView.setTextColor(numLIZJ3 != null ? numLIZJ3.intValue() : i2);
        C0HXV.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), tuxTextView);
        tuxTextView.setHeight(iLIZIZ2);
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        this.LLIZLLLIL = tuxTextView;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 1);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator() { // from class: X.0Pw3
            @Override // android.view.animation.AccelerateInterpolator, android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float interpolation = super.getInterpolation(f);
                this.LIZ.getSecondLineTextView().setHeight((int) (this.LIZ.LLILZ * f));
                return interpolation;
            }
        });
        valueAnimatorOfInt.addUpdateListener(new AUListenerS260S0100000_10(this, 1));
        this.LLJ = valueAnimatorOfInt;
        setLayoutDirection(2);
        C19ME c19me = new C19ME(iLIZIZ3, iLIZIZ);
        c19me.startToStart = 0;
        c19me.endToStart = c0q0p.getId();
        c19me.horizontalChainStyle = 2;
        c19me.horizontalBias = 0.0f;
        addView(tuxIconView, c19me);
        C19ME c19me2 = new C19ME(-2, iLIZIZ);
        c19me2.startToEnd = tuxIconView.getId();
        c19me2.endToStart = tuxIconView2.getId();
        c19me2.constrainedWidth = true;
        c19me2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c19me2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        addView(c0q0p, c19me2);
        C19ME c19me3 = new C19ME(-2, iLIZIZ);
        c19me3.startToEnd = c0q0p.getId();
        c19me3.endToEnd = 0;
        c19me3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        addView(tuxIconView2, c19me3);
        C19ME c19me4 = new C19ME(-2, -2);
        c19me4.topToBottom = tuxIconView.getId();
        c19me4.startToEnd = tuxIconView.getId();
        c19me4.endToEnd = 0;
        c19me4.constrainedWidth = true;
        c19me4.horizontalBias = 0.0f;
        c19me4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c19me4.setMarginEnd(iLIZIZ3);
        addView(tuxTextView, c19me4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingStart;
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && (paddingStart = ((((i - getPaddingStart()) - getPaddingEnd()) - this.LLILZIL) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))) - this.LLILZIL) >= 0 && paddingStart > 0 && this.LLIZLLLIL.getMaxWidth() != paddingStart) {
            this.LLIZLLLIL.setMaxWidth(paddingStart);
        }
    }
}
