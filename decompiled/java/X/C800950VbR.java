package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0VbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800950VbR {
    public final AtomicLong LIZ;
    public final AtomicInteger LIZIZ;

    public C800950VbR() {
        AtomicLong atomicLong = new AtomicLong();
        AtomicInteger atomicInteger = new AtomicInteger();
        this.LIZ = atomicLong;
        this.LIZIZ = atomicInteger;
    }

    public final void LIZ(long j) {
        this.LIZ.addAndGet(j);
        this.LIZIZ.incrementAndGet();
    }
}
