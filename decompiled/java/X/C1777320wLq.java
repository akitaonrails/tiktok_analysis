package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777320wLq extends AbstractC1777330wLr {
    public final String LIZ;
    public final String LIZIZ;
    public final C1808830xAf LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777320wLq)) {
            return false;
        }
        C1777320wLq c1777320wLq = (C1777320wLq) obj;
        return Intrinsics.LJFF(this.LIZ, c1777320wLq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1777320wLq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1777320wLq.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C1808830xAf c1808830xAf = this.LIZJ;
        return iHashCode2 + (c1808830xAf != null ? c1808830xAf.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportAutoPostDeleteConfirm(actionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", item=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777320wLq(String str, String str2, C1808830xAf c1808830xAf) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c1808830xAf;
    }
}
