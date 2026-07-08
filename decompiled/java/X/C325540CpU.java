package X;

import com.ss.android.ugc.aweme.model.MentionCheckResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325540CpU implements InterfaceC636340Oxc<C325540CpU, InterfaceC1891350zJl> {
    public final C291001Au<C20611415l2> LL;
    public final C627660Ojc<InterfaceC1891350zJl> LLILLJJLI;
    public final List<MentionCheckResult> LLILLL;

    public C325540CpU() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C325540CpU)) {
            return false;
        }
        C325540CpU c325540CpU = (C325540CpU) obj;
        return Intrinsics.LJFF(this.LL, c325540CpU.LL) && Intrinsics.LJFF(this.LLILLJJLI, c325540CpU.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c325540CpU.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCaptionMentionRecommendState(selectedUser=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mentionBlockUser=");
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
        return this.LLILLJJLI;
    }

    public C325540CpU(int i) {
        this(new C291001Au(new C20611415l2(null, 0, 0, null, null, null, null, null, null, null, 0, null, null, 0, null, null, 2097151)), new C627660Ojc(null, null, null, null, 15), C13BV.INSTANCE);
    }

    public C325540CpU(C291001Au<C20611415l2> c291001Au, C627660Ojc<InterfaceC1891350zJl> c627660Ojc, List<MentionCheckResult> list) {
        this.LL = c291001Au;
        this.LLILLJJLI = c627660Ojc;
        this.LLILLL = list;
    }

    public static C325540CpU LIZ(C325540CpU c325540CpU, C291001Au c291001Au, C627660Ojc c627660Ojc, List list, int i) {
        if ((i & 1) != 0) {
            c291001Au = c325540CpU.LL;
        }
        if ((i & 2) != 0) {
            c627660Ojc = c325540CpU.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list = c325540CpU.LLILLL;
        }
        c325540CpU.getClass();
        return new C325540CpU(c291001Au, c627660Ojc, list);
    }
}
