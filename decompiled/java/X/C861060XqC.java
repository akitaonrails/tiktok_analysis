package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861060XqC {
    public final C861890XrX LIZ;
    public final Long LIZIZ;
    public final Map<C861890XrX, Long> LIZJ;
    public final Map<C861890XrX, Long> LIZLLL;
    public final boolean LJ;

    public C861060XqC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C861060XqC)) {
            return false;
        }
        C861060XqC c861060XqC = (C861060XqC) obj;
        return Intrinsics.LJFF(this.LIZ, c861060XqC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c861060XqC.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c861060XqC.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c861060XqC.LIZLLL) && this.LJ == c861060XqC.LJ;
    }

    public final int hashCode() {
        C861890XrX c861890XrX = this.LIZ;
        int iHashCode = (c861890XrX == null ? 0 : c861890XrX.hashCode()) * 31;
        Long l = this.LIZIZ;
        return ((((((iHashCode + (l != null ? l.hashCode() : 0)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountdownRuntimeState(activeKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", remainingSeconds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastAppliedServerCountdownByKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", countdownAppliedAtElapsedMsByKey=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isPageVisible=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C861060XqC(int i) {
        this(null, null, C2097608Jq.LJ(), C2097608Jq.LJ(), false);
    }

    public C861060XqC(C861890XrX c861890XrX, Long l, Map<C861890XrX, Long> map, Map<C861890XrX, Long> map2, boolean z) {
        this.LIZ = c861890XrX;
        this.LIZIZ = l;
        this.LIZJ = map;
        this.LIZLLL = map2;
        this.LJ = z;
    }

    public static C861060XqC LIZ(C861060XqC c861060XqC, C861890XrX c861890XrX, Long l, Map map, Map map2, boolean z, int i) {
        boolean z2 = z;
        Map map3 = map2;
        Map map4 = map;
        Long l2 = l;
        C861890XrX c861890XrX2 = c861890XrX;
        if ((i & 1) != 0) {
            c861890XrX2 = c861060XqC.LIZ;
        }
        if ((i & 2) != 0) {
            l2 = c861060XqC.LIZIZ;
        }
        if ((i & 4) != 0) {
            map4 = c861060XqC.LIZJ;
        }
        if ((i & 8) != 0) {
            map3 = c861060XqC.LIZLLL;
        }
        if ((i & 16) != 0) {
            z2 = c861060XqC.LJ;
        }
        return new C861060XqC(c861890XrX2, l2, map4, map3, z2);
    }
}
