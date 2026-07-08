package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845500y7o implements InterfaceC636340Oxc<C1845500y7o, C207800r6> {
    public final C627660Ojc<C207800r6> LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;

    public C1845500y7o() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1845500y7o)) {
            return false;
        }
        C1845500y7o c1845500y7o = (C1845500y7o) obj;
        return Intrinsics.LJFF(this.LL, c1845500y7o.LL) && this.LLILLJJLI == c1845500y7o.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1845500y7o.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FootNoteFeedListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C207800r6> getListItemState() {
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
    public final C627660Ojc<C207800r6> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1845500y7o(int i) {
        this(new C627660Ojc(null, null, null, null, 15), true, CardStruct.IStatusCode.DEFAULT);
    }

    public C1845500y7o(C627660Ojc<C207800r6> c627660Ojc, boolean z, String str) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }

    public static C1845500y7o LIZ(C1845500y7o c1845500y7o, C627660Ojc c627660Ojc, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1845500y7o.LL;
        }
        if ((i & 2) != 0) {
            z = c1845500y7o.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str = c1845500y7o.LLILLL;
        }
        c1845500y7o.getClass();
        return new C1845500y7o(c627660Ojc, z, str);
    }
}
