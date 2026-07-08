package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OAO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OAO implements InterfaceC636340Oxc<C0OAO, C0OAT> {
    public final C627660Ojc<C0OAT> LL;
    public final List<C0OAT> LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;

    public C0OAO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OAO)) {
            return false;
        }
        C0OAO c0oao = (C0OAO) obj;
        return Intrinsics.LJFF(this.LL, c0oao.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0oao.LLILLJJLI) && this.LLILLL == c0oao.LLILLL && Intrinsics.LJFF(this.LLILZ, c0oao.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        String str = this.LLILZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopicRecommendListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", recommendListState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pageExtra=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C0OAT> getListItemState() {
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
    public final C627660Ojc<C0OAT> getListState() {
        return this.LL;
    }

    public C0OAO(int i) {
        this(new C627660Ojc(null, null, null, null, 15), C13BV.INSTANCE, false, null);
    }

    public C0OAO(C627660Ojc<C0OAT> c627660Ojc, List<C0OAT> list, boolean z, String str) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = str;
    }

    public static C0OAO LIZ(C0OAO c0oao, C627660Ojc c627660Ojc, List list, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c0oao.LL;
        }
        if ((i & 2) != 0) {
            list = c0oao.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c0oao.LLILLL;
        }
        if ((i & 8) != 0) {
            str = c0oao.LLILZ;
        }
        c0oao.getClass();
        return new C0OAO(c627660Ojc, list, z, str);
    }
}
