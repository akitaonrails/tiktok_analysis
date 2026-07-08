package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DCE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DCE implements C0DCR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DCE)) {
            return false;
        }
        C0DCE c0dce = (C0DCE) obj;
        return Intrinsics.LJFF(this.LIZ, c0dce.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0dce.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0dce.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ready(sectionTitle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", emphasisTitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", detailText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DCE(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
