package X;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: X.09In, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2349509In {
    public static void LIZ(Bitmap bitmap, Bitmap bitmap2, int i) {
        if (i < 1) {
            return;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i2 = width * height;
        int[] iArr = new int[i2];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i3 = width - 1;
        int i4 = height - 1;
        int i5 = i + i + 1;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        int[] iArr4 = new int[i2];
        int[] iArr5 = new int[Math.max(width, height)];
        int i6 = (i5 + 1) >> 1;
        int i7 = i6 * i6;
        int i8 = i7 * 256;
        int[] iArr6 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr6[i9] = i9 / i7;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i5, 3);
        int i10 = i + 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < height; i13++) {
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = -i; i23 <= i; i23++) {
                int i24 = iArr[i11 + Math.min(i3, Math.max(i23, 0))];
                int[] iArr8 = iArr7[i23 + i];
                iArr8[0] = (i24 & 16711680) >> 16;
                iArr8[1] = (i24 & 65280) >> 8;
                iArr8[2] = i24 & 255;
                int iAbs = i10 - Math.abs(i23);
                int i25 = iArr8[0];
                i22 += i25 * iAbs;
                int i26 = iArr8[1];
                i14 += i26 * iAbs;
                int i27 = iArr8[2];
                i15 += iAbs * i27;
                if (i23 > 0) {
                    i19 += i25;
                    i20 += i26;
                    i21 += i27;
                } else {
                    i16 += i25;
                    i17 += i26;
                    i18 += i27;
                }
            }
            int i28 = i;
            for (int i29 = 0; i29 < width; i29++) {
                iArr2[i11] = iArr6[i22];
                iArr3[i11] = iArr6[i14];
                iArr4[i11] = iArr6[i15];
                int i30 = i22 - i16;
                int i31 = i14 - i17;
                int i32 = i15 - i18;
                int[] iArr9 = iArr7[((i28 - i) + i5) % i5];
                int i33 = i16 - iArr9[0];
                int i34 = i17 - iArr9[1];
                int i35 = i18 - iArr9[2];
                if (i13 == 0) {
                    iArr5[i29] = Math.min(i29 + i + 1, i3);
                }
                int i36 = iArr[i12 + iArr5[i29]];
                int i37 = (i36 & 16711680) >> 16;
                iArr9[0] = i37;
                int i38 = (i36 & 65280) >> 8;
                iArr9[1] = i38;
                int i39 = i36 & 255;
                iArr9[2] = i39;
                int i40 = i19 + i37;
                int i41 = i20 + i38;
                int i42 = i21 + i39;
                i22 = i30 + i40;
                i14 = i31 + i41;
                i15 = i32 + i42;
                i28 = (i28 + 1) % i5;
                int[] iArr10 = iArr7[i28 % i5];
                int i43 = iArr10[0];
                i16 = i33 + i43;
                int i44 = iArr10[1];
                i17 = i34 + i44;
                int i45 = iArr10[2];
                i18 = i35 + i45;
                i19 = i40 - i43;
                i20 = i41 - i44;
                i21 = i42 - i45;
                i11++;
            }
            i12 += width;
        }
        for (int i46 = 0; i46 < width; i46++) {
            int i47 = -i;
            int i48 = i47 * width;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            while (i47 <= i) {
                int iMax = Math.max(0, i48) + i46;
                int[] iArr11 = iArr7[i47 + i];
                iArr11[0] = iArr2[iMax];
                iArr11[1] = iArr3[iMax];
                iArr11[2] = iArr4[iMax];
                int iAbs2 = i10 - Math.abs(i47);
                i56 += iArr2[iMax] * iAbs2;
                i57 += iArr3[iMax] * iAbs2;
                i49 += iArr4[iMax] * iAbs2;
                if (i47 > 0) {
                    i53 += iArr11[0];
                    i54 += iArr11[1];
                    i55 += iArr11[2];
                } else {
                    i50 += iArr11[0];
                    i51 += iArr11[1];
                    i52 += iArr11[2];
                }
                if (i47 < i4) {
                    i48 += width;
                }
                i47++;
            }
            int i58 = i;
            int i59 = i46;
            for (int i60 = 0; i60 < height; i60++) {
                iArr[i59] = (iArr[i59] & (-16777216)) | (iArr6[i56] << 16) | (iArr6[i57] << 8) | iArr6[i49];
                int i61 = i56 - i50;
                int i62 = i57 - i51;
                int i63 = i49 - i52;
                int[] iArr12 = iArr7[((i58 - i) + i5) % i5];
                int i64 = i50 - iArr12[0];
                int i65 = i51 - iArr12[1];
                int i66 = i52 - iArr12[2];
                if (i46 == 0) {
                    iArr5[i60] = Math.min(i60 + i10, i4) * width;
                }
                int i67 = iArr5[i60] + i46;
                int i68 = iArr2[i67];
                iArr12[0] = i68;
                int i69 = iArr3[i67];
                iArr12[1] = i69;
                int i70 = iArr4[i67];
                iArr12[2] = i70;
                int i71 = i53 + i68;
                int i72 = i54 + i69;
                int i73 = i55 + i70;
                i56 = i61 + i71;
                i57 = i62 + i72;
                i49 = i63 + i73;
                i58 = (i58 + 1) % i5;
                int[] iArr13 = iArr7[i58];
                int i74 = iArr13[0];
                i50 = i64 + i74;
                int i75 = iArr13[1];
                i51 = i65 + i75;
                int i76 = iArr13[2];
                i52 = i66 + i76;
                i53 = i71 - i74;
                i54 = i72 - i75;
                i55 = i73 - i76;
                i59 += width;
            }
        }
        bitmap2.setPixels(iArr, 0, width, 0, 0, width, height);
    }
}
