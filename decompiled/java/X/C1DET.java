package X;

import X.C1DET;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.1DET, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DET<S extends C1DET<S>> extends C1DES<S> implements InterfaceC2236308pV {
    public static final AtomicIntegerFieldUpdater LLILZ = AtomicIntegerFieldUpdater.newUpdater(C1DET.class, "cleanedAndPointers");
    public final long LLILLL;
    public volatile int cleanedAndPointers;

    public abstract int LJFF();

    public abstract void LJI(int i, CoroutineContext coroutineContext);

    @Override // X.C1DES
    public final boolean LIZJ() {
        return LLILZ.get(this) == LJFF() && LIZIZ() != null;
    }

    public final boolean LJ() {
        return LLILZ.addAndGet(this, -65536) == LJFF() && LIZIZ() != null;
    }

    public final void LJII() {
        if (LLILZ.incrementAndGet(this) == LJFF()) {
            LIZLLL();
        }
    }

    public final boolean LJIIIIZZ() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LLILZ;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == LJFF() && LIZIZ() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public C1DET(long j, S s, int i) {
        super(s);
        this.LLILLL = j;
        this.cleanedAndPointers = i << 16;
    }
}
