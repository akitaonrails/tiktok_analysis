package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: X.1DEY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DEY {
    public static final AtomicReferenceFieldUpdater LIZIZ = AtomicReferenceFieldUpdater.newUpdater(C1DEY.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater LIZJ = AtomicIntegerFieldUpdater.newUpdater(C1DEY.class, "producerIndex");
    public static final AtomicIntegerFieldUpdater LIZLLL = AtomicIntegerFieldUpdater.newUpdater(C1DEY.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater LJ = AtomicIntegerFieldUpdater.newUpdater(C1DEY.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray<C1DDP> LIZ = new AtomicReferenceArray<>(128);
    public volatile int blockingTasksInBuffer;
    public volatile int consumerIndex;
    public volatile Object lastScheduledTask;
    public volatile int producerIndex;

    public final C1DDP LIZIZ() {
        C1DDP andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LIZLLL;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - LIZJ.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.LIZ.getAndSet(i2, null)) != null) {
                if (andSet.LLILLJJLI.LIZ() == 1) {
                    LJ.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final C1DDP LIZ(C1DDP c1ddp) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LIZJ;
        if (atomicIntegerFieldUpdater.get(this) - LIZLLL.get(this) == 127) {
            return c1ddp;
        }
        if (c1ddp.LLILLJJLI.LIZ() == 1) {
            LJ.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (this.LIZ.get(i) != null) {
            Thread.yield();
        }
        this.LIZ.lazySet(i, c1ddp);
        LIZJ.incrementAndGet(this);
        return null;
    }

    public final C1DDP LIZJ(int i, boolean z) {
        boolean z2;
        int i2 = i & 127;
        C1DDP c1ddp = this.LIZ.get(i2);
        if (c1ddp != null) {
            if (c1ddp.LLILLJJLI.LIZ() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 == z) {
                AtomicReferenceArray<C1DDP> atomicReferenceArray = this.LIZ;
                while (!atomicReferenceArray.compareAndSet(i2, c1ddp, null)) {
                    if (atomicReferenceArray.get(i2) != c1ddp) {
                    }
                }
                if (z) {
                    LJ.decrementAndGet(this);
                }
                return c1ddp;
            }
        }
        return null;
    }
}
