package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777210wLf implements InterfaceC1777220wLg {
    public final long LIZ;
    public final User LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777210wLf)) {
            return false;
        }
        C1777210wLf c1777210wLf = (C1777210wLf) obj;
        return this.LIZ == c1777210wLf.LIZ && Intrinsics.LJFF(this.LIZIZ, c1777210wLf.LIZIZ) && this.LIZJ == c1777210wLf.LIZJ && this.LIZLLL == c1777210wLf.LIZLLL && Intrinsics.LJFF(this.LJ, c1777210wLf.LJ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode();
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
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777210wLf(long j, String str, int i, long j2, User user) {
        this.LIZ = j;
        this.LIZIZ = user;
        this.LIZJ = j2;
        this.LIZLLL = i;
        this.LJ = str;
    }
}
