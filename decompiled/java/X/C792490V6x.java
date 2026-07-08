package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0V6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792490V6x {
    public static final Map<EnumC792970V8t, C792490V6x> LIZLLL = new HashMap();
    public final C822660WOy LIZ;
    public final ConcurrentHashMap<AbstractRunnableC792500V6y, ScheduledFuture> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<AbstractRunnableC792500V6y, Runnable> LIZJ = new ConcurrentHashMap<>();

    public C792490V6x(String str) {
        this.LIZ = new C822660WOy(1, new ThreadFactoryC792480V6w(str));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static synchronized C792490V6x LIZ(EnumC792970V8t enumC792970V8t) throws Throwable {
        if (enumC792970V8t != null) {
            try {
                Map<EnumC792970V8t, C792490V6x> map = LIZLLL;
                try {
                    try {
                        try {
                            C792490V6x c792490V6x = (C792490V6x) ((HashMap) map).get(enumC792970V8t);
                            if (c792490V6x == null) {
                                try {
                                    try {
                                        try {
                                            c792490V6x = new C792490V6x(enumC792970V8t.name());
                                            try {
                                                try {
                                                    ((HashMap) map).put(enumC792970V8t, c792490V6x);
                                                } catch (Throwable th) {
                                                    th = th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                            return c792490V6x;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } else {
            try {
                try {
                    try {
                        throw new IllegalArgumentException("AsyncTaskManagerType must be not null!");
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } catch (Throwable th11) {
                    th = th11;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
        throw th;
    }

    public final void LIZIZ(AbstractRunnableC792500V6y abstractRunnableC792500V6y) {
        try {
            this.LIZ.remove(this.LIZJ.remove(abstractRunnableC792500V6y));
            ScheduledFuture scheduledFutureRemove = this.LIZIZ.remove(abstractRunnableC792500V6y);
            if (scheduledFutureRemove != null) {
                scheduledFutureRemove.cancel(true);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C792910V8n.LIZJ("APM-AsyncTask", "removeTask failed", th);
        }
    }

    public final void LIZJ(final AbstractRunnableC792500V6y abstractRunnableC792500V6y) {
        ScheduledFuture<?> scheduledFutureSchedule;
        if (abstractRunnableC792500V6y == null) {
            return;
        }
        try {
            Runnable runnable = new Runnable(abstractRunnableC792500V6y) { // from class: X.0V6u
                public final AbstractRunnableC792500V6y LL;

                public final void LIZ() {
                    try {
                        this.LL.run();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("thread ");
                        sbLIZ.append(C786410Ut5.u3().getName());
                        sbLIZ.append(" exception");
                        C792910V8n.LIZJ("APM-AsyncTask", C2188811AlT.LIZIZ(sbLIZ), th);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AsyncTaskManager$InnerRunnable@a2c2.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AsyncTaskManager$InnerRunnable@a2c2.run");
                }

                {
                    this.LL = abstractRunnableC792500V6y;
                }
            };
            if (abstractRunnableC792500V6y.LLILLJJLI) {
                scheduledFutureSchedule = this.LIZ.scheduleWithFixedDelay(runnable, abstractRunnableC792500V6y.LL, abstractRunnableC792500V6y.LLILLL, TimeUnit.MILLISECONDS);
            } else {
                scheduledFutureSchedule = this.LIZ.schedule(runnable, abstractRunnableC792500V6y.LL, TimeUnit.MILLISECONDS);
            }
            this.LIZJ.put(abstractRunnableC792500V6y, runnable);
            this.LIZIZ.put(abstractRunnableC792500V6y, scheduledFutureSchedule);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C792910V8n.LIZJ("APM-AsyncTask", "sendTask failed.", th);
        }
    }
}
