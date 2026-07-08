package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777390wLx {
    public final C1785370wYp LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777390wLx) && Intrinsics.LJFF(this.LIZ, ((C1777390wLx) obj).LIZ);
    }

    public final int hashCode() {
        C1785370wYp c1785370wYp = this.LIZ;
        if (c1785370wYp == null) {
            return 0;
        }
        return c1785370wYp.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RankBottomBar(ownerRank=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777390wLx(C1785370wYp c1785370wYp) {
        this.LIZ = c1785370wYp;
    }
}
