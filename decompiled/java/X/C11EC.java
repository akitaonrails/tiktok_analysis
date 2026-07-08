package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11EC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11EC<A> {
    public final A LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11EC) && Intrinsics.LJFF(this.LIZ, ((C11EC) obj).LIZ);
    }

    public C11EC(A a) {
        this.LIZ = a;
    }
}
