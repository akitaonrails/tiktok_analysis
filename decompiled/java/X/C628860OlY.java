package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628860OlY implements InterfaceC636340Oxc<C628860OlY, C628920Ole> {
    public final C627660Ojc<C628920Ole> LL;
    public final C291001Au<Integer> LLILLJJLI;
    public final C291001Au<Integer> LLILLL;
    public final EnumC628870OlZ LLILZ;
    public final Integer LLILZIL;

    public C628860OlY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C628860OlY)) {
            return false;
        }
        C628860OlY c628860OlY = (C628860OlY) obj;
        return Intrinsics.LJFF(this.LL, c628860OlY.LL) && Intrinsics.LJFF(this.LLILLJJLI, c628860OlY.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c628860OlY.LLILLL) && this.LLILZ == c628860OlY.LLILZ && Intrinsics.LJFF(this.LLILZIL, c628860OlY.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Integer> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Integer> c291001Au2 = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        Integer num = this.LLILZIL;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeDiggHistoryListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", scrollToPositionEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scrollToItemEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listLoadState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", likeCount=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C628920Ole> getListItemState() {
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
    public final C627660Ojc<C628920Ole> getListState() {
        return this.LL;
    }

    public /* synthetic */ C628860OlY(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null, null, EnumC628870OlZ.LOADING, null);
    }

    public C628860OlY(C627660Ojc<C628920Ole> c627660Ojc, C291001Au<Integer> c291001Au, C291001Au<Integer> c291001Au2, EnumC628870OlZ enumC628870OlZ, Integer num) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = enumC628870OlZ;
        this.LLILZIL = num;
    }

    public static C628860OlY LIZ(C628860OlY c628860OlY, C627660Ojc c627660Ojc, C291001Au c291001Au, EnumC628870OlZ enumC628870OlZ, Integer num, int i) {
        C291001Au<Integer> c291001Au2;
        Integer num2 = num;
        EnumC628870OlZ enumC628870OlZ2 = enumC628870OlZ;
        C291001Au c291001Au3 = c291001Au;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c628860OlY.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c628860OlY.LLILLJJLI;
        } else {
            c291001Au2 = null;
        }
        if ((i & 4) != 0) {
            c291001Au3 = c628860OlY.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC628870OlZ2 = c628860OlY.LLILZ;
        }
        if ((i & 16) != 0) {
            num2 = c628860OlY.LLILZIL;
        }
        c628860OlY.getClass();
        return new C628860OlY(c627660Ojc2, c291001Au2, c291001Au3, enumC628870OlZ2, num2);
    }
}
