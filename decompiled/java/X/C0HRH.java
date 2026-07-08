package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HRH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HRH<E> implements C0HQE {
    public final E LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0HRH) && Intrinsics.LJFF(this.LIZ, ((C0HRH) obj).LIZ);
    }

    public final int hashCode() {
        E e = this.LIZ;
        if (e == null) {
            return 0;
        }
        return e.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HRH(E e) {
        this.LIZ = e;
    }
}
