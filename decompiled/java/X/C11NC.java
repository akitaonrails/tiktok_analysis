package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11NC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11NC implements C11LR {
    public static final C11NC CANCELLED;
    public static final /* synthetic */ C11NC[] LL;

    @Override // X.C11LR
    public void cancel() {
    }

    @Override // X.C11LR
    public void request(long j) {
    }

    static {
        C11NC c11nc = new C11NC();
        CANCELLED = c11nc;
        LL = new C11NC[]{c11nc};
    }

    public static void reportSubscriptionSet() {
        C19489211Ms.LIZIZ(new C11JB("Subscription already set!"));
    }

    public static C11NC[] values() {
        return (C11NC[]) LL.clone();
    }

    public static boolean cancel(AtomicReference<C11LR> atomicReference) {
        C11LR andSet;
        C11LR c11lr = atomicReference.get();
        C11NC c11nc = CANCELLED;
        if (c11lr != c11nc && (andSet = atomicReference.getAndSet(c11nc)) != c11nc) {
            if (andSet != null) {
                andSet.cancel();
                return true;
            }
            return true;
        }
        return false;
    }

    public static void reportMoreProduced(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("More produced than requested: ");
        sbLIZ.append(j);
        C19489211Ms.LIZIZ(new C11JB(C2188811AlT.LIZIZ(sbLIZ)));
    }

    public static boolean validate(long j) {
        if (j <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("n > 0 required but it was ");
            sbLIZ.append(j);
            C19489211Ms.LIZIZ(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)));
            return false;
        }
        return true;
    }

    public static C11NC valueOf(String str) {
        return (C11NC) C08FF.LIZ(C11NC.class, str);
    }

    public static boolean replace(AtomicReference<C11LR> atomicReference, C11LR c11lr) {
        while (true) {
            C11LR c11lr2 = atomicReference.get();
            if (c11lr2 == CANCELLED) {
                if (c11lr != null) {
                    c11lr.cancel();
                }
                return false;
            }
            while (!atomicReference.compareAndSet(c11lr2, c11lr)) {
                if (atomicReference.get() != c11lr2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean set(AtomicReference<C11LR> atomicReference, C11LR c11lr) {
        while (true) {
            C11LR c11lr2 = atomicReference.get();
            if (c11lr2 == CANCELLED) {
                if (c11lr != null) {
                    c11lr.cancel();
                }
                return false;
            }
            while (!atomicReference.compareAndSet(c11lr2, c11lr)) {
                if (atomicReference.get() != c11lr2) {
                    break;
                }
            }
            if (c11lr2 != null) {
                c11lr2.cancel();
            }
            return true;
        }
    }

    public static boolean setOnce(AtomicReference<C11LR> atomicReference, C11LR c11lr) {
        C1701890uOB.LIZ(c11lr, "s is null");
        while (!atomicReference.compareAndSet(null, c11lr)) {
            if (atomicReference.get() != null) {
                c11lr.cancel();
                if (atomicReference.get() != CANCELLED) {
                    reportSubscriptionSet();
                }
                return false;
            }
        }
        return true;
    }

    public static boolean validate(C11LR c11lr, C11LR c11lr2) {
        if (c11lr2 == null) {
            C19489211Ms.LIZIZ(new NullPointerException("next is null"));
            return false;
        }
        if (c11lr != null) {
            c11lr2.cancel();
            reportSubscriptionSet();
            return false;
        }
        return true;
    }

    public static void deferredRequest(AtomicReference<C11LR> atomicReference, AtomicLong atomicLong, long j) {
        C11LR c11lr = atomicReference.get();
        if (c11lr != null) {
            c11lr.request(j);
            return;
        }
        if (!validate(j)) {
            return;
        }
        C19492311Nx.LIZ(atomicLong, j);
        C11LR c11lr2 = atomicReference.get();
        if (c11lr2 == null) {
            return;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return;
        }
        c11lr2.request(andSet);
    }

    public static boolean deferredSetOnce(AtomicReference<C11LR> atomicReference, AtomicLong atomicLong, C11LR c11lr) {
        if (setOnce(atomicReference, c11lr)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                c11lr.request(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean setOnce(AtomicReference<C11LR> atomicReference, C11LR c11lr, long j) {
        if (setOnce(atomicReference, c11lr)) {
            c11lr.request(j);
            return true;
        }
        return false;
    }
}
