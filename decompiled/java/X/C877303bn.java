package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C877303bn {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final Map<String, Object> LIZLLL;
    public final Integer LJ;
    public final Boolean LJFF;

    public C877303bn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C877303bn)) {
            return false;
        }
        C877303bn c877303bn = (C877303bn) obj;
        return Intrinsics.LJFF(this.LIZ, c877303bn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c877303bn.LIZIZ) && this.LIZJ == c877303bn.LIZJ && Intrinsics.LJFF(this.LIZLLL, c877303bn.LIZLLL) && Intrinsics.LJFF(this.LJ, c877303bn.LJ) && Intrinsics.LJFF(this.LJFF, c877303bn.LJFF);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31;
        Integer num = this.LJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LJFF;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackupPaymentTrackContext(currentPage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entranceInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFullscreen=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trackParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isAuto=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", backupEnabled=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C877303bn(String str, String str2, Map map, Integer num, Boolean bool, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        map = (i & 8) != 0 ? C2097608Jq.LJ() : map;
        num = (i & 16) != 0 ? null : num;
        bool = (i & 32) != 0 ? null : bool;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = 0;
        this.LIZLLL = map;
        this.LJ = num;
        this.LJFF = bool;
    }
}
