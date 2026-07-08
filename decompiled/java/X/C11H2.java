package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11H2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11H2<A, B, C, D, E> {
    public final A LIZ;
    public final B LIZIZ;
    public final C LIZJ;
    public final D LIZLLL;
    public final E LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11H2)) {
            return false;
        }
        C11H2 c11h2 = (C11H2) obj;
        return Intrinsics.LJFF(this.LIZ, c11h2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c11h2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c11h2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c11h2.LIZLLL) && Intrinsics.LJFF(this.LJ, c11h2.LJ);
    }

    public C11H2(A a, B b, C c, D d, E e) {
        this.LIZ = a;
        this.LIZIZ = b;
        this.LIZJ = c;
        this.LIZLLL = d;
        this.LJ = e;
    }
}
