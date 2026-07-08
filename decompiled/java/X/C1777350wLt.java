package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777350wLt extends AbstractC1777330wLr {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777350wLt)) {
            return false;
        }
        C1777350wLt c1777350wLt = (C1777350wLt) obj;
        return Intrinsics.LJFF(this.LIZ, c1777350wLt.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1777350wLt.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportAutoPostConfirmClick(actionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777350wLt(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
