package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417570GYx {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZIZ(Bitmap bitmap) {
        int width = bitmap.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        float f = width;
        RectF rectF = new RectF(0.0f, 0.0f, f, f);
        Path path = new Path();
        path.addOval(rectF, Path.Direction.CCW);
        paint.setAntiAlias(true);
        canvas.drawPath(path, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        return bitmapCreateBitmap;
    }

    public static int LIZ(int i, Context context) {
        if (i != 3) {
            if (i != 10) {
                if (i != 30) {
                    if (i != 100) {
                        if (i != 200) {
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.u2, context);
                            if (numLIZJ != null) {
                                return numLIZJ.intValue();
                            }
                            return -1;
                        }
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.u2, context);
                        if (numLIZJ2 != null) {
                            return numLIZJ2.intValue();
                        }
                        return -1;
                    }
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.tz, context);
                    if (numLIZJ3 != null) {
                        return numLIZJ3.intValue();
                    }
                    return -1;
                }
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.tw, context);
                if (numLIZJ4 != null) {
                    return numLIZJ4.intValue();
                }
                return -1;
            }
            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.tt, context);
            if (numLIZJ5 != null) {
                return numLIZJ5.intValue();
            }
            return -1;
        }
        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.tq, context);
        if (numLIZJ6 != null) {
            return numLIZJ6.intValue();
        }
        return -1;
    }
}
