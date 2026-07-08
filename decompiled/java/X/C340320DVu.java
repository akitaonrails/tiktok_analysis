package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340320DVu implements InterfaceC636340Oxc<C340320DVu, C621500OZg> {
    public final C627660Ojc<C621500OZg> LL;
    public final C0OZ5 LLILLJJLI;

    public C340320DVu() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C340320DVu)) {
            return false;
        }
        C340320DVu c340320DVu = (C340320DVu) obj;
        return Intrinsics.LJFF(this.LL, c340320DVu.LL) && this.LLILLJJLI == c340320DVu.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEmojiDetailListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listLoadState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C621500OZg> getListItemState() {
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
    public final C627660Ojc<C621500OZg> getListState() {
        return this.LL;
    }

    public /* synthetic */ C340320DVu(int i) {
        this(new C627660Ojc(null, null, null, null, 15), C0OZ5.LOADING);
    }

    public C340320DVu(C627660Ojc<C621500OZg> c627660Ojc, C0OZ5 c0oz5) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c0oz5;
    }

    public static C340320DVu LIZ(C340320DVu c340320DVu, C627660Ojc c627660Ojc, C0OZ5 c0oz5, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c340320DVu.LL;
        }
        if ((i & 2) != 0) {
            c0oz5 = c340320DVu.LLILLJJLI;
        }
        c340320DVu.getClass();
        return new C340320DVu(c627660Ojc, c0oz5);
    }
}
