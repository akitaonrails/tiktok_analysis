package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340310DVt implements InterfaceC636340Oxc<C340310DVt, C00GU> {
    public final C627660Ojc<C00GU> LL;
    public final C0OZ5 LLILLJJLI;

    public C340310DVt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C340310DVt)) {
            return false;
        }
        C340310DVt c340310DVt = (C340310DVt) obj;
        return Intrinsics.LJFF(this.LL, c340310DVt.LL) && this.LLILLJJLI == c340310DVt.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPollVoteDetailListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listLoadState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C00GU> getListItemState() {
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
    public final C627660Ojc<C00GU> getListState() {
        return this.LL;
    }

    public /* synthetic */ C340310DVt(int i) {
        this(new C627660Ojc(null, null, null, null, 15), C0OZ5.LOADING);
    }

    public C340310DVt(C627660Ojc<C00GU> c627660Ojc, C0OZ5 c0oz5) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c0oz5;
    }

    public static C340310DVt LIZ(C340310DVt c340310DVt, C627660Ojc c627660Ojc, C0OZ5 c0oz5, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c340310DVt.LL;
        }
        if ((i & 2) != 0) {
            c0oz5 = c340310DVt.LLILLJJLI;
        }
        c340310DVt.getClass();
        return new C340310DVt(c627660Ojc, c0oz5);
    }
}
