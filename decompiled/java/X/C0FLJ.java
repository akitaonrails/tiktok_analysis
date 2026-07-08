package X;

/* JADX INFO: renamed from: X.0FLJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FLJ {
    public final int LIZ;
    public final int LIZIZ;

    public final int LIZIZ(int i) {
        int i2 = this.LIZ;
        int i3 = this.LIZIZ;
        if ((i - i2) - (i3 - i) >= 0) {
            return i3;
        }
        return i2;
    }

    public C0FLJ(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }

    public final boolean LIZ(int i, int i2) {
        if (this.LIZ <= i && this.LIZIZ >= i2) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(int i, int i2) {
        int i3 = this.LIZ;
        if (i3 != i || this.LIZIZ != i2) {
            if (i3 == i2 && this.LIZIZ == i) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean LIZLLL(int i, int i2) {
        int i3 = this.LIZ;
        if (i <= i3 || i >= this.LIZIZ) {
            if (i2 > i3 && i2 < this.LIZIZ) {
                return true;
            }
            return false;
        }
        return true;
    }
}
