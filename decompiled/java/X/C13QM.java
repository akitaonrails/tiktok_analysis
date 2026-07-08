package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.13QM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C13QM extends C2217421BqW implements Function0<InterfaceC790790V0j> {
    public static final C13QM LL = new C13QM();

    public C13QM() {
        super(0, C20008213Qi.class, "createIoScheduler", "createIoScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;", 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0VP6] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13QP] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC790790V0j invoke() {
        TimeUnit.MINUTES.toMillis(1L);
        final ?? r0 = new ThreadFactory() { // from class: X.0VP6
            public static final C01GW<ThreadFactory> LL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(211));

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = LL.getValue().newThread(runnable);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("IO");
                sbLIZ.append(", ");
                sbLIZ.append(threadNewThread.getName());
                ThreadMethodProxy.setName(threadNewThread, C2188811AlT.LIZIZ(sbLIZ));
                threadNewThread.setDaemon(true);
                return threadNewThread;
            }
        };
        final ?? r3 = new C13QV(r0) { // from class: X.13QP
            public final ThreadFactory LIZ;

            @Override // X.C13QV
            public final ScheduledExecutorService get() {
                return C786410Ut5.g4(5, this.LIZ);
            }

            {
                this.LIZ = r0;
            }
        };
        return new InterfaceC790790V0j(r3) { // from class: X.13QN
            public final C13QV LIZ;

            @Override // X.InterfaceC790790V0j
            public final InterfaceC790780V0i LIZ() {
                final C13QV c13qv = this.LIZ;
                return new InterfaceC790780V0i(c13qv) { // from class: X.13QO
                    public volatile ScheduledExecutorService LIZ;
                    public final Object LIZIZ = new Object();

                    {
                        this.LIZ = c13qv.get();
                    }

                    @Override // X.InterfaceC790780V0i
                    public final void LIZ(long j, Function0<Unit> function0) {
                        if (this.LIZ != null) {
                            synchronized (this.LIZIZ) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = this.LIZ;
                                    if (scheduledExecutorService != null) {
                                        scheduledExecutorService.schedule(new RunnableC514801zW(function0, (Function0<Unit>) 96), j, TimeUnit.MILLISECONDS);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    }
                };
            }

            {
                this.LIZ = r3;
            }
        };
    }
}
