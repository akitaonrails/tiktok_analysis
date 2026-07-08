package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0ji8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class ChoreographerFrameCallbackC1291420ji8 extends AbstractC1291440jiA implements Choreographer.FrameCallback {
    public boolean LLILZ;
    public long LLILZIL;
    public float LLILZLL;
    public int LLIZ;
    public C1291600jiQ LLJI;
    public boolean LLJIJIL;
    public float LLILLL = 1.0f;
    public float LLIZLLLIL = -2.1474836E9f;
    public float LLJ = 2.1474836E9f;

    public final void LIZIZ() {
        LJI(true);
        LIZ(LJFF());
    }

    static {
        new Object() { // from class: X.0jiL
        };
    }

    public final float LIZJ() {
        C1291600jiQ c1291600jiQ = this.LLJI;
        if (c1291600jiQ == null) {
            return 0.0f;
        }
        float f = this.LLILZLL;
        float f2 = c1291600jiQ.LJIIIZ;
        return (f - f2) / (c1291600jiQ.LJIIJ - f2);
    }

    public final float LIZLLL() {
        C1291600jiQ c1291600jiQ = this.LLJI;
        if (c1291600jiQ == null) {
            return 0.0f;
        }
        float f = this.LLJ;
        return f == 2.1474836E9f ? c1291600jiQ.LJIIJ : f;
    }

    public final float LJ() {
        C1291600jiQ c1291600jiQ = this.LLJI;
        if (c1291600jiQ == null) {
            return 0.0f;
        }
        float f = this.LLIZLLLIL;
        return f == -2.1474836E9f ? c1291600jiQ.LJIIIZ : f;
    }

    public final boolean LJFF() {
        return this.LLILLL < 0.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it2 = ((CopyOnWriteArraySet) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((Animator.AnimatorListener) it2.next()).onAnimationCancel(this);
        }
        LJI(true);
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fLJ;
        float fLIZLLL;
        float fLJ2;
        if (this.LLJI == null) {
            return 0.0f;
        }
        if (LJFF()) {
            fLJ = LIZLLL() - this.LLILZLL;
            fLIZLLL = LIZLLL();
            fLJ2 = LJ();
        } else {
            fLJ = this.LLILZLL - LJ();
            fLIZLLL = LIZLLL();
            fLJ2 = LJ();
        }
        return fLJ / (fLIZLLL - fLJ2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C1291600jiQ c1291600jiQ = this.LLJI;
        if (c1291600jiQ == null) {
            return 0L;
        }
        return (long) c1291600jiQ.LIZIZ();
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(LIZJ());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.LLJIJIL;
    }

    public final void LJI(boolean z) {
        C786410Ut5.v2().removeFrameCallback(this);
        if (z) {
            this.LLJIJIL = false;
        }
    }

    public final void LJII(int i) {
        float f = i;
        if (this.LLILZLL == f) {
            return;
        }
        this.LLILZLL = C1291750jif.LIZIZ(f, LJ(), LIZLLL());
        this.LLILZIL = System.nanoTime();
        Iterator it2 = ((CopyOnWriteArraySet) this.LL).iterator();
        while (it2.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it2.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        float fAbs;
        boolean z;
        float fLJ;
        if (this.LLJIJIL) {
            LJI(false);
            C786410Ut5.v2().postFrameCallback(this);
        }
        if (this.LLJI != null && this.LLJIJIL) {
            long jNanoTime = System.nanoTime();
            long j2 = jNanoTime - this.LLILZIL;
            C1291600jiQ c1291600jiQ = this.LLJI;
            if (c1291600jiQ == null) {
                fAbs = Float.MAX_VALUE;
            } else {
                fAbs = (1.0E9f / c1291600jiQ.LJIIJJI) / Math.abs(this.LLILLL);
            }
            float f = j2 / fAbs;
            float f2 = this.LLILZLL;
            if (LJFF()) {
                f = -f;
            }
            float f3 = f2 + f;
            this.LLILZLL = f3;
            float fLJ2 = LJ();
            float fLIZLLL = LIZLLL();
            if (f3 >= fLJ2 && f3 <= fLIZLLL) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            this.LLILZLL = C1291750jif.LIZIZ(this.LLILZLL, LJ(), LIZLLL());
            this.LLILZIL = jNanoTime;
            Iterator it2 = ((CopyOnWriteArraySet) this.LL).iterator();
            while (it2.hasNext()) {
                ((ValueAnimator.AnimatorUpdateListener) it2.next()).onAnimationUpdate(this);
            }
            if (z2) {
                if (getRepeatCount() != -1 && this.LLIZ >= getRepeatCount()) {
                    this.LLILZLL = LIZLLL();
                    LJI(true);
                    LIZ(LJFF());
                } else {
                    Iterator it3 = ((CopyOnWriteArraySet) this.LLILLJJLI).iterator();
                    while (it3.hasNext()) {
                        ((Animator.AnimatorListener) it3.next()).onAnimationRepeat(this);
                    }
                    this.LLIZ++;
                    if (getRepeatMode() == 2) {
                        this.LLILZ = !this.LLILZ;
                        this.LLILLL = -this.LLILLL;
                    } else {
                        if (LJFF()) {
                            fLJ = LIZLLL();
                        } else {
                            fLJ = LJ();
                        }
                        this.LLILZLL = fLJ;
                    }
                    this.LLILZIL = jNanoTime;
                }
            }
            if (this.LLJI != null) {
                float f4 = this.LLILZLL;
                if (f4 < this.LLIZLLLIL || f4 > this.LLJ) {
                    C1291680jiY c1291680jiYLIZ = C1291670jiX.LIZ();
                    IllegalStateException illegalStateException = new IllegalStateException(C786410Ut5.j4("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.LLIZLLLIL), Float.valueOf(this.LLJ), Float.valueOf(this.LLILZLL)}));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("resId=");
                    sbLIZ.append(this.LLJI.LJIILJJIL);
                    c1291680jiYLIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ), illegalStateException);
                }
            }
        }
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.LLILZ) {
            this.LLILZ = false;
            this.LLILLL = -this.LLILLL;
        }
    }

    public final void LJIIIIZZ(int i, int i2) {
        float f;
        float f2;
        C1291600jiQ c1291600jiQ = this.LLJI;
        if (c1291600jiQ == null) {
            f = -3.4028235E38f;
            f2 = Float.MAX_VALUE;
        } else {
            f = c1291600jiQ.LJIIIZ;
            f2 = c1291600jiQ.LJIIJ;
        }
        float f3 = i;
        this.LLIZLLLIL = C1291750jif.LIZIZ(f3, f, f2);
        float f4 = i2;
        this.LLJ = C1291750jif.LIZIZ(f4, f, f2);
        LJII((int) C1291750jif.LIZIZ(this.LLILZLL, f3, f4));
    }
}
