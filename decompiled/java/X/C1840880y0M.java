package X;

import com.ss.android.ugc.aweme.notification.aggregate.data.BulletinAggregateNotice;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y0M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840880y0M implements InterfaceC636340Oxc<C1840880y0M, BulletinAggregateNotice> {
    public final C627660Ojc<BulletinAggregateNotice> LL;
    public final EnumC1840900y0O LLILLJJLI;

    public C1840880y0M() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1840880y0M)) {
            return false;
        }
        C1840880y0M c1840880y0M = (C1840880y0M) obj;
        return Intrinsics.LJFF(this.LL, c1840880y0M.LL) && this.LLILLJJLI == c1840880y0M.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<BulletinAggregateNotice> getListItemState() {
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
    public final C627660Ojc<BulletinAggregateNotice> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1840880y0M(int i) {
        this(new C627660Ojc(null, null, null, null, 15), EnumC1840900y0O.LOADING);
    }

    public C1840880y0M(C627660Ojc<BulletinAggregateNotice> c627660Ojc, EnumC1840900y0O enumC1840900y0O) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = enumC1840900y0O;
    }

    public static C1840880y0M LIZ(C1840880y0M c1840880y0M, C627660Ojc c627660Ojc, EnumC1840900y0O enumC1840900y0O, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1840880y0M.LL;
        }
        if ((i & 2) != 0) {
            enumC1840900y0O = c1840880y0M.LLILLJJLI;
        }
        c1840880y0M.getClass();
        return new C1840880y0M(c627660Ojc, enumC1840900y0O);
    }
}
