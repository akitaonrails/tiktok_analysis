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

/* JADX INFO: renamed from: X.0GSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415780GSa extends Drawable {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public int LIZLLL;
    public final float LJ;
    public final Paint LJFF;
    public final RectF LJI;
    public float LJII;
    public Rect LJIIIIZZ;
    public boolean LJIIIZ;

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
        this.LJFF.setColor(this.LIZLLL);
        float f = this.LIZIZ / 2;
        float fCenterY = getBounds().centerY() - f;
        float fCenterY2 = getBounds().centerY() + f;
        RectF rectF = this.LJI;
        if (this.LJIIIZ) {
            fWidth = (((this.LIZ - this.LJIIIIZZ.width()) * this.LJII) + this.LJIIIIZZ.width()) - this.LIZ;
        } else {
            fWidth = (this.LJIIIIZZ.width() - this.LIZ) * this.LJII;
        }
        if (this.LJIIIZ) {
            fWidth3 = (this.LIZ - this.LJIIIIZZ.width()) * this.LJII;
            fWidth2 = this.LJIIIIZZ.width();
        } else {
            float fWidth4 = this.LJIIIIZZ.width();
            fWidth2 = this.LIZ;
            fWidth3 = (fWidth4 - fWidth2) * this.LJII;
        }
        rectF.set(fWidth, fCenterY, fWidth3 + fWidth2, fCenterY2);
        RectF rectF2 = this.LJI;
        float f2 = this.LJ;
        canvas.drawRoundRect(rectF2, f2, f2, this.LJFF);
    }

    public C415780GSa(Context context, AttributeSet attributeSet, float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveMusicProgressSeekBar);
        this.LIZJ = 1.0f;
        this.LIZLLL = typedArrayObtainStyledAttributes.getColor(R$styleable.LiveMusicProgressSeekBar_np_thumbColor, -1);
        this.LJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveMusicProgressSeekBar_np_thumbRadius, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        typedArrayObtainStyledAttributes.getColor(R$styleable.LiveMusicProgressSeekBar_np_thumbShadowColor, -16777216);
        Paint paint = new Paint();
        this.LJFF = paint;
        this.LJI = new RectF();
        this.LJIIIIZZ = new Rect();
        paint.setAntiAlias(true);
    }
}
