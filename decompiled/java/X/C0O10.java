package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O10, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O10 implements InterfaceC636340Oxc<C0O10, C607950Nsv> {
    public final C627660Ojc<C607950Nsv> LL;
    public final C291001Au<List<Aweme>> LLILLJJLI;

    public C0O10() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O10)) {
            return false;
        }
        C0O10 c0o10 = (C0O10) obj;
        return Intrinsics.LJFF(this.LL, c0o10.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0o10.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OfflineModeVideoListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", itemDeleteEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C607950Nsv> getListItemState() {
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
    public final C627660Ojc<C607950Nsv> getListState() {
        return this.LL;
    }

    public C0O10(int i) {
        this(new C291001Au(C13BV.INSTANCE), new C627660Ojc(null, null, null, null, 15));
    }

    public C0O10(C291001Au c291001Au, C627660Ojc c627660Ojc) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
    }

    public static C0O10 LIZ(C0O10 c0o10, C627660Ojc c627660Ojc, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c0o10.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c0o10.LLILLJJLI;
        }
        c0o10.getClass();
        return new C0O10(c291001Au, c627660Ojc);
    }
}
