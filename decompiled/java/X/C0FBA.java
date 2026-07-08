package X;

import X.AbstractC363520ENa;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FBA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0FBA<T extends AbstractC363520ENa> implements C0FBW {
    public final C363630ENl LIZ;
    public T LIZJ;
    public final TuxIconDrawable LJFF;
    public final TuxIconDrawable LJI;
    public final C444890HcV LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;
    public final float LJIIL;
    public final int LJIILIIL;
    public final DashPathEffect LJIILJJIL;
    public final double LJIILL;
    public final Paint LJIILLIIL;
    public final Paint LJIIZILJ;
    public final Paint LJIJ;
    public final Paint LJIJI;
    public final float LJIJJ;
    public final float LJIJJLI;
    public final float LJIL;
    public C0EO0 LJJ;
    public final int LJJI;
    public boolean LIZIZ = true;
    public final float LIZLLL = C418440Gaw.LIZIZ(16);
    public final float LJ = C418440Gaw.LIZIZ(64);

    public final PointF LJI() {
        C0EOF c0eof = C0EOF.LIZ;
        T t = this.LIZJ;
        C0ENU c0enuLIZ = t != null ? t.LIZ() : null;
        C0EO0 c0eo0 = this.LJJ;
        c0eof.getClass();
        return C0EOF.LIZ(c0enuLIZ, c0eo0);
    }

    @Override // X.C0FBW
    public final int LIZIZ() {
        return this.LJJI;
    }

    public final void LJII(boolean z) {
        if (this.LIZIZ == z) {
            return;
        }
        this.LIZ.LJIIL.invoke();
        this.LIZIZ = z;
    }

    public C0FBA(Context context, C363630ENl c363630ENl) {
        this.LIZ = c363630ENl;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_single_dashed;
        c419910GdJ.LJ = -16777216;
        c419910GdJ.LJFF = false;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LJFF = c419910GdJ.LIZ(context);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_chevron_up_down;
        c419910GdJ2.LJ = -16777216;
        c419910GdJ2.LJFF = false;
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LJI = c419910GdJ2.LIZ(context);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.setColor(-1);
        c444890HcV.setAntiAlias(true);
        c444890HcV.setTextSize(C418440Gaw.LIZIZ(12));
        c444890HcV.LIZ(61);
        c444890HcV.setTextAlign(Paint.Align.CENTER);
        this.LJII = c444890HcV;
        this.LJIIL = (-c444890HcV.getFontMetrics().ascent) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{C418440Gaw.LIZIZ(2), C418440Gaw.LIZIZ(2)}, 0.0f);
        this.LJIILJJIL = dashPathEffect;
        this.LJIILL = Math.sqrt((C1415610mwR.LIZIZ() * C1415610mwR.LIZIZ()) + (C1415610mwR.LIZ() * C1415610mwR.LIZ())) * ((double) 2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(1));
        paint.setColor(-340459);
        paint.setStyle(Paint.Style.STROKE);
        this.LJIILLIIL = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(C418440Gaw.LIZIZ(1));
        paint2.setColor(-15686971);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setPathEffect(dashPathEffect);
        this.LJIIZILJ = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.FILL);
        this.LJIJ = paint3;
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(-15686971);
        paint4.setStrokeWidth(C0EGK.LIZIZ() * 1.5f);
        this.LJIJI = paint4;
        this.LJIJJ = C418440Gaw.LIZIZ(3);
        this.LJIJJLI = C418440Gaw.LIZIZ(12);
        this.LJIL = C418440Gaw.LIZIZ(12);
        this.LJJI = Integer.MAX_VALUE;
    }

    public final void LIZLLL(PointF pointF, Canvas canvas) {
        C0ENU c0enuLIZ;
        T t = this.LIZJ;
        if (t != null && (c0enuLIZ = t.LIZ()) != null) {
            float f = c0enuLIZ.LIZJ;
            float f2 = this.LIZLLL;
            float f3 = f2 + (f * (this.LJ - f2));
            this.LJIILLIIL.setPathEffect(this.LJIILJJIL);
            float f4 = pointF.x;
            float f5 = pointF.y;
            canvas.drawLine(f4, f5, f4, f5 + f3, this.LJIILLIIL);
            this.LJIILLIIL.setPathEffect(null);
            LJ(new PointF(pointF.x, pointF.y + f3 + this.LJIL), this.LJFF, canvas, 1.0f);
        }
    }

    @Override // X.C0FBW
    public void LIZ(Canvas canvas, Size size, C0FEW c0few) {
        C0EO0 c0eo0;
        T t;
        if (!this.LIZIZ) {
            return;
        }
        if (this.LJIIIIZZ) {
            String str = this.LJIIJJI;
            if (str == null) {
                str = "";
            }
            canvas.drawText(str, c0few.getWidth() / 2.0f, this.LJIIL, this.LJII);
        }
        if (this.LJIIIZ && (c0eo0 = this.LJJ) != null && (t = this.LIZJ) != null) {
            float f = 2;
            float fAbs = Math.abs((t.LIZ().LIZ.x / f) * c0eo0.LIZ);
            float fAbs2 = Math.abs((t.LIZ().LIZ.y / f) * c0eo0.LIZIZ);
            canvas.save();
            canvas.clipRect(new RectF((c0few.getWidth() / 2.0f) - (size.getWidth() / 2.0f), 0.0f, (c0few.getWidth() / 2.0f) + (size.getWidth() / 2.0f), size.getHeight()));
            if (fAbs < this.LJIILIIL) {
                C0EOF c0eof = C0EOF.LIZ;
                float f2 = c0eo0.LIZJ;
                float f3 = c0eo0.LIZLLL;
                float f4 = c0eo0.LJ;
                c0eof.getClass();
                PointF pointFLIZIZ = C0EOF.LIZIZ(f2, f3 - ((int) this.LJIILL), f4, f2, f3);
                float f5 = c0eo0.LIZJ;
                float f6 = c0eo0.LIZLLL;
                PointF pointFLIZIZ2 = C0EOF.LIZIZ(f5, ((int) this.LJIILL) + f6, c0eo0.LJ, f5, f6);
                canvas.drawLine(pointFLIZIZ.x, pointFLIZIZ.y, pointFLIZIZ2.x, pointFLIZIZ2.y, this.LJIJI);
            }
            if (fAbs2 < this.LJIILIIL) {
                C0EOF c0eof2 = C0EOF.LIZ;
                float f7 = c0eo0.LIZJ;
                float f8 = c0eo0.LIZLLL;
                float f9 = c0eo0.LJ;
                c0eof2.getClass();
                PointF pointFLIZIZ3 = C0EOF.LIZIZ(f7 - ((int) this.LJIILL), f8, f9, f7, f8);
                float f10 = c0eo0.LIZJ;
                float f11 = c0eo0.LIZLLL;
                PointF pointFLIZIZ4 = C0EOF.LIZIZ(((int) this.LJIILL) + f10, f11, c0eo0.LJ, f10, f11);
                canvas.drawLine(pointFLIZIZ3.x, pointFLIZIZ3.y, pointFLIZIZ4.x, pointFLIZIZ4.y, this.LJIJI);
            }
            canvas.restore();
        }
    }

    public final void LIZJ(Canvas canvas, Size size, C0FEW c0few) {
        C0EO0 c0eo0;
        T t;
        C0ENU c0enuLIZ;
        PointF pointFLJI;
        if (!this.LJIIJ || (c0eo0 = this.LJJ) == null || (t = this.LIZJ) == null || (c0enuLIZ = t.LIZ()) == null || (pointFLJI = LJI()) == null || ((int) (c0enuLIZ.LIZIZ % 45)) != 0) {
            return;
        }
        float f = pointFLJI.x;
        float f2 = pointFLJI.y;
        int iSave = canvas.save();
        try {
            canvas.clipRect(new RectF((c0few.getWidth() / 2.0f) - (size.getWidth() / 2.0f), 0.0f, (c0few.getWidth() / 2.0f) + (size.getWidth() / 2.0f), size.getHeight()));
            iSave = canvas.save();
            try {
                canvas.rotate(c0enuLIZ.LIZIZ + c0eo0.LJ, f, f2);
                double d = f;
                double d2 = this.LJIILL;
                canvas.drawLine((float) (d - d2), f2, (float) (d + d2), f2, this.LJIIZILJ);
                canvas.restoreToCount(iSave);
                canvas.restoreToCount(iSave);
            } finally {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void LJ(PointF pointF, TuxIconDrawable tuxIconDrawable, Canvas canvas, float f) {
        int i = (int) (255 * f);
        this.LJIJ.setAlpha(i);
        canvas.drawCircle(pointF.x, pointF.y, this.LJIL, this.LJIJ);
        this.LJIJ.setAlpha(255);
        tuxIconDrawable.setBounds((int) (pointF.x - (tuxIconDrawable.LIZJ() / 2.0f)), (int) (pointF.y - (tuxIconDrawable.LIZIZ() / 2.0f)), (int) (pointF.x + (tuxIconDrawable.LIZJ() / 2.0f)), (int) (pointF.y + (tuxIconDrawable.LIZIZ() / 2.0f)));
        tuxIconDrawable.setAlpha(i);
        tuxIconDrawable.draw(canvas);
    }

    public final void LJFF(PointF pointF, PointF pointF2, Canvas canvas, float f) {
        canvas.save();
        canvas.rotate(90.0f, pointF.x, pointF.y);
        LJ(pointF, this.LJI, canvas, f);
        canvas.restore();
        if (pointF2 != null) {
            LJ(pointF2, this.LJI, canvas, f);
        }
    }

    public void LJIIIIZZ(C0EO0 c0eo0, Float f, Size size, Size size2) {
        this.LJJ = c0eo0;
    }
}
