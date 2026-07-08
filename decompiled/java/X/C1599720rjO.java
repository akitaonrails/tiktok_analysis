package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599720rjO extends AbstractC1599750rjR {
    public final C1599710rjN LIZ;
    public final C1599710rjN LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1599720rjO)) {
            return false;
        }
        C1599720rjO c1599720rjO = (C1599720rjO) obj;
        return Intrinsics.LJFF(this.LIZ, c1599720rjO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1599720rjO.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Double(first=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", second=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1599720rjO(C1599710rjN c1599710rjN, C1599710rjN c1599710rjN2) {
        this.LIZ = c1599710rjN;
        this.LIZIZ = c1599710rjN2;
    }
}
