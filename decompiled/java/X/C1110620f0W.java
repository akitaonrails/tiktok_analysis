package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0f0W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1110620f0W extends C1113930f5r {
    public final int LJJJLZIJ;
    public String LJJJZ;
    public int LJJL;
    public InterfaceC1110610f0V LJJLI;
    public C1110600f0U LJJLIIIIJ;
    public float LJJLIIIJ;
    public final C01GW LJJLIIIJILLIZJL;
    public final C01GW LJJLIIIJJI;
    public final C01GW LJJLIIIJJIZ;

    @Override // X.C1113930f5r
    public final int LJFF() {
        int i = this.LJJJLZIJ;
        return i != 0 ? i : super.LJFF();
    }

    public void LJIIZILJ() {
        ((ValueAnimator) this.LJJLIIIJILLIZJL.getValue()).cancel();
        ((ValueAnimator) this.LJJLIIIJJI.getValue()).cancel();
        ((ValueAnimator) this.LJJLIIIJJIZ.getValue()).cancel();
    }

    @Override // X.C1113930f5r
    public final String LJIILIIL() {
        return this.LJJJZ;
    }

    @Override // X.C1113930f5r
    public final void LJIILL(Canvas canvas) {
        canvas.restore();
    }

    @Override // X.AbstractC521080Kc6
    public final int LIZJ(Paint paint, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i2 = this.LIZJ;
            if (i2 > i) {
                int i3 = i2 / 2;
                int i4 = i / 4;
                int i5 = i3 - i4;
                int i6 = -(i3 + i4);
                fontMetricsInt.ascent = i6;
                fontMetricsInt.top = i6;
                fontMetricsInt.bottom = i5;
                fontMetricsInt.descent = i5;
            }
        }
        if (this.LIZIZ < 0) {
            this.LIZIZ = LJ(paint);
        }
        return this.LIZIZ;
    }

    @Override // X.C1113930f5r, X.AbstractC521080Kc6
    public void LIZLLL(Canvas canvas, Paint paint) {
        int i = this.LJJL;
        boolean z = true;
        if (i >= 0 && i < 256) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.LIZIZ, this.LIZJ, i, 31);
        } else {
            z = false;
        }
        super.LIZLLL(canvas, paint);
        if (z) {
            canvas.restore();
        }
    }

    @Override // X.C1113930f5r
    public final void LJIILJJIL(Canvas canvas, Paint paint) {
        int i;
        int i2;
        C1119920fFW.LIZLLL(this.LIZ, paint, this.LIZLLL, this.LJJJI);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        paint.setColor(this.LJJIJIIJI);
        paint.setStyle(Paint.Style.FILL);
        if (this.LJIIL) {
            i2 = (((this.LIZIZ - this.LJJJJI) - this.LJJIIZI) - (this.LJJJJL + this.LJJIFFI)) - this.LJJJJLL;
        } else {
            int i3 = ((Rect) this.LJJJ.getValue()).right + this.LJJIIZI;
            if (this.LJIILIIL && this.LJI != null) {
                i = 0;
            } else {
                i = this.LJJJJL + this.LJJIFFI;
            }
            i2 = i3 + i;
        }
        int alpha = paint.getAlpha();
        Integer num = -1;
        if (num.intValue() >= 0) {
            paint.setAlpha(num.intValue());
        }
        float f = fontMetrics.bottom;
        canvas.drawText(String.valueOf(this.LJJJZ), i2, (LJIIJ() / 2) + (((f - fontMetrics.top) / 2) - f), paint);
        paint.setAlpha(alpha);
    }

    @Override // X.C1113930f5r
    public final void LJIILLIIL(Canvas canvas, RectF rectF) {
        canvas.save();
        float f = 2;
        canvas.rotate(this.LJJLIIIJ, rectF.left + (rectF.width() / f), rectF.top + (rectF.height() / f));
    }

    public C1110620f0W(Context context, Bitmap bitmap, int i, String str, C521100Kc8 c521100Kc8) {
        super(context, bitmap, null, null, str, c521100Kc8);
        this.LJJJLZIJ = i;
        this.LJJJZ = str;
        this.LJJL = 255;
        this.LJJLIIIJILLIZJL = C292401Bi.LIZ(new AwS561S0100000_17(this, 627));
        this.LJJLIIIJJI = C292401Bi.LIZ(new AwS561S0100000_17(this, 629));
        this.LJJLIIIJJIZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 628));
    }
}
