package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11EE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11EE<A, B, C, D, E> {
    public final A LIZ;
    public final B LIZIZ;
    public final C LIZJ;
    public final D LIZLLL;
    public final E LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11EE)) {
            return false;
        }
        C11EE c11ee = (C11EE) obj;
        return Intrinsics.LJFF(this.LIZ, c11ee.LIZ) && Intrinsics.LJFF(this.LIZIZ, c11ee.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c11ee.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c11ee.LIZLLL) && Intrinsics.LJFF(this.LJ, c11ee.LJ);
    }

    public C11EE(A a, B b, C c, D d, E e) {
        this.LIZ = a;
        this.LIZIZ = b;
        this.LIZJ = c;
        this.LIZLLL = d;
        this.LJ = e;
    }
}
