package X;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0Wvi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839000Wvi {
    public final AtomicLong LIZ;
    public final AtomicLong LIZIZ;

    public C839000Wvi() {
        AtomicLong atomicLong = new AtomicLong(0L);
        AtomicLong atomicLong2 = new AtomicLong(0L);
        this.LIZ = atomicLong;
        this.LIZIZ = atomicLong2;
    }

    public final Long LIZ() {
        if (this.LIZIZ.get() == 0) {
            return null;
        }
        return Long.valueOf(this.LIZ.get() / this.LIZIZ.get());
    }
}
