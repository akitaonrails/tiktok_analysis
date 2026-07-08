package X;

import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Crp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326990Crp implements InterfaceC636340Oxc<C326990Crp, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public C291001Au<C1341850l1T> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C291001Au<Unit> LLILZ;
    public final C291001Au<Integer> LLILZIL;
    public final C291001Au<CommentSurpriseStruct> LLILZLL;

    public C326990Crp() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C326990Crp)) {
            return false;
        }
        C326990Crp c326990Crp = (C326990Crp) obj;
        return Intrinsics.LJFF(this.LL, c326990Crp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c326990Crp.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c326990Crp.LLILLL) && Intrinsics.LJFF(this.LLILZ, c326990Crp.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c326990Crp.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c326990Crp.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<C1341850l1T> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Unit> c291001Au3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Integer> c291001Au4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<CommentSurpriseStruct> c291001Au5 = this.LLILZLL;
        return iHashCode5 + (c291001Au5 != null ? c291001Au5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentListVMState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", insertIdResult=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loadingStatusInRefresh=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", triggerDNTToast=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", scrollState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", tryTriggerEasterEgg=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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

    public /* synthetic */ C326990Crp(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null, null, null, null, null);
    }

    public static C326990Crp LIZ(C326990Crp c326990Crp, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        C627660Ojc<InterfaceC1891350zJl> c627660Ojc;
        C291001Au<Boolean> c291001Au4;
        C291001Au c291001Au5 = c291001Au3;
        C291001Au c291001Au6 = c291001Au2;
        C291001Au c291001Au7 = c291001Au;
        C291001Au<Integer> c291001Au8 = null;
        if ((i & 1) != 0) {
            c627660Ojc = c326990Crp.LL;
        } else {
            c627660Ojc = null;
        }
        if ((i & 2) != 0) {
            c291001Au7 = c326990Crp.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au4 = c326990Crp.LLILLL;
        } else {
            c291001Au4 = null;
        }
        if ((i & 8) != 0) {
            c291001Au6 = c326990Crp.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au8 = c326990Crp.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au5 = c326990Crp.LLILZLL;
        }
        c326990Crp.getClass();
        return new C326990Crp(c627660Ojc, c291001Au7, c291001Au4, c291001Au6, c291001Au8, c291001Au5);
    }

    public C326990Crp(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, C291001Au<C1341850l1T> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<Integer> c291001Au4, C291001Au<CommentSurpriseStruct> c291001Au5) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
        this.LLILZLL = c291001Au5;
    }
}
