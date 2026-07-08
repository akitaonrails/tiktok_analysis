package X;

import android.graphics.Matrix;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0jAI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270440jAI {
    public final Matrix LIZ = new Matrix();
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public float[] LJ;

    public final void LIZ(int i, boolean z, boolean z2, float[] fArr) {
        float f;
        if (this.LIZIZ == i && this.LIZJ == z && this.LIZLLL == z2 && Arrays.equals(fArr, this.LJ)) {
            return;
        }
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = Arrays.copyOf(fArr, fArr.length);
        this.LIZ.reset();
        this.LIZ.preTranslate(0.5f, 0.5f);
        this.LIZ.preRotate(i);
        Matrix matrix = this.LIZ;
        float f2 = -1.0f;
        if (z) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        if (!z2) {
            f2 = 1.0f;
        }
        matrix.preScale(f, f2);
        this.LIZ.preTranslate(-0.5f, -0.5f);
        this.LIZ.postConcat(C1273010jER.LIZJ(0, fArr));
    }
}
