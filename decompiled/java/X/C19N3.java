package X;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: X.19N3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19N3 extends C19N0 {
    public final SparseArray<C21526019Mc> LJFF;
    public float[] LJI;

    @Override // X.C19N0
    public final void LIZLLL(int i) {
        int size = this.LJFF.size();
        int iLIZLLL = this.LJFF.valueAt(0).LIZLLL();
        double[] dArr = new double[size];
        this.LJI = new float[iLIZLLL];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iLIZLLL);
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = this.LJFF.keyAt(i2);
            C21526019Mc c21526019McValueAt = this.LJFF.valueAt(i2);
            dArr[i2] = ((double) iKeyAt) * 0.01d;
            c21526019McValueAt.LIZJ(this.LJI);
            int i3 = 0;
            while (true) {
                if (i3 < this.LJI.length) {
                    dArr2[i2][i3] = r1[i3];
                    i3++;
                }
            }
        }
        this.LIZ = C19N9.LIZ(i, dArr, dArr2);
    }

    public C19N3(String str, SparseArray<C21526019Mc> sparseArray) {
        str.split(",");
        this.LJFF = sparseArray;
    }

    @Override // X.C19N0
    public final void LIZIZ(float f, int i) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // X.C19N0
    public final void LIZJ(View view, float f) {
        this.LIZ.LIZLLL(this.LJI, f);
        this.LJFF.valueAt(0).LJI(view, this.LJI);
    }
}
