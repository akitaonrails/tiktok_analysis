package X;

import android.graphics.Point;

/* JADX INFO: renamed from: X.0Uih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779970Uih {
    public static final /* synthetic */ int LJFF = 0;
    public final int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public C779970Uih(boolean z, int i) {
        int i2;
        this.LIZ = i;
        if (z) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        this.LIZIZ = i2;
    }

    public final Point LIZ(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int i6;
        int i7;
        int iLIZ;
        int i8;
        int iLIZIZ = C779350Uhh.LIZIZ();
        int iLIZ2 = C779350Uhh.LIZ();
        int i9 = this.LIZ + i;
        if (iLIZIZ > iLIZ2) {
            z = true;
        } else {
            z = false;
        }
        if (i5 == 0) {
            i5 = this.LIZIZ;
        }
        int iLIZ3 = iLIZIZ - C439101nJ.LIZ(10);
        if (i5 == 0) {
            i6 = this.LIZIZ;
        } else {
            i6 = i5;
        }
        if (i6 != 3 && i6 != 4) {
            i7 = (iLIZ3 - i9) - i3;
        } else {
            i7 = iLIZ3 - i;
        }
        if (z) {
            iLIZ = C439101nJ.LIZ(10);
        } else {
            iLIZ = C439101nJ.LIZ(40);
        }
        int i10 = iLIZ2 - iLIZ;
        if (i5 == 0) {
            i5 = this.LIZIZ;
        }
        if (i5 != 2 && i5 != 4) {
            i8 = i10 - i4;
        } else {
            i8 = i10 - i2;
        }
        return new Point(i7, i8);
    }
}
