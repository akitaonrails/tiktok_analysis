package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qjb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561410qjb {
    public final String LIZ;
    public final Map<String, String> LIZIZ;

    public C1561410qjb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1561410qjb)) {
            return false;
        }
        C1561410qjb c1561410qjb = (C1561410qjb) obj;
        return Intrinsics.LJFF(this.LIZ, c1561410qjb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1561410qjb.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Map<String, String> map = this.LIZIZ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaContentLynxCardLoadParams(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1561410qjb(String str) {
        this.LIZ = str;
        this.LIZIZ = null;
    }
}
