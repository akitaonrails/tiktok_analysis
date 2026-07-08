package X;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19Qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21536819Qg implements InterfaceC21537419Qm {
    public C21537019Qi LIZ;
    public float LIZIZ;
    public InterfaceC21537119Qj LIZLLL;
    public final ArrayList<C21537019Qi> LIZJ = new ArrayList<>();
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
        throw new UnsupportedOperationException("Method not decompiled: X.C21536819Qg.toString():java.lang.String");
    }

    public C21536819Qg() {
    }

    public C21536819Qg(final C21537219Qk c21537219Qk) {
        this.LIZLLL = new InterfaceC21537119Qj(this, c21537219Qk) { // from class: X.19Qf
            public int LIZ;
            public final C21536819Qg LIZIZ;
            public final C21537219Qk LIZJ;
            public int LIZLLL = 8;
            public int[] LJ = new int[8];
            public int[] LJFF = new int[8];
            public float[] LJI = new float[8];
            public int LJII = -1;
            public int LJIIIIZZ = -1;
            public boolean LJIIIZ;

            @Override // X.InterfaceC21537119Qj
            public final void LIZLLL() {
                int i = this.LJII;
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    float[] fArr = this.LJI;
                    fArr[i] = fArr[i] * (-1.0f);
                    i = this.LJFF[i];
                }
            }

            @Override // X.InterfaceC21537119Qj
            public final void clear() {
                int i = this.LJII;
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    C21537019Qi c21537019Qi = this.LIZJ.LIZJ[this.LJ[i]];
                    if (c21537019Qi != null) {
                        c21537019Qi.LJFF(this.LIZIZ);
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

            @Override // X.InterfaceC21537119Qj
            public final int LIZJ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC21537119Qj
            public final void LIZ(float f) {
                int i = this.LJII;
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    float[] fArr = this.LJI;
                    fArr[i] = fArr[i] / f;
                    i = this.LJFF[i];
                }
            }

            @Override // X.InterfaceC21537119Qj
            public final C21537019Qi LIZIZ(int i) {
                int i2 = this.LJII;
                for (int i3 = 0; i2 != -1 && i3 < this.LIZ; i3++) {
                    if (i3 == i) {
                        return this.LIZJ.LIZJ[this.LJ[i2]];
                    }
                    i2 = this.LJFF[i2];
                }
                return null;
            }

            @Override // X.InterfaceC21537119Qj
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

            @Override // X.InterfaceC21537119Qj
            public final float LJFF(C21537019Qi c21537019Qi) {
                int i = this.LJII;
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    if (this.LJ[i] == c21537019Qi.LLILLJJLI) {
                        return this.LJI[i];
                    }
                    i = this.LJFF[i];
                }
                return 0.0f;
            }

            @Override // X.InterfaceC21537119Qj
            public final boolean LJIIIZ(C21537019Qi c21537019Qi) {
                int i = this.LJII;
                if (i == -1) {
                    return false;
                }
                for (int i2 = 0; i != -1 && i2 < this.LIZ; i2++) {
                    if (this.LJ[i] == c21537019Qi.LLILLJJLI) {
                        return true;
                    }
                    i = this.LJFF[i];
                }
                return false;
            }

            {
                this.LIZIZ = this;
                this.LIZJ = c21537219Qk;
            }

            @Override // X.InterfaceC21537119Qj
            public final void LJI(C21537019Qi c21537019Qi, float f) {
                if (f == 0.0f) {
                    LJIIIIZZ(c21537019Qi, true);
                    return;
                }
                int i = this.LJII;
                if (i == -1) {
                    this.LJII = 0;
                    this.LJI[0] = f;
                    this.LJ[0] = c21537019Qi.LLILLJJLI;
                    this.LJFF[0] = -1;
                    c21537019Qi.LLJILJIL++;
                    c21537019Qi.LIZJ(this.LIZIZ);
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
                    int i6 = c21537019Qi.LLILLJJLI;
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
                this.LJ[length] = c21537019Qi.LLILLJJLI;
                this.LJI[length] = f;
                if (i3 != -1) {
                    int[] iArr6 = this.LJFF;
                    iArr6[length] = iArr6[i3];
                    iArr6[i3] = length;
                } else {
                    this.LJFF[length] = this.LJII;
                    this.LJII = length;
                }
                c21537019Qi.LLJILJIL++;
                c21537019Qi.LIZJ(this.LIZIZ);
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

            @Override // X.InterfaceC21537119Qj
            public final float LJIIIIZZ(C21537019Qi c21537019Qi, boolean z) {
                int i = this.LJII;
                if (i == -1) {
                    return 0.0f;
                }
                int i2 = 0;
                int i3 = -1;
                while (i != -1 && i2 < this.LIZ) {
                    if (this.LJ[i] == c21537019Qi.LLILLJJLI) {
                        if (i == this.LJII) {
                            this.LJII = this.LJFF[i];
                        } else {
                            int[] iArr = this.LJFF;
                            iArr[i3] = iArr[i];
                        }
                        if (z) {
                            c21537019Qi.LJFF(this.LIZIZ);
                        }
                        c21537019Qi.LLJILJIL--;
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

            @Override // X.InterfaceC21537119Qj
            public final float LJIIJ(C21536819Qg c21536819Qg, boolean z) {
                float fLJFF = LJFF(c21536819Qg.LIZ);
                LJIIIIZZ(c21536819Qg.LIZ, z);
                InterfaceC21537119Qj interfaceC21537119Qj = c21536819Qg.LIZLLL;
                int iLIZJ = interfaceC21537119Qj.LIZJ();
                for (int i = 0; i < iLIZJ; i++) {
                    C21537019Qi c21537019QiLIZIZ = interfaceC21537119Qj.LIZIZ(i);
                    LJII(c21537019QiLIZIZ, interfaceC21537119Qj.LJFF(c21537019QiLIZIZ) * fLJFF, z);
                }
                return fLJFF;
            }

            @Override // X.InterfaceC21537119Qj
            public final void LJII(C21537019Qi c21537019Qi, float f, boolean z) {
                if (f > -0.001f && f < 0.001f) {
                    return;
                }
                int i = this.LJII;
                if (i == -1) {
                    this.LJII = 0;
                    this.LJI[0] = f;
                    this.LJ[0] = c21537019Qi.LLILLJJLI;
                    this.LJFF[0] = -1;
                    c21537019Qi.LLJILJIL++;
                    c21537019Qi.LIZJ(this.LIZIZ);
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
                    int i6 = c21537019Qi.LLILLJJLI;
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
                                c21537019Qi.LJFF(this.LIZIZ);
                            }
                            if (this.LJIIIZ) {
                                this.LJIIIIZZ = i;
                            }
                            c21537019Qi.LLJILJIL--;
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
                this.LJ[length] = c21537019Qi.LLILLJJLI;
                this.LJI[length] = f;
                if (i3 != -1) {
                    int[] iArr7 = this.LJFF;
                    iArr7[length] = iArr7[i3];
                    iArr7[i3] = length;
                } else {
                    this.LJFF[length] = this.LJII;
                    this.LJII = length;
                }
                c21537019Qi.LLJILJIL++;
                c21537019Qi.LIZJ(this.LIZIZ);
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

    @Override // X.InterfaceC21537419Qm
    public C21537019Qi LIZ(boolean[] zArr) {
        return LJFF(zArr, null);
    }

    public final void LJI(C21537019Qi c21537019Qi) {
        C21537019Qi c21537019Qi2 = this.LIZ;
        if (c21537019Qi2 != null) {
            this.LIZLLL.LJI(c21537019Qi2, -1.0f);
            this.LIZ.LLILLL = -1;
            this.LIZ = null;
        }
        float fLJIIIIZZ = this.LIZLLL.LJIIIIZZ(c21537019Qi, true) * (-1.0f);
        this.LIZ = c21537019Qi;
        if (fLJIIIIZZ == 1.0f) {
            return;
        }
        this.LIZIZ /= fLJIIIIZZ;
        this.LIZLLL.LIZ(fLJIIIIZZ);
    }

    public final void LIZIZ(C21536919Qh c21536919Qh, int i) {
        this.LIZLLL.LJI(c21536919Qh.LJIIIZ(i), 1.0f);
        this.LIZLLL.LJI(c21536919Qh.LJIIIZ(i), -1.0f);
    }

    public final C21537019Qi LJFF(boolean[] zArr, C21537019Qi c21537019Qi) {
        EnumC21532319On enumC21532319On;
        int iLIZJ = this.LIZLLL.LIZJ();
        C21537019Qi c21537019Qi2 = null;
        float f = 0.0f;
        for (int i = 0; i < iLIZJ; i++) {
            float fLJ = this.LIZLLL.LJ(i);
            if (fLJ < 0.0f) {
                C21537019Qi c21537019QiLIZIZ = this.LIZLLL.LIZIZ(i);
                if ((zArr == null || !zArr[c21537019QiLIZIZ.LLILLJJLI]) && c21537019QiLIZIZ != c21537019Qi && (((enumC21532319On = c21537019QiLIZIZ.LLJ) == EnumC21532319On.SLACK || enumC21532319On == EnumC21532319On.ERROR) && fLJ < f)) {
                    f = fLJ;
                    c21537019Qi2 = c21537019QiLIZIZ;
                }
            }
        }
        return c21537019Qi2;
    }

    public final void LJII(C21536919Qh c21536919Qh, C21537019Qi c21537019Qi, boolean z) {
        if (c21537019Qi != null && c21537019Qi.LLILZLL) {
            this.LIZIZ += c21537019Qi.LLILZIL * this.LIZLLL.LJFF(c21537019Qi);
            this.LIZLLL.LJIIIIZZ(c21537019Qi, z);
            if (z) {
                c21537019Qi.LJFF(this);
            }
            if (this.LIZLLL.LIZJ() == 0) {
                this.LJ = true;
                c21536919Qh.LIZ = true;
            }
        }
    }

    public void LJIIIIZZ(C21536919Qh c21536919Qh, C21536819Qg c21536819Qg, boolean z) {
        this.LIZIZ += c21536819Qg.LIZIZ * this.LIZLLL.LJIIJ(c21536819Qg, z);
        if (z) {
            c21536819Qg.LIZ.LJFF(this);
        }
        if (this.LIZ != null && this.LIZLLL.LIZJ() == 0) {
            this.LJ = true;
            c21536919Qh.LIZ = true;
        }
    }

    public final void LIZJ(C21537019Qi c21537019Qi, C21537019Qi c21537019Qi2, C21537019Qi c21537019Qi3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.LIZIZ = i;
        }
        if (!z) {
            this.LIZLLL.LJI(c21537019Qi, -1.0f);
            this.LIZLLL.LJI(c21537019Qi2, 1.0f);
            this.LIZLLL.LJI(c21537019Qi3, 1.0f);
        } else {
            this.LIZLLL.LJI(c21537019Qi, 1.0f);
            this.LIZLLL.LJI(c21537019Qi2, -1.0f);
            this.LIZLLL.LJI(c21537019Qi3, -1.0f);
        }
    }

    public final void LIZLLL(C21537019Qi c21537019Qi, C21537019Qi c21537019Qi2, C21537019Qi c21537019Qi3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.LIZIZ = i;
        }
        if (!z) {
            this.LIZLLL.LJI(c21537019Qi, -1.0f);
            this.LIZLLL.LJI(c21537019Qi2, 1.0f);
            this.LIZLLL.LJI(c21537019Qi3, -1.0f);
        } else {
            this.LIZLLL.LJI(c21537019Qi, 1.0f);
            this.LIZLLL.LJI(c21537019Qi2, -1.0f);
            this.LIZLLL.LJI(c21537019Qi3, 1.0f);
        }
    }
}
