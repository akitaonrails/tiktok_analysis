package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m7A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383820m7A implements InterfaceC636340Oxc<C1383820m7A, C1158140gFA> {
    public final C291001Au<Unit> LL;
    public long LLILLJJLI;
    public final C627660Ojc<C1158140gFA> LLILLL;

    public C1383820m7A() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1383820m7A)) {
            return false;
        }
        C1383820m7A c1383820m7A = (C1383820m7A) obj;
        return Intrinsics.LJFF(this.LL, c1383820m7A.LL) && this.LLILLJJLI == c1383820m7A.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1383820m7A.LLILLL);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        return ((((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DanmakuListState(emptyNoticeEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1158140gFA> getListItemState() {
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
    public final C627660Ojc<C1158140gFA> getListState() {
        return this.LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C1383820m7A(int i) {
        this(null, 0L, new C627660Ojc(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15));
    }

    public C1383820m7A(C291001Au<Unit> c291001Au, long j, C627660Ojc<C1158140gFA> c627660Ojc) {
        this.LL = c291001Au;
        this.LLILLJJLI = j;
        this.LLILLL = c627660Ojc;
    }

    public static C1383820m7A LIZ(C1383820m7A c1383820m7A, long j, C627660Ojc c627660Ojc, int i) {
        C291001Au<Unit> c291001Au;
        if ((i & 1) != 0) {
            c291001Au = c1383820m7A.LL;
        } else {
            c291001Au = null;
        }
        if ((i & 2) != 0) {
            j = c1383820m7A.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c627660Ojc = c1383820m7A.LLILLL;
        }
        c1383820m7A.getClass();
        return new C1383820m7A(c291001Au, j, c627660Ojc);
    }
}
