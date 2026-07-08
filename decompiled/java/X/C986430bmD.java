package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C986430bmD {
    public final Set<Long> LIZ;
    public final EnumC919170a1j LIZIZ;
    public final Long LIZJ;
    public final boolean LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C986430bmD)) {
            return false;
        }
        C986430bmD c986430bmD = (C986430bmD) obj;
        return Intrinsics.LJFF(this.LIZ, c986430bmD.LIZ) && this.LIZIZ == c986430bmD.LIZIZ && Intrinsics.LJFF(this.LIZJ, c986430bmD.LIZJ) && this.LIZLLL == c986430bmD.LIZLLL && this.LJ == c986430bmD.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Long l = this.LIZJ;
        return ((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteRequestSnapshot(linkedUids=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", matchType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", giftId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isRematch=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", capturedAtMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C986430bmD(Set<Long> set, EnumC919170a1j enumC919170a1j, Long l, boolean z, long j) {
        this.LIZ = set;
        this.LIZIZ = enumC919170a1j;
        this.LIZJ = l;
        this.LIZLLL = z;
        this.LJ = j;
    }
}
