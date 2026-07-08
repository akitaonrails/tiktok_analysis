package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415490GQx extends Drawable {
    public static final /* synthetic */ int LJIIIZ = 0;
    public Integer LIZ;
    public Integer LIZIZ;
    public boolean LIZJ = true;
    public final Path LIZLLL = new Path();
    public final Paint LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    public C415490GQx() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.LJ = paint;
    }

    public final void LIZ(int i) {
        this.LJ.setColor(i);
        invalidateSelf();
    }

    public final void LIZIZ(float f) {
        this.LIZJ = true;
        this.LJFF = f;
        this.LJI = f;
        this.LJII = f;
        this.LJIIIIZZ = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Integer num;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        Integer num2 = this.LIZ;
        if (num2 == null || num2.intValue() != iWidth || (num = this.LIZIZ) == null || num.intValue() != iHeight || this.LIZJ) {
            this.LIZLLL.reset();
            C415500GQy.LIZ(this.LIZLLL, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, iWidth, iHeight);
            this.LIZ = Integer.valueOf(iWidth);
            this.LIZIZ = Integer.valueOf(iHeight);
            this.LIZJ = false;
        }
        canvas.drawPath(this.LIZLLL, this.LJ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJ.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJ.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
