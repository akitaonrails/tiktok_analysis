package X;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.0kUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1321630kUr {
    public float[] LIZ;
    public final int[] LIZIZ;
    public final float[] LIZJ;
    public Path LIZLLL;
    public final Paint LJ;
    public final Paint LJFF;
    public final Paint LJI;
    public final Paint LJII;
    public final Paint LJIIIIZZ;
    public final float[] LJIIIZ;
    public int LJIIJ;
    public final Rect LJIIJJI = new Rect();
    public final int LJIIL = 1;
    public final /* synthetic */ C21526919Ml LJIILIIL;

    public C1321630kUr(C21526919Ml c21526919Ml) {
        this.LJIILIIL = c21526919Ml;
        Paint paint = new Paint();
        this.LJ = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.LJFF = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.LJI = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.LJII = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(c21526919Ml.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.LJIIIZ = new float[8];
        Paint paint5 = new Paint();
        this.LJIIIIZZ = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.LIZJ = new float[100];
        this.LIZIZ = new int[50];
    }

    public final void LIZIZ(Canvas canvas) {
        float[] fArr = this.LIZ;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[fArr.length - 2];
        float f4 = fArr[fArr.length - 1];
        canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.LJI);
        canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.LJI);
    }

    public final void LJFF(Paint paint, String str) {
        paint.getTextBounds(str, 0, str.length(), this.LJIIJJI);
    }

    public final void LIZJ(float f, float f2, Canvas canvas) {
        float[] fArr = this.LIZ;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fMin = Math.min(f3, f5);
        float fMax = Math.max(f4, f6);
        float fMin2 = f - Math.min(f3, f5);
        float fMax2 = Math.max(f4, f6) - f2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LJFF(this.LJII, strLIZIZ);
        canvas.drawText(strLIZIZ, ((fMin2 / 2.0f) - (this.LJIIJJI.width() / 2)) + fMin, f2 - 20.0f, this.LJII);
        canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.LJI);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("");
        sbLIZ2.append(((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        LJFF(this.LJII, strLIZIZ2);
        canvas.drawText(strLIZIZ2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (this.LJIIJJI.height() / 2)), this.LJII);
        canvas.drawLine(f, f2, f, Math.max(f4, f6), this.LJI);
    }

    public final void LIZLLL(float f, float f2, Canvas canvas) {
        float[] fArr = this.LIZ;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[fArr.length - 2];
        float f6 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (fHypot * fHypot);
        float f10 = f3 + (f7 * f9);
        float f11 = f4 + (f9 * f8);
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f10, f11);
        float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LJFF(this.LJII, strLIZIZ);
        canvas.drawTextOnPath(strLIZIZ, path, (fHypot2 / 2.0f) - (this.LJIIJJI.width() / 2), -20.0f, this.LJII);
        canvas.drawLine(f, f2, f10, f11, this.LJI);
    }

    public final void LIZ(Canvas canvas, int i, int i2, C21528019Mw c21528019Mw) {
        int width;
        int height;
        if (i == 4) {
            boolean z = false;
            boolean z2 = false;
            for (int i3 = 0; i3 < this.LJIIJ; i3++) {
                int i4 = this.LIZIZ[i3];
                if (i4 == 1) {
                    z = true;
                } else if (i4 == 2) {
                    z2 = true;
                }
            }
            if (z) {
                float[] fArr = this.LIZ;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.LJI);
            }
            if (z2) {
                LIZIZ(canvas);
            }
        } else if (i == 2) {
            float[] fArr2 = this.LIZ;
            canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.LJI);
        }
        if (i == 3) {
            LIZIZ(canvas);
        }
        canvas.drawLines(this.LIZ, this.LJ);
        View view = c21528019Mw.LIZ;
        if (view != null) {
            width = view.getWidth();
            height = c21528019Mw.LIZ.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        for (int i5 = 1; i5 < i2 - 1; i5++) {
            if (i != 4 || this.LIZIZ[i5 - 1] != 0) {
                float[] fArr3 = this.LIZJ;
                int i6 = i5 * 2;
                float f = fArr3[i6];
                float f2 = fArr3[i6 + 1];
                this.LIZLLL.reset();
                this.LIZLLL.moveTo(f, f2 + 10.0f);
                this.LIZLLL.lineTo(f + 10.0f, f2);
                this.LIZLLL.lineTo(f, f2 - 10.0f);
                this.LIZLLL.lineTo(f - 10.0f, f2);
                this.LIZLLL.close();
                int i7 = i5 - 1;
                ListProtector.get(c21528019Mw.LJIJ, i7);
                if (i == 4) {
                    int i8 = this.LIZIZ[i7];
                    if (i8 == 1) {
                        LIZLLL(f - 0.0f, f2 - 0.0f, canvas);
                    } else if (i8 == 2) {
                        LIZJ(f - 0.0f, f2 - 0.0f, canvas);
                    } else if (i8 == 3) {
                        LJ(f - 0.0f, f2 - 0.0f, width, height, canvas);
                    }
                    canvas.drawPath(this.LIZLLL, this.LJIIIIZZ);
                } else if (i == 2) {
                    LIZLLL(f - 0.0f, f2 - 0.0f, canvas);
                } else if (i == 3) {
                    LIZJ(f - 0.0f, f2 - 0.0f, canvas);
                } else if (i == 6) {
                    LJ(f - 0.0f, f2 - 0.0f, width, height, canvas);
                }
                canvas.drawPath(this.LIZLLL, this.LJIIIIZZ);
            }
        }
        float[] fArr4 = this.LIZ;
        if (fArr4.length > 1) {
            canvas.drawCircle(fArr4[0], fArr4[1], 8.0f, this.LJFF);
            float[] fArr5 = this.LIZ;
            canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, this.LJFF);
        }
    }

    public final void LJ(float f, float f2, int i, int i2, Canvas canvas) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (this.LJIILIIL.getWidth() - i))) + 0.5d)) / 100.0f);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LJFF(this.LJII, strLIZIZ);
        canvas.drawText(strLIZIZ, ((f / 2.0f) - (this.LJIIJJI.width() / 2)) + 0.0f, f2 - 20.0f, this.LJII);
        canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.LJI);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("");
        sbLIZ2.append(((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (this.LJIILIIL.getHeight() - i2))) + 0.5d)) / 100.0f);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        LJFF(this.LJII, strLIZIZ2);
        canvas.drawText(strLIZIZ2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.LJIIJJI.height() / 2)), this.LJII);
        canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.LJI);
    }
}
