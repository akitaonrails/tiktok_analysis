package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.1BPD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BPD<T> {
    public final AtomicReference<InterfaceC1530550pvp<T>> LIZ = new AtomicReference<>();
    public final ConcurrentLinkedQueue<T> LIZIZ = new ConcurrentLinkedQueue<>();
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public volatile boolean LIZLLL = false;

    public final void LIZIZ() {
        if (this.LIZ.get() != null && this.LIZJ.compareAndSet(false, true)) {
            while (!this.LIZIZ.isEmpty()) {
                T tPoll = this.LIZIZ.poll();
                if (tPoll != null) {
                    this.LIZ.get().accept(tPoll);
                }
            }
            this.LIZJ.set(false);
        }
    }

    public final void LIZ(T t) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZIZ.offer(t);
        LIZIZ();
    }

    public final void LIZJ(InterfaceC1530550pvp<T> interfaceC1530550pvp) {
        if (this.LIZLLL) {
            return;
        }
        AtomicReference<InterfaceC1530550pvp<T>> atomicReference = this.LIZ;
        while (!atomicReference.compareAndSet(null, interfaceC1530550pvp) && atomicReference.get() == null) {
        }
        LIZIZ();
    }
}
