package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ejS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100040ejS {
    public static final Bitmap LIZ(Context context, Bitmap bitmap) {
        boolean z;
        Object c098200Yq;
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            z = false;
        } else {
            z = true;
        }
        Bitmap bitmapLIZIZ = null;
        if (z) {
            return null;
        }
        try {
            bitmapLIZIZ = LIZIZ(context, bitmap);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return bitmap.copy(Bitmap.Config.RGB_565, false);
        }
        return bitmapLIZIZ;
    }

    public static final Bitmap LIZIZ(Context context, Bitmap bitmap) throws Throwable {
        RenderScript renderScriptCreate;
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        try {
            renderScriptCreate = RenderScript.create(context);
            try {
                renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
                Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCopy, Allocation.MipmapControl.MIPMAP_NONE, 1);
                Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                scriptIntrinsicBlurCreate.setRadius(10.0f);
                scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                allocationCreateTyped.copyTo(bitmapCopy);
                renderScriptCreate.destroy();
                return bitmapCopy;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (renderScriptCreate != null) {
                    renderScriptCreate.destroy();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            renderScriptCreate = null;
        }
    }
}
