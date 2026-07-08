package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ejT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100050ejT {
    public static final C1100050ejT LIZ = new C1100050ejT();
    public static RenderScript LIZIZ;

    public static RenderScript LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C1100050ejT.class) {
                try {
                    if (LIZIZ == null) {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        RenderScript renderScript = null;
                        if (contextLIZ == null) {
                            return null;
                        }
                        try {
                            RenderScript renderScriptCreate = RenderScript.create(contextLIZ);
                            renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
                            renderScript = renderScriptCreate;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        LIZIZ = renderScript;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static Bitmap LIZ(Bitmap bitmap, float f, float f2) {
        boolean z;
        boolean z2;
        if (f2 <= 0.0f) {
            return bitmap;
        }
        boolean z3 = false;
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        float fLIZLLL = C13LZ.LIZLLL(f2, 0.0f, 25.0f);
        if (fLIZLLL <= 0.0f) {
            if (bitmap.isRecycled() || Intrinsics.LJFF(bitmap, bitmap)) {
                return bitmap;
            }
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (f == 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width * f), (int) (height * f), true);
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            bitmap = bitmapCreateScaledBitmap;
        }
        try {
            RenderScript renderScriptLIZIZ = LIZIZ();
            if (renderScriptLIZIZ != null) {
                Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptLIZIZ, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                Allocation allocationCreateTyped = Allocation.createTyped(renderScriptLIZIZ, allocationCreateFromBitmap.getType());
                ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptLIZIZ, Element.U8_4(renderScriptLIZIZ));
                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                scriptIntrinsicBlurCreate.setRadius(fLIZLLL);
                scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                allocationCreateTyped.copyTo(bitmap);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (f == 1.0f) {
            z3 = true;
        }
        if (z3) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, width, height, true);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        return bitmapCreateScaledBitmap2;
    }
}
