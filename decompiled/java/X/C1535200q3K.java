package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0q3K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535200q3K<T> {
    public final AtomicReference<T> LIZ;

    public final boolean LIZ() {
        return this.LIZ.getAndSet(null) != null;
    }

    public C1535200q3K(T t) {
        this.LIZ = new AtomicReference<>(t);
    }
}
