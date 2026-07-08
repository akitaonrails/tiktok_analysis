package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777310wLp extends AbstractC1777330wLr {
    public final C1808830xAf LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777310wLp)) {
            return false;
        }
        C1777310wLp c1777310wLp = (C1777310wLp) obj;
        return Intrinsics.LJFF(this.LIZ, c1777310wLp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1777310wLp.LIZIZ);
    }

    public final int hashCode() {
        C1808830xAf c1808830xAf = this.LIZ;
        int iHashCode = (c1808830xAf == null ? 0 : c1808830xAf.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportPanelClick(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777310wLp(C1808830xAf c1808830xAf, String str) {
        this.LIZ = c1808830xAf;
        this.LIZIZ = str;
    }
}
