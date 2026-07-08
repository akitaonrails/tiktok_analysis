package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.ImageView;
import java.util.List;

/* JADX INFO: renamed from: X.19kl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21628919kl {
    public static final RectF LIZ(ImageView imageView) {
        if (imageView.getDrawable() == null) {
            return new RectF();
        }
        Matrix imageMatrix = imageView.getImageMatrix();
        RectF rectF = new RectF(0.0f, 0.0f, r1.getIntrinsicWidth(), r1.getIntrinsicHeight());
        RectF rectF2 = new RectF();
        imageMatrix.mapRect(rectF2, rectF);
        return rectF2;
    }

    public static final List<PointF> LIZJ(RectF rectF) {
        return C1697810uHb.LJIIJJI(new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.top), new PointF(rectF.left, rectF.bottom), new PointF(rectF.right, rectF.bottom));
    }

    public static final RectF LIZIZ(ImageView imageView, float f, float f2, float f3) {
        if (imageView.getDrawable() == null) {
            return new RectF();
        }
        Matrix matrix = new Matrix(imageView.getImageMatrix());
        matrix.postRotate(f, f2, f3);
        RectF rectF = new RectF(0.0f, 0.0f, r1.getIntrinsicWidth(), r1.getIntrinsicHeight());
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        return rectF2;
    }
}
