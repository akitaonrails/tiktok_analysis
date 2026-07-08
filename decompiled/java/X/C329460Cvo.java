package X;

import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329460Cvo implements InterfaceC636340Oxc<C329460Cvo, C329510Cvt> {
    public final C627660Ojc<C329510Cvt> LL;
    public final AbstractC1623806Xk<BatchDetailList> LLILLJJLI;

    public C329460Cvo() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C329460Cvo)) {
            return false;
        }
        C329460Cvo c329460Cvo = (C329460Cvo) obj;
        return Intrinsics.LJFF(this.LL, c329460Cvo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c329460Cvo.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DoubleColumnVideoListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", queryAweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C329510Cvt> getListItemState() {
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
    public final C627660Ojc<C329510Cvt> getListState() {
        return this.LL;
    }

    public /* synthetic */ C329460Cvo(int i) {
        this(C491101vh.LIZ, new C627660Ojc(null, null, null, null, 15));
    }

    public C329460Cvo(AbstractC1623806Xk abstractC1623806Xk, C627660Ojc c627660Ojc) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1623806Xk;
    }
}
