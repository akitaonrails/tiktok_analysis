package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Typeface;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0EOF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EOF {
    public static final C0EOF LIZ = new C0EOF();
    public static final Map<String, Typeface> LIZIZ = new ConcurrentHashMap();
    public static final Matrix LIZJ = new Matrix();

    public static PointF LIZ(C0ENU c0enu, C0EO0 c0eo0) {
        if (c0enu == null || c0eo0 == null) {
            return null;
        }
        float f = c0eo0.LIZJ;
        PointF pointF = c0enu.LIZ;
        float f2 = 2;
        float f3 = ((pointF.x / f2) * c0eo0.LIZ) + f;
        float f4 = c0eo0.LIZLLL;
        return LIZIZ(f3, f4 - ((pointF.y / f2) * c0eo0.LIZIZ), c0eo0.LJ, f, f4);
    }

    public static PointF LIZIZ(float f, float f2, float f3, float f4, float f5) {
        Matrix matrix = LIZJ;
        matrix.reset();
        matrix.setRotate(f3, f4, f5);
        float[] fArr = {f, f2};
        matrix.mapPoints(fArr);
        return new PointF(fArr[0], fArr[1]);
    }
}
