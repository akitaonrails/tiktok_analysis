package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11H9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11H9<A> {
    public final A LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11H9) && Intrinsics.LJFF(this.LIZ, ((C11H9) obj).LIZ);
    }

    public C11H9(A a) {
        this.LIZ = a;
    }
}
