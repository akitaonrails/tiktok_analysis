package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IB0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IB0 {
    public final C06XP LIZ;
    public final C0ZOV LIZIZ;
    public final Map<C14IR, C461020I6a<? extends Object>> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IB0)) {
            return false;
        }
        C0IB0 c0ib0 = (C0IB0) obj;
        return Intrinsics.LJFF(this.LIZ, c0ib0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ib0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ib0.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseSkeletonData(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", skeletonLayoutPowerCellData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", slotsData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0IB0(C06XP c06xp, C0ZOV c0zov, Map<C14IR, ? extends C461020I6a<? extends Object>> map) {
        this.LIZ = c06xp;
        this.LIZIZ = c0zov;
        this.LIZJ = map;
    }

    public static C0IB0 LIZ(C0IB0 c0ib0, C0ZOV c0zov, Map map, int i) {
        C06XP c06xp;
        if ((i & 1) != 0) {
            c06xp = c0ib0.LIZ;
        } else {
            c06xp = null;
        }
        if ((i & 2) != 0) {
            c0zov = c0ib0.LIZIZ;
        }
        if ((i & 4) != 0) {
            map = c0ib0.LIZJ;
        }
        c0ib0.getClass();
        return new C0IB0(c06xp, c0zov, map);
    }
}
