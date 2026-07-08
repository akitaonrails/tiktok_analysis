package X;

import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0eVQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091340eVQ extends FrameLayout {
    public boolean LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public long LLIZLLLIL;
    public final ValueAnimator LLJ;
    public final ValueAnimator LLJI;

    public final void LJ() {
        if (this.LLILZLL) {
            this.LLILZLL = false;
            clearAnimation();
            if (this.LLIZ) {
                startAnimation(LIZIZ(false));
            } else {
                LIZLLL(0);
                LIZJ(0);
            }
        }
    }

    public final void LJFF() {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        clearAnimation();
        if (this.LLIZ) {
            startAnimation(LIZIZ(true));
        } else {
            requestLayout();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.LL = true;
    }

    public final long getAnimationDuration() {
        return this.LLIZLLLIL;
    }

    public final boolean getEnableScaleAnimationV2() {
        return this.LLIZ;
    }

    public final Animation LIZIZ(boolean z) {
        float f;
        float f2;
        AlphaAnimation alphaAnimation;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
            f2 = 0.0f;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.0f, 1, 1.0f);
        if (z) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        } else {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(this.LLIZLLLIL);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public final void LIZJ(int i) {
        this.LLILZ = i;
        this.LLJ.cancel();
        this.LLJ.setIntValues(this.LLILLJJLI, this.LLILZ);
        this.LLJ.start();
    }

    public final void LIZLLL(int i) {
        this.LLILZIL = i;
        this.LLJI.cancel();
        this.LLJI.setIntValues(this.LLILLL, this.LLILZIL);
        this.LLJI.start();
    }

    public final void setAnimationDuration(long j) {
        this.LLIZLLLIL = j;
        this.LLJ.setDuration(j);
        this.LLJI.setDuration(this.LLIZLLLIL);
    }

    public final void setEnableScaleAnimationV2(boolean z) {
        this.LLIZ = z;
    }

    public C1091340eVQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = 180L;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(this.LLIZLLLIL);
        valueAnimator.addUpdateListener(new AUListenerS266S0100000_17(this, 61));
        this.LLJ = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setDuration(this.LLIZLLLIL);
        valueAnimator2.addUpdateListener(new AUListenerS266S0100000_17(this, 62));
        this.LLJI = valueAnimator2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLIZ) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.LL) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight();
            int measuredWidth = getMeasuredWidth();
            if (measuredHeight != this.LLILZ && this.LLILZLL) {
                LIZJ(measuredHeight);
            }
            if (measuredWidth != this.LLILZIL && this.LLILZLL) {
                LIZLLL(measuredWidth);
            }
            setMeasuredDimension(this.LLILLL, this.LLILLJJLI);
            return;
        }
        if (this.LLJ.isRunning()) {
            setMeasuredDimension(this.LLILLL, this.LLILLJJLI);
            return;
        }
        int i3 = this.LLILLJJLI;
        if (i3 != 0 && this.LLILLL != 0) {
            super.onMeasure(i, i2);
            this.LLILLJJLI = getMeasuredHeight();
            int measuredWidth2 = getMeasuredWidth();
            this.LLILLL = measuredWidth2;
            this.LLILZ = this.LLILLJJLI;
            this.LLILZIL = measuredWidth2;
            return;
        }
        setMeasuredDimension(this.LLILLL, i3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.layout((getMeasuredWidth() - childAt.getMeasuredWidth()) / 2, getMeasuredHeight() - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
        this.LL = false;
    }
}
