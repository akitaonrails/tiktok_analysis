package X;

import java.util.Arrays;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1E02, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E02 extends AbstractC1685860tyK {
    public static final C1E0N LJIIZILJ = new C1E0O() { // from class: X.1E0N
        @Override // X.C1E0O
        public final double LIZ(double d) {
            return d;
        }
    };
    public final C1E0J LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final C2274191Dzt LJI;
    public final float[] LJII;
    public final float[] LJIIIIZZ;
    public final float[] LJIIIZ;
    public final C1E0O LJIIJ;
    public final AwS614S0100000_35 LJIIJJI;
    public final C1E08 LJIIL;
    public final C1E0O LJIILIIL;
    public final AwS614S0100000_35 LJIILJJIL;
    public final C1E09 LJIILL;
    public final boolean LJIILLIIL;

    @Override // X.AbstractC1685860tyK
    public final int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + Arrays.hashCode(this.LJII)) * 31;
        float f = this.LJ;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.LJFF;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        C2274191Dzt c2274191Dzt = this.LJI;
        int iHashCode2 = iFloatToIntBits2 + (c2274191Dzt != null ? c2274191Dzt.hashCode() : 0);
        return this.LJI == null ? (((iHashCode2 * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIILIIL.hashCode() : iHashCode2;
    }

    @Override // X.AbstractC1685860tyK
    public final boolean LIZLLL() {
        return this.LJIILLIIL;
    }

    @Override // X.AbstractC1685860tyK
    public final float[] LIZ(float[] fArr) {
        C1E05.LJII(this.LJIIIZ, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.LJIIL.LIZ(fArr[0]);
        fArr[1] = (float) this.LJIIL.LIZ(fArr[1]);
        fArr[2] = (float) this.LJIIL.LIZ(fArr[2]);
        return fArr;
    }

    @Override // X.AbstractC1685860tyK
    public final float LIZIZ(int i) {
        return this.LJFF;
    }

    @Override // X.AbstractC1685860tyK
    public final float LIZJ(int i) {
        return this.LJ;
    }

    @Override // X.AbstractC1685860tyK
    public final float[] LJFF(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.LJIILL.LIZ(fArr[0]);
        fArr[1] = (float) this.LJIILL.LIZ(fArr[1]);
        fArr[2] = (float) this.LJIILL.LIZ(fArr[2]);
        C1E05.LJII(this.LJIIIIZZ, fArr);
        return fArr;
    }

    @Override // X.AbstractC1685860tyK
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1E02.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1E02 c1e02 = (C1E02) obj;
        if (Float.compare(c1e02.LJ, this.LJ) != 0 || Float.compare(c1e02.LJFF, this.LJFF) != 0 || !Intrinsics.LJFF(this.LIZLLL, c1e02.LIZLLL) || !Arrays.equals(this.LJII, c1e02.LJII)) {
            return false;
        }
        C2274191Dzt c2274191Dzt = this.LJI;
        if (c2274191Dzt != null) {
            return Intrinsics.LJFF(c2274191Dzt, c1e02.LJI);
        }
        if (c1e02.LJI == null) {
            return true;
        }
        if (!Intrinsics.LJFF(this.LJIIJ, c1e02.LJIIJ)) {
            return false;
        }
        return Intrinsics.LJFF(this.LJIILIIL, c1e02.LJIILIIL);
    }

    @Override // X.AbstractC1685860tyK
    public final long LJ(float f, float f2, float f3) {
        float fLIZ = (float) this.LJIILL.LIZ(f);
        float fLIZ2 = (float) this.LJIILL.LIZ(f2);
        float fLIZ3 = (float) this.LJIILL.LIZ(f3);
        float[] fArr = this.LJIIIIZZ;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(((fArr[0] * fLIZ) + (fArr[3] * fLIZ2)) + (fArr[6] * fLIZ3))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * fLIZ) + (fArr[4] * fLIZ2) + (fArr[7] * fLIZ3))) & 4294967295L);
    }

    @Override // X.AbstractC1685860tyK
    public final float LJI(float f, float f2, float f3) {
        float fLIZ = (float) this.LJIILL.LIZ(f);
        float fLIZ2 = (float) this.LJIILL.LIZ(f2);
        float fLIZ3 = (float) this.LJIILL.LIZ(f3);
        float[] fArr = this.LJIIIIZZ;
        return (fArr[2] * fLIZ) + (fArr[5] * fLIZ2) + (fArr[8] * fLIZ3);
    }

    public C1E02(String str, float[] fArr, C1E0J c1e0j, final C2274191Dzt c2274191Dzt, int i) {
        boolean z;
        C1E0O c1e0o;
        C1E0O c1e0o2;
        double d = c2274191Dzt.LIZ;
        if (d == -3.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c1e0o = new C1E0O() { // from class: X.1E0G
                @Override // X.C1E0O
                public final double LIZ(double d2) {
                    C2274191Dzt c2274191Dzt2 = c2274191Dzt;
                    float[] fArr2 = C1E04.LIZ;
                    return C1E04.LIZIZ(c2274191Dzt2, d2);
                }
            };
        } else if (d == -2.0d) {
            c1e0o = new C1E0O() { // from class: X.1E0H
                @Override // X.C1E0O
                public final double LIZ(double d2) {
                    C2274191Dzt c2274191Dzt2 = c2274191Dzt;
                    float[] fArr2 = C1E04.LIZ;
                    return C1E04.LIZLLL(c2274191Dzt2, d2);
                }
            };
        } else if (c2274191Dzt.LJFF == 0.0d && c2274191Dzt.LJI == 0.0d) {
            c1e0o = new C1E0O() { // from class: X.1Dzw
                @Override // X.C1E0O
                public final double LIZ(double d2) {
                    C2274191Dzt c2274191Dzt2 = c2274191Dzt;
                    double d3 = c2274191Dzt2.LIZIZ;
                    double d4 = c2274191Dzt2.LIZJ;
                    double d5 = c2274191Dzt2.LIZLLL;
                    double d6 = c2274191Dzt2.LJ;
                    double d7 = c2274191Dzt2.LIZ;
                    if (d2 >= d6 * d5) {
                        return (Math.pow(d2, 1.0d / d7) - d4) / d3;
                    }
                    return d2 / d5;
                }
            };
        } else {
            c1e0o = new C1E0O() { // from class: X.1Dzu
                @Override // X.C1E0O
                public final double LIZ(double d2) {
                    C2274191Dzt c2274191Dzt2 = c2274191Dzt;
                    double d3 = c2274191Dzt2.LIZIZ;
                    double d4 = c2274191Dzt2.LIZJ;
                    double d5 = c2274191Dzt2.LIZLLL;
                    double d6 = c2274191Dzt2.LJ;
                    double d7 = c2274191Dzt2.LJFF;
                    double d8 = c2274191Dzt2.LJI;
                    double d9 = c2274191Dzt2.LIZ;
                    if (d2 >= d6 * d5) {
                        return (Math.pow(d2 - d7, 1.0d / d9) - d4) / d3;
                    }
                    return (d2 - d8) / d5;
                }
            };
        }
        if (d == -3.0d) {
            c1e0o2 = new C1E0O() { // from class: X.1E0E
                @Override // X.C1E0O
                public final double LIZ(double d2) {
                    C2274191Dzt c2274191Dzt2 = c2274191Dzt;
                    float[] fArr2 = C1E04.LIZ;
                    return C1E04.LIZ(c2274191Dzt2, d2);
                }
            };
        } else if (d == -2.0d) {
            c1e0o2 = new C1E0O() { // from class: X.1E0F
                @Override // X.C1E0O
                public final double LIZ(double d2) {
                    C2274191Dzt c2274191Dzt2 = c2274191Dzt;
                    float[] fArr2 = C1E04.LIZ;
                    return C1E04.LIZJ(c2274191Dzt2, d2);
                }
            };
        } else if (c2274191Dzt.LJFF == 0.0d && c2274191Dzt.LJI == 0.0d) {
            c1e0o2 = new C1E0O() { // from class: X.1Dzx
                @Override // X.C1E0O
                public final double LIZ(double d2) {
                    C2274191Dzt c2274191Dzt2 = c2274191Dzt;
                    double d3 = c2274191Dzt2.LIZIZ;
                    double d4 = c2274191Dzt2.LIZJ;
                    double d5 = c2274191Dzt2.LIZLLL;
                    double d6 = c2274191Dzt2.LJ;
                    double d7 = c2274191Dzt2.LIZ;
                    if (d2 >= d6) {
                        return Math.pow((d3 * d2) + d4, d7);
                    }
                    return d2 * d5;
                }
            };
        } else {
            c1e0o2 = new C1E0O() { // from class: X.1Dzv
                @Override // X.C1E0O
                public final double LIZ(double d2) {
                    C2274191Dzt c2274191Dzt2 = c2274191Dzt;
                    double d3 = c2274191Dzt2.LIZIZ;
                    double d4 = c2274191Dzt2.LIZJ;
                    double d5 = c2274191Dzt2.LIZLLL;
                    double d6 = c2274191Dzt2.LJ;
                    double d7 = c2274191Dzt2.LJFF;
                    double d8 = c2274191Dzt2.LJI;
                    double d9 = c2274191Dzt2.LIZ;
                    if (d2 >= d6) {
                        return Math.pow((d3 * d2) + d4, d9) + d7;
                    }
                    return (d5 * d2) + d8;
                }
            };
        }
        this(str, fArr, c1e0j, null, c1e0o, c1e0o2, 0.0f, 1.0f, c2274191Dzt, i);
    }

    @Override // X.AbstractC1685860tyK
    public final long LJII(float f, float f2, float f3, float f4, AbstractC1685860tyK abstractC1685860tyK) {
        float[] fArr = this.LJIIIZ;
        return C1685850tyJ.LIZ((float) this.LJIIL.LIZ((fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3)), (float) this.LJIIL.LIZ((fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3)), (float) this.LJIIL.LIZ((fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3)), f4, abstractC1685860tyK);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1E02(String str, float[] fArr, C1E0J c1e0j, final double d, float f, float f2, int i) {
        boolean z;
        C1E0O c1e0o;
        if (d == 1.0d) {
            z = true;
        } else {
            z = false;
        }
        C1E0O c1e0o2 = LJIIZILJ;
        if (z) {
            c1e0o = c1e0o2;
        } else {
            c1e0o = new C1E0O() { // from class: X.1Dzy
                @Override // X.C1E0O
                public final double LIZ(double d2) {
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return Math.pow(d2, 1.0d / d3);
                }
            };
        }
        this(str, fArr, c1e0j, null, c1e0o, d != 1.0d ? new C1E0O() { // from class: X.1Dzz
            @Override // X.C1E0O
            public final double LIZ(double d2) {
                double d3 = d;
                if (d2 < 0.0d) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, d3);
            }
        } : c1e0o2, f, f2, new C2274191Dzt(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01cb A[EDGE_INSN: B:65:0x01cb->B:37:0x01cb BREAK  A[LOOP:0: B:33:0x01b1->B:67:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1E02(java.lang.String r30, float[] r31, X.C1E0J r32, float[] r33, X.C1E0O r34, X.C1E0O r35, float r36, float r37, X.C2274191Dzt r38, int r39) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1E02.<init>(java.lang.String, float[], X.1E0J, float[], X.1E0O, X.1E0O, float, float, X.1Dzt, int):void");
    }
}
