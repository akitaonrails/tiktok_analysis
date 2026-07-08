package X;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0jpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class ChoreographerFrameCallbackC1295930jpP extends AbstractC1291660jiW implements Choreographer.FrameCallback {
    public boolean LLILZIL;
    public long LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public C1294720jnS LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public float LLILZ = 1.0f;
    public float LLJI = -2.1474836E9f;
    public float LLJIJIL = 2.1474836E9f;

    public final void LJ() {
        LJIIIZ(true);
        LIZ(LJIIIIZZ());
    }

    public final void LIZLLL() {
        if (this.LLJILJIL == null) {
            return;
        }
        float f = this.LLIZLLLIL;
        if (f < this.LLJI || f > this.LLJIJIL) {
            throw new IllegalStateException(C786410Ut5.j4("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.LLJI), Float.valueOf(this.LLJIJIL), Float.valueOf(this.LLIZLLLIL)}));
        }
    }

    public final float LJFF() {
        C1294720jnS c1294720jnS = this.LLJILJIL;
        if (c1294720jnS == null) {
            return 0.0f;
        }
        float f = this.LLIZLLLIL;
        float f2 = c1294720jnS.LJIIJ;
        return (f - f2) / (c1294720jnS.LJIIJJI - f2);
    }

    public final float LJI() {
        C1294720jnS c1294720jnS = this.LLJILJIL;
        if (c1294720jnS == null) {
            return 0.0f;
        }
        float f = this.LLJIJIL;
        return f == 2.1474836E9f ? c1294720jnS.LJIIJJI : f;
    }

    public final float LJII() {
        C1294720jnS c1294720jnS = this.LLJILJIL;
        if (c1294720jnS == null) {
            return 0.0f;
        }
        float f = this.LLJI;
        return f == -2.1474836E9f ? c1294720jnS.LJIIJ : f;
    }

    public final boolean LJIIIIZZ() {
        return this.LLILZ < 0.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it2 = ((CopyOnWriteArraySet) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((Animator.AnimatorListener) it2.next()).onAnimationCancel(this);
        }
        LIZ(LJIIIIZZ());
        LJIIIZ(true);
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fLJII;
        float fLJI;
        float fLJII2;
        if (this.LLJILJIL == null) {
            return 0.0f;
        }
        if (LJIIIIZZ()) {
            fLJII = LJI() - this.LLIZLLLIL;
            fLJI = LJI();
            fLJII2 = LJII();
        } else {
            fLJII = this.LLIZLLLIL - LJII();
            fLJI = LJI();
            fLJII2 = LJII();
        }
        return fLJII / (fLJI - fLJII2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C1294720jnS c1294720jnS = this.LLJILJIL;
        if (c1294720jnS == null) {
            return 0L;
        }
        return (long) c1294720jnS.LIZIZ();
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(LJFF());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.LLJILJILJ;
    }

    public final void LIZJ(long j) {
        float fLJII;
        float fLJI;
        boolean z = false;
        if (this.LLJILJILJ) {
            LJIIIZ(false);
            C786410Ut5.v2().postFrameCallback(this);
        }
        C1294720jnS c1294720jnS = this.LLJILJIL;
        if (c1294720jnS != null && this.LLJILJILJ) {
            long j2 = this.LLILZLL;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float fAbs = j3 / ((1.0E9f / c1294720jnS.LJIIL) / Math.abs(this.LLILZ));
            float f = this.LLIZ;
            if (LJIIIIZZ()) {
                fAbs = -fAbs;
            }
            float f2 = f + fAbs;
            float fLJII2 = LJII();
            float fLJI2 = LJI();
            PointF pointF = C1295100jo4.LIZ;
            if (f2 >= fLJII2 && f2 <= fLJI2) {
                z = true;
            }
            boolean z2 = !z;
            float f3 = this.LLIZ;
            float fLIZIZ = C1295100jo4.LIZIZ(f2, LJII(), LJI());
            this.LLIZ = fLIZIZ;
            if (this.LLJILLL) {
                fLIZIZ = (float) Math.floor(fLIZIZ);
            }
            this.LLIZLLLIL = fLIZIZ;
            this.LLILZLL = j;
            if (!this.LLJILLL || this.LLIZ != f3) {
                LIZIZ();
            }
            if (z2) {
                if (getRepeatCount() != -1 && this.LLJ >= getRepeatCount()) {
                    if (this.LLILZ < 0.0f) {
                        fLJI = LJII();
                    } else {
                        fLJI = LJI();
                    }
                    this.LLIZ = fLJI;
                    this.LLIZLLLIL = fLJI;
                    LJIIIZ(true);
                    LIZ(LJIIIIZZ());
                } else {
                    Iterator it2 = ((CopyOnWriteArraySet) this.LLILLJJLI).iterator();
                    while (it2.hasNext()) {
                        ((Animator.AnimatorListener) it2.next()).onAnimationRepeat(this);
                    }
                    this.LLJ++;
                    if (getRepeatMode() == 2) {
                        this.LLILZIL = !this.LLILZIL;
                        this.LLILZ = -this.LLILZ;
                    } else {
                        if (LJIIIIZZ()) {
                            fLJII = LJI();
                        } else {
                            fLJII = LJII();
                        }
                        this.LLIZ = fLJII;
                        this.LLIZLLLIL = fLJII;
                    }
                    this.LLILZLL = j;
                }
            }
            try {
                LIZLLL();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                if (!C2213981Bky.LIZIZ.LIZLLL()) {
                    C805380Via.LIZJ(e, "verify frame failed");
                    return;
                }
                throw e;
            }
        }
    }

    public final void LJIIIZ(boolean z) {
        C786410Ut5.v2().removeFrameCallback(this);
        if (z) {
            this.LLJILJILJ = false;
        }
    }

    public final void LJIIJ(C1294720jnS c1294720jnS) {
        boolean z;
        if (this.LLJILJIL == null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJILJIL = c1294720jnS;
        if (z) {
            LJIIL(Math.max(this.LLJI, c1294720jnS.LJIIJ), Math.min(this.LLJIJIL, c1294720jnS.LJIIJJI));
        } else {
            LJIIL((int) c1294720jnS.LJIIJ, (int) c1294720jnS.LJIIJJI);
        }
        float f = this.LLIZLLLIL;
        this.LLIZLLLIL = 0.0f;
        this.LLIZ = 0.0f;
        LJIIJJI((int) f);
        LIZIZ();
    }

    public final void LJIIJJI(float f) {
        if (this.LLIZ == f) {
            return;
        }
        float fLIZIZ = C1295100jo4.LIZIZ(f, LJII(), LJI());
        this.LLIZ = fLIZIZ;
        if (this.LLJILLL) {
            fLIZIZ = (float) Math.floor(fLIZIZ);
        }
        this.LLIZLLLIL = fLIZIZ;
        this.LLILZLL = 0L;
        LIZIZ();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C01GW c01gw = C0AH7.LIZ;
        if (((Number) c01gw.getValue()).longValue() != 0) {
            long jLongValue = Long.valueOf(this.LLILZLL).longValue();
            if (jLongValue != 0 && System.nanoTime() - jLongValue <= ((Number) c01gw.getValue()).longValue()) {
                C786410Ut5.v2().removeFrameCallback(this);
                C786410Ut5.v2().postFrameCallback(this);
                return;
            }
        }
        if (C2090408Gw.LIZIZ.booleanValue()) {
            if (C2090208Gu.LIZJ) {
                LIZJ(j);
                return;
            } else {
                C786410Ut5.v2().removeFrameCallback(this);
                C786410Ut5.v2().postFrameCallback(this);
                return;
            }
        }
        LIZJ(j);
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.LLILZIL) {
            this.LLILZIL = false;
            this.LLILZ = -this.LLILZ;
        }
    }

    public final void LJIIL(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            C1294720jnS c1294720jnS = this.LLJILJIL;
            if (c1294720jnS == null) {
                f3 = -3.4028235E38f;
                f4 = Float.MAX_VALUE;
            } else {
                f3 = c1294720jnS.LJIIJ;
                f4 = c1294720jnS.LJIIJJI;
            }
            float fLIZIZ = C1295100jo4.LIZIZ(f, f3, f4);
            float fLIZIZ2 = C1295100jo4.LIZIZ(f2, f3, f4);
            if (fLIZIZ != this.LLJI || fLIZIZ2 != this.LLJIJIL) {
                this.LLJI = fLIZIZ;
                this.LLJIJIL = fLIZIZ2;
                LJIIJJI((int) C1295100jo4.LIZIZ(this.LLIZLLLIL, fLIZIZ, fLIZIZ2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C786410Ut5.j4("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }
}
