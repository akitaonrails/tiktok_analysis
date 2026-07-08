package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* JADX INFO: renamed from: X.0GQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415350GQj extends AbstractC415370GQl {
    public ColorStateList LJ;
    public PorterDuff.Mode LJFF = PorterDuff.Mode.SRC_IN;

    public C415350GQj() {
        this.LIZJ.LJIIIZ(13.6652f, 6.7831f);
        this.LIZJ.LJFF(15.1619f, 8.01141f, 15.9103f, 8.62556f, 16.7969f, 8.85133f);
        this.LIZJ.LJFF(17.5753f, 9.04956f, 18.4249f, 9.04956f, 19.2033f, 8.85133f);
        this.LIZJ.LJFF(20.0899f, 8.62556f, 20.8382f, 8.0114f, 22.3349f, 6.7831f);
        this.LIZJ.LJIIIIZZ(27.0442f, 2.91825f);
        this.LIZJ.LJFF(29.3039f, 1.06375f, 32.5684f, 0.0f, 36.0f, 0.0f);
        this.LIZJ.LJIIIIZZ(0.0f, 0.0f);
        this.LIZJ.LJFF(3.43166f, 0.0f, 6.69628f, 1.06378f, 8.95605f, 2.91834f);
        this.LIZJ.LJIIIIZZ(13.6652f, 6.7831f);
        this.LIZJ.LJ();
        this.LIZJ.LJIJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-1);
        this.LIZ.add(this.LIZIZ);
    }

    public final void LIZJ() {
        ColorStateList colorStateList = this.LJ;
        if (colorStateList != null) {
            setColorFilter(new PorterDuffColorFilter(colorStateList.getColorForState(getState(), colorStateList.getDefaultColor()), this.LJFF));
        } else {
            setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.LJ;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // X.AbstractC415370GQl
    public final void LIZ(Canvas canvas) {
        LIZIZ(36.0f, 9.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        LIZJ();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.LJ = colorStateList;
        LIZJ();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        this.LJFF = mode;
        LIZJ();
        invalidateSelf();
    }
}
