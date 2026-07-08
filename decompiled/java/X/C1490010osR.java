package X;

import Y.ARunnableS72S0200000_3;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0osR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490010osR {
    public static final ConcurrentHashMap<EnumC1490030osT, C1490010osR> LJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<AbstractRunnableC1490020osS, ScheduledFuture> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<AbstractRunnableC1490020osS, Runnable> LIZIZ = new ConcurrentHashMap<>();
    public final EnumC1490030osT LIZJ;
    public final C822660WOy LIZLLL;

    public C1490010osR(EnumC1490030osT enumC1490030osT) {
        this.LIZJ = enumC1490030osT;
        final String strName = enumC1490030osT.name();
        this.LIZLLL = new C822660WOy(1, new ThreadFactory(strName) { // from class: X.08A9
            public final String LL;

            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ttnet-");
                sbLIZ.append(strName);
                this.LL = C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new BPEAThread(new ARunnableS72S0200000_3(this, runnable, 48), this.LL);
            }
        });
    }

    public static C1490010osR LIZ(EnumC1490030osT enumC1490030osT) {
        if (enumC1490030osT != null) {
            ConcurrentHashMap<EnumC1490030osT, C1490010osR> concurrentHashMap = LJ;
            if (concurrentHashMap.get(enumC1490030osT) == null) {
                synchronized (C1490010osR.class) {
                    try {
                        if (concurrentHashMap.get(enumC1490030osT) == null) {
                            concurrentHashMap.put(enumC1490030osT, new C1490010osR(enumC1490030osT));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return concurrentHashMap.get(enumC1490030osT);
        }
        throw new IllegalArgumentException("unsupported async task type");
    }

    public final void LIZIZ(final AbstractRunnableC1490020osS abstractRunnableC1490020osS) {
        ScheduledFuture<?> scheduledFutureSchedule;
        if (abstractRunnableC1490020osS == null) {
            return;
        }
        abstractRunnableC1490020osS.mTaskType = this.LIZJ;
        try {
            Runnable runnable = new Runnable(abstractRunnableC1490020osS) { // from class: X.0osQ
                public final AbstractRunnableC1490020osS LL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("NetworkAsyncTaskManager$InnerRunnable@938d.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("NetworkAsyncTaskManager$InnerRunnable@938d.run");
                }

                public final void LIZ() {
                    try {
                        System.currentTimeMillis();
                        this.LL.run();
                        Logger.debug();
                        if (this.LL.isLoop()) {
                            return;
                        }
                    } catch (Throwable th) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            if (this.LL.isLoop()) {
                                return;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            if (!this.LL.isLoop()) {
                                C1490010osR.LIZ(this.LL.mTaskType).LIZIZ.remove(this.LL);
                                C1490010osR.LIZ(this.LL.mTaskType).LIZ.remove(this.LL);
                            }
                            throw th2;
                        }
                    }
                    C1490010osR.LIZ(this.LL.mTaskType).LIZIZ.remove(this.LL);
                    C1490010osR.LIZ(this.LL.mTaskType).LIZ.remove(this.LL);
                }

                {
                    this.LL = abstractRunnableC1490020osS;
                }
            };
            if (abstractRunnableC1490020osS.isLoop()) {
                scheduledFutureSchedule = this.LIZLLL.scheduleWithFixedDelay(runnable, abstractRunnableC1490020osS.mInitialDelay, abstractRunnableC1490020osS.mLoopInterval, abstractRunnableC1490020osS.mTimeUnit);
            } else {
                scheduledFutureSchedule = this.LIZLLL.schedule(runnable, abstractRunnableC1490020osS.mInitialDelay, abstractRunnableC1490020osS.mTimeUnit);
            }
            this.LIZIZ.put(abstractRunnableC1490020osS, runnable);
            this.LIZ.put(abstractRunnableC1490020osS, scheduledFutureSchedule);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
