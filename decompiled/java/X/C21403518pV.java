package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.18pV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21403518pV {
    public int LIZ = 1;
    public final C21403918pZ LIZIZ;
    public C21403918pZ LIZJ;
    public C21403918pZ LIZLLL;
    public int LJ;
    public int LJFF;
    public final boolean LJI;
    public final int[] LJII;

    public final void LIZ() {
        this.LIZ = 1;
        this.LIZJ = this.LIZIZ;
        this.LJFF = 0;
    }

    public final boolean LIZIZ() {
        C21404718ph c21404718phLIZJ = this.LIZJ.LIZIZ.LIZJ();
        int iLIZ = c21404718phLIZJ.LIZ(6);
        if ((iLIZ != 0 && c21404718phLIZJ.LIZIZ.get(iLIZ + c21404718phLIZJ.LIZ) != 0) || this.LJ == 65039) {
            return true;
        }
        if (this.LJI) {
            if (this.LJII == null) {
                return true;
            }
            if (Arrays.binarySearch(this.LJII, this.LIZJ.LIZIZ.LIZ(0)) < 0) {
                return true;
            }
        }
        return false;
    }

    public C21403518pV(C21403918pZ c21403918pZ, boolean z, int[] iArr) {
        this.LIZIZ = c21403918pZ;
        this.LIZJ = c21403918pZ;
        this.LJI = z;
        this.LJII = iArr;
    }
}
