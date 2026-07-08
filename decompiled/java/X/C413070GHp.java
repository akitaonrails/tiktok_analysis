package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0GHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C413070GHp extends AbstractC415370GQl {
    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 24;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 24;
    }

    public C413070GHp() {
        this.LIZIZ.setStyle(Paint.Style.STROKE);
        this.LIZIZ.setStrokeWidth(1.5f);
    }

    @Override // X.AbstractC415370GQl
    public final void LIZ(Canvas canvas) {
        LIZIZ(24.0f, 24.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }

    public final void LIZJ(float f, boolean z, boolean z2) {
        this.LIZJ.LIZ.reset();
        if (z) {
            this.LIZJ.LJIIIZ(23.25f, 12.0f);
            this.LIZJ.LJIIJ(11.25f, 11.25f, true, true, -22.5f, 0.0f);
            this.LIZJ.LJIIJ(11.25f, 11.25f, false, true, 22.5f, 0.0f);
            this.LIZJ.LJ();
            return;
        }
        this.LIZJ.LIZJ(new RectF(1.75f, 1.75f, 22.25f, 22.25f), f, f, Path.Direction.CW);
    }
}
