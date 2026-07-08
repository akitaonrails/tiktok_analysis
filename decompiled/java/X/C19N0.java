package X;

import android.view.View;
import java.text.DecimalFormat;
import java.util.Arrays;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.19N0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19N0 {
    public C19N9 LIZ;
    public int[] LIZIZ = new int[10];
    public float[] LIZJ = new float[10];
    public int LIZLLL;
    public String LJ;

    public abstract void LIZJ(View view, float f);

    public final String toString() {
        String strLIZIZ = this.LJ;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.LIZLLL; i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(e3.e);
            sbLIZ.append(this.LIZIZ[i]);
            sbLIZ.append(" , ");
            sbLIZ.append(decimalFormat.format(this.LIZJ[i]));
            sbLIZ.append("] ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZIZ;
    }

    public final float LIZ(float f) {
        return (float) this.LIZ.LIZIZ(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZLLL(int r15) {
        /*
            r14 = this;
            int r1 = r14.LIZLLL
            if (r1 != 0) goto L5
            return
        L5:
            int[] r4 = r14.LIZIZ
            float[] r3 = r14.LIZJ
            r13 = 1
            int r1 = r1 - r13
            int r0 = r4.length
            int r0 = r0 + 10
            int[] r2 = new int[r0]
            r12 = 0
            r2[r12] = r1
            r2[r13] = r12
            r5 = 2
            r11 = 2
        L17:
            int r0 = r11 + (-1)
            r7 = r2[r0]
            int r11 = r0 + (-1)
            r6 = r2[r11]
            if (r7 >= r6) goto L62
            r10 = r4[r6]
            r9 = r7
            r8 = r7
        L25:
            if (r9 >= r6) goto L3e
            r1 = r4[r9]
            if (r1 > r10) goto L3b
            r0 = r4[r8]
            r4[r8] = r1
            r4[r9] = r0
            r1 = r3[r8]
            r0 = r3[r9]
            r3[r8] = r0
            r3[r9] = r1
            int r8 = r8 + 1
        L3b:
            int r9 = r9 + 1
            goto L25
        L3e:
            r1 = r4[r8]
            r0 = r4[r6]
            r4[r8] = r0
            r4[r6] = r1
            r1 = r3[r8]
            r0 = r3[r6]
            r3[r8] = r0
            r3[r6] = r1
            int r1 = r11 + 1
            int r0 = r8 + (-1)
            r2[r11] = r0
            int r0 = r1 + 1
            r2[r1] = r7
            int r1 = r0 + 1
            r2[r0] = r6
            int r11 = r1 + 1
            int r0 = r8 + 1
            r2[r1] = r0
        L62:
            if (r11 > 0) goto L17
            r4 = 1
            r3 = 1
        L66:
            int r0 = r14.LIZLLL
            if (r4 >= r0) goto L79
            int[] r2 = r14.LIZIZ
            int r0 = r4 + (-1)
            r1 = r2[r0]
            r0 = r2[r4]
            if (r1 == r0) goto L76
            int r3 = r3 + 1
        L76:
            int r4 = r4 + 1
            goto L66
        L79:
            double[] r6 = new double[r3]
            int[] r1 = new int[r5]
            r1[r13] = r13
            r1[r12] = r3
            java.lang.Class r0 = java.lang.Double.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r0, r1)
            double[][] r5 = (double[][]) r5
            r4 = 0
            r7 = 0
        L8b:
            int r0 = r14.LIZLLL
            if (r4 >= r0) goto Lb7
            if (r4 <= 0) goto L9e
            int[] r2 = r14.LIZIZ
            r1 = r2[r4]
            int r0 = r4 + (-1)
            r0 = r2[r0]
            if (r1 != r0) goto L9e
        L9b:
            int r4 = r4 + 1
            goto L8b
        L9e:
            int[] r0 = r14.LIZIZ
            r0 = r0[r4]
            double r2 = (double) r0
            r0 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r2 = r2 * r0
            r6[r7] = r2
            r2 = r5[r7]
            float[] r0 = r14.LIZJ
            r0 = r0[r4]
            double r0 = (double) r0
            r2[r12] = r0
            int r7 = r7 + 1
            goto L9b
        Lb7:
            X.19N9 r0 = X.C19N9.LIZ(r15, r6, r5)
            r14.LIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19N0.LIZLLL(int):void");
    }

    public void LIZIZ(float f, int i) {
        int[] iArr = this.LIZIZ;
        if (iArr.length < this.LIZLLL + 1) {
            this.LIZIZ = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.LIZJ;
            this.LIZJ = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.LIZIZ;
        int i2 = this.LIZLLL;
        iArr2[i2] = i;
        this.LIZJ[i2] = f;
        this.LIZLLL = i2 + 1;
    }
}
