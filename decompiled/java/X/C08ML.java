package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08ML, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08ML {
    public static final Map<Integer, Integer> LIZ = new ConcurrentHashMap();

    public static void LIZ() {
        try {
            Map<Integer, Integer> map = LIZ;
            if (((ConcurrentHashMap) map).get(-1) == null) {
                return;
            }
            Process.setThreadPriority(0, ((Number) ((ConcurrentHashMap) map).get(-1)).intValue());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZIZ(int i, int i2) {
        try {
            Map<Integer, Integer> map = LIZ;
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
