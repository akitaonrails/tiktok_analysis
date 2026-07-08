package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05pF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1470305pF extends AbstractC1470205pE {
    public final Map<String, Object> LIZ;
    public final Map<String, Object> LIZIZ;

    public C1470305pF() {
        this((Map) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1470305pF)) {
            return false;
        }
        C1470305pF c1470305pF = (C1470305pF) obj;
        return Intrinsics.LJFF(this.LIZ, c1470305pF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1470305pF.LIZIZ);
    }

    public final int hashCode() {
        Map<String, Object> map = this.LIZ;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, Object> map2 = this.LIZIZ;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1470305pF(Map map, int i) {
        this((Map<String, ? extends Object>) ((i & 1) != 0 ? null : map), (Map<String, ? extends Object>) null);
    }

    public C1470305pF(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this.LIZ = map;
        this.LIZIZ = map2;
    }
}
