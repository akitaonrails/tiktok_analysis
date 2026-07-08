package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rhx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703070Rhx {
    public final EnumC699470Rc9 LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703070Rhx)) {
            return false;
        }
        C703070Rhx c703070Rhx = (C703070Rhx) obj;
        return this.LIZ == c703070Rhx.LIZ && Intrinsics.LJFF(this.LIZIZ, c703070Rhx.LIZIZ) && this.LIZJ == c703070Rhx.LIZJ && this.LIZLLL == c703070Rhx.LIZLLL && this.LJ == c703070Rhx.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotSnapshotState(availabilityState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", latestCandidateComponentId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", revision=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", updatedAtMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasBeenAvailable=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703070Rhx(EnumC699470Rc9 enumC699470Rc9, String str, long j, long j2, boolean z) {
        this.LIZ = enumC699470Rc9;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = z;
    }
}
