package X;

import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09hQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2441009hQ {
    public static final ThreadLocal<double[]> LIZ = new ThreadLocal<>();

    public static int LIZ(float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3 = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float fAbs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f) / 60) {
            case 0:
                iRound3 = Math.round((fAbs + f4) * 255.0f);
                iRound = Math.round((fAbs2 + f4) * 255.0f);
                iRound2 = Math.round(f4 * 255.0f);
                break;
            case 1:
                iRound3 = Math.round((fAbs2 + f4) * 255.0f);
                iRound = Math.round((fAbs + f4) * 255.0f);
                iRound2 = Math.round(f4 * 255.0f);
                break;
            case 2:
                iRound3 = Math.round(f4 * 255.0f);
                iRound = Math.round((fAbs + f4) * 255.0f);
                iRound2 = Math.round((fAbs2 + f4) * 255.0f);
                break;
            case 3:
                iRound3 = Math.round(f4 * 255.0f);
                iRound = Math.round((fAbs2 + f4) * 255.0f);
                iRound2 = Math.round((fAbs + f4) * 255.0f);
                break;
            case 4:
                iRound3 = Math.round((fAbs2 + f4) * 255.0f);
                iRound = Math.round(f4 * 255.0f);
                iRound2 = Math.round((fAbs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                iRound3 = Math.round((fAbs + f4) * 255.0f);
                iRound = Math.round(f4 * 255.0f);
                iRound2 = Math.round((fAbs2 + f4) * 255.0f);
                break;
            default:
                iRound2 = 0;
                iRound = 0;
                break;
        }
        return Color.rgb(LJIIJJI(iRound3), LJIIJJI(iRound), LJIIJJI(iRound2));
    }

    public static double LJIIIIZZ(int i) {
        C08FV c08fvLIZ;
        ThreadLocal<double[]> threadLocal = LIZ;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (C09EU.LIZIZ()) {
            try {
                LIZLLL(iRed, iGreen, iBlue, dArr);
                LIZLLL(iRed, iGreen, iBlue, dArr);
            } finally {
                if (c08fvLIZ == null) {
                }
            }
        } else {
            LIZLLL(iRed, iGreen, iBlue, dArr);
        }
        return dArr[1] / 100.0d;
    }

    public static int LJIIJJI(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    public static double LJ(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = LJIIJ(i, i2);
            }
            double dLJIIIIZZ = LJIIIIZZ(i) + 0.05d;
            double dLJIIIIZZ2 = LJIIIIZZ(i2) + 0.05d;
            return Math.max(dLJIIIIZZ, dLJIIIIZZ2) / Math.min(dLJIIIIZZ, dLJIIIIZZ2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("background can not be translucent: #");
        sbLIZ.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static double LJII(int i, int i2) {
        if (C09EU.LIZIZ()) {
            try {
                return LJ(i, i2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Double d = (Double) C08FI.tryProtect(th, Double.class);
                if (d != null) {
                    return d.doubleValue();
                }
                throw th;
            }
        }
        return LJ(i, i2);
    }

    public static int LJIIJ(int i, int i2) {
        int i3;
        int i4;
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i5 = 255 - iAlpha2;
        int i6 = 255 - (((255 - iAlpha) * i5) / 255);
        int iRed = Color.red(i);
        int iRed2 = Color.red(i2);
        int i7 = 0;
        if (i6 == 0) {
            i3 = 0;
        } else {
            i3 = (((iRed * 255) * iAlpha2) + ((iRed2 * iAlpha) * i5)) / (i6 * 255);
        }
        int iGreen = Color.green(i);
        int iGreen2 = Color.green(i2);
        if (i6 == 0) {
            i4 = 0;
        } else {
            i4 = (((iGreen * 255) * iAlpha2) + ((iGreen2 * iAlpha) * i5)) / (i6 * 255);
        }
        int iBlue = Color.blue(i);
        int iBlue2 = Color.blue(i2);
        if (i6 != 0) {
            i7 = (((iBlue * 255) * iAlpha2) + ((iBlue2 * iAlpha) * i5)) / (i6 * 255);
        }
        return Color.argb(i6, i3, i4, i7);
    }

    public static int LJIIL(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int LIZJ(double d, double d2, double d3) {
        double dPow;
        double dPow2;
        double dPow3;
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        if (d4 > 0.0031308d) {
            dPow = (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            dPow = d4 * 12.92d;
        }
        if (d5 > 0.0031308d) {
            dPow2 = (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            dPow2 = d5 * 12.92d;
        }
        if (d6 > 0.0031308d) {
            dPow3 = (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            dPow3 = d6 * 12.92d;
        }
        return Color.rgb(LJIIJJI((int) Math.round(dPow * 255.0d)), LJIIJJI((int) Math.round(dPow2 * 255.0d)), LJIIJJI((int) Math.round(dPow3 * 255.0d)));
    }

    public static int LJFF(float f, int i, int i2) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = f;
            if (LJII(LJIIL(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            int i5 = 0;
            do {
                int i6 = (i5 + i3) / 2;
                if (LJII(LJIIL(i, i6), i2) < d) {
                    i5 = i6;
                } else {
                    i3 = i6;
                }
                i4++;
                if (i4 > 10) {
                    break;
                }
            } while (i3 - i5 > 1);
            return i3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("background can not be translucent: #");
        sbLIZ.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static int LJI(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public static int LJIIIZ(float f, int i, int i2) {
        if (C09EU.LIZIZ()) {
            try {
                return LJFF(f, i, i2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Integer num = (Integer) C08FI.tryProtect(th, Integer.class);
                if (num != null) {
                    return num.intValue();
                }
                throw th;
            }
        }
        return LJFF(f, i, i2);
    }

    public static void LIZIZ(int i, int i2, int i3, float[] fArr) {
        float f;
        float fAbs;
        float fMin;
        float fMin2;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin3 = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin3;
        float f6 = (fMax + fMin3) / 2.0f;
        float fMin4 = 0.0f;
        if (fMax == fMin3) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else if (fMax == f3) {
                f = ((f4 - f2) / f5) + 2.0f;
            } else {
                f = 4.0f + ((f2 - f3) / f5);
            }
            fAbs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        if (f7 < 0.0f) {
            fMin = 0.0f;
        } else {
            fMin = Math.min(f7, 360.0f);
        }
        fArr[0] = fMin;
        if (fAbs < 0.0f) {
            fMin2 = 0.0f;
        } else {
            fMin2 = Math.min(fAbs, 1.0f);
        }
        fArr[1] = fMin2;
        if (f6 >= 0.0f) {
            fMin4 = Math.min(f6, 1.0f);
        }
        fArr[2] = fMin4;
    }

    public static void LIZLLL(int i, int i2, int i3, double[] dArr) {
        double dPow;
        double dPow2;
        double dPow3;
        if (dArr.length == 3) {
            double d = ((double) i) / 255.0d;
            if (d < 0.04045d) {
                dPow = d / 12.92d;
            } else {
                dPow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d2 = ((double) i2) / 255.0d;
            if (d2 < 0.04045d) {
                dPow2 = d2 / 12.92d;
            } else {
                dPow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = ((double) i3) / 255.0d;
            if (d3 < 0.04045d) {
                dPow3 = d3 / 12.92d;
            } else {
                dPow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
            dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
            dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }
}
