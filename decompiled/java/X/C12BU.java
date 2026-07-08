package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.12BU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12BU {
    public final double LIZ;
    public final double LIZIZ;
    public final double LIZJ;

    public final C12BU LIZ() {
        LIZIZ(Double.valueOf(this.LIZ), Double.valueOf(this.LIZIZ), Double.valueOf(this.LIZJ));
        if (LIZJ().LIZ()) {
            return this;
        }
        double d = 0.0d;
        if (!LIZIZ(null, Double.valueOf(0.0d), null).LIZJ().LIZ()) {
            return this;
        }
        double dPow = 0.37d / Math.pow(2.0d, 13);
        double d2 = this.LIZIZ;
        while (d2 - d > dPow) {
            double d3 = (d + d2) * 0.5d;
            if (LIZIZ(null, Double.valueOf(d3), null).LIZJ().LIZ()) {
                d = d3;
            } else {
                d2 = d3;
            }
        }
        return LIZIZ(null, Double.valueOf(d), null);
    }

    public final C12BW LIZJ() {
        double d = 180;
        double[] dArr = {this.LIZ, this.LIZIZ * Math.cos((this.LIZJ * 3.141592653589793d) / d), this.LIZIZ * Math.sin((this.LIZJ * 3.141592653589793d) / d)};
        double[][] dArr2 = {new double[]{1.0d, 0.3963377773761749d, 0.2158037573099136d}, new double[]{1.0d, -0.1055613458156586d, -0.0638541728258133d}, new double[]{1.0d, -0.0894841775298119d, -1.2914855480194092d}};
        double[][] dArr3 = {new double[]{1.2268798758459243d, -0.5578149944602171d, 0.2813910456659647d}, new double[]{-0.0405757452148008d, 1.112286803280317d, -0.0717110580655164d}, new double[]{-0.0763729366746601d, -0.4214933324022432d, 1.5869240198367816d}};
        double[] dArr4 = {0.0d, 0.0d, 0.0d};
        int i = 0;
        do {
            int i2 = 0;
            do {
                dArr4[i] = dArr4[i] + (dArr2[i][i2] * dArr[i2]);
                i2++;
            } while (i2 < 3);
            i++;
        } while (i < 3);
        ArrayList arrayList = new ArrayList(3);
        int i3 = 0;
        do {
            arrayList.add(Double.valueOf(Math.pow(dArr4[i3], 3.0d)));
            i3++;
        } while (i3 < 3);
        double[] dArrLLFZ = C13LP.LLFZ(arrayList);
        double[] dArr5 = {0.0d, 0.0d, 0.0d};
        int i4 = 0;
        do {
            int i5 = 0;
            do {
                dArr5[i4] = dArr5[i4] + (dArr3[i4][i5] * dArrLLFZ[i5]);
                i5++;
            } while (i5 < 3);
            i4++;
        } while (i4 < 3);
        double[] dArr6 = {dArr5[0], dArr5[1], dArr5[2]};
        double[][] dArr7 = {new double[]{3.2409699419045213d, -1.5373831775700935d, -0.4986107602930033d}, new double[]{-0.9692436362808798d, 1.8759675015077206d, 0.04155505740717561d}, new double[]{0.05563007969699361d, -0.20397695888897657d, 1.0569715142428786d}};
        double[] dArr8 = {0.0d, 0.0d, 0.0d};
        int i6 = 0;
        do {
            int i7 = 0;
            do {
                dArr8[i6] = dArr8[i6] + (dArr7[i6][i7] * dArr6[i7]);
                i7++;
            } while (i7 < 3);
            i6++;
        } while (i6 < 3);
        return new C12BW(C19376610rM.LIZ(dArr8[0]), C19376610rM.LIZ(dArr8[1]), C19376610rM.LIZ(dArr8[2]));
    }

    public C12BU(double d, double d2, double d3) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
    }

    public final C12BU LIZIZ(Double d, Double d2, Double d3) {
        double dDoubleValue;
        double dDoubleValue2;
        double dDoubleValue3;
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = this.LIZ;
        }
        if (d2 != null) {
            dDoubleValue2 = d2.doubleValue();
        } else {
            dDoubleValue2 = this.LIZIZ;
        }
        if (d3 != null) {
            dDoubleValue3 = d3.doubleValue();
        } else {
            dDoubleValue3 = this.LIZJ;
        }
        return new C12BU(dDoubleValue, dDoubleValue2, dDoubleValue3);
    }
}
