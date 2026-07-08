package X;

/* JADX INFO: renamed from: X.19kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21628119kd {
    public static final C21628119kd[] LJIIIIZZ = {new C21628119kd(false, 3, 5, 8, 8, 1), new C21628119kd(false, 5, 7, 10, 10, 1), new C21628119kd(true, 5, 7, 16, 6, 1), new C21628119kd(false, 8, 10, 12, 12, 1), new C21628119kd(true, 10, 11, 14, 6, 2), new C21628119kd(false, 12, 12, 14, 14, 1), new C21628119kd(true, 16, 14, 24, 10, 1), new C21628119kd(false, 18, 14, 16, 16, 1), new C21628119kd(false, 22, 18, 18, 18, 1), new C21628119kd(true, 22, 18, 16, 10, 2), new C21628119kd(false, 30, 20, 20, 20, 1), new C21628119kd(true, 32, 24, 16, 14, 2), new C21628119kd(false, 36, 24, 22, 22, 1), new C21628119kd(false, 44, 28, 24, 24, 1), new C21628119kd(true, 49, 28, 22, 14, 2), new C21628119kd(false, 62, 36, 14, 14, 4), new C21628119kd(false, 86, 42, 16, 16, 4), new C21628119kd(false, 114, 48, 18, 18, 4), new C21628119kd(false, 144, 56, 20, 20, 4), new C21628119kd(false, 174, 68, 22, 22, 4), new C21628119kd(204, 84, 24, 24, 4, 102, false, 42), new C21628119kd(280, 112, 14, 14, 16, 140, false, 56), new C21628119kd(368, 144, 16, 16, 16, 92, false, 36), new C21628119kd(456, 192, 18, 18, 16, 114, false, 48), new C21628119kd(576, 224, 20, 20, 16, 144, false, 56), new C21628119kd(696, 272, 22, 22, 16, 174, false, 68), new C21628119kd(816, 336, 24, 24, 16, 136, false, 56), new C21628119kd(1050, 408, 18, 18, 36, 175, false, 68), new C21628119kd(1304, 496, 20, 20, 36, 163, false, 62), new C21628119kd() { // from class: X.19kh
        @Override // X.C21628119kd
        public final int LIZ(int i) {
            return i <= 8 ? 156 : 155;
        }

        @Override // X.C21628119kd
        public final int LIZJ() {
            return 10;
        }
    }};
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;

    public final int LIZIZ() {
        int i = this.LJFF;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    public int LIZJ() {
        return this.LIZIZ / this.LJI;
    }

    public final int LJ() {
        int i = this.LJFF;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final int LIZLLL() {
        return (LIZIZ() * this.LIZLLL) + (LIZIZ() << 1);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ ? "Rectangular Symbol:" : "Square Symbol:");
        sbLIZ.append(" data region ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('x');
        sbLIZ.append(this.LJ);
        sbLIZ.append(", symbol size ");
        sbLIZ.append(LIZLLL());
        sbLIZ.append('x');
        sbLIZ.append((LJ() * this.LJ) + (LJ() << 1));
        sbLIZ.append(", symbol data size ");
        sbLIZ.append(LIZIZ() * this.LIZLLL);
        sbLIZ.append('x');
        sbLIZ.append(LJ() * this.LJ);
        sbLIZ.append(", codewords ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('+');
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int LIZ(int i) {
        return this.LJI;
    }

    public static C21628119kd LJFF(int i, EnumC1700580uM4 enumC1700580uM4, C006K c006k, C006K c006k2) {
        C21628119kd[] c21628119kdArr = LJIIIIZZ;
        int i2 = 0;
        do {
            C21628119kd c21628119kd = c21628119kdArr[i2];
            if ((enumC1700580uM4 != EnumC1700580uM4.FORCE_SQUARE || !c21628119kd.LIZ) && ((enumC1700580uM4 != EnumC1700580uM4.FORCE_RECTANGLE || c21628119kd.LIZ) && ((c006k == null || (c21628119kd.LIZLLL() >= 0 && (c21628119kd.LJ() * c21628119kd.LJ) + (c21628119kd.LJ() << 1) >= 0)) && ((c006k2 == null || (c21628119kd.LIZLLL() <= 0 && (c21628119kd.LJ() * c21628119kd.LJ) + (c21628119kd.LJ() << 1) <= 0)) && i <= c21628119kd.LIZIZ)))) {
                return c21628119kd;
            }
            i2++;
        } while (i2 < 30);
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    public C21628119kd(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, i, z, i2);
    }

    public C21628119kd(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = i7;
    }
}
