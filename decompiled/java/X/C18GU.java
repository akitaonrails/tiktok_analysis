package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.18GU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18GU implements C18A6 {
    public static final C18GU LIZ = new C18GU();
    public static ExecutorService LIZIZ;
    public static ExecutorService LIZJ;
    public static ScheduledExecutorService LIZLLL;
    public static ExecutorService LJ;

    public static ScheduledExecutorService LIZJ() {
        if (LIZLLL == null) {
            synchronized (C18GU.class) {
                try {
                    if (LIZLLL == null) {
                        InterfaceC21257118Gr interfaceC21257118GrLJFF = C18IP.LIZ.LJFF();
                        LIZLLL = interfaceC21257118GrLJFF != null ? interfaceC21257118GrLJFF.LIZIZ() : null;
                    }
                    if (LIZLLL == null) {
                        LIZLLL = new C822660WOy(3, new C08UJ("ScheduledThreadPool"));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public static void LJ(Runnable runnable) {
        if (LJ == null) {
            synchronized (C18GU.class) {
                try {
                    if (LJ == null) {
                        InterfaceC21257118Gr interfaceC21257118GrLJFF = C18IP.LIZ.LJFF();
                        if (interfaceC21257118GrLJFF != null) {
                            interfaceC21257118GrLJFF.LIZJ();
                        }
                        LJ = null;
                    }
                    if (LJ == null) {
                        LJ = C786410Ut5.h4();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LJ.execute(runnable);
    }

    public static void LIZLLL(long j, Runnable runnable) {
        try {
            LIZJ().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C18CE.LIZ.LJFF(1498, "BtmThreadPoolExecutor#submitScheduledTask", null, th, false);
        }
    }

    @Override // X.C18A6
    public final void LIZ(Runnable runnable, boolean z) {
        ExecutorService executorServiceLIZLLL;
        if (z && !C20321214fK.LIZ()) {
            runnable.run();
            return;
        }
        if (LIZIZ == null) {
            synchronized (C18GU.class) {
                try {
                    if (LIZIZ == null) {
                        InterfaceC21257118Gr interfaceC21257118GrLJFF = C18IP.LIZ.LJFF();
                        if (interfaceC21257118GrLJFF != null) {
                            executorServiceLIZLLL = interfaceC21257118GrLJFF.LIZLLL();
                        } else {
                            executorServiceLIZLLL = null;
                        }
                        LIZIZ = executorServiceLIZLLL;
                    }
                    if (LIZIZ == null) {
                        LIZIZ = new C822650WOx(3, 3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C08UJ("CPUThreadPool"));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LIZIZ.execute(runnable);
    }

    @Override // X.C18A6
    public final void LIZIZ(Runnable runnable, boolean z) {
        ExecutorService executorServiceLIZ;
        if (z && !C20321214fK.LIZ()) {
            runnable.run();
            return;
        }
        if (LIZJ == null) {
            synchronized (C18GU.class) {
                try {
                    if (LIZJ == null) {
                        InterfaceC21257118Gr interfaceC21257118GrLJFF = C18IP.LIZ.LJFF();
                        if (interfaceC21257118GrLJFF != null) {
                            executorServiceLIZ = interfaceC21257118GrLJFF.LIZ();
                        } else {
                            executorServiceLIZ = null;
                        }
                        LIZJ = executorServiceLIZ;
                    }
                    if (LIZJ == null) {
                        LIZJ = new C822650WOx(3, 3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C08UJ("IOThreadPool"));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LIZJ.execute(runnable);
    }
}
