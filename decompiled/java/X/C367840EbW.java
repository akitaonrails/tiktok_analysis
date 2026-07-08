package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;

/* JADX INFO: renamed from: X.0EbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367840EbW {
    public static final float LJIIIIZZ = C390810FTz.LIZ(8.0f);
    public static final float LJIIIZ = C390810FTz.LIZ(12.0f);
    public static final float LJIIJ = C390810FTz.LIZ(8.0f);
    public static final float LJIIJJI = C390810FTz.LIZ(3.0f);
    public final InterfaceC368560Ecg LIZ;
    public final Rect LIZIZ = new Rect();
    public final Path LIZJ = new Path();
    public final RectF LIZLLL = new RectF();
    public final Paint LJ;
    public final TextPaint LJFF;
    public int LJI;
    public float LJII;

    public C367840EbW(InterfaceC368560Ecg interfaceC368560Ecg) {
        this.LIZ = interfaceC368560Ecg;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        this.LJ = paint;
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(LJIIJ);
        textPaint.setStrokeWidth(C390810FTz.LIZ(1.0f));
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setStyle(Paint.Style.FILL);
        this.LJFF = textPaint;
    }

    public final void LIZ(Canvas canvas, String str, int i) {
        View view;
        int measuredHeight;
        Object obj = this.LIZ;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            measuredHeight = view.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        this.LJI = measuredHeight + C390810FTz.LIZ(1.0f);
        this.LJFF.setColor(i);
        this.LJFF.getTextBounds(str, 0, str.length(), this.LIZIZ);
        float f = 2;
        float fWidth = this.LIZIZ.width() + (LJIIJJI * f);
        this.LJII = fWidth;
        RectF rectF = this.LIZLLL;
        float f2 = LJIIIIZZ;
        float f3 = this.LJI;
        float f4 = LJIIIZ;
        float f5 = (f3 - f4) / f;
        rectF.set(f2, f5, fWidth + f2, f5 + f4);
        this.LJ.setColor(-1);
        canvas.drawRect(this.LIZLLL, this.LJ);
        this.LJ.setColor(i);
        C0FXK c0fxk = new C0FXK(this, canvas, 1);
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf((this.LJI - f4) / f);
        InterfaceC368720Ecw.LJLLLLLL.getClass();
        float f6 = C367890Ebb.LIZIZ;
        c0fxk.invoke(fValueOf, fValueOf2, Float.valueOf(f6), Float.valueOf(f6));
        float f7 = -f6;
        c0fxk.invoke(Float.valueOf(f2), Float.valueOf((this.LJI + f4) / f), Float.valueOf(f6), Float.valueOf(f7));
        c0fxk.invoke(Float.valueOf(this.LJII + f2), Float.valueOf((this.LJI - f4) / f), Float.valueOf(f7), Float.valueOf(f6));
        c0fxk.invoke(Float.valueOf(this.LJII + f2), Float.valueOf((this.LJI + f4) / f), Float.valueOf(f7), Float.valueOf(f7));
        this.LIZJ.reset();
        canvas.drawText(str, (f2 + (this.LJII / f)) - (this.LIZIZ.width() / 2), (this.LJI / 2) + ((Math.abs(this.LJFF.ascent()) - this.LJFF.descent()) / f), this.LJFF);
    }
}
