package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: X.0V4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791820V4i {
    public volatile ExecutorService LIZ;
    public volatile boolean LIZIZ = true;
    public final C791830V4j LIZLLL = new C0V4C() { // from class: X.0V4j
        @Override // java.lang.Runnable
        public final void run() {
            C1C7U.LIZ("AsyncEventManager@5247.<field>$1");
            Iterator<InterfaceC788120Uvq> it2 = this.LL.LJFF.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(System.currentTimeMillis());
            }
            if (this.LL.LIZIZ) {
                this.LL.LJ(this);
            }
            C1C7U.LIZIZ("AsyncEventManager@5247.<field>$1");
        }

        @Override // X.C0V4C
        public final EnumC792960V8s getTaskType() {
            return EnumC792960V8s.LIGHT_WEIGHT;
        }
    };
    public final C791840V4k LJ = new C0V4C() { // from class: X.0V4k
        @Override // java.lang.Runnable
        public final void run() {
            C1C7U.LIZ("AsyncEventManager@5247.<field>$2");
            Iterator<InterfaceC788120Uvq> it2 = this.LL.LJI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(System.currentTimeMillis());
            }
            if (this.LL.LIZIZ) {
                this.LL.LJ(this);
            }
            C1C7U.LIZIZ("AsyncEventManager@5247.<field>$2");
        }

        @Override // X.C0V4C
        public final EnumC792960V8s getTaskType() {
            return EnumC792960V8s.LIGHT_WEIGHT;
        }
    };
    public final CopyOnWriteArraySet<InterfaceC788120Uvq> LJFF = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<InterfaceC788120Uvq> LJI = new CopyOnWriteArraySet<>();
    public final C791750V4b LIZJ = C791610V3n.LIZ;

    public final boolean LIZIZ() {
        if (this.LIZJ == null) {
            return false;
        }
        long id = C786410Ut5.u3().getId();
        Long l = (Long) ((ConcurrentHashMap) this.LIZJ.LIZLLL).get(EnumC792960V8s.LIGHT_WEIGHT);
        return id == (l != null ? l.longValue() : -1L);
    }

    public final void LIZ(InterfaceC788120Uvq interfaceC788120Uvq) {
        if (interfaceC788120Uvq != null) {
            try {
                if (this.LIZIZ && !this.LJFF.contains(interfaceC788120Uvq)) {
                    this.LJFF.add(interfaceC788120Uvq);
                    LJFF(this.LIZLLL);
                    LJ(this.LIZLLL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZJ(Runnable runnable) {
        if (this.LIZJ != null && runnable != null && this.LIZIZ) {
            C791750V4b c791750V4b = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AsyncEventManager-");
            sbLIZ.append("post");
            c791750V4b.LJII(new C791640V3q(EnumC792960V8s.LIGHT_WEIGHT, runnable, C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public final void LJ(C0V4C c0v4c) {
        if (this.LIZJ != null && c0v4c != null && this.LIZIZ) {
            this.LIZJ.LJIIIIZZ(c0v4c, 30000L);
        }
    }

    public final void LJFF(C0V4C c0v4c) {
        C791750V4b c791750V4b = this.LIZJ;
        if (c791750V4b != null && c0v4c != null) {
            try {
                C792580V7g c792580V7gLIZIZ = c791750V4b.LIZIZ(c0v4c);
                ThreadPoolExecutor threadPoolExecutor = c792580V7gLIZIZ.LLILZ;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.remove(c0v4c);
                }
                c792580V7gLIZIZ.LIZ(c0v4c);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c791750V4b.LIZ("Apm-Async-task-removeTask", th);
            }
        }
    }

    public final void LJI(InterfaceC788120Uvq interfaceC788120Uvq) {
        if (interfaceC788120Uvq != null) {
            try {
                this.LJFF.remove(interfaceC788120Uvq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJII(Runnable runnable) {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        C791750V4b c791750V4b = this.LIZJ;
                        if (c791750V4b != null) {
                            this.LIZ = c791750V4b.LIZJ();
                        } else {
                            this.LIZ = C786410Ut5.e4(1, new ThreadFactoryC2500609r2(3));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (this.LIZ != null) {
            this.LIZ.submit(runnable);
        }
    }

    public final void LIZLLL(long j, Runnable runnable) {
        if (this.LIZJ != null && this.LIZIZ) {
            C791750V4b c791750V4b = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AsyncEventManager-");
            sbLIZ.append("postDelayed");
            c791750V4b.LJIIIIZZ(new C791640V3q(EnumC792960V8s.LIGHT_WEIGHT, runnable, C2188811AlT.LIZIZ(sbLIZ)), j);
        }
    }
}
