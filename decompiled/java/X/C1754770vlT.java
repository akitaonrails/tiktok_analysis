package X;

import Y.AUListenerS274S0100000_26;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0vlT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1754770vlT extends FrameLayout {
    public boolean LL;
    public final ValueAnimator LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public boolean LLILZIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILLJJLI.cancel();
    }

    public C1754770vlT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLILLJJLI = valueAnimatorOfFloat;
        this.LLILZIL = true;
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJ());
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS274S0100000_26(this, 21));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0vlU
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1754770vlT c1754770vlT = this.LL;
                c1754770vlT.LL = false;
                c1754770vlT.requestLayout();
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator, boolean z) {
                super.onAnimationStart(animator, z);
                this.LL.LL = true;
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LL) {
            if (this.LLILLL <= 0) {
                super.onMeasure(i, i2);
                this.LLILLL = getMeasuredHeight();
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (this.LLILLL * this.LLILZ), 1073741824));
            return;
        }
        if (this.LLILZIL) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            this.LLILLL = 0;
        } else {
            super.onMeasure(i, i2);
            this.LLILLL = 0;
        }
    }
}
