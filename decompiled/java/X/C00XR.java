package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00XR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00XR {
    public final Boolean LIZ;

    public C00XR() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00XR) && Intrinsics.LJFF(this.LIZ, ((C00XR) obj).LIZ);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SnapshotCreatorParams(aiHintVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00XR(Boolean bool) {
        this.LIZ = bool;
    }
}
