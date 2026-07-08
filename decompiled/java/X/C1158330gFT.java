package X;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158330gFT implements InterfaceC0148002o {
    public final List<C1178080glK> LL;
    public final Set<String> LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;

    public C1158330gFT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158330gFT)) {
            return false;
        }
        C1158330gFT c1158330gFT = (C1158330gFT) obj;
        return Intrinsics.LJFF(this.LL, c1158330gFT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1158330gFT.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1158330gFT.LLILLL) && this.LLILZ == c1158330gFT.LLILZ;
    }

    public final int hashCode() {
        List<C1178080glK> list = this.LL;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Set<String> set = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        String str = this.LLILLL;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCampaignMapState(makerList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiSet=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", clickPoiId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", refreshLoadingCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1158330gFT(int i) {
        this(null, null, null, 0);
    }

    public C1158330gFT(List<C1178080glK> list, Set<String> set, String str, int i) {
        this.LL = list;
        this.LLILLJJLI = set;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    public static C1158330gFT LIZ(C1158330gFT c1158330gFT, List list, Set set, int i, int i2) {
        String str;
        if ((i2 & 1) != 0) {
            list = c1158330gFT.LL;
        }
        if ((i2 & 2) != 0) {
            set = c1158330gFT.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            str = c1158330gFT.LLILLL;
        } else {
            str = null;
        }
        if ((i2 & 8) != 0) {
            i = c1158330gFT.LLILZ;
        }
        c1158330gFT.getClass();
        return new C1158330gFT(list, set, str, i);
    }
}
