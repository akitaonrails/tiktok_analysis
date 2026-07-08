package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416080GTe implements InterfaceC389890FQl {
    public static final float LJIILJJIL;
    public static final float LJIILL;
    public static final float LJIILLIIL;
    public static final float LJIIZILJ;
    public static final float LJIJ;
    public final Paint LIZ;
    public final Paint LIZIZ;
    public final Paint LIZJ;
    public final Paint LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public Rect LJII;
    public final RectF LJIIIIZZ;
    public final Path LJIIIZ;
    public final Path LJIIJ;
    public final Path LJIIJJI;
    public final Path LJIIL;
    public final Path LJIILIIL;

    static {
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        LJIILJJIL = fLIZIZ;
        LJIILL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)) + fLIZIZ;
        LJIILLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        LJIIZILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)) + fLIZIZ;
        LJIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    }

    public final RectF LIZIZ() {
        this.LJIIIIZZ.set(this.LJII);
        return this.LJIIIIZZ;
    }

    public C416080GTe() {
        Paint paint = new Paint(1);
        this.LIZ = paint;
        Paint paint2 = new Paint(1);
        this.LIZIZ = paint2;
        Paint paint3 = new Paint(1);
        this.LIZJ = paint3;
        Paint paint4 = new Paint(1);
        this.LIZLLL = paint4;
        this.LJ = -16777216;
        this.LJI = true;
        this.LJII = new Rect();
        this.LJIIIIZZ = new RectF();
        this.LJIIIZ = new Path();
        this.LJIIJ = new Path();
        this.LJIIJJI = new Path();
        this.LJIIL = new Path();
        this.LJIILIIL = new Path();
        paint.setColor(-1);
        float f = LJIILJJIL;
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-2130706433);
        paint2.setStrokeWidth(f);
        paint2.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint3.setStrokeWidth(LJIILL);
        paint3.setStyle(Paint.Style.STROKE);
        paint4.setColor(-1);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(LJIIZILJ);
    }

    @Override // X.InterfaceC389890FQl
    public final void LIZ(Canvas canvas, Rect rect) {
        this.LJII = rect;
        int iSave = canvas.save();
        try {
            this.LJIILIIL.reset();
            this.LJIILIIL.addRect(LIZIZ(), Path.Direction.CW);
            this.LJIILIIL.setFillType(Path.FillType.INVERSE_WINDING);
            canvas.clipPath(this.LJIILIIL);
            canvas.drawColor(this.LJ);
            canvas.restoreToCount(iSave);
            if (this.LJFF) {
                float f = (LIZIZ().right - LIZIZ().left) / 3.0f;
                float f2 = (LIZIZ().bottom - LIZIZ().top) / 3.0f;
                int i = 1;
                do {
                    float f3 = i;
                    float f4 = f3 * f;
                    canvas.drawLine(LIZIZ().left + f4, LIZIZ().top, LIZIZ().left + f4, LIZIZ().bottom, this.LIZIZ);
                    float f5 = f3 * f2;
                    canvas.drawLine(LIZIZ().left, LIZIZ().top + f5, LIZIZ().right, LIZIZ().top + f5, this.LIZIZ);
                    i++;
                } while (i < 3);
            }
            if (this.LJI) {
                float f6 = LIZIZ().left;
                float f7 = LIZIZ().top;
                float f8 = 2;
                float f9 = LJIILJJIL / f8;
                canvas.drawLine(f6, f7 - f9, LIZIZ().right, LIZIZ().top - f9, this.LIZ);
                canvas.drawLine(LIZIZ().left - f9, LIZIZ().top, LIZIZ().left - f9, LIZIZ().bottom, this.LIZ);
                canvas.drawLine(LIZIZ().right + f9, LIZIZ().top, LIZIZ().right + f9, LIZIZ().bottom, this.LIZ);
                canvas.drawLine(LIZIZ().left, LIZIZ().bottom + f9, LIZIZ().right, LIZIZ().bottom + f9, this.LIZ);
                this.LJIIIZ.reset();
                Path path = this.LJIIIZ;
                float f10 = LIZIZ().left;
                float f11 = LJIILL / f8;
                float f12 = LIZIZ().top;
                float f13 = LJIILLIIL;
                path.moveTo(f10 - f11, f12 + f13 + f11);
                this.LJIIIZ.lineTo(LIZIZ().left - f11, LIZIZ().top - f11);
                this.LJIIIZ.lineTo(LIZIZ().left + f13 + f11, LIZIZ().top - f11);
                canvas.drawPath(this.LJIIIZ, this.LIZJ);
                this.LJIIJ.reset();
                this.LJIIJ.moveTo(LIZIZ().left - f11, (LIZIZ().bottom - f13) - f11);
                this.LJIIJ.lineTo(LIZIZ().left - f11, LIZIZ().bottom + f11);
                this.LJIIJ.lineTo(LIZIZ().left + f13 + f11, LIZIZ().bottom + f11);
                canvas.drawPath(this.LJIIJ, this.LIZJ);
                this.LJIIJJI.reset();
                this.LJIIJJI.moveTo(LIZIZ().right + f11, LIZIZ().top + f13 + f11);
                this.LJIIJJI.lineTo(LIZIZ().right + f11, LIZIZ().top - f11);
                this.LJIIJJI.lineTo((LIZIZ().right - f13) - f11, LIZIZ().top - f11);
                canvas.drawPath(this.LJIIJJI, this.LIZJ);
                this.LJIIL.reset();
                this.LJIIL.moveTo(LIZIZ().right + f11, (LIZIZ().bottom - f13) - f11);
                this.LJIIL.lineTo(LIZIZ().right + f11, LIZIZ().bottom + f11);
                this.LJIIL.lineTo((LIZIZ().right - f13) - f11, LIZIZ().bottom + f11);
                canvas.drawPath(this.LJIIL, this.LIZJ);
                float fCenterX = this.LJII.centerX();
                float f14 = LJIJ / f8;
                float f15 = this.LJII.top;
                float f16 = LJIIZILJ / f8;
                canvas.drawLine(fCenterX - f14, f15 - f16, r3.centerX() + f14, this.LJII.top - f16, this.LIZLLL);
                Rect rect2 = this.LJII;
                canvas.drawLine(this.LJII.centerX() - f14, rect2.bottom + f16, rect2.centerX() + f14, this.LJII.bottom + f16, this.LIZLLL);
                Rect rect3 = this.LJII;
                float f18 = rect3.left - f16;
                float fCenterY = rect3.centerY() - f14;
                Rect rect4 = this.LJII;
                canvas.drawLine(f18, fCenterY, rect4.left - f16, rect4.centerY() + f14, this.LIZLLL);
                Rect rect5 = this.LJII;
                float f19 = rect5.right + f16;
                float fCenterY2 = rect5.centerY() - f14;
                Rect rect6 = this.LJII;
                canvas.drawLine(f19, fCenterY2, rect6.right + f16, rect6.centerY() + f14, this.LIZLLL);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }
}
