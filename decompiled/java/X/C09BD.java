package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.09BD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C09BD {
    public static void LIZ(int i, int i2, Bitmap bitmap) {
        int i3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i4 = i2 + 1;
        int i5 = i4 + i2;
        int[] iArr2 = new int[i5 * 256];
        int i6 = 1;
        do {
            for (int i7 = 0; i7 < i5; i7++) {
                iArr2[i4] = i6;
                i4++;
            }
            i6++;
        } while (i6 <= 255);
        int[] iArr3 = new int[Math.max(width, height)];
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = 0;
            while (i9 < height) {
                int i10 = width * i9;
                i9++;
                int i11 = (i9 * width) - 1;
                int i12 = i5 >> 1;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                for (int i17 = -i12; i17 < width + i12; i17++) {
                    int i18 = i10 + i17;
                    if (i18 < i10) {
                        i18 = i10;
                    } else if (i18 > i11) {
                        i18 = i11;
                    }
                    int i19 = iArr[i18];
                    i13 += (i19 >> 16) & 255;
                    i14 += (i19 >> 8) & 255;
                    i15 += i19 & 255;
                    i16 += i19 >>> 24;
                    if (i17 >= i12) {
                        iArr3[i17 - i12] = (iArr2[i16] << 24) | (iArr2[i13] << 16) | (iArr2[i14] << 8) | iArr2[i15];
                        int i20 = (i17 - (i5 - 1)) + i10;
                        if (i20 < i10) {
                            i20 = i10;
                        } else if (i20 > i11) {
                            i20 = i11;
                        }
                        int i21 = iArr[i20];
                        i13 -= (i21 >> 16) & 255;
                        i14 -= (i21 >> 8) & 255;
                        i15 -= i21 & 255;
                        i16 -= i21 >>> 24;
                    }
                }
                System.arraycopy(iArr3, 0, iArr, i10, width);
            }
            for (int i22 = 0; i22 < width; i22++) {
                int i23 = ((height - 1) * width) + i22;
                int i24 = (i5 >> 1) * width;
                int i25 = (i5 - 1) * width;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                for (int i31 = i22 - i24; i31 <= i23 + i24; i31 += width) {
                    if (i31 < i22) {
                        i3 = i22;
                    } else if (i31 > i23) {
                        i3 = i23;
                    } else {
                        i3 = i31;
                    }
                    int i32 = iArr[i3];
                    i26 += (i32 >> 16) & 255;
                    i27 += (i32 >> 8) & 255;
                    i28 += i32 & 255;
                    i29 += i32 >>> 24;
                    if (i31 - i24 >= i22) {
                        iArr3[i30] = (iArr2[i29] << 24) | (iArr2[i26] << 16) | (iArr2[i27] << 8) | iArr2[i28];
                        i30++;
                        int i33 = i31 - i25;
                        if (i33 < i22) {
                            i33 = i22;
                        } else if (i33 > i23) {
                            i33 = i23;
                        }
                        int i34 = iArr[i33];
                        i26 -= (i34 >> 16) & 255;
                        i27 -= (i34 >> 8) & 255;
                        i28 -= i34 & 255;
                        i29 -= i34 >>> 24;
                    }
                }
                int i35 = i22;
                for (int i36 = 0; i36 < height; i36++) {
                    iArr[i35] = iArr3[i36];
                    i35 += width;
                }
            }
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }
}
