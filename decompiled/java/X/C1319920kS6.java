package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kS6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319920kS6 extends C1331050kk3 {
    public int LLILZIL;
    public int LLILZLL;

    public final void LJIILJJIL() {
        Drawable drawable = this.LL;
        Rect bounds = getBounds();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.LLILZIL = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.LLILZLL = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
    }

    @Override // X.C1331050kk3, X.InterfaceC1331140kkC
    public final void LJFF(Matrix matrix) {
        LJIIL(matrix);
    }

    @Override // X.C1331050kk3
    public final Drawable LJIILIIL(Drawable drawable) {
        Drawable drawableLJIILIIL = super.LJIILIIL(drawable);
        LJIILJJIL();
        return drawableLJIILIIL;
    }

    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LLILZIL != this.LL.getIntrinsicWidth() || this.LLILZLL != this.LL.getIntrinsicHeight()) {
            LJIILJJIL();
        }
        super.draw(canvas);
    }

    @Override // X.C1331050kk3, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        LJIILJJIL();
    }
}
