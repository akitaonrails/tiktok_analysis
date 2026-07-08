package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700060Rd6 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final Map<String, String> LJ;

    public C700060Rd6() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C700060Rd6)) {
            return false;
        }
        C700060Rd6 c700060Rd6 = (C700060Rd6) obj;
        return Intrinsics.LJFF(this.LIZ, c700060Rd6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c700060Rd6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c700060Rd6.LIZJ) && this.LIZLLL == c700060Rd6.LIZLLL && Intrinsics.LJFF(this.LJ, c700060Rd6.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotCandidate(slotId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", parentSlotId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", componentId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", meta=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C700060Rd6(String str, String str2, String str3) {
        Map<String, String> mapLJ = C2097608Jq.LJ();
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = 0;
        this.LJ = mapLJ;
    }
}
