package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.07xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2032207xg<T> extends WeakReference<T> {
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public C2032207xg(T t) {
        int iHashCode;
        super(t);
        if (t != null) {
            iHashCode = t.hashCode();
        } else {
            iHashCode = 0;
        }
        this.LIZ = iHashCode;
    }

    public final boolean equals(Object obj) {
        T t;
        if (!(obj instanceof C2032207xg) || (t = get()) == null) {
            return false;
        }
        return t.equals(((Reference) obj).get());
    }
}
