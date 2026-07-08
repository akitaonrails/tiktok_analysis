package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0scq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634100scq<A, B, C> {
    public final A LIZ;
    public final B LIZIZ;
    public final C LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1634100scq)) {
            return false;
        }
        C1634100scq c1634100scq = (C1634100scq) obj;
        return Intrinsics.LJFF(this.LIZ, c1634100scq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1634100scq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1634100scq.LIZJ);
    }

    public C1634100scq(A a, B b, C c) {
        this.LIZ = a;
        this.LIZIZ = b;
        this.LIZJ = c;
    }
}
