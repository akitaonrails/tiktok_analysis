package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3V, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I3V<T> implements C0I4Y<T> {
    public final T LIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Show(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C0I3V(T t) {
        this.LIZ = t;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0I3V)) {
            return super.equals(obj);
        }
        return Intrinsics.LJFF(this.LIZ, ((C0I3V) obj).LIZ);
    }
}
