package X;

import com.bytedance.android.live.base.model.user.User;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777230wLh implements InterfaceC1785530wZ5 {
    public final long LIZ;
    public final User LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final long[] LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777230wLh)) {
            return false;
        }
        C1777230wLh c1777230wLh = (C1777230wLh) obj;
        return this.LIZ == c1777230wLh.LIZ && Intrinsics.LJFF(this.LIZIZ, c1777230wLh.LIZIZ) && this.LIZJ == c1777230wLh.LIZJ && this.LIZLLL == c1777230wLh.LIZLLL && Intrinsics.LJFF(this.LJ, c1777230wLh.LJ) && Intrinsics.LJFF(this.LJFF, c1777230wLh.LJFF);
    }

    public final int hashCode() {
        int iY2 = ((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        long[] jArr = this.LJFF;
        return iY2 + (jArr == null ? 0 : Arrays.hashCode(jArr));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JumpToOtherRoom(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", user=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rankType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rankName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", roomIds=");
        sbLIZ.append(Arrays.toString(this.LJFF));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777230wLh(long j, User user, long j2, int i, String str, long[] jArr) {
        this.LIZ = j;
        this.LIZIZ = user;
        this.LIZJ = j2;
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = jArr;
    }
}
