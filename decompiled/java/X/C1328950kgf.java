package X;

/* JADX INFO: renamed from: X.0kgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328950kgf {
    public final boolean LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final String toString() {
        return C786410Ut5.k4(null, "%b,%d,%dx%d", new Object[]{Boolean.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL)});
    }

    public final int hashCode() {
        int i = this.LIZJ;
        return ((((i + 31) * 31) + this.LIZLLL) * 31) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1328950kgf)) {
            return false;
        }
        C1328950kgf c1328950kgf = (C1328950kgf) obj;
        if (this.LIZJ == c1328950kgf.LIZJ && this.LIZLLL == c1328950kgf.LIZLLL && this.LIZIZ == c1328950kgf.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1328950kgf(boolean z, int i, int i2, int i3) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
