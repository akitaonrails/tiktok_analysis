package X;

/* JADX INFO: renamed from: X.0tlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677710tlB implements InterfaceC1686200tys {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CubicBezierEasing(a=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", b=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", c=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", d=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0216 A[PHI: r8
      0x0216: PHI (r8v20 float) = (r8v8 float), (r8v23 float) binds: [B:101:0x01f7, B:41:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0248 A[PHI: r3
      0x0248: PHI (r3v21 float) = (r3v6 float), (r3v11 float), (r3v17 float), (r3v23 float), (r3v26 float) binds: [B:119:0x0244, B:107:0x020a, B:82:0x01b4, B:47:0x00f2, B:20:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ca A[PHI: r2
      0x01ca: PHI (r2v25 float) = (r2v24 float), (r2v28 float) binds: [B:66:0x0165, B:76:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1686200tys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float LIZ(float r22) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677710tlB.LIZ(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1677710tlB)) {
            return false;
        }
        C1677710tlB c1677710tlB = (C1677710tlB) obj;
        if (this.LIZ != c1677710tlB.LIZ || this.LIZIZ != c1677710tlB.LIZIZ || this.LIZJ != c1677710tlB.LIZJ || this.LIZLLL != c1677710tlB.LIZLLL) {
            return false;
        }
        return true;
    }

    public C1677710tlB(float f, float f2, float f3, float f4) {
        int iLIZ;
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ");
            sbLIZ.append(f);
            sbLIZ.append(", ");
            sbLIZ.append(f2);
            sbLIZ.append(", ");
            sbLIZ.append(f3);
            sbLIZ.append(", ");
            sbLIZ.append(f4);
            sbLIZ.append('.');
            C1676960tjy.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        float[] fArr = new float[5];
        float f5 = (f2 - 0.0f) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            iLIZ = d2 == d3 ? 0 : C418500Gb2.LIZ((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int iLIZ2 = C418500Gb2.LIZ((float) ((-(d6 + d7)) / d5), fArr, 0);
            iLIZ = iLIZ2 + C418500Gb2.LIZ((float) ((d6 - d7) / d5), fArr, iLIZ2);
            if (iLIZ > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iLIZ--;
                }
            }
        }
        float f10 = (f6 - f5) * 2.0f;
        int iLIZ3 = iLIZ + C418500Gb2.LIZ((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, iLIZ);
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iLIZ3; i++) {
            float f11 = fArr[i];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - 0.0f) * f11) + (((f4 - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
            fMin = Math.min(fMin, f12);
            fMax = Math.max(fMax, f12);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.LJ = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.LJFF = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }
}
