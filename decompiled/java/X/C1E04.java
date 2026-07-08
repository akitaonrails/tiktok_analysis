package X;

/* JADX INFO: renamed from: X.1E04, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E04 {
    public static final float[] LIZ;
    public static final float[] LIZIZ;
    public static final C2274191Dzt LIZJ;
    public static final C2274191Dzt LIZLLL;
    public static final C1E02 LJ;
    public static final C1E02 LJFF;
    public static final C1E02 LJI;
    public static final C1E02 LJII;
    public static final C1E02 LJIIIIZZ;
    public static final C1E02 LJIIIZ;
    public static final C1E02 LJIIJ;
    public static final C1E02 LJIIJJI;
    public static final C1E02 LJIIL;
    public static final C1E02 LJIILIIL;
    public static final C1E02 LJIILJJIL;
    public static final C1E02 LJIILL;
    public static final C1E02 LJIILLIIL;
    public static final C1E02 LJIIZILJ;
    public static final C1685880tyM LJIJ;
    public static final C1686040tyc LJIJI;
    public static final C1E02 LJIJJ;
    public static final C1E02 LJIJJLI;
    public static final C1E02 LJIL;
    public static final C1E07 LJJ;
    public static final AbstractC1685860tyK[] LJJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.1E07] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0tyc] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0tyM] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        LIZ = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        LIZIZ = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        C2274191Dzt c2274191Dzt = new C2274191Dzt(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C2274191Dzt c2274191Dzt2 = new C2274191Dzt(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C2274191Dzt c2274191Dzt3 = new C2274191Dzt(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        LIZJ = c2274191Dzt3;
        C2274191Dzt c2274191Dzt4 = new C2274191Dzt(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        LIZLLL = c2274191Dzt4;
        C1E0J c1e0j = C1E0I.LIZLLL;
        C1E02 c1e02 = new C1E02("sRGB IEC61966-2.1", fArr, c1e0j, c2274191Dzt, 0);
        LJ = c1e02;
        C1E02 c1e022 = new C1E02("sRGB IEC61966-2.1 (Linear)", fArr, c1e0j, 1.0d, 0.0f, 1.0f, 1);
        LJFF = c1e022;
        C1E02 c1e023 = new C1E02("scRGB-nl IEC 61966-2-2:2003", fArr, c1e0j, null, new C1E0O() { // from class: X.1E00
            @Override // X.C1E0O
            public final double LIZ(double d) {
                double dPow;
                double d2;
                if (d < 0.0d) {
                    dPow = -d;
                } else {
                    dPow = d;
                }
                if (dPow >= 0.0031308049535603718d) {
                    dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
                    d2 = 0.9478672985781991d;
                } else {
                    d2 = 0.07739938080495357d;
                }
                return Math.copySign(dPow / d2, d);
            }
        }, new C1E0O() { // from class: X.1E01
            @Override // X.C1E0O
            public final double LIZ(double d) {
                double d2;
                double dPow;
                if (d < 0.0d) {
                    d2 = -d;
                } else {
                    d2 = d;
                }
                if (d2 >= 0.04045d) {
                    dPow = Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d);
                } else {
                    dPow = d2 * 0.07739938080495357d;
                }
                return Math.copySign(dPow, d);
            }
        }, -0.799f, 2.399f, c2274191Dzt, 2);
        LJI = c1e023;
        C1E02 c1e024 = new C1E02("scRGB IEC 61966-2-2:2003", fArr, c1e0j, 1.0d, -0.5f, 7.499f, 3);
        LJII = c1e024;
        C1E02 c1e025 = new C1E02("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c1e0j, new C2274191Dzt(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        LJIIIIZZ = c1e025;
        C1E02 c1e026 = new C1E02("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c1e0j, new C2274191Dzt(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        LJIIIZ = c1e026;
        C1E02 c1e027 = new C1E02("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C1E0J(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        LJIIJ = c1e027;
        C1E02 c1e028 = new C1E02("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c1e0j, c2274191Dzt, 7);
        LJIIJJI = c1e028;
        C1E02 c1e029 = new C1E02("NTSC (1953)", fArr2, C1E0I.LIZ, new C2274191Dzt(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        LJIIL = c1e029;
        C1E02 c1e0210 = new C1E02("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c1e0j, new C2274191Dzt(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        LJIILIIL = c1e0210;
        C1E02 c1e0211 = new C1E02("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c1e0j, 2.2d, 0.0f, 1.0f, 10);
        LJIILJJIL = c1e0211;
        C1E02 c1e0212 = new C1E02("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, C1E0I.LIZIZ, new C2274191Dzt(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        LJIILL = c1e0212;
        C1E0J c1e0j2 = C1E0I.LIZJ;
        C1E02 c1e0213 = new C1E02("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c1e0j2, 1.0d, -65504.0f, 65504.0f, 12);
        LJIILLIIL = c1e0213;
        C1E02 c1e0214 = new C1E02("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c1e0j2, 1.0d, -65504.0f, 65504.0f, 13);
        LJIIZILJ = c1e0214;
        ?? r5 = new AbstractC1685860tyK() { // from class: X.0tyM
            @Override // X.AbstractC1685860tyK
            public final float LIZIZ(int i) {
                return 2.0f;
            }

            @Override // X.AbstractC1685860tyK
            public final float LIZJ(int i) {
                return -2.0f;
            }

            @Override // X.AbstractC1685860tyK
            public final float LJI(float f, float f2, float f3) {
                if (f3 < -2.0f) {
                    return -2.0f;
                }
                if (f3 > 2.0f) {
                    return 2.0f;
                }
                return f3;
            }

            {
                long j = C1685870tyL.LIZIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x002f A[PHI: r4
              0x002f: PHI (r4v1 float) = (r4v0 float), (r4v2 float) binds: [B:12:0x0025, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC1685860tyK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final float[] LIZ(float[] r6) {
                /*
                    r5 = this;
                    r2 = 0
                    r1 = r6[r2]
                    r4 = -1073741824(0xffffffffc0000000, float:-2.0)
                    int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                    if (r0 >= 0) goto Lb
                    r1 = -1073741824(0xffffffffc0000000, float:-2.0)
                Lb:
                    r3 = 1073741824(0x40000000, float:2.0)
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 <= 0) goto L13
                    r1 = 1073741824(0x40000000, float:2.0)
                L13:
                    r6[r2] = r1
                    r2 = 1
                    r1 = r6[r2]
                    int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                    if (r0 >= 0) goto L31
                    r1 = -1073741824(0xffffffffc0000000, float:-2.0)
                L1e:
                    r6[r2] = r1
                    r2 = 2
                    r1 = r6[r2]
                    int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                    if (r0 < 0) goto L2f
                    r4 = r1
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 <= 0) goto L2f
                L2c:
                    r6[r2] = r3
                    return r6
                L2f:
                    r3 = r4
                    goto L2c
                L31:
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 <= 0) goto L1e
                    r1 = 1073741824(0x40000000, float:2.0)
                    goto L1e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1685880tyM.LIZ(float[]):float[]");
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x002f A[PHI: r4
              0x002f: PHI (r4v1 float) = (r4v0 float), (r4v2 float) binds: [B:12:0x0025, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC1685860tyK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final float[] LJFF(float[] r6) {
                /*
                    r5 = this;
                    r2 = 0
                    r1 = r6[r2]
                    r4 = -1073741824(0xffffffffc0000000, float:-2.0)
                    int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                    if (r0 >= 0) goto Lb
                    r1 = -1073741824(0xffffffffc0000000, float:-2.0)
                Lb:
                    r3 = 1073741824(0x40000000, float:2.0)
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 <= 0) goto L13
                    r1 = 1073741824(0x40000000, float:2.0)
                L13:
                    r6[r2] = r1
                    r2 = 1
                    r1 = r6[r2]
                    int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                    if (r0 >= 0) goto L31
                    r1 = -1073741824(0xffffffffc0000000, float:-2.0)
                L1e:
                    r6[r2] = r1
                    r2 = 2
                    r1 = r6[r2]
                    int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                    if (r0 < 0) goto L2f
                    r4 = r1
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 <= 0) goto L2f
                L2c:
                    r6[r2] = r3
                    return r6
                L2f:
                    r3 = r4
                    goto L2c
                L31:
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 <= 0) goto L1e
                    r1 = 1073741824(0x40000000, float:2.0)
                    goto L1e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1685880tyM.LJFF(float[]):float[]");
            }

            @Override // X.AbstractC1685860tyK
            public final long LJ(float f, float f2, float f3) {
                if (f < -2.0f) {
                    f = -2.0f;
                }
                float f4 = 2.0f;
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                } else {
                    if (f2 <= 2.0f) {
                    }
                    return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                }
                f4 = f2;
                return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
            }

            @Override // X.AbstractC1685860tyK
            public final long LJII(float f, float f2, float f3, float f4, AbstractC1685860tyK abstractC1685860tyK) {
                if (f < -2.0f) {
                    f = -2.0f;
                }
                float f5 = 2.0f;
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                } else if (f2 > 2.0f) {
                    f2 = 2.0f;
                }
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                } else {
                    if (f3 <= 2.0f) {
                    }
                    return C1685850tyJ.LIZ(f, f2, f5, f4, abstractC1685860tyK);
                }
                f5 = f3;
                return C1685850tyJ.LIZ(f, f2, f5, f4, abstractC1685860tyK);
            }
        };
        LJIJ = r5;
        ?? r3 = new AbstractC1685860tyK() { // from class: X.0tyc
            @Override // X.AbstractC1685860tyK
            public final float LIZIZ(int i) {
                return i == 0 ? 100.0f : 128.0f;
            }

            @Override // X.AbstractC1685860tyK
            public final float LIZJ(int i) {
                return i == 0 ? 0.0f : -128.0f;
            }

            {
                long j = C1685870tyL.LIZJ;
            }

            @Override // X.AbstractC1685860tyK
            public final float[] LIZ(float[] fArr4) {
                float fCbrt;
                float fCbrt2;
                float fCbrt3;
                float f = fArr4[0];
                float[] fArr5 = C1E0I.LJ;
                float f2 = f / fArr5[0];
                float f3 = fArr4[1] / fArr5[1];
                float f4 = fArr4[2] / fArr5[2];
                if (f2 > 0.008856452f) {
                    fCbrt = (float) Math.cbrt(f2);
                } else {
                    fCbrt = (f2 * 7.787037f) + 0.13793103f;
                }
                if (f3 > 0.008856452f) {
                    fCbrt2 = (float) Math.cbrt(f3);
                } else {
                    fCbrt2 = (f3 * 7.787037f) + 0.13793103f;
                }
                if (f4 > 0.008856452f) {
                    fCbrt3 = (float) Math.cbrt(f4);
                } else {
                    fCbrt3 = (f4 * 7.787037f) + 0.13793103f;
                }
                float f5 = (116.0f * fCbrt2) - 16.0f;
                float f6 = (fCbrt - fCbrt2) * 500.0f;
                float f7 = (fCbrt2 - fCbrt3) * 200.0f;
                if (f5 < 0.0f) {
                    f5 = 0.0f;
                } else if (f5 > 100.0f) {
                    f5 = 100.0f;
                }
                fArr4[0] = f5;
                if (f6 < -128.0f) {
                    f6 = -128.0f;
                }
                float f8 = 128.0f;
                if (f6 > 128.0f) {
                    f6 = 128.0f;
                }
                fArr4[1] = f6;
                if (f7 < -128.0f) {
                    f7 = -128.0f;
                } else {
                    if (f7 <= 128.0f) {
                    }
                    fArr4[2] = f8;
                    return fArr4;
                }
                f8 = f7;
                fArr4[2] = f8;
                return fArr4;
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[PHI: r3
              0x007b: PHI (r3v1 float) = (r3v0 float), (r3v7 float) binds: [B:12:0x0025, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC1685860tyK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final float[] LJFF(float[] r13) {
                /*
                    r12 = this;
                    r11 = 0
                    r10 = r13[r11]
                    r0 = 0
                    int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L7d
                    r10 = 0
                L9:
                    r13[r11] = r10
                    r9 = 1
                    r8 = r13[r9]
                    r3 = -1023410176(0xffffffffc3000000, float:-128.0)
                    int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                    if (r0 >= 0) goto L16
                    r8 = -1023410176(0xffffffffc3000000, float:-128.0)
                L16:
                    r2 = 1124073472(0x43000000, float:128.0)
                    int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                    if (r0 <= 0) goto L1e
                    r8 = 1124073472(0x43000000, float:128.0)
                L1e:
                    r13[r9] = r8
                    r7 = 2
                    r1 = r13[r7]
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 < 0) goto L7b
                    r3 = r1
                    int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                    if (r0 <= 0) goto L7b
                L2c:
                    r13[r7] = r2
                    r0 = 1098907648(0x41800000, float:16.0)
                    float r10 = r10 + r0
                    r0 = 1122500608(0x42e80000, float:116.0)
                    float r10 = r10 / r0
                    r0 = 990057071(0x3b03126f, float:0.002)
                    float r8 = r8 * r0
                    float r8 = r8 + r10
                    r0 = 1000593162(0x3ba3d70a, float:0.005)
                    float r2 = r2 * r0
                    float r6 = r10 - r2
                    r5 = 1045683377(0x3e53dcb1, float:0.20689656)
                    int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                    r2 = 1041055179(0x3e0d3dcb, float:0.13793103)
                    r1 = 1040416807(0x3e038027, float:0.12841855)
                    if (r0 <= 0) goto L77
                    float r4 = r8 * r8
                    float r4 = r4 * r8
                L4f:
                    int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                    if (r0 <= 0) goto L73
                    float r3 = r10 * r10
                    float r3 = r3 * r10
                L56:
                    int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
                    if (r0 <= 0) goto L6f
                    float r2 = r6 * r6
                    float r2 = r2 * r6
                L5d:
                    float[] r1 = X.C1E0I.LJ
                    r0 = r1[r11]
                    float r4 = r4 * r0
                    r13[r11] = r4
                    r0 = r1[r9]
                    float r3 = r3 * r0
                    r13[r9] = r3
                    r0 = r1[r7]
                    float r2 = r2 * r0
                    r13[r7] = r2
                    return r13
                L6f:
                    float r6 = r6 - r2
                    float r2 = r6 * r1
                    goto L5d
                L73:
                    float r10 = r10 - r2
                    float r3 = r10 * r1
                    goto L56
                L77:
                    float r8 = r8 - r2
                    float r4 = r8 * r1
                    goto L4f
                L7b:
                    r2 = r3
                    goto L2c
                L7d:
                    r0 = 1120403456(0x42c80000, float:100.0)
                    int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L9
                    r10 = 1120403456(0x42c80000, float:100.0)
                    goto L9
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1686040tyc.LJFF(float[]):float[]");
            }

            @Override // X.AbstractC1685860tyK
            public final long LJ(float f, float f2, float f3) {
                float f4;
                float f5;
                if (f < 0.0f) {
                    f = 0.0f;
                } else if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f2 < -128.0f) {
                    f2 = -128.0f;
                } else if (f2 > 128.0f) {
                    f2 = 128.0f;
                }
                float f6 = (f + 16.0f) / 116.0f;
                float f7 = (f2 * 0.002f) + f6;
                if (f7 > 0.20689656f) {
                    f4 = f7 * f7 * f7;
                } else {
                    f4 = (f7 - 0.13793103f) * 0.12841855f;
                }
                if (f6 > 0.20689656f) {
                    f5 = f6 * f6 * f6;
                } else {
                    f5 = (f6 - 0.13793103f) * 0.12841855f;
                }
                float[] fArr4 = C1E0I.LJ;
                float f8 = f4 * fArr4[0];
                return (((long) Float.floatToRawIntBits(f5 * fArr4[1])) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
            }

            @Override // X.AbstractC1685860tyK
            public final float LJI(float f, float f2, float f3) {
                float f4;
                if (f < 0.0f) {
                    f = 0.0f;
                } else if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f3 < -128.0f) {
                    f3 = -128.0f;
                } else if (f3 > 128.0f) {
                    f3 = 128.0f;
                }
                float f5 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
                if (f5 > 0.20689656f) {
                    f4 = f5 * f5 * f5;
                } else {
                    f4 = 0.12841855f * (f5 - 0.13793103f);
                }
                return f4 * C1E0I.LJ[2];
            }

            @Override // X.AbstractC1685860tyK
            public final long LJII(float f, float f2, float f3, float f4, AbstractC1685860tyK abstractC1685860tyK) {
                float fCbrt;
                float fCbrt2;
                float fCbrt3;
                float[] fArr4 = C1E0I.LJ;
                float f5 = f / fArr4[0];
                float f6 = f2 / fArr4[1];
                float f7 = f3 / fArr4[2];
                if (f5 > 0.008856452f) {
                    fCbrt = (float) Math.cbrt(f5);
                } else {
                    fCbrt = (f5 * 7.787037f) + 0.13793103f;
                }
                if (f6 > 0.008856452f) {
                    fCbrt2 = (float) Math.cbrt(f6);
                } else {
                    fCbrt2 = (f6 * 7.787037f) + 0.13793103f;
                }
                if (f7 > 0.008856452f) {
                    fCbrt3 = (float) Math.cbrt(f7);
                } else {
                    fCbrt3 = (f7 * 7.787037f) + 0.13793103f;
                }
                float f8 = (116.0f * fCbrt2) - 16.0f;
                float f9 = (fCbrt - fCbrt2) * 500.0f;
                float f10 = (fCbrt2 - fCbrt3) * 200.0f;
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                } else if (f8 > 100.0f) {
                    f8 = 100.0f;
                }
                if (f9 < -128.0f) {
                    f9 = -128.0f;
                }
                float f11 = 128.0f;
                if (f9 > 128.0f) {
                    f9 = 128.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                } else {
                    if (f10 <= 128.0f) {
                    }
                    return C1685850tyJ.LIZ(f8, f9, f11, f4, abstractC1685860tyK);
                }
                f11 = f10;
                return C1685850tyJ.LIZ(f8, f9, f11, f4, abstractC1685860tyK);
            }
        };
        LJIJI = r3;
        C1E02 c1e0215 = new C1E02("None", fArr, c1e0j, c2274191Dzt2, 16);
        LJIJJ = c1e0215;
        C1E02 c1e0216 = new C1E02("Hybrid Log Gamma encoding", fArr3, c1e0j, null, new C1E0O() { // from class: X.1E0A
            @Override // X.C1E0O
            public final double LIZ(double d) {
                float[] fArr4 = C1E04.LIZ;
                return C1E04.LIZIZ(C1E04.LIZJ, d);
            }
        }, new C1E0O() { // from class: X.1E0B
            @Override // X.C1E0O
            public final double LIZ(double d) {
                float[] fArr4 = C1E04.LIZ;
                return C1E04.LIZ(C1E04.LIZJ, d);
            }
        }, 0.0f, 1.0f, c2274191Dzt3, 17);
        LJIJJLI = c1e0216;
        C1E02 c1e0217 = new C1E02("Perceptual Quantizer encoding", fArr3, c1e0j, null, new C1E0O() { // from class: X.1E0C
            @Override // X.C1E0O
            public final double LIZ(double d) {
                float[] fArr4 = C1E04.LIZ;
                return C1E04.LIZLLL(C1E04.LIZLLL, d);
            }
        }, new C1E0O() { // from class: X.1E0D
            @Override // X.C1E0O
            public final double LIZ(double d) {
                float[] fArr4 = C1E04.LIZ;
                return C1E04.LIZJ(C1E04.LIZLLL, d);
            }
        }, 0.0f, 1.0f, c2274191Dzt4, 18);
        LJIL = c1e0217;
        ?? r2 = new AbstractC1685860tyK() { // from class: X.1E07
            public static final float[] LIZLLL;
            public static final float[] LJ;
            public static final float[] LJFF;
            public static final float[] LJI;

            @Override // X.AbstractC1685860tyK
            public final float LIZIZ(int i) {
                return i == 0 ? 1.0f : 0.5f;
            }

            @Override // X.AbstractC1685860tyK
            public final float LIZJ(int i) {
                return i == 0 ? 0.0f : -0.5f;
            }

            static {
                float[] fArrLJFF = C1E05.LJFF(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C1E05.LIZIZ(C1E0L.LIZIZ.LIZ, C1E0I.LIZIZ.LIZ(), C1E0I.LIZLLL.LIZ()));
                LIZLLL = fArrLJFF;
                float[] fArr4 = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
                LJ = fArr4;
                LJFF = C1E05.LJ(fArrLJFF);
                LJI = C1E05.LJ(fArr4);
            }

            {
                long j = C1685870tyL.LIZJ;
            }

            @Override // X.AbstractC1685860tyK
            public final float[] LIZ(float[] fArr4) {
                C1E05.LJII(LIZLLL, fArr4);
                fArr4[0] = C1677720tlC.LIZ(fArr4[0]);
                fArr4[1] = C1677720tlC.LIZ(fArr4[1]);
                fArr4[2] = C1677720tlC.LIZ(fArr4[2]);
                C1E05.LJII(LJ, fArr4);
                return fArr4;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[PHI: r4
              0x004e: PHI (r4v1 float) = (r4v0 float), (r4v2 float) binds: [B:12:0x0025, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC1685860tyK
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final float[] LJFF(float[] r8) {
                /*
                    r7 = this;
                    r6 = 0
                    r1 = r8[r6]
                    r0 = 0
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L50
                    r1 = 0
                L9:
                    r8[r6] = r1
                    r5 = 1
                    r1 = r8[r5]
                    r4 = -1090519040(0xffffffffbf000000, float:-0.5)
                    int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                    if (r0 >= 0) goto L16
                    r1 = -1090519040(0xffffffffbf000000, float:-0.5)
                L16:
                    r3 = 1056964608(0x3f000000, float:0.5)
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 <= 0) goto L1e
                    r1 = 1056964608(0x3f000000, float:0.5)
                L1e:
                    r8[r5] = r1
                    r2 = 2
                    r1 = r8[r2]
                    int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                    if (r0 < 0) goto L4e
                    r4 = r1
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 <= 0) goto L4e
                L2c:
                    r8[r2] = r3
                    float[] r0 = X.C1E07.LJI
                    X.C1E05.LJII(r0, r8)
                    r1 = r8[r6]
                    float r0 = r1 * r1
                    float r0 = r0 * r1
                    r8[r6] = r0
                    r1 = r8[r5]
                    float r0 = r1 * r1
                    float r0 = r0 * r1
                    r8[r5] = r0
                    r1 = r8[r2]
                    float r0 = r1 * r1
                    float r0 = r0 * r1
                    r8[r2] = r0
                    float[] r0 = X.C1E07.LJFF
                    X.C1E05.LJII(r0, r8)
                    return r8
                L4e:
                    r3 = r4
                    goto L2c
                L50:
                    r0 = 1065353216(0x3f800000, float:1.0)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L9
                    r1 = 1065353216(0x3f800000, float:1.0)
                    goto L9
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1E07.LJFF(float[]):float[]");
            }

            @Override // X.AbstractC1685860tyK
            public final long LJ(float f, float f2, float f3) {
                if (f < 0.0f) {
                    f = 0.0f;
                } else if (f > 1.0f) {
                    f = 1.0f;
                }
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                float f4 = 0.5f;
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                if (f3 < -0.5f) {
                    f3 = -0.5f;
                } else {
                    if (f3 <= 0.5f) {
                    }
                    float[] fArr4 = LJI;
                    float f5 = (fArr4[0] * f) + (fArr4[3] * f2) + (fArr4[6] * f4);
                    float f6 = (fArr4[1] * f) + (fArr4[4] * f2) + (fArr4[7] * f4);
                    float f7 = (fArr4[2] * f) + (fArr4[5] * f2) + (fArr4[8] * f4);
                    float f8 = f5 * f5 * f5;
                    float f9 = f6 * f6 * f6;
                    float f10 = f7 * f7 * f7;
                    float[] fArr5 = LJFF;
                    float f11 = (fArr5[0] * f8) + (fArr5[3] * f9) + (fArr5[6] * f10);
                    float f12 = (fArr5[1] * f8) + (fArr5[4] * f9) + (fArr5[7] * f10);
                    return (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L);
                }
                f4 = f3;
                float[] fArr42 = LJI;
                float f52 = (fArr42[0] * f) + (fArr42[3] * f2) + (fArr42[6] * f4);
                float f62 = (fArr42[1] * f) + (fArr42[4] * f2) + (fArr42[7] * f4);
                float f72 = (fArr42[2] * f) + (fArr42[5] * f2) + (fArr42[8] * f4);
                float f82 = f52 * f52 * f52;
                float f92 = f62 * f62 * f62;
                float f102 = f72 * f72 * f72;
                float[] fArr52 = LJFF;
                float f112 = (fArr52[0] * f82) + (fArr52[3] * f92) + (fArr52[6] * f102);
                float f122 = (fArr52[1] * f82) + (fArr52[4] * f92) + (fArr52[7] * f102);
                return (((long) Float.floatToRawIntBits(f112)) << 32) | (((long) Float.floatToRawIntBits(f122)) & 4294967295L);
            }

            @Override // X.AbstractC1685860tyK
            public final float LJI(float f, float f2, float f3) {
                if (f < 0.0f) {
                    f = 0.0f;
                } else if (f > 1.0f) {
                    f = 1.0f;
                }
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                float f4 = 0.5f;
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                if (f3 < -0.5f) {
                    f3 = -0.5f;
                } else {
                    if (f3 <= 0.5f) {
                    }
                    float[] fArr4 = LJI;
                    float f5 = (fArr4[0] * f) + (fArr4[3] * f2) + (fArr4[6] * f4);
                    float f6 = (fArr4[1] * f) + (fArr4[4] * f2) + (fArr4[7] * f4);
                    float f7 = (fArr4[2] * f) + (fArr4[5] * f2) + (fArr4[8] * f4);
                    float f8 = f5 * f5 * f5;
                    float f9 = f6 * f6 * f6;
                    float f10 = f7 * f7 * f7;
                    float[] fArr5 = LJFF;
                    return (fArr5[2] * f8) + (fArr5[5] * f9) + (fArr5[8] * f10);
                }
                f4 = f3;
                float[] fArr42 = LJI;
                float f52 = (fArr42[0] * f) + (fArr42[3] * f2) + (fArr42[6] * f4);
                float f62 = (fArr42[1] * f) + (fArr42[4] * f2) + (fArr42[7] * f4);
                float f72 = (fArr42[2] * f) + (fArr42[5] * f2) + (fArr42[8] * f4);
                float f82 = f52 * f52 * f52;
                float f92 = f62 * f62 * f62;
                float f102 = f72 * f72 * f72;
                float[] fArr52 = LJFF;
                return (fArr52[2] * f82) + (fArr52[5] * f92) + (fArr52[8] * f102);
            }

            @Override // X.AbstractC1685860tyK
            public final long LJII(float f, float f2, float f3, float f4, AbstractC1685860tyK abstractC1685860tyK) {
                float[] fArr4 = LIZLLL;
                float f5 = (fArr4[0] * f) + (fArr4[3] * f2) + (fArr4[6] * f3);
                float f6 = (fArr4[1] * f) + (fArr4[4] * f2) + (fArr4[7] * f3);
                float f7 = (fArr4[2] * f) + (fArr4[5] * f2) + (fArr4[8] * f3);
                float fLIZ = C1677720tlC.LIZ(f5);
                float fLIZ2 = C1677720tlC.LIZ(f6);
                float fLIZ3 = C1677720tlC.LIZ(f7);
                float[] fArr5 = LJ;
                return C1685850tyJ.LIZ((fArr5[0] * fLIZ) + (fArr5[3] * fLIZ2) + (fArr5[6] * fLIZ3), (fArr5[1] * fLIZ) + (fArr5[4] * fLIZ2) + (fArr5[7] * fLIZ3), (fArr5[2] * fLIZ) + (fArr5[5] * fLIZ2) + (fArr5[8] * fLIZ3), f4, abstractC1685860tyK);
            }
        };
        LJJ = r2;
        LJJI = new AbstractC1685860tyK[]{c1e02, c1e022, c1e023, c1e024, c1e025, c1e026, c1e027, c1e028, c1e029, c1e0210, c1e0211, c1e0212, c1e0213, c1e0214, r5, r3, c1e0215, c1e0216, c1e0217, r2};
    }

    public static double LIZ(C2274191Dzt c2274191Dzt, double d) {
        double d2;
        double dExp;
        if (d < 0.0d) {
            d2 = -1.0d;
        } else {
            d2 = 1.0d;
        }
        double d3 = d * d2;
        double d4 = c2274191Dzt.LIZIZ;
        double d5 = c2274191Dzt.LIZJ;
        double d6 = c2274191Dzt.LIZLLL;
        double d7 = c2274191Dzt.LJ;
        double d8 = c2274191Dzt.LJFF;
        double d9 = c2274191Dzt.LJI + 1.0d;
        double d10 = d4 * d3;
        if (d10 <= 1.0d) {
            dExp = Math.pow(d10, d5);
        } else {
            dExp = Math.exp((d3 - d8) * d6) + d7;
        }
        return d9 * d2 * dExp;
    }

    public static double LIZIZ(C2274191Dzt c2274191Dzt, double d) {
        double d2;
        double dLog;
        if (d < 0.0d) {
            d2 = -1.0d;
        } else {
            d2 = 1.0d;
        }
        double d3 = 1.0d / c2274191Dzt.LIZIZ;
        double d4 = 1.0d / c2274191Dzt.LIZJ;
        double d5 = 1.0d / c2274191Dzt.LIZLLL;
        double d6 = c2274191Dzt.LJ;
        double d7 = c2274191Dzt.LJFF;
        double d8 = (d * d2) / (c2274191Dzt.LJI + 1.0d);
        if (d8 <= 1.0d) {
            dLog = d3 * Math.pow(d8, d4);
        } else {
            dLog = (d5 * Math.log(d8 - d6)) + d7;
        }
        return d2 * dLog;
    }

    public static double LIZJ(C2274191Dzt c2274191Dzt, double d) {
        double d2;
        double d3 = 0.0d;
        if (d < 0.0d) {
            d2 = -1.0d;
        } else {
            d2 = 1.0d;
        }
        double d4 = d * d2;
        double dPow = c2274191Dzt.LIZIZ + (c2274191Dzt.LIZJ * Math.pow(d4, c2274191Dzt.LIZLLL));
        if (dPow >= 0.0d) {
            d3 = dPow;
        }
        return d2 * Math.pow(d3 / (c2274191Dzt.LJ + (c2274191Dzt.LJFF * Math.pow(d4, c2274191Dzt.LIZLLL))), c2274191Dzt.LJI);
    }

    public static double LIZLLL(C2274191Dzt c2274191Dzt, double d) {
        double d2;
        if (d < 0.0d) {
            d2 = -1.0d;
        } else {
            d2 = 1.0d;
        }
        double d3 = d * d2;
        double d4 = -c2274191Dzt.LIZIZ;
        double d5 = c2274191Dzt.LJ;
        double d6 = 1.0d / c2274191Dzt.LJI;
        double d7 = c2274191Dzt.LIZJ;
        double d8 = -c2274191Dzt.LJFF;
        return d2 * Math.pow(Math.max(d4 + (d5 * Math.pow(d3, d6)), 0.0d) / (d7 + (d8 * Math.pow(d3, d6))), 1.0d / c2274191Dzt.LIZLLL);
    }
}
