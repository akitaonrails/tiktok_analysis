package X;

import Y.ARunnableS6S0001000_20;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;

/* JADX INFO: renamed from: X.0jHo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1275100jHo {
    public C1272880jEE LIZ;
    public Bitmap LIZIZ;
    public int LIZJ;
    public k LIZLLL;
    public final Matrix LJ;
    public final Handler LJFF;

    public final void LIZ() {
        k kVar = this.LIZLLL;
        if (kVar != null) {
            kVar.release();
            this.LIZLLL = null;
        }
        int i = this.LIZJ;
        if (i != 0) {
            this.LIZJ = 0;
            C1283100jUi.LIZIZ(this.LJFF, new ARunnableS6S0001000_20(i, 3));
        }
        C1272880jEE c1272880jEE = this.LIZ;
        if (c1272880jEE != null) {
            c1272880jEE.release();
            this.LIZ = null;
        }
        this.LIZIZ = null;
    }

    public C1275100jHo() {
        Matrix matrix = new Matrix();
        this.LJ = matrix;
        this.LJFF = GLThreadManager.getMainGlHandle();
        matrix.reset();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
    }
}
