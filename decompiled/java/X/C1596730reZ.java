package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0reZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596730reZ {
    public final int LIZ;
    public final EnumC1597050rf5 LIZIZ;
    public final String LIZJ;
    public final Map<EnumC1597060rf6, AnonymousClass0060> LIZLLL;
    public final List<AnonymousClass0060> LJ;

    public C1596730reZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1596730reZ)) {
            return false;
        }
        C1596730reZ c1596730reZ = (C1596730reZ) obj;
        return this.LIZ == c1596730reZ.LIZ && this.LIZIZ == c1596730reZ.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1596730reZ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1596730reZ.LIZLLL) && Intrinsics.LJFF(this.LJ, c1596730reZ.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightFetchContext(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", refreshType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bizParamsMap=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fetcherParams=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1596730reZ(int i, EnumC1597050rf5 enumC1597050rf5, String str, List list, int i2) {
        str = (i2 & 4) != 0 ? null : str;
        Map<EnumC1597060rf6, AnonymousClass0060> mapLJ = (i2 & 8) != 0 ? C2097608Jq.LJ() : null;
        list = (i2 & 16) != 0 ? C13BV.INSTANCE : list;
        this.LIZ = i;
        this.LIZIZ = enumC1597050rf5;
        this.LIZJ = str;
        this.LIZLLL = mapLJ;
        this.LJ = list;
    }
}
