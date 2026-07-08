package X;

import Y.AComparatorS52S0000000_33;
import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.19N1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19N1 {
    public C19N8 LIZ;
    public C21526019Mc LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public int LJ;
    public final ArrayList<C21529619Nm> LJFF = new ArrayList<>();

    public abstract void LIZIZ(View view, float f);

    public final void LIZJ() {
        int i;
        int size = this.LJFF.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.LJFF, new AComparatorS52S0000000_33(0));
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
        this.LIZ = new C19N8(this.LIZLLL, size);
        int i2 = 0;
        for (C21529619Nm c21529619Nm : this.LJFF) {
            float f = c21529619Nm.LIZLLL;
            dArr[i2] = ((double) f) * 0.01d;
            double[] dArr3 = dArr2[i2];
            float f2 = c21529619Nm.LIZIZ;
            dArr3[0] = f2;
            float f3 = c21529619Nm.LIZJ;
            dArr3[1] = f3;
            C19N8 c19n8 = this.LIZ;
            c19n8.LIZJ[i2] = ((double) c21529619Nm.LIZ) / 100.0d;
            c19n8.LIZLLL[i2] = f;
            c19n8.LJ[i2] = f3;
            c19n8.LIZIZ[i2] = f2;
            i2++;
        }
        C19N8 c19n82 = this.LIZ;
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, c19n82.LIZJ.length, 2);
        c19n82.LJI = new double[c19n82.LIZIZ.length + 1];
        if (c19n82.LIZJ[0] > 0.0d) {
            c19n82.LIZ.LIZ(0.0d, c19n82.LIZLLL[0]);
        }
        double[] dArr5 = c19n82.LIZJ;
        int length = dArr5.length - 1;
        if (dArr5[length] < 1.0d) {
            c19n82.LIZ.LIZ(1.0d, c19n82.LIZLLL[length]);
        }
        for (int i3 = 0; i3 < dArr4.length; i3++) {
            dArr4[i3][0] = c19n82.LJ[i3];
            int i4 = 0;
            while (true) {
                if (i4 < c19n82.LIZIZ.length) {
                    dArr4[i4][1] = r1[i4];
                    i4++;
                }
            }
            c19n82.LIZ.LIZ(c19n82.LIZJ[i3], c19n82.LIZLLL[i3]);
        }
        C19N7 c19n7 = c19n82.LIZ;
        int i5 = 0;
        double d = 0.0d;
        while (true) {
            float[] fArr = c19n7.LIZ;
            if (i5 >= fArr.length) {
                break;
            }
            d += (double) fArr[i5];
            i5++;
        }
        int i6 = 1;
        double d2 = 0.0d;
        while (true) {
            float[] fArr2 = c19n7.LIZ;
            if (i6 >= fArr2.length) {
                break;
            }
            int i7 = i6 - 1;
            float f4 = (fArr2[i7] + fArr2[i6]) / 2.0f;
            double[] dArr6 = c19n7.LIZIZ;
            d2 += (dArr6[i6] - dArr6[i7]) * ((double) f4);
            i6++;
        }
        int i8 = 0;
        while (true) {
            float[] fArr3 = c19n7.LIZ;
            if (i8 >= fArr3.length) {
                break;
            }
            fArr3[i8] = (float) (((double) fArr3[i8]) * (d / d2));
            i8++;
        }
        c19n7.LIZJ[0] = 0.0d;
        int i9 = 1;
        while (true) {
            float[] fArr4 = c19n7.LIZ;
            if (i9 >= fArr4.length) {
                break;
            }
            int i10 = i9 - 1;
            float f5 = (fArr4[i10] + fArr4[i9]) / 2.0f;
            double[] dArr7 = c19n7.LIZIZ;
            double d3 = dArr7[i9] - dArr7[i10];
            double[] dArr8 = c19n7.LIZJ;
            dArr8[i9] = dArr8[i10] + (d3 * ((double) f5));
            i9++;
        }
        double[] dArr9 = c19n82.LIZJ;
        if (dArr9.length > 1) {
            i = 0;
            c19n82.LJFF = C19N9.LIZ(0, dArr9, dArr4);
        } else {
            i = 0;
            c19n82.LJFF = null;
        }
        C19N9.LIZ(i, dArr, dArr2);
    }

    public final String toString() {
        String strLIZIZ = this.LIZJ;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (C21529619Nm c21529619Nm : this.LJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(e3.e);
            sbLIZ.append(c21529619Nm.LIZ);
            sbLIZ.append(" , ");
            sbLIZ.append(decimalFormat.format(c21529619Nm.LIZIZ));
            sbLIZ.append("] ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZIZ;
    }

    public final float LIZ(float f) {
        double dLIZIZ;
        double dCos;
        C19N8 c19n8 = this.LIZ;
        C19N9 c19n9 = c19n8.LJFF;
        if (c19n9 != null) {
            c19n9.LIZJ(f, c19n8.LJI);
        } else {
            double[] dArr = c19n8.LJI;
            dArr[0] = c19n8.LJ[0];
            dArr[1] = c19n8.LIZIZ[0];
        }
        double d = c19n8.LJI[0];
        C19N7 c19n7 = c19n8.LIZ;
        double d2 = f;
        switch (c19n7.LIZLLL) {
            case 1:
                dCos = Math.signum(0.5d - (c19n7.LIZIZ(d2) % 1.0d));
                break;
            case 2:
                dLIZIZ = Math.abs((((c19n7.LIZIZ(d2) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                dCos = 1.0d - dLIZIZ;
                break;
            case 3:
                dCos = (((c19n7.LIZIZ(d2) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                dLIZIZ = ((c19n7.LIZIZ(d2) * 2.0d) + 1.0d) % 2.0d;
                dCos = 1.0d - dLIZIZ;
                break;
            case 5:
                dCos = Math.cos(c19n7.LIZIZ(d2) * 6.283185307179586d);
                break;
            case 6:
                double dAbs = 1.0d - Math.abs(((c19n7.LIZIZ(d2) * 4.0d) % 4.0d) - 2.0d);
                dLIZIZ = dAbs * dAbs;
                dCos = 1.0d - dLIZIZ;
                break;
            default:
                dCos = Math.sin(c19n7.LIZIZ(d2) * 6.283185307179586d);
                break;
        }
        return (float) (d + (dCos * c19n8.LJI[1]));
    }
}
