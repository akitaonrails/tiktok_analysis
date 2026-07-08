package X;

/* JADX INFO: renamed from: X.0cdY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019500cdY {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;

    public C1019500cdY() {
        this(null, 0, 0, 0, 0, 1023);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sessionId: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", absolutePos: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", relativePos: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", absolutePosCrossTab: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", adGap: ");
        sbLIZ.append(this.LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1019500cdY(String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        str = (i5 & 1) != 0 ? "" : str;
        i = (i5 & 2) != 0 ? -1 : i;
        i2 = (i5 & 4) != 0 ? -1 : i2;
        i3 = (i5 & 8) != 0 ? -1 : i3;
        i4 = (i5 & 16) != 0 ? -1 : i4;
        if ((i5 & 32) != 0) {
            i6 = -1;
        } else {
            i6 = 0;
        }
        if ((i5 & 64) != 0) {
            i7 = -1;
        } else {
            i7 = 0;
        }
        if ((i5 & 128) != 0) {
            i8 = -1;
        } else {
            i8 = 0;
        }
        int i9 = (i5 & 256) == 0 ? 0 : -1;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i6;
        this.LJI = i7;
        this.LJII = i8;
        this.LJIIIIZZ = i9;
        this.LJIIIZ = false;
    }
}
