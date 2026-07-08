package X;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.14JZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14JZ {
    public final int LIZ;
    public float LIZIZ;
    public final Interpolator LIZJ;
    public final long LIZLLL;

    public float LIZIZ() {
        Interpolator interpolator = this.LIZJ;
        return interpolator != null ? interpolator.getInterpolation(this.LIZIZ) : this.LIZIZ;
    }

    public long LIZ() {
        return this.LIZLLL;
    }

    public int LIZJ() {
        return this.LIZ;
    }

    public void LIZLLL(float f) {
        this.LIZIZ = f;
    }

    public C14JZ(int i, Interpolator interpolator, long j) {
        this.LIZ = i;
        this.LIZJ = interpolator;
        this.LIZLLL = j;
    }
}
