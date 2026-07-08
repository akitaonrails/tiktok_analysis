package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.01H9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01H9 {
    public final ShowListUser LIZ;
    public final List<ShowListUser> LIZIZ;
    public final List<ShowListUser> LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01H9)) {
            return false;
        }
        C01H9 c01h9 = (C01H9) obj;
        return Intrinsics.LJFF(this.LIZ, c01h9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c01h9.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c01h9.LIZJ) && this.LIZLLL == c01h9.LIZLLL;
    }

    public final int hashCode() {
        ShowListUser showListUser = this.LIZ;
        int iHashCode = (showListUser == null ? 0 : showListUser.hashCode()) * 31;
        List<ShowListUser> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ShowListUser> list2 = this.LIZJ;
        return ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowUserListData(showingUser=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", readyUserList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", finishedUserList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFromSei=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01H9(ShowListUser showListUser, List<ShowListUser> list, List<ShowListUser> list2, boolean z) {
        this.LIZ = showListUser;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = z;
    }
}
