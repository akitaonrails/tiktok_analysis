package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326220Cqa implements InterfaceC636340Oxc<C326220Cqa, C207700r5> {
    public final C291001Au<Integer> LL;
    public final C627660Ojc<C207700r5> LLILLJJLI;

    public C326220Cqa() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C326220Cqa)) {
            return false;
        }
        C326220Cqa c326220Cqa = (C326220Cqa) obj;
        return Intrinsics.LJFF(this.LL, c326220Cqa.LL) && Intrinsics.LJFF(this.LLILLJJLI, c326220Cqa.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<Integer> c291001Au = this.LL;
        return ((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameMixVideoListVMState(scrollToPositionEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C207700r5> getListItemState() {
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
    public final C627660Ojc<C207700r5> getListState() {
        return this.LLILLJJLI;
    }

    public /* synthetic */ C326220Cqa(int i) {
        this(null, new C627660Ojc(null, null, null, null, 15));
    }

    public C326220Cqa(C291001Au<Integer> c291001Au, C627660Ojc<C207700r5> c627660Ojc) {
        this.LL = c291001Au;
        this.LLILLJJLI = c627660Ojc;
    }
}
