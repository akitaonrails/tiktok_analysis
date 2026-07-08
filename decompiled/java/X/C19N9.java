package X;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: X.19N9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19N9 {
    public abstract double LIZIZ(double d);

    public abstract void LIZJ(double d, double[] dArr);

    public abstract void LIZLLL(float[] fArr, double d);

    public abstract void LJ(double d, double[] dArr);

    public abstract double[] LJFF();

    public static C19N9 LIZ(int i, final double[] dArr, final double[][] dArr2) {
        if (dArr.length != 1) {
            if (i != 0) {
                if (i != 2) {
                    return new C19N9(dArr, dArr2) { // from class: X.19NI
                        public final double[] LIZ;
                        public final double[][] LIZIZ;

                        @Override // X.C19N9
                        public final double[] LJFF() {
                            return this.LIZ;
                        }

                        @Override // X.C19N9
                        public final double LIZIZ(double d) {
                            double[] dArr3 = this.LIZ;
                            int length = dArr3.length;
                            if (d <= dArr3[0]) {
                                return this.LIZIZ[0][0];
                            }
                            int i2 = length - 1;
                            if (d >= dArr3[i2]) {
                                return this.LIZIZ[i2][0];
                            }
                            int i3 = 0;
                            while (i3 < i2) {
                                double[] dArr4 = this.LIZ;
                                double d2 = dArr4[i3];
                                if (d == d2) {
                                    return this.LIZIZ[i3][0];
                                }
                                int i4 = i3 + 1;
                                double d3 = dArr4[i4];
                                if (d < d3) {
                                    double d4 = (d - d2) / (d3 - d2);
                                    double[][] dArr5 = this.LIZIZ;
                                    return (dArr5[i3][0] * (1.0d - d4)) + (dArr5[i4][0] * d4);
                                }
                                i3 = i4;
                            }
                            return 0.0d;
                        }

                        {
                            int length = dArr2[0].length;
                            this.LIZ = dArr;
                            this.LIZIZ = dArr2;
                            if (length > 2) {
                                double d = 0.0d;
                                int i2 = 0;
                                while (i2 < dArr.length) {
                                    double d2 = dArr2[i2][0];
                                    if (i2 > 0) {
                                        Math.hypot(d2 - d, d2 - d);
                                    }
                                    i2++;
                                    d = d2;
                                }
                            }
                        }

                        @Override // X.C19N9
                        public final void LIZJ(double d, double[] dArr3) {
                            double[] dArr4 = this.LIZ;
                            int length = dArr4.length;
                            int i2 = 0;
                            int length2 = this.LIZIZ[0].length;
                            if (d <= dArr4[0]) {
                                for (int i3 = 0; i3 < length2; i3++) {
                                    dArr3[i3] = this.LIZIZ[0][i3];
                                }
                                return;
                            }
                            int i4 = length - 1;
                            if (d < dArr4[i4]) {
                                int i5 = 0;
                                while (i5 < i4) {
                                    if (d == this.LIZ[i5]) {
                                        for (int i6 = 0; i6 < length2; i6++) {
                                            dArr3[i6] = this.LIZIZ[i5][i6];
                                        }
                                    }
                                    double[] dArr5 = this.LIZ;
                                    int i7 = i5 + 1;
                                    double d2 = dArr5[i7];
                                    if (d < d2) {
                                        double d3 = dArr5[i5];
                                        double d4 = (d - d3) / (d2 - d3);
                                        while (i2 < length2) {
                                            double[][] dArr6 = this.LIZIZ;
                                            dArr3[i2] = (dArr6[i5][i2] * (1.0d - d4)) + (dArr6[i7][i2] * d4);
                                            i2++;
                                        }
                                        return;
                                    }
                                    i5 = i7;
                                }
                                return;
                            }
                            while (i2 < length2) {
                                dArr3[i2] = this.LIZIZ[i4][i2];
                                i2++;
                            }
                        }

                        @Override // X.C19N9
                        public final void LIZLLL(float[] fArr, double d) {
                            double[] dArr3 = this.LIZ;
                            int length = dArr3.length;
                            int i2 = 0;
                            int length2 = this.LIZIZ[0].length;
                            if (d <= dArr3[0]) {
                                for (int i3 = 0; i3 < length2; i3++) {
                                    fArr[i3] = (float) this.LIZIZ[0][i3];
                                }
                                return;
                            }
                            int i4 = length - 1;
                            if (d < dArr3[i4]) {
                                int i5 = 0;
                                while (i5 < i4) {
                                    if (d == this.LIZ[i5]) {
                                        for (int i6 = 0; i6 < length2; i6++) {
                                            fArr[i6] = (float) this.LIZIZ[i5][i6];
                                        }
                                    }
                                    double[] dArr4 = this.LIZ;
                                    int i7 = i5 + 1;
                                    double d2 = dArr4[i7];
                                    if (d < d2) {
                                        double d3 = dArr4[i5];
                                        double d4 = (d - d3) / (d2 - d3);
                                        while (i2 < length2) {
                                            double[][] dArr5 = this.LIZIZ;
                                            fArr[i2] = (float) ((dArr5[i5][i2] * (1.0d - d4)) + (dArr5[i7][i2] * d4));
                                            i2++;
                                        }
                                        return;
                                    }
                                    i5 = i7;
                                }
                                return;
                            }
                            while (i2 < length2) {
                                fArr[i2] = (float) this.LIZIZ[i4][i2];
                                i2++;
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:6:0x0017 A[PHI: r6
                          0x0017: PHI (r6v1 double) = (r6v0 double), (r6v5 double) binds: [B:3:0x000d, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // X.C19N9
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LJ(double r11, double[] r13) {
                            /*
                                r10 = this;
                                double[] r1 = r10.LIZ
                                int r2 = r1.length
                                double[][] r0 = r10.LIZIZ
                                r5 = 0
                                r0 = r0[r5]
                                int r4 = r0.length
                                r6 = r1[r5]
                                int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                                if (r0 <= 0) goto L17
                                int r0 = r2 + (-1)
                                r6 = r1[r0]
                                int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                                if (r0 < 0) goto L18
                            L17:
                                r11 = r6
                            L18:
                                r6 = 0
                            L19:
                                int r0 = r2 + (-1)
                                if (r6 >= r0) goto L3f
                                double[] r1 = r10.LIZ
                                int r9 = r6 + 1
                                r7 = r1[r9]
                                int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                                if (r0 > 0) goto L3d
                                r0 = r1[r6]
                                double r7 = r7 - r0
                            L2a:
                                if (r5 >= r4) goto L3f
                                double[][] r1 = r10.LIZIZ
                                r0 = r1[r6]
                                r2 = r0[r5]
                                r0 = r1[r9]
                                r0 = r0[r5]
                                double r0 = r0 - r2
                                double r0 = r0 / r7
                                r13[r5] = r0
                                int r5 = r5 + 1
                                goto L2a
                            L3d:
                                r6 = r9
                                goto L19
                            L3f:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C19NI.LJ(double, double[]):void");
                        }
                    };
                }
            } else {
                return new C19N9(dArr, dArr2) { // from class: X.19NA
                    public final double[] LIZ;
                    public final double[][] LIZIZ;
                    public final double[][] LIZJ;

                    public static double LJI(double d, double d2, double d3, double d4, double d5, double d6) {
                        double d7 = d2 * d2;
                        double d8 = d7 * d2;
                        double d9 = 3.0d * d7;
                        double d10 = ((((((-2.0d) * d8) * d4) + (d9 * d4)) + ((d8 * 2.0d) * d3)) - (d9 * d3)) + d3;
                        double d11 = d * d6;
                        double d12 = d * d5;
                        return ((((d10 + (d11 * d8)) + (d8 * d12)) - (d11 * d7)) - (((d * 2.0d) * d5) * d7)) + (d12 * d2);
                    }

                    @Override // X.C19N9
                    public final double[] LJFF() {
                        return this.LIZ;
                    }

                    @Override // X.C19N9
                    public final double LIZIZ(double d) {
                        double[] dArr3 = this.LIZ;
                        int length = dArr3.length;
                        if (d <= dArr3[0]) {
                            return this.LIZIZ[0][0];
                        }
                        int i2 = length - 1;
                        if (d >= dArr3[i2]) {
                            return this.LIZIZ[i2][0];
                        }
                        int i3 = 0;
                        while (i3 < i2) {
                            double[] dArr4 = this.LIZ;
                            double d2 = dArr4[i3];
                            if (d == d2) {
                                return this.LIZIZ[i3][0];
                            }
                            int i4 = i3 + 1;
                            double d3 = dArr4[i4];
                            if (d < d3) {
                                double d4 = d3 - d2;
                                double[][] dArr5 = this.LIZIZ;
                                double d5 = dArr5[i3][0];
                                double d6 = dArr5[i4][0];
                                double[][] dArr6 = this.LIZJ;
                                return LJI(d4, (d - d2) / d4, d5, d6, dArr6[i3][0], dArr6[i4][0]);
                            }
                            i3 = i4;
                        }
                        return 0.0d;
                    }

                    {
                        int length = dArr.length;
                        int length2 = dArr2[0].length;
                        int i2 = length - 1;
                        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i2, length2);
                        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
                        for (int i3 = 0; i3 < length2; i3++) {
                            int i4 = 0;
                            while (i4 < i2) {
                                int i5 = i4 + 1;
                                double d = dArr[i5] - dArr[i4];
                                double[] dArr5 = dArr3[i4];
                                double d2 = (dArr2[i5][i3] - dArr2[i4][i3]) / d;
                                dArr5[i3] = d2;
                                if (i4 == 0) {
                                    dArr4[i4][i3] = d2;
                                } else {
                                    dArr4[i4][i3] = (dArr3[i4 - 1][i3] + d2) * 0.5d;
                                }
                                i4 = i5;
                            }
                            dArr4[i2][i3] = dArr3[length - 2][i3];
                        }
                        for (int i6 = 0; i6 < i2; i6++) {
                            for (int i7 = 0; i7 < length2; i7++) {
                                double d3 = dArr3[i6][i7];
                                if (d3 == 0.0d) {
                                    dArr4[i6][i7] = 0.0d;
                                    dArr4[i6 + 1][i7] = 0.0d;
                                } else {
                                    double d4 = dArr4[i6][i7] / d3;
                                    int i8 = i6 + 1;
                                    double d5 = dArr4[i8][i7] / d3;
                                    double dHypot = Math.hypot(d4, d5);
                                    if (dHypot > 9.0d) {
                                        double d6 = 3.0d / dHypot;
                                        double[] dArr6 = dArr4[i6];
                                        double[] dArr7 = dArr3[i6];
                                        dArr6[i7] = d4 * d6 * dArr7[i7];
                                        dArr4[i8][i7] = d6 * d5 * dArr7[i7];
                                    }
                                }
                            }
                        }
                        this.LIZ = dArr;
                        this.LIZIZ = dArr2;
                        this.LIZJ = dArr4;
                    }

                    @Override // X.C19N9
                    public final void LIZJ(double d, double[] dArr3) {
                        double[] dArr4 = this.LIZ;
                        int length = dArr4.length;
                        int i2 = 0;
                        int length2 = this.LIZIZ[0].length;
                        if (d <= dArr4[0]) {
                            for (int i3 = 0; i3 < length2; i3++) {
                                dArr3[i3] = this.LIZIZ[0][i3];
                            }
                            return;
                        }
                        int i4 = length - 1;
                        if (d < dArr4[i4]) {
                            int i5 = 0;
                            while (i5 < i4) {
                                if (d == this.LIZ[i5]) {
                                    for (int i6 = 0; i6 < length2; i6++) {
                                        dArr3[i6] = this.LIZIZ[i5][i6];
                                    }
                                }
                                double[] dArr5 = this.LIZ;
                                int i7 = i5 + 1;
                                double d2 = dArr5[i7];
                                if (d < d2) {
                                    double d3 = dArr5[i5];
                                    double d4 = d2 - d3;
                                    double d5 = (d - d3) / d4;
                                    while (i2 < length2) {
                                        double[][] dArr6 = this.LIZIZ;
                                        double d6 = dArr6[i5][i2];
                                        double d7 = dArr6[i7][i2];
                                        double[][] dArr7 = this.LIZJ;
                                        dArr3[i2] = LJI(d4, d5, d6, d7, dArr7[i5][i2], dArr7[i7][i2]);
                                        i2++;
                                    }
                                    return;
                                }
                                i5 = i7;
                            }
                            return;
                        }
                        while (i2 < length2) {
                            dArr3[i2] = this.LIZIZ[i4][i2];
                            i2++;
                        }
                    }

                    @Override // X.C19N9
                    public final void LIZLLL(float[] fArr, double d) {
                        double[] dArr3 = this.LIZ;
                        int length = dArr3.length;
                        int i2 = 0;
                        int length2 = this.LIZIZ[0].length;
                        if (d <= dArr3[0]) {
                            for (int i3 = 0; i3 < length2; i3++) {
                                fArr[i3] = (float) this.LIZIZ[0][i3];
                            }
                            return;
                        }
                        int i4 = length - 1;
                        if (d < dArr3[i4]) {
                            int i5 = 0;
                            while (i5 < i4) {
                                if (d == this.LIZ[i5]) {
                                    for (int i6 = 0; i6 < length2; i6++) {
                                        fArr[i6] = (float) this.LIZIZ[i5][i6];
                                    }
                                }
                                double[] dArr4 = this.LIZ;
                                int i7 = i5 + 1;
                                double d2 = dArr4[i7];
                                if (d < d2) {
                                    double d3 = dArr4[i5];
                                    double d4 = d2 - d3;
                                    double d5 = (d - d3) / d4;
                                    while (i2 < length2) {
                                        double[][] dArr5 = this.LIZIZ;
                                        double d6 = dArr5[i5][i2];
                                        double d7 = dArr5[i7][i2];
                                        double[][] dArr6 = this.LIZJ;
                                        fArr[i2] = (float) LJI(d4, d5, d6, d7, dArr6[i5][i2], dArr6[i7][i2]);
                                        i2++;
                                    }
                                    return;
                                }
                                i5 = i7;
                            }
                            return;
                        }
                        while (i2 < length2) {
                            fArr[i2] = (float) this.LIZIZ[i4][i2];
                            i2++;
                        }
                    }

                    @Override // X.C19N9
                    public final void LJ(double d, double[] dArr3) {
                        double[] dArr4 = this.LIZ;
                        int length = dArr4.length;
                        int length2 = this.LIZIZ[0].length;
                        double d2 = dArr4[0];
                        if (d > d2) {
                            d2 = dArr4[length - 1];
                            if (d < d2) {
                                d2 = d;
                            }
                        }
                        int i2 = 0;
                        while (i2 < length - 1) {
                            double[] dArr5 = this.LIZ;
                            int i3 = i2 + 1;
                            double d3 = dArr5[i3];
                            if (d2 <= d3) {
                                double d4 = dArr5[i2];
                                double d5 = d3 - d4;
                                double d6 = (d2 - d4) / d5;
                                for (int i4 = 0; i4 < length2; i4++) {
                                    double[][] dArr6 = this.LIZIZ;
                                    double d7 = dArr6[i2][i4];
                                    double d8 = dArr6[i3][i4];
                                    double[][] dArr7 = this.LIZJ;
                                    double d9 = dArr7[i2][i4];
                                    double d10 = dArr7[i3][i4];
                                    double d11 = d6 * d6;
                                    double d12 = d6 * 6.0d;
                                    double d13 = 3.0d * d5;
                                    dArr3[i4] = (((((((((((-6.0d) * d11) * d8) + (d8 * d12)) + ((6.0d * d11) * d7)) - (d12 * d7)) + ((d13 * d10) * d11)) + ((d13 * d9) * d11)) - (((2.0d * d5) * d10) * d6)) - (((4.0d * d5) * d9) * d6)) + (d9 * d5)) / d5;
                                }
                                return;
                            }
                            i2 = i3;
                        }
                    }
                };
            }
        }
        final double d = dArr[0];
        final double[] dArr3 = dArr2[0];
        return new C19N9(d, dArr3) { // from class: X.19NN
            public final double LIZ;
            public final double[] LIZIZ;

            @Override // X.C19N9
            public final double[] LJFF() {
                return new double[]{this.LIZ};
            }

            @Override // X.C19N9
            public final double LIZIZ(double d2) {
                return this.LIZIZ[0];
            }

            {
                this.LIZ = d;
                this.LIZIZ = dArr3;
            }

            @Override // X.C19N9
            public final void LIZJ(double d2, double[] dArr4) {
                double[] dArr5 = this.LIZIZ;
                System.arraycopy(dArr5, 0, dArr4, 0, dArr5.length);
            }

            @Override // X.C19N9
            public final void LIZLLL(float[] fArr, double d2) {
                int i2 = 0;
                while (true) {
                    double[] dArr4 = this.LIZIZ;
                    if (i2 < dArr4.length) {
                        fArr[i2] = (float) dArr4[i2];
                        i2++;
                    } else {
                        return;
                    }
                }
            }

            @Override // X.C19N9
            public final void LJ(double d2, double[] dArr4) {
                for (int i2 = 0; i2 < this.LIZIZ.length; i2++) {
                    dArr4[i2] = 0.0d;
                }
            }
        };
    }
}
