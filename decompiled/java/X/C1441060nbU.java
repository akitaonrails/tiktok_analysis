package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0nbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441060nbU {
    public static boolean LIZIZ(Bitmap bitmap, String str) throws Throwable {
        C0VSV c0vsv;
        if (bitmap.isRecycled()) {
            return false;
        }
        C2286708xd.LJIIIIZZ(str, true);
        C0VSV c0vsv2 = null;
        try {
            try {
                c0vsv = new C0VSV(str);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
            try {
                c0vsv.close();
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C2475009mu.LJ(bitmap);
            return true;
        } catch (Exception e3) {
            e = e3;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(e);
            if (c0vsv2 != null) {
                try {
                    c0vsv2.close();
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
            }
            C2475009mu.LJ(bitmap);
            return false;
        } catch (Throwable th2) {
            th = th2;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(th);
            if (c0vsv2 != null) {
                try {
                    c0vsv2.close();
                } catch (IOException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
            }
            C2475009mu.LJ(bitmap);
            throw th;
        }
    }

    public static Bitmap LIZ(Bitmap bitmap, int i, int i2, int i3, int i4) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == i && height == i2) {
            return bitmap;
        }
        if (i3 > 0 && i4 > 0 && width > i3 && height > i4) {
            Matrix matrix = new Matrix();
            matrix.setTranslate((width - i3) * 0.5f, (height - i4) * 0.5f);
            matrix.postScale(i / i3, i2 / i4);
            return Bitmap.createBitmap(bitmap, 0, 0, i3, i4, matrix, true);
        }
        Matrix matrix2 = new Matrix();
        matrix2.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix2, true);
    }
}
