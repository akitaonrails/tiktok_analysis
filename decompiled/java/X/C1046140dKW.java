package X;

/* JADX INFO: renamed from: X.0dKW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046140dKW {
    public final int LIZ;
    public final int LIZIZ;
    public final Integer[] LIZJ;
    public C1046140dKW LIZLLL;
    public C1046140dKW LJ;
    public int LJFF;
    public long LJI;

    public C1046140dKW(int i, int i2, Integer[] numArr) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = numArr;
    }

    public final long LIZ(int i, int i2, int i3) {
        if (i >= i2) {
            return 0L;
        }
        int i4 = this.LIZ;
        if (i4 == i && this.LIZIZ == i2) {
            this.LJFF += i3;
        } else {
            if (this.LIZLLL == null) {
                this.LIZLLL = new C1046140dKW(i4, ((this.LIZIZ - i4) / 2) + i4, this.LIZJ);
            }
            this.LIZLLL.LIZ(i, Math.min(i4 + ((this.LIZIZ - i4) / 2), i2), i3);
            if (this.LJ == null) {
                int i5 = this.LIZ;
                int i6 = this.LIZIZ;
                this.LJ = new C1046140dKW(i5 + ((i6 - i5) / 2), i6, this.LIZJ);
            }
            C1046140dKW c1046140dKW = this.LJ;
            int i7 = this.LIZ;
            c1046140dKW.LIZ(Math.max(i7 + ((this.LIZIZ - i7) / 2), i), i2, i3);
        }
        if (this.LJFF > 0) {
            this.LJI = this.LIZJ[this.LIZIZ].intValue() - this.LIZJ[this.LIZ].intValue();
        } else {
            if (this.LIZLLL == null) {
                int i8 = this.LIZ;
                this.LIZLLL = new C1046140dKW(i8, ((this.LIZIZ - i8) / 2) + i8, this.LIZJ);
            }
            long j = this.LIZLLL.LJI;
            if (this.LJ == null) {
                int i9 = this.LIZ;
                int i10 = this.LIZIZ;
                this.LJ = new C1046140dKW(i9 + ((i10 - i9) / 2), i10, this.LIZJ);
            }
            this.LJI = j + this.LJ.LJI;
        }
        return this.LJI;
    }
}
