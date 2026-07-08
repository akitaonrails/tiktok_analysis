package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417070GWz extends Drawable {
    public int LIZLLL;
    public int LJFF;
    public boolean LJI;
    public final Paint LJII;
    public final C444890HcV LJIIIIZZ;
    public final RectF LJIIIZ;
    public int LIZ = -1;
    public float LIZIZ = C418440Gaw.LIZIZ(16);
    public float LIZJ = C418440Gaw.LIZIZ(20);
    public float LJ = C418440Gaw.LIZIZ(6);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C417070GWz() {
        Paint paint = new Paint();
        this.LJII = paint;
        C444890HcV c444890HcV = new C444890HcV();
        this.LJIIIIZZ = c444890HcV;
        this.LJIIIZ = new RectF();
        paint.setAntiAlias(true);
        c444890HcV.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LJII.setShadowLayer(C418440Gaw.LIZIZ(8), 0.0f, 2.0f, this.LIZLLL);
        float f = 2;
        float fCenterY = getBounds().centerY() - (this.LIZJ / f);
        float fCenterY2 = getBounds().centerY() + (this.LIZJ / f);
        float fCenterX = getBounds().centerX() - (this.LIZIZ / f);
        float fCenterX2 = getBounds().centerX() + (this.LIZIZ / f);
        this.LJII.setColor(this.LIZ);
        this.LJIIIZ.set(fCenterX, fCenterY, fCenterX2, fCenterY2);
        RectF rectF = this.LJIIIZ;
        float f2 = this.LJ;
        canvas.drawRoundRect(rectF, f2, f2, this.LJII);
        if (this.LJI) {
            C444890HcV c444890HcV = this.LJIIIIZZ;
            c444890HcV.setColor(0);
            c444890HcV.setTextAlign(Paint.Align.CENTER);
            c444890HcV.setTextSize(C418440Gaw.LJ(12));
            c444890HcV.LIZ(72);
            canvas.drawText(String.valueOf(this.LJFF), getBounds().centerX(), fCenterY - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), this.LJIIIIZZ);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return zOnLevelChange;
    }
}
