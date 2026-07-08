package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11H6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11H6<A, B, C, D> {
    public final A LIZ;
    public final B LIZIZ;
    public final C LIZJ;
    public final D LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11H6)) {
            return false;
        }
        C11H6 c11h6 = (C11H6) obj;
        return Intrinsics.LJFF(this.LIZ, c11h6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c11h6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c11h6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c11h6.LIZLLL);
    }

    public C11H6(A a, B b, C c, D d) {
        this.LIZ = a;
        this.LIZIZ = b;
        this.LIZJ = c;
        this.LIZLLL = d;
    }
}
