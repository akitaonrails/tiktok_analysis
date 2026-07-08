package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479490IrD implements InterfaceC636340Oxc<C479490IrD, AbstractC479160Iqg> {
    public final C627660Ojc<AbstractC479160Iqg> LL;
    public final EnumC479370Ir1 LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final C291001Au<Unit> LLILZLL;

    public C479490IrD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C479490IrD)) {
            return false;
        }
        C479490IrD c479490IrD = (C479490IrD) obj;
        return Intrinsics.LJFF(this.LL, c479490IrD.LL) && this.LLILLJJLI == c479490IrD.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c479490IrD.LLILLL) && this.LLILZ == c479490IrD.LLILZ && this.LLILZIL == c479490IrD.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c479490IrD.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        C291001Au<Unit> c291001Au = this.LLILZLL;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLivePlayFeedState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", requestScene=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", requestSceneV2=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isRefreshing=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", preloadEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<AbstractC479160Iqg> getListItemState() {
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
    public final C627660Ojc<AbstractC479160Iqg> getListState() {
        return this.LL;
    }

    public /* synthetic */ C479490IrD(int i) {
        this(new C627660Ojc(null, null, null, null, 15), EnumC479370Ir1.DEFAULT, "landing_init", true, false, null);
    }

    public C479490IrD(C627660Ojc<AbstractC479160Iqg> c627660Ojc, EnumC479370Ir1 enumC479370Ir1, String str, boolean z, boolean z2, C291001Au<Unit> c291001Au) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = enumC479370Ir1;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = c291001Au;
    }

    public static C479490IrD LIZ(C479490IrD c479490IrD, C627660Ojc c627660Ojc, EnumC479370Ir1 enumC479370Ir1, String str, boolean z, C291001Au c291001Au, int i) {
        boolean z2;
        C291001Au c291001Au2 = c291001Au;
        boolean z3 = z;
        String str2 = str;
        EnumC479370Ir1 enumC479370Ir12 = enumC479370Ir1;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c479490IrD.LL;
        }
        if ((i & 2) != 0) {
            enumC479370Ir12 = c479490IrD.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str2 = c479490IrD.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c479490IrD.LLILZ;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = c479490IrD.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au2 = c479490IrD.LLILZLL;
        }
        c479490IrD.getClass();
        return new C479490IrD(c627660Ojc2, enumC479370Ir12, str2, z2, z3, c291001Au2);
    }
}
