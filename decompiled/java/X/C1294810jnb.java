package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.0jnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1294810jnb<T> {
    public final C1294720jnS LIZ;
    public final T LIZIZ;
    public T LIZJ;
    public final Interpolator LIZLLL;
    public final Interpolator LJ;
    public final Interpolator LJFF;
    public final float LJI;
    public Float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public PointF LJIILJJIL;
    public PointF LJIILL;

    public final float LIZ() {
        if (this.LIZ == null) {
            return 1.0f;
        }
        if (this.LJIILIIL == Float.MIN_VALUE) {
            if (this.LJII == null) {
                this.LJIILIIL = 1.0f;
            } else {
                float fLIZIZ = LIZIZ();
                float fFloatValue = this.LJII.floatValue() - this.LJI;
                C1294720jnS c1294720jnS = this.LIZ;
                this.LJIILIIL = fLIZIZ + (fFloatValue / (c1294720jnS.LJIIJJI - c1294720jnS.LJIIJ));
            }
        }
        return this.LJIILIIL;
    }

    public final float LIZIZ() {
        C1294720jnS c1294720jnS = this.LIZ;
        if (c1294720jnS == null) {
            return 0.0f;
        }
        if (this.LJIIL == Float.MIN_VALUE) {
            float f = this.LJI;
            float f2 = c1294720jnS.LJIIJ;
            this.LJIIL = (f - f2) / (c1294720jnS.LJIIJJI - f2);
        }
        return this.LJIIL;
    }

    public final boolean LIZJ() {
        return this.LIZLLL == null && this.LJ == null && this.LJFF == null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Keyframe{startValue=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endValue=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startFrame=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", endFrame=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", interpolator=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1294810jnb(T t) {
        this.LJIIIIZZ = -3987645.8f;
        this.LJIIIZ = -3987645.8f;
        this.LJIIJ = 784923401;
        this.LJIIJJI = 784923401;
        this.LJIIL = Float.MIN_VALUE;
        this.LJIILIIL = Float.MIN_VALUE;
        this.LIZIZ = t;
        this.LIZJ = t;
        this.LJI = Float.MIN_VALUE;
        this.LJII = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1294810jnb(C1295620jou c1295620jou, C1295620jou c1295620jou2) {
        this.LJIIIIZZ = -3987645.8f;
        this.LJIIIZ = -3987645.8f;
        this.LJIIJ = 784923401;
        this.LJIIJJI = 784923401;
        this.LJIIL = Float.MIN_VALUE;
        this.LJIILIIL = Float.MIN_VALUE;
        this.LIZIZ = c1295620jou;
        this.LIZJ = c1295620jou2;
        this.LJI = Float.MIN_VALUE;
        this.LJII = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1294810jnb(C1294720jnS c1294720jnS, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.LJIIIIZZ = -3987645.8f;
        this.LJIIIZ = -3987645.8f;
        this.LJIIJ = 784923401;
        this.LJIIJJI = 784923401;
        this.LJIIL = Float.MIN_VALUE;
        this.LJIILIIL = Float.MIN_VALUE;
        this.LIZ = c1294720jnS;
        this.LIZIZ = obj;
        this.LIZJ = obj2;
        this.LJ = interpolator;
        this.LJFF = interpolator2;
        this.LJI = f;
        this.LJII = null;
    }

    public C1294810jnb(C1294720jnS c1294720jnS, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.LJIIIIZZ = -3987645.8f;
        this.LJIIIZ = -3987645.8f;
        this.LJIIJ = 784923401;
        this.LJIIJJI = 784923401;
        this.LJIIL = Float.MIN_VALUE;
        this.LJIILIIL = Float.MIN_VALUE;
        this.LIZ = c1294720jnS;
        this.LIZIZ = t;
        this.LIZJ = t2;
        this.LIZLLL = interpolator;
        this.LJI = f;
        this.LJII = f2;
    }

    public C1294810jnb(C1294720jnS c1294720jnS, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.LJIIIIZZ = -3987645.8f;
        this.LJIIIZ = -3987645.8f;
        this.LJIIJ = 784923401;
        this.LJIIJJI = 784923401;
        this.LJIIL = Float.MIN_VALUE;
        this.LJIILIIL = Float.MIN_VALUE;
        this.LIZ = c1294720jnS;
        this.LIZIZ = t;
        this.LIZJ = t2;
        this.LIZLLL = interpolator;
        this.LJ = interpolator2;
        this.LJFF = interpolator3;
        this.LJI = f;
        this.LJII = f2;
    }
}
