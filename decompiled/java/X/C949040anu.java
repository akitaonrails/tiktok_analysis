package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0anu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949040anu<T> {
    public final WeakReference<T> LIZ;

    public final T LIZ() {
        return this.LIZ.get();
    }

    public C949040anu(T t) {
        this.LIZ = new WeakReference<>(t);
    }
}
