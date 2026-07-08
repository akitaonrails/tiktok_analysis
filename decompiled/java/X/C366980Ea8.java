package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0Ea8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366980Ea8 extends Drawable {
    public final Paint LIZ;
    public final Paint LIZIZ;
    public LinearGradient LIZJ;
    public final float LIZLLL;
    public final RectF LJ;
    public final RectF LJFF;

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

    public C366980Ea8() {
        Paint paint = new Paint();
        this.LIZ = paint;
        this.LIZIZ = new Paint();
        this.LIZLLL = C418440Gaw.LIZIZ(4);
        this.LJ = new RectF();
        this.LJFF = new RectF();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (C357780E0y.LIZ()) {
            i = 4;
        } else {
            i = 10;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        this.LIZ.setShader(this.LIZJ);
        int i2 = iLIZIZ / 2;
        this.LJFF.set(getBounds().left, getBounds().centerY() - i2, getBounds().left + getBounds().width(), getBounds().centerY() + i2);
        RectF rectF = this.LJFF;
        float f = this.LIZLLL;
        canvas.drawRoundRect(rectF, f, f, this.LIZ);
        this.LJ.set((getBounds().width() / 2) - C418440Gaw.LIZIZ(1), (getBounds().height() / 2) - C418440Gaw.LIZIZ(3), (getBounds().width() / 2) + C418440Gaw.LIZIZ(1), (getBounds().height() / 2) + C418440Gaw.LIZIZ(3));
        canvas.drawRoundRect(this.LJ, C418440Gaw.LIZIZ(1), C418440Gaw.LIZIZ(1), this.LIZIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return zOnLevelChange;
    }
}
