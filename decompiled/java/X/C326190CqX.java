package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326190CqX implements InterfaceC636340Oxc<C326190CqX, C1906070zhV> {
    public final C291001Au<Integer> LL;
    public final AbstractC1623806Xk<Integer> LLILLJJLI;
    public final C627660Ojc<C1906070zhV> LLILLL;

    public C326190CqX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C326190CqX)) {
            return false;
        }
        C326190CqX c326190CqX = (C326190CqX) obj;
        return Intrinsics.LJFF(this.LL, c326190CqX.LL) && Intrinsics.LJFF(this.LLILLJJLI, c326190CqX.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c326190CqX.LLILLL);
    }

    public final int hashCode() {
        C291001Au<Integer> c291001Au = this.LL;
        return ((((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlyVideoListVMState(scrollToPositionEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", creatorSovState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1906070zhV> getListItemState() {
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
    public final C627660Ojc<C1906070zhV> getListState() {
        return this.LLILLL;
    }

    public /* synthetic */ C326190CqX(int i) {
        this(null, C491101vh.LIZ, new C627660Ojc(null, null, null, null, 15));
    }

    public C326190CqX(C291001Au<Integer> c291001Au, AbstractC1623806Xk<Integer> abstractC1623806Xk, C627660Ojc<C1906070zhV> c627660Ojc) {
        this.LL = c291001Au;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = c627660Ojc;
    }

    public static C326190CqX LIZ(C326190CqX c326190CqX, C1623606Xi c1623606Xi, C627660Ojc c627660Ojc, int i) {
        C291001Au<Integer> c291001Au;
        if ((i & 1) != 0) {
            c291001Au = c326190CqX.LL;
        } else {
            c291001Au = null;
        }
        AbstractC1623806Xk<Integer> abstractC1623806Xk = c1623606Xi;
        if ((i & 2) != 0) {
            abstractC1623806Xk = c326190CqX.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c627660Ojc = c326190CqX.LLILLL;
        }
        c326190CqX.getClass();
        return new C326190CqX(c291001Au, abstractC1623806Xk, c627660Ojc);
    }
}
