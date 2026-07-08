package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0GZn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417730GZn extends Drawable {
    public int LIZLLL;
    public float LJFF;
    public int LJII;
    public final float[] LJIIIIZZ;
    public float LJIIJ;
    public float LJIIJJI;
    public final Paint LIZ = new Paint(1);
    public final RectF LIZIZ = new RectF();
    public final Path LIZJ = new Path();
    public final float[] LJ = new float[8];
    public final Path LJI = new Path();
    public final Path LJIIIZ = new Path();
    public final RectF LJIIL = new RectF();
    public final RectF LJIILIIL = new RectF();
    public int LJIILJJIL = 255;

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void LIZ() {
        this.LJI.reset();
        this.LIZJ.reset();
        this.LJIIIZ.reset();
        this.LIZIZ.set(getBounds());
        float f = 2;
        this.LJIIL.set((-this.LJIIJJI) / f, (getBounds().height() / 2) - (this.LJIIJ / f), this.LJIIJJI / f, (getBounds().height() / 2) + (this.LJIIJ / f));
        this.LJIILIIL.set(getBounds().width() - (this.LJIIJJI / f), (getBounds().height() / 2) - (this.LJIIJ / f), getBounds().width() + (this.LJIIJJI / f), (getBounds().height() / 2) + (this.LJIIJ / f));
        RectF rectF = this.LIZIZ;
        float f2 = this.LJFF;
        rectF.inset(f2 / f, f2 / f);
        int length = this.LJ.length;
        for (int i = 0; i < length; i++) {
            this.LJ[i] = this.LJIIIIZZ[i] + (this.LJFF / f);
        }
        this.LIZJ.addRoundRect(this.LIZIZ, this.LJ, Path.Direction.CW);
        RectF rectF2 = this.LIZIZ;
        float f3 = this.LJFF;
        rectF2.inset((-f3) / f, (-f3) / f);
        this.LJIIL.offset(this.LJFF / f, 0.0f);
        this.LIZJ.addArc(this.LJIIL, 180.0f, 360.0f);
        this.LJIIL.offset((-this.LJFF) / f, 0.0f);
        this.LJIILIIL.offset((-this.LJFF) / f, 0.0f);
        this.LIZJ.addArc(this.LJIILIIL, 180.0f, 360.0f);
        this.LJIILIIL.offset(this.LJFF / f, 0.0f);
        this.LJI.addRoundRect(this.LIZIZ, this.LJIIIIZZ, Path.Direction.CW);
        this.LJIIIZ.addOval(this.LJIIL, Path.Direction.CW);
        this.LJIIIZ.addOval(this.LJIILIIL, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iLIZIZ = C1331180kkG.LIZIZ(this.LJII, this.LJIILJJIL) >>> 24;
        if (iLIZIZ == 255) {
            return -1;
        }
        return iLIZIZ == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJIILJJIL;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LIZ.setColor(C1331180kkG.LIZIZ(this.LJII, this.LJIILJJIL));
        this.LIZ.setStyle(Paint.Style.FILL);
        canvas.clipPath(this.LJIIIZ, Region.Op.DIFFERENCE);
        canvas.drawPath(this.LJI, this.LIZ);
        if (this.LJFF != 0.0f) {
            this.LIZ.setColor(C1331180kkG.LIZIZ(this.LIZLLL, this.LJIILJJIL));
            this.LIZ.setStyle(Paint.Style.STROKE);
            this.LIZ.setStrokeWidth(this.LJFF);
            canvas.drawPath(this.LIZJ, this.LIZ);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        LIZ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.LJIILJJIL) {
            this.LJIILJJIL = i;
            invalidateSelf();
        }
    }

    public C417730GZn(float f, int i) {
        float[] fArr = new float[8];
        this.LJIIIIZZ = fArr;
        Arrays.fill(fArr, f);
        LIZ();
        invalidateSelf();
        if (this.LJII != i) {
            this.LJII = i;
            invalidateSelf();
        }
    }
}
