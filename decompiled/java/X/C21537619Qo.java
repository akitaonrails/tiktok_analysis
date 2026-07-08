package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: X.19Qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21537619Qo {
    public final float[] LIZ = new float[8];
    public Path LIZIZ;
    public Paint LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public ColorStateList LJFF;
    public int LJI;
    public boolean LJII;
    public Region LJIIIIZZ;
    public RectF LJIIIZ;

    public final Path LIZ() {
        Path path = this.LIZIZ;
        if (path != null) {
            return path;
        }
        return null;
    }

    public final RectF LIZIZ() {
        RectF rectF = this.LJIIIZ;
        if (rectF != null) {
            return rectF;
        }
        return null;
    }

    public final Paint LIZJ() {
        Paint paint = this.LIZJ;
        if (paint != null) {
            return paint;
        }
        return null;
    }

    public final void LIZLLL(View view) {
        float fWidth;
        int iWidth = (int) LIZIZ().width();
        int iHeight = (int) LIZIZ().height();
        RectF rectF = new RectF();
        rectF.left = view.getPaddingLeft();
        rectF.top = view.getPaddingTop();
        float f = iWidth;
        rectF.right = f - view.getPaddingRight();
        float f2 = iHeight;
        rectF.bottom = f2 - view.getPaddingBottom();
        LIZ().reset();
        if (this.LIZLLL) {
            if (rectF.width() >= rectF.height()) {
                fWidth = rectF.height();
            } else {
                fWidth = rectF.width();
            }
            float f3 = fWidth / 2;
            float f4 = iWidth / 2;
            float f5 = iHeight / 2;
            PointF pointF = new PointF(f4, f5);
            if (Build.VERSION.SDK_INT <= 27) {
                LIZ().addCircle(pointF.x, pointF.y, f3, Path.Direction.CW);
                LIZ().moveTo(0.0f, 0.0f);
                LIZ().moveTo(f, f2);
            } else {
                float f6 = f5 - f3;
                LIZ().moveTo(rectF.left, f6);
                LIZ().addCircle(pointF.x, f6 + f3, f3, Path.Direction.CW);
            }
        } else {
            LIZ().addRoundRect(rectF, this.LIZ, Path.Direction.CW);
        }
        Region region = new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        Region region2 = this.LJIIIIZZ;
        if (region2 == null) {
            region2 = null;
        }
        region2.setPath(LIZ(), region);
    }
}
