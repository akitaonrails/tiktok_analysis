package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import java.util.Locale;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0FG3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FG3 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(String str) {
        String path;
        if (str.length() == 0 || (path = UriProtector.parse(str).getPath()) == null) {
            return false;
        }
        return !u.LJIIZILJ(path.toLowerCase(Locale.ROOT), ".svg", false);
    }

    public static void LIZ(TuxIconView tuxIconView, int[] iArr) {
        tuxIconView.LIZ();
        if (tuxIconView.isLaidOut() && !tuxIconView.isLayoutRequested()) {
            int width = tuxIconView.getWidth();
            int height = tuxIconView.getHeight();
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Drawable drawable = tuxIconView.getDrawable();
                if (drawable != null) {
                    drawable.setBounds(0, 0, width, height);
                    drawable.draw(canvas);
                }
                float f = height;
                LinearGradient linearGradient = new LinearGradient(0.0f, f, 0.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                paint.setShader(linearGradient);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawRect(0.0f, 0.0f, width, f, paint);
                tuxIconView.setImageDrawable(new BitmapDrawable(tuxIconView.getResources(), bitmapCreateBitmap));
                return;
            }
            return;
        }
        tuxIconView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391520FWs(tuxIconView, iArr, 4));
    }
}
