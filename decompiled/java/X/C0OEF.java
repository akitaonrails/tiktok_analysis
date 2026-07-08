package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OEF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OEF implements InterfaceC636340Oxc<C0OEF, C0OEI> {
    public final boolean LL;
    public final int LLILLJJLI;
    public final C627660Ojc<C0OEI> LLILLL;

    public C0OEF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OEF)) {
            return false;
        }
        C0OEF c0oef = (C0OEF) obj;
        return this.LL == c0oef.LL && this.LLILLJJLI == c0oef.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0oef.LLILLL);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HubTabVMState(isMe=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedHub=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C0OEI> getListItemState() {
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
    public final C627660Ojc<C0OEI> getListState() {
        return this.LLILLL;
    }

    public /* synthetic */ C0OEF(int i) {
        this(false, -1, new C627660Ojc(null, null, null, null, 15));
    }

    public C0OEF(boolean z, int i, C627660Ojc<C0OEI> c627660Ojc) {
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = c627660Ojc;
    }

    public static C0OEF LIZ(C0OEF c0oef, boolean z, int i, C627660Ojc c627660Ojc, int i2) {
        if ((i2 & 1) != 0) {
            z = c0oef.LL;
        }
        if ((i2 & 2) != 0) {
            i = c0oef.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            c627660Ojc = c0oef.LLILLL;
        }
        c0oef.getClass();
        return new C0OEF(z, i, c627660Ojc);
    }
}
