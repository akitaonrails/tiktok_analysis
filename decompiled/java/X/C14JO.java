package X;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.14JO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14JO {
    public final int LIZ;
    public float LIZIZ;
    public final Interpolator LIZJ;
    public final long LIZLLL;

    public float LIZJ() {
        Interpolator interpolator = this.LIZJ;
        return interpolator != null ? interpolator.getInterpolation(this.LIZIZ) : this.LIZIZ;
    }

    public long LIZ() {
        return this.LIZLLL;
    }

    public float LIZIZ() {
        return this.LIZIZ;
    }

    public int LIZLLL() {
        return this.LIZ;
    }

    public void LJ(float f) {
        this.LIZIZ = f;
    }

    public C14JO(int i, Interpolator interpolator, long j) {
        this.LIZ = i;
        this.LIZJ = interpolator;
        this.LIZLLL = j;
    }
}
