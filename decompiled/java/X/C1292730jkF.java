package X;

import android.graphics.Matrix;
import android.graphics.PointF;

/* JADX INFO: renamed from: X.0jkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292730jkF {
    public final Matrix LIZ = new Matrix();
    public final AbstractC1293590jld LIZIZ;
    public final AbstractC1293310jlB<?, PointF> LIZJ;
    public final C1293020jki LIZLLL;
    public final C1293040jkk LJ;
    public final C1293030jkj LJFF;
    public final C1293040jkk LJI;
    public final C1293040jkk LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public final Matrix LIZLLL() {
        this.LIZ.reset();
        PointF pointFLJ = this.LIZJ.LJ();
        float f = pointFLJ.x;
        if (f != 0.0f || pointFLJ.y != 0.0f) {
            this.LIZ.preTranslate(f, pointFLJ.y);
        }
        float fFloatValue = this.LJ.LJ().floatValue();
        if (fFloatValue != 0.0f) {
            this.LIZ.preRotate(fFloatValue);
        }
        C1292760jkI c1292760jkILJ = LJ();
        float f2 = c1292760jkILJ.LIZ;
        if (f2 != 1.0f || c1292760jkILJ.LIZIZ != 1.0f) {
            this.LIZ.preScale(f2, c1292760jkILJ.LIZIZ);
        }
        PointF pointF = (PointF) this.LIZIZ.LJ();
        float f3 = pointF.x;
        if (f3 != 0.0f || pointF.y != 0.0f) {
            this.LIZ.preTranslate(-f3, -pointF.y);
        }
        return this.LIZ;
    }

    public C1292730jkF(C1292750jkH c1292750jkH) {
        this.LIZIZ = (AbstractC1293590jld) c1292750jkH.LIZ.LIZ();
        this.LIZJ = c1292750jkH.LIZIZ.LIZ();
        this.LIZLLL = (C1293020jki) c1292750jkH.LIZJ.LIZ();
        this.LJ = (C1293040jkk) c1292750jkH.LIZLLL.LIZ();
        this.LJFF = (C1293030jkj) c1292750jkH.LJ.LIZ();
        C1292960jkc c1292960jkc = c1292750jkH.LJFF;
        if (c1292960jkc != null) {
            this.LJI = (C1293040jkk) c1292960jkc.LIZ();
        } else {
            this.LJI = null;
        }
        C1292960jkc c1292960jkc2 = c1292750jkH.LJI;
        if (c1292960jkc2 != null) {
            this.LJII = (C1293040jkk) c1292960jkc2.LIZ();
        } else {
            this.LJII = null;
        }
    }

    public final void LIZ(AbstractC1292630jk5 abstractC1292630jk5) {
        abstractC1292630jk5.LIZIZ(this.LIZIZ);
        abstractC1292630jk5.LIZIZ(this.LIZJ);
        abstractC1292630jk5.LIZIZ(this.LIZLLL);
        abstractC1292630jk5.LIZIZ(this.LJ);
        abstractC1292630jk5.LIZIZ(this.LJFF);
        C1293040jkk c1293040jkk = this.LJI;
        if (c1293040jkk != null) {
            abstractC1292630jk5.LIZIZ(c1293040jkk);
        }
        C1293040jkk c1293040jkk2 = this.LJII;
        if (c1293040jkk2 != null) {
            abstractC1292630jk5.LIZIZ(c1293040jkk2);
        }
    }

    public final void LIZIZ(InterfaceC1293690jln interfaceC1293690jln) {
        this.LIZIZ.LIZ(interfaceC1293690jln);
        this.LIZJ.LIZ(interfaceC1293690jln);
        LIZ(interfaceC1293690jln);
        this.LJ.LIZ(interfaceC1293690jln);
        LIZ(interfaceC1293690jln);
        C1293040jkk c1293040jkk = this.LJI;
        if (c1293040jkk != null) {
            c1293040jkk.LIZ(interfaceC1293690jln);
        }
        C1293040jkk c1293040jkk2 = this.LJII;
        if (c1293040jkk2 != null) {
            c1293040jkk2.LIZ(interfaceC1293690jln);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Matrix LJ(float f) {
        PointF pointFLJ = this.LIZJ.LJ();
        PointF pointF = (PointF) this.LIZIZ.LJ();
        C1292760jkI c1292760jkILJ = LJ();
        float fFloatValue = this.LJ.LJ().floatValue();
        this.LIZ.reset();
        this.LIZ.preTranslate(pointFLJ.x * f, pointFLJ.y * f);
        double d = f;
        this.LIZ.preScale((float) Math.pow(c1292760jkILJ.LIZ, d), (float) Math.pow(c1292760jkILJ.LIZIZ, d));
        this.LIZ.preRotate(fFloatValue * f, pointF.x, pointF.y);
        return this.LIZ;
    }

    public final <T> boolean LIZJ(T t, C1292420jjk<T> c1292420jjk) {
        C1293040jkk c1293040jkk;
        C1293040jkk c1293040jkk2;
        if (t == InterfaceC1292740jkG.LJ) {
            this.LIZIZ.LJIIIIZZ(c1292420jjk);
            return true;
        }
        if (t == InterfaceC1292740jkG.LJFF) {
            this.LIZJ.LJIIIIZZ(c1292420jjk);
            return true;
        }
        if (t == InterfaceC1292740jkG.LJIIIIZZ) {
            LJIIIIZZ(c1292420jjk);
            return true;
        }
        if (t == InterfaceC1292740jkG.LJIIIZ) {
            this.LJ.LJIIIIZZ(c1292420jjk);
            return true;
        }
        if (t == InterfaceC1292740jkG.LIZJ) {
            LJIIIIZZ(c1292420jjk);
            return true;
        }
        if (t == InterfaceC1292740jkG.LJIJJ && (c1293040jkk2 = this.LJI) != null) {
            c1293040jkk2.LJIIIIZZ(c1292420jjk);
            return true;
        }
        if (t == InterfaceC1292740jkG.LJIJJLI && (c1293040jkk = this.LJII) != null) {
            c1293040jkk.LJIIIIZZ(c1292420jjk);
            return true;
        }
        return false;
    }
}
