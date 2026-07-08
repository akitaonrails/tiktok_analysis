package X;

import com.ss.android.ugc.aweme.im.chatlist.api.extension.FilterTabTypeMapAdapter;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ypr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886330Ypr {
    public final int LIZ;
    public final int LIZIZ;

    @C09CS(FilterTabTypeMapAdapter.class)
    public final Map<FilterTabType, Integer> LIZJ;
    public final int LIZLLL;
    public final C892510Yzp LJ;
    public final int LJFF;
    public final boolean LJI;
    public final int LJII;

    public C886330Ypr() {
        this(0, 0, null, 0, null, 0, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C886330Ypr)) {
            return false;
        }
        C886330Ypr c886330Ypr = (C886330Ypr) obj;
        return this.LIZ == c886330Ypr.LIZ && this.LIZIZ == c886330Ypr.LIZIZ && Intrinsics.LJFF(this.LIZJ, c886330Ypr.LIZJ) && this.LIZLLL == c886330Ypr.LIZLLL && Intrinsics.LJFF(this.LJ, c886330Ypr.LJ) && this.LJFF == c886330Ypr.LJFF && this.LJI == c886330Ypr.LJI && this.LJII == c886330Ypr.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMUnreadInfo(totalUnreadMsgCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalUnreadCellCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", unreadCountOfEachTab=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hostTabUnreadMsgCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", archiveEntranceInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", primaryTabAllUnreadConvNumWithoutBB=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", needUnreadDot=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", unreadDot=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        Map<FilterTabType, Integer> map = this.LIZJ;
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<FilterTabType, Integer>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().intValue() < 0) {
                return false;
            }
        }
        return true;
    }

    public C886330Ypr(int i, int i2, Map map, int i3, C892510Yzp c892510Yzp, int i4, int i5) {
        int i6;
        i = (i5 & 1) != 0 ? 0 : i;
        i2 = (i5 & 2) != 0 ? 0 : i2;
        map = (i5 & 4) != 0 ? C2097608Jq.LJ() : map;
        i3 = (i5 & 8) != 0 ? 0 : i3;
        c892510Yzp = (i5 & 16) != 0 ? null : c892510Yzp;
        i4 = (i5 & 32) != 0 ? 0 : i4;
        if ((i5 & 128) != 0) {
            i6 = -1;
        } else {
            i6 = 0;
        }
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = map;
        this.LIZLLL = i3;
        this.LJ = c892510Yzp;
        this.LJFF = i4;
        this.LJI = false;
        this.LJII = i6;
    }
}
