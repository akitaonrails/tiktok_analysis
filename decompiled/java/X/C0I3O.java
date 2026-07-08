package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3O, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I3O<T> implements C0I3K<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0I3O) && Intrinsics.LJFF(this.LIZ, ((C0I3O) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Intercepted(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I3O(T t) {
        this.LIZ = t;
    }
}
