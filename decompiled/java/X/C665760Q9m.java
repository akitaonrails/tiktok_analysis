package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665760Q9m implements InterfaceC636340Oxc<C665760Q9m, C209900rR> {
    public final C627660Ojc<C209900rR> LL;
    public final Map<String, List<Map<?, ?>>> LLILLJJLI;
    public final Map<String, List<Aweme>> LLILLL;
    public final Map<String, Integer> LLILZ;
    public final Map<String, Integer> LLILZIL;

    public C665760Q9m() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C665760Q9m)) {
            return false;
        }
        C665760Q9m c665760Q9m = (C665760Q9m) obj;
        return Intrinsics.LJFF(this.LL, c665760Q9m.LL) && Intrinsics.LJFF(this.LLILLJJLI, c665760Q9m.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c665760Q9m.LLILLL) && Intrinsics.LJFF(this.LLILZ, c665760Q9m.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c665760Q9m.LLILZIL);
    }

    public final int hashCode() {
        return (((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchReviewAggregationDetailVideoState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rawAwemeListCacheMap=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", awemeModelListCacheMap=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", cacheCursor=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", cacheHasMore=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C209900rR> getListItemState() {
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
    public final C627660Ojc<C209900rR> getListState() {
        return this.LL;
    }

    public /* synthetic */ C665760Q9m(int i) {
        this(new C627660Ojc(null, null, null, null, 15), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
    }

    public C665760Q9m(C627660Ojc<C209900rR> c627660Ojc, Map<String, List<Map<?, ?>>> map, Map<String, List<Aweme>> map2, Map<String, Integer> map3, Map<String, Integer> map4) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = map;
        this.LLILLL = map2;
        this.LLILZ = map3;
        this.LLILZIL = map4;
    }

    public static C665760Q9m LIZ(C665760Q9m c665760Q9m, C627660Ojc c627660Ojc, Map map, Map map2, Map map3, Map map4, int i) {
        Map map5 = map4;
        Map map6 = map3;
        Map map7 = map2;
        Map map8 = map;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c665760Q9m.LL;
        }
        if ((i & 2) != 0) {
            map8 = c665760Q9m.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            map7 = c665760Q9m.LLILLL;
        }
        if ((i & 8) != 0) {
            map6 = c665760Q9m.LLILZ;
        }
        if ((i & 16) != 0) {
            map5 = c665760Q9m.LLILZIL;
        }
        c665760Q9m.getClass();
        return new C665760Q9m(c627660Ojc2, map8, map7, map6, map5);
    }
}
