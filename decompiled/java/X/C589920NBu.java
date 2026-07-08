package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0NBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589920NBu<T> extends WeakReference<T> {
    public final int hashCode() {
        T t = get();
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public C589920NBu(T t) {
        super(t);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C589920NBu) || get() != ((Reference) obj).get()) {
            return false;
        }
        return true;
    }
}
