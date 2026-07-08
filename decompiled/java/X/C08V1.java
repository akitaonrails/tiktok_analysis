package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.08V1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08V1 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final Map<Integer, C08V3> LIZJ = new LinkedHashMap();
    public static final Map<Thread, C08V3> LIZLLL = new LinkedHashMap();
    public static long LJ;

    public static void LIZIZ(boolean z) {
        int i;
        int i2;
        try {
            if (((Boolean) C08V4.LIZ.getValue()).booleanValue()) {
                for (Map.Entry entry : ((LinkedHashMap) LIZJ).entrySet()) {
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    C08V3 c08v3 = (C08V3) entry.getValue();
                    if (z) {
                        i2 = c08v3.LIZIZ;
                    } else {
                        i2 = c08v3.LIZ;
                    }
                    Process.setThreadPriority(iIntValue, i2);
                }
                return;
            }
            for (Map.Entry entry2 : ((LinkedHashMap) LIZLLL).entrySet()) {
                Thread thread = (Thread) entry2.getKey();
                C08V3 c08v32 = (C08V3) entry2.getValue();
                if (ThreadMethodProxy.isAlive(thread)) {
                    if (z) {
                        i = c08v32.LIZIZ;
                    } else {
                        i = c08v32.LIZ;
                    }
                    ThreadMethodProxy.setPriority(thread, i);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZ(Thread thread, boolean z) {
        int threadPriority;
        try {
            thread.getName();
            if (((Boolean) C08V4.LIZ.getValue()).booleanValue()) {
                int iLIZ = C2126908Ux.LIZ(thread);
                if (iLIZ > 0 && (threadPriority = Process.getThreadPriority(iLIZ)) > C08V4.LIZ()) {
                    Process.setThreadPriority(iLIZ, C08V4.LIZ());
                    if (z) {
                        LIZJ.put(Integer.valueOf(iLIZ), new C08V3(threadPriority, C08V4.LIZ()));
                        return;
                    }
                    return;
                }
                return;
            }
            int priority = thread.getPriority();
            if (priority < 10) {
                ThreadMethodProxy.setPriority(thread, 10);
                if (z) {
                    LIZLLL.put(thread, new C08V3(priority, 10));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
