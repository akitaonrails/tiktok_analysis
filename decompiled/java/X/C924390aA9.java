package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aA9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924390aA9 {
    public final String LIZ;
    public final C924760aAk LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C924390aA9)) {
            return false;
        }
        C924390aA9 c924390aA9 = (C924390aA9) obj;
        return Intrinsics.LJFF(this.LIZ, c924390aA9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c924390aA9.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c924390aA9.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c924390aA9.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C924760aAk c924760aAk = this.LIZIZ;
        return ((((iHashCode + (c924760aAk == null ? 0 : c924760aAk.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JoinDirectConnectionLog(guestInviteType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", outRoomInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", page=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", module=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C924390aA9(String str, C924760aAk c924760aAk, int i) {
        String str2;
        c924760aAk = (i & 2) != 0 ? null : c924760aAk;
        if ((i & 4) != 0) {
            str2 = "receiveIM";
        } else {
            str2 = null;
        }
        String str3 = (i & 8) != 0 ? "permit" : null;
        this.LIZ = str;
        this.LIZIZ = c924760aAk;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
