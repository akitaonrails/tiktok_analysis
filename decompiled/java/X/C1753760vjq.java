package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753760vjq<V, R> {
    public final V LIZ;
    public final R LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1753760vjq)) {
            return false;
        }
        C1753760vjq c1753760vjq = (C1753760vjq) obj;
        return Intrinsics.LJFF(this.LIZ, c1753760vjq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1753760vjq.LIZIZ);
    }

    public C1753760vjq(V v, R r) {
        this.LIZ = v;
        this.LIZIZ = r;
    }
}
