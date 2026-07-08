package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0uEb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695950uEb implements InterfaceC1680960tqQ {
    public final Path LIZIZ;
    public RectF LIZJ;
    public float[] LIZLLL;
    public Matrix LJ;

    public C1695950uEb() {
        this(0);
    }

    @Override // X.InterfaceC1680960tqQ
    public final int LIZIZ() {
        return this.LIZIZ.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // X.InterfaceC1680960tqQ
    public final boolean LIZLLL() {
        return this.LIZIZ.isConvex();
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LJJJJLL() {
        this.LIZIZ.rewind();
    }

    @Override // X.InterfaceC1680960tqQ
    public final void close() {
        this.LIZIZ.close();
    }

    @Override // X.InterfaceC1680960tqQ
    public final C1683130ttv getBounds() {
        if (this.LIZJ == null) {
            this.LIZJ = new RectF();
        }
        RectF rectF = this.LIZJ;
        this.LIZIZ.computeBounds(rectF, true);
        return new C1683130ttv(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // X.InterfaceC1680960tqQ
    public final boolean isEmpty() {
        return this.LIZIZ.isEmpty();
    }

    @Override // X.InterfaceC1680960tqQ
    public final void reset() {
        this.LIZIZ.reset();
    }

    public /* synthetic */ C1695950uEb(int i) {
        this(new Path());
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LJFF(int i) {
        Path.FillType fillType;
        Path path = this.LIZIZ;
        if (i == 1) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    public final void LJIJ(long j) {
        Matrix matrix = this.LJ;
        if (matrix == null) {
            this.LJ = new Matrix();
        } else {
            matrix.reset();
        }
        this.LJ.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        this.LIZIZ.transform(this.LJ);
    }

    public C1695950uEb(Path path) {
        this.LIZIZ = path;
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LIZJ(float f, float f2) {
        this.LIZIZ.moveTo(f, f2);
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LJII(float f, float f2) {
        this.LIZIZ.rLineTo(f, f2);
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LJIIIIZZ(float f, float f2) {
        this.LIZIZ.rMoveTo(f, f2);
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LJIIJJI(InterfaceC1680960tqQ interfaceC1680960tqQ, long j) {
        Path path = this.LIZIZ;
        if (interfaceC1680960tqQ instanceof C1695950uEb) {
            path.addPath(((C1695950uEb) interfaceC1680960tqQ).LIZIZ, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LJIIL(float f, float f2) {
        this.LIZIZ.lineTo(f, f2);
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LJIILIIL(C1683130ttv c1683130ttv, EnumC1669110tXJ enumC1669110tXJ) {
        if (Float.isNaN(c1683130ttv.LIZ) || Float.isNaN(c1683130ttv.LIZIZ) || Float.isNaN(c1683130ttv.LIZJ) || Float.isNaN(c1683130ttv.LIZLLL)) {
            C1695940uEa.LIZJ("Invalid rectangle, make sure no value is NaN");
        }
        if (this.LIZJ == null) {
            this.LIZJ = new RectF();
        }
        this.LIZJ.set(c1683130ttv.LIZ, c1683130ttv.LIZIZ, c1683130ttv.LIZJ, c1683130ttv.LIZLLL);
        this.LIZIZ.addRect(this.LIZJ, C1695940uEa.LIZIZ(enumC1669110tXJ));
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LJIILJJIL(C1680760tq6 c1680760tq6, EnumC1669110tXJ enumC1669110tXJ) {
        if (this.LIZJ == null) {
            this.LIZJ = new RectF();
        }
        this.LIZJ.set(c1680760tq6.LIZ, c1680760tq6.LIZIZ, c1680760tq6.LIZJ, c1680760tq6.LIZLLL);
        if (this.LIZLLL == null) {
            this.LIZLLL = new float[8];
        }
        float[] fArr = this.LIZLLL;
        fArr[0] = Float.intBitsToFloat((int) (c1680760tq6.LJ >> 32));
        fArr[1] = Float.intBitsToFloat((int) (c1680760tq6.LJ & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (c1680760tq6.LJFF >> 32));
        fArr[3] = Float.intBitsToFloat((int) (c1680760tq6.LJFF & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (c1680760tq6.LJI >> 32));
        fArr[5] = Float.intBitsToFloat((int) (c1680760tq6.LJI & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (c1680760tq6.LJII >> 32));
        fArr[7] = Float.intBitsToFloat((int) (c1680760tq6.LJII & 4294967295L));
        this.LIZIZ.addRoundRect(this.LIZJ, this.LIZLLL, C1695940uEa.LIZIZ(enumC1669110tXJ));
    }

    public final void LJIILL(C1683130ttv c1683130ttv, EnumC1669110tXJ enumC1669110tXJ) {
        if (this.LIZJ == null) {
            this.LIZJ = new RectF();
        }
        this.LIZJ.set(c1683130ttv.LIZ, c1683130ttv.LIZIZ, c1683130ttv.LIZJ, c1683130ttv.LIZLLL);
        this.LIZIZ.addOval(this.LIZJ, C1695940uEa.LIZIZ(enumC1669110tXJ));
    }

    @Override // X.InterfaceC1680960tqQ
    public final boolean LJIIJ(InterfaceC1680960tqQ interfaceC1680960tqQ, InterfaceC1680960tqQ interfaceC1680960tqQ2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        Path path = this.LIZIZ;
        if (interfaceC1680960tqQ instanceof C1695950uEb) {
            Path path2 = ((C1695950uEb) interfaceC1680960tqQ).LIZIZ;
            if (interfaceC1680960tqQ2 instanceof C1695950uEb) {
                return path.op(path2, ((C1695950uEb) interfaceC1680960tqQ2).LIZIZ, op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void LJIILLIIL(C1683130ttv c1683130ttv, float f, float f2) {
        float f3 = c1683130ttv.LIZ;
        float f4 = c1683130ttv.LIZIZ;
        float f5 = c1683130ttv.LIZJ;
        float f6 = c1683130ttv.LIZLLL;
        if (this.LIZJ == null) {
            this.LIZJ = new RectF();
        }
        this.LIZJ.set(f3, f4, f5, f6);
        this.LIZIZ.arcTo(this.LIZJ, f, f2, false);
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LIZ(float f, float f2, float f3, float f4) {
        this.LIZIZ.rQuadTo(f, f2, f3, f4);
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LJ(float f, float f2, float f3, float f4) {
        this.LIZIZ.quadTo(f, f2, f3, f4);
    }

    public final void LJIIZILJ(float f, float f2, float f3, float f4) {
        this.LIZIZ.quadTo(f, f2, f3, f4);
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LJI(float f, float f2, float f3, float f4, float f5, float f6) {
        this.LIZIZ.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // X.InterfaceC1680960tqQ
    public final void LJIIIZ(float f, float f2, float f3, float f4, float f5, float f6) {
        this.LIZIZ.rCubicTo(f, f2, f3, f4, f5, f6);
    }
}
