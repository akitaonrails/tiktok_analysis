package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ejU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100060ejU {
    public static final Object LIZ = new Object();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    public static boolean LIZLLL(Context context) {
        if (context == null || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public static void LJFF(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(LIZIZ, runnable);
        }
    }

    public static float LIZ(float f, Context context) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static float LIZIZ(Context context, String str) {
        float f;
        float f2 = context.getResources().getDisplayMetrics().density;
        try {
            f = CastFloatProtector.parseFloat(str);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            f = 0.0f;
        }
        return (f * f2) + 0.5f;
    }

    public static int LJ(float f, Context context) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public static Bitmap LIZJ(int i, Context context, Bitmap bitmap) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            RenderScript renderScriptCreate = RenderScript.create(context);
            if (renderScriptCreate == null) {
                return null;
            }
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(i);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
