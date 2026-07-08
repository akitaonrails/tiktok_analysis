package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822990WQf {
    public static ExecutorService LIZLLL;
    public final Object LIZ = new Object();
    public final ReentrantLock LIZJ = new ReentrantLock();
    public final Map<RunnableC822970WQd, Object> LIZIZ = new WeakHashMap();

    public C822990WQf() {
        C2123408To c2123408To = new C2123408To(C0WQX.SCHEDULED);
        c2123408To.LIZJ = 1;
        c2123408To.LIZIZ = "TaskMonitor";
        ExecutorService executorServiceLIZ = C823050WQl.LIZ(new C2123508Tp(c2123408To));
        LIZLLL = executorServiceLIZ;
        Runnable runnable = new Runnable() { // from class: X.0WQe
            public final void LIZ() {
                if (C823050WQl.LIZIZ.LJ()) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ArrayList<RunnableC822970WQd> arrayList = new ArrayList();
                    this.LL.LIZJ.lock();
                    try {
                        try {
                            if (((WeakHashMap) this.LL.LIZIZ).size() <= 0) {
                                this.LL.LIZJ.unlock();
                                return;
                            }
                            Iterator it2 = ((WeakHashMap) this.LL.LIZIZ).entrySet().iterator();
                            while (it2.hasNext()) {
                                RunnableC822970WQd runnableC822970WQd = (RunnableC822970WQd) ((Map.Entry) it2.next()).getKey();
                                if (jUptimeMillis - runnableC822970WQd.LLILLL >= C823050WQl.LIZ.LJFF) {
                                    arrayList.add(runnableC822970WQd);
                                    it2.remove();
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        this.LL.LIZJ.unlock();
                        for (RunnableC822970WQd runnableC822970WQd2 : arrayList) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                String strLIZJ = C823040WQk.LIZJ(runnableC822970WQd2.LL);
                                if (!C823050WQl.LJI(strLIZJ)) {
                                    jSONObject.put("task_name", strLIZJ);
                                    jSONObject.put("pool_type", runnableC822970WQd2.LLILLJJLI.LL.name());
                                    jSONObject.put("pool_size", runnableC822970WQd2.LLILLJJLI.getPoolSize());
                                    jSONObject.put("queue_size", runnableC822970WQd2.LLILLJJLI.getQueue().size());
                                    jSONObject.put("duration", jUptimeMillis - runnableC822970WQd2.LLILLL);
                                    Thread thread = runnableC822970WQd2.LLILZ;
                                    if (thread != null) {
                                        jSONObject.put("task_stack", C823040WQk.LIZIZ(ThreadMethodProxy.getStackTrace(thread)));
                                    }
                                    C823050WQl.LIZIZ.LIZLLL(jSONObject);
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        arrayList.clear();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LL.LIZJ.unlock();
                        throw th;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TaskMonitor$TaskBlockedMonitorWorker@4c11.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TaskMonitor$TaskBlockedMonitorWorker@4c11.run");
            }
        };
        long j = C823050WQl.LIZ.LJFF;
        ((ScheduledExecutorService) executorServiceLIZ).scheduleAtFixedRate(runnable, j, j, TimeUnit.MILLISECONDS);
    }

    public final void LIZIZ(RunnableC822970WQd runnableC822970WQd) {
        if (!C823050WQl.LIZIZ.LJ()) {
            return;
        }
        this.LIZJ.lock();
        try {
            ((WeakHashMap) this.LIZIZ).put(runnableC822970WQd, this.LIZ);
            this.LIZJ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.unlock();
            throw th;
        }
    }

    public final void LIZJ(RunnableC822970WQd runnableC822970WQd) {
        if (!C823050WQl.LIZIZ.LJ()) {
            return;
        }
        this.LIZJ.lock();
        try {
            ((WeakHashMap) this.LIZIZ).remove(runnableC822970WQd);
            this.LIZJ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.unlock();
            throw th;
        }
    }

    public static JSONObject LIZ(WeakReference<Object> weakReference, String str, int i, int i2, long j) {
        Object obj = weakReference.get();
        if (obj == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String strLIZJ = C823040WQk.LIZJ(obj);
            if (C823050WQl.LJI(strLIZJ)) {
                return null;
            }
            jSONObject.put("task_name", strLIZJ);
            jSONObject.put("pool_type", str);
            jSONObject.put("pool_size", i);
            jSONObject.put("queue_size", i2);
            jSONObject.put("duration", j);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }
}
