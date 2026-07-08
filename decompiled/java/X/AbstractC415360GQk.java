package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0GQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC415360GQk extends AbstractC415370GQl {
    public ColorStateList LJ;
    public final Rect LJFF = new Rect();

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.LJ != null;
    }

    @Override // X.AbstractC415370GQl
    public final void LIZ(Canvas canvas) {
        LIZIZ(getIntrinsicWidth(), getIntrinsicHeight(), canvas);
        ColorStateList colorStateList = this.LJ;
        if (colorStateList != null) {
            this.LIZIZ.setColor(colorStateList.getColorForState(getState(), 0));
        }
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.LJ != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.LJFF;
        super.setBounds(rect.left, rect.top, rect.right, rect.bottom);
    }
}
