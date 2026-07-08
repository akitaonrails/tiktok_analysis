package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11EF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11EF<A, B> {
    public final A LIZ;
    public final B LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11EF)) {
            return false;
        }
        C11EF c11ef = (C11EF) obj;
        return Intrinsics.LJFF(this.LIZ, c11ef.LIZ) && Intrinsics.LJFF(this.LIZIZ, c11ef.LIZIZ);
    }

    public C11EF(A a, B b) {
        this.LIZ = a;
        this.LIZIZ = b;
    }
}
