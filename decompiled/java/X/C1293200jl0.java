package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.0jl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1293200jl0<T> {
    public final C1291600jiQ LIZ;
    public final T LIZIZ;
    public T LIZJ;
    public final Interpolator LIZLLL;
    public final float LJ;
    public Float LJFF;
    public float LJI;
    public float LJII;
    public PointF LJIIIIZZ;
    public PointF LJIIIZ;

    public final float LIZIZ() {
        if (this.LIZ == null) {
            return 1.0f;
        }
        if (this.LJII == Float.MIN_VALUE) {
            if (this.LJFF == null) {
                this.LJII = 1.0f;
            } else {
                float fLIZJ = LIZJ();
                float fFloatValue = this.LJFF.floatValue() - this.LJ;
                C1291600jiQ c1291600jiQ = this.LIZ;
                this.LJII = fLIZJ + (fFloatValue / (c1291600jiQ.LJIIJ - c1291600jiQ.LJIIIZ));
            }
        }
        return this.LJII;
    }

    public final float LIZJ() {
        C1291600jiQ c1291600jiQ = this.LIZ;
        if (c1291600jiQ == null) {
            return 0.0f;
        }
        if (this.LJI == Float.MIN_VALUE) {
            float f = this.LJ;
            float f2 = c1291600jiQ.LJIIIZ;
            this.LJI = (f - f2) / (c1291600jiQ.LJIIJ - f2);
        }
        return this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Keyframe{startValue=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endValue=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startFrame=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", endFrame=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", interpolator=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1293200jl0(T t) {
        this.LJI = Float.MIN_VALUE;
        this.LJII = Float.MIN_VALUE;
        this.LIZIZ = t;
        this.LIZJ = t;
        this.LJ = Float.MIN_VALUE;
        this.LJFF = Float.valueOf(Float.MAX_VALUE);
    }

    public final boolean LIZ(float f) {
        if (f >= LIZJ() && f < LIZIZ()) {
            return true;
        }
        return false;
    }

    public C1293200jl0(C1291600jiQ c1291600jiQ, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.LJI = Float.MIN_VALUE;
        this.LJII = Float.MIN_VALUE;
        this.LIZ = c1291600jiQ;
        this.LIZIZ = t;
        this.LIZJ = t2;
        this.LIZLLL = interpolator;
        this.LJ = f;
        this.LJFF = f2;
    }
}
