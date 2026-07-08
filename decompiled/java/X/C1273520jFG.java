package X;

import android.graphics.Matrix;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jFG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273520jFG {
    public static final ThreadLocal<Map<Integer, Matrix>> LIZ = new ThreadLocal<>();
    public static boolean LIZIZ = false;
    public static boolean LIZJ = true;

    public static boolean LIZ() {
        return LIZIZ && !LIZJ;
    }

    public static Matrix LIZJ(boolean z) {
        return LIZIZ(0, z, null);
    }

    public static Matrix LIZIZ(int i, boolean z, Matrix matrix) {
        if (LIZ()) {
            ThreadLocal<Map<Integer, Matrix>> threadLocal = LIZ;
            Map<Integer, Matrix> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Matrix matrix2 = map.get(Integer.valueOf(i));
            if (matrix2 == null) {
                if (matrix != null) {
                    matrix2 = new Matrix(matrix);
                } else {
                    matrix2 = new Matrix();
                }
                map.put(Integer.valueOf(i), matrix2);
            } else {
                if (matrix != null) {
                    matrix2.set(matrix);
                    return matrix2;
                }
                if (z) {
                    matrix2.reset();
                    return matrix2;
                }
            }
            return matrix2;
        }
        return new Matrix();
    }
}
