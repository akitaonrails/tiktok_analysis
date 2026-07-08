package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eZ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093610eZ5 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1093610eZ5)) {
            return false;
        }
        C1093610eZ5 c1093610eZ5 = (C1093610eZ5) obj;
        return Intrinsics.LJFF(this.LIZ, c1093610eZ5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1093610eZ5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1093610eZ5.LIZJ) && this.LIZLLL == c1093610eZ5.LIZLLL && Intrinsics.LJFF(this.LJ, c1093610eZ5.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LIZLLL) * 31;
        String str4 = this.LJ;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyRunLog(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strategy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stream_event_name=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", strategy_status=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1093610eZ5(String str, String str2, String str3) {
        this(str, str2, str3, 0, "");
    }

    public C1093610eZ5(String str, String str2, String str3, int i, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = str4;
    }
}
