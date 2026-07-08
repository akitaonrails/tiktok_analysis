package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588670N6z {
    public final List<String> LIZ;
    public final String LIZIZ;

    public C588670N6z() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C588670N6z)) {
            return false;
        }
        C588670N6z c588670N6z = (C588670N6z) obj;
        return Intrinsics.LJFF(this.LIZ, c588670N6z.LIZ) && Intrinsics.LJFF(this.LIZIZ, c588670N6z.LIZIZ);
    }

    public final int hashCode() {
        List<String> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExecuteStrategyRequest(timingKeys=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C588670N6z(List<String> list, String str) {
        this.LIZ = list;
        this.LIZIZ = str;
    }
}
