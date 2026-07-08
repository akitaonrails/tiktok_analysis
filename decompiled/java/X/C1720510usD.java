package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0usD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720510usD {
    public final Map<String, Object> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Map<String, Object> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1720510usD)) {
            return false;
        }
        C1720510usD c1720510usD = (C1720510usD) obj;
        return Intrinsics.LJFF(this.LIZ, c1720510usD.LIZ) && this.LIZIZ == c1720510usD.LIZIZ && this.LIZJ == c1720510usD.LIZJ && this.LIZLLL == c1720510usD.LIZLLL && Intrinsics.LJFF(this.LJ, c1720510usD.LJ);
    }

    public final int hashCode() {
        Map<String, Object> map = this.LIZ;
        int iHashCode = (((((((map == null ? 0 : map.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Map<String, Object> map2 = this.LJ;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public C1720510usD(Map<String, ? extends Object> map, boolean z, boolean z2, boolean z3, Map<String, ? extends Object> map2) {
        this.LIZ = map;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = map2;
    }
}
