package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.08UU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08UU {
    public static C822650WOx LIZ;

    public static Executor LIZ() {
        if (LIZ == null) {
            C822650WOx c822650WOx = new C822650WOx(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X.08UV
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return new BPEAThread(runnable, "SplitCompatBackgroundThread");
                }
            });
            LIZ = c822650WOx;
            c822650WOx.allowCoreThreadTimeOut(true);
        }
        return LIZ;
    }

    public static Executor LIZIZ() {
        Executor executorLIZ = LIZ();
        if (!AabPluginServiceImpl.LJFF) {
            return LIZ();
        }
        try {
            AtomicReference<ExecutorC2203291BLb> atomicReference = AabPluginServiceImpl.LJIIIIZZ;
            ExecutorC2203291BLb executorC2203291BLb = atomicReference.get();
            if (executorC2203291BLb != null) {
                return executorC2203291BLb;
            }
            ExecutorC2203291BLb executorC2203291BLb2 = new ExecutorC2203291BLb(executorLIZ);
            while (!atomicReference.compareAndSet(null, executorC2203291BLb2) && atomicReference.get() == null) {
            }
            return AabPluginServiceImpl.LJIIIIZZ.get();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ();
        }
    }
}
