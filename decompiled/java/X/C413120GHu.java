package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: renamed from: X.0GHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C413120GHu extends AbstractC415370GQl {
    public final Paint LJ;

    @Override // X.AbstractC415370GQl
    public final void LIZ(Canvas canvas) {
        LIZIZ(40.0f, 8.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LJ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }

    public C413120GHu(int i, int i2, boolean z) {
        this.LIZJ.LJII(40.0f);
        this.LIZJ.LJFF(28.3333f, 0.0f, 23.3333f, 8.0f, 20.0f, 8.0f);
        this.LIZJ.LJFF(16.6667f, 8.0f, 11.6667f, 0.0f, 0.0f, 0.0f);
        this.LIZJ.LJ();
        this.LIZJ.LJIJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.STROKE);
        this.LIZIZ.setColor(i);
        Paint paint = new Paint();
        this.LJ = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(i);
        if (!z) {
            this.LIZIZ.setShadowLayer(2.0f, 0.0f, 0.0f, i2);
            paint.setShadowLayer(2.0f, 0.0f, 0.0f, i2);
        }
        this.LIZ.add(paint);
        this.LIZ.add(this.LIZIZ);
    }
}
