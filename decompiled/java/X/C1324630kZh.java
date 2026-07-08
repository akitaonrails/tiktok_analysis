package X;

/* JADX INFO: renamed from: X.0kZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324630kZh {
    public final int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final String toString() {
        return C786410Ut5.k4(null, "%dx%d", new Object[]{Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ)});
    }

    public final int hashCode() {
        return ((this.LIZ + 31) * 31) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1324630kZh)) {
            return false;
        }
        C1324630kZh c1324630kZh = (C1324630kZh) obj;
        if (this.LIZ == c1324630kZh.LIZ && this.LIZIZ == c1324630kZh.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1324630kZh(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    public static C1324630kZh LIZ(int i, int i2) {
        if (i > 0 && i2 > 0) {
            return new C1324630kZh(i, i2);
        }
        return null;
    }

    public C1324630kZh(int i, int i2, float f) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        C1322350kW1.LIZIZ(i2 > 0);
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = f;
        this.LIZLLL = 0.6666667f;
    }
}
