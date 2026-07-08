package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920400a3i {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, Object> LJ;
    public final long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C920400a3i)) {
            return false;
        }
        C920400a3i c920400a3i = (C920400a3i) obj;
        return this.LIZ == c920400a3i.LIZ && this.LIZIZ == c920400a3i.LIZIZ && Intrinsics.LJFF(this.LIZJ, c920400a3i.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c920400a3i.LIZLLL) && Intrinsics.LJFF(this.LJ, c920400a3i.LJ) && this.LJFF == c920400a3i.LJFF;
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.LJ;
        return ((iHashCode + (map != null ? map.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelInviteParam(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", linkMicId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", custom=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", timeOutInterval=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C920400a3i(long j, long j2, long j3, int i) {
        String str;
        if ((i & 4) != 0) {
            str = "";
        } else {
            str = null;
        }
        j3 = (i & 32) != 0 ? -1L : j3;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = j3;
    }
}
