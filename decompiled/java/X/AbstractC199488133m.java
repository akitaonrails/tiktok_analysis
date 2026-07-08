package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.133m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC199488133m<V> extends AnonymousClass1343 implements ListenableFuture<V> {
    public static final boolean LL;
    public static final Logger LLILLJJLI;
    public static final C133T LLILLL;
    public static final Object LLILZ;
    public volatile C199495133t listeners;
    public volatile Object value;
    public volatile C133Y waiters;

    public void LIZJ() {
    }

    public void LJIIL() {
    }

    static {
        boolean z;
        C133T c133t;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            z = false;
        }
        LL = z;
        LLILLJJLI = Logger.getLogger(AbstractC199488133m.class.getName());
        Throwable th = null;
        try {
            c133t = new C133T() { // from class: X.133P
                public static final Unsafe LIZ;
                public static final long LIZIZ;
                public static final long LIZJ;
                public static final long LIZLLL;
                public static final long LJ;
                public static final long LJFF;

                static {
                    Unsafe unsafe;
                    try {
                        unsafe = Unsafe.getUnsafe();
                    } catch (SecurityException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        try {
                            unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: X.12wC
                                public static Unsafe LIZ() throws IllegalAccessException {
                                    for (Field field : Unsafe.class.getDeclaredFields()) {
                                        field.setAccessible(true);
                                        Object obj = field.get(null);
                                        if (Unsafe.class.isInstance(obj)) {
                                            return (Unsafe) Unsafe.class.cast(obj);
                                        }
                                    }
                                    throw new NoSuchFieldError("the Unsafe");
                                }

                                @Override // java.security.PrivilegedExceptionAction
                                public final /* bridge */ /* synthetic */ Unsafe run() {
                                    return LIZ();
                                }
                            });
                        } catch (PrivilegedActionException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
                        }
                    }
                    try {
                        LIZJ = unsafe.objectFieldOffset(AbstractC199488133m.class.getDeclaredField("waiters"));
                        LIZIZ = unsafe.objectFieldOffset(AbstractC199488133m.class.getDeclaredField("listeners"));
                        LIZLLL = unsafe.objectFieldOffset(AbstractC199488133m.class.getDeclaredField("value"));
                        LJ = unsafe.objectFieldOffset(C133Y.class.getDeclaredField("thread"));
                        LJFF = unsafe.objectFieldOffset(C133Y.class.getDeclaredField("next"));
                        LIZ = unsafe;
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        C08KI.LIZIZ(e4);
                        throw new RuntimeException(e4);
                    }
                }

                @Override // X.C133T
                public final void LIZLLL(C133Y c133y, C133Y c133y2) {
                    LIZ.putObject(c133y, LJFF, c133y2);
                }

                @Override // X.C133T
                public final void LJ(C133Y c133y, Thread thread) {
                    LIZ.putObject(c133y, LJ, thread);
                }

                @Override // X.C133T
                public final boolean LIZ(AbstractC199488133m<?> abstractC199488133m, C199495133t c199495133t, C199495133t c199495133t2) {
                    return C133Q.LIZ(LIZ, abstractC199488133m, LIZIZ, c199495133t, c199495133t2);
                }

                @Override // X.C133T
                public final boolean LIZIZ(AbstractC199488133m<?> abstractC199488133m, Object obj, Object obj2) {
                    return C133Q.LIZ(LIZ, abstractC199488133m, LIZLLL, obj, obj2);
                }

                @Override // X.C133T
                public final boolean LIZJ(AbstractC199488133m<?> abstractC199488133m, C133Y c133y, C133Y c133y2) {
                    return C133Q.LIZ(LIZ, abstractC199488133m, LIZJ, c133y, c133y2);
                }
            };
            th = null;
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            try {
                final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(C133Y.class, Thread.class, "thread");
                final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater2 = AtomicReferenceFieldUpdater.newUpdater(C133Y.class, C133Y.class, "next");
                final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater3 = AtomicReferenceFieldUpdater.newUpdater(AbstractC199488133m.class, C133Y.class, "waiters");
                final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater4 = AtomicReferenceFieldUpdater.newUpdater(AbstractC199488133m.class, C199495133t.class, "listeners");
                final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater5 = AtomicReferenceFieldUpdater.newUpdater(AbstractC199488133m.class, Object.class, "value");
                c133t = new C133T(atomicReferenceFieldUpdaterNewUpdater, atomicReferenceFieldUpdaterNewUpdater2, atomicReferenceFieldUpdaterNewUpdater3, atomicReferenceFieldUpdaterNewUpdater4, atomicReferenceFieldUpdaterNewUpdater5) { // from class: X.133f
                    public final AtomicReferenceFieldUpdater<C133Y, Thread> LIZ;
                    public final AtomicReferenceFieldUpdater<C133Y, C133Y> LIZIZ;
                    public final AtomicReferenceFieldUpdater<AbstractC199488133m, C133Y> LIZJ;
                    public final AtomicReferenceFieldUpdater<AbstractC199488133m, C199495133t> LIZLLL;
                    public final AtomicReferenceFieldUpdater<AbstractC199488133m, Object> LJ;

                    @Override // X.C133T
                    public final void LIZLLL(C133Y c133y, C133Y c133y2) {
                        this.LIZIZ.lazySet(c133y, c133y2);
                    }

                    @Override // X.C133T
                    public final void LJ(C133Y c133y, Thread thread) {
                        this.LIZ.lazySet(c133y, thread);
                    }

                    @Override // X.C133T
                    public final boolean LIZ(AbstractC199488133m<?> abstractC199488133m, C199495133t c199495133t, C199495133t c199495133t2) {
                        AtomicReferenceFieldUpdater<AbstractC199488133m, C199495133t> atomicReferenceFieldUpdater = this.LIZLLL;
                        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC199488133m, c199495133t, c199495133t2)) {
                            if (atomicReferenceFieldUpdater.get(abstractC199488133m) != c199495133t) {
                                return false;
                            }
                        }
                        return true;
                    }

                    @Override // X.C133T
                    public final boolean LIZIZ(AbstractC199488133m<?> abstractC199488133m, Object obj, Object obj2) {
                        AtomicReferenceFieldUpdater<AbstractC199488133m, Object> atomicReferenceFieldUpdater = this.LJ;
                        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC199488133m, obj, obj2)) {
                            if (atomicReferenceFieldUpdater.get(abstractC199488133m) != obj) {
                                return false;
                            }
                        }
                        return true;
                    }

                    @Override // X.C133T
                    public final boolean LIZJ(AbstractC199488133m<?> abstractC199488133m, C133Y c133y, C133Y c133y2) {
                        AtomicReferenceFieldUpdater<AbstractC199488133m, C133Y> atomicReferenceFieldUpdater = this.LIZJ;
                        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC199488133m, c133y, c133y2)) {
                            if (atomicReferenceFieldUpdater.get(abstractC199488133m) != c133y) {
                                return false;
                            }
                        }
                        return true;
                    }

                    {
                        this.LIZ = atomicReferenceFieldUpdaterNewUpdater;
                        this.LIZIZ = atomicReferenceFieldUpdaterNewUpdater2;
                        this.LIZJ = atomicReferenceFieldUpdaterNewUpdater3;
                        this.LIZLLL = atomicReferenceFieldUpdaterNewUpdater4;
                        this.LJ = atomicReferenceFieldUpdaterNewUpdater5;
                    }
                };
            } catch (Throwable th3) {
                th = th3;
                TryCatchGuardChecker.doCheck(th);
                c133t = new C133T() { // from class: X.133X
                    @Override // X.C133T
                    public final void LIZLLL(C133Y c133y, C133Y c133y2) {
                        c133y.next = c133y2;
                    }

                    @Override // X.C133T
                    public final void LJ(C133Y c133y, Thread thread) {
                        c133y.thread = thread;
                    }

                    @Override // X.C133T
                    public final boolean LIZ(AbstractC199488133m<?> abstractC199488133m, C199495133t c199495133t, C199495133t c199495133t2) {
                        synchronized (abstractC199488133m) {
                            try {
                                if (abstractC199488133m.listeners == c199495133t) {
                                    abstractC199488133m.listeners = c199495133t2;
                                    return true;
                                }
                                return false;
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                                throw th4;
                            }
                        }
                    }

                    @Override // X.C133T
                    public final boolean LIZIZ(AbstractC199488133m<?> abstractC199488133m, Object obj, Object obj2) {
                        synchronized (abstractC199488133m) {
                            try {
                                if (abstractC199488133m.value == obj) {
                                    abstractC199488133m.value = obj2;
                                    return true;
                                }
                                return false;
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                                throw th4;
                            }
                        }
                    }

                    @Override // X.C133T
                    public final boolean LIZJ(AbstractC199488133m<?> abstractC199488133m, C133Y c133y, C133Y c133y2) {
                        synchronized (abstractC199488133m) {
                            try {
                                if (abstractC199488133m.waiters == c133y) {
                                    abstractC199488133m.waiters = c133y2;
                                    return true;
                                }
                                return false;
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                                throw th4;
                            }
                        }
                    }
                };
            }
        }
        LLILLL = c133t;
        if (th != null) {
            Logger logger = LLILLJJLI;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
        LLILZ = new Object();
    }

    @Override // X.AnonymousClass1343
    public final Throwable LIZ() {
        if (!(this instanceof InterfaceC2176108fn)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof C199500133y) {
            return ((C199500133y) obj).LIZ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String LJIILIIL() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof C199496133u;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof RunnableC199485133j)) & (this.value != null);
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            LIZIZ(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.value;
            if (obj instanceof RunnableC199485133j) {
                sb.append(", setFuture=[");
                ListenableFuture<? extends V> listenableFuture = ((RunnableC199485133j) obj).LLILLJJLI;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (RuntimeException | StackOverflowError e) {
                    TryCatchGuardChecker.doCheck(e);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append(e3.f);
            } else {
                try {
                    string = LJIILIIL();
                    if (C199499133x.LIZ(string)) {
                        string = null;
                    }
                } catch (RuntimeException | StackOverflowError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    String strValueOf = String.valueOf(e2.getClass());
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(strValueOf);
                    string = sb2.toString();
                }
                if (string != null) {
                    sb.append(", info=[");
                    sb.append(string);
                    sb.append(e3.f);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                LIZIZ(sb);
            }
        }
        sb.append(e3.f);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC199485133j))) {
            return (V) LJIIIIZZ(obj2);
        }
        C133Y c133y = this.waiters;
        if (c133y != C133Y.LIZ) {
            C133Y c133y2 = new C133Y();
            do {
                C133T c133t = LLILLL;
                c133t.LIZLLL(c133y2, c133y);
                if (c133t.LIZJ(this, c133y, c133y2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            LJIILJJIL(c133y2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof RunnableC199485133j))));
                    return (V) LJIIIIZZ(obj);
                }
                c133y = this.waiters;
            } while (c133y != C133Y.LIZ);
        }
        Object obj3 = this.value;
        Objects.requireNonNull(obj3);
        return (V) LJIIIIZZ(obj3);
    }

    private void LIZIZ(StringBuilder sb) {
        try {
            Object objLJIIJ = LJIIJ(this);
            sb.append("SUCCESS, result=[");
            LIZLLL(objLJIIJ, sb);
            sb.append(e3.f);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            TryCatchGuardChecker.doCheck(e3);
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(e3.f);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJ(AbstractC199488133m<?> abstractC199488133m) {
        C199495133t c199495133t;
        C199495133t c199495133t2;
        C199495133t c199495133t3 = null;
        while (true) {
            C133Y c133y = abstractC199488133m.waiters;
            if (LLILLL.LIZJ(abstractC199488133m, c133y, C133Y.LIZ)) {
                while (c133y != null) {
                    Thread thread = c133y.thread;
                    if (thread != null) {
                        c133y.thread = null;
                        LockSupport.unpark(thread);
                    }
                    c133y = c133y.next;
                }
                abstractC199488133m.LIZJ();
                do {
                    c199495133t = abstractC199488133m.listeners;
                } while (!LLILLL.LIZ(abstractC199488133m, c199495133t, C199495133t.LIZJ));
                while (true) {
                    c199495133t2 = c199495133t3;
                    c199495133t3 = c199495133t;
                    if (c199495133t == null) {
                        break;
                    }
                    c199495133t = c199495133t.next;
                    c199495133t3.next = c199495133t2;
                }
                while (c199495133t2 != null) {
                    c199495133t3 = c199495133t2.next;
                    Runnable runnable = c199495133t2.LIZ;
                    Objects.requireNonNull(runnable);
                    if (runnable instanceof RunnableC199485133j) {
                        RunnableC199485133j runnableC199485133j = (RunnableC199485133j) runnable;
                        abstractC199488133m = runnableC199485133j.LL;
                        if (abstractC199488133m.value == runnableC199485133j) {
                            if (LLILLL.LIZIZ(abstractC199488133m, runnableC199485133j, LJIIIZ(runnableC199485133j.LLILLJJLI))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = c199495133t2.LIZIZ;
                        Objects.requireNonNull(executor);
                        LJII(runnable, executor);
                    }
                    c199495133t2 = c199495133t3;
                }
                return;
            }
        }
    }

    public static Object LJIIIIZZ(Object obj) throws ExecutionException {
        if (!(obj instanceof C199496133u)) {
            if (!(obj instanceof C199500133y)) {
                if (obj == LLILZ) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C199500133y) obj).LIZ);
        }
        Throwable th = ((C199496133u) obj).LIZIZ;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object LJIIIZ(ListenableFuture<?> listenableFuture) {
        Throwable thLIZ;
        if (listenableFuture instanceof InterfaceC2176108fn) {
            Object c199496133u = ((AbstractC199488133m) listenableFuture).value;
            if (c199496133u instanceof C199496133u) {
                C199496133u c199496133u2 = (C199496133u) c199496133u;
                if (c199496133u2.LIZ) {
                    c199496133u = c199496133u2.LIZIZ != null ? new C199496133u(c199496133u2.LIZIZ, false) : C199496133u.LIZLLL;
                }
            }
            Objects.requireNonNull(c199496133u);
            return c199496133u;
        }
        if ((listenableFuture instanceof AnonymousClass1343) && (thLIZ = ((AnonymousClass1343) listenableFuture).LIZ()) != null) {
            return new C199500133y(thLIZ);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!LL) & zIsCancelled) {
            C199496133u c199496133u3 = C199496133u.LIZLLL;
            Objects.requireNonNull(c199496133u3);
            return c199496133u3;
        }
        try {
            Object objLJIIJ = LJIIJ(listenableFuture);
            if (zIsCancelled) {
                String strValueOf = String.valueOf(listenableFuture);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(strValueOf);
                return new C199496133u(new IllegalArgumentException(sb.toString()), false);
            }
            if (objLJIIJ == null) {
                return LLILZ;
            }
            return objLJIIJ;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            if (!zIsCancelled) {
                String strValueOf2 = String.valueOf(listenableFuture);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 77);
                sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb2.append(strValueOf2);
                return new C199500133y(new IllegalArgumentException(sb2.toString(), e));
            }
            return new C199496133u(e, false);
        } catch (ExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (zIsCancelled) {
                String strValueOf3 = String.valueOf(listenableFuture);
                StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 84);
                sb3.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb3.append(strValueOf3);
                return new C199496133u(new IllegalArgumentException(sb3.toString(), e2), false);
            }
            return new C199500133y(e2.getCause());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new C199500133y(th);
        }
    }

    public static <V> V LJIIJ(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = future.get();
                    break;
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (z) {
                    C786410Ut5.u3().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            C786410Ut5.u3().interrupt();
        }
        return v;
    }

    public final void LJIILJJIL(C133Y c133y) {
        c133y.thread = null;
        while (true) {
            C133Y c133y2 = this.waiters;
            if (c133y2 == C133Y.LIZ) {
                return;
            }
            C133Y c133y3 = null;
            while (c133y2 != null) {
                C133Y c133y4 = c133y2.next;
                if (c133y2.thread != null) {
                    c133y3 = c133y2;
                } else if (c133y3 != null) {
                    c133y3.next = c133y4;
                    if (c133y3.thread == null) {
                        break;
                    }
                } else if (!LLILLL.LIZJ(this, c133y2, c133y4)) {
                    break;
                }
                c133y2 = c133y4;
            }
            return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean LJIIZILJ(V v) {
        if (v == null) {
            v = (V) LLILZ;
        }
        if (LLILLL.LIZIZ(this, null, v)) {
            LJ(this);
            return true;
        }
        return false;
    }

    public boolean LJIJ(Throwable th) {
        th.getClass();
        if (LLILLL.LIZIZ(this, null, new C199500133y(th))) {
            LJ(this);
            return true;
        }
        return false;
    }

    public final boolean LJIJI(ListenableFuture<? extends V> listenableFuture) {
        C199500133y c199500133y;
        listenableFuture.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!LLILLL.LIZIZ(this, null, LJIIIZ(listenableFuture))) {
                    return false;
                }
                LJ(this);
                return true;
            }
            RunnableC199485133j runnableC199485133j = new RunnableC199485133j(this, listenableFuture);
            if (LLILLL.LIZIZ(this, null, runnableC199485133j)) {
                try {
                    listenableFuture.LJIIJJI(runnableC199485133j, EnumC2272608vM.LL);
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        c199500133y = new C199500133y(th);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c199500133y = C199500133y.LIZIZ;
                    }
                    LLILLL.LIZIZ(this, runnableC199485133j, c199500133y);
                    return true;
                }
            }
            obj = this.value;
        }
        if (obj instanceof C199496133u) {
            listenableFuture.cancel(((C199496133u) obj).LIZ);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r4 = r6.value
            r5 = 1
            if (r4 != 0) goto L5b
            r1 = 1
        L6:
            boolean r0 = r4 instanceof X.RunnableC199485133j
            r1 = r1 | r0
            if (r1 == 0) goto L62
            boolean r0 = X.AbstractC199488133m.LL
            if (r0 == 0) goto L50
            X.133u r3 = new X.133u
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Future.cancel() was called."
            r1.<init>(r0)
            r3.<init>(r1, r7)
        L1b:
            r2 = r6
            r1 = 0
        L1d:
            X.133T r0 = X.AbstractC199488133m.LLILLL
            boolean r0 = r0.LIZIZ(r2, r4, r3)
            if (r0 == 0) goto L49
            if (r7 == 0) goto L2a
            r2.LJIIL()
        L2a:
            LJ(r2)
            boolean r0 = r4 instanceof X.RunnableC199485133j
            if (r0 == 0) goto L61
            X.133j r4 = (X.RunnableC199485133j) r4
            com.google.common.util.concurrent.ListenableFuture<? extends V> r2 = r4.LLILLJJLI
            boolean r0 = r2 instanceof X.InterfaceC2176108fn
            if (r0 == 0) goto L5d
            X.133m r2 = (X.AbstractC199488133m) r2
            java.lang.Object r4 = r2.value
            if (r4 != 0) goto L47
            r1 = 1
        L40:
            boolean r0 = r4 instanceof X.RunnableC199485133j
            r1 = r1 | r0
            if (r1 == 0) goto L61
            r1 = 1
            goto L1d
        L47:
            r1 = 0
            goto L40
        L49:
            java.lang.Object r4 = r2.value
            boolean r0 = r4 instanceof X.RunnableC199485133j
            if (r0 != 0) goto L1d
            return r1
        L50:
            if (r7 == 0) goto L58
            X.133u r3 = X.C199496133u.LIZJ
        L54:
            java.util.Objects.requireNonNull(r3)
            goto L1b
        L58:
            X.133u r3 = X.C199496133u.LIZLLL
            goto L54
        L5b:
            r1 = 0
            goto L6
        L5d:
            r2.cancel(r7)
            return r5
        L61:
            return r5
        L62:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC199488133m.cancel(boolean):boolean");
    }

    public static void LJII(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            Logger logger = LLILLJJLI;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    public final void LIZLLL(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append(e3.g);
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void LJIIJJI(Runnable runnable, Executor executor) {
        C199495133t c199495133t;
        C19864312np.LJI(executor, "Executor was null.");
        if (!isDone() && (c199495133t = this.listeners) != C199495133t.LIZJ) {
            C199495133t c199495133t2 = new C199495133t(runnable, executor);
            do {
                c199495133t2.next = c199495133t;
                if (LLILLL.LIZ(this, c199495133t, c199495133t2)) {
                    return;
                } else {
                    c199495133t = this.listeners;
                }
            } while (c199495133t != C199495133t.LIZJ);
        }
        LJII(runnable, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0157 A[PHI: r9
      0x0157: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:58:0x0110, B:67:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(long r17, java.util.concurrent.TimeUnit r19) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC199488133m.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
