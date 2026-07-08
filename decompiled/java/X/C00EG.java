package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00EG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00EG {
    public final Map<String, ? extends Object> LIZ;
    public final List<C1809510xBl> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00EG)) {
            return false;
        }
        C00EG c00eg = (C00EG) obj;
        return Intrinsics.LJFF(this.LIZ, c00eg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00eg.LIZIZ);
    }

    public final int hashCode() {
        Map<String, ? extends Object> map = this.LIZ;
        return ((map == null ? 0 : map.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalPropsQueryRule(query=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rules=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00EG() {
        this(null, new ArrayList());
    }

    public C00EG(Map<String, ? extends Object> map, List<C1809510xBl> list) {
        this.LIZ = map;
        this.LIZIZ = list;
    }
}
