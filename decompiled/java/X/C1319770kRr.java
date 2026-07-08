package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.0kRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319770kRr {
    public static Bitmap LIZIZ(Drawable drawable) {
        Bitmap.Config config;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static void LIZJ(OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZLLL(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
    }

    public static Bitmap LIZ(int i, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        RenderScript renderScriptCreate = RenderScript.create(C1948707kD.LIZ().getApplicationContext());
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, allocationCreateFromBitmap.getElement());
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.setRadius(i);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        allocationCreateFromBitmap.copyTo(bitmapCreateBitmap);
        renderScriptCreate.destroy();
        return bitmapCreateBitmap;
    }

    public static boolean LJ(int i, Bitmap.CompressFormat compressFormat, Bitmap bitmap, File file) throws Throwable {
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
                    LIZJ(bufferedOutputStream2);
                    return true;
                } catch (Exception e) {
                    e = e;
                    bufferedOutputStream = bufferedOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    TryCatchGuardChecker.doCheck(th);
                    LIZJ(bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        TryCatchGuardChecker.doCheck(e);
        LIZJ(bufferedOutputStream);
        return false;
    }
}
