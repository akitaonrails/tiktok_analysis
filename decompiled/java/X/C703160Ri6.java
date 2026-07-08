package X;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ri6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703160Ri6 {
    public final String LIZ;
    public final EnumC703190Ri9 LIZIZ;
    public final Long LIZJ;
    public final List<String> LIZLLL;
    public final Set<String> LJ;
    public final Set<String> LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703160Ri6)) {
            return false;
        }
        C703160Ri6 c703160Ri6 = (C703160Ri6) obj;
        return Intrinsics.LJFF(this.LIZ, c703160Ri6.LIZ) && this.LIZIZ == c703160Ri6.LIZIZ && Intrinsics.LJFF(this.LIZJ, c703160Ri6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c703160Ri6.LIZLLL) && Intrinsics.LJFF(this.LJ, c703160Ri6.LJ) && Intrinsics.LJFF(this.LJFF, c703160Ri6.LJFF) && this.LJI == c703160Ri6.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Long l = this.LIZJ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<String> list = this.LIZLLL;
        return ((((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotRule(slotId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", delayMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timingKeys=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", requiredChildrenAnyOf=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", forbiddenChildrenAnyOf=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enableOneWayLifecycle=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703160Ri6(String str, EnumC703190Ri9 enumC703190Ri9, Long l, List<String> list, Set<String> set, Set<String> set2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = enumC703190Ri9;
        this.LIZJ = l;
        this.LIZLLL = list;
        this.LJ = set;
        this.LJFF = set2;
        this.LJI = z;
    }
}
