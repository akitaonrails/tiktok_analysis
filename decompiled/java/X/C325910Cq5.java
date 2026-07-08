package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325910Cq5 implements InterfaceC636340Oxc<C325910Cq5, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final List<Aweme> LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public C325910Cq5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C325910Cq5)) {
            return false;
        }
        C325910Cq5 c325910Cq5 = (C325910Cq5) obj;
        return Intrinsics.LJFF(this.LL, c325910Cq5.LL) && Intrinsics.LJFF(this.LLILLJJLI, c325910Cq5.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c325910Cq5.LLILLL) && Intrinsics.LJFF(this.LLILZ, c325910Cq5.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        List<Aweme> list = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightsFeedListVMState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", collectionAwemeList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", entryCollectionId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", entryAwemeId=");
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

    public /* synthetic */ C325910Cq5(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C325910Cq5(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, List<? extends Aweme> list, String str, String str2) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = str2;
    }
}
