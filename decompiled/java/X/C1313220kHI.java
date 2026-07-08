package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;

/* JADX INFO: renamed from: X.0kHI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1313220kHI {
    public static final double[] LJIL = {1.0d, 0.8027415617602307d, 0.6443940149772542d, 0.5172818579717866d, 0.41524364653850576d, 0.3333333333333333d, 0.2075805205867436d, 0.1147980049924181d, 0.0424272859905955d, 0.0d};
    public final Paint LIZIZ;
    public final Paint LIZJ;
    public final Paint LIZLLL;
    public final Paint LJ;
    public final Paint LJFF;
    public final RectF LJI;
    public final RectF LJII;
    public final float[] LJIIIIZZ;
    public final float[] LJIIIZ;
    public C1313360kHW LJIIJ;
    public final Path LJIIJJI = new Path();
    public final Path LJIIL = new Path();
    public final Path LJIILIIL = new Path();
    public final Path LJIILJJIL = new Path();
    public final Path LJIILL = new Path();
    public final Path LJIILLIIL = new Path();
    public final Path LJIIZILJ = new Path();
    public final Path LJIJ = new Path();
    public final Path LJIJI = new Path();
    public final Path LJIJJ = new Path();
    public boolean LJIJJLI = false;
    public final Paint LIZ = new Paint(5);

    public C1313220kHI() {
        Paint paint = new Paint(5);
        this.LIZIZ = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        this.LIZJ = new Paint(paint);
        this.LIZLLL = new Paint(paint);
        this.LJ = new Paint(paint);
        this.LJI = new RectF();
        this.LJII = new RectF();
        this.LJFF = new Paint(paint);
        this.LJIIIIZZ = new float[8];
        this.LJIIIZ = new float[8];
    }

    public final void LIZJ(Canvas canvas) {
        if (this.LJIIJ == null) {
            return;
        }
        int iSave = canvas.save();
        RectF rectF = this.LJI;
        canvas.translate(rectF.left, rectF.top);
        canvas.drawPath(this.LJIILIIL, this.LIZIZ);
        canvas.drawPath(this.LJIIZILJ, this.LJFF);
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        RectF rectF2 = this.LJI;
        canvas.translate(rectF2.right, rectF2.bottom);
        canvas.rotate(180.0f);
        canvas.drawPath(this.LJIILJJIL, this.LJ);
        canvas.drawPath(this.LJIJ, this.LJFF);
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF3 = this.LJI;
        canvas.translate(rectF3.left, rectF3.bottom);
        canvas.rotate(270.0f);
        canvas.drawPath(this.LJIILL, this.LIZLLL);
        canvas.drawPath(this.LJIJI, this.LJFF);
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF4 = this.LJI;
        canvas.translate(rectF4.right, rectF4.top);
        canvas.rotate(90.0f);
        canvas.drawPath(this.LJIILLIIL, this.LIZJ);
        canvas.drawPath(this.LJIJJ, this.LJFF);
        canvas.restoreToCount(iSave4);
    }

    public final void LIZLLL(Canvas canvas) {
        Region.Op op;
        if (this.LJIIJ == null) {
            return;
        }
        int iSave = canvas.save();
        if (this.LJIJJLI) {
            Path path = this.LJIIL;
            if (this.LJIIJ.LIZ()) {
                op = Region.Op.INTERSECT;
            } else {
                op = Region.Op.DIFFERENCE;
            }
            canvas.clipPath(path, op);
        }
        canvas.drawPath(this.LJIIJJI, this.LIZ);
        try {
            LIZJ(canvas);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception occurred while drawing shadow: ");
            sbLIZ.append(e.getStackTrace().toString());
            LynxLog.e("UIShadowProxy", C2188811AlT.LIZIZ(sbLIZ));
        }
        canvas.restoreToCount(iSave);
    }

    public final void LIZIZ(Path path, float f, float f2) {
        float f3;
        path.reset();
        if (this.LJIIJ.LIZ()) {
            f3 = this.LJIIJ.LJFF;
        } else {
            f3 = -this.LJIIJ.LJFF;
        }
        RectF rectF = new RectF(0.0f, 0.0f, f * 2.0f, f2 * 2.0f);
        RectF rectF2 = new RectF(rectF);
        if (f3 > 0.0f) {
            float fMin = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            if (f3 > fMin) {
                f3 = fMin;
            }
        }
        if (f3 > -0.1f && f3 < 0.1f) {
            return;
        }
        rectF2.inset(f3, f3);
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(0.0f, f2);
        path.rLineTo(f3, 0.0f);
        path.arcTo(rectF2, 180.0f, 90.0f, false);
        path.arcTo(rectF, 270.0f, -90.0f, false);
        path.close();
    }

    public final void LIZ(Paint paint, int[] iArr, float f, float f2) {
        C1313360kHW c1313360kHW = this.LJIIJ;
        float f3 = c1313360kHW.LJFF;
        float f4 = (f + f2) / 2.0f;
        boolean zLIZ = c1313360kHW.LIZ();
        double[] dArr = LJIL;
        int i = 9;
        float f5 = 1.0f;
        if (zLIZ) {
            if (f4 <= 1.0E-6d) {
                paint.setShader(null);
                return;
            }
            float f6 = f3 / f4;
            float[] fArr = new float[11];
            int[] iArr2 = new int[11];
            fArr[10] = 1.0f;
            iArr2[10] = this.LJIIJ.LIZ;
            int i2 = 1;
            do {
                int i3 = 10 - i2;
                fArr[i3] = Math.max(f5 - ((i2 * f6) / i), 0.0f);
                iArr2[i3] = Color.argb((int) (((double) iArr[0]) * dArr[i2]), iArr[1], iArr[2], iArr[3]);
                i2++;
                i = 9;
                f5 = 1.0f;
            } while (i2 < 10);
            fArr[0] = 0.0f;
            iArr2[0] = Color.argb(0, iArr[1], iArr[2], iArr[3]);
            paint.setShader(new RadialGradient(f, f2, f4, iArr2, fArr, Shader.TileMode.CLAMP));
            return;
        }
        float f7 = f3 + f4;
        if (f7 <= 1.0E-6d) {
            paint.setShader(null);
            return;
        }
        float f8 = f4 / f7;
        float[] fArr2 = new float[11];
        int[] iArr3 = new int[11];
        fArr2[0] = 0.0f;
        fArr2[1] = f8;
        int i4 = this.LJIIJ.LIZ;
        iArr3[0] = i4;
        iArr3[1] = i4;
        int i5 = 2;
        do {
            int i6 = i5 - 1;
            fArr2[i5] = (((1.0f - f8) * i6) / 9) + f8;
            iArr3[i5] = Color.argb((int) (((double) iArr[0]) * dArr[i6]), iArr[1], iArr[2], iArr[3]);
            i5++;
        } while (i5 <= 10);
        paint.setShader(new RadialGradient(f, f2, f7, iArr3, fArr2, Shader.TileMode.CLAMP));
    }
}
