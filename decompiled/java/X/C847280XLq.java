package X;

import Y.ARunnableS103S0100000_3;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0XLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847280XLq {
    public static C847280XLq LIZLLL;
    public final C822660WOy LIZ;
    public final ConcurrentHashMap<AbstractRunnableC847330XLv, ScheduledFuture> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<AbstractRunnableC847330XLv, Runnable> LIZJ = new ConcurrentHashMap<>();

    public static C847280XLq LIZ() {
        if (LIZLLL == null) {
            synchronized (C847280XLq.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C847280XLq();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public C847280XLq() {
        C822660WOy c822660WOy = new C822660WOy(1, new ThreadFactory() { // from class: X.08A8
            public final String LL = "ttnet-io";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Logger.debug();
                return new BPEAThread(new ARunnableS103S0100000_3(runnable, 131), this.LL);
            }
        });
        this.LIZ = c822660WOy;
        c822660WOy.setRemoveOnCancelPolicy(true);
    }
}
