package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0F78, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F78 {
    public static final int[] LIZ = {R.attr.cf, R.attr.cn, R.attr.d1, R.attr.cz};

    public static final void LIZ(final TuxIconView tuxIconView, final int[] iArr, final float[] fArr, final float f, final float f2, final float f3, final float f4, final int i, final Function0<Unit> function0) {
        Drawable drawableMutate;
        float f5;
        if (tuxIconView.getWidth() != 0 && tuxIconView.getHeight() != 0 && tuxIconView.getDrawable() != null) {
            Drawable drawable = tuxIconView.getDrawable();
            if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                int width = tuxIconView.getWidth();
                int height = tuxIconView.getHeight();
                int iMax = Math.max(width, height);
                if (iMax >= 1 && iMax > 512) {
                    f5 = 512.0f / iMax;
                } else {
                    f5 = 1.0f;
                }
                float f6 = width;
                int iLIZIZ = C814420VxA.LIZIZ(f6 * f5);
                if (iLIZIZ < 1) {
                    iLIZIZ = 1;
                }
                float f7 = height;
                int iLIZIZ2 = C814420VxA.LIZIZ(f7 * f5);
                if (iLIZIZ2 < 1) {
                    iLIZIZ2 = 1;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iLIZIZ, iLIZIZ2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.scale(f5, f5);
                drawableMutate.setBounds(0, 0, width, height);
                drawableMutate.draw(canvas);
                Paint paint = new Paint(1);
                paint.setShader(new LinearGradient(f * f6, f3 * f7, f2 * f6, f4 * f7, iArr, fArr, Shader.TileMode.CLAMP));
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawRect(0.0f, 0.0f, f6, f7, paint);
                tuxIconView.setImageBitmap(bitmapCreateBitmap);
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            return;
        }
        if (i < 3) {
            HandlerHook.viewPost(tuxIconView, new Runnable() { // from class: X.0F79
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AutoPickButtonKt@b611.applyGradientIcon$1");
                    try {
                        C0F78.LIZ(tuxIconView, iArr, fArr, f, f2, f3, f4, i + 1, function0);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AutoPickButtonKt@b611.applyGradientIcon$1");
                }
            });
        }
    }
}
