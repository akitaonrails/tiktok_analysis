package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.19R2, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19R2 {
    public final C19R3 LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public final RectF LJFF = new RectF();
    public final float[] LJI = new float[8];
    public final Path LJII = new Path();
    public final Paint LJIIIIZZ = new Paint(1);
    public final PorterDuffXfermode LJIIIZ = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);

    public final boolean LIZ() {
        float[] fArr = this.LJI;
        float f = fArr[0];
        if (f <= 0.0f) {
            return false;
        }
        float f2 = fArr[1];
        if (f != f2) {
            return false;
        }
        float f3 = fArr[2];
        if (f2 != f3) {
            return false;
        }
        float f4 = fArr[3];
        if (f3 != f4) {
            return false;
        }
        float f5 = fArr[4];
        if (f4 != f5) {
            return false;
        }
        float f6 = fArr[5];
        if (f5 != f6) {
            return false;
        }
        float f7 = fArr[6];
        return f6 == f7 && f7 == fArr[7];
    }

    public C19R2(C19R3 c19r3) {
        this.LIZ = c19r3;
    }
}
