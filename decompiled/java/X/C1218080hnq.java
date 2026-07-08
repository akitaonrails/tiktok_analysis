package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hnq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218080hnq implements InterfaceC636340Oxc<C1218080hnq, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final C291001Au<String> LLILLJJLI;
    public final List<C1246430iXZ> LLILLL;
    public List<GroupUnsubscribeSetting> LLILZ;

    public C1218080hnq() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218080hnq)) {
            return false;
        }
        C1218080hnq c1218080hnq = (C1218080hnq) obj;
        return Intrinsics.LJFF(this.LL, c1218080hnq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1218080hnq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1218080hnq.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1218080hnq.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<String> c291001Au = this.LLILLJJLI;
        return ((((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SystemNotificationListViewModelState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tipsAssemEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", tabBarList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", groupUnsubscribeSettings=");
        sbLIZ.append(this.LLILZ);
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
        return this.LL;
    }

    public C1218080hnq(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C13BV c13bv = C13BV.INSTANCE;
        this(c627660Ojc, null, c13bv, c13bv);
    }

    public C1218080hnq(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, C291001Au<String> c291001Au, List<C1246430iXZ> list, List<GroupUnsubscribeSetting> list2) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = list;
        this.LLILZ = list2;
    }

    public static C1218080hnq LIZ(C1218080hnq c1218080hnq, C627660Ojc c627660Ojc, C291001Au c291001Au, List list, List list2, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1218080hnq.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1218080hnq.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list = c1218080hnq.LLILLL;
        }
        if ((i & 8) != 0) {
            list2 = c1218080hnq.LLILZ;
        }
        c1218080hnq.getClass();
        return new C1218080hnq(c627660Ojc, c291001Au, list, list2);
    }
}
