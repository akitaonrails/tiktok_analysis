package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ejV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100070ejV {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(Bitmap bitmap, float f, float f2, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        RenderScript renderScriptCreate = null;
        if (z2) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Paint paint = new Paint(3);
        Canvas canvas = new Canvas();
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.scale(f, f);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        Bitmap.Config config = bitmapCreateBitmap.getConfig();
        if (!z && config != null) {
            bitmapCreateBitmap = bitmapCreateBitmap.copy(config, true);
        }
        try {
            renderScriptCreate = RenderScript.create(C2219091BtD.LIZ());
            renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.setRadius(f2);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            allocationCreateTyped.copyTo(bitmapCreateBitmap);
            renderScriptCreate.destroy();
            if (f == 1.0f) {
                z3 = true;
            }
            if (!z3) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, width, height, true);
                if (!bitmapCreateBitmap.isRecycled()) {
                    bitmapCreateBitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                }
                if (z && !bitmap.isRecycled() && !Intrinsics.LJFF(bitmapCreateScaledBitmap, bitmap)) {
                    bitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                }
                return bitmapCreateScaledBitmap;
            }
            if (z && !bitmap.isRecycled() && !Intrinsics.LJFF(bitmapCreateBitmap, bitmap)) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (renderScriptCreate != null) {
                renderScriptCreate.destroy();
            }
            throw th;
        }
    }
}
