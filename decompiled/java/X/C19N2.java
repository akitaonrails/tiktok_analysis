package X;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: X.19N2, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19N2 extends AbstractC21528319Mz {
    public final String LJIIJ;
    public final SparseArray<C21526019Mc> LJIIJJI;
    public final SparseArray<float[]> LJIIL = new SparseArray<>();
    public float[] LJIILIIL;
    public float[] LJIILJJIL;

    @Override // X.AbstractC21528319Mz
    public final void LJ(int i) {
        int size = this.LJIIJJI.size();
        int iLIZLLL = this.LJIIJJI.valueAt(0).LIZLLL();
        double[] dArr = new double[size];
        int i2 = iLIZLLL + 2;
        this.LJIILIIL = new float[i2];
        this.LJIILJJIL = new float[iLIZLLL];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = this.LJIIJJI.keyAt(i3);
            C21526019Mc c21526019McValueAt = this.LJIIJJI.valueAt(i3);
            float[] fArrValueAt = this.LJIIL.valueAt(i3);
            dArr[i3] = ((double) iKeyAt) * 0.01d;
            c21526019McValueAt.LIZJ(this.LJIILIIL);
            int i4 = 0;
            while (true) {
                if (i4 < this.LJIILIIL.length) {
                    dArr2[i3][i4] = r1[i4];
                    i4++;
                }
            }
            double[] dArr3 = dArr2[i3];
            dArr3[iLIZLLL] = fArrValueAt[0];
            dArr3[iLIZLLL + 1] = fArrValueAt[1];
        }
        this.LIZ = C19N9.LIZ(i, dArr, dArr2);
    }

    public C19N2(String str, SparseArray<C21526019Mc> sparseArray) {
        this.LJIIJ = str.split(",")[1];
        this.LJIIJJI = sparseArray;
    }

    @Override // X.AbstractC21528319Mz
    public final boolean LIZLLL(float f, long j, View view, C1781840wT8 c1781840wT8) {
        boolean z;
        this.LIZ.LIZLLL(this.LJIILIIL, f);
        float[] fArr = this.LJIILIIL;
        float f2 = fArr[fArr.length - 2];
        float f3 = fArr[fArr.length - 1];
        long j2 = j - this.LJIIIIZZ;
        if (Float.isNaN(this.LJIIIZ)) {
            float fLIZ = c1781840wT8.LIZ(view, this.LJIIJ);
            this.LJIIIZ = fLIZ;
            if (Float.isNaN(fLIZ)) {
                this.LJIIIZ = 0.0f;
            }
        }
        float f4 = (float) ((((double) this.LJIIIZ) + ((j2 * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.LJIIIZ = f4;
        this.LJIIIIZZ = j;
        float fLIZ2 = LIZ(f4);
        this.LJII = false;
        int i = 0;
        while (true) {
            float[] fArr2 = this.LJIILJJIL;
            if (i >= fArr2.length) {
                break;
            }
            boolean z2 = this.LJII;
            float f5 = this.LJIILIIL[i];
            if (f5 != 0.0d) {
                z = true;
            } else {
                z = false;
            }
            this.LJII = z2 | z;
            fArr2[i] = (f5 * fLIZ2) + f3;
            i++;
        }
        this.LJIIJJI.valueAt(0).LJI(view, this.LJIILJJIL);
        if (f2 != 0.0f) {
            this.LJII = true;
        }
        return this.LJII;
    }

    @Override // X.AbstractC21528319Mz
    public final void LIZJ(float f, float f2, float f3, int i, int i2) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
    }
}
