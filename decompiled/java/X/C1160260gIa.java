package X;

import X.InterfaceC1891350zJl;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160260gIa<T extends InterfaceC1891350zJl> {
    public final List<T> LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final Map<String, Object> LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1160260gIa)) {
            return false;
        }
        C1160260gIa c1160260gIa = (C1160260gIa) obj;
        return Intrinsics.LJFF(this.LIZ, c1160260gIa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1160260gIa.LIZIZ) && this.LIZJ == c1160260gIa.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1160260gIa.LIZLLL) && this.LJ == c1160260gIa.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightFetchResult(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", metadata=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", replacePreviousRawData=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1160260gIa(int i, String str, List list, Map map, boolean z, boolean z2) {
        str = (i & 2) != 0 ? null : str;
        z = (i & 4) != 0 ? false : z;
        map = (i & 8) != 0 ? C2097608Jq.LJ() : map;
        z2 = (i & 16) != 0 ? false : z2;
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = map;
        this.LJ = z2;
    }
}
