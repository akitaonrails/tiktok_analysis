package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0GHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC413080GHq extends AbstractC415370GQl {
    public final Paint LJ;
    public final C415290GQd LJFF;

    public abstract void LIZJ(C415290GQd c415290GQd);

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 24;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 24;
    }

    public AbstractC413080GHq() {
        this.LIZJ.LJIJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint paint = new Paint();
        this.LJ = paint;
        C415290GQd c415290GQd = new C415290GQd();
        this.LJFF = c415290GQd;
        LIZJ(c415290GQd);
        c415290GQd.LJIJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC415370GQl
    public final void LIZ(Canvas canvas) {
        LIZIZ(24.0f, 24.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        int i = 0;
        do {
            canvas.drawPath(this.LJFF.LIZ, this.LJ);
            i++;
        } while (i < 5);
    }

    public final void LJ(int i) {
        this.LIZIZ.setColor(i);
    }

    public final void LIZLLL(float f, boolean z, boolean z2) {
        this.LIZJ.LIZ.reset();
        if (z) {
            if (z2) {
                this.LIZJ.LJIIIZ(12.0f, 23.0f);
                this.LIZJ.LJIIJ(11.0f, 11.0f, true, false, 0.0f, -22.0f);
                this.LIZJ.LJIIJ(11.0f, 11.0f, false, false, 0.0f, 22.0f);
            } else {
                this.LIZJ.LJIIIZ(12.0f, 24.0f);
                this.LIZJ.LJIIJ(12.0f, 12.0f, true, false, 0.0f, -24.0f);
                this.LIZJ.LJIIJ(12.0f, 12.0f, false, false, 0.0f, 24.0f);
            }
            this.LIZJ.LJ();
            return;
        }
        if (z2) {
            this.LIZJ.LIZJ(new RectF(2.0f, 2.0f, 22.0f, 22.0f), f, f, Path.Direction.CW);
        } else {
            this.LIZJ.LIZJ(new RectF(0.0f, 0.0f, 24.0f, 24.0f), f, f, Path.Direction.CW);
        }
    }
}
