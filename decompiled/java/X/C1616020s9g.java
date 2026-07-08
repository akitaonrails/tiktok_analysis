package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616020s9g {
    public final EnumC1616060s9k LIZ;
    public final C1604000rqI LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public C09AE LJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1616020s9g)) {
            return false;
        }
        C1616020s9g c1616020s9g = (C1616020s9g) obj;
        return this.LIZ == c1616020s9g.LIZ && Intrinsics.LJFF(this.LIZIZ, c1616020s9g.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1616020s9g.LIZJ) && this.LIZLLL == c1616020s9g.LIZLLL && Intrinsics.LJFF(this.LJ, c1616020s9g.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        C09AE c09ae = this.LJ;
        return iHashCode2 + (c09ae != null ? c09ae.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeferredEvent(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pageId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", releasable=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", timeoutJob=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1616020s9g(EnumC1616060s9k enumC1616060s9k, C1604000rqI c1604000rqI, String str, boolean z) {
        this.LIZ = enumC1616060s9k;
        this.LIZIZ = c1604000rqI;
        this.LIZJ = str;
        this.LIZLLL = z;
    }
}
