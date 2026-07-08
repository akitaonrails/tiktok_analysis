package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.19RP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19RP extends Drawable {
    public float LIZ;
    public final RectF LIZJ;
    public final Rect LIZLLL;
    public float LJ;
    public boolean LJFF;
    public ColorStateList LJII;
    public PorterDuffColorFilter LJIIIIZZ;
    public ColorStateList LJIIIZ;
    public boolean LJI = true;
    public PorterDuff.Mode LJIIJ = PorterDuff.Mode.SRC_IN;
    public final Paint LIZIZ = new Paint(5);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.LJIIIZ;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.LJII;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    public final void LIZIZ(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.LJII = colorStateList;
        this.LIZIZ.setColor(colorStateList.getColorForState(getState(), this.LJII.getDefaultColor()));
    }

    public final void LIZJ(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.LIZJ.set(rect.left, rect.top, rect.right, rect.bottom);
        this.LIZLLL.set(rect);
        if (this.LJFF) {
            float fLIZ = C19RR.LIZ(this.LJ, this.LIZ, this.LJI);
            float f = this.LJ;
            float f2 = this.LIZ;
            if (this.LJI) {
                f = (float) (((double) f) + ((1.0d - C19RR.LIZ) * ((double) f2)));
            }
            this.LIZLLL.inset((int) Math.ceil(f), (int) Math.ceil(fLIZ));
            this.LIZJ.set(this.LIZLLL);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.LIZIZ;
        if (this.LJIIIIZZ != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.LJIIIIZZ);
            z = true;
        } else {
            z = false;
        }
        RectF rectF = this.LIZJ;
        float f = this.LIZ;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.LIZLLL, this.LIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        LIZJ(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.LJII;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.LIZIZ.getColor()) {
            z = true;
            this.LIZIZ.setColor(colorForState);
        } else {
            z = false;
        }
        ColorStateList colorStateList2 = this.LJIIIZ;
        if (colorStateList2 != null && (mode = this.LJIIJ) != null) {
            this.LJIIIIZZ = LIZ(colorStateList2, mode);
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZIZ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZIZ.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.LJIIIZ = colorStateList;
        this.LJIIIIZZ = LIZ(colorStateList, this.LJIIJ);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.LJIIJ = mode;
        this.LJIIIIZZ = LIZ(this.LJIIIZ, mode);
        invalidateSelf();
    }

    public C19RP(float f, ColorStateList colorStateList) {
        this.LIZ = f;
        LIZIZ(colorStateList);
        this.LIZJ = new RectF();
        this.LIZLLL = new Rect();
    }

    public final PorterDuffColorFilter LIZ(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }
}
