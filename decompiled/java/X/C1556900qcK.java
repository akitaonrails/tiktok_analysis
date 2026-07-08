package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556900qcK extends AbstractC1556910qcL {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556900qcK)) {
            return false;
        }
        C1556900qcK c1556900qcK = (C1556900qcK) obj;
        return Intrinsics.LJFF(this.LIZ, c1556900qcK.LIZ) && this.LIZIZ == c1556900qcK.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Rejected(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exitCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556900qcK(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
