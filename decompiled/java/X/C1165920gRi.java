package X;

import com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterFilterOption;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165920gRi implements InterfaceC636340Oxc<C1165920gRi, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final AbstractC1623806Xk<C626160OhC> LLILLJJLI;
    public final AbstractC1623806Xk<C626160OhC> LLILLL;
    public final AbstractC1623806Xk<C626160OhC> LLILZ;
    public final Map<String, List<MiniDramaCenterFilterOption>> LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;

    public C1165920gRi() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165920gRi)) {
            return false;
        }
        C1165920gRi c1165920gRi = (C1165920gRi) obj;
        return Intrinsics.LJFF(this.LL, c1165920gRi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1165920gRi.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1165920gRi.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1165920gRi.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1165920gRi.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1165920gRi.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1165920gRi.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        Map<String, List<MiniDramaCenterFilterOption>> map = this.LLILZIL;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZ;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniDramaCenterNewStyleState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadMoreState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loadLatestState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", refreshState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", filterOptionList=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", filterText=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", initCategoryId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LL;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return this.LLILZ;
    }

    public /* synthetic */ C1165920gRi(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C491101vh c491101vh = C491101vh.LIZ;
        this(c627660Ojc, c491101vh, c491101vh, c491101vh, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1165920gRi(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk3, Map<String, ? extends List<MiniDramaCenterFilterOption>> map, String str, String str2) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
        this.LLILZ = abstractC1623806Xk3;
        this.LLILZIL = map;
        this.LLILZLL = str;
        this.LLIZ = str2;
    }

    public static C1165920gRi LIZ(C1165920gRi c1165920gRi, C627660Ojc c627660Ojc, AbstractC1623806Xk abstractC1623806Xk, Map map, String str, String str2, int i) {
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2;
        String str3 = str2;
        String str4 = str;
        Map map2 = map;
        AbstractC1623806Xk abstractC1623806Xk3 = abstractC1623806Xk;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1165920gRi.LL;
        }
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk4 = null;
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c1165920gRi.LLILLJJLI;
        } else {
            abstractC1623806Xk2 = null;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk4 = c1165920gRi.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk3 = c1165920gRi.LLILZ;
        }
        if ((i & 16) != 0) {
            map2 = c1165920gRi.LLILZIL;
        }
        if ((i & 32) != 0) {
            str4 = c1165920gRi.LLILZLL;
        }
        if ((i & 64) != 0) {
            str3 = c1165920gRi.LLIZ;
        }
        c1165920gRi.getClass();
        return new C1165920gRi(c627660Ojc2, abstractC1623806Xk2, abstractC1623806Xk4, abstractC1623806Xk3, map2, str4, str3);
    }
}
