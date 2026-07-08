package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08MK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MK {
    public static final Map<Integer, Integer> LIZ = new ConcurrentHashMap();

    public static void LIZ(int i) {
        try {
            Map<Integer, Integer> map = LIZ;
            if (((ConcurrentHashMap) map).get(Integer.valueOf(i)) == null) {
                return;
            }
            Process.setThreadPriority(i, ((Integer) ((ConcurrentHashMap) map).get(Integer.valueOf(i))).intValue());
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
