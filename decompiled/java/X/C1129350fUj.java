package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129350fUj {
    public final Long LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public C1129350fUj() {
        this(null, false, 0L, 0L, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1129350fUj)) {
            return false;
        }
        C1129350fUj c1129350fUj = (C1129350fUj) obj;
        return Intrinsics.LJFF(this.LIZ, c1129350fUj.LIZ) && this.LIZIZ == c1129350fUj.LIZIZ && this.LIZJ == c1129350fUj.LIZJ && this.LIZLLL == c1129350fUj.LIZLLL && Intrinsics.LJFF(this.LJ, c1129350fUj.LJ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        return ((((((((l == null ? 0 : l.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelBuildMetadata(showShimmerGiftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isInMinuteGame=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", minuteGameEntranceGiftId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", collaborativeGiftingFuelGiftId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", collaborativeGiftingSessionId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1129350fUj(Long l, boolean z, long j, long j2, String str) {
        this.LIZ = l;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = str;
    }
}
