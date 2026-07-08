package X;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;

/* JADX INFO: renamed from: X.0GhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422330GhD implements InterfaceC422340GhE {
    public double LIZ;
    public double LIZIZ;
    public int[] LIZJ = new int[0];
    public float[] LIZLLL = new float[0];
    public boolean LJ;
    public final Matrix LJFF;
    public LinearGradient LJI;
    public double LJII;
    public double LJIIIIZZ;
    public double LJIIIZ;
    public double LJIIJ;

    public C422330GhD() {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        this.LJFF = matrix;
        this.LJII = Double.NaN;
        this.LJIIIIZZ = Double.NaN;
        this.LJIIIZ = Double.NaN;
        this.LJIIJ = Double.NaN;
    }

    @Override // X.InterfaceC422340GhE
    public final void LIZ(double d) {
        this.LIZ = d;
    }

    public final Shader LIZJ(double d, double d2) {
        float f;
        LinearGradient linearGradient = this.LJI;
        if (linearGradient != null && this.LJII == d && this.LJIIIIZZ == d2 && this.LJIIIZ == this.LIZ && this.LJIIJ == this.LIZIZ) {
            return linearGradient;
        }
        float f2 = -((float) d2);
        float f3 = -((float) d);
        if (this.LJ) {
            f = (float) (this.LIZIZ - d2);
        } else {
            f = f2;
        }
        LinearGradient linearGradient2 = new LinearGradient(f2, f3, f, (float) (this.LIZ - d), this.LIZJ, this.LIZLLL, Shader.TileMode.CLAMP);
        linearGradient2.setLocalMatrix(this.LJFF);
        this.LJI = linearGradient2;
        this.LJII = d;
        this.LJIIIIZZ = d2;
        this.LJIIIZ = this.LIZ;
        this.LJIIJ = this.LIZIZ;
        return linearGradient2;
    }

    @Override // X.InterfaceC422340GhE
    public final void LIZIZ(List<Integer> list, List<Float> list2, boolean z) {
        this.LIZJ = C13LP.LLII(list);
        this.LIZLLL = C13LP.LLI(list2);
        this.LJ = z;
    }
}
