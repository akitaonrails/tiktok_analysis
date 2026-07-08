package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557140qci extends AbstractC1557160qck {
    public final C1562930qm3 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1557140qci) && Intrinsics.LJFF(this.LIZ, ((C1557140qci) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Variable(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557140qci(C1562930qm3 c1562930qm3) {
        this.LIZ = c1562930qm3;
    }
}
