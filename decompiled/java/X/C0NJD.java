package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0NJD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NJD<V> {
    public final AtomicReference<V> LIZ;

    public final V LIZ() {
        return this.LIZ.get();
    }

    public C0NJD(V v) {
        this.LIZ = new AtomicReference<>(v);
    }

    public final void LIZIZ(V v) {
        this.LIZ.set(v);
    }
}
