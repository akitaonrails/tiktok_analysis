package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EcD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368270EcD implements InterfaceC369160Ede {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final Paint LIZJ;
    public final C444890HcV LIZLLL;
    public final float LJ;
    public final C01GW LJFF;
    public final String LJI;
    public final int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final int LJIIJ;
    public final Path LJIIJJI;
    public int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;

    @Override // X.InterfaceC369160Ede
    public final int LIZIZ() {
        return this.LJIILJJIL;
    }

    public C368270EcD(C19EG c19eg) {
        int iLIZ;
        float f;
        int i;
        this.LIZ = c19eg;
        boolean zLIZJ = C444960Hcc.LIZJ(c19eg);
        this.LIZIZ = zLIZJ;
        Paint paint = new Paint();
        this.LIZJ = paint;
        C444890HcV c444890HcV = new C444890HcV();
        if (zLIZJ) {
            c444890HcV.setTextAlign(Paint.Align.RIGHT);
        }
        this.LIZLLL = c444890HcV;
        C293820BfQ.LIZ();
        this.LJ = C418440Gaw.LIZIZ(8);
        this.LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 410));
        String string = c19eg.getString(2131833406);
        this.LJI = string;
        Rect rect = new Rect();
        if (C293820BfQ.LIZ()) {
            iLIZ = C0FU0.LIZ(12.0f);
        } else {
            iLIZ = C0FU0.LIZ(8.0f);
        }
        this.LJII = iLIZ;
        this.LJIIIIZZ = AbstractC367990Ebl.LJIILJJIL;
        this.LJIIIZ = C0FU0.LIZ(9.0f);
        if (C293820BfQ.LIZ()) {
            f = 10.0f;
        } else {
            f = 4.0f;
        }
        int iLIZ2 = C0FU0.LIZ(f);
        this.LJIIJ = iLIZ2;
        this.LJIIJJI = new Path();
        this.LJIIL = C0FU0.LIZ(8.0f);
        int iLIZ3 = C0FU0.LIZ(16.0f);
        this.LJIILIIL = iLIZ3;
        int iLIZ4 = C0FU0.LIZ(8.0f);
        paint.setAntiAlias(true);
        paint.setColor(c19eg.getResources().getColor(R.color.b3));
        c444890HcV.setAntiAlias(true);
        if (C293820BfQ.LIZ()) {
            i = 62;
        } else {
            i = 51;
        }
        c444890HcV.LIZ(i);
        c444890HcV.setStrokeWidth(1.0f);
        c444890HcV.setStyle(Paint.Style.FILL_AND_STROKE);
        c444890HcV.setColor(c19eg.getResources().getColor(R.color.f569bc));
        c444890HcV.getTextBounds(string, 0, string.length(), rect);
        this.LJIILJJIL = iLIZ + iLIZ3 + iLIZ2 + rect.width() + iLIZ4;
    }

    @Override // X.InterfaceC369160Ede
    public final void LIZ(Canvas canvas, float f, float f2, float f3, float f4) {
        canvas.save();
        if (C293820BfQ.LIZ()) {
            int iAbs = (int) Math.abs(f4 - f2);
            this.LJIIIIZZ = iAbs;
            this.LJIIL = (iAbs - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))) / 2;
            this.LJIIIZ = (this.LJIIIIZZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))) / 2;
        }
        if (Math.abs(f - f3) < this.LJIILJJIL) {
            this.LJIIJJI.reset();
            Path path = this.LJIIJJI;
            float f5 = this.LJ;
            path.addRoundRect(f, f2, f3, f4, f5, f5, Path.Direction.CW);
            canvas.clipPath(this.LJIIJJI);
        }
        TuxIconDrawable tuxIconDrawable = (TuxIconDrawable) this.LJFF.getValue();
        if (tuxIconDrawable != null) {
            if (this.LIZIZ) {
                int i = ((int) f3) - this.LJII;
                int i2 = this.LJIILIIL;
                int i3 = ((int) f2) + this.LJIIIZ;
                tuxIconDrawable.setBounds(i - i2, i3, i, i2 + i3);
            } else {
                int i4 = ((int) f) + this.LJII;
                int i5 = ((int) f2) + this.LJIIIZ;
                int i6 = this.LJIILIIL;
                tuxIconDrawable.setBounds(i4, i5, i4 + i6, i6 + i5);
            }
            tuxIconDrawable.draw(canvas);
            if (this.LIZIZ) {
                canvas.drawText(this.LJI, ((f3 - this.LJII) - this.LJIILIIL) - this.LJIIJ, this.LJIIL + f2 + this.LIZLLL.getTextSize(), this.LIZLLL);
            } else {
                canvas.drawText(this.LJI, this.LJII + f + this.LJIILIIL + this.LJIIJ, this.LJIIL + f2 + this.LIZLLL.getTextSize(), this.LIZLLL);
            }
        }
        if (this.LIZIZ) {
            float fMax = f3 - Math.max(f3 - f, this.LJIILJJIL);
            float fLIZIZ = C1415610mwR.LIZIZ();
            int i7 = C368630Ecn.LLLLJI;
            float fLIZ = fLIZIZ - C369020EdQ.LIZ();
            if (f <= f3 - (C1415610mwR.LIZIZ() / 2)) {
                RectF rectF = new RectF(fMax, f2, fLIZ, f4);
                Path path2 = new Path();
                path2.moveTo(rectF.left, rectF.top);
                path2.lineTo(rectF.right - this.LJ, rectF.top);
                float f6 = rectF.right;
                float f7 = 2;
                float f8 = this.LJ * f7;
                float f9 = rectF.top;
                path2.arcTo(new RectF(f6 - f8, f9, f6, f8 + f9), -90.0f, 90.0f);
                path2.lineTo(rectF.right, rectF.bottom - this.LJ);
                float f10 = rectF.right;
                float f11 = f7 * this.LJ;
                float f12 = rectF.bottom;
                path2.arcTo(new RectF(f10 - f11, f12 - f11, f10, f12), 0.0f, 90.0f);
                path2.lineTo(rectF.left, rectF.bottom);
                path2.close();
                canvas.drawPath(path2, this.LIZJ);
            } else {
                float f13 = this.LJ;
                canvas.drawRoundRect(fMax, f2, fLIZ, f4, f13, f13, this.LIZJ);
            }
        } else {
            int i8 = C368630Ecn.LLLLJI;
            float fLIZ2 = C369020EdQ.LIZ();
            float fMax2 = f + Math.max(f3 - f, this.LJIILJJIL);
            if (f3 >= (C1415610mwR.LIZIZ() / 2) + f) {
                RectF rectF2 = new RectF(fLIZ2, f2, fMax2, f4);
                Path path3 = new Path();
                path3.moveTo(rectF2.left + this.LJ, rectF2.top);
                path3.lineTo(rectF2.right, rectF2.top);
                path3.lineTo(rectF2.right, rectF2.bottom);
                path3.lineTo(rectF2.left + this.LJ, rectF2.bottom);
                float f14 = rectF2.left;
                float f15 = rectF2.bottom;
                float f16 = 2;
                float f18 = this.LJ * f16;
                path3.arcTo(new RectF(f14, f15 - f18, f18 + f14, f15), 90.0f, 90.0f, false);
                path3.lineTo(rectF2.left, rectF2.top + this.LJ);
                float f19 = rectF2.left;
                float f20 = rectF2.top;
                float f21 = this.LJ * f16;
                path3.arcTo(new RectF(f19, f20, f21 + f19, f21 + f20), 180.0f, 90.0f, false);
                path3.close();
                canvas.drawPath(path3, this.LIZJ);
            } else {
                float f22 = this.LJ;
                canvas.drawRoundRect(fLIZ2, f2, fMax2, f4, f22, f22, this.LIZJ);
            }
        }
        canvas.restore();
    }
}
