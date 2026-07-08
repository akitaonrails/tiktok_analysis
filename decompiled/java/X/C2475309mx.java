package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.BufferedOutputStream;

/* JADX INFO: renamed from: X.09mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2475309mx {
    public static int LIZIZ(String str) throws Throwable {
        if (!C2286708xd.LIZJ(str)) {
            return 0;
        }
        try {
            int iLJLILLLLZI = C2204961BRm.LJLILLLLZI(C2471909mP.LJIILL(str), 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPitcJbU2XwB6AfpVHw1nBBQmOz4", null));
            if (iLJLILLLLZI != 3) {
                if (iLJLILLLLZI != 6) {
                    if (iLJLILLLLZI != 8) {
                        return 0;
                    }
                    return 270;
                }
                return 90;
            }
            return 180;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static int[] LIZJ(String str) {
        if (!C2286708xd.LIZJ(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C2471909mP.LIZLLL(str, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        int[] iArr = {i, i2};
        if (i == 0 || i2 == 0) {
            return null;
        }
        return iArr;
    }

    public static void LJ(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
    }

    public static Bitmap LIZLLL(Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        LJ(bitmap);
        return bitmapCreateBitmap;
    }

    public static Bitmap LIZ(int i, int i2, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i3 = 1;
        options.inJustDecodeBounds = true;
        C2471909mP.LJ(str, options);
        if (i != 0 && i2 != 0) {
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            if (i4 > i || i5 > i2) {
                int i6 = i4 >> 1;
                int i7 = i5 >> 1;
                while (i6 / i3 > i && i7 / i3 > i2 && (i3 = i3 << 1) != 0) {
                }
            }
        }
        options.inSampleSize = i3;
        options.inJustDecodeBounds = false;
        return C2471909mP.LIZLLL(str, options);
    }

    public static Bitmap LJIIIIZZ(int i, int i2, Bitmap bitmap) {
        float f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f2 = 0.0f;
        if (i > i2) {
            float f3 = (i * 1.0f) / i2;
            float f4 = width / f3;
            if (height > f4) {
                f = (height - f4) / 2.0f;
                height = f4;
            } else {
                float f5 = f3 * height;
                f = 0.0f;
                f2 = (width - f5) / 2.0f;
                width = f5;
            }
        } else if (i < i2) {
            float f6 = (i2 * 1.0f) / i;
            float f7 = height / f6;
            if (width > f7) {
                f2 = (width - f7) / 2.0f;
                width = f7;
                f = 0.0f;
            } else {
                float f8 = f6 * width;
                f = (height - f8) / 2.0f;
                height = f8;
            }
        } else if (width > height) {
            f = 0.0f;
            f2 = (width - height) / 2.0f;
            width = height;
        } else {
            f = (height - width) / 2.0f;
            height = width;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Rect rect = new Rect((int) f2, (int) f, (int) (f2 + width), (int) (f + height));
        Rect rect2 = new Rect(0, 0, i, i2);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        LJ(bitmap);
        return bitmapCreateBitmap;
    }

    public static boolean LJFF(int i, Bitmap.CompressFormat compressFormat, Bitmap bitmap, C0VSJ c0vsj) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                if (bitmap.isRecycled()) {
                    return false;
                }
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new C0VSV(c0vsj));
                try {
                    bitmap.compress(compressFormat, i, bufferedOutputStream2);
                    bufferedOutputStream2.flush();
                    try {
                        bufferedOutputStream2.close();
                        return true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return true;
                    }
                } catch (Exception e) {
                    e = e;
                    bufferedOutputStream = bufferedOutputStream2;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = bufferedOutputStream2;
                    TryCatchGuardChecker.doCheck(th);
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                            throw th;
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            TryCatchGuardChecker.doCheck(e);
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                    return false;
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
            }
            return false;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static Bitmap LJI(int i, int i2, int i3, int i4, String str) {
        try {
            Bitmap bitmapLIZ = LIZ(i, i2, str);
            if (bitmapLIZ == null) {
                return null;
            }
            return LJII(bitmapLIZ, i, i2, i3, i4);
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 < r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r10 < r3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap LJII(android.graphics.Bitmap r15, int r16, int r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2475309mx.LJII(android.graphics.Bitmap, int, int, int, int):android.graphics.Bitmap");
    }
}
