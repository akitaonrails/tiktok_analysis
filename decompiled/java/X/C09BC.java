package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.09BC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09BC {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(float f, Bitmap bitmap) {
        int i;
        if (bitmap != null && !bitmap.isRecycled()) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, C814420VxA.LIZIZ(bitmap.getWidth() * f), C814420VxA.LIZIZ(bitmap.getHeight() * f), false);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.RGB_565;
            }
            Bitmap bitmapCopy = bitmapCreateScaledBitmap.copy(config, true);
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            int i2 = width * height;
            int[] iArr = new int[i2];
            bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i3 = width - 1;
            int i4 = height - 1;
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            int[] iArr4 = new int[i2];
            int[] iArr5 = new int[Math.max(width, height)];
            int[] iArr6 = new int[246016];
            int i5 = 0;
            do {
                iArr6[i5] = i5 / 961;
                i5++;
            } while (i5 < 246016);
            int[][] iArr7 = new int[61][];
            int i6 = 0;
            do {
                iArr7[i6] = new int[3];
                i6++;
            } while (i6 < 61);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = 30;
                if (i7 >= height) {
                    break;
                }
                int i11 = -30;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                while (i11 <= i10) {
                    int i21 = iArr[Math.min(i3, Math.max(i11, 0)) + i8];
                    int[] iArr8 = iArr7[i11 + 30];
                    iArr8[0] = (i21 & 16711680) >> 16;
                    iArr8[1] = (i21 & 65280) >> 8;
                    iArr8[2] = i21 & 255;
                    int iAbs = 31 - Math.abs(i11);
                    int i22 = iArr8[0];
                    i12 += i22 * iAbs;
                    int i23 = iArr8[1];
                    i13 += i23 * iAbs;
                    int i24 = iArr8[2];
                    i14 += iAbs * i24;
                    if (i11 > 0) {
                        i18 += i22;
                        i19 += i23;
                        i20 += i24;
                    } else {
                        i15 += i22;
                        i16 += i23;
                        i17 += i24;
                    }
                    i11++;
                    i10 = 30;
                }
                for (int i25 = 0; i25 < width; i25++) {
                    iArr2[i8] = iArr6[i12];
                    iArr3[i8] = iArr6[i13];
                    iArr4[i8] = iArr6[i14];
                    int i26 = i12 - i15;
                    int i27 = i13 - i16;
                    int i28 = i14 - i17;
                    int[] iArr9 = iArr7[((i10 - 30) + 61) % 61];
                    int i29 = i15 - iArr9[0];
                    int i30 = i16 - iArr9[1];
                    int i31 = i17 - iArr9[2];
                    if (i7 == 0) {
                        iArr5[i25] = Math.min(i25 + 30 + 1, i3);
                    }
                    int i32 = iArr[i9 + iArr5[i25]];
                    int i33 = (i32 & 16711680) >> 16;
                    iArr9[0] = i33;
                    int i34 = (i32 & 65280) >> 8;
                    iArr9[1] = i34;
                    int i35 = i32 & 255;
                    iArr9[2] = i35;
                    int i36 = i18 + i33;
                    int i37 = i19 + i34;
                    int i38 = i20 + i35;
                    i12 = i26 + i36;
                    i13 = i27 + i37;
                    i14 = i28 + i38;
                    i10 = (i10 + 1) % 61;
                    int[] iArr10 = iArr7[i10 % 61];
                    int i39 = iArr10[0];
                    i15 = i29 + i39;
                    int i40 = iArr10[1];
                    i16 = i30 + i40;
                    int i41 = iArr10[2];
                    i17 = i31 + i41;
                    i18 = i36 - i39;
                    i19 = i37 - i40;
                    i20 = i38 - i41;
                    i8++;
                }
                i9 += width;
                i7++;
            }
            for (int i42 = 0; i42 < width; i42++) {
                int i43 = width * (-30);
                int i44 = -30;
                int i45 = 0;
                int i46 = 0;
                int i47 = 0;
                int i48 = 0;
                int i49 = 0;
                int i50 = 0;
                int i51 = 0;
                int i52 = 0;
                int i53 = 0;
                do {
                    int iMax = Math.max(0, i43) + i42;
                    int[] iArr11 = iArr7[i44 + 30];
                    iArr11[0] = iArr2[iMax];
                    iArr11[1] = iArr3[iMax];
                    iArr11[2] = iArr4[iMax];
                    int iAbs2 = 31 - Math.abs(i44);
                    i45 += iArr2[iMax] * iAbs2;
                    i46 += iArr3[iMax] * iAbs2;
                    i47 += iArr4[iMax] * iAbs2;
                    if (i44 > 0) {
                        i51 += iArr11[0];
                        i52 += iArr11[1];
                        i53 += iArr11[2];
                    } else {
                        i48 += iArr11[0];
                        i49 += iArr11[1];
                        i50 += iArr11[2];
                    }
                    if (i44 < i4) {
                        i43 += width;
                    }
                    i44++;
                    i = 30;
                } while (i44 <= 30);
                int i54 = i42;
                for (int i55 = 0; i55 < height; i55++) {
                    iArr[i54] = (iArr[i54] & (-16777216)) | (iArr6[i45] << 16) | (iArr6[i46] << 8) | iArr6[i47];
                    int i56 = i45 - i48;
                    int i57 = i46 - i49;
                    int i58 = i47 - i50;
                    int[] iArr12 = iArr7[((i - 30) + 61) % 61];
                    int i59 = i48 - iArr12[0];
                    int i60 = i49 - iArr12[1];
                    int i61 = i50 - iArr12[2];
                    if (i42 == 0) {
                        iArr5[i55] = Math.min(i55 + 31, i4) * width;
                    }
                    int i62 = iArr5[i55] + i42;
                    int i63 = iArr2[i62];
                    iArr12[0] = i63;
                    int i64 = iArr3[i62];
                    iArr12[1] = i64;
                    int i65 = iArr4[i62];
                    iArr12[2] = i65;
                    int i66 = i51 + i63;
                    int i67 = i52 + i64;
                    int i68 = i53 + i65;
                    i45 = i56 + i66;
                    i46 = i57 + i67;
                    i47 = i58 + i68;
                    i = (i + 1) % 61;
                    int[] iArr13 = iArr7[i];
                    int i69 = iArr13[0];
                    i48 = i59 + i69;
                    int i70 = iArr13[1];
                    i49 = i60 + i70;
                    int i71 = iArr13[2];
                    i50 = i61 + i71;
                    i51 = i66 - i69;
                    i52 = i67 - i70;
                    i53 = i68 - i71;
                    i54 += width;
                }
            }
            bitmapCopy.setPixels(iArr, 0, width, 0, 0, width, height);
            bitmapCreateScaledBitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateScaledBitmap);
            return bitmapCopy;
        }
        return null;
    }
}
