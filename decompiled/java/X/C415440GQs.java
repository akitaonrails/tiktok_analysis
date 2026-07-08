package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415440GQs extends Drawable {
    public int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final Paint LJ;
    public final RectF LJFF;
    public float LJI;
    public boolean LJII;

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

    public C415440GQs(Context context) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e8, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LIZ = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.dy, context);
        this.LIZIZ = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
        this.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        Paint paint = new Paint();
        this.LJ = paint;
        this.LJFF = new RectF();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth = getBounds().width();
        float f = 2;
        float f2 = this.LIZJ / f;
        float fCenterY = getBounds().centerY() - f2;
        float fCenterY2 = getBounds().centerY() + f2;
        this.LJ.setColor(this.LIZIZ);
        float f3 = 0.0f;
        this.LJFF.set(0.0f, fCenterY, fWidth, fCenterY2);
        RectF rectF = this.LJFF;
        float f4 = this.LIZLLL;
        canvas.drawRoundRect(rectF, f4, f4, this.LJ);
        this.LJ.setColor(this.LIZ);
        RectF rectF2 = this.LJFF;
        if (this.LJII) {
            f3 = (fWidth - (this.LIZLLL * f)) * (1 - this.LJI);
        } else {
            float f5 = this.LIZLLL;
            fWidth = ((fWidth - (f * f5)) * this.LJI) + (f * f5);
        }
        rectF2.set(f3, fCenterY, fWidth, fCenterY2);
        RectF rectF3 = this.LJFF;
        float f6 = this.LIZLLL;
        canvas.drawRoundRect(rectF3, f6, f6, this.LJ);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return zOnLevelChange;
    }
}
