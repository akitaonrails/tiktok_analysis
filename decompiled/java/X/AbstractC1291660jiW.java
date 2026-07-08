package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0jiW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1291660jiW extends ValueAnimator {
    public final Set<ValueAnimator.AnimatorUpdateListener> LL = new CopyOnWriteArraySet();
    public final Set<Animator.AnimatorListener> LLILLJJLI = new CopyOnWriteArraySet();
    public final Set<Animator.AnimatorPauseListener> LLILLL = new CopyOnWriteArraySet();

    public final void LIZIZ() {
        Iterator it2 = ((CopyOnWriteArraySet) this.LL).iterator();
        while (it2.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it2.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        ((CopyOnWriteArraySet) this.LLILLJJLI).clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        ((CopyOnWriteArraySet) this.LL).clear();
    }

    public final void LIZ(boolean z) {
        for (Animator.AnimatorListener animatorListener : (CopyOnWriteArraySet) this.LLILLJJLI) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        ((CopyOnWriteArraySet) this.LLILLJJLI).add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        ((CopyOnWriteArraySet) this.LLILLL).add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ((CopyOnWriteArraySet) this.LL).add(animatorUpdateListener);
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        ((CopyOnWriteArraySet) this.LLILLJJLI).remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        ((CopyOnWriteArraySet) this.LLILLL).remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ((CopyOnWriteArraySet) this.LL).remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }
}
