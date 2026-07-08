package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556380qbU {
    public final boolean LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556380qbU)) {
            return false;
        }
        C1556380qbU c1556380qbU = (C1556380qbU) obj;
        return this.LIZ == c1556380qbU.LIZ && Intrinsics.LJFF(this.LIZIZ, c1556380qbU.LIZIZ) && this.LIZJ == c1556380qbU.LIZJ && this.LIZLLL == c1556380qbU.LIZLLL && this.LJ == c1556380qbU.LJ;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return ((((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsumeDecision(hasCache=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", noCacheReason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isReuseCache=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", detachEntryAfterConsume=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", disposeInvalidCache=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556380qbU(boolean z, String str, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
    }
}
