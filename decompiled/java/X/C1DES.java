package X;

import X.C1DES;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: X.1DES, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DES<N extends C1DES<N>> {
    public static final AtomicReferenceFieldUpdater LL = AtomicReferenceFieldUpdater.newUpdater(C1DES.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater LLILLJJLI = AtomicReferenceFieldUpdater.newUpdater(C1DES.class, Object.class, "_prev");
    public volatile Object _next;
    public volatile Object _prev;

    public abstract boolean LIZJ();

    public final void LIZ() {
        LLILLJJLI.lazySet(this, null);
    }

    public final N LIZIZ() {
        Object obj = LL.get(this);
        if (obj == C1DEO.LIZ) {
            return null;
        }
        return (N) obj;
    }

    public final void LIZLLL() {
        C1DES c1desLIZIZ;
        if (LIZIZ() == null) {
            return;
        }
        while (true) {
            C1DES c1des = (C1DES) LLILLJJLI.get(this);
            while (c1des != null && c1des.LIZJ()) {
                c1des = (C1DES) LLILLJJLI.get(c1des);
            }
            C1DES c1desLIZIZ2 = LIZIZ();
            while (c1desLIZIZ2.LIZJ() && (c1desLIZIZ = c1desLIZIZ2.LIZIZ()) != null) {
                c1desLIZIZ2 = c1desLIZIZ;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLILLJJLI;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c1desLIZIZ2);
                C1DES c1des2 = obj == null ? null : c1des;
                while (!atomicReferenceFieldUpdater.compareAndSet(c1desLIZIZ2, obj, c1des2)) {
                    if (atomicReferenceFieldUpdater.get(c1desLIZIZ2) != obj) {
                        break;
                    }
                }
            }
            if (c1des != null) {
                LL.set(c1des, c1desLIZIZ2);
            }
            if (!c1desLIZIZ2.LIZJ() || c1desLIZIZ2.LIZIZ() == null) {
                if (c1des == null || !c1des.LIZJ()) {
                    return;
                }
            }
        }
    }

    public C1DES(N n) {
        this._prev = n;
    }
}
