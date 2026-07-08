package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DBG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DBG extends C0DBM {
    public final String LIZ = "\n";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DBG) && Intrinsics.LJFF(this.LIZ, ((C0DBG) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AllErrorsJoined(separator=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
