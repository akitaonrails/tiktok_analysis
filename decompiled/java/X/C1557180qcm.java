package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557180qcm extends AbstractC1557160qck {
    public final C1562930qm3 LIZ;
    public final AbstractC1557160qck LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557180qcm)) {
            return false;
        }
        C1557180qcm c1557180qcm = (C1557180qcm) obj;
        return Intrinsics.LJFF(this.LIZ, c1557180qcm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1557180qcm.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unary(op=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", right=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557180qcm(C1562930qm3 c1562930qm3, AbstractC1557160qck abstractC1557160qck) {
        this.LIZ = c1562930qm3;
        this.LIZIZ = abstractC1557160qck;
    }
}
