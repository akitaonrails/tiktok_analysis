package X;

/* JADX INFO: renamed from: X.1ETC, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1ETC {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;

    public final boolean LIZ() {
        int i = this.LIZ;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.LIZLLL;
            int i4 = this.LIZIZ;
            if ((((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) << 0) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.LIZLLL;
            int i6 = this.LIZJ;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.LJ;
            int i8 = this.LIZIZ;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.LJ;
            int i10 = this.LIZJ;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
