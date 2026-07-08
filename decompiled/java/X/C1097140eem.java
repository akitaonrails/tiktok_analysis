package X;

import Y.AUListenerS266S0100000_17;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;

/* JADX INFO: renamed from: X.0eem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097140eem extends C21538719Qz {
    public int LLILZIL;
    public final ValueAnimator LLILZLL;
    public final ObjectAnimator LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZLL.cancel();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.LLJI = true;
    }

    public final boolean getHeightAnimationEnabled() {
        return this.LLIZLLLIL;
    }

    public final void LIZIZ(int i) {
        this.LLJ = i;
        this.LLILZLL.cancel();
        if (this.LLIZLLLIL) {
            this.LLILZLL.setIntValues(this.LLILZIL, this.LLJ);
            this.LLILZLL.start();
        }
    }

    public final void setHeightAnimationEnabled(boolean z) {
        if (this.LLIZLLLIL != z) {
            this.LLIZLLLIL = z;
            this.LLILZLL.cancel();
            requestLayout();
        }
    }

    public C1097140eem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(230L);
        valueAnimator.addUpdateListener(new AUListenerS266S0100000_17(this, 9));
        this.LLILZLL = valueAnimator;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe(FrameLayout.ALPHA, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.6969697f, 0.3f), Keyframe.ofFloat(1.0f, 1.0f)));
        objectAnimatorOfPropertyValuesHolder.setDuration(330L);
        this.LLIZ = objectAnimatorOfPropertyValuesHolder;
        this.LLIZLLLIL = true;
        this.LLJIJIL = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLJI) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight();
            if (this.LLJ != measuredHeight && this.LLJIJIL) {
                LIZIZ(measuredHeight);
            }
        }
        if (this.LLIZLLLIL) {
            if (!this.LLILZLL.isRunning()) {
                super.onMeasure(i, i2);
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            } else {
                setMeasuredDimension(getMeasuredWidth(), this.LLILZIL);
                return;
            }
        }
        if (!this.LLILZLL.isRunning()) {
            super.onMeasure(i, i2);
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            this.LLILZIL = this.LLJ;
            setMeasuredDimension(getMeasuredWidth(), this.LLJ);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zLJI = MethodIDManager.LJI(202260);
        super.onLayout(z, i, i2, i3, i4);
        this.LLJI = false;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
