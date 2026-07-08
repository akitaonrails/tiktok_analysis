package X;

/* JADX INFO: renamed from: X.0tyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685850tyJ {
    public static final long LIZIZ(int i) {
        long j = ((long) i) << 32;
        int i2 = C1685910tyP.LJIIJJI;
        return j;
    }

    public static final long LIZLLL(long j) {
        long j2 = j << 32;
        int i = C1685910tyP.LJIIJJI;
        return j2;
    }

    public static final float LJIIIIZZ(long j) {
        AbstractC1685860tyK abstractC1685860tyKLJII = C1685910tyP.LJII(j);
        if (!C1685870tyL.LIZ(abstractC1685860tyKLJII.LIZIZ, C1685870tyL.LIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The specified color must be encoded in an RGB color space. The supplied color space is ");
            sbLIZ.append((Object) C1685870tyL.LIZIZ(abstractC1685860tyKLJII.LIZIZ));
            C1685840tyI.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1E09 c1e09 = ((C1E02) abstractC1685860tyKLJII).LJIILL;
        float fLIZ = (float) ((c1e09.LIZ(C1685910tyP.LJIIIZ(j)) * 0.2126d) + (c1e09.LIZ(C1685910tyP.LJIIIIZZ(j)) * 0.7152d) + (c1e09.LIZ(C1685910tyP.LJI(j)) * 0.0722d));
        if (fLIZ < 0.0f) {
            return 0.0f;
        }
        if (fLIZ <= 1.0f) {
            return fLIZ;
        }
        return 1.0f;
    }

    public static final int LJIIIZ(long j) {
        float[] fArr = C1E04.LIZ;
        return (int) (C1685910tyP.LIZIZ(j, C1E04.LJ) >>> 32);
    }

    public static final long LJI(long j, long j2) {
        float f;
        float f2;
        long jLIZIZ = C1685910tyP.LIZIZ(j, C1685910tyP.LJII(j2));
        float fLJFF = C1685910tyP.LJFF(j2);
        float fLJFF2 = C1685910tyP.LJFF(jLIZIZ);
        float f3 = 1.0f - fLJFF2;
        float f4 = (fLJFF * f3) + fLJFF2;
        float fLJIIIZ = C1685910tyP.LJIIIZ(jLIZIZ);
        float fLJIIIZ2 = C1685910tyP.LJIIIZ(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = ((fLJIIIZ * fLJFF2) + ((fLJIIIZ2 * fLJFF) * f3)) / f4;
        }
        float fLJIIIIZZ = C1685910tyP.LJIIIIZZ(jLIZIZ);
        float fLJIIIIZZ2 = C1685910tyP.LJIIIIZZ(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = ((fLJIIIIZZ * fLJFF2) + ((fLJIIIIZZ2 * fLJFF) * f3)) / f4;
        }
        float fLJI = C1685910tyP.LJI(jLIZIZ);
        float fLJI2 = C1685910tyP.LJI(j2);
        if (f4 != 0.0f) {
            f5 = ((fLJI * fLJFF2) + ((fLJI2 * fLJFF) * f3)) / f4;
        }
        return LJFF(f, f2, f5, f4, C1685910tyP.LJII(j2));
    }

    public static final long LJII(float f, long j, long j2) {
        C1E07 c1e07 = C1E04.LJJ;
        long jLIZIZ = C1685910tyP.LIZIZ(j, c1e07);
        long jLIZIZ2 = C1685910tyP.LIZIZ(j2, c1e07);
        float fLJFF = C1685910tyP.LJFF(jLIZIZ);
        float fLJIIIZ = C1685910tyP.LJIIIZ(jLIZIZ);
        float fLJIIIIZZ = C1685910tyP.LJIIIIZZ(jLIZIZ);
        float fLJI = C1685910tyP.LJI(jLIZIZ);
        float fLJFF2 = C1685910tyP.LJFF(jLIZIZ2);
        float fLJIIIZ2 = C1685910tyP.LJIIIZ(jLIZIZ2);
        float fLJIIIIZZ2 = C1685910tyP.LJIIIIZZ(jLIZIZ2);
        float fLJI2 = C1685910tyP.LJI(jLIZIZ2);
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        return C1685910tyP.LIZIZ(LJFF(C1677720tlC.LIZIZ(fLJIIIZ, fLJIIIZ2, f), C1677720tlC.LIZIZ(fLJIIIIZZ, fLJIIIIZZ2, f), C1677720tlC.LIZIZ(fLJI, fLJI2, f), C1677720tlC.LIZIZ(fLJFF, fLJFF2, f), c1e07), C1685910tyP.LJII(j2));
    }

    public static final long LIZJ(int i, int i2, int i3, int i4) {
        return LIZIZ(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static long LJ(float f, float f2, float f3, float f4) {
        return LIZ(f, f2, f3, f4, C1E04.LJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[PHI: r16
      0x0050: PHI (r16v3 float) = (r16v0 float), (r16v4 float) binds: [B:14:0x003d, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141 A[PHI: r16
      0x0141: PHI (r16v1 float) = (r16v0 float), (r16v2 float) binds: [B:71:0x0110, B:73:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long LIZ(float r17, float r18, float r19, float r20, X.AbstractC1685860tyK r21) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685850tyJ.LIZ(float, float, float, float, X.0tyK):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long LJFF(float r16, float r17, float r18, float r19, X.AbstractC1685860tyK r20) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685850tyJ.LJFF(float, float, float, float, X.0tyK):long");
    }
}
