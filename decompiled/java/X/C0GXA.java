package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GXA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXA extends Drawable {
    public int LIZ;
    public int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final TuxIconDrawable LJFF;
    public boolean LJI;
    public final Paint LJII;
    public final RectF LJIIIIZZ;
    public boolean LJIIIZ;
    public float LJIIJ;

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
    public final void draw(Canvas canvas) {
        float f;
        float fWidth = getBounds().width();
        float f2 = 2;
        float f3 = this.LIZJ / f2;
        float fCenterY = getBounds().centerY() - f3;
        float fCenterY2 = getBounds().centerY() + f3;
        this.LJII.setColor(this.LIZIZ);
        float f4 = 0.0f;
        this.LJIIIIZZ.set(0.0f, fCenterY, fWidth, fCenterY2);
        RectF rectF = this.LJIIIIZZ;
        float f5 = this.LIZLLL;
        canvas.drawRoundRect(rectF, f5, f5, this.LJII);
        this.LJII.setColor(this.LIZ);
        RectF rectF2 = this.LJIIIIZZ;
        if (this.LJIIIZ) {
            f4 = (fWidth - (this.LIZLLL * f2)) * (1 - this.LJIIJ);
            f = fWidth;
        } else {
            float f6 = this.LIZLLL;
            f = ((fWidth - (f2 * f6)) * this.LJIIJ) + (f6 * f2);
        }
        rectF2.set(f4, fCenterY, f, fCenterY2);
        RectF rectF3 = this.LJIIIIZZ;
        float f7 = this.LIZLLL;
        canvas.drawRoundRect(rectF3, f7, f7, this.LJII);
        float fLIZIZ = C418440Gaw.LIZIZ(16);
        float f8 = this.LJ;
        float f9 = f8 / f2;
        if (this.LJI) {
            this.LJFF.setBounds(0, 0, (int) f8, (int) f8);
            this.LJFF.setAlpha(100);
        }
        if (this.LJIIIZ) {
            fLIZIZ = (fWidth - fLIZIZ) - this.LJ;
        }
        float fCenterY3 = getBounds().centerY() - f9;
        canvas.translate(fLIZIZ, fCenterY3);
        if (this.LJI) {
            this.LJFF.draw(canvas);
        }
        canvas.translate(-fLIZIZ, -fCenterY3);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return zOnLevelChange;
    }

    public C0GXA(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NewProgressSeekBar);
        this.LIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.NewProgressSeekBar_np_progressColor, R.attr.c2);
        this.LIZIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.NewProgressSeekBar_np_progressBackgroundColor, R.attr.dy);
        this.LIZJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.NewProgressSeekBar_np_progressHeight, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46)));
        this.LIZLLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.NewProgressSeekBar_np_progressRadius, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.NewProgressSeekBar_np_iconSize, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        this.LJ = dimension;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NewProgressSeekBar_np_iconImage, 0);
        c419910GdJ.LJ = Integer.valueOf(R.attr.eh);
        int i = (int) dimension;
        c419910GdJ.LIZIZ = i;
        c419910GdJ.LIZJ = i;
        this.LJFF = c419910GdJ.LIZ(context);
        this.LJI = true;
        Paint paint = new Paint();
        this.LJII = paint;
        this.LJIIIIZZ = new RectF();
        paint.setAntiAlias(true);
    }
}
