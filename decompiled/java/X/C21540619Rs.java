package X;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: X.19Rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21540619Rs extends AbstractC21540819Ru {
    public float LIZIZ;
    public float LIZJ;

    @Override // X.AbstractC21540819Ru
    public final void LIZ(Matrix matrix, Path path) {
        Matrix matrix2 = this.LIZ;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.LIZIZ, this.LIZJ);
        path.transform(matrix);
    }
}
