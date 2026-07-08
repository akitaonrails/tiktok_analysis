package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0FpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C401790FpB extends AbstractC415370GQl {
    public final Paint LJ;
    public final C415290GQd LJFF;
    public final Paint LJI;
    public final C415290GQd LJII;

    public C401790FpB() {
        this.LIZJ.LIZJ(new RectF(0.0f, 0.0f, 18.0f, 18.0f), 9.0f, 9.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-8097537);
        this.LIZ.add(this.LIZIZ);
        Paint paint = new Paint();
        this.LJ = paint;
        C415290GQd c415290GQd = new C415290GQd();
        this.LJFF = c415290GQd;
        c415290GQd.LJIIIZ(11.0303f, 12.1823f);
        c415290GQd.LJII(9.52672f);
        c415290GQd.LJIIIIZZ(9.04143f, 10.4328f);
        c415290GQd.LJII(6.72134f);
        c415290GQd.LJIIIIZZ(6.23605f, 12.1823f);
        c415290GQd.LJII(4.73242f);
        c415290GQd.LJIIIIZZ(6.78439f, 5.51562f);
        c415290GQd.LJII(8.97838f);
        c415290GQd.LJIIIIZZ(11.0303f, 12.1823f);
        c415290GQd.LJ();
        c415290GQd.LJIIIZ(7.86228f, 6.31966f);
        c415290GQd.LJIIIIZZ(7.03882f, 9.28871f);
        c415290GQd.LJII(8.72395f);
        c415290GQd.LJIIIIZZ(7.90017f, 6.31966f);
        c415290GQd.LJII(7.86228f);
        c415290GQd.LJ();
        c415290GQd.LJIJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LIZ.add(paint);
        Paint paint2 = new Paint();
        this.LJI = paint2;
        C415290GQd c415290GQd2 = new C415290GQd();
        this.LJII = c415290GQd2;
        c415290GQd2.LJIIIZ(12.9285f, 5.51562f);
        c415290GQd2.LJIJI(12.1823f);
        c415290GQd2.LJII(11.4819f);
        c415290GQd2.LJIJI(5.51562f);
        c415290GQd2.LJII(12.9285f);
        c415290GQd2.LJ();
        c415290GQd2.LJIJ(Path.FillType.WINDING);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-1);
        this.LIZ.add(paint2);
    }

    @Override // X.AbstractC415370GQl
    public final void LIZ(Canvas canvas) {
        LIZIZ(18.0f, 18.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
