package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aFO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927640aFO {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final Long LIZLLL;
    public final int LJ;
    public final Integer LJFF;
    public final Long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C927640aFO)) {
            return false;
        }
        C927640aFO c927640aFO = (C927640aFO) obj;
        return this.LIZ == c927640aFO.LIZ && this.LIZIZ == c927640aFO.LIZIZ && this.LIZJ == c927640aFO.LIZJ && Intrinsics.LJFF(this.LIZLLL, c927640aFO.LIZLLL) && this.LJ == c927640aFO.LJ && Intrinsics.LJFF(this.LJFF, c927640aFO.LJFF) && Intrinsics.LJFF(this.LJI, c927640aFO.LJI);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        Long l = this.LIZLLL;
        int iHashCode = (((iY2 + (l == null ? 0 : l.hashCode())) * 31) + this.LJ) * 31;
        Integer num = this.LJFF;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.LJI;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorOrModeratorMuteGuestParam(roomID=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anchorID=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", channelID=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", guestID=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", muteOp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", changeScene=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", operateUserId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C927640aFO(long j, long j2, long j3, Long l, int i, Integer num, Long l2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = l;
        this.LJ = i;
        this.LJFF = num;
        this.LJI = l2;
    }
}
