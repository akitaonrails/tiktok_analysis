package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11H7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11H7<A, B, C> {
    public final A LIZ;
    public final B LIZIZ;
    public final C LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11H7)) {
            return false;
        }
        C11H7 c11h7 = (C11H7) obj;
        return Intrinsics.LJFF(this.LIZ, c11h7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c11h7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c11h7.LIZJ);
    }

    public C11H7(A a, B b, C c) {
        this.LIZ = a;
        this.LIZIZ = b;
        this.LIZJ = c;
    }
}
