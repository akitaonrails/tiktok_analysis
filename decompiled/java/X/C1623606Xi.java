package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1623606Xi<T> extends AbstractC1623806Xk<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1623606Xi) && Intrinsics.LJFF(this.LIZ, ((C1623606Xi) obj).LIZ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1623806Xk
    public final T LIZ() {
        return this.LIZ;
    }

    public C1623606Xi(T t) {
        this.LIZ = t;
    }
}
