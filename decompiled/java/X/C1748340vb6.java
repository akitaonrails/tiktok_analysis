package X;

import Y.ALAdapterS21S0100000_26;
import Y.AUListenerS274S0100000_26;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0vb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748340vb6 extends LinearLayout {
    public float LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final ValueAnimator LLIZ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLIZ.cancel();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.LLILZIL;
    }

    public final void setAnimationDuration(long j) {
        this.LLIZ.setDuration(j);
    }

    public final void setAnimationInterpolator(Interpolator interpolator) {
        this.LLIZ.setInterpolator(interpolator);
    }

    public final void setFadeInOut(boolean z) {
        if (this.LLIZ.isRunning()) {
            this.LLIZ.end();
        }
        this.LLILZLL = z;
        if (!z) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(1.0f);
        }
    }

    public final void setHasOverlappingRendering(boolean z) {
        this.LLILZIL = z;
    }

    public C1748340vb6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = true;
        this.LLILZIL = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS274S0100000_26(this, 22));
        valueAnimatorOfFloat.addListener(new ALAdapterS21S0100000_26(this, 12));
        this.LLIZ = valueAnimatorOfFloat;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLILLL) {
            if (this.LLILLJJLI <= 0) {
                super.onMeasure(i, i2);
                this.LLILLJJLI = getMeasuredHeight();
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (this.LLILLJJLI * this.LL), 1073741824));
            return;
        }
        if (this.LLILZ) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            this.LLILLJJLI = 0;
        } else {
            super.onMeasure(i, i2);
            this.LLILLJJLI = 0;
        }
    }
}
