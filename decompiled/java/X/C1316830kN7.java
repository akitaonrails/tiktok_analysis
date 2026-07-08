package X;

/* JADX INFO: renamed from: X.0kN7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1316830kN7 {
    public final int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1316830kN7)) {
            return false;
        }
        C1316830kN7 c1316830kN7 = (C1316830kN7) obj;
        if (this.LIZ != c1316830kN7.LIZ || this.LIZIZ != c1316830kN7.LIZIZ || !C1314000kIY.LIZ(this.LIZJ, c1316830kN7.LIZJ) || !C1314000kIY.LIZ(this.LIZLLL, c1316830kN7.LIZLLL)) {
            return false;
        }
        return true;
    }

    public C1316830kN7(float f, float f2, int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = f;
        this.LIZLLL = f2;
    }
}
