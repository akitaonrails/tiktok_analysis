package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Uvw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788180Uvw {
    public static volatile boolean LIZ;
    public static final Map<Integer, Integer> LIZIZ = new ConcurrentHashMap();

    public static void LIZ(int i, int i2) {
        try {
            Map<Integer, Integer> map = LIZIZ;
            int threadPriority = 0;
            if (((ConcurrentHashMap) map).get(Integer.valueOf(i)) == null) {
                if (i != -1) {
                    threadPriority = Process.getThreadPriority(i);
                } else {
                    threadPriority = Process.getThreadPriority(0);
                }
                ((ConcurrentHashMap) map).put(Integer.valueOf(i), Integer.valueOf(threadPriority));
            }
            if (threadPriority != i2) {
                if (i != -1) {
                    Process.setThreadPriority(i, i2);
                } else {
                    Process.setThreadPriority(i2);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
