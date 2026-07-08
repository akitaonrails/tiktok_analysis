package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xsa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C862540Xsa {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;

    public C862540Xsa() {
        this(null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C862540Xsa)) {
            return false;
        }
        C862540Xsa c862540Xsa = (C862540Xsa) obj;
        return Intrinsics.LJFF(this.LIZ, c862540Xsa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c862540Xsa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c862540Xsa.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c862540Xsa.LIZLLL);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateMemberInfoInput(role=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", alias=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bizRole=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bizExt=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C862540Xsa(Integer num, Map map, int i) {
        num = (i & 1) != 0 ? null : num;
        map = (i & 8) != 0 ? C2097608Jq.LJ() : map;
        this.LIZ = num;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = map;
    }
}
