package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TBC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TBC implements C0TBE {
    public final String LIZ;

    public C0TBC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0TBC) && Intrinsics.LJFF(this.LIZ, ((C0TBC) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ready(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0TBC(int i) {
        this.LIZ = "ready";
    }
}
