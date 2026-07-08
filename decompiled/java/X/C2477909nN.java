package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.BufferedOutputStream;

/* JADX INFO: renamed from: X.09nN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2477909nN {
    public static final int LIZLLL(String str) {
        Integer numValueOf;
        if (!C2286708xd.LIZJ(str)) {
            return 0;
        }
        try {
            ExifInterface exifInterfaceLJIILL = C2471909mP.LJIILL(str);
            if (exifInterfaceLJIILL == null || (numValueOf = Integer.valueOf(C2204961BRm.LJLILLLLZI(exifInterfaceLJIILL, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmpbYnPz3xssbigpe6lPrluMN+r", null)))) == null) {
                return 0;
            }
            if (numValueOf.intValue() != 6) {
                if (numValueOf.intValue() == 3) {
                    return 180;
                }
                if (numValueOf.intValue() != 8) {
                    return 0;
                }
                return 270;
            }
            return 90;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static final Bitmap LJ(Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        return bitmapCreateBitmap;
    }

    public static final Bitmap LIZ(String str, int i, int i2, Bitmap.Config config) throws Throwable {
        boolean z;
        BitmapFactory.Options options;
        Bitmap bitmapLJ = null;
        if (!C2286708xd.LIZJ(str)) {
            return null;
        }
        if (((Number) C2478009nO.LIZ.getValue()).intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = config;
            options.inSampleSize = 1;
        } else {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            C2471909mP.LJ(str, options);
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = config;
            options.inSampleSize = 1;
        }
        try {
            Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(str, options);
            if (bitmapLIZLLL == null) {
                return null;
            }
            int iLIZLLL = LIZLLL(str);
            if (iLIZLLL % 180 == 90) {
                i2 = i;
                i = i2;
            }
            int i3 = options.outWidth;
            if (i3 > i || options.outHeight > i2) {
                float f = i3;
                float f2 = i;
                float f3 = f / f2;
                float f4 = options.outHeight;
                float f5 = i2;
                if (f3 > f4 / f5) {
                    i2 = (int) ((f2 * f4) / f);
                } else {
                    i = (int) ((f5 * f) / f4);
                }
                bitmapLIZLLL = Bitmap.createScaledBitmap(bitmapLIZLLL, i, i2, true);
            }
            bitmapLJ = LJ(bitmapLIZLLL, iLIZLLL);
            return bitmapLJ;
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
            return bitmapLJ;
        }
    }

    public static final Bitmap LIZJ(String str, int i, int i2, Bitmap.Config config) throws Throwable {
        int i3;
        Bitmap bitmapLJ = null;
        if (!C2286708xd.LIZJ(str)) {
            return null;
        }
        int i4 = i * i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i5 = 1;
        options.inJustDecodeBounds = true;
        C2471909mP.LJ(str, options);
        int i6 = options.outWidth;
        if (i6 != 0 && (i3 = options.outHeight) != 0) {
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = config;
            int i7 = i6 * i3;
            if (i4 > 0 && i7 > 0) {
                while (i7 / (i5 * i5) > i4) {
                    i5 <<= 1;
                }
            }
            options.inSampleSize = i5;
            if (Build.VERSION.SDK_INT >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            try {
                Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(str, options);
                if (bitmapLIZLLL != null) {
                    bitmapLJ = LJ(bitmapLIZLLL, LIZLLL(str));
                    return bitmapLJ;
                }
            } catch (OutOfMemoryError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
        }
        return bitmapLJ;
    }

    public static final void LJFF(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i) throws Throwable {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(new C0VSJ(str)));
            try {
                bitmap.compress(compressFormat, i, bufferedOutputStream);
                bufferedOutputStream.flush();
                C2107108Nh.LIZ(bufferedOutputStream, null);
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(bufferedOutputStream, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(bufferedOutputStream, th);
                    throw th;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("saveBitmapToFile error", e);
        }
    }

    public static /* synthetic */ void LJI(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i, int i2) throws Throwable {
        if ((i2 & 2) != 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        if ((i2 & 4) != 0) {
            i = 100;
        }
        LJFF(bitmap, str, compressFormat, i);
    }
}
