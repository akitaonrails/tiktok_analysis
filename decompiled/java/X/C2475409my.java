package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.BufferedOutputStream;

/* JADX INFO: renamed from: X.09my, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2475409my {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZIZ(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
    }

    public static Bitmap LJ(int i, int i2, Bitmap bitmap) {
        float f;
        if (bitmap == null) {
            return null;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f2 = 0.0f;
        if (i > i2) {
            float f3 = (i * 1.0f) / i2;
            float f4 = width / f3;
            if (height > f4) {
                f = (height - f4) / 2;
                height = f4;
            } else {
                float f5 = f3 * height;
                f = 0.0f;
                f2 = (width - f5) / 2;
                width = f5;
            }
        } else if (i < i2) {
            float f6 = (i2 * 1.0f) / i;
            float f7 = height / f6;
            if (width > f7) {
                f2 = (width - f7) / 2;
                width = f7;
                f = 0.0f;
            } else {
                float f8 = f6 * width;
                f = (height - f8) / 2;
                height = f8;
            }
        } else if (width > height) {
            f = 0.0f;
            f2 = (width - height) / 2;
            width = height;
        } else {
            f = (height - width) / 2;
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
        LIZIZ(bitmap);
        return bitmapCreateBitmap;
    }

    public static boolean LIZJ(Bitmap bitmap, String str, String str2, Bitmap.CompressFormat compressFormat) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        if (str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new C0VSV(new C0VSJ(str, str2)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bitmap.compress(compressFormat, 100, bufferedOutputStream);
            bufferedOutputStream.close();
            C09BK.LIZ(bufferedOutputStream);
            return true;
        } catch (Exception e2) {
            e = e2;
            bufferedOutputStream2 = bufferedOutputStream;
            TryCatchGuardChecker.doCheck(e);
            C09BK.LIZ(bufferedOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            TryCatchGuardChecker.doCheck(th);
            C09BK.LIZ(bufferedOutputStream2);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x020a, code lost:
    
        if (r13 < r9) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a4, code lost:
    
        if (r13 < r9) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap LIZLLL(java.lang.String r14, int r15, int r16, int r17, X.EnumC2475609n0 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2475409my.LIZLLL(java.lang.String, int, int, int, X.09n0):android.graphics.Bitmap");
    }
}
