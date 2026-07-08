package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.133Z, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C133Z<V> extends AbstractC199477133b implements InterfaceFutureC1488980oqm<V> {
    public static final Object LLILZ = new Object();
    public static final C199476133a LLILZIL = new C199476133a(AbstractC199487133l.class);
    public static final boolean LLILZLL;
    public static final C133U LLIZ;
    public volatile Object LL;
    public volatile C199498133w LLILLJJLI;
    public volatile C133W LLILLL;

    static {
        boolean z;
        C133U c133s;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            z = false;
        }
        LLILZLL = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e2 = null;
        if (property == null || property.contains("Android")) {
            try {
                c133s = new C133S();
            } catch (Error | Exception e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                try {
                    c133s = new C133U() { // from class: X.133e
                        public static final AtomicReferenceFieldUpdater<C133W, Thread> LIZ = AtomicReferenceFieldUpdater.newUpdater(C133W.class, Thread.class, "LIZ");
                        public static final AtomicReferenceFieldUpdater<C133W, C133W> LIZIZ = AtomicReferenceFieldUpdater.newUpdater(C133W.class, C133W.class, "LIZIZ");
                        public static final AtomicReferenceFieldUpdater<? super C133Z<?>, C133W> LIZJ = AtomicReferenceFieldUpdater.newUpdater(C133Z.class, C133W.class, "LLILLL");
                        public static final AtomicReferenceFieldUpdater<? super C133Z<?>, C199498133w> LIZLLL = AtomicReferenceFieldUpdater.newUpdater(C133Z.class, C199498133w.class, "LLILLJJLI");
                        public static final AtomicReferenceFieldUpdater<? super C133Z<?>, Object> LJ = AtomicReferenceFieldUpdater.newUpdater(C133Z.class, Object.class, "LL");

                        @Override // X.C133U
                        public final C133W LIZIZ(AbstractC199487133l abstractC199487133l) {
                            return LIZJ.getAndSet(abstractC199487133l, C133W.LIZJ);
                        }

                        @Override // X.C133U
                        public final C199498133w LIZ(AbstractC199487133l abstractC199487133l, C199498133w c199498133w) {
                            return LIZLLL.getAndSet(abstractC199487133l, c199498133w);
                        }

                        @Override // X.C133U
                        public final void LIZJ(C133W c133w, C133W c133w2) {
                            LIZIZ.lazySet(c133w, c133w2);
                        }

                        @Override // X.C133U
                        public final void LIZLLL(C133W c133w, Thread thread) {
                            LIZ.lazySet(c133w, thread);
                        }

                        @Override // X.C133U
                        public final boolean LJ(C133Z c133z, C199498133w c199498133w, C199498133w c199498133w2) {
                            return C199482133g.LIZ(LIZLLL, c133z, c199498133w, c199498133w2);
                        }

                        @Override // X.C133U
                        public final boolean LJFF(C133Z c133z, Object obj, Object obj2) {
                            return C199482133g.LIZ(LJ, c133z, obj, obj2);
                        }

                        @Override // X.C133U
                        public final boolean LJI(C133Z c133z, C133W c133w, C133W c133w2) {
                            return C199482133g.LIZ(LIZJ, c133z, c133w, c133w2);
                        }
                    };
                } catch (Error | Exception e4) {
                    e2 = e4;
                    TryCatchGuardChecker.doCheck(e2);
                    c133s = new C133U() { // from class: X.133V
                        @Override // X.C133U
                        public final void LIZJ(C133W c133w, C133W c133w2) {
                            c133w.LIZIZ = c133w2;
                        }

                        @Override // X.C133U
                        public final void LIZLLL(C133W c133w, Thread thread) {
                            c133w.LIZ = thread;
                        }

                        @Override // X.C133U
                        public final C133W LIZIZ(AbstractC199487133l abstractC199487133l) {
                            C133W c133w;
                            C133W c133w2 = C133W.LIZJ;
                            synchronized (abstractC199487133l) {
                                try {
                                    c133w = abstractC199487133l.LLILLL;
                                    if (c133w != c133w2) {
                                        abstractC199487133l.LLILLL = c133w2;
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            return c133w;
                        }

                        @Override // X.C133U
                        public final C199498133w LIZ(AbstractC199487133l abstractC199487133l, C199498133w c199498133w) {
                            C199498133w c199498133w2;
                            synchronized (abstractC199487133l) {
                                try {
                                    c199498133w2 = abstractC199487133l.LLILLJJLI;
                                    if (c199498133w2 != c199498133w) {
                                        abstractC199487133l.LLILLJJLI = c199498133w;
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            return c199498133w2;
                        }

                        @Override // X.C133U
                        public final boolean LJ(C133Z c133z, C199498133w c199498133w, C199498133w c199498133w2) {
                            synchronized (c133z) {
                                try {
                                    if (c133z.LLILLJJLI == c199498133w) {
                                        c133z.LLILLJJLI = c199498133w2;
                                        return true;
                                    }
                                    return false;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }

                        @Override // X.C133U
                        public final boolean LJFF(C133Z c133z, Object obj, Object obj2) {
                            synchronized (c133z) {
                                try {
                                    if (c133z.LL == obj) {
                                        c133z.LL = obj2;
                                        return true;
                                    }
                                    return false;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }

                        @Override // X.C133U
                        public final boolean LJI(C133Z c133z, C133W c133w, C133W c133w2) {
                            synchronized (c133z) {
                                try {
                                    if (c133z.LLILLL == c133w) {
                                        c133z.LLILLL = c133w2;
                                        return true;
                                    }
                                    return false;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    };
                }
            }
        } else {
            try {
                c133s = new C133U() { // from class: X.133e
                    public static final AtomicReferenceFieldUpdater<C133W, Thread> LIZ = AtomicReferenceFieldUpdater.newUpdater(C133W.class, Thread.class, "LIZ");
                    public static final AtomicReferenceFieldUpdater<C133W, C133W> LIZIZ = AtomicReferenceFieldUpdater.newUpdater(C133W.class, C133W.class, "LIZIZ");
                    public static final AtomicReferenceFieldUpdater<? super C133Z<?>, C133W> LIZJ = AtomicReferenceFieldUpdater.newUpdater(C133Z.class, C133W.class, "LLILLL");
                    public static final AtomicReferenceFieldUpdater<? super C133Z<?>, C199498133w> LIZLLL = AtomicReferenceFieldUpdater.newUpdater(C133Z.class, C199498133w.class, "LLILLJJLI");
                    public static final AtomicReferenceFieldUpdater<? super C133Z<?>, Object> LJ = AtomicReferenceFieldUpdater.newUpdater(C133Z.class, Object.class, "LL");

                    @Override // X.C133U
                    public final C133W LIZIZ(AbstractC199487133l abstractC199487133l) {
                        return LIZJ.getAndSet(abstractC199487133l, C133W.LIZJ);
                    }

                    @Override // X.C133U
                    public final C199498133w LIZ(AbstractC199487133l abstractC199487133l, C199498133w c199498133w) {
                        return LIZLLL.getAndSet(abstractC199487133l, c199498133w);
                    }

                    @Override // X.C133U
                    public final void LIZJ(C133W c133w, C133W c133w2) {
                        LIZIZ.lazySet(c133w, c133w2);
                    }

                    @Override // X.C133U
                    public final void LIZLLL(C133W c133w, Thread thread) {
                        LIZ.lazySet(c133w, thread);
                    }

                    @Override // X.C133U
                    public final boolean LJ(C133Z c133z, C199498133w c199498133w, C199498133w c199498133w2) {
                        return C199482133g.LIZ(LIZLLL, c133z, c199498133w, c199498133w2);
                    }

                    @Override // X.C133U
                    public final boolean LJFF(C133Z c133z, Object obj, Object obj2) {
                        return C199482133g.LIZ(LJ, c133z, obj, obj2);
                    }

                    @Override // X.C133U
                    public final boolean LJI(C133Z c133z, C133W c133w, C133W c133w2) {
                        return C199482133g.LIZ(LIZJ, c133z, c133w, c133w2);
                    }
                };
            } catch (NoClassDefFoundError e5) {
                TryCatchGuardChecker.doCheck(e5);
                c133s = new C133U() { // from class: X.133V
                    @Override // X.C133U
                    public final void LIZJ(C133W c133w, C133W c133w2) {
                        c133w.LIZIZ = c133w2;
                    }

                    @Override // X.C133U
                    public final void LIZLLL(C133W c133w, Thread thread) {
                        c133w.LIZ = thread;
                    }

                    @Override // X.C133U
                    public final C133W LIZIZ(AbstractC199487133l abstractC199487133l) {
                        C133W c133w;
                        C133W c133w2 = C133W.LIZJ;
                        synchronized (abstractC199487133l) {
                            try {
                                c133w = abstractC199487133l.LLILLL;
                                if (c133w != c133w2) {
                                    abstractC199487133l.LLILLL = c133w2;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        return c133w;
                    }

                    @Override // X.C133U
                    public final C199498133w LIZ(AbstractC199487133l abstractC199487133l, C199498133w c199498133w) {
                        C199498133w c199498133w2;
                        synchronized (abstractC199487133l) {
                            try {
                                c199498133w2 = abstractC199487133l.LLILLJJLI;
                                if (c199498133w2 != c199498133w) {
                                    abstractC199487133l.LLILLJJLI = c199498133w;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        return c199498133w2;
                    }

                    @Override // X.C133U
                    public final boolean LJ(C133Z c133z, C199498133w c199498133w, C199498133w c199498133w2) {
                        synchronized (c133z) {
                            try {
                                if (c133z.LLILLJJLI == c199498133w) {
                                    c133z.LLILLJJLI = c199498133w2;
                                    return true;
                                }
                                return false;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // X.C133U
                    public final boolean LJFF(C133Z c133z, Object obj, Object obj2) {
                        synchronized (c133z) {
                            try {
                                if (c133z.LL == obj) {
                                    c133z.LL = obj2;
                                    return true;
                                }
                                return false;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // X.C133U
                    public final boolean LJI(C133Z c133z, C133W c133w, C133W c133w2) {
                        synchronized (c133z) {
                            try {
                                if (c133z.LLILLL == c133w) {
                                    c133z.LLILLL = c133w2;
                                    return true;
                                }
                                return false;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                };
            }
        }
        e = null;
        LLIZ = c133s;
        if (e2 != null) {
            C199476133a c199476133a = LLILZIL;
            Logger loggerLIZ = c199476133a.LIZ();
            Level level = Level.SEVERE;
            loggerLIZ.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", e);
            c199476133a.LIZ().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e2);
        }
    }

    public final void LIZIZ(C133W c133w) {
        c133w.LIZ = null;
        while (true) {
            C133W c133w2 = this.LLILLL;
            if (c133w2 != C133W.LIZJ) {
                C133W c133w3 = null;
                while (c133w2 != null) {
                    C133W c133w4 = c133w2.LIZIZ;
                    if (c133w2.LIZ != null) {
                        c133w3 = c133w2;
                    } else if (c133w3 != null) {
                        c133w3.LIZIZ = c133w4;
                        if (c133w3.LIZ == null) {
                            break;
                        }
                    } else if (!LLIZ.LJI(this, c133w2, c133w4)) {
                        break;
                    }
                    c133w2 = c133w4;
                }
                return;
            }
            return;
        }
    }

    public static boolean LIZJ(C133Z c133z, Object obj, Object obj2) {
        return LLIZ.LJFF(c133z, obj, obj2);
    }
}
