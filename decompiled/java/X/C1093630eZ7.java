package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eZ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093630eZ7 {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1093630eZ7)) {
            return false;
        }
        C1093630eZ7 c1093630eZ7 = (C1093630eZ7) obj;
        return Intrinsics.LJFF(this.LIZ, c1093630eZ7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1093630eZ7.LIZIZ) && this.LIZJ == c1093630eZ7.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1093630eZ7.LIZLLL) && Intrinsics.LJFF(this.LJ, c1093630eZ7.LJ) && Intrinsics.LJFF(this.LJFF, c1093630eZ7.LJFF);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZJ) * 31;
        String str3 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionCallActionLog(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strategy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", action_type=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", action_feature_name=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", action_trigger_strategy_name=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", action_trigger_stream_name=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1093630eZ7(String str, String str2, int i, String str3, String str4, String str5, int i2) {
        str3 = (i2 & 8) != 0 ? "" : str3;
        str4 = (i2 & 16) != 0 ? "" : str4;
        str5 = (i2 & 32) != 0 ? "" : str5;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
