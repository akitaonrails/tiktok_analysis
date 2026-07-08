package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dhe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C346160Dhe implements InterfaceC636340Oxc<C346160Dhe, InterfaceC339430DSj> {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final Pair<Integer, Integer> LLILLL;
    public final AbstractC1623806Xk<Integer> LLILZ;
    public final C627660Ojc<InterfaceC339430DSj> LLILZIL;

    public C346160Dhe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C346160Dhe)) {
            return false;
        }
        C346160Dhe c346160Dhe = (C346160Dhe) obj;
        return this.LL == c346160Dhe.LL && this.LLILLJJLI == c346160Dhe.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c346160Dhe.LLILLL) && Intrinsics.LJFF(this.LLILZ, c346160Dhe.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c346160Dhe.LLILZIL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        Pair<Integer, Integer> pair = this.LLILLL;
        return ((((iZ2 + (pair == null ? 0 : pair.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolUsersListState(filterPopular=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", filterConnection=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", filterYear=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", numberOfSchoolMembers=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC339430DSj> getListItemState() {
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
    public final C627660Ojc<InterfaceC339430DSj> getListState() {
        return this.LLILZIL;
    }

    public /* synthetic */ C346160Dhe(int i) {
        this(false, false, null, C491101vh.LIZ, new C627660Ojc(null, null, null, null, 15));
    }

    public C346160Dhe(boolean z, boolean z2, Pair<Integer, Integer> pair, AbstractC1623806Xk<Integer> abstractC1623806Xk, C627660Ojc<InterfaceC339430DSj> c627660Ojc) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = pair;
        this.LLILZ = abstractC1623806Xk;
        this.LLILZIL = c627660Ojc;
    }

    public static C346160Dhe LIZ(C346160Dhe c346160Dhe, boolean z, boolean z2, Pair pair, AbstractC1623806Xk abstractC1623806Xk, C627660Ojc c627660Ojc, int i) {
        C627660Ojc c627660Ojc2 = c627660Ojc;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        Pair pair2 = pair;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i & 1) != 0) {
            z4 = c346160Dhe.LL;
        }
        if ((i & 2) != 0) {
            z3 = c346160Dhe.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            pair2 = c346160Dhe.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk2 = c346160Dhe.LLILZ;
        }
        if ((i & 16) != 0) {
            c627660Ojc2 = c346160Dhe.LLILZIL;
        }
        c346160Dhe.getClass();
        return new C346160Dhe(z4, z3, pair2, abstractC1623806Xk2, c627660Ojc2);
    }
}
