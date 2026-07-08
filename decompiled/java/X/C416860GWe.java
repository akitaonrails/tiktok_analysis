package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416860GWe extends Drawable {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public String LJFF = "";
    public final C444890HcV LJI;
    public final Path LJII;
    public final RectF LJIIIIZZ;
    public final Matrix LJIIIZ;
    public float LJIIJ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJI.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.LJI.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LIZLLL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.LIZLLL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.LJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        canvas2.translate(0.0f, 0.0f);
        int length = this.LJFF.length();
        if (length != 0) {
            if (length != 1) {
                float fCeil = (float) Math.ceil((((double) this.LJIIJ) * 0.6666666666666666d) + ((double) ((float) Math.ceil(this.LJI.measureText(this.LJFF)))));
                float f = 2;
                float fCeil2 = (float) Math.ceil(this.LJIIJ / f);
                this.LJI.setColor(this.LIZIZ);
                RectF rectF = this.LJIIIIZZ;
                rectF.left = 0.0f;
                rectF.top = 0.0f;
                float f2 = fCeil2 * f;
                rectF.right = f2;
                rectF.bottom = f2;
                canvas2.drawArc(rectF, 90.0f, 180.0f, true, this.LJI);
                canvas2.drawRect(fCeil2, 0.0f, fCeil - fCeil2, this.LJIIJ, this.LJI);
                RectF rectF2 = this.LJIIIIZZ;
                rectF2.left = fCeil - f2;
                rectF2.top = 0.0f;
                rectF2.right = fCeil;
                rectF2.bottom = f2;
                canvas2 = canvas2;
                canvas2.drawArc(rectF2, -90.0f, 180.0f, true, this.LJI);
                this.LJI.setColor(this.LIZ);
                C444890HcV c444890HcV = this.LJI;
                String str = this.LJFF;
                c444890HcV.getTextPath(str, 0, str.length(), 0.0f, 0.0f, this.LJII);
                this.LJII.computeBounds(this.LJIIIIZZ, true);
                float fHeight = (this.LJIIJ - this.LJIIIIZZ.height()) / f;
                float fWidth = (fCeil - this.LJIIIIZZ.width()) / f;
                this.LJIIIZ.reset();
                Matrix matrix = this.LJIIIZ;
                RectF rectF3 = this.LJIIIIZZ;
                matrix.setTranslate(fWidth - rectF3.left, fHeight - rectF3.top);
                this.LJII.transform(this.LJIIIZ);
                canvas2.drawPath(this.LJII, this.LJI);
            } else {
                float f3 = 2;
                float f4 = this.LJIIJ / f3;
                this.LJI.setColor(this.LIZIZ);
                canvas2.drawCircle(f4, f4, f4, this.LJI);
                this.LJI.setColor(this.LIZ);
                C444890HcV c444890HcV2 = this.LJI;
                String str2 = this.LJFF;
                c444890HcV2.getTextPath(str2, 0, str2.length(), 0.0f, 0.0f, this.LJII);
                this.LJII.computeBounds(this.LJIIIIZZ, true);
                float fHeight2 = (this.LJIIJ - this.LJIIIIZZ.height()) / f3;
                float fWidth2 = (this.LJIIJ - this.LJIIIIZZ.width()) / f3;
                if (Intrinsics.LJFF(this.LJFF, "1")) {
                    fWidth2 *= 0.9f;
                }
                this.LJIIIZ.reset();
                Matrix matrix2 = this.LJIIIZ;
                RectF rectF4 = this.LJIIIIZZ;
                matrix2.setTranslate(fWidth2 - rectF4.left, fHeight2 - rectF4.top);
                this.LJII.transform(this.LJIIIZ);
                this.LJI.setColor(this.LIZ);
                canvas2.drawPath(this.LJII, this.LJI);
            }
        } else {
            float f5 = this.LIZJ / 2;
            this.LJI.setColor(this.LIZIZ);
            canvas2.drawCircle(f5, f5, f5, this.LJI);
        }
        canvas2.translate(-0.0f, -0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJI.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJI.setColorFilter(colorFilter);
    }

    public C416860GWe(int i, int i2, int i3, int i4) {
        this.LIZ = i2;
        this.LIZIZ = i3;
        this.LIZJ = i4;
        C444890HcV c444890HcV = new C444890HcV();
        this.LJI = c444890HcV;
        this.LJII = new Path();
        this.LJIIIIZZ = new RectF();
        this.LJIIIZ = new Matrix();
        c444890HcV.setAntiAlias(true);
        c444890HcV.LIZ(i);
        this.LJIIJ = (((int) Math.ceil((c444890HcV.getFontMetrics().descent - c444890HcV.getFontMetrics().ascent) + C418440Gaw.LIZIZ(3))) & 1) == 0 ? r1 + 1 : r1;
    }
}
