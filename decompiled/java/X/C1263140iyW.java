package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263140iyW implements InterfaceC636340Oxc<C1263140iyW, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final List<InterfaceC1891350zJl> LLILLJJLI;
    public final boolean LLILLL;
    public final C291001Au<Integer> LLILZ;

    public C1263140iyW() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1263140iyW)) {
            return false;
        }
        C1263140iyW c1263140iyW = (C1263140iyW) obj;
        return Intrinsics.LJFF(this.LL, c1263140iyW.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1263140iyW.LLILLJJLI) && this.LLILLL == c1263140iyW.LLILLL && Intrinsics.LJFF(this.LLILZ, c1263140iyW.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        List<InterfaceC1891350zJl> list = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        C291001Au<Integer> c291001Au = this.LLILZ;
        return iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserCardListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sourceSetup=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", toast=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZIZ() {
        if (C627260Oiy.LIZJ(this) instanceof C491101vh) {
            C626160OhC c626160OhCLIZ = C627260Oiy.LIZLLL(this).LIZ();
            return c626160OhCLIZ != null && c626160OhCLIZ.LIZIZ;
        }
        C626160OhC c626160OhCLIZ2 = C627260Oiy.LIZJ(this).LIZ();
        return c626160OhCLIZ2 != null && c626160OhCLIZ2.LIZIZ;
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
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
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1263140iyW(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1263140iyW(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, List<? extends InterfaceC1891350zJl> list, boolean z, C291001Au<Integer> c291001Au) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = c291001Au;
    }

    public static C1263140iyW LIZ(C1263140iyW c1263140iyW, C627660Ojc c627660Ojc, List list, boolean z, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1263140iyW.LL;
        }
        if ((i & 2) != 0) {
            list = c1263140iyW.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c1263140iyW.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au = c1263140iyW.LLILZ;
        }
        c1263140iyW.getClass();
        return new C1263140iyW(c627660Ojc, list, z, c291001Au);
    }
}
