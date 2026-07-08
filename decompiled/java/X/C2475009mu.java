package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.BufferedOutputStream;
import java.io.File;

/* JADX INFO: renamed from: X.09mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2475009mu {
    public static int[] LIZJ(String str) throws Throwable {
        if (!C2286708xd.LIZJ(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C2471909mP.LIZLLL(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    public static void LJ(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
    }

    public static Bitmap LIZ(String str, int[] iArr) {
        return LIZIZ(str, iArr, Bitmap.Config.RGB_565);
    }

    public static Bitmap LIZLLL(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap != null && !bitmap.isRecycled()) {
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                Paint paint = new Paint(2);
                Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                new Canvas(bitmapCopy).drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), paint);
                return bitmapCopy;
            }
            return bitmap;
        }
        return bitmap2;
    }

    public static Bitmap LIZIZ(String str, int[] iArr, Bitmap.Config config) throws Throwable {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = config;
        C2471909mP.LJ(str, options);
        options.inJustDecodeBounds = false;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (i3 >= i4 && i3 > i5) {
            i = i3 / i5;
        } else if (i3 < i4 && i4 > i6) {
            i = i4 / i6;
        } else {
            i = 1;
            i2 = i;
            options.inSampleSize = i2;
            return C2471909mP.LIZLLL(str, options);
        }
        if (i > 0) {
            i2 = i;
        }
        options.inSampleSize = i2;
        return C2471909mP.LIZLLL(str, options);
    }

    public static boolean LJFF(int i, Bitmap.CompressFormat compressFormat, Bitmap bitmap, File file) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                if (bitmap.isRecycled()) {
                    return false;
                }
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new C0VSV(file));
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
}
