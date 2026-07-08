package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS46S0300000_13;
import android.os.Looper;
import android.os.Process;
import com.bytedance.sysoptimizer.anr.GetHeldByThreadOpt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0WuO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838180WuO {
    public static int LIZ = -1;
    public static int LIZIZ;

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0WuT, java.lang.Object] */
    public static void LIZ(int i) {
        Collection collection;
        int i2;
        GetHeldByThreadOpt.ThreadData threadDataForLockMonitor = GetHeldByThreadOpt.getThreadDataForLockMonitor(Looper.getMainLooper().getThread());
        if (threadDataForLockMonitor.thread != null && !threadDataForLockMonitor.deadLock) {
            int threadPriority = Process.getThreadPriority(threadDataForLockMonitor.tid);
            int i3 = LIZ;
            if (i3 == -1 && i3 != (i2 = threadDataForLockMonitor.tid)) {
                LIZIZ = threadPriority;
                LIZ = i2;
            }
            if (threadPriority > -16) {
                Process.setThreadPriority(threadDataForLockMonitor.tid, i);
                ExecutorService executorService = C838190WuP.LJFF;
                ScheduledExecutorService scheduledExecutorService = C838200WuQ.LIZLLL.LIZIZ;
                C838220WuS c838220WuS = new C838220WuS();
                scheduledExecutorService.schedule(new ARunnableS113S0100000_13(c838220WuS, 27), 1000L, TimeUnit.MILLISECONDS);
                C838190WuP<TResult> c838190WuP = c838220WuS.LIZ;
                final ?? r6 = new InterfaceC838240WuU() { // from class: X.0WuT
                    @Override // X.InterfaceC838240WuU
                    public final void LIZ(C838190WuP c838190WuP2) {
                        C1C7U.LIZ("HeldByLockAnrOptHelper@c522.adjustPriority$1L");
                        Process.setThreadPriority(C838180WuO.LIZ, C838180WuO.LIZIZ);
                        C838180WuO.LIZ = -1;
                        C838180WuO.LIZIZ = -1;
                        C1C7U.LIZIZ("HeldByLockAnrOptHelper@c522.adjustPriority$1L");
                    }
                };
                c838190WuP.getClass();
                final ExecutorC838210WuR executorC838210WuR = C838190WuP.LJI;
                final C838220WuS c838220WuS2 = new C838220WuS();
                ReentrantLock reentrantLock = c838190WuP.LIZ;
                reentrantLock.lock();
                try {
                    reentrantLock = c838190WuP.LIZ;
                    reentrantLock.lock();
                    try {
                        boolean z = c838190WuP.LIZJ;
                        reentrantLock.unlock();
                        if (!z && (collection = c838190WuP.LJ) != null) {
                            ((ArrayList) collection).add(new InterfaceC838240WuU() { // from class: X.0WuN
                                @Override // X.InterfaceC838240WuU
                                public final void LIZ(C838190WuP c838190WuP2) {
                                    C838220WuS c838220WuS3 = c838220WuS2;
                                    InterfaceC838240WuU interfaceC838240WuU = r6;
                                    Executor executor = executorC838210WuR;
                                    C1C7U.LIZ("Task@a5a5.continueWith$1L");
                                    ExecutorService executorService2 = C838190WuP.LJFF;
                                    try {
                                        executor.execute(new ARunnableS46S0300000_13(c838220WuS3, interfaceC838240WuU, c838190WuP2, 4));
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c838220WuS3.LIZ(new C837970Wu3(e));
                                    }
                                    C1C7U.LIZIZ("Task@a5a5.continueWith$1L");
                                }
                            });
                        }
                        reentrantLock.unlock();
                        if (z) {
                            ExecutorService executorService2 = C838190WuP.LJFF;
                            try {
                                executorC838210WuR.execute(new ARunnableS46S0300000_13(c838220WuS2, r6, c838190WuP, 4));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                c838220WuS2.LIZ(new C837970Wu3(e));
                            }
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                        reentrantLock.unlock();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
