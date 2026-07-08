package X;

import com.lynx.base.log.LynxLog;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: X.0kHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313440kHe {
    public static final double[][] LIZ = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 4, 4);
    public static final double[] LIZIZ = new double[16];
    public static final double[][] LIZJ = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 3, 3);

    public static double LIZIZ(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static double LIZJ(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        double d5 = dArr[4];
        double d6 = dArr[5];
        double d7 = dArr[6];
        double d8 = dArr[7];
        double d9 = dArr[8];
        double d10 = dArr[9];
        double d11 = dArr[10];
        double d12 = dArr[11];
        double d13 = dArr[12];
        double d14 = dArr[13];
        double d15 = dArr[14];
        double d16 = dArr[15];
        double d17 = d4 * d7;
        double d18 = d3 * d8;
        double d19 = d4 * d6;
        double d20 = d2 * d8;
        double d21 = d3 * d6;
        double d22 = d2 * d7;
        double d23 = d4 * d5;
        double d24 = d8 * d;
        double d25 = d3 * d5;
        double d26 = d7 * d;
        double d27 = d2 * d5;
        double d28 = d * d6;
        return ((((((((((((((((((((((((d17 * d10) * d13) - ((d18 * d10) * d13)) - ((d19 * d11) * d13)) + ((d20 * d11) * d13)) + ((d21 * d12) * d13)) - ((d22 * d12) * d13)) - ((d17 * d9) * d14)) + ((d18 * d9) * d14)) + ((d23 * d11) * d14)) - ((d24 * d11) * d14)) - ((d25 * d12) * d14)) + ((d26 * d12) * d14)) + ((d19 * d9) * d15)) - ((d20 * d9) * d15)) - ((d23 * d10) * d15)) + ((d24 * d10) * d15)) + ((d27 * d12) * d15)) - ((d12 * d28) * d15)) - ((d21 * d9) * d16)) + ((d22 * d9) * d16)) + ((d25 * d10) * d16)) - ((d26 * d10) * d16)) - ((d27 * d11) * d16)) + (d28 * d11 * d16);
    }

    public static boolean LIZLLL(double d) {
        if (Double.isNaN(d) || Math.abs(d) >= 1.0E-5d) {
            return false;
        }
        return true;
    }

    public static double LJ(double d) {
        return Math.round(d * 1000.0d) * 0.001d;
    }

    public static double LJII(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = (d * d) + (d2 * d2);
        double d4 = dArr[2];
        return Math.sqrt(d3 + (d4 * d4));
    }

    public static void LIZ(double[] dArr, C1314310kJ3 c1314310kJ3) {
        if (dArr.length < 16) {
            LynxLog.e("lynx", "Decompose transform matrix error! transformMatrix's length less than 16!");
            return;
        }
        double[] dArr2 = c1314310kJ3.LIZ;
        double[] dArr3 = c1314310kJ3.LIZIZ;
        double[] dArr4 = c1314310kJ3.LIZJ;
        double[] dArr5 = c1314310kJ3.LIZLLL;
        double[] dArr6 = c1314310kJ3.LJ;
        if (LIZLLL(dArr[15])) {
            return;
        }
        double[][] dArr7 = LIZ;
        double[] dArr8 = LIZIZ;
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            do {
                int i3 = (i * 4) + i2;
                double d = dArr[i3] / dArr[15];
                dArr7[i][i2] = d;
                if (i2 == 3) {
                    d = 0.0d;
                }
                dArr8[i3] = d;
                i2++;
            } while (i2 < 4);
        }
        dArr8[15] = 1.0d;
        if (LIZLLL(LIZJ(dArr8))) {
            return;
        }
        if (LIZLLL(dArr7[0][3]) && LIZLLL(dArr7[1][3]) && LIZLLL(dArr7[2][3])) {
            dArr2[2] = 0.0d;
            dArr2[1] = 0.0d;
            dArr2[0] = 0.0d;
            dArr2[3] = 1.0d;
        } else {
            double[] dArr9 = {dArr7[0][3], dArr7[1][3], dArr7[2][3], dArr7[3][3]};
            double dLIZJ = LIZJ(dArr8);
            if (!LIZLLL(dLIZJ)) {
                double d2 = dArr8[0];
                double d3 = dArr8[1];
                double d4 = dArr8[2];
                double d5 = dArr8[3];
                double d6 = dArr8[4];
                double d7 = dArr8[5];
                double d8 = dArr8[6];
                double d9 = dArr8[7];
                double d10 = dArr8[8];
                double d11 = dArr8[9];
                double d12 = dArr8[10];
                double d13 = dArr8[11];
                double d14 = dArr8[12];
                double d15 = dArr8[13];
                double d16 = dArr8[14];
                double d17 = dArr8[15];
                double d18 = d8 * d13;
                double d19 = d9 * d12;
                double d20 = d9 * d11;
                double d21 = d7 * d13;
                double d22 = d8 * d11;
                double d23 = d7 * d12;
                double d24 = d5 * d12;
                double d25 = d4 * d13;
                double d26 = d5 * d11;
                double d27 = d3 * d13;
                double d28 = d4 * d11;
                double d29 = d3 * d12;
                double d30 = d4 * d9;
                double d31 = d5 * d8;
                double d32 = d5 * d7;
                double d33 = d3 * d9;
                double d34 = d4 * d7;
                double d35 = d3 * d8;
                double d36 = d9 * d10;
                double d37 = ((d19 * d14) - (d18 * d14)) - (d36 * d16);
                double d38 = d6 * d13;
                double d39 = d8 * d10;
                double d40 = d6 * d12;
                double d41 = d5 * d10;
                double d42 = ((d25 * d14) - (d24 * d14)) + (d41 * d16);
                double d43 = d2 * d13;
                double d44 = d4 * d10;
                double d45 = d2 * d12;
                double d46 = d5 * d6;
                double d47 = d9 * d2;
                double d48 = d4 * d6;
                double d49 = d8 * d2;
                double d50 = (((d21 * d14) - (d20 * d14)) + (d36 * d15)) - (d38 * d15);
                double d51 = d7 * d10;
                double d52 = d6 * d11;
                double d53 = (((d26 * d14) - (d27 * d14)) - (d41 * d15)) + (d43 * d15);
                double d54 = d3 * d10;
                double d55 = d2 * d11;
                double d56 = d3 * d6;
                double d57 = d2 * d7;
                dArr8 = new double[]{((((((d18 * d15) - (d19 * d15)) + (d20 * d16)) - (d21 * d16)) - (d22 * d17)) + (d23 * d17)) / dLIZJ, ((((((d24 * d15) - (d25 * d15)) - (d26 * d16)) + (d27 * d16)) + (d28 * d17)) - (d29 * d17)) / dLIZJ, ((((((d30 * d15) - (d31 * d15)) + (d32 * d16)) - (d33 * d16)) - (d34 * d17)) + (d35 * d17)) / dLIZJ, ((((((d31 * d11) - (d30 * d11)) - (d32 * d12)) + (d33 * d12)) + (d34 * d13)) - (d35 * d13)) / dLIZJ, (((d37 + (d38 * d16)) + (d39 * d17)) - (d40 * d17)) / dLIZJ, (((d42 - (d43 * d16)) - (d44 * d17)) + (d45 * d17)) / dLIZJ, ((((((d31 * d14) - (d30 * d14)) - (d46 * d16)) + (d47 * d16)) + (d48 * d17)) - (d49 * d17)) / dLIZJ, ((((((d30 * d10) - (d31 * d10)) + (d46 * d12)) - (d47 * d12)) - (d48 * d13)) + (d49 * d13)) / dLIZJ, ((d50 - (d51 * d17)) + (d52 * d17)) / dLIZJ, ((d53 + (d54 * d17)) - (d55 * d17)) / dLIZJ, ((((((d33 * d14) - (d32 * d14)) + (d46 * d15)) - (d47 * d15)) - (d56 * d17)) + (d17 * d57)) / dLIZJ, ((((((d32 * d10) - (d33 * d10)) - (d46 * d11)) + (d47 * d11)) + (d56 * d13)) - (d13 * d57)) / dLIZJ, ((((((d22 * d14) - (d23 * d14)) - (d39 * d15)) + (d40 * d15)) + (d51 * d16)) - (d52 * d16)) / dLIZJ, ((((((d29 * d14) - (d28 * d14)) + (d44 * d15)) - (d45 * d15)) - (d54 * d16)) + (d55 * d16)) / dLIZJ, ((((((d34 * d14) - (d14 * d35)) - (d48 * d15)) + (d15 * d49)) + (d56 * d16)) - (d16 * d57)) / dLIZJ, ((((((d35 * d10) - (d34 * d10)) + (d48 * d11)) - (d49 * d11)) - (d56 * d12)) + (d57 * d12)) / dLIZJ};
            }
            double d58 = dArr8[0];
            double d59 = dArr8[4];
            double d60 = dArr8[8];
            double d61 = dArr8[12];
            double d62 = dArr8[1];
            double d63 = dArr8[5];
            double d64 = dArr8[9];
            double d65 = dArr8[13];
            double d66 = dArr8[2];
            double d67 = dArr8[6];
            double d68 = dArr8[10];
            double d69 = dArr8[14];
            double d70 = dArr8[3];
            double d71 = dArr8[7];
            double d72 = dArr8[11];
            double d73 = dArr8[15];
            double d74 = dArr9[0];
            double d75 = dArr9[1];
            double d76 = dArr9[2];
            double d77 = dArr9[3];
            dArr2[0] = (d58 * d74) + (d62 * d75) + (d66 * d76) + (d70 * d77);
            dArr2[1] = (d59 * d74) + (d63 * d75) + (d67 * d76) + (d71 * d77);
            dArr2[2] = (d60 * d74) + (d64 * d75) + (d68 * d76) + (d72 * d77);
            dArr2[3] = (d74 * d61) + (d75 * d65) + (d76 * d69) + (d77 * d73);
        }
        int i4 = 0;
        do {
            dArr5[i4] = dArr7[3][i4];
            i4++;
        } while (i4 < 3);
        double[][] dArr10 = LIZJ;
        int i5 = 0;
        do {
            double[] dArr11 = dArr10[i5];
            double[] dArr12 = dArr7[i5];
            dArr11[0] = dArr12[0];
            dArr11[1] = dArr12[1];
            dArr11[2] = dArr12[2];
            i5++;
        } while (i5 < 3);
        double dLJII = LJII(dArr10[0]);
        dArr3[0] = dLJII;
        double[] dArrLJIIIIZZ = LJIIIIZZ(dLJII, dArr10[0]);
        dArr10[0] = dArrLJIIIIZZ;
        double dLJI = LJI(dArrLJIIIIZZ, dArr10[1]);
        dArr4[0] = dLJI;
        double[] dArrLJFF = LJFF(dArr10[1], dArr10[0], -dLJI);
        dArr10[1] = dArrLJFF;
        double dLJII2 = LJII(dArrLJFF);
        dArr3[1] = dLJII2;
        dArr10[1] = LJIIIIZZ(dLJII2, dArr10[1]);
        dArr4[0] = dArr4[0] / dArr3[1];
        double dLJI2 = LJI(dArr10[0], dArr10[2]);
        dArr4[1] = dLJI2;
        double[] dArrLJFF2 = LJFF(dArr10[2], dArr10[0], -dLJI2);
        dArr10[2] = dArrLJFF2;
        double dLJI3 = LJI(dArr10[1], dArrLJFF2);
        dArr4[2] = dLJI3;
        double[] dArrLJFF3 = LJFF(dArr10[2], dArr10[1], -dLJI3);
        dArr10[2] = dArrLJFF3;
        double dLJII3 = LJII(dArrLJFF3);
        dArr3[2] = dLJII3;
        double[] dArrLJIIIIZZ2 = LJIIIIZZ(dLJII3, dArr10[2]);
        dArr10[2] = dArrLJIIIIZZ2;
        double d78 = dArr4[1];
        double d79 = dArr3[2];
        dArr4[1] = d78 / d79;
        dArr4[2] = dArr4[2] / d79;
        double[] dArr13 = dArr10[1];
        double d80 = dArr13[1];
        double d81 = dArrLJIIIIZZ2[2];
        double d82 = dArr13[2];
        double d83 = dArrLJIIIIZZ2[0];
        double d84 = dArr13[0];
        if (LJI(dArr10[0], new double[]{(d80 * d81) - (dArrLJIIIIZZ2[1] * d82), (d82 * d83) - (d81 * d84), (d84 * dArrLJIIIIZZ2[1]) - (dArr13[1] * d83)}) < 0.0d) {
            int i6 = 0;
            do {
                dArr3[i6] = dArr3[i6] * (-1.0d);
                double[] dArr14 = dArr10[i6];
                dArr14[0] = dArr14[0] * (-1.0d);
                dArr14[1] = dArr14[1] * (-1.0d);
                dArr14[2] = dArr14[2] * (-1.0d);
                i6++;
            } while (i6 < 3);
        }
        double[] dArr15 = dArr10[2];
        dArr6[0] = LJ((-Math.atan2(dArr15[1], dArr15[2])) * 57.29577951308232d);
        double[] dArr16 = dArr10[2];
        double d85 = -dArr16[0];
        double d86 = dArr16[1];
        double d87 = dArr16[2];
        dArr6[1] = LJ((-Math.atan2(d85, Math.sqrt((d86 * d86) + (d87 * d87)))) * 57.29577951308232d);
        dArr6[2] = LJ((-Math.atan2(dArr10[1][0], dArr10[0][0])) * 57.29577951308232d);
    }

    public static double LJI(double[] dArr, double[] dArr2) {
        return (dArr[0] * dArr2[0]) + (dArr[1] * dArr2[1]) + (dArr[2] * dArr2[2]);
    }

    public static double[] LJIIIIZZ(double d, double[] dArr) {
        if (LIZLLL(d)) {
            d = LJII(dArr);
        }
        double d2 = 1.0d / d;
        return new double[]{dArr[0] * d2, dArr[1] * d2, dArr[2] * d2};
    }

    public static double[] LJFF(double[] dArr, double[] dArr2, double d) {
        return new double[]{(dArr[0] * 1.0d) + (dArr2[0] * d), (dArr[1] * 1.0d) + (dArr2[1] * d), (1.0d * dArr[2]) + (d * dArr2[2])};
    }
}
