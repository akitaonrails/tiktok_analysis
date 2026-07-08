package X;

import android.graphics.Matrix;

/* JADX INFO: renamed from: X.0jIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1275590jIb {
    public final String LIZ;
    public final int LIZIZ;
    public final float[] LIZJ;
    public final Matrix LIZLLL;

    public C1275590jIb(String str, int i, float[] fArr, Matrix matrix) {
        float[] fArr2;
        this.LIZ = "other";
        this.LIZIZ = -1;
        this.LIZ = str;
        this.LIZIZ = i;
        if (fArr != null) {
            fArr2 = (float[]) fArr.clone();
        } else {
            fArr2 = null;
        }
        this.LIZJ = fArr2;
        this.LIZLLL = matrix;
    }
}
