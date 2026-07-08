package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rhk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702940Rhk {
    public final long LIZ;
    public final Map<String, C703070Rhx> LIZIZ;
    public final C700400Rde LIZJ;
    public final Map<String, String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C702940Rhk)) {
            return false;
        }
        C702940Rhk c702940Rhk = (C702940Rhk) obj;
        return this.LIZ == c702940Rhk.LIZ && Intrinsics.LJFF(this.LIZIZ, c702940Rhk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c702940Rhk.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c702940Rhk.LIZLLL);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotStrategySnapshot(version=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", slotStates=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", slotTree=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", latestTimingBySlot=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C702940Rhk(long j, Map<String, C703070Rhx> map, C700400Rde c700400Rde, Map<String, String> map2) {
        this.LIZ = j;
        this.LIZIZ = map;
        this.LIZJ = c700400Rde;
        this.LIZLLL = map2;
    }
}
