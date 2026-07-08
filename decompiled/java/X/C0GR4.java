package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: renamed from: X.0GR4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GR4 {
    public final Paint LIZ;

    public C0GR4() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-6306117);
        paint.setStrokeWidth(C497740JfY.LIZIZ(3.6666667f));
        this.LIZ = paint;
    }

    public final void LIZ(Canvas canvas, float[] fArr) {
        int i = 0;
        if (fArr.length == 0) {
            return;
        }
        Path path = new Path();
        path.moveTo(fArr[0], fArr[1]);
        int iLIZ = C0GYY.LIZ(0, fArr.length - 1, 4);
        if (iLIZ >= 0) {
            while (true) {
                path.lineTo(fArr[i + 2], fArr[i + 3]);
                if (i == iLIZ) {
                    break;
                } else {
                    i += 4;
                }
            }
        }
        canvas.drawPath(path, this.LIZ);
    }
}
