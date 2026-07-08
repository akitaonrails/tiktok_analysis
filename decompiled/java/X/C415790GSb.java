package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415790GSb extends Drawable {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public int LIZLLL;
    public final float LJ;
    public int LJFF;
    public final Paint LJI;
    public final RectF LJII;
    public float LJIIIIZZ;
    public Rect LJIIIZ;
    public boolean LJIIJ;

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

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) (this.LIZJ * this.LIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.LIZJ * this.LIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth;
        float fWidth2;
        float fWidth3;
        this.LJI.setColor(this.LIZLLL);
        float f = this.LIZIZ / 2;
        float fCenterY = getBounds().centerY() - f;
        float fCenterY2 = getBounds().centerY() + f;
        RectF rectF = this.LJII;
        if (this.LJIIJ) {
            fWidth = (((this.LIZ - this.LJIIIZ.width()) * this.LJIIIIZZ) + this.LJIIIZ.width()) - this.LIZ;
        } else {
            fWidth = (this.LJIIIZ.width() - this.LIZ) * this.LJIIIIZZ;
        }
        if (this.LJIIJ) {
            fWidth3 = (this.LIZ - this.LJIIIZ.width()) * this.LJIIIIZZ;
            fWidth2 = this.LJIIIZ.width();
        } else {
            float fWidth4 = this.LJIIIZ.width();
            fWidth2 = this.LIZ;
            fWidth3 = (fWidth4 - fWidth2) * this.LJIIIIZZ;
        }
        rectF.set(fWidth, fCenterY, fWidth3 + fWidth2, fCenterY2);
        RectF rectF2 = this.LJII;
        float f2 = this.LJ;
        canvas.drawRoundRect(rectF2, f2, f2, this.LJI);
    }

    public C415790GSb(Context context, AttributeSet attributeSet, float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NewProgressSeekBar);
        this.LIZJ = 1.0f;
        this.LIZLLL = typedArrayObtainStyledAttributes.getColor(R$styleable.NewProgressSeekBar_np_thumbColor, -1);
        this.LJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.NewProgressSeekBar_np_thumbRadius, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        this.LJFF = typedArrayObtainStyledAttributes.getColor(R$styleable.NewProgressSeekBar_np_thumbShadowColor, -16777216);
        Paint paint = new Paint();
        this.LJI = paint;
        this.LJII = new RectF();
        this.LJIIIZ = new Rect();
        paint.setAntiAlias(true);
        paint.setShadowLayer(8.0f, -2.0f, 0.0f, this.LJFF);
    }
}
