package X;

import Y.ALAdapterS1S0210000_6;
import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: X.0GiW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423140GiW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(View view, boolean z) {
        TimeInterpolator c1357210lQF;
        float f;
        ViewPropertyAnimator duration = view.animate().setDuration(300L);
        if (z) {
            c1357210lQF = new C1357190lQD();
        } else {
            c1357210lQF = new C1357210lQF();
        }
        ViewPropertyAnimator interpolator = duration.setInterpolator(c1357210lQF);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        interpolator.alpha(f).setListener(new ALAdapterS1S0210000_6(null, view, z, 5)).start();
    }

    public static Bitmap LIZ(Bitmap bitmap, float f, float f2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }
}
