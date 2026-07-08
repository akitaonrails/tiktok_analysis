package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0SV7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SV7 implements InterfaceC1320380kSq, C0SV6 {
    public final InterfaceC1320380kSq LJIILIIL;
    public final InterfaceC1320380kSq LJIILJJIL;
    public final Rect LJIILL;
    public final Rect LJIILLIIL;
    public final PointF LJIIZILJ;
    public final PointF LJIJ;
    public final float[] LJIJI = new float[9];
    public final float[] LJIJJ = new float[9];
    public final float[] LJIJJLI = new float[9];
    public float LJIL;

    public final String toString() {
        return C786410Ut5.j4("InterpolatingScaleType(%s (%s) -> %s (%s))", new Object[]{String.valueOf(this.LJIILIIL), String.valueOf(this.LJIIZILJ), String.valueOf(this.LJIILJJIL), String.valueOf(this.LJIJ)});
    }

    @Override // X.C0SV6
    public final Object getState() {
        return Float.valueOf(this.LJIL);
    }

    public C0SV7(InterfaceC1320380kSq interfaceC1320380kSq, InterfaceC1320380kSq interfaceC1320380kSq2, Rect rect, Rect rect2, PointF pointF, PointF pointF2) {
        this.LJIILIIL = interfaceC1320380kSq;
        this.LJIILJJIL = interfaceC1320380kSq2;
        this.LJIILL = rect;
        this.LJIILLIIL = rect2;
        this.LJIIZILJ = pointF;
        this.LJIJ = pointF2;
    }

    @Override // X.InterfaceC1320380kSq
    public final Matrix LIZ(float f, float f2, int i, int i2, Rect rect, Matrix matrix) {
        float f3;
        float f4;
        float f5 = f2;
        float f6 = f;
        Rect rect2 = this.LJIILL;
        if (rect2 == null) {
            rect2 = rect;
        }
        Rect rect3 = this.LJIILLIIL;
        if (rect3 == null) {
            rect3 = rect;
        }
        InterfaceC1320380kSq interfaceC1320380kSq = this.LJIILIIL;
        PointF pointF = this.LJIIZILJ;
        if (pointF == null) {
            f3 = f6;
            f4 = f5;
        } else {
            f3 = pointF.x;
            f4 = pointF.y;
        }
        interfaceC1320380kSq.LIZ(f3, f4, i, i2, rect2, matrix);
        matrix.getValues(this.LJIJI);
        InterfaceC1320380kSq interfaceC1320380kSq2 = this.LJIILJJIL;
        PointF pointF2 = this.LJIJ;
        if (pointF2 != null) {
            f6 = pointF2.x;
            f5 = pointF2.y;
        }
        interfaceC1320380kSq2.LIZ(f6, f5, i, i2, rect3, matrix);
        matrix.getValues(this.LJIJJ);
        int i3 = 0;
        do {
            float[] fArr = this.LJIJJLI;
            float f7 = this.LJIJI[i3];
            float f8 = this.LJIL;
            fArr[i3] = (f7 * (1.0f - f8)) + (this.LJIJJ[i3] * f8);
            i3++;
        } while (i3 < 9);
        matrix.setValues(this.LJIJJLI);
        return matrix;
    }
}
