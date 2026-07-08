package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: X.0FFY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FFY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(C497820Jfg.LIZIZ(view.getContext()), 1073741824), View.MeasureSpec.makeMeasureSpec(C497820Jfg.LIZ(view.getContext()), 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static Bitmap LIZ(Bitmap bitmap, float f, float f2, float f3, float f4) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        Path path = new Path();
        path.moveTo(0.0f, f);
        path.quadTo(0.0f, 0.0f, f, 0.0f);
        path.lineTo(rectF.right - f2, 0.0f);
        float f5 = rectF.right;
        path.quadTo(f5, 0.0f, f5, f2);
        path.lineTo(rectF.right, rectF.bottom - f3);
        float f6 = rectF.right;
        float f7 = rectF.bottom;
        path.quadTo(f6, f7, f6 - f3, f7);
        path.lineTo(rectF.left + f4, rectF.bottom);
        float f8 = rectF.bottom;
        path.quadTo(0.0f, f8, 0.0f, f8 - f4);
        path.lineTo(0.0f, f);
        paint.setAntiAlias(true);
        canvas.drawPath(path, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
