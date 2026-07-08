package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09n7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2476309n7 {
    public int LIZ = -1;

    public final Bitmap LIZ(Context context, Bitmap bitmap, float f, float f2, float f3) {
        boolean z;
        boolean z2;
        int i;
        Bitmap bitmapCreateBitmap;
        float f4;
        float f5;
        if (!bitmap.isRecycled()) {
            float f6 = 0.0f;
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (f2 == 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    float f7 = f * f2 * 4;
                    try {
                        i = this.LIZ;
                        if (i == -1) {
                            Point point = new Point();
                            C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8bI3XkiWUxuzsz2At1jC0LeqeGpdgZGwPnrJsZNQKdsjW6A==", null)).getRealSize(point);
                            i = point.x * 6 * point.y;
                            this.LIZ = i;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        i = Integer.MAX_VALUE;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("dest size destBitmapSize = ");
                    sbLIZ.append(f7);
                    sbLIZ.append(",maxSize=");
                    sbLIZ.append(i);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (f7 > i) {
                        int iSqrt = ((int) Math.sqrt(((double) i) / 4.0d)) - 1;
                        bitmapCreateBitmap = Bitmap.createBitmap(iSqrt, iSqrt, Bitmap.Config.ARGB_8888);
                    } else {
                        bitmapCreateBitmap = Bitmap.createBitmap((int) f, (int) f2, Bitmap.Config.ARGB_8888);
                    }
                    Matrix matrix = new Matrix();
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(3);
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    if (width * f2 > f * height) {
                        f4 = f2 / height;
                        f5 = (f - (width * f4)) * 0.5f;
                    } else {
                        float f8 = f / width;
                        f6 = (f2 - (height * f8)) * 0.5f;
                        f4 = f8;
                        f5 = 0.0f;
                    }
                    matrix.setScale(f4, f4);
                    matrix.postTranslate(C814420VxA.LIZIZ(f5), C814420VxA.LIZIZ(f6));
                    RectF rectF = new RectF(new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()));
                    canvas.drawColor(0);
                    paint.setColor(-16777216);
                    canvas.drawRoundRect(rectF, f3, f3, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, matrix, paint);
                    return bitmapCreateBitmap;
                }
            }
        }
        return bitmap;
    }
}
