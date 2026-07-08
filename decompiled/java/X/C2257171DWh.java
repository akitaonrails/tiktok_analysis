package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: X.1DWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257171DWh {
    public final Canvas LIZ;
    public final float LIZIZ;
    public final C1290350jgP LIZJ;
    public C2257191DWj LIZLLL;
    public C2257121DWc LJ;
    public Stack<C2257121DWc> LJFF;
    public Stack<C1DXL> LJI;
    public Stack<Matrix> LJII;

    public final boolean LJIIIIZZ() {
        Boolean bool = this.LJ.LIZ.LLJJIII;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Path.FillType LJIILLIIL() {
        EnumC19381810sC enumC19381810sC = this.LJ.LIZ.LLJJJIL;
        return (enumC19381810sC == null || enumC19381810sC != EnumC19381810sC.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final boolean LJJI() {
        int i = 0;
        if (this.LJ.LIZ.LLJILJILJ.floatValue() >= 1.0f) {
            return false;
        }
        Canvas canvas = this.LIZ;
        int iFloatValue = (int) (this.LJ.LIZ.LLJILJILJ.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i = 255;
            if (iFloatValue <= 255) {
                i = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        this.LJFF.push(this.LJ);
        this.LJ = new C2257121DWc(this.LJ);
        return true;
    }

    public final void LJJIJ() {
        this.LIZ.restore();
        this.LJ = this.LJFF.pop();
    }

    public final void LJJIJIIJI() {
        this.LIZ.save();
        this.LJFF.push(this.LJ);
        this.LJ = new C2257121DWc(this.LJ);
    }

    public final void LJJIJLIJ() {
        int iLJFF;
        C2257201DWk c2257201DWk = this.LJ.LIZ;
        C1DXS c1dxs = c2257201DWk.LLJJJJLIIL;
        if (c1dxs instanceof C2257331DWx) {
            iLJFF = ((C2257331DWx) c1dxs).LL;
        } else if (!(c1dxs instanceof C1DXR)) {
            return;
        } else {
            iLJFF = c2257201DWk.LLJILLL.LL;
        }
        Float f = c2257201DWk.LLJJL;
        if (f != null) {
            iLJFF = LJFF(f.floatValue(), iLJFF);
        }
        this.LIZ.drawColor(iLJFF);
    }

    public final boolean LJJIL() {
        Boolean bool = this.LJ.LIZ.LLJJIJI;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static C2257131DWd LIZIZ(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C2257131DWd(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public static Path LJIJJ(C1DXK c1dxk) {
        Path path = new Path();
        float[] fArr = c1dxk.LJIIIIZZ;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = c1dxk.LJIIIIZZ;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (c1dxk instanceof C1DXP) {
            path.close();
        }
        if (c1dxk.LJI == null) {
            c1dxk.LJI = LIZIZ(path);
        }
        return path;
    }

    public final void LJ(C1DXM c1dxm) {
        C1DXS c1dxs = this.LJ.LIZ.LLILLJJLI;
        if (c1dxs instanceof C2257321DWw) {
            LJII(true, c1dxm.LJI, (C2257321DWw) c1dxs);
        }
        C1DXS c1dxs2 = this.LJ.LIZ.LLILZIL;
        if (c1dxs2 instanceof C2257321DWw) {
            LJII(false, c1dxm.LJI, (C2257321DWw) c1dxs2);
        }
    }

    public final void LJIIJ(Path path) {
        C2257121DWc c2257121DWc = this.LJ;
        if (c2257121DWc.LIZ.LLJJLIIIJLLLLLLLZ == EnumC19381910sD.NonScalingStroke) {
            Matrix matrix = this.LIZ.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.LIZ.setMatrix(new Matrix());
            Shader shader = this.LJ.LJ.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.LIZ.drawPath(path2, this.LJ.LJ);
            this.LIZ.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.LIZ.drawPath(path, c2257121DWc.LJ);
    }

    public final Path LJIJ(C1DX8 c1dx8) {
        float fLIZLLL;
        C2257141DWe c2257141DWe = c1dx8.LJIIIIZZ;
        float fLJ = 0.0f;
        if (c2257141DWe != null) {
            fLIZLLL = c2257141DWe.LIZLLL(this);
        } else {
            fLIZLLL = 0.0f;
        }
        C2257141DWe c2257141DWe2 = c1dx8.LJIIIZ;
        if (c2257141DWe2 != null) {
            fLJ = c2257141DWe2.LJ(this);
        }
        float fLIZIZ = c1dx8.LJIIJ.LIZIZ(this);
        float f = fLIZLLL - fLIZIZ;
        float f2 = fLJ - fLIZIZ;
        float f3 = fLIZLLL + fLIZIZ;
        float f4 = fLJ + fLIZIZ;
        if (c1dx8.LJI == null) {
            float f5 = 2.0f * fLIZIZ;
            c1dx8.LJI = new C2257131DWd(f, f2, f5, f5);
        }
        float f6 = 0.5522848f * fLIZIZ;
        Path path = new Path();
        path.moveTo(f3, fLJ);
        float f7 = fLJ + f6;
        float f8 = fLIZLLL + f6;
        path.cubicTo(f3, f7, f8, f4, fLIZLLL, f4);
        float f9 = fLIZLLL - f6;
        path.cubicTo(f9, f4, f, f7, f, fLJ);
        float f10 = fLJ - f6;
        path.cubicTo(f, f10, f9, f2, fLIZLLL, f2);
        path.cubicTo(f8, f2, f3, f10, f3, fLJ);
        path.close();
        return path;
    }

    public final Path LJIJI(C1DX5 c1dx5) {
        float fLIZLLL;
        C2257141DWe c2257141DWe = c1dx5.LJIIIIZZ;
        float fLJ = 0.0f;
        if (c2257141DWe != null) {
            fLIZLLL = c2257141DWe.LIZLLL(this);
        } else {
            fLIZLLL = 0.0f;
        }
        C2257141DWe c2257141DWe2 = c1dx5.LJIIIZ;
        if (c2257141DWe2 != null) {
            fLJ = c2257141DWe2.LJ(this);
        }
        float fLIZLLL2 = c1dx5.LJIIJ.LIZLLL(this);
        float fLJ2 = c1dx5.LJIIJJI.LJ(this);
        float f = fLIZLLL - fLIZLLL2;
        float f2 = fLJ - fLJ2;
        float f3 = fLIZLLL + fLIZLLL2;
        float f4 = fLJ + fLJ2;
        if (c1dx5.LJI == null) {
            c1dx5.LJI = new C2257131DWd(f, f2, fLIZLLL2 * 2.0f, 2.0f * fLJ2);
        }
        float f5 = fLIZLLL2 * 0.5522848f;
        float f6 = 0.5522848f * fLJ2;
        Path path = new Path();
        path.moveTo(fLIZLLL, f2);
        float f7 = fLIZLLL + f5;
        float f8 = fLJ - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fLJ);
        float f9 = f6 + fLJ;
        path.cubicTo(f3, f9, f7, f4, fLIZLLL, f4);
        float f10 = fLIZLLL - f5;
        path.cubicTo(f10, f4, f, f9, f, fLJ);
        path.cubicTo(f, f8, f10, f2, fLIZLLL, f2);
        path.close();
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Path LJIJJLI(X.C1DX2 r23) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257171DWh.LJIJJLI(X.1DX2):android.graphics.Path");
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(X.C1DXF r10) {
        /*
            Method dump skipped, instruction units count: 1237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257171DWh.LJJII(X.1DXF):void");
    }

    public final void LJJIII(C1DXL c1dxl) {
        this.LJI.push(c1dxl);
        this.LJII.push(this.LIZ.getMatrix());
        Iterator<C1DXF> it2 = c1dxl.LIZ().iterator();
        while (it2.hasNext()) {
            LJJII(it2.next());
        }
        this.LJI.pop();
        this.LJII.pop();
    }

    public final void LJJIJIIJIL(C1DXM c1dxm) {
        if (c1dxm.LIZIZ == null || c1dxm.LJI == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.LJII.peek().invert(matrix)) {
            C2257131DWd c2257131DWd = c1dxm.LJI;
            float f = c2257131DWd.LIZ;
            float f2 = c2257131DWd.LIZIZ;
            float f3 = c2257131DWd.LIZJ + f;
            int i = 2;
            float f4 = f2 + c2257131DWd.LIZLLL;
            float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
            matrix.preConcat(this.LIZ.getMatrix());
            matrix.mapPoints(fArr);
            float f5 = fArr[0];
            float f6 = fArr[1];
            RectF rectF = new RectF(f5, f6, f5, f6);
            do {
                float f7 = fArr[i];
                if (f7 < rectF.left) {
                    rectF.left = f7;
                }
                if (f7 > rectF.right) {
                    rectF.right = f7;
                }
                float f8 = fArr[i + 1];
                if (f8 < rectF.top) {
                    rectF.top = f8;
                }
                if (f8 > rectF.bottom) {
                    rectF.bottom = f8;
                }
                i += 2;
            } while (i <= 6);
            C1DXM c1dxm2 = (C1DXM) this.LJI.peek();
            C2257131DWd c2257131DWd2 = c1dxm2.LJI;
            if (c2257131DWd2 == null) {
                float f9 = rectF.left;
                float f10 = rectF.top;
                c1dxm2.LJI = new C2257131DWd(f9, f10, rectF.right - f9, rectF.bottom - f10);
                return;
            }
            float f11 = rectF.left;
            float f12 = rectF.top;
            C2257131DWd c2257131DWd3 = new C2257131DWd(f11, f12, rectF.right - f11, rectF.bottom - f12);
            float f13 = c2257131DWd3.LIZ;
            if (f13 < c2257131DWd2.LIZ) {
                c2257131DWd2.LIZ = f13;
            }
            float f14 = c2257131DWd3.LIZIZ;
            if (f14 < c2257131DWd2.LIZIZ) {
                c2257131DWd2.LIZIZ = f14;
            }
            float f15 = c2257131DWd3.LIZ + c2257131DWd3.LIZJ;
            float f16 = c2257131DWd2.LIZ;
            if (f15 > c2257131DWd2.LIZJ + f16) {
                c2257131DWd2.LIZJ = f15 - f16;
            }
            float f18 = c2257131DWd3.LIZIZ + c2257131DWd3.LIZLLL;
            float f19 = c2257131DWd2.LIZIZ;
            if (f18 <= c2257131DWd2.LIZLLL + f19) {
                return;
            }
            c2257131DWd2.LIZLLL = f18 - f19;
        }
    }

    public static int LJFF(float f, int i) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i2 << 24) | (i & 16777215);
    }

    public static void LJI(String str, Object... objArr) {
        LynxLog.d("SVGAndroidRenderer", C786410Ut5.j4(str, objArr));
    }

    public static void LJIIJJI(String str, Object... objArr) {
        LynxLog.e("SVGAndroidRenderer", C786410Ut5.j4(str, objArr));
    }

    public static void LJIIL(AbstractC2257221DWm abstractC2257221DWm, String str) {
        C1DX1 c1dx1LJFF = abstractC2257221DWm.LIZ.LJFF(str);
        if (c1dx1LJFF == null) {
            LynxLog.w("SVGAndroidRenderer", C786410Ut5.j4("Gradient reference '%s' not found", new Object[]{str}));
            return;
        }
        if (!(c1dx1LJFF instanceof AbstractC2257221DWm)) {
            LJIIJJI("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (c1dx1LJFF == abstractC2257221DWm) {
            LJIIJJI("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        AbstractC2257221DWm abstractC2257221DWm2 = (AbstractC2257221DWm) c1dx1LJFF;
        if (abstractC2257221DWm.LJII == null) {
            abstractC2257221DWm.LJII = abstractC2257221DWm2.LJII;
        }
        if (abstractC2257221DWm.LJIIIIZZ == null) {
            abstractC2257221DWm.LJIIIIZZ = abstractC2257221DWm2.LJIIIIZZ;
        }
        if (abstractC2257221DWm.LJIIIZ == null) {
            abstractC2257221DWm.LJIIIZ = abstractC2257221DWm2.LJIIIZ;
        }
        if (abstractC2257221DWm.LJI.isEmpty()) {
            abstractC2257221DWm.LJI = abstractC2257221DWm2.LJI;
        }
        try {
            if (abstractC2257221DWm instanceof C1DX3) {
                C1DX3 c1dx3 = (C1DX3) abstractC2257221DWm;
                C1DX3 c1dx32 = (C1DX3) c1dx1LJFF;
                if (c1dx3.LJIIJJI == null) {
                    c1dx3.LJIIJJI = c1dx32.LJIIJJI;
                }
                if (c1dx3.LJIIL == null) {
                    c1dx3.LJIIL = c1dx32.LJIIL;
                }
                if (c1dx3.LJIILIIL == null) {
                    c1dx3.LJIILIIL = c1dx32.LJIILIIL;
                }
                if (c1dx3.LJIILJJIL == null) {
                    c1dx3.LJIILJJIL = c1dx32.LJIILJJIL;
                }
            } else {
                LJIILIIL((C1DX4) abstractC2257221DWm, (C1DX4) c1dx1LJFF);
            }
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str2 = abstractC2257221DWm2.LJIIJ;
        if (str2 != null) {
            LJIIL(abstractC2257221DWm, str2);
        }
    }

    public static void LJIILIIL(C1DX4 c1dx4, C1DX4 c1dx42) {
        if (c1dx4.LJIIJJI == null) {
            c1dx4.LJIIJJI = c1dx42.LJIIJJI;
        }
        if (c1dx4.LJIIL == null) {
            c1dx4.LJIIL = c1dx42.LJIIL;
        }
        if (c1dx4.LJIILIIL == null) {
            c1dx4.LJIILIIL = c1dx42.LJIILIIL;
        }
        if (c1dx4.LJIILJJIL == null) {
            c1dx4.LJIILJJIL = c1dx42.LJIILJJIL;
        }
        if (c1dx4.LJIILL == null) {
            c1dx4.LJIILL = c1dx42.LJIILL;
        }
    }

    public static void LJIILJJIL(C2257281DWs c2257281DWs, String str) {
        C1DX1 c1dx1LJFF = c2257281DWs.LIZ.LJFF(str);
        if (c1dx1LJFF == null) {
            LynxLog.w("SVGAndroidRenderer", C786410Ut5.j4("Pattern reference '%s' not found", new Object[]{str}));
            return;
        }
        if (!(c1dx1LJFF instanceof C2257281DWs)) {
            LJIIJJI("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (c1dx1LJFF == c2257281DWs) {
            LJIIJJI("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        C2257281DWs c2257281DWs2 = (C2257281DWs) c1dx1LJFF;
        if (c2257281DWs.LJIIJ == null) {
            c2257281DWs.LJIIJ = c2257281DWs2.LJIIJ;
        }
        if (c2257281DWs.LJIIJJI == null) {
            c2257281DWs.LJIIJJI = c2257281DWs2.LJIIJJI;
        }
        if (c2257281DWs.LJIIL == null) {
            c2257281DWs.LJIIL = c2257281DWs2.LJIIL;
        }
        if (c2257281DWs.LJIILIIL == null) {
            c2257281DWs.LJIILIIL = c2257281DWs2.LJIILIIL;
        }
        if (c2257281DWs.LJIILJJIL == null) {
            c2257281DWs.LJIILJJIL = c2257281DWs2.LJIILJJIL;
        }
        if (c2257281DWs.LJIILL == null) {
            c2257281DWs.LJIILL = c2257281DWs2.LJIILL;
        }
        if (c2257281DWs.LJIILLIIL == null) {
            c2257281DWs.LJIILLIIL = c2257281DWs2.LJIILLIIL;
        }
        if (c2257281DWs.LJII.isEmpty()) {
            c2257281DWs.LJII = c2257281DWs2.LJII;
        }
        if (c2257281DWs.LJIIIZ == null) {
            c2257281DWs.LJIIIZ = c2257281DWs2.LJIIIZ;
        }
        if (c2257281DWs.LJIIIIZZ == null) {
            c2257281DWs.LJIIIIZZ = c2257281DWs2.LJIIIIZZ;
        }
        String str2 = c2257281DWs2.LJIIZILJ;
        if (str2 != null) {
            LJIILJJIL(c2257281DWs, str2);
        }
    }

    public static boolean LJIIZILJ(C2257201DWk c2257201DWk, long j) {
        if ((c2257201DWk.LL & j) != 0) {
            return true;
        }
        return false;
    }

    public final Path LIZ(C1DXM c1dxm, C2257131DWd c2257131DWd) {
        Path pathLJJ;
        C1DX1 c1dx1LJFF = c1dxm.LIZ.LJFF(this.LJ.LIZ.LLJJJ);
        boolean z = false;
        if (c1dx1LJFF == null) {
            LJIIJJI("ClipPath reference '%s' not found", this.LJ.LIZ.LLJJJ);
            return null;
        }
        C1DXD c1dxd = (C1DXD) c1dx1LJFF;
        this.LJFF.push(this.LJ);
        C2257121DWc c2257121DWc = new C2257121DWc();
        LJJIJIL(c2257121DWc, C2257201DWk.LIZ());
        LJIILL(c1dxd, c2257121DWc);
        this.LJ = c2257121DWc;
        Boolean bool = c1dxd.LJIIIZ;
        if (bool == null || bool.booleanValue()) {
            z = true;
        }
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c2257131DWd.LIZ, c2257131DWd.LIZIZ);
            matrix.preScale(c2257131DWd.LIZJ, c2257131DWd.LIZLLL);
        }
        Matrix matrix2 = c1dxd.LJIIIIZZ;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C1DXF c1dxf : c1dxd.LJII) {
            if ((c1dxf instanceof C1DXM) && (pathLJJ = LJJ((C1DXM) c1dxf, true)) != null) {
                path.op(pathLJJ, Path.Op.UNION);
            }
        }
        if (this.LJ.LIZ.LLJJJ != null) {
            if (c1dxd.LJI == null) {
                c1dxd.LJI = LIZIZ(path);
            }
            Path pathLIZ = LIZ(c1dxd, c1dxd.LJI);
            if (pathLIZ != null) {
                path.op(pathLIZ, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.LJ = this.LJFF.pop();
        return path;
    }

    public final void LIZLLL(C1DXM c1dxm, C2257131DWd c2257131DWd) {
        Path pathLIZ;
        if (this.LJ.LIZ.LLJJJ != null && (pathLIZ = LIZ(c1dxm, c2257131DWd)) != null) {
            this.LIZ.clipPath(pathLIZ);
        }
    }

    public final void LJIIIZ(C1DXM c1dxm, Path path) {
        boolean z;
        float fLIZJ;
        float fLIZJ2;
        float fLIZJ3;
        float fLIZJ4;
        float fLIZLLL;
        float fLJ;
        float fLIZLLL2;
        float fLJ2;
        boolean z2;
        C1DXS c1dxs = this.LJ.LIZ.LLILLJJLI;
        if (c1dxs instanceof C2257321DWw) {
            C1DX1 c1dx1LJFF = this.LIZLLL.LJFF(((C2257321DWw) c1dxs).LL);
            if (c1dx1LJFF instanceof C2257281DWs) {
                C2257281DWs c2257281DWs = (C2257281DWs) c1dx1LJFF;
                Boolean bool = c2257281DWs.LJIIJ;
                if (bool != null && bool.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                String str = c2257281DWs.LJIIZILJ;
                if (str != null) {
                    LJIILJJIL(c2257281DWs, str);
                }
                if (z) {
                    C2257141DWe c2257141DWe = c2257281DWs.LJIILIIL;
                    if (c2257141DWe != null) {
                        fLIZLLL = c2257141DWe.LIZLLL(this);
                    } else {
                        fLIZLLL = 0.0f;
                    }
                    C2257141DWe c2257141DWe2 = c2257281DWs.LJIILJJIL;
                    if (c2257141DWe2 != null) {
                        fLJ = c2257141DWe2.LJ(this);
                    } else {
                        fLJ = 0.0f;
                    }
                    C2257141DWe c2257141DWe3 = c2257281DWs.LJIILL;
                    if (c2257141DWe3 != null) {
                        fLIZLLL2 = c2257141DWe3.LIZLLL(this);
                    } else {
                        fLIZLLL2 = 0.0f;
                    }
                    C2257141DWe c2257141DWe4 = c2257281DWs.LJIILLIIL;
                    if (c2257141DWe4 != null) {
                        fLJ2 = c2257141DWe4.LJ(this);
                    } else {
                        fLJ2 = 0.0f;
                    }
                } else {
                    C2257141DWe c2257141DWe5 = c2257281DWs.LJIILIIL;
                    if (c2257141DWe5 != null) {
                        fLIZJ = c2257141DWe5.LIZJ(this);
                    } else {
                        fLIZJ = 0.0f;
                    }
                    C2257141DWe c2257141DWe6 = c2257281DWs.LJIILJJIL;
                    if (c2257141DWe6 != null) {
                        fLIZJ2 = c2257141DWe6.LIZJ(this);
                    } else {
                        fLIZJ2 = 0.0f;
                    }
                    C2257141DWe c2257141DWe7 = c2257281DWs.LJIILL;
                    if (c2257141DWe7 != null) {
                        fLIZJ3 = c2257141DWe7.LIZJ(this);
                    } else {
                        fLIZJ3 = 0.0f;
                    }
                    C2257141DWe c2257141DWe8 = c2257281DWs.LJIILLIIL;
                    if (c2257141DWe8 != null) {
                        fLIZJ4 = c2257141DWe8.LIZJ(this);
                    } else {
                        fLIZJ4 = 0.0f;
                    }
                    C2257131DWd c2257131DWd = c1dxm.LJI;
                    float f = c2257131DWd.LIZ;
                    float f2 = c2257131DWd.LIZJ;
                    fLIZLLL = (fLIZJ * f2) + f;
                    float f3 = c2257131DWd.LIZIZ;
                    float f4 = c2257131DWd.LIZLLL;
                    fLJ = (fLIZJ2 * f4) + f3;
                    fLIZLLL2 = fLIZJ3 * f2;
                    fLJ2 = fLIZJ4 * f4;
                }
                if (fLIZLLL2 != 0.0f && fLJ2 != 0.0f) {
                    C2255571DQd c2255571DQd = c2257281DWs.LJIIIIZZ;
                    if (c2255571DQd == null) {
                        c2255571DQd = C2255571DQd.LIZLLL;
                    }
                    LJJIJIIJI();
                    this.LIZ.clipPath(path);
                    C2257121DWc c2257121DWc = new C2257121DWc();
                    LJJIJIL(c2257121DWc, C2257201DWk.LIZ());
                    c2257121DWc.LIZ.LLJJ = Boolean.FALSE;
                    LJIILL(c2257281DWs, c2257121DWc);
                    this.LJ = c2257121DWc;
                    C2257131DWd c2257131DWd2 = c1dxm.LJI;
                    Matrix matrix = c2257281DWs.LJIIL;
                    if (matrix != null) {
                        this.LIZ.concat(matrix);
                        Matrix matrix2 = new Matrix();
                        if (c2257281DWs.LJIIL.invert(matrix2)) {
                            C2257131DWd c2257131DWd3 = c1dxm.LJI;
                            float f5 = c2257131DWd3.LIZ;
                            float f6 = c2257131DWd3.LIZIZ;
                            float f7 = c2257131DWd3.LIZJ + f5;
                            float f8 = f6 + c2257131DWd3.LIZLLL;
                            float[] fArr = {f5, f6, f7, f6, f7, f8, f5, f8};
                            matrix2.mapPoints(fArr);
                            float f9 = fArr[0];
                            float f10 = fArr[1];
                            RectF rectF = new RectF(f9, f10, f9, f10);
                            int i = 2;
                            do {
                                float f11 = fArr[i];
                                if (f11 < rectF.left) {
                                    rectF.left = f11;
                                }
                                if (f11 > rectF.right) {
                                    rectF.right = f11;
                                }
                                float f12 = fArr[i + 1];
                                if (f12 < rectF.top) {
                                    rectF.top = f12;
                                }
                                if (f12 > rectF.bottom) {
                                    rectF.bottom = f12;
                                }
                                i += 2;
                            } while (i <= 6);
                            float f13 = rectF.left;
                            float f14 = rectF.top;
                            c2257131DWd2 = new C2257131DWd(f13, f14, rectF.right - f13, rectF.bottom - f14);
                        }
                    }
                    float fFloor = fLIZLLL + (((float) Math.floor((c2257131DWd2.LIZ - fLIZLLL) / fLIZLLL2)) * fLIZLLL2);
                    float f15 = c2257131DWd2.LIZ + c2257131DWd2.LIZJ;
                    float f16 = c2257131DWd2.LIZIZ + c2257131DWd2.LIZLLL;
                    C2257131DWd c2257131DWd4 = new C2257131DWd(0.0f, 0.0f, fLIZLLL2, fLJ2);
                    boolean zLJJI = LJJI();
                    for (float fFloor2 = fLJ + (((float) Math.floor((c2257131DWd2.LIZIZ - fLJ) / fLJ2)) * fLJ2); fFloor2 < f16; fFloor2 += fLJ2) {
                        for (float f18 = fFloor; f18 < f15; f18 += fLIZLLL2) {
                            c2257131DWd4.LIZ = f18;
                            c2257131DWd4.LIZIZ = fFloor2;
                            LJJIJIIJI();
                            if (!this.LJ.LIZ.LLJJ.booleanValue()) {
                                LJJIIZ(c2257131DWd4.LIZ, c2257131DWd4.LIZIZ, c2257131DWd4.LIZJ, c2257131DWd4.LIZLLL);
                            }
                            C2257131DWd c2257131DWd5 = c2257281DWs.LJIIIZ;
                            if (c2257131DWd5 != null) {
                                this.LIZ.concat(LIZJ(c2257131DWd4, c2257131DWd5, c2255571DQd));
                            } else {
                                Boolean bool2 = c2257281DWs.LJIIJJI;
                                if (bool2 != null && !bool2.booleanValue()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                this.LIZ.translate(f18, fFloor2);
                                if (!z2) {
                                    Canvas canvas = this.LIZ;
                                    C2257131DWd c2257131DWd6 = c1dxm.LJI;
                                    canvas.scale(c2257131DWd6.LIZJ, c2257131DWd6.LIZLLL);
                                }
                            }
                            Iterator<C1DXF> it2 = c2257281DWs.LJII.iterator();
                            while (it2.hasNext()) {
                                LJJII(it2.next());
                            }
                            LJJIJ();
                        }
                    }
                    if (zLJJI) {
                        LJJIJ();
                    }
                    LJJIJ();
                    return;
                }
                return;
            }
        }
        this.LIZ.drawPath(path, this.LJ.LIZLLL);
    }

    public final void LJIILL(C1DX1 c1dx1, C2257121DWc c2257121DWc) {
        ArrayList arrayList = new ArrayList();
        C1DXF c1dxf = c1dx1;
        while (true) {
            if (c1dxf instanceof C1DX1) {
                ListProtector.add(arrayList, 0, c1dxf);
            }
            Object obj = c1dxf.LIZIZ;
            if (obj == null) {
                break;
            } else {
                c1dxf = (C1DXF) obj;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LJJIJL(c2257121DWc, (C1DX1) it2.next());
        }
        C2257121DWc c2257121DWc2 = this.LJ;
        c2257121DWc.LJI = c2257121DWc2.LJI;
        c2257121DWc.LJFF = c2257121DWc2.LJFF;
    }

    public final Path LJJ(C1DXM c1dxm, boolean z) {
        Path pathLJIJJ;
        Path pathLIZ;
        this.LJFF.push(this.LJ);
        C2257121DWc c2257121DWc = new C2257121DWc(this.LJ);
        this.LJ = c2257121DWc;
        LJJIJL(c2257121DWc, c1dxm);
        if (LJIIIIZZ() && LJJIL()) {
            if (c1dxm instanceof C1DX6) {
                if (!z) {
                    LJIIJJI("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
                C1DX6 c1dx6 = (C1DX6) c1dxm;
                C1DX1 c1dx1LJFF = c1dxm.LIZ.LJFF(c1dx6.LJIIIZ);
                if (c1dx1LJFF == null) {
                    LJIIJJI("Use reference '%s' not found", c1dx6.LJIIIZ);
                    this.LJ = this.LJFF.pop();
                    return null;
                }
                if (!(c1dx1LJFF instanceof C1DXM)) {
                    this.LJ = this.LJFF.pop();
                    return null;
                }
                pathLJIJJ = LJJ((C1DXM) c1dx1LJFF, false);
                if (pathLJIJJ == null) {
                    return null;
                }
                if (c1dx6.LJI == null) {
                    c1dx6.LJI = LIZIZ(pathLJIJJ);
                }
                Matrix matrix = c1dx6.LJIIIIZZ;
                if (matrix != null) {
                    pathLJIJJ.transform(matrix);
                }
            } else {
                if (c1dxm instanceof C1DXB) {
                    C1DXB c1dxb = (C1DXB) c1dxm;
                    if (c1dxm instanceof C1DXE) {
                        pathLJIJJ = new C19KH(((C1DXE) c1dxm).LJIIIIZZ).LIZ;
                        if (c1dxm.LJI == null) {
                            c1dxm.LJI = LIZIZ(pathLJIJJ);
                        }
                    } else if (c1dxm instanceof C1DX2) {
                        pathLJIJJ = LJIJJLI((C1DX2) c1dxm);
                    } else if (c1dxm instanceof C1DX8) {
                        pathLJIJJ = LJIJ((C1DX8) c1dxm);
                    } else if (c1dxm instanceof C1DX5) {
                        pathLJIJJ = LJIJI((C1DX5) c1dxm);
                    } else {
                        if (c1dxm instanceof C1DXK) {
                            pathLJIJJ = LJIJJ((C1DXK) c1dxm);
                        }
                        return null;
                    }
                    if (pathLJIJJ != null) {
                        if (c1dxb.LJI == null) {
                            c1dxb.LJI = LIZIZ(pathLJIJJ);
                        }
                        Matrix matrix2 = c1dxb.LJII;
                        if (matrix2 != null) {
                            pathLJIJJ.transform(matrix2);
                        }
                        pathLJIJJ.setFillType(LJIILLIIL());
                    }
                    return null;
                }
                LJIIJJI("Invalid %s element found in clipPath definition", c1dxm.LIZLLL());
                return null;
            }
            if (this.LJ.LIZ.LLJJJ != null && (pathLIZ = LIZ(c1dxm, c1dxm.LJI)) != null) {
                pathLJIJJ.op(pathLIZ, Path.Op.INTERSECT);
            }
            this.LJ = this.LJFF.pop();
            return pathLJIJJ;
        }
        this.LJ = this.LJFF.pop();
        return null;
    }

    public final void LJJIIJ(C2257191DWj c2257191DWj, C1DX7 c1dx7) {
        this.LIZLLL = c2257191DWj;
        C1DXA c1dxa = c2257191DWj.LIZ;
        if (c1dxa == null) {
            LynxLog.w("SVGAndroidRenderer", C786410Ut5.j4("Nothing to render. Document is empty.", new Object[0]));
            return;
        }
        C2257131DWd c2257131DWd = c1dxa.LJIIIZ;
        C2255571DQd c2255571DQd = c1dxa.LJIIIIZZ;
        this.LJ = new C2257121DWc();
        this.LJFF = new Stack<>();
        LJJIJIL(this.LJ, C2257201DWk.LIZ());
        C2257121DWc c2257121DWc = this.LJ;
        c2257121DWc.LJFF = null;
        this.LJFF.push(new C2257121DWc(c2257121DWc));
        this.LJII = new Stack<>();
        this.LJI = new Stack<>();
        Boolean bool = c1dxa.LIZLLL;
        if (bool != null) {
            C2257121DWc c2257121DWc2 = this.LJ;
            bool.booleanValue();
            c2257121DWc2.getClass();
        }
        LJJIJIIJI();
        LJJIFFI(c1dxa, new C2257131DWd(c1dx7.LIZ), c2257131DWd, c2255571DQd);
        LJJIJ();
    }

    public final void LJJIJIL(C2257121DWc c2257121DWc, C2257201DWk c2257201DWk) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        if (LJIIZILJ(c2257201DWk, 4096L)) {
            c2257121DWc.LIZ.LLJILLL = c2257201DWk.LLJILLL;
        }
        if (LJIIZILJ(c2257201DWk, 2048L)) {
            c2257121DWc.LIZ.LLJILJILJ = c2257201DWk.LLJILJILJ;
        }
        if (LJIIZILJ(c2257201DWk, 1L)) {
            c2257121DWc.LIZ.LLILLJJLI = c2257201DWk.LLILLJJLI;
            C1DXS c1dxs = c2257201DWk.LLILLJJLI;
            if (c1dxs != null && c1dxs != C2257331DWx.LLILLL) {
                z3 = true;
            } else {
                z3 = false;
            }
            c2257121DWc.LIZIZ = z3;
        }
        if (LJIIZILJ(c2257201DWk, 4L)) {
            c2257121DWc.LIZ.LLILZ = c2257201DWk.LLILZ;
        }
        if (LJIIZILJ(c2257201DWk, 6149L)) {
            LJJIIZI(c2257121DWc, true, c2257121DWc.LIZ.LLILLJJLI);
        }
        if (LJIIZILJ(c2257201DWk, 2L)) {
            c2257121DWc.LIZ.LLILLL = c2257201DWk.LLILLL;
        }
        if (LJIIZILJ(c2257201DWk, 8L)) {
            c2257121DWc.LIZ.LLILZIL = c2257201DWk.LLILZIL;
            C1DXS c1dxs2 = c2257201DWk.LLILZIL;
            if (c1dxs2 != null && c1dxs2 != C2257331DWx.LLILLL) {
                z2 = true;
            } else {
                z2 = false;
            }
            c2257121DWc.LIZJ = z2;
        }
        if (LJIIZILJ(c2257201DWk, 16L)) {
            c2257121DWc.LIZ.LLILZLL = c2257201DWk.LLILZLL;
        }
        if (LJIIZILJ(c2257201DWk, 6168L)) {
            LJJIIZI(c2257121DWc, false, c2257121DWc.LIZ.LLILZIL);
        }
        if (LJIIZILJ(c2257201DWk, 34359738368L)) {
            c2257121DWc.LIZ.LLJJLIIIJLLLLLLLZ = c2257201DWk.LLJJLIIIJLLLLLLLZ;
        }
        if (LJIIZILJ(c2257201DWk, 32L)) {
            C2257201DWk c2257201DWk2 = c2257121DWc.LIZ;
            C2257141DWe c2257141DWe = c2257201DWk.LLIZ;
            c2257201DWk2.LLIZ = c2257141DWe;
            c2257121DWc.LJ.setStrokeWidth(c2257141DWe.LIZIZ(this));
            if (c2257121DWc.LIZJ && !c2257201DWk.LLIZ.LJI()) {
                z = true;
            } else {
                z = false;
            }
            c2257121DWc.LIZJ = z;
        }
        if (LJIIZILJ(c2257201DWk, 64L)) {
            c2257121DWc.LIZ.LLIZLLLIL = c2257201DWk.LLIZLLLIL;
            int i2 = C2257231DWn.LIZIZ[c2257201DWk.LLIZLLLIL.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        c2257121DWc.LJ.setStrokeCap(Paint.Cap.SQUARE);
                    }
                } else {
                    c2257121DWc.LJ.setStrokeCap(Paint.Cap.ROUND);
                }
            } else {
                c2257121DWc.LJ.setStrokeCap(Paint.Cap.BUTT);
            }
        }
        if (LJIIZILJ(c2257201DWk, 128L)) {
            c2257121DWc.LIZ.LLJ = c2257201DWk.LLJ;
            int i3 = C2257231DWn.LIZJ[c2257201DWk.LLJ.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        c2257121DWc.LJ.setStrokeJoin(Paint.Join.BEVEL);
                    }
                } else {
                    c2257121DWc.LJ.setStrokeJoin(Paint.Join.ROUND);
                }
            } else {
                c2257121DWc.LJ.setStrokeJoin(Paint.Join.MITER);
            }
        }
        if (LJIIZILJ(c2257201DWk, 256L)) {
            c2257121DWc.LIZ.LLJI = c2257201DWk.LLJI;
            c2257121DWc.LJ.setStrokeMiter(c2257201DWk.LLJI.floatValue());
        }
        if (LJIIZILJ(c2257201DWk, 512L)) {
            c2257121DWc.LIZ.LLJIJIL = c2257201DWk.LLJIJIL;
        }
        if (LJIIZILJ(c2257201DWk, 1024L)) {
            c2257121DWc.LIZ.LLJILJIL = c2257201DWk.LLJILJIL;
        }
        if (LJIIZILJ(c2257201DWk, 1536L)) {
            C2257141DWe[] c2257141DWeArr = c2257121DWc.LIZ.LLJIJIL;
            if (c2257141DWeArr == null) {
                c2257121DWc.LJ.setPathEffect(null);
            } else {
                int length = c2257141DWeArr.length;
                if (length % 2 == 0) {
                    i = length;
                } else {
                    i = length * 2;
                }
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i4 = 0; i4 < i; i4++) {
                    float fLIZIZ = c2257121DWc.LIZ.LLJIJIL[i4 % length].LIZIZ(this);
                    fArr[i4] = fLIZIZ;
                    f += fLIZIZ;
                }
                if (f == 0.0f) {
                    c2257121DWc.LJ.setPathEffect(null);
                } else {
                    float fLIZIZ2 = c2257121DWc.LIZ.LLJILJIL.LIZIZ(this);
                    if (fLIZIZ2 < 0.0f) {
                        fLIZIZ2 = (fLIZIZ2 % f) + f;
                    }
                    c2257121DWc.LJ.setPathEffect(new DashPathEffect(fArr, fLIZIZ2));
                }
            }
        }
        if (LJIIZILJ(c2257201DWk, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            c2257121DWc.LIZ.LLJJ = c2257201DWk.LLJJ;
        }
        if (LJIIZILJ(c2257201DWk, 16777216L)) {
            c2257121DWc.LIZ.LLJJIII = c2257201DWk.LLJJIII;
        }
        if (LJIIZILJ(c2257201DWk, 33554432L)) {
            c2257121DWc.LIZ.LLJJIJI = c2257201DWk.LLJJIJI;
        }
        if (LJIIZILJ(c2257201DWk, 1048576L)) {
            c2257121DWc.LIZ.LLJJI = c2257201DWk.LLJJI;
        }
        if (LJIIZILJ(c2257201DWk, 268435456L)) {
            c2257121DWc.LIZ.LLJJJ = c2257201DWk.LLJJJ;
        }
        if (LJIIZILJ(c2257201DWk, 536870912L)) {
            c2257121DWc.LIZ.LLJJJIL = c2257201DWk.LLJJJIL;
        }
        if (LJIIZILJ(c2257201DWk, 67108864L)) {
            c2257121DWc.LIZ.LLJJIJIIJIL = c2257201DWk.LLJJIJIIJIL;
        }
        if (LJIIZILJ(c2257201DWk, 134217728L)) {
            c2257121DWc.LIZ.LLJJIJIL = c2257201DWk.LLJJIJIL;
        }
        if (LJIIZILJ(c2257201DWk, 8589934592L)) {
            c2257121DWc.LIZ.LLJJJJLIIL = c2257201DWk.LLJJJJLIIL;
        }
        if (LJIIZILJ(c2257201DWk, 17179869184L)) {
            c2257121DWc.LIZ.LLJJL = c2257201DWk.LLJJL;
        }
        if (LJIIZILJ(c2257201DWk, 137438953472L)) {
            c2257121DWc.LIZ.LLJL = c2257201DWk.LLJL;
        }
    }

    public final void LJJIJL(C2257121DWc c2257121DWc, C1DX1 c1dx1) {
        boolean z;
        if (c1dx1.LIZIZ == null) {
            z = true;
        } else {
            z = false;
        }
        C2257201DWk c2257201DWk = c2257121DWc.LIZ;
        Boolean bool = Boolean.TRUE;
        c2257201DWk.LLJJIII = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        c2257201DWk.LLJJ = bool;
        c2257201DWk.LLJJI = null;
        c2257201DWk.LLJJJ = null;
        c2257201DWk.LLJILJILJ = Float.valueOf(1.0f);
        c2257201DWk.LLJJIJIIJIL = C2257331DWx.LLILLJJLI;
        c2257201DWk.LLJJIJIL = Float.valueOf(1.0f);
        c2257201DWk.LLJJJJ = null;
        c2257201DWk.LLJJJJJIL = Float.valueOf(1.0f);
        c2257201DWk.LLJJJJLIIL = null;
        c2257201DWk.LLJJL = Float.valueOf(1.0f);
        c2257201DWk.LLJJLIIIJLLLLLLLZ = EnumC19381910sD.None;
        C2257201DWk c2257201DWk2 = c1dx1.LJ;
        if (c2257201DWk2 != null) {
            LJJIJIL(c2257121DWc, c2257201DWk2);
        }
        C2257201DWk c2257201DWk3 = c1dx1.LJFF;
        if (c2257201DWk3 != null) {
            LJJIJIL(c2257121DWc, c2257201DWk3);
        }
    }

    public C2257171DWh(Canvas canvas, float f, C1290350jgP c1290350jgP) {
        this.LIZ = canvas;
        this.LIZIZ = f;
        this.LIZJ = c1290350jgP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r6 != 8) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix LIZJ(X.C2257131DWd r9, X.C2257131DWd r10, X.C2255571DQd r11) {
        /*
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            if (r11 == 0) goto L92
            X.1DWo r0 = r11.LIZ
            if (r0 == 0) goto L92
            float r6 = r9.LIZJ
            float r0 = r10.LIZJ
            float r6 = r6 / r0
            float r2 = r9.LIZLLL
            float r0 = r10.LIZLLL
            float r2 = r2 / r0
            float r0 = r10.LIZ
            float r4 = -r0
            float r0 = r10.LIZIZ
            float r3 = -r0
            X.1DQd r0 = X.C2255571DQd.LIZJ
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L31
            float r1 = r9.LIZ
            float r0 = r9.LIZIZ
            r5.preTranslate(r1, r0)
            r5.preScale(r6, r2)
            r5.preTranslate(r4, r3)
            return r5
        L31:
            X.1D3z r1 = r11.LIZIZ
            X.1D3z r0 = X.EnumC2249811D3z.slice
            if (r1 != r0) goto L8d
            float r2 = java.lang.Math.max(r6, r2)
        L3b:
            float r8 = r9.LIZJ
            float r8 = r8 / r2
            float r1 = r9.LIZLLL
            float r1 = r1 / r2
            int[] r6 = X.C2257231DWn.LIZ
            X.1DWo r0 = r11.LIZ
            int r0 = r0.ordinal()
            r0 = r6[r0]
            r7 = 1073741824(0x40000000, float:2.0)
            switch(r0) {
                case 1: goto L83;
                case 2: goto L83;
                case 3: goto L83;
                case 4: goto L88;
                case 5: goto L88;
                case 6: goto L88;
                default: goto L50;
            }
        L50:
            X.1DWo r0 = r11.LIZ
            int r0 = r0.ordinal()
            r6 = r6[r0]
            r0 = 2
            if (r6 == r0) goto L79
            r0 = 3
            if (r6 == r0) goto L7e
            r0 = 5
            if (r6 == r0) goto L79
            r0 = 6
            if (r6 == r0) goto L7e
            r0 = 7
            if (r6 == r0) goto L79
            r0 = 8
            if (r6 == r0) goto L7e
        L6b:
            float r1 = r9.LIZ
            float r0 = r9.LIZIZ
            r5.preTranslate(r1, r0)
            r5.preScale(r2, r2)
            r5.preTranslate(r4, r3)
            return r5
        L79:
            float r0 = r10.LIZLLL
            float r0 = r0 - r1
            float r0 = r0 / r7
            goto L81
        L7e:
            float r0 = r10.LIZLLL
            float r0 = r0 - r1
        L81:
            float r3 = r3 - r0
            goto L6b
        L83:
            float r0 = r10.LIZJ
            float r0 = r0 - r8
            float r0 = r0 / r7
            goto L8b
        L88:
            float r0 = r10.LIZJ
            float r0 = r0 - r8
        L8b:
            float r4 = r4 - r0
            goto L50
        L8d:
            float r2 = java.lang.Math.min(r6, r2)
            goto L3b
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257171DWh.LIZJ(X.1DWd, X.1DWd, X.1DQd):android.graphics.Matrix");
    }

    public static void LJJIIZI(C2257121DWc c2257121DWc, boolean z, C1DXS c1dxs) {
        Float f;
        int i;
        C2257201DWk c2257201DWk = c2257121DWc.LIZ;
        if (z) {
            f = c2257201DWk.LLILZ;
        } else {
            f = c2257201DWk.LLILZLL;
        }
        float fFloatValue = f.floatValue();
        if (c1dxs instanceof C2257331DWx) {
            i = ((C2257331DWx) c1dxs).LL;
        } else if (!(c1dxs instanceof C1DXR)) {
            return;
        } else {
            i = c2257121DWc.LIZ.LLJILLL.LL;
        }
        int iLJFF = LJFF(fFloatValue, i);
        if (z) {
            c2257121DWc.LIZLLL.setColor(iLJFF);
        } else {
            c2257121DWc.LJ.setColor(iLJFF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0100 A[PHI: r5 r19 r20
      0x0100: PHI (r5v6 float) = (r5v4 float), (r5v11 float) binds: [B:71:0x00f0, B:44:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r19v10 float) = (r19v8 float), (r19v13 float) binds: [B:71:0x00f0, B:44:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r20v10 float) = (r20v8 float), (r20v13 float) binds: [B:71:0x00f0, B:44:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(boolean r27, X.C2257131DWd r28, X.C2257321DWw r29) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257171DWh.LJII(boolean, X.1DWd, X.1DWw):void");
    }

    public final void LJJIIJZLJL(C2257311DWv c2257311DWv, C2255571DQd c2255571DQd, Bitmap bitmap) {
        float fLIZLLL;
        float fLJ;
        int i = 0;
        if (bitmap == null) {
            LJIIJJI("Could not locate image '%s'", c2257311DWv.LJIIIZ);
            return;
        }
        C2257131DWd c2257131DWd = new C2257131DWd(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        LJJIJL(this.LJ, c2257311DWv);
        if (!LJIIIIZZ() || !LJJIL()) {
            return;
        }
        Matrix matrix = c2257311DWv.LJIILJJIL;
        if (matrix != null) {
            this.LIZ.concat(matrix);
        }
        C2257141DWe c2257141DWe = c2257311DWv.LJIIJ;
        if (c2257141DWe != null) {
            fLIZLLL = c2257141DWe.LIZLLL(this);
        } else {
            fLIZLLL = 0.0f;
        }
        C2257141DWe c2257141DWe2 = c2257311DWv.LJIIJJI;
        if (c2257141DWe2 != null) {
            fLJ = c2257141DWe2.LJ(this);
        } else {
            fLJ = 0.0f;
        }
        float fLIZLLL2 = c2257311DWv.LJIIL.LIZLLL(this);
        float fLIZLLL3 = c2257311DWv.LJIILIIL.LIZLLL(this);
        C2257121DWc c2257121DWc = this.LJ;
        c2257121DWc.LJFF = new C2257131DWd(fLIZLLL, fLJ, fLIZLLL2, fLIZLLL3);
        if (!c2257121DWc.LIZ.LLJJ.booleanValue()) {
            C2257131DWd c2257131DWd2 = this.LJ.LJFF;
            LJJIIZ(c2257131DWd2.LIZ, c2257131DWd2.LIZIZ, c2257131DWd2.LIZJ, c2257131DWd2.LIZLLL);
        }
        c2257311DWv.LJI = this.LJ.LJFF;
        LJJIJIIJIL(c2257311DWv);
        LIZLLL(c2257311DWv, c2257311DWv.LJI);
        boolean zLJJI = LJJI();
        LJJIJLIJ();
        this.LIZ.save();
        this.LIZ.concat(LIZJ(this.LJ.LJFF, c2257131DWd, c2255571DQd));
        if (this.LJ.LIZ.LLJL != EnumC2257151DWf.optimizeSpeed) {
            i = 2;
        }
        this.LIZ.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(i));
        this.LIZ.restore();
        if (zLJJI) {
            LJJIJ();
        }
    }

    public final C2257131DWd LJIL(C2257141DWe c2257141DWe, C2257141DWe c2257141DWe2, C2257141DWe c2257141DWe3, C2257141DWe c2257141DWe4) {
        float fLIZLLL;
        float fLIZLLL2;
        float fLJ;
        float fLJ2 = 0.0f;
        if (c2257141DWe != null) {
            fLIZLLL = c2257141DWe.LIZLLL(this);
        } else {
            fLIZLLL = 0.0f;
        }
        if (c2257141DWe2 != null) {
            fLJ2 = c2257141DWe2.LJ(this);
        }
        C2257121DWc c2257121DWc = this.LJ;
        C2257131DWd c2257131DWd = c2257121DWc.LJI;
        if (c2257131DWd == null) {
            c2257131DWd = c2257121DWc.LJFF;
        }
        if (c2257141DWe3 != null) {
            fLIZLLL2 = c2257141DWe3.LIZLLL(this);
        } else {
            fLIZLLL2 = c2257131DWd.LIZJ;
        }
        if (c2257141DWe4 != null) {
            fLJ = c2257141DWe4.LJ(this);
        } else {
            fLJ = c2257131DWd.LIZLLL;
        }
        return new C2257131DWd(fLIZLLL, fLJ2, fLIZLLL2, fLJ);
    }

    public final void LJJIFFI(C1DXA c1dxa, C2257131DWd c2257131DWd, C2257131DWd c2257131DWd2, C2255571DQd c2255571DQd) {
        LJI("Svg render", new Object[0]);
        if (c2257131DWd.LIZJ != 0.0f && c2257131DWd.LIZLLL != 0.0f) {
            if (c2255571DQd == null && (c2255571DQd = c1dxa.LJIIIIZZ) == null) {
                c2255571DQd = new C2255571DQd(EnumC2257241DWo.none, EnumC2249811D3z.meet);
            }
            LJJIJL(this.LJ, c1dxa);
            if (!LJIIIIZZ()) {
                return;
            }
            C2257121DWc c2257121DWc = this.LJ;
            c2257121DWc.LJFF = c2257131DWd;
            if (!c2257121DWc.LIZ.LLJJ.booleanValue()) {
                C2257131DWd c2257131DWd3 = this.LJ.LJFF;
                LJJIIZ(c2257131DWd3.LIZ, c2257131DWd3.LIZIZ, c2257131DWd3.LIZJ, c2257131DWd3.LIZLLL);
            }
            LIZLLL(c1dxa, this.LJ.LJFF);
            if (c2257131DWd2 != null) {
                this.LIZ.concat(LIZJ(this.LJ.LJFF, c2257131DWd2, c2255571DQd));
                this.LJ.LJI = c1dxa.LJIIIZ;
            } else {
                Canvas canvas = this.LIZ;
                C2257131DWd c2257131DWd4 = this.LJ.LJFF;
                canvas.translate(c2257131DWd4.LIZ, c2257131DWd4.LIZIZ);
            }
            boolean zLJJI = LJJI();
            LJJIJLIJ();
            LJJIII(c1dxa);
            if (zLJJI) {
                LJJIJ();
            }
            LJJIJIIJIL(c1dxa);
        }
    }

    public final void LJJIIZ(float f, float f2, float f3, float f4) {
        float fLIZLLL = f3 + f;
        float fLJ = f4 + f2;
        C1DXG c1dxg = this.LJ.LIZ.LLJJI;
        if (c1dxg != null) {
            f += c1dxg.LIZLLL.LIZLLL(this);
            f2 += this.LJ.LIZ.LLJJI.LIZ.LJ(this);
            fLIZLLL -= this.LJ.LIZ.LLJJI.LIZIZ.LIZLLL(this);
            fLJ -= this.LJ.LIZ.LLJJI.LIZJ.LJ(this);
        }
        this.LIZ.clipRect(f, f2, fLIZLLL, fLJ);
    }
}
