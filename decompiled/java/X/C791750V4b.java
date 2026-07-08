package X;

import com.bytedance.services.apm.api.IEnsure;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0V4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791750V4b {
    public static final Object LJFF = new Object();
    public volatile C792580V7g LIZ;
    public volatile C792580V7g LIZIZ;
    public volatile C792580V7g LIZJ;
    public final Map<EnumC792960V8s, Long> LIZLLL = new ConcurrentHashMap(3);
    public InterfaceC791800V4g LJ;

    public final C792580V7g LIZJ() {
        if (this.LIZ == null) {
            synchronized (LJFF) {
                try {
                    if (this.LIZ == null) {
                        LJ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZ;
    }

    public final C792580V7g LIZLLL() {
        if (this.LIZJ == null) {
            synchronized (LJFF) {
                try {
                    if (this.LIZJ == null) {
                        LJI();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZJ;
    }

    public final void LJ() {
        synchronized (LJFF) {
            try {
                if (this.LIZ == null) {
                    C0V4Y c0v4y = new C0V4Y("io-task");
                    c0v4y.LLILLJJLI = new C0V4Z() { // from class: X.0V4c
                        @Override // X.C0V4Z
                        public final void LIZ(long j) {
                            ((ConcurrentHashMap) this.LIZ.LIZLLL).put(EnumC792960V8s.IO, Long.valueOf(j));
                        }
                    };
                    this.LIZ = new C792580V7g(c0v4y);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF() {
        synchronized (LJFF) {
            try {
                if (this.LIZIZ == null) {
                    C0V4Y c0v4y = new C0V4Y("light-weight-task");
                    c0v4y.LLILLJJLI = new C0V4Z() { // from class: X.0V4a
                        @Override // X.C0V4Z
                        public final void LIZ(long j) {
                            ((ConcurrentHashMap) this.LIZ.LIZLLL).put(EnumC792960V8s.LIGHT_WEIGHT, Long.valueOf(j));
                        }
                    };
                    this.LIZIZ = new C792580V7g(c0v4y);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI() {
        synchronized (LJFF) {
            try {
                if (this.LIZJ == null) {
                    C0V4Y c0v4y = new C0V4Y("time-sensitive-task");
                    c0v4y.LLILLJJLI = new C0V4Z() { // from class: X.0V4d
                        @Override // X.C0V4Z
                        public final void LIZ(long j) {
                            ((ConcurrentHashMap) this.LIZ.LIZLLL).put(EnumC792960V8s.TIME_SENSITIVE, Long.valueOf(j));
                        }
                    };
                    this.LIZJ = new C792580V7g(c0v4y);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C792580V7g LIZIZ(C0V4C c0v4c) {
        EnumC792960V8s taskType = c0v4c.getTaskType();
        if (taskType == EnumC792960V8s.IO) {
            return LIZJ();
        }
        if (taskType == EnumC792960V8s.TIME_SENSITIVE) {
            return LIZLLL();
        }
        if (this.LIZIZ == null) {
            synchronized (LJFF) {
                try {
                    if (this.LIZIZ == null) {
                        LJFF();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZIZ;
    }

    public final void LJII(C0V4C c0v4c) {
        try {
            LIZIZ(c0v4c).submit(c0v4c);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ("Apm-Async-task-post", th);
        }
    }

    public final void LIZ(String str, Throwable th) {
        IEnsure iEnsure;
        InterfaceC791800V4g interfaceC791800V4g = this.LJ;
        if (interfaceC791800V4g != null && ((C791780V4e) interfaceC791800V4g).LIZ.LIZ != null && (iEnsure = C1AF0.LIZ) != null) {
            iEnsure.reportLogException(5, th, str);
        }
    }

    public final void LJIIIIZZ(C0V4C c0v4c, long j) {
        if (c0v4c == null) {
            return;
        }
        try {
            C792580V7g c792580V7gLIZIZ = LIZIZ(c0v4c);
            c792580V7gLIZIZ.getClass();
            c792580V7gLIZIZ.LIZLLL(c792580V7gLIZIZ.schedule(c0v4c, j, TimeUnit.MILLISECONDS), c0v4c.hashCode(), false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ("Apm-Async-task-postDelayed", th);
        }
    }
}
