package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152870g6f extends AbstractC1152880g6g {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1152870g6f) && Intrinsics.LJFF(this.LIZ, ((C1152870g6f) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlockUserEvent(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1152870g6f(String str) {
        this.LIZ = str;
    }
}
