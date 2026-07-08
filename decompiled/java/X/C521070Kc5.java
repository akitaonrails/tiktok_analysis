package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0Kc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521070Kc5 extends AbstractC521080Kc6 {
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;
    public final RectF LJIIJJI;
    public int LJIIL;

    public C521070Kc5(Context context) {
        super(context);
        this.LJI = -16777216;
        this.LJIIIZ = "";
        this.LJIIJ = -16777216;
        this.LJIIJJI = new RectF();
        this.LJIIL = 400;
    }

    @Override // X.AbstractC521080Kc6
    public final int LJ(Paint paint) {
        C1119920fFW.LIZLLL(this.LIZ, paint, this.LIZLLL, this.LJIIL);
        return ((int) paint.measureText(this.LJIIIZ)) + (this.LJIIIIZZ * 2);
    }

    @Override // X.AbstractC521080Kc6
    public final void LIZLLL(Canvas canvas, Paint paint) {
        paint.setAntiAlias(true);
        RectF rectF = this.LJIIJJI;
        rectF.bottom = this.LIZJ;
        rectF.right = this.LIZIZ;
        paint.setColor(this.LJI);
        RectF rectF2 = this.LJIIJJI;
        float f = this.LJII;
        canvas.drawRoundRect(rectF2, f, f, paint);
        C1119920fFW.LIZLLL(this.LIZ, paint, this.LIZLLL, this.LJIIL);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        paint.setColor(this.LJIIJ);
        canvas.drawText(this.LJIIIZ, this.LJIIIIZZ, ((this.LIZJ - fontMetricsInt.descent) - fontMetricsInt.ascent) / 2.0f, paint);
    }
}
