package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: renamed from: X.0uG6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696880uG6 implements InterfaceC1686290tz1 {
    public Canvas LIZ = C1296530jqN.LIZ;
    public Rect LIZIZ;
    public Rect LIZJ;

    @Override // X.InterfaceC1686290tz1
    public final void LIZ() {
        C1319950kS9.LIZ(this.LIZ, false);
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJIIJ() {
        this.LIZ.restore();
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJIILLIIL() {
        C1319950kS9.LIZ(this.LIZ, true);
    }

    @Override // X.InterfaceC1686290tz1
    public final void save() {
        this.LIZ.save();
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJ(float[] fArr) {
        if (!C1696040uEk.LIZ(fArr)) {
            Matrix matrix = new Matrix();
            C1697320uGo.LIZ(matrix, fArr);
            this.LIZ.concat(matrix);
        }
    }

    @Override // X.InterfaceC1686290tz1
    public final void jv(float f) {
        this.LIZ.rotate(f);
    }

    @Override // X.InterfaceC1686290tz1
    public final void LIZJ(float f, float f2) {
        this.LIZ.scale(f, f2);
    }

    @Override // X.InterfaceC1686290tz1
    public final void LIZLLL(C1683130ttv c1683130ttv, InterfaceC1695240uDS interfaceC1695240uDS) {
        this.LIZ.saveLayer(c1683130ttv.LIZ, c1683130ttv.LIZIZ, c1683130ttv.LIZJ, c1683130ttv.LIZLLL, interfaceC1695240uDS.LJIILIIL(), 31);
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJII(InterfaceC1680960tqQ interfaceC1680960tqQ, InterfaceC1695240uDS interfaceC1695240uDS) {
        Canvas canvas = this.LIZ;
        if (interfaceC1680960tqQ instanceof C1695950uEb) {
            canvas.drawPath(((C1695950uEb) interfaceC1680960tqQ).LIZIZ, interfaceC1695240uDS.LJIILIIL());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJIILIIL(InterfaceC1680960tqQ interfaceC1680960tqQ, int i) {
        Region.Op op;
        Canvas canvas = this.LIZ;
        if (interfaceC1680960tqQ instanceof C1695950uEb) {
            Path path = ((C1695950uEb) interfaceC1680960tqQ).LIZIZ;
            if (i == 0) {
                op = Region.Op.DIFFERENCE;
            } else {
                op = Region.Op.INTERSECT;
            }
            canvas.clipPath(path, op);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJIILJJIL(float f, float f2) {
        this.LIZ.translate(f, f2);
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJIILL(int i, C1683130ttv c1683130ttv) {
        LJIIIZ(c1683130ttv.LIZ, c1683130ttv.LIZIZ, c1683130ttv.LIZJ, c1683130ttv.LIZLLL, i);
    }

    @Override // X.InterfaceC1686290tz1
    public final void LIZIZ(float f, long j, InterfaceC1695240uDS interfaceC1695240uDS) {
        this.LIZ.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, interfaceC1695240uDS.LJIILIIL());
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJFF(InterfaceC1680820tqC interfaceC1680820tqC, long j, InterfaceC1695240uDS interfaceC1695240uDS) {
        this.LIZ.drawBitmap(C1696800uFy.LIZ(interfaceC1680820tqC), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), interfaceC1695240uDS.LJIILIIL());
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJIIJJI(long j, long j2, InterfaceC1695240uDS interfaceC1695240uDS) {
        this.LIZ.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), interfaceC1695240uDS.LJIILIIL());
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJIIIIZZ(float f, float f2, float f3, float f4, InterfaceC1695240uDS interfaceC1695240uDS) {
        this.LIZ.drawRect(f, f2, f3, f4, interfaceC1695240uDS.LJIILIIL());
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJIIIZ(float f, float f2, float f3, float f4, int i) {
        Region.Op op;
        Canvas canvas = this.LIZ;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f, f2, f3, f4, op);
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJI(InterfaceC1680820tqC interfaceC1680820tqC, long j, long j2, long j3, long j4, InterfaceC1695240uDS interfaceC1695240uDS) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new Rect();
            this.LIZJ = new Rect();
        }
        Canvas canvas = this.LIZ;
        Bitmap bitmapLIZ = C1696800uFy.LIZ(interfaceC1680820tqC);
        Rect rect = this.LIZIZ;
        int i = (int) (j >> 32);
        rect.left = i;
        rect.top = C1676820tjk.LIZJ(j);
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = C1676820tjk.LIZJ(j) + ((int) (j2 & 4294967295L));
        Rect rect2 = this.LIZJ;
        int i2 = (int) (j3 >> 32);
        rect2.left = i2;
        rect2.top = C1676820tjk.LIZJ(j3);
        rect2.right = i2 + ((int) (j4 >> 32));
        rect2.bottom = C1676820tjk.LIZJ(j3) + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapLIZ, rect, rect2, interfaceC1695240uDS.LJIILIIL());
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJIIZILJ(float f, float f2, float f3, float f4, float f5, float f6, InterfaceC1695240uDS interfaceC1695240uDS) {
        this.LIZ.drawRoundRect(f, f2, f3, f4, f5, f6, interfaceC1695240uDS.LJIILIIL());
    }

    @Override // X.InterfaceC1686290tz1
    public final void LJIIL(float f, float f2, float f3, float f4, float f5, float f6, boolean z, InterfaceC1695240uDS interfaceC1695240uDS) {
        this.LIZ.drawArc(f, f2, f3, f4, f5, f6, z, interfaceC1695240uDS.LJIILIIL());
    }
}
