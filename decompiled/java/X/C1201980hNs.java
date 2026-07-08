package X;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.0hNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201980hNs extends ValueAnimator implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public final ValueAnimator LL;
    public boolean LLILLJJLI;
    public final /* synthetic */ C19HL LLILLL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        this.LL.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.LLILLJJLI) {
            C19HL c19hl = this.LLILLL;
            c19hl.LLILZ = 0.0f;
            c19hl.LLILZLL = 0.0f;
            InterfaceC1182630gsf interfaceC1182630gsf = c19hl.LLJILJIL;
            if (interfaceC1182630gsf != null) {
                interfaceC1182630gsf.yt(1.0f);
            }
            this.LLILLL.invalidate();
            this.LLILLL.LJIILIIL();
        }
        this.LLILLJJLI = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.LLILLJJLI = true;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.LLILLJJLI) {
            this.LLILLL.LLILZ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C19HL c19hl = this.LLILLL;
            c19hl.LLILZIL = c19hl.LLILZ;
        }
    }

    public C1201980hNs(C19HL c19hl, float f) {
        this.LLILLL = c19hl;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        this.LL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addListener(this);
        valueAnimatorOfFloat.addUpdateListener(this);
    }
}
