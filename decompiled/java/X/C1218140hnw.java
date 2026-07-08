package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hnw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218140hnw implements InterfaceC636340Oxc<C1218140hnw, C1279404zY> {
    public final C627660Ojc<C1279404zY> LL;
    public final C291001Au<List<Aweme>> LLILLJJLI;

    public C1218140hnw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218140hnw)) {
            return false;
        }
        C1218140hnw c1218140hnw = (C1218140hnw) obj;
        return Intrinsics.LJFF(this.LL, c1218140hnw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1218140hnw.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandscapeFeedState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", awemeList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1279404zY> getListItemState() {
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
    public final C627660Ojc<C1279404zY> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1218140hnw(int i) {
        this(new C291001Au(new ArrayList()), new C627660Ojc(null, null, null, null, 15));
    }

    public C1218140hnw(C291001Au c291001Au, C627660Ojc c627660Ojc) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
    }

    public static C1218140hnw LIZ(C1218140hnw c1218140hnw, C627660Ojc c627660Ojc, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1218140hnw.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1218140hnw.LLILLJJLI;
        }
        c1218140hnw.getClass();
        return new C1218140hnw(c291001Au, c627660Ojc);
    }
}
