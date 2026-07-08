package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YPZ implements InterfaceC873770YPn {
    public final C0YPQ LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YPZ) && Intrinsics.LJFF(this.LIZ, ((C0YPZ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Abort(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YPZ(C0YPQ c0ypq) {
        this.LIZ = c0ypq;
    }
}
