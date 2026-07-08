package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: renamed from: X.0jnz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295050jnz {
    public final Matrix LIZ = new Matrix();
    public final Matrix LIZIZ;
    public final Matrix LIZJ;
    public final Matrix LIZLLL;
    public final float[] LJ;
    public AbstractC1295190joD<PointF, PointF> LJFF;
    public AbstractC1295190joD<?, PointF> LJI;
    public AbstractC1295190joD<C1295580joq, C1295580joq> LJII;
    public AbstractC1295190joD<Float, Float> LJIIIIZZ;
    public AbstractC1295190joD<Integer, Integer> LJIIIZ;
    public C1295230joH LJIIJ;
    public C1295230joH LJIIJJI;
    public AbstractC1295190joD<?, Float> LJIIL;
    public AbstractC1295190joD<?, Float> LJIILIIL;

    public final Matrix LIZLLL() {
        PointF pointFLJFF;
        PointF pointFLJFF2;
        this.LIZ.reset();
        AbstractC1295190joD<?, PointF> abstractC1295190joD = this.LJI;
        if (abstractC1295190joD != null && (pointFLJFF2 = abstractC1295190joD.LJFF()) != null) {
            float f = pointFLJFF2.x;
            if (f != 0.0f || pointFLJFF2.y != 0.0f) {
                this.LIZ.preTranslate(f, pointFLJFF2.y);
            }
        }
        AbstractC1295190joD<Float, Float> abstractC1295190joD2 = this.LJIIIIZZ;
        if (abstractC1295190joD2 != null) {
            float fFloatValue = abstractC1295190joD2 instanceof C1295300joO ? abstractC1295190joD2.LJFF().floatValue() : ((C1295230joH) abstractC1295190joD2).LJIIJJI();
            if (fFloatValue != 0.0f) {
                this.LIZ.preRotate(fFloatValue);
            }
        }
        if (this.LJIIJ != null) {
            float fCos = this.LJIIJJI == null ? 0.0f : (float) Math.cos(Math.toRadians((-r0.LJIIJJI()) + 90.0f));
            float fSin = this.LJIIJJI == null ? 1.0f : (float) Math.sin(Math.toRadians((-r0.LJIIJJI()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r2.LJIIJJI()));
            int i = 0;
            do {
                this.LJ[i] = 0.0f;
                i++;
            } while (i < 9);
            float[] fArr = this.LJ;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.LIZIZ.setValues(fArr);
            int i2 = 0;
            do {
                this.LJ[i2] = 0.0f;
                i2++;
            } while (i2 < 9);
            float[] fArr2 = this.LJ;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.LIZJ.setValues(fArr2);
            int i3 = 0;
            do {
                this.LJ[i3] = 0.0f;
                i3++;
            } while (i3 < 9);
            float[] fArr3 = this.LJ;
            fArr3[0] = fCos;
            fArr3[1] = f2;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.LIZLLL.setValues(fArr3);
            this.LIZJ.preConcat(this.LIZIZ);
            this.LIZLLL.preConcat(this.LIZJ);
            this.LIZ.preConcat(this.LIZLLL);
        }
        AbstractC1295190joD<C1295580joq, C1295580joq> abstractC1295190joD3 = this.LJII;
        if (abstractC1295190joD3 != null) {
            C1295580joq c1295580joqLJFF = abstractC1295190joD3.LJFF();
            float f3 = c1295580joqLJFF.LIZ;
            if (f3 != 1.0f || c1295580joqLJFF.LIZIZ != 1.0f) {
                this.LIZ.preScale(f3, c1295580joqLJFF.LIZIZ);
            }
        }
        AbstractC1295190joD<PointF, PointF> abstractC1295190joD4 = this.LJFF;
        if (abstractC1295190joD4 != null && (((pointFLJFF = abstractC1295190joD4.LJFF()) != null && pointFLJFF.x != 0.0f) || pointFLJFF.y != 0.0f)) {
            this.LIZ.preTranslate(-pointFLJFF.x, -pointFLJFF.y);
        }
        return this.LIZ;
    }

    public C1295050jnz(C1295320joQ c1295320joQ) {
        AbstractC1295190joD<PointF, PointF> abstractC1295190joDLIZ;
        AbstractC1295190joD<PointF, PointF> abstractC1295190joDLIZ2;
        AbstractC1295190joD<C1295580joq, C1295580joq> abstractC1295190joDLIZ3;
        AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ4;
        C1295230joH c1295230joH;
        C1295230joH c1295230joH2;
        C1294890jnj c1294890jnj = c1295320joQ.LIZ;
        if (c1294890jnj == null) {
            abstractC1295190joDLIZ = null;
        } else {
            abstractC1295190joDLIZ = c1294890jnj.LIZ();
        }
        this.LJFF = abstractC1295190joDLIZ;
        InterfaceC1294490jn5<PointF, PointF> interfaceC1294490jn5 = c1295320joQ.LIZIZ;
        if (interfaceC1294490jn5 == null) {
            abstractC1295190joDLIZ2 = null;
        } else {
            abstractC1295190joDLIZ2 = interfaceC1294490jn5.LIZ();
        }
        this.LJI = abstractC1295190joDLIZ2;
        C1295470jof c1295470jof = c1295320joQ.LIZJ;
        if (c1295470jof == null) {
            abstractC1295190joDLIZ3 = null;
        } else {
            abstractC1295190joDLIZ3 = c1295470jof.LIZ();
        }
        this.LJII = abstractC1295190joDLIZ3;
        C1295020jnw c1295020jnw = c1295320joQ.LIZLLL;
        if (c1295020jnw == null) {
            abstractC1295190joDLIZ4 = null;
        } else {
            abstractC1295190joDLIZ4 = c1295020jnw.LIZ();
        }
        this.LJIIIIZZ = abstractC1295190joDLIZ4;
        C1295020jnw c1295020jnw2 = c1295320joQ.LJFF;
        if (c1295020jnw2 == null) {
            c1295230joH = null;
        } else {
            c1295230joH = (C1295230joH) c1295020jnw2.LIZ();
        }
        this.LJIIJ = c1295230joH;
        if (c1295230joH != null) {
            this.LIZIZ = new Matrix();
            this.LIZJ = new Matrix();
            this.LIZLLL = new Matrix();
            this.LJ = new float[9];
        } else {
            this.LIZIZ = null;
            this.LIZJ = null;
            this.LIZLLL = null;
            this.LJ = null;
        }
        C1295020jnw c1295020jnw3 = c1295320joQ.LJI;
        if (c1295020jnw3 == null) {
            c1295230joH2 = null;
        } else {
            c1295230joH2 = (C1295230joH) c1295020jnw3.LIZ();
        }
        this.LJIIJJI = c1295230joH2;
        C1295460joe c1295460joe = c1295320joQ.LJ;
        if (c1295460joe != null) {
            this.LJIIIZ = c1295460joe.LIZ();
        }
        C1295020jnw c1295020jnw4 = c1295320joQ.LJII;
        if (c1295020jnw4 != null) {
            this.LJIIL = c1295020jnw4.LIZ();
        } else {
            this.LJIIL = null;
        }
        C1295020jnw c1295020jnw5 = c1295320joQ.LJIIIIZZ;
        if (c1295020jnw5 != null) {
            this.LJIILIIL = c1295020jnw5.LIZ();
        } else {
            this.LJIILIIL = null;
        }
    }

    public final void LIZ(AbstractC1295030jnx abstractC1295030jnx) {
        abstractC1295030jnx.LIZIZ(this.LJIIIZ);
        abstractC1295030jnx.LIZIZ(this.LJIIL);
        abstractC1295030jnx.LIZIZ(this.LJIILIIL);
        abstractC1295030jnx.LIZIZ(this.LJFF);
        abstractC1295030jnx.LIZIZ(this.LJI);
        abstractC1295030jnx.LIZIZ(this.LJII);
        abstractC1295030jnx.LIZIZ(this.LJIIIIZZ);
        abstractC1295030jnx.LIZIZ(this.LJIIJ);
        abstractC1295030jnx.LIZIZ(this.LJIIJJI);
    }

    public final void LIZIZ(InterfaceC1294590jnF interfaceC1294590jnF) {
        AbstractC1295190joD<Integer, Integer> abstractC1295190joD = this.LJIIIZ;
        if (abstractC1295190joD != null) {
            abstractC1295190joD.LIZ(interfaceC1294590jnF);
        }
        AbstractC1295190joD<?, Float> abstractC1295190joD2 = this.LJIIL;
        if (abstractC1295190joD2 != null) {
            abstractC1295190joD2.LIZ(interfaceC1294590jnF);
        }
        AbstractC1295190joD<?, Float> abstractC1295190joD3 = this.LJIILIIL;
        if (abstractC1295190joD3 != null) {
            abstractC1295190joD3.LIZ(interfaceC1294590jnF);
        }
        AbstractC1295190joD<PointF, PointF> abstractC1295190joD4 = this.LJFF;
        if (abstractC1295190joD4 != null) {
            abstractC1295190joD4.LIZ(interfaceC1294590jnF);
        }
        AbstractC1295190joD<?, PointF> abstractC1295190joD5 = this.LJI;
        if (abstractC1295190joD5 != null) {
            abstractC1295190joD5.LIZ(interfaceC1294590jnF);
        }
        AbstractC1295190joD<C1295580joq, C1295580joq> abstractC1295190joD6 = this.LJII;
        if (abstractC1295190joD6 != null) {
            abstractC1295190joD6.LIZ(interfaceC1294590jnF);
        }
        AbstractC1295190joD<Float, Float> abstractC1295190joD7 = this.LJIIIIZZ;
        if (abstractC1295190joD7 != null) {
            abstractC1295190joD7.LIZ(interfaceC1294590jnF);
        }
        C1295230joH c1295230joH = this.LJIIJ;
        if (c1295230joH != null) {
            c1295230joH.LIZ(interfaceC1294590jnF);
        }
        C1295230joH c1295230joH2 = this.LJIIJJI;
        if (c1295230joH2 != null) {
            c1295230joH2.LIZ(interfaceC1294590jnF);
        }
    }

    public final Matrix LJ(float f) {
        PointF pointFLJFF;
        C1295580joq c1295580joqLJFF;
        float f2;
        AbstractC1295190joD<?, PointF> abstractC1295190joD = this.LJI;
        PointF pointFLJFF2 = null;
        if (abstractC1295190joD == null) {
            pointFLJFF = null;
        } else {
            pointFLJFF = abstractC1295190joD.LJFF();
        }
        AbstractC1295190joD<C1295580joq, C1295580joq> abstractC1295190joD2 = this.LJII;
        if (abstractC1295190joD2 == null) {
            c1295580joqLJFF = null;
        } else {
            c1295580joqLJFF = abstractC1295190joD2.LJFF();
        }
        this.LIZ.reset();
        if (pointFLJFF != null) {
            this.LIZ.preTranslate(pointFLJFF.x * f, pointFLJFF.y * f);
        }
        if (c1295580joqLJFF != null) {
            double d = f;
            this.LIZ.preScale((float) Math.pow(c1295580joqLJFF.LIZ, d), (float) Math.pow(c1295580joqLJFF.LIZIZ, d));
        }
        AbstractC1295190joD<Float, Float> abstractC1295190joD3 = this.LJIIIIZZ;
        if (abstractC1295190joD3 != null) {
            float fFloatValue = abstractC1295190joD3.LJFF().floatValue();
            AbstractC1295190joD<PointF, PointF> abstractC1295190joD4 = this.LJFF;
            if (abstractC1295190joD4 != null) {
                pointFLJFF2 = abstractC1295190joD4.LJFF();
            }
            Matrix matrix = this.LIZ;
            float f3 = fFloatValue * f;
            float f4 = 0.0f;
            if (pointFLJFF2 == null) {
                f2 = 0.0f;
            } else {
                f2 = pointFLJFF2.x;
                f4 = pointFLJFF2.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.LIZ;
    }

    public final boolean LIZJ(C1295400joY c1295400joY, Object obj) {
        if (obj == InterfaceC1295080jo2.LJFF) {
            AbstractC1295190joD<PointF, PointF> abstractC1295190joD = this.LJFF;
            if (abstractC1295190joD == null) {
                this.LJFF = new C1295300joO(c1295400joY, new PointF());
                return true;
            }
            abstractC1295190joD.LJIIJ(c1295400joY);
            return true;
        }
        if (obj == InterfaceC1295080jo2.LJI) {
            AbstractC1295190joD<?, PointF> abstractC1295190joD2 = this.LJI;
            if (abstractC1295190joD2 == null) {
                this.LJI = new C1295300joO(c1295400joY, new PointF());
                return true;
            }
            abstractC1295190joD2.LJIIJ(c1295400joY);
            return true;
        }
        if (obj == InterfaceC1295080jo2.LJII) {
            AbstractC1295190joD<?, PointF> abstractC1295190joD3 = this.LJI;
            if (abstractC1295190joD3 instanceof C1295140jo8) {
                ((C1295140jo8) abstractC1295190joD3).LJIIL = c1295400joY;
                return true;
            }
        }
        if (obj == InterfaceC1295080jo2.LJIIIIZZ) {
            AbstractC1295190joD<?, PointF> abstractC1295190joD4 = this.LJI;
            if (abstractC1295190joD4 instanceof C1295140jo8) {
                ((C1295140jo8) abstractC1295190joD4).LJIILIIL = c1295400joY;
                return true;
            }
        }
        if (obj == InterfaceC1295080jo2.LJIILJJIL) {
            AbstractC1295190joD<C1295580joq, C1295580joq> abstractC1295190joD5 = this.LJII;
            if (abstractC1295190joD5 == null) {
                this.LJII = new C1295300joO(c1295400joY, new C1295580joq());
                return true;
            }
            abstractC1295190joD5.LJIIJ(c1295400joY);
            return true;
        }
        if (obj == InterfaceC1295080jo2.LJIILL) {
            AbstractC1295190joD<Float, Float> abstractC1295190joD6 = this.LJIIIIZZ;
            if (abstractC1295190joD6 == null) {
                this.LJIIIIZZ = new C1295300joO(c1295400joY, Float.valueOf(0.0f));
                return true;
            }
            abstractC1295190joD6.LJIIJ(c1295400joY);
            return true;
        }
        if (obj == InterfaceC1295080jo2.LIZJ) {
            AbstractC1295190joD<Integer, Integer> abstractC1295190joD7 = this.LJIIIZ;
            if (abstractC1295190joD7 == null) {
                this.LJIIIZ = new C1295300joO(c1295400joY, 100);
                return true;
            }
            abstractC1295190joD7.LJIIJ(c1295400joY);
            return true;
        }
        if (obj == InterfaceC1295080jo2.LJJIIJ) {
            AbstractC1295190joD<?, Float> abstractC1295190joD8 = this.LJIIL;
            if (abstractC1295190joD8 == null) {
                this.LJIIL = new C1295300joO(c1295400joY, Float.valueOf(100.0f));
                return true;
            }
            abstractC1295190joD8.LJIIJ(c1295400joY);
            return true;
        }
        if (obj == InterfaceC1295080jo2.LJJIIJZLJL) {
            AbstractC1295190joD<?, Float> abstractC1295190joD9 = this.LJIILIIL;
            if (abstractC1295190joD9 == null) {
                this.LJIILIIL = new C1295300joO(c1295400joY, Float.valueOf(100.0f));
                return true;
            }
            abstractC1295190joD9.LJIIJ(c1295400joY);
            return true;
        }
        if (obj == InterfaceC1295080jo2.LJIILLIIL) {
            if (this.LJIIJ == null) {
                this.LJIIJ = new C1295230joH(Collections.singletonList(new C1294810jnb(Float.valueOf(0.0f))));
            }
            this.LJIIJ.LJIIJ(c1295400joY);
            return true;
        }
        if (obj == InterfaceC1295080jo2.LJIIZILJ) {
            if (this.LJIIJJI == null) {
                this.LJIIJJI = new C1295230joH(Collections.singletonList(new C1294810jnb(Float.valueOf(0.0f))));
            }
            this.LJIIJJI.LJIIJ(c1295400joY);
            return true;
        }
        return false;
    }
}
