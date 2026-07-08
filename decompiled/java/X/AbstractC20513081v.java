package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.081v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20513081v {
    public volatile int mStatus;

    public abstract String getTaskName();

    public synchronized boolean isFinished() {
        return this.mStatus == 2;
    }

    public synchronized boolean isIDLE() {
        return this.mStatus == 0;
    }

    public synchronized boolean isRunning() {
        return this.mStatus == 1;
    }

    public abstract void run();

    public void start() throws Exception {
        if (this.mStatus == 2 || this.mStatus == 1) {
            return;
        }
        this.mStatus = 1;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init_live_launch_task_");
            sbLIZ.append(getTaskName());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Map<String, Long> map = C20514081w.LIZ;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jUptimeMillis = SystemClock.uptimeMillis();
            String strLIZ = C20514081w.LIZ(strLIZIZ, true);
            Map<String, Long> map2 = C20514081w.LIZIZ;
            ((ConcurrentHashMap) map2).put(strLIZ, Long.valueOf(jElapsedRealtime));
            Map<String, Long> map3 = C20514081w.LIZ;
            ((ConcurrentHashMap) map3).put(strLIZ, Long.valueOf(jUptimeMillis));
            ((CopyOnWriteArrayList) C20514081w.LIZJ).add(strLIZIZ);
            run();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("init_live_launch_task_");
            sbLIZ2.append(getTaskName());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            String strLIZ2 = C20514081w.LIZ(strLIZIZ2, false);
            ((ConcurrentHashMap) map2).put(strLIZ2, Long.valueOf(jElapsedRealtime2));
            ((ConcurrentHashMap) map3).put(strLIZ2, Long.valueOf(jUptimeMillis2));
            this.mStatus = 2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.mStatus = 3;
            throw e;
        }
    }

    public void start(int i) throws Exception {
        if (this.mStatus != 2 && this.mStatus != 1) {
            this.mStatus = 1;
            if (i != 2) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("init_live_launch_task_");
                    sbLIZ.append(getTaskName());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    Map<String, Long> map = C20514081w.LIZ;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    String strLIZ = C20514081w.LIZ(strLIZIZ, true);
                    ((ConcurrentHashMap) C20514081w.LIZIZ).put(strLIZ, Long.valueOf(jElapsedRealtime));
                    ((ConcurrentHashMap) C20514081w.LIZ).put(strLIZ, Long.valueOf(jUptimeMillis));
                    ((CopyOnWriteArrayList) C20514081w.LIZJ).add(strLIZIZ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.mStatus = 3;
                    throw e;
                }
            }
            run();
            if (i != 2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("init_live_launch_task_");
                sbLIZ2.append(getTaskName());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                Map<String, Long> map2 = C20514081w.LIZ;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                String strLIZ2 = C20514081w.LIZ(strLIZIZ2, false);
                ((ConcurrentHashMap) C20514081w.LIZIZ).put(strLIZ2, Long.valueOf(jElapsedRealtime2));
                ((ConcurrentHashMap) C20514081w.LIZ).put(strLIZ2, Long.valueOf(jUptimeMillis2));
            }
            this.mStatus = 2;
        }
    }

    public void updateStatus(int i) {
        this.mStatus = i;
    }

    public static void invokeMethod(String str, String str2) throws Throwable {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, new Class[0]);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            C2204961BRm.a0(declaredMethod, null, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5ytWXoFIBzPZcAZR4Io=", null));
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
    }
}
