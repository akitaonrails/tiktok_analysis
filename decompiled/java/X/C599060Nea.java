package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599060Nea extends AbstractC598980NeS {
    public final Map<String, Object> LIZ;
    public final Map<String, Object> LIZIZ;

    public C599060Nea() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C599060Nea)) {
            return false;
        }
        C599060Nea c599060Nea = (C599060Nea) obj;
        return Intrinsics.LJFF(this.LIZ, c599060Nea.LIZ) && Intrinsics.LJFF(this.LIZIZ, c599060Nea.LIZIZ);
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

    public C599060Nea(Map map, int i) {
        this.LIZ = (i & 1) != 0 ? null : map;
        this.LIZIZ = null;
    }
}
