package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0Eq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376840Eq2 extends Drawable {
    public static final C376850Eq3 LJIIL = new Object() { // from class: X.0Eq3
    };
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public int LJII = 255;
    public final Paint LJIIIIZZ;
    public final Paint LJIIIZ;
    public final RectF LJIIJ;
    public final float LJIIJJI;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawRoundRect(this.LJIIJ, this.LJIIJJI - this.LJIIIIZZ.getStrokeWidth(), this.LJIIJJI - this.LJIIIIZZ.getStrokeWidth(), this.LJIIIZ);
        canvas.drawRoundRect(this.LJIIJ, this.LJIIJJI - this.LJIIIIZZ.getStrokeWidth(), this.LJIIJJI - this.LJIIIIZZ.getStrokeWidth(), this.LJIIIIZZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.LJIIJ.set(rect);
        this.LJIIJ.inset(this.LJIIIIZZ.getStrokeWidth(), this.LJIIIIZZ.getStrokeWidth());
        this.LJIIIIZZ.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, rect.height(), this.LJFF, this.LJI, Shader.TileMode.CLAMP));
        this.LJIIIZ.setShader(new ComposeShader(new LinearGradient(0.0f, 0.0f, rect.width(), 0.0f, this.LIZ, this.LIZIZ, Shader.TileMode.CLAMP), new LinearGradient(0.0f, 0.0f, 0.0f, rect.height(), new int[]{this.LIZJ, this.LIZLLL, this.LJ}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP), PorterDuff.Mode.MULTIPLY));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.LJII != i) {
            this.LJII = i;
            this.LJIIIIZZ.setAlpha(i);
            this.LJIIIZ.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJIIIIZZ.setColorFilter(colorFilter);
        this.LJIIIZ.setColorFilter(colorFilter);
    }

    public C376840Eq2(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = i6;
        this.LJI = i7;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        C1546210qL5.LIZ.getClass();
        paint.setStrokeWidth(C1546210qL5.LIZ(1));
        paint.setStyle(Paint.Style.STROKE);
        this.LJIIIIZZ = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        this.LJIIIZ = paint2;
        this.LJIIJ = new RectF();
        this.LJIIJJI = C1546210qL5.LIZ(20);
    }
}
