package X;

/* JADX INFO: renamed from: X.1E05, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E05 {
    public static AbstractC1685860tyK LIZ(AbstractC1685860tyK abstractC1685860tyK) {
        C1E0J c1e0j = C1E0I.LIZIZ;
        C1E0M c1e0m = C1E0L.LIZIZ;
        if (!C1685870tyL.LIZ(abstractC1685860tyK.LIZIZ, C1685870tyL.LIZ)) {
            return abstractC1685860tyK;
        }
        C1E02 c1e02 = (C1E02) abstractC1685860tyK;
        if (LIZJ(c1e02.LIZLLL, c1e0j)) {
            return abstractC1685860tyK;
        }
        return new C1E02(c1e02.LIZ, c1e02.LJII, c1e0j, LJFF(LIZIZ(c1e0m.LIZ, c1e02.LIZLLL.LIZ(), c1e0j.LIZ()), c1e02.LJIIIIZZ), c1e02.LJIIJ, c1e02.LJIILIIL, c1e02.LJ, c1e02.LJFF, c1e02.LJI, -1);
    }

    public static final float[] LJ(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final boolean LIZJ(C1E0J c1e0j, C1E0J c1e0j2) {
        if (c1e0j == c1e0j2) {
            return true;
        }
        if (Math.abs(c1e0j.LIZ - c1e0j2.LIZ) < 0.001f && Math.abs(c1e0j.LIZIZ - c1e0j2.LIZIZ) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final float[] LJFF(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = f + (f2 * f3) + (f4 * f5);
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        fArr3[1] = (f6 * f7) + (f3 * f8) + (f9 * f5);
        float f10 = fArr[2] * f7;
        float f11 = fArr[5];
        float f12 = f10 + (fArr2[1] * f11);
        float f13 = fArr[8];
        fArr3[2] = f12 + (f5 * f13);
        float f14 = fArr[0];
        float f15 = fArr2[3] * f14;
        float f16 = fArr2[4];
        float f18 = fArr2[5];
        fArr3[3] = f15 + (f2 * f16) + (f4 * f18);
        float f19 = fArr[1];
        float f20 = fArr2[3];
        fArr3[4] = (f19 * f20) + (f8 * f16) + (f9 * f18);
        float f21 = fArr[2];
        fArr3[5] = (f20 * f21) + (f11 * fArr2[4]) + (f18 * f13);
        float f22 = f14 * fArr2[6];
        float f23 = fArr[3];
        float f24 = fArr2[7];
        float f25 = fArr2[8];
        fArr3[6] = f22 + (f23 * f24) + (f4 * f25);
        float f26 = fArr2[6];
        fArr3[7] = (f19 * f26) + (fArr[4] * f24) + (f9 * f25);
        fArr3[8] = (f21 * f26) + (fArr[5] * fArr2[7]) + (f13 * f25);
        return fArr3;
    }

    public static final float[] LJI(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f, fArr2[4] * f2, fArr2[5] * f3, f * fArr2[6], f2 * fArr2[7], f3 * fArr2[8]};
    }

    public static final float[] LJII(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }

    public static final float[] LIZIZ(float[] fArr, float[] fArr2, float[] fArr3) {
        LJII(fArr, fArr2);
        LJII(fArr, fArr3);
        return LJFF(LJ(fArr), LJI(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final C1685930tyR LIZLLL(AbstractC1685860tyK abstractC1685860tyK, AbstractC1685860tyK abstractC1685860tyK2, final int i) {
        if (abstractC1685860tyK == abstractC1685860tyK2) {
            return new C1686030tyb(abstractC1685860tyK);
        }
        long j = abstractC1685860tyK.LIZIZ;
        long j2 = C1685870tyL.LIZ;
        if (C1685870tyL.LIZ(j, j2) && C1685870tyL.LIZ(abstractC1685860tyK2.LIZIZ, j2)) {
            final C1E02 c1e02 = (C1E02) abstractC1685860tyK;
            final C1E02 c1e022 = (C1E02) abstractC1685860tyK2;
            return new C1685930tyR(c1e02, c1e022, i) { // from class: X.1E06
                public final C1E02 LJFF;
                public final C1E02 LJI;
                public final float[] LJII;

                @Override // X.C1685930tyR
                public final long LIZ(long j3) {
                    float fLJIIIZ = C1685910tyP.LJIIIZ(j3);
                    float fLJIIIIZZ = C1685910tyP.LJIIIIZZ(j3);
                    float fLJI = C1685910tyP.LJI(j3);
                    float fLJFF = C1685910tyP.LJFF(j3);
                    float fLIZ = (float) this.LJFF.LJIILL.LIZ(fLJIIIZ);
                    float fLIZ2 = (float) this.LJFF.LJIILL.LIZ(fLJIIIIZZ);
                    float fLIZ3 = (float) this.LJFF.LJIILL.LIZ(fLJI);
                    float[] fArr = this.LJII;
                    return C1685850tyJ.LIZ((float) this.LJI.LJIIL.LIZ((fArr[0] * fLIZ) + (fArr[3] * fLIZ2) + (fArr[6] * fLIZ3)), (float) this.LJI.LJIIL.LIZ((fArr[1] * fLIZ) + (fArr[4] * fLIZ2) + (fArr[7] * fLIZ3)), (float) this.LJI.LJIIL.LIZ((fArr[2] * fLIZ) + (fArr[5] * fLIZ2) + (fArr[8] * fLIZ3)), fLJFF, this.LJI);
                }

                {
                    float[] fArrLJFF;
                    super(c1e022, c1e02, c1e022, null);
                    this.LJFF = c1e02;
                    this.LJI = c1e022;
                    if (C1E05.LIZJ(c1e02.LIZLLL, c1e022.LIZLLL)) {
                        fArrLJFF = C1E05.LJFF(c1e022.LJIIIZ, c1e02.LJIIIIZZ);
                    } else {
                        float[] fArrLJFF2 = c1e02.LJIIIIZZ;
                        float[] fArr = c1e022.LJIIIZ;
                        float[] fArrLIZ = c1e02.LIZLLL.LIZ();
                        float[] fArrLIZ2 = c1e022.LIZLLL.LIZ();
                        C1E0J c1e0j = c1e02.LIZLLL;
                        C1E0J c1e0j2 = C1E0I.LIZIZ;
                        fArrLJFF2 = C1E05.LIZJ(c1e0j, c1e0j2) ? fArrLJFF2 : C1E05.LJFF(C1E05.LIZIZ(C1E0L.LIZIZ.LIZ, fArrLIZ, new float[]{0.964212f, 1.0f, 0.825188f}), c1e02.LJIIIIZZ);
                        fArrLJFF = C1E05.LJFF(C1E05.LIZJ(c1e022.LIZLLL, c1e0j2) ? fArr : C1E05.LJ(C1E05.LJFF(C1E05.LIZIZ(C1E0L.LIZIZ.LIZ, fArrLIZ2, new float[]{0.964212f, 1.0f, 0.825188f}), c1e022.LJIIIIZZ)), i == 3 ? C1E05.LJI(new float[]{fArrLIZ[0] / fArrLIZ2[0], fArrLIZ[1] / fArrLIZ2[1], fArrLIZ[2] / fArrLIZ2[2]}, fArrLJFF2) : fArrLJFF2);
                    }
                    this.LJII = fArrLJFF;
                }
            };
        }
        return new C1685930tyR(abstractC1685860tyK, abstractC1685860tyK2, i);
    }
}
