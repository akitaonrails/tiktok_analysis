package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0VGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795040VGs {
    public final ScheduledExecutorService LIZ;
    public final Map<String, RunnableC795050VGt> LIZIZ;
    public final Map<String, InterfaceC795070VGv> LIZJ;
    public final Object LIZLLL;

    static {
        C0VI8.LIZIZ("WorkTimer");
    }

    public C795040VGs() {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: X.0VGw
            public int LL;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("WorkManager-WorkTimer-thread-");
                sbLIZ.append(this.LL);
                ThreadMethodProxy.setName(threadNewThread, C2188811AlT.LIZIZ(sbLIZ));
                this.LL++;
                return threadNewThread;
            }
        };
        this.LIZIZ = new HashMap();
        this.LIZJ = new HashMap();
        this.LIZLLL = new Object();
        this.LIZ = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(threadFactory);
    }

    public final void LIZIZ(String str) {
        synchronized (this.LIZLLL) {
            try {
                if (((RunnableC795050VGt) ((HashMap) this.LIZIZ).remove(str)) != null) {
                    C0VI8 c0vi8LIZ = C0VI8.LIZ();
                    C786410Ut5.j4("Stopping timer for %s", new Object[]{str});
                    c0vi8LIZ.getClass();
                    ((HashMap) this.LIZJ).remove(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ(final String str, InterfaceC795070VGv interfaceC795070VGv) {
        synchronized (this.LIZLLL) {
            try {
                C0VI8 c0vi8LIZ = C0VI8.LIZ();
                C786410Ut5.j4("Starting timer for %s", new Object[]{str});
                c0vi8LIZ.getClass();
                LIZIZ(str);
                Runnable runnable = new Runnable(this, str) { // from class: X.0VGt
                    public final C795040VGs LL;
                    public final String LLILLJJLI;

                    public final void LIZ() {
                        synchronized (this.LL.LIZLLL) {
                            try {
                                if (((RunnableC795050VGt) ((HashMap) this.LL.LIZIZ).remove(this.LLILLJJLI)) != null) {
                                    InterfaceC795070VGv interfaceC795070VGv2 = (InterfaceC795070VGv) ((HashMap) this.LL.LIZJ).remove(this.LLILLJJLI);
                                    if (interfaceC795070VGv2 != null) {
                                        interfaceC795070VGv2.LIZ(this.LLILLJJLI);
                                    }
                                } else {
                                    C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
                                    C786410Ut5.j4("Timer with %s is already marked as complete.", new Object[]{this.LLILLJJLI});
                                    c0vi8LIZ2.getClass();
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            LIZ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }

                    {
                        this.LL = this;
                        this.LLILLJJLI = str;
                    }
                };
                ((HashMap) this.LIZIZ).put(str, runnable);
                ((HashMap) this.LIZJ).put(str, interfaceC795070VGv);
                this.LIZ.schedule(runnable, 600000L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
