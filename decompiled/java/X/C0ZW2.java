package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZW2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZW2<T> {
    public final Object LIZ;
    public final T LIZIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0ZW2)) {
            return false;
        }
        return Intrinsics.LJFF(this.LIZ, ((C0ZW2) obj).LIZ);
    }

    public C0ZW2(Object obj, T t) {
        this.LIZ = obj;
        this.LIZIZ = t;
    }
}
