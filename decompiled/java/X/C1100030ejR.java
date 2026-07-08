package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: renamed from: X.0ejR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100030ejR {
    public static final void LIZ(int i, Context context, Bitmap bitmap, Bitmap bitmap2) {
        float f;
        RenderScript renderScriptCreate = RenderScript.create(context);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        if (i > 0) {
            while (true) {
                if (i - 10 > 0) {
                    f = 10.0f;
                } else {
                    f = i;
                }
                scriptIntrinsicBlurCreate.setRadius(f);
                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                i -= 10;
                if (i <= 0) {
                    break;
                } else {
                    allocationCreateFromBitmap.copyFrom(allocationCreateTyped);
                }
            }
            allocationCreateTyped.copyTo(bitmap2);
        }
        C786410Ut5.LJJJJ(bitmapCreateBitmap);
    }
}
