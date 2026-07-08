package X;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0UWA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UWA {
    public final AtomicLong LIZ;

    public final long LIZ() {
        return this.LIZ.get();
    }

    public C0UWA(long j) {
        this.LIZ = new AtomicLong(j);
    }

    public final void LIZIZ(long j) {
        this.LIZ.set(j);
    }
}
