package X;

import com.ss.ttlivestreamer.core.utils.TEBundle;

/* JADX INFO: renamed from: X.0j5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267610j5j {
    public int LIZ;
    public AbstractC1268600j7K LIZIZ;
    public int LIZJ;
    public TEBundle LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;

    public final synchronized void LIZ(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        int i7;
        int i8;
        if (!z) {
            if (this.LJI == i && this.LJII == i2 && this.LJIIIIZZ == i5 && this.LJIIIZ == i6) {
                return;
            }
        }
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = i6;
        if (this.LIZIZ != null) {
            int[] iArr = {0, 0};
            if ((this.LIZ & 1) != 0) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            if (C23035090v.LIZ(i5, i6, i, i2, iArr) && (i7 = iArr[0]) > 1 && (i8 = iArr[1]) > 1) {
                if (z || this.LJFF != i8 || this.LJ != i7) {
                    this.LJ = i7;
                    this.LJFF = i8;
                    this.LIZIZ.adaptOutputFormat(i7, i8, i3, i4, this.LIZJ, this.LIZLLL);
                }
            } else if (z || this.LJFF != iArr[1] || this.LJ != iArr[0]) {
                this.LJ = i;
                this.LJFF = i2;
                this.LIZIZ.adaptOutputFormat(i, i2, i3, i4, this.LIZJ, this.LIZLLL);
            }
        }
    }
}
