package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h1H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187970h1H implements InterfaceC636340Oxc<C1187970h1H, InterfaceC1891350zJl> {
    public PoiListApi.PostTag LL;
    public final C1188090h1T LLILLJJLI;
    public final C627660Ojc<InterfaceC1891350zJl> LLILLL;

    public C1187970h1H() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1187970h1H)) {
            return false;
        }
        C1187970h1H c1187970h1H = (C1187970h1H) obj;
        return Intrinsics.LJFF(this.LL, c1187970h1H.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1187970h1H.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1187970h1H.LLILLL);
    }

    public final int hashCode() {
        PoiListApi.PostTag postTag = this.LL;
        int iHashCode = (postTag == null ? 0 : postTag.hashCode()) * 31;
        C1188090h1T c1188090h1T = this.LLILLJJLI;
        return ((iHashCode + (c1188090h1T != null ? c1188090h1T.hashCode() : 0)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiPostPageState(selectedTag=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiBusinessData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
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
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LLILLL;
    }

    public /* synthetic */ C1187970h1H(int i) {
        this(null, null, new C627660Ojc(null, null, null, null, 15));
    }

    public C1187970h1H(PoiListApi.PostTag postTag, C1188090h1T c1188090h1T, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        this.LL = postTag;
        this.LLILLJJLI = c1188090h1T;
        this.LLILLL = c627660Ojc;
    }

    public static C1187970h1H LIZ(C1187970h1H c1187970h1H, PoiListApi.PostTag postTag, C1188090h1T c1188090h1T, C627660Ojc c627660Ojc, int i) {
        if ((i & 1) != 0) {
            postTag = c1187970h1H.LL;
        }
        if ((i & 2) != 0) {
            c1188090h1T = c1187970h1H.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c627660Ojc = c1187970h1H.LLILLL;
        }
        c1187970h1H.getClass();
        return new C1187970h1H(postTag, c1188090h1T, c627660Ojc);
    }
}
