package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wN2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778060wN2 {
    public final C861890XrX LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778060wN2)) {
            return false;
        }
        C1778060wN2 c1778060wN2 = (C1778060wN2) obj;
        return Intrinsics.LJFF(this.LIZ, c1778060wN2.LIZ) && this.LIZIZ == c1778060wN2.LIZIZ && this.LIZJ == c1778060wN2.LIZJ && this.LIZLLL == c1778060wN2.LIZLLL && this.LJ == c1778060wN2.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommandRequest(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomOwnerUserId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentRoomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetUserId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", clickType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778060wN2(C861890XrX c861890XrX, long j, long j2, long j3, int i) {
        this.LIZ = c861890XrX;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = i;
    }
}
