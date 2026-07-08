package X;

import android.util.Pair;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.monitor.collector.c;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0V3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791630V3p extends c {
    public int LJ;
    public boolean LJFF;
    public final C791640V3q LJI;

    @Override // com.bytedance.monitor.collector.c
    public final synchronized Pair<String, String> LIZ() {
        try {
            if (!C791560V3i.LJIIJJI) {
                return null;
            }
            return new Pair<>(this.LIZ, MonitorJni.getProcInfos());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // com.bytedance.monitor.collector.c
    public final void LIZLLL() {
        C791640V3q c791640V3q;
        this.LIZIZ = 1;
        try {
            if (C791560V3i.LJIIJJI) {
                C791750V4b c791750V4b = this.LIZLLL;
                if (c791750V4b != null && (c791640V3q = this.LJI) != null) {
                    try {
                        C792580V7g c792580V7gLIZIZ = c791750V4b.LIZIZ(c791640V3q);
                        ThreadPoolExecutor threadPoolExecutor = c792580V7gLIZIZ.LLILZ;
                        if (threadPoolExecutor != null) {
                            threadPoolExecutor.remove(c791640V3q);
                        }
                        c792580V7gLIZIZ.LIZ(c791640V3q);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c791750V4b.LIZ("Apm-Async-task-removeTask", th);
                    }
                }
                MonitorJni.doStop();
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // com.bytedance.monitor.collector.c
    public final void LIZJ() {
        if (C302820Btw.LIZ()) {
            this.LJFF = false;
        }
        super.LIZJ();
        try {
            if (C791560V3i.LJIIJJI) {
                boolean z = this.LJFF;
                if (z) {
                    this.LJ = 5000;
                } else {
                    this.LJ = LSPassThroughRecordSizeConfig.DEFAULT;
                }
                MonitorJni.keepProcHyperOpen(z);
                MonitorJni.doStart();
                C791750V4b c791750V4b = this.LIZLLL;
                if (c791750V4b != null) {
                    C791640V3q c791640V3q = this.LJI;
                    long j = this.LJ;
                    if (c791640V3q != null) {
                        try {
                            C792580V7g c792580V7gLIZIZ = c791750V4b.LIZIZ(c791640V3q);
                            c792580V7gLIZIZ.LIZ(c791640V3q);
                            c792580V7gLIZIZ.LIZLLL(c792580V7gLIZIZ.scheduleWithFixedDelay(c791640V3q, 0L, j, TimeUnit.MILLISECONDS), c791640V3q.hashCode(), true);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c791750V4b.LIZ("Apm-Async-task-removeTask", th);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public C791630V3p(int i) {
        super(i, "proc_monitor");
        this.LJ = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LJFF = true;
        this.LJI = new C791640V3q(EnumC792960V8s.LIGHT_WEIGHT, new Runnable() { // from class: X.0Ux3
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ProcMonitor@bd1f.<field>$1");
                try {
                    C791630V3p c791630V3p = this.LL;
                    synchronized (c791630V3p) {
                        C791630V3p.LJFF(c791630V3p);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ProcMonitor@bd1f.<field>$1");
            }
        }, "collect-proc");
    }

    public static void LJFF(C791630V3p c791630V3p) {
        if (C302820Btw.LIZ() && C2214201BlK.LJIIJJI) {
            return;
        }
        synchronized (c791630V3p) {
            try {
                if (!C791560V3i.LJIIJJI) {
                } else {
                    MonitorJni.doCollect();
                }
            } finally {
            }
        }
    }

    @Override // com.bytedance.monitor.collector.c
    public final void LJ(int i) {
        try {
            if (!C791560V3i.LJIIJJI) {
                return;
            }
            LIZLLL();
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        this.LJ = LSPassThroughRecordSizeConfig.DEFAULT;
                        MonitorJni.setBufferSize(400);
                    }
                } else {
                    this.LJ = LSPassThroughRecordSizeConfig.DEFAULT;
                    MonitorJni.setBufferSize(200);
                }
                LIZJ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.monitor.collector.c
    public final synchronized Pair<String, String> LIZIZ(long j, long j2) {
        try {
            if (!C791560V3i.LJIIJJI) {
                return null;
            }
            return new Pair<>(this.LIZ, MonitorJni.getProcInfoTimeRange(j, j2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
