package X;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158310gFR {
    public final Map<EnumC1597060rf6, List<InterfaceC1891350zJl>> LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final Map<EnumC1597060rf6, Map<String, Object>> LIZLLL;
    public final Set<EnumC1597060rf6> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158310gFR)) {
            return false;
        }
        C1158310gFR c1158310gFR = (C1158310gFR) obj;
        return Intrinsics.LJFF(this.LIZ, c1158310gFR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1158310gFR.LIZIZ) && this.LIZJ == c1158310gFR.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1158310gFR.LIZLLL) && Intrinsics.LJFF(this.LJ, c1158310gFR.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetcherExecuteResult(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nextPageCursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", metaByBiz=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", replaceBizTypes=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1158310gFR(Map<EnumC1597060rf6, ? extends List<? extends InterfaceC1891350zJl>> map, String str, boolean z, Map<EnumC1597060rf6, ? extends Map<String, ? extends Object>> map2, Set<? extends EnumC1597060rf6> set) {
        this.LIZ = map;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = map2;
        this.LJ = set;
    }
}
