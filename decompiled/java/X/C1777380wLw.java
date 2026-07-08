package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777380wLw implements InterfaceC1785520wZ4 {
    public final int LIZ;
    public final C1785370wYp LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777380wLw)) {
            return false;
        }
        C1777380wLw c1777380wLw = (C1777380wLw) obj;
        return this.LIZ == c1777380wLw.LIZ && Intrinsics.LJFF(this.LIZIZ, c1777380wLw.LIZIZ) && this.LIZJ == c1777380wLw.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RankItemClicked(rankType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", item=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isCreator=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777380wLw(int i, C1785370wYp c1785370wYp, boolean z) {
        this.LIZ = i;
        this.LIZIZ = c1785370wYp;
        this.LIZJ = z;
    }
}
