package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wS0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781140wS0 {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, Map<String, Object>> LIZLLL;
    public final Map<String, Object> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781140wS0)) {
            return false;
        }
        C1781140wS0 c1781140wS0 = (C1781140wS0) obj;
        return this.LIZ == c1781140wS0.LIZ && Intrinsics.LJFF(this.LIZIZ, c1781140wS0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1781140wS0.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1781140wS0.LIZLLL) && Intrinsics.LJFF(this.LJ, c1781140wS0.LJ);
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        Map<String, Object> map = this.LJ;
        return iY2 + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SnapshotEvent(timestamp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pageName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pageState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", resources=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1781140wS0(long j, String str, String str2, Map<String, ? extends Map<String, ? extends Object>> map, Map<String, ? extends Object> map2) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = map;
        this.LJ = map2;
    }
}
