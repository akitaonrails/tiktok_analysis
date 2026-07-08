package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: X.0jmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294350jmr {
    public static final C1294300jmm LIZ = new ThreadLocal<PathMeasure>() { // from class: X.0jmm
        @Override // java.lang.ThreadLocal
        public final PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    public static final C1294340jmq LIZIZ = new ThreadLocal<Path>() { // from class: X.0jmq
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    };
    public static final C1294360jms LIZJ = new ThreadLocal<Path>() { // from class: X.0jms
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    };
    public static final C1294370jmt LIZLLL = new ThreadLocal<float[]>() { // from class: X.0jmt
        @Override // java.lang.ThreadLocal
        public final float[] initialValue() {
            return new float[4];
        }
    };
    public static final float LJ = (float) (Math.sqrt(2.0d) / 2.0d);

    public static float LIZJ() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static void LIZIZ(Closeable closeable) {
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

    public static float LIZLLL(Matrix matrix) {
        float[] fArr = LIZLLL.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = LJ;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean LJ(Throwable th) {
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            return false;
        }
        return true;
    }

    public static Bitmap LJFF(int i, int i2, Bitmap bitmap) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        return bitmapCreateScaledBitmap;
    }

    public static void LIZ(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = LIZ.get();
        Path path2 = LIZIZ.get();
        Path path3 = LIZJ.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if ((f != 1.0f || f2 != 0.0f) && length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = C1295100jo4.LIZJ(fMin, length);
                fMax = C1295100jo4.LIZJ(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = C1295100jo4.LIZJ(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = C1295100jo4.LIZJ(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
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
        }
    }
}
