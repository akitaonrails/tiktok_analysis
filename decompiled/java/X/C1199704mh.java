package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04mh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1199704mh {
    public final String LIZ;
    public final Map<String, Object> LIZIZ;

    public C1199704mh() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1199704mh)) {
            return false;
        }
        C1199704mh c1199704mh = (C1199704mh) obj;
        return Intrinsics.LJFF(this.LIZ, c1199704mh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1199704mh.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, Object> map = this.LIZIZ;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpCheckerTraceInfo(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", info=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1199704mh(String str, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
