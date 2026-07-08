package X;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19Od, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21531319Od implements InterfaceC21532219Om {
    public C21531519Of LIZ;
    public float LIZIZ;
    public InterfaceC21531819Oi LIZLLL;
    public final ArrayList<C21531519Of> LIZJ = new ArrayList<>();
    public boolean LJ = false;

    public boolean LJ() {
        return this.LIZ == null && this.LIZIZ == 0.0f && this.LIZLLL.LIZJ() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21531319Od.toString():java.lang.String");
    }

    public C21531319Od() {
    }

    public C21531319Od(final C21532019Ok c21532019Ok) {
        this.LIZLLL = new InterfaceC21531819Oi(this, c21532019Ok) { // from class: X.19Og
            public int LIZ;
            public final C21531319Od LIZIZ;
            public final C21532019Ok LIZJ;
            public int LIZLLL = 8;
            public int[] LJ = new int[8];
            public int[] LJFF = new int[8];
            public float[] LJI = new float[8];
            public int LJII = -1;
            public int LJIIIIZZ = -1;
            public boolean LJIIIZ;

            @Override // X.InterfaceC21531819Oi
            public final void LIZLLL() {
                int i = this.LJII;
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    float[] fArr = this.LJI;
                    fArr[i] = fArr[i] * (-1.0f);
                    i = this.LJFF[i];
                }
            }

            @Override // X.InterfaceC21531819Oi
            public final void clear() {
                int i = this.LJII;
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    C21531519Of c21531519Of = this.LIZJ.LIZJ[this.LJ[i]];
                    if (c21531519Of != null) {
                        c21531519Of.LIZIZ(this.LIZIZ);
                    }
                    i = this.LJFF[i];
                }
                this.LJII = -1;
                this.LJIIIIZZ = -1;
                this.LJIIIZ = false;
                this.LIZ = 0;
            }

            public final String toString() {
                int i = this.LJII;
                String strLIZIZ = "";
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(" -> ");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ2);
                    sbLIZ2.append(this.LJI[i]);
                    sbLIZ2.append(" : ");
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ3);
                    sbLIZ3.append(this.LIZJ.LIZJ[this.LJ[i]]);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    i = this.LJFF[i];
                }
                return strLIZIZ;
            }

            @Override // X.InterfaceC21531819Oi
            public final int LIZJ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC21531819Oi
            public final void LIZ(float f) {
                int i = this.LJII;
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    float[] fArr = this.LJI;
                    fArr[i] = fArr[i] / f;
                    i = this.LJFF[i];
                }
            }

            @Override // X.InterfaceC21531819Oi
            public final C21531519Of LIZIZ(int i) {
                int i2 = this.LJII;
                for (int i3 = 0; i2 != -1 && i3 < this.LIZ; i3++) {
                    if (i3 == i) {
                        return this.LIZJ.LIZJ[this.LJ[i2]];
                    }
                    i2 = this.LJFF[i2];
                }
                return null;
            }

            @Override // X.InterfaceC21531819Oi
            public final float LJ(int i) {
                int i2 = this.LJII;
                for (int i3 = 0; i2 != -1 && i3 < this.LIZ; i3++) {
                    if (i3 == i) {
                        return this.LJI[i2];
                    }
                    i2 = this.LJFF[i2];
                }
                return 0.0f;
            }

            @Override // X.InterfaceC21531819Oi
            public final boolean LJIIIIZZ(C21531519Of c21531519Of) {
                int i = this.LJII;
                if (i == -1) {
                    return false;
                }
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    if (this.LJ[i] == c21531519Of.LIZJ) {
                        return true;
                    }
                    i = this.LJFF[i];
                }
                return false;
            }

            @Override // X.InterfaceC21531819Oi
            public final float LJIIIZ(C21531519Of c21531519Of) {
                int i = this.LJII;
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    if (this.LJ[i] == c21531519Of.LIZJ) {
                        return this.LJI[i];
                    }
                    i = this.LJFF[i];
                }
                return 0.0f;
            }

            {
                this.LIZIZ = this;
                this.LIZJ = c21532019Ok;
            }

            @Override // X.InterfaceC21531819Oi
            public final float LJFF(C21531319Od c21531319Od, boolean z) {
                float fLJIIIZ = LJIIIZ(c21531319Od.LIZ);
                LJI(c21531319Od.LIZ, z);
                InterfaceC21531819Oi interfaceC21531819Oi = c21531319Od.LIZLLL;
                int iLIZJ = interfaceC21531819Oi.LIZJ();
                for (int i = 0; i < iLIZJ; i++) {
                    C21531519Of c21531519OfLIZIZ = interfaceC21531819Oi.LIZIZ(i);
                    LJII(c21531519OfLIZIZ, interfaceC21531819Oi.LJIIIZ(c21531519OfLIZIZ) * fLJIIIZ, z);
                }
                return fLJIIIZ;
            }

            @Override // X.InterfaceC21531819Oi
            public final float LJI(C21531519Of c21531519Of, boolean z) {
                int i = this.LJII;
                if (i == -1) {
                    return 0.0f;
                }
                int i2 = 0;
                int i3 = -1;
                while (i != -1 && i2 < this.LIZ) {
                    if (this.LJ[i] == c21531519Of.LIZJ) {
                        if (i == this.LJII) {
                            this.LJII = this.LJFF[i];
                        } else {
                            int[] iArr = this.LJFF;
                            iArr[i3] = iArr[i];
                        }
                        if (z) {
                            c21531519Of.LIZIZ(this.LIZIZ);
                        }
                        c21531519Of.LJIIL--;
                        this.LIZ--;
                        this.LJ[i] = -1;
                        if (this.LJIIIZ) {
                            this.LJIIIIZZ = i;
                        }
                        return this.LJI[i];
                    }
                    i2++;
                    i3 = i;
                    i = this.LJFF[i];
                }
                return 0.0f;
            }

            @Override // X.InterfaceC21531819Oi
            public final void LJIIJ(C21531519Of c21531519Of, float f) {
                if (f == 0.0f) {
                    LJI(c21531519Of, true);
                    return;
                }
                int i = this.LJII;
                if (i == -1) {
                    this.LJII = 0;
                    this.LJI[0] = f;
                    this.LJ[0] = c21531519Of.LIZJ;
                    this.LJFF[0] = -1;
                    c21531519Of.LJIIL++;
                    c21531519Of.LIZ(this.LIZIZ);
                    this.LIZ++;
                    if (!this.LJIIIZ) {
                        int i2 = this.LJIIIIZZ + 1;
                        this.LJIIIIZZ = i2;
                        int[] iArr = this.LJ;
                        if (i2 >= iArr.length) {
                            this.LJIIIZ = true;
                            this.LJIIIIZZ = iArr.length - 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                int i3 = -1;
                for (int i4 = 0; i != -1 && i4 < this.LIZ; i4++) {
                    int i5 = this.LJ[i];
                    int i6 = c21531519Of.LIZJ;
                    if (i5 == i6) {
                        this.LJI[i] = f;
                        return;
                    }
                    if (i5 < i6) {
                        i3 = i;
                    }
                    i = this.LJFF[i];
                }
                int length = this.LJIIIIZZ;
                int i7 = length + 1;
                if (this.LJIIIZ) {
                    int[] iArr2 = this.LJ;
                    if (iArr2[length] != -1) {
                        length = iArr2.length;
                    }
                } else {
                    length = i7;
                }
                int[] iArr3 = this.LJ;
                if (length >= iArr3.length && this.LIZ < iArr3.length) {
                    int i8 = 0;
                    while (true) {
                        int[] iArr4 = this.LJ;
                        if (i8 >= iArr4.length) {
                            break;
                        }
                        if (iArr4[i8] == -1) {
                            length = i8;
                            break;
                        }
                        i8++;
                    }
                }
                int[] iArr5 = this.LJ;
                if (length >= iArr5.length) {
                    length = iArr5.length;
                    int i9 = this.LIZLLL * 2;
                    this.LIZLLL = i9;
                    this.LJIIIZ = false;
                    this.LJIIIIZZ = length - 1;
                    this.LJI = Arrays.copyOf(this.LJI, i9);
                    this.LJ = Arrays.copyOf(this.LJ, this.LIZLLL);
                    this.LJFF = Arrays.copyOf(this.LJFF, this.LIZLLL);
                }
                this.LJ[length] = c21531519Of.LIZJ;
                this.LJI[length] = f;
                if (i3 != -1) {
                    int[] iArr6 = this.LJFF;
                    iArr6[length] = iArr6[i3];
                    iArr6[i3] = length;
                } else {
                    this.LJFF[length] = this.LJII;
                    this.LJII = length;
                }
                c21531519Of.LJIIL++;
                c21531519Of.LIZ(this.LIZIZ);
                int i10 = this.LIZ + 1;
                this.LIZ = i10;
                if (!this.LJIIIZ) {
                    this.LJIIIIZZ++;
                }
                int[] iArr7 = this.LJ;
                if (i10 >= iArr7.length) {
                    this.LJIIIZ = true;
                }
                if (this.LJIIIIZZ >= iArr7.length) {
                    this.LJIIIZ = true;
                    this.LJIIIIZZ = iArr7.length - 1;
                }
            }

            @Override // X.InterfaceC21531819Oi
            public final void LJII(C21531519Of c21531519Of, float f, boolean z) {
                if (f > -0.001f && f < 0.001f) {
                    return;
                }
                int i = this.LJII;
                if (i == -1) {
                    this.LJII = 0;
                    this.LJI[0] = f;
                    this.LJ[0] = c21531519Of.LIZJ;
                    this.LJFF[0] = -1;
                    c21531519Of.LJIIL++;
                    c21531519Of.LIZ(this.LIZIZ);
                    this.LIZ++;
                    if (!this.LJIIIZ) {
                        int i2 = this.LJIIIIZZ + 1;
                        this.LJIIIIZZ = i2;
                        int[] iArr = this.LJ;
                        if (i2 >= iArr.length) {
                            this.LJIIIZ = true;
                            this.LJIIIIZZ = iArr.length - 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                int i3 = -1;
                for (int i4 = 0; i != -1 && i4 < this.LIZ; i4++) {
                    int i5 = this.LJ[i];
                    int i6 = c21531519Of.LIZJ;
                    if (i5 == i6) {
                        float[] fArr = this.LJI;
                        float f2 = fArr[i] + f;
                        if (f2 > -0.001f && f2 < 0.001f) {
                            f2 = 0.0f;
                        }
                        fArr[i] = f2;
                        if (f2 == 0.0f) {
                            if (i == this.LJII) {
                                this.LJII = this.LJFF[i];
                            } else {
                                int[] iArr2 = this.LJFF;
                                iArr2[i3] = iArr2[i];
                            }
                            if (z) {
                                c21531519Of.LIZIZ(this.LIZIZ);
                            }
                            if (this.LJIIIZ) {
                                this.LJIIIIZZ = i;
                            }
                            c21531519Of.LJIIL--;
                            this.LIZ--;
                            return;
                        }
                        return;
                    }
                    if (i5 < i6) {
                        i3 = i;
                    }
                    i = this.LJFF[i];
                }
                int length = this.LJIIIIZZ;
                int i7 = length + 1;
                if (this.LJIIIZ) {
                    int[] iArr3 = this.LJ;
                    if (iArr3[length] != -1) {
                        length = iArr3.length;
                    }
                } else {
                    length = i7;
                }
                int[] iArr4 = this.LJ;
                if (length >= iArr4.length && this.LIZ < iArr4.length) {
                    int i8 = 0;
                    while (true) {
                        int[] iArr5 = this.LJ;
                        if (i8 >= iArr5.length) {
                            break;
                        }
                        if (iArr5[i8] == -1) {
                            length = i8;
                            break;
                        }
                        i8++;
                    }
                }
                int[] iArr6 = this.LJ;
                if (length >= iArr6.length) {
                    length = iArr6.length;
                    int i9 = this.LIZLLL * 2;
                    this.LIZLLL = i9;
                    this.LJIIIZ = false;
                    this.LJIIIIZZ = length - 1;
                    this.LJI = Arrays.copyOf(this.LJI, i9);
                    this.LJ = Arrays.copyOf(this.LJ, this.LIZLLL);
                    this.LJFF = Arrays.copyOf(this.LJFF, this.LIZLLL);
                }
                this.LJ[length] = c21531519Of.LIZJ;
                this.LJI[length] = f;
                if (i3 != -1) {
                    int[] iArr7 = this.LJFF;
                    iArr7[length] = iArr7[i3];
                    iArr7[i3] = length;
                } else {
                    this.LJFF[length] = this.LJII;
                    this.LJII = length;
                }
                c21531519Of.LJIIL++;
                c21531519Of.LIZ(this.LIZIZ);
                this.LIZ++;
                if (!this.LJIIIZ) {
                    this.LJIIIIZZ++;
                }
                int i10 = this.LJIIIIZZ;
                int[] iArr8 = this.LJ;
                if (i10 >= iArr8.length) {
                    this.LJIIIZ = true;
                    this.LJIIIIZZ = iArr8.length - 1;
                }
            }
        };
    }

    @Override // X.InterfaceC21532219Om
    public C21531519Of LIZ(boolean[] zArr) {
        return LJFF(zArr, null);
    }

    public final void LJI(C21531519Of c21531519Of) {
        C21531519Of c21531519Of2 = this.LIZ;
        if (c21531519Of2 != null) {
            this.LIZLLL.LJIIJ(c21531519Of2, -1.0f);
            this.LIZ.LIZLLL = -1;
            this.LIZ = null;
        }
        float fLJI = this.LIZLLL.LJI(c21531519Of, true) * (-1.0f);
        this.LIZ = c21531519Of;
        if (fLJI == 1.0f) {
            return;
        }
        this.LIZIZ /= fLJI;
        this.LIZLLL.LIZ(fLJI);
    }

    public final void LIZIZ(C21531219Oc c21531219Oc, int i) {
        this.LIZLLL.LJIIJ(c21531219Oc.LJIIIZ(i), 1.0f);
        this.LIZLLL.LJIIJ(c21531219Oc.LJIIIZ(i), -1.0f);
    }

    public final C21531519Of LJFF(boolean[] zArr, C21531519Of c21531519Of) {
        EnumC21531919Oj enumC21531919Oj;
        int iLIZJ = this.LIZLLL.LIZJ();
        C21531519Of c21531519Of2 = null;
        float f = 0.0f;
        for (int i = 0; i < iLIZJ; i++) {
            float fLJ = this.LIZLLL.LJ(i);
            if (fLJ < 0.0f) {
                C21531519Of c21531519OfLIZIZ = this.LIZLLL.LIZIZ(i);
                if ((zArr == null || !zArr[c21531519OfLIZIZ.LIZJ]) && c21531519OfLIZIZ != c21531519Of && (((enumC21531919Oj = c21531519OfLIZIZ.LJIIIZ) == EnumC21531919Oj.SLACK || enumC21531919Oj == EnumC21531919Oj.ERROR) && fLJ < f)) {
                    f = fLJ;
                    c21531519Of2 = c21531519OfLIZIZ;
                }
            }
        }
        return c21531519Of2;
    }

    public final void LJII(C21531219Oc c21531219Oc, C21531519Of c21531519Of, boolean z) {
        if (!c21531519Of.LJI) {
            return;
        }
        this.LIZIZ += c21531519Of.LJFF * this.LIZLLL.LJIIIZ(c21531519Of);
        this.LIZLLL.LJI(c21531519Of, z);
        if (z) {
            c21531519Of.LIZIZ(this);
        }
        if (this.LIZLLL.LIZJ() == 0) {
            this.LJ = true;
            c21531219Oc.LIZ = true;
        }
    }

    public void LJIIIIZZ(C21531219Oc c21531219Oc, C21531319Od c21531319Od, boolean z) {
        this.LIZIZ += c21531319Od.LIZIZ * this.LIZLLL.LJFF(c21531319Od, z);
        if (z) {
            c21531319Od.LIZ.LIZIZ(this);
        }
        if (this.LIZ != null && this.LIZLLL.LIZJ() == 0) {
            this.LJ = true;
            c21531219Oc.LIZ = true;
        }
    }

    public final void LIZJ(C21531519Of c21531519Of, C21531519Of c21531519Of2, C21531519Of c21531519Of3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.LIZIZ = i;
        }
        if (!z) {
            this.LIZLLL.LJIIJ(c21531519Of, -1.0f);
            this.LIZLLL.LJIIJ(c21531519Of2, 1.0f);
            this.LIZLLL.LJIIJ(c21531519Of3, 1.0f);
        } else {
            this.LIZLLL.LJIIJ(c21531519Of, 1.0f);
            this.LIZLLL.LJIIJ(c21531519Of2, -1.0f);
            this.LIZLLL.LJIIJ(c21531519Of3, -1.0f);
        }
    }

    public final void LIZLLL(C21531519Of c21531519Of, C21531519Of c21531519Of2, C21531519Of c21531519Of3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.LIZIZ = i;
        }
        if (!z) {
            this.LIZLLL.LJIIJ(c21531519Of, -1.0f);
            this.LIZLLL.LJIIJ(c21531519Of2, 1.0f);
            this.LIZLLL.LJIIJ(c21531519Of3, -1.0f);
        } else {
            this.LIZLLL.LJIIJ(c21531519Of, 1.0f);
            this.LIZLLL.LJIIJ(c21531519Of2, -1.0f);
            this.LIZLLL.LJIIJ(c21531519Of3, 1.0f);
        }
    }
}
