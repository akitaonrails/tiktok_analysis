package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YUZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YUZ extends AbstractC875030YUj {
    public final AbstractC874970YUd LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YUZ) && Intrinsics.LJFF(this.LIZ, ((C0YUZ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YUZ(C874990YUf c874990YUf) {
        this.LIZ = c874990YUf;
    }
}
