package X;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.16GH, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16GH {
    public float[] LIZ = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public final Path LIZIZ = new Path();
    public final RectF LIZJ = new RectF();

    public final void LIZIZ(int i, int i2) {
        this.LIZJ.set(0.0f, 0.0f, i, i2);
        this.LIZIZ.reset();
        this.LIZIZ.addRoundRect(this.LIZJ, this.LIZ, Path.Direction.CW);
    }

    public final void LIZ(C462630ICf c462630ICf, int i, int i2) {
        float f = c462630ICf.LIZ;
        float f2 = c462630ICf.LIZIZ;
        float f3 = c462630ICf.LIZJ;
        float f4 = c462630ICf.LIZLLL;
        this.LIZ = new float[]{f, f, f2, f2, f3, f3, f4, f4};
        LIZIZ(i, i2);
    }
}
