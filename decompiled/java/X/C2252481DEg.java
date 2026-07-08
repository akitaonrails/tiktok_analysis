package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: X.1DEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2252481DEg<E> {
    public static final AtomicReferenceFieldUpdater LIZ = AtomicReferenceFieldUpdater.newUpdater(C2252481DEg.class, Object.class, "_cur");
    public volatile Object _cur = new C2252471DEf(8, false);

    public final void LIZIZ() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZ;
        while (true) {
            C2252471DEf c2252471DEf = (C2252471DEf) atomicReferenceFieldUpdater.get(this);
            if (c2252471DEf.LIZIZ()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LIZ;
            C2252471DEf<E> c2252471DEfLIZJ = c2252471DEf.LIZJ();
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, c2252471DEf, c2252471DEfLIZJ) && atomicReferenceFieldUpdater2.get(this) == c2252471DEf) {
            }
        }
    }

    public final int LIZJ() {
        Object obj = LIZ.get(this);
        obj.getClass();
        long j = C2252471DEf.LJFF.get(obj);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    public final E LIZLLL() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZ;
        while (true) {
            C2252471DEf c2252471DEf = (C2252471DEf) atomicReferenceFieldUpdater.get(this);
            E e = (E) c2252471DEf.LIZLLL();
            if (e != C2252471DEf.LJI) {
                return e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LIZ;
            C2252471DEf<E> c2252471DEfLIZJ = c2252471DEf.LIZJ();
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, c2252471DEf, c2252471DEfLIZJ) && atomicReferenceFieldUpdater2.get(this) == c2252471DEf) {
            }
        }
    }

    public final boolean LIZ(E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZ;
        while (true) {
            C2252471DEf c2252471DEf = (C2252471DEf) atomicReferenceFieldUpdater.get(this);
            int iLIZ = c2252471DEf.LIZ(e);
            if (iLIZ == 0) {
                return true;
            }
            if (iLIZ != 1) {
                if (iLIZ == 2) {
                    return false;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LIZ;
                C2252471DEf<E> c2252471DEfLIZJ = c2252471DEf.LIZJ();
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, c2252471DEf, c2252471DEfLIZJ) && atomicReferenceFieldUpdater2.get(this) == c2252471DEf) {
                }
            }
        }
    }
}
