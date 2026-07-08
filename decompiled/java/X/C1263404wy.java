package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1263404wy {
    public final boolean LIZ = true;
    public final boolean LIZIZ;
    public final Map<String, Object> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1263404wy)) {
            return false;
        }
        C1263404wy c1263404wy = (C1263404wy) obj;
        return this.LIZ == c1263404wy.LIZ && this.LIZIZ == c1263404wy.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1263404wy.LIZJ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        Map<String, Object> map = this.LIZJ;
        return iZ2 + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheStrategy(needCache=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needPreload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hitMobParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1263404wy(boolean z, Map map) {
        this.LIZIZ = z;
        this.LIZJ = map;
    }
}
