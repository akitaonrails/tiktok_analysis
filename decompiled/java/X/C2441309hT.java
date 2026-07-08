package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.09hT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2441309hT {
    public static final List<Character> LIZJ;
    public static final Map LIZLLL;
    public final SparseArray<double[]> LIZ = new SparseArray<>();
    public final SparseArray<double[]> LIZIZ = new SparseArray<>();

    static {
        List<Character> listAsList = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '#', '$', '%', '*', '+', ',', '-', '.', ':', ';', '=', '?', '@', '[', ']', '^', '_', '{', '|', '}', '~');
        LIZJ = listAsList;
        HashMap map = new HashMap();
        for (int i = 0; i < listAsList.size(); i++) {
            map.put(listAsList.get(i), Integer.valueOf(i));
        }
        LIZLLL = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b A[PHI: r1
      0x000b: PHI (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:3:0x0003, B:5:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(float r3) {
        /*
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Lb
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lc
        Lb:
            r3 = r1
        Lc:
            r0 = 994913820(0x3b4d2e1c, float:0.0031308)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L1f
            r0 = 1095678034(0x414eb852, float:12.92)
            float r3 = r3 * r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r0
            int r0 = (int) r3
            return r0
        L1f:
            double r2 = (double) r3
            r0 = 4601177619117899776(0x3fdaaaaaa0000000, double:0.4166666567325592)
            double r2 = java.lang.Math.pow(r2, r0)
            r0 = 4607430116543299584(0x3ff0e147a0000000, double:1.0549999475479126)
            double r2 = r2 * r0
            r0 = 4588087156337016832(0x3fac28f5c0000000, double:0.054999999701976776)
            double r2 = r2 - r0
            r0 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r2 = r2 * r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r0
            int r0 = (int) r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2441309hT.LIZJ(float):int");
    }

    public static float LIZLLL(int i) {
        float f = i / 255.0f;
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int LIZIZ(int i, int i2, String str) {
        int iIntValue;
        int i3 = 0;
        while (i < i2) {
            Integer num = (Integer) ((HashMap) LIZLLL).get(Character.valueOf(str.charAt(i)));
            if (num != null && (iIntValue = num.intValue()) != -1) {
                i3 = (i3 * 83) + iIntValue;
            }
            i++;
        }
        return i3;
    }

    public final Bitmap LIZ(float f, int i, int i2, String str, boolean z) {
        boolean z2;
        double[] dArr;
        boolean z3;
        double[] dArr2;
        if (str != null) {
            int i3 = 6;
            if (str.length() >= 6) {
                char c = 0;
                char c2 = 1;
                int iLIZIZ = LIZIZ(0, 1, str);
                int i4 = (iLIZIZ % 9) + 1;
                int i5 = (iLIZIZ / 9) + 1;
                if (str.length() != (i4 * 2 * i5) + 4) {
                    return null;
                }
                int i6 = 2;
                float fLIZIZ = (LIZIZ(1, 2, str) + 1) / 166.0f;
                int i7 = i4 * i5;
                float[][] fArr = new float[i7][];
                int i8 = 0;
                while (i8 < i7) {
                    if (i8 == 0) {
                        int iLIZIZ2 = LIZIZ(i6, i3, str);
                        int i9 = iLIZIZ2 >> 16;
                        int i10 = (iLIZIZ2 >> 8) & 255;
                        int i11 = iLIZIZ2 & 255;
                        float[] fArr2 = new float[3];
                        fArr2[c] = LIZLLL(i9);
                        fArr2[c2] = LIZLLL(i10);
                        fArr2[i6] = LIZLLL(i11);
                        fArr[i8] = fArr2;
                    } else {
                        int i12 = (i8 * 2) + 4;
                        int iLIZIZ3 = LIZIZ(i12, i12 + 2, str);
                        float f2 = fLIZIZ * f;
                        float f3 = ((iLIZIZ3 / 361) - 9) / 9.0f;
                        float f4 = (((iLIZIZ3 / 19) % 19) - 9) / 9.0f;
                        float f5 = ((iLIZIZ3 % 19) - 9) / 9.0f;
                        fArr[i8] = new float[]{Math.copySign((float) Math.pow(f3, 2.0d), f3) * f2, Math.copySign((float) Math.pow(f4, 2.0d), f4) * f2, Math.copySign((float) Math.pow(f5, 2.0d), f5) * f2};
                    }
                    i8++;
                    c = 0;
                    i3 = 6;
                    c2 = 1;
                    i6 = 2;
                }
                int[] iArr = new int[i * i2];
                if (z && this.LIZ.get(i2 * i5) != null) {
                    z2 = false;
                    double[] dArr3 = this.LIZ.get(i * i4);
                    if (dArr3 != null) {
                        dArr = dArr3;
                    } else {
                        dArr = null;
                    }
                } else {
                    z2 = true;
                    int i13 = i * i4;
                    dArr = new double[i13];
                    this.LIZ.put(i13, dArr);
                }
                if (z && this.LIZIZ.get(i2 * i5) != null) {
                    z3 = false;
                    dArr2 = this.LIZIZ.get(i2 * i5);
                    if (dArr2 == null) {
                        dArr2 = null;
                    }
                } else {
                    z3 = true;
                    int i14 = i2 * i5;
                    dArr2 = new double[i14];
                    this.LIZIZ.put(i14, dArr2);
                }
                if (dArr != null && dArr2 != null) {
                    for (int i15 = 0; i15 < i2; i15++) {
                        for (int i16 = 0; i16 < i; i16++) {
                            float f6 = 0.0f;
                            float f7 = 0.0f;
                            float f8 = 0.0f;
                            for (int i17 = 0; i17 < i5; i17++) {
                                for (int i18 = 0; i18 < i4; i18++) {
                                    if (z2) {
                                        z2 = true;
                                        dArr[(i4 * i16) + i18] = Math.cos(((((double) i16) * 3.141592653589793d) * ((double) i18)) / ((double) i));
                                    } else {
                                        z2 = false;
                                    }
                                    double d = dArr[(i4 * i16) + i18];
                                    if (z3) {
                                        z3 = true;
                                        dArr2[(i5 * i15) + i17] = Math.cos(((((double) i15) * 3.141592653589793d) * ((double) i17)) / ((double) i2));
                                    } else {
                                        z3 = false;
                                    }
                                    float f9 = (float) (dArr2[(i5 * i15) + i17] * d);
                                    float[] fArr3 = fArr[(i17 * i4) + i18];
                                    f6 += fArr3[0] * f9;
                                    f7 += fArr3[1] * f9;
                                    f8 += fArr3[2] * f9;
                                }
                            }
                            iArr[(i * i15) + i16] = Color.rgb(LIZJ(f6), LIZJ(f7), LIZJ(f8));
                        }
                    }
                    return Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
                }
                return null;
            }
        }
        return null;
    }
}
