package X;

import com.ss.android.ugc.aweme.friends.model.MutualUser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.036o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7896036o {
    public final boolean LIZ;
    public final int LIZIZ;
    public final List<MutualUser> LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7896036o)) {
            return false;
        }
        C7896036o c7896036o = (C7896036o) obj;
        return this.LIZ == c7896036o.LIZ && this.LIZIZ == c7896036o.LIZIZ && Intrinsics.LJFF(this.LIZJ, c7896036o.LIZJ) && this.LIZLLL == c7896036o.LIZLLL;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31;
        List<MutualUser> list = this.LIZJ;
        return ((iZ2 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CampusEducationSheetStatus(shouldShowPopup=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mufCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", userList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fetchedAtMillis=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C7896036o(long j, int i, boolean z, List list) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = list;
        this.LIZLLL = j;
    }
}
