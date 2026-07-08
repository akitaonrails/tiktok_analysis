package X;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;

/* JADX INFO: renamed from: X.0jlM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293420jlM {
    public static final PathMeasure LIZ;
    public static final Path LIZIZ;
    public static final Path LIZJ;
    public static final float[] LIZLLL;
    public static final float LJ;
    public static float LJFF;

    static {
        new ThreadLocal<PathMeasure>() { // from class: X.0jlj
            @Override // java.lang.ThreadLocal
            public final PathMeasure initialValue() {
                return new PathMeasure();
            }
        };
        new ThreadLocal<Path>() { // from class: X.0jlh
            @Override // java.lang.ThreadLocal
            public final Path initialValue() {
                return new Path();
            }
        };
        new ThreadLocal<Path>() { // from class: X.0jli
            @Override // java.lang.ThreadLocal
            public final Path initialValue() {
                return new Path();
            }
        };
        new ThreadLocal<float[]>() { // from class: X.0jjG
            @Override // java.lang.ThreadLocal
            public final float[] initialValue() {
                return new float[4];
            }
        };
        Math.sqrt(2.0d);
        LIZ = new PathMeasure();
        LIZIZ = new Path();
        LIZJ = new Path();
        LIZLLL = new float[4];
        LJ = (float) Math.sqrt(2.0d);
        LJFF = -1.0f;
    }

    public static float LIZLLL() {
        if (LJFF == -1.0f) {
            LJFF = Resources.getSystem().getDisplayMetrics().density;
        }
        return LJFF;
    }

    public static void LIZJ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static float LJ(Matrix matrix) {
        float[] fArr = LIZLLL;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = LJ;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return ((float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1])) / 2.0f;
    }

    public static void LIZIZ(Path path, C1293500jlU c1293500jlU) {
        if (c1293500jlU == null) {
            return;
        }
        LIZ(path, c1293500jlU.LIZJ.LJ().floatValue() / 100.0f, c1293500jlU.LIZLLL.LJ().floatValue() / 100.0f, c1293500jlU.LJ.LJ().floatValue() / 360.0f);
    }

    public static void LIZ(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = LIZ;
        Path path2 = LIZIZ;
        Path path3 = LIZJ;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C1291650jiV.LIZ();
            return;
        }
        if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = C1291750jif.LIZJ(fMin, length);
                fMax = C1291750jif.LIZJ(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = C1291750jif.LIZJ(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = C1291750jif.LIZJ(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                C1291650jiV.LIZ();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C1291650jiV.LIZ();
            return;
        }
        C1291650jiV.LIZ();
    }
}
