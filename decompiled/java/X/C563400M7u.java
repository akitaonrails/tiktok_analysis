package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0M7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563400M7u {
    public final AtomicInteger LIZ;

    public final int LIZIZ() {
        return this.LIZ.decrementAndGet();
    }

    public final int LIZJ() {
        return this.LIZ.get();
    }

    public final int LIZLLL() {
        return this.LIZ.incrementAndGet();
    }

    public C563400M7u(int i) {
        this.LIZ = new AtomicInteger(i);
    }

    public final void LJ(int i) {
        this.LIZ.set(i);
    }

    public final boolean LIZ(int i, int i2) {
        return this.LIZ.compareAndSet(i, i2);
    }
}
