package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.194U, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C194U {
    public final long LIZ;
    public final long LIZIZ;
    public final TimeInterpolator LIZJ;
    public int LIZLLL;
    public int LJ = 1;

    public final TimeInterpolator LIZIZ() {
        TimeInterpolator timeInterpolator = this.LIZJ;
        return timeInterpolator == null ? C194V.LIZIZ : timeInterpolator;
    }

    public final int hashCode() {
        long j = this.LIZ;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.LIZIZ;
        return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + LIZIZ().getClass().hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        return "\n" + C194U.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.LIZ + " duration: " + this.LIZIZ + " interpolator: " + LIZIZ().getClass() + " repeatCount: " + this.LIZLLL + " repeatMode: " + this.LJ + "}\n";
    }

    public C194U(long j) {
        this.LIZIZ = 300L;
        this.LIZ = j;
        this.LIZIZ = 150L;
    }

    public final void LIZ(Animator animator) {
        animator.setStartDelay(this.LIZ);
        animator.setDuration(this.LIZIZ);
        animator.setInterpolator(LIZIZ());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.LIZLLL);
            valueAnimator.setRepeatMode(this.LJ);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C194U)) {
            return false;
        }
        C194U c194u = (C194U) obj;
        if (this.LIZ != c194u.LIZ || this.LIZIZ != c194u.LIZIZ || this.LIZLLL != c194u.LIZLLL || this.LJ != c194u.LJ) {
            return false;
        }
        return LIZIZ().getClass().equals(c194u.LIZIZ().getClass());
    }

    public C194U(long j, long j2, TimeInterpolator timeInterpolator) {
        this.LIZIZ = 300L;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = timeInterpolator;
    }
}
