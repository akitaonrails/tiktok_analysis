package X;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: X.0H6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435560H6c {
    public static final /* synthetic */ int LIZ = 0;

    public static int[] LIZIZ(int i, int i2, Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = width * height;
        int[] iArr = new int[i3];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr2[i4] = 0;
        }
        int[][] iArr3 = {new int[]{-1, 0, 1}, new int[]{-2, 0, 2}, new int[]{-1, 0, 1}};
        int[][] iArr4 = {new int[]{-1, -2, -1}, new int[]{0, 0, 0}, new int[]{1, 2, 1}};
        int i5 = height - 1;
        for (int i6 = 1; i6 < i5; i6++) {
            int i7 = width - 1;
            for (int i8 = 1; i8 < i7; i8++) {
                int i9 = 0;
                int i10 = 0;
                int i11 = -1;
                do {
                    int i12 = -1;
                    do {
                        int i13 = (iArr[((i6 + i11) * width) + (i8 + i12)] >>> 24) & 255;
                        int i14 = i11 + 1;
                        i12++;
                        i9 += iArr3[i14][i12] * i13;
                        i10 += iArr4[i14][i12] * i13;
                    } while (i12 < 2);
                    i11++;
                } while (i11 < 2);
                if (((int) Math.sqrt((i9 * i9) + (i10 * i10))) > i) {
                    iArr2[(i6 * width) + i8] = i2;
                }
            }
        }
        return iArr2;
    }

    public static Bitmap LIZ(Bitmap bitmap, int i, int i2, int i3) {
        Bitmap bitmapExtractAlpha = bitmap.extractAlpha();
        Paint paint = new Paint();
        paint.setColor(i3);
        paint.setMaskFilter(new BlurMaskFilter(16.0f, BlurMaskFilter.Blur.NORMAL));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapExtractAlpha, 0.0f, 0.0f, paint);
        C786410Ut5.LJJJJ(bitmapExtractAlpha);
        return bitmapCreateBitmap;
    }

    public static int[] LIZLLL(int i, int i2, int i3, int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 0;
            while (true) {
                if (i5 < i) {
                    if (iArr2[(i4 * i) + i5] != 0) {
                        break;
                    }
                    i5++;
                } else {
                    i5 = -1;
                    break;
                }
            }
            int i6 = i - 1;
            while (true) {
                if (-1 < i6) {
                    if (iArr2[(i4 * i) + i6] != 0) {
                        break;
                    }
                    i6--;
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i5 != -1 && i6 > i5) {
                while (true) {
                    i5++;
                    if (i5 < i6) {
                        iArr2[(i4 * i) + i5] = i3;
                    }
                }
            }
        }
        return iArr2;
    }

    public static Bitmap LIZJ(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        int i6 = i * i2;
        int[] iArr2 = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            iArr2[i7] = 0;
        }
        int i8 = i3 * i3;
        for (int i9 = 0; i9 < i2; i9++) {
            for (int i10 = 0; i10 < i; i10++) {
                if (iArr[(i9 * i) + i10] != 0 && (i5 = -i3) <= i3) {
                    int i11 = i5;
                    while (true) {
                        if (i5 <= i3) {
                            int i12 = i5;
                            while (true) {
                                if ((i12 * i12) + (i11 * i11) <= i8) {
                                    int i13 = i9 + i11;
                                    int i14 = i10 + i12;
                                    if (i13 >= 0 && i13 < i2 && i14 >= 0 && i14 < i) {
                                        iArr2[(i13 * i) + i14] = i4;
                                    }
                                }
                                if (i12 == i3) {
                                    break;
                                }
                                i12++;
                            }
                        }
                        if (i11 != i3) {
                            i11++;
                        }
                    }
                }
            }
        }
        bitmapCreateBitmap.setPixels(iArr2, 0, i, 0, 0, i, i2);
        return bitmapCreateBitmap;
    }
}
