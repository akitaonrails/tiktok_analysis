package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599740rjQ extends AbstractC1599750rjR {
    public final C1599710rjN LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1599740rjQ) && Intrinsics.LJFF(this.LIZ, ((C1599740rjQ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Single(slot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1599740rjQ(C1599710rjN c1599710rjN) {
        this.LIZ = c1599710rjN;
    }
}
