package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155370gAh {
    public final Map<Integer, Integer> LIZ;
    public final Map<Integer, List<C1779500wPM>> LIZIZ;
    public final boolean LIZJ;

    public C1155370gAh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155370gAh)) {
            return false;
        }
        C1155370gAh c1155370gAh = (C1155370gAh) obj;
        return Intrinsics.LJFF(this.LIZ, c1155370gAh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1155370gAh.LIZIZ) && this.LIZJ == c1155370gAh.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabMetaRuntimeState(lastSelectedSubRankTypeByFirstRankType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cachedSubTabsByFirstRankType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isInitialAnchorHandled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1155370gAh(int i) {
        this(false, C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public C1155370gAh(boolean z, Map map, Map map2) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = z;
    }
}
