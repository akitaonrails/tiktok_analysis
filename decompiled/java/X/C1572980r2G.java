package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572980r2G implements InterfaceC636340Oxc<C1572980r2G, C1573950r3p> {
    public final PaidCollectionListResponse LL;
    public final C627660Ojc<C1573950r3p> LLILLJJLI;
    public final Map<Long, CollectionDetailModel> LLILLL;
    public final C291001Au<Unit> LLILZ;
    public final Boolean LLILZIL;

    public C1572980r2G() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1572980r2G)) {
            return false;
        }
        C1572980r2G c1572980r2G = (C1572980r2G) obj;
        return Intrinsics.LJFF(this.LL, c1572980r2G.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1572980r2G.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1572980r2G.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1572980r2G.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1572980r2G.LLILZIL);
    }

    public final int hashCode() {
        PaidCollectionListResponse paidCollectionListResponse = this.LL;
        int iHashCode = (((((paidCollectionListResponse == null ? 0 : paidCollectionListResponse.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLILZ;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        Boolean bool = this.LLILZIL;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidContentCollectionListState(response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", multiSelectPromoteMap=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showToast=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", addButtonEnabled=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1573950r3p> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C1573950r3p> getListState() {
        return this.LLILLJJLI;
    }

    public /* synthetic */ C1572980r2G(int i) {
        this(null, new C627660Ojc(null, null, null, null, 15), C2097608Jq.LJ(), null, Boolean.FALSE);
    }

    public C1572980r2G(PaidCollectionListResponse paidCollectionListResponse, C627660Ojc<C1573950r3p> c627660Ojc, Map<Long, CollectionDetailModel> map, C291001Au<Unit> c291001Au, Boolean bool) {
        this.LL = paidCollectionListResponse;
        this.LLILLJJLI = c627660Ojc;
        this.LLILLL = map;
        this.LLILZ = c291001Au;
        this.LLILZIL = bool;
    }

    public static C1572980r2G LIZ(C1572980r2G c1572980r2G, PaidCollectionListResponse paidCollectionListResponse, C627660Ojc c627660Ojc, Map map, C291001Au c291001Au, Boolean bool, int i) {
        Boolean bool2 = bool;
        C291001Au c291001Au2 = c291001Au;
        Map map2 = map;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        PaidCollectionListResponse paidCollectionListResponse2 = paidCollectionListResponse;
        if ((i & 1) != 0) {
            paidCollectionListResponse2 = c1572980r2G.LL;
        }
        if ((i & 2) != 0) {
            c627660Ojc2 = c1572980r2G.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            map2 = c1572980r2G.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c1572980r2G.LLILZ;
        }
        if ((i & 16) != 0) {
            bool2 = c1572980r2G.LLILZIL;
        }
        c1572980r2G.getClass();
        return new C1572980r2G(paidCollectionListResponse2, c627660Ojc2, map2, c291001Au2, bool2);
    }
}
