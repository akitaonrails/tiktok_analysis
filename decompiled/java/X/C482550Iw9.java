package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482550Iw9 implements InterfaceC636340Oxc<C482550Iw9, AbstractC482420Ivw> {
    public final C627660Ojc<AbstractC482420Ivw> LL;
    public final EnumC482480Iw2 LLILLJJLI;

    public C482550Iw9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C482550Iw9)) {
            return false;
        }
        C482550Iw9 c482550Iw9 = (C482550Iw9) obj;
        return Intrinsics.LJFF(this.LL, c482550Iw9.LL) && this.LLILLJJLI == c482550Iw9.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToplivePageState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", requestScene=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<AbstractC482420Ivw> getListItemState() {
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
    public final C627660Ojc<AbstractC482420Ivw> getListState() {
        return this.LL;
    }

    public /* synthetic */ C482550Iw9(int i) {
        this(new C627660Ojc(null, null, null, null, 15), EnumC482480Iw2.DEFAULT);
    }

    public C482550Iw9(C627660Ojc<AbstractC482420Ivw> c627660Ojc, EnumC482480Iw2 enumC482480Iw2) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = enumC482480Iw2;
    }

    public static C482550Iw9 LIZ(C482550Iw9 c482550Iw9, C627660Ojc c627660Ojc, EnumC482480Iw2 enumC482480Iw2, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c482550Iw9.LL;
        }
        if ((i & 2) != 0) {
            enumC482480Iw2 = c482550Iw9.LLILLJJLI;
        }
        c482550Iw9.getClass();
        return new C482550Iw9(c627660Ojc, enumC482480Iw2);
    }
}
