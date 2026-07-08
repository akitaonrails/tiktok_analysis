package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s51, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1613130s51 implements InterfaceC636340Oxc<C1613130s51, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final AbstractC1623806Xk<C626160OhC> LLILLJJLI;
    public final AbstractC1623806Xk<C626160OhC> LLILLL;
    public final AbstractC1623806Xk<C626160OhC> LLILZ;
    public final CollectionDetailModel LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final int LLJ;

    public C1613130s51() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1613130s51)) {
            return false;
        }
        C1613130s51 c1613130s51 = (C1613130s51) obj;
        return Intrinsics.LJFF(this.LL, c1613130s51.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1613130s51.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1613130s51.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1613130s51.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1613130s51.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1613130s51.LLILZLL) && this.LLIZ == c1613130s51.LLIZ && this.LLIZLLLIL == c1613130s51.LLIZLLLIL && this.LLJ == c1613130s51.LLJ;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        CollectionDetailModel collectionDetailModel = this.LLILZIL;
        int iHashCode2 = (iHashCode + (collectionDetailModel == null ? 0 : collectionDetailModel.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.LLILZLL;
        return ((((((iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidContentPanelState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadMoreState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loadLatestState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", refreshState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", collectionDetail=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showFavoriteToastEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isFavorite=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", refund=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", listScrollIndex=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LL;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return this.LLILZ;
    }

    public /* synthetic */ C1613130s51(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C491101vh c491101vh = C491101vh.LIZ;
        this(c627660Ojc, c491101vh, c491101vh, c491101vh, null, null, false, false, 0);
    }

    public C1613130s51(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk3, CollectionDetailModel collectionDetailModel, C291001Au<Boolean> c291001Au, boolean z, boolean z2, int i) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
        this.LLILZ = abstractC1623806Xk3;
        this.LLILZIL = collectionDetailModel;
        this.LLILZLL = c291001Au;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = i;
    }

    public static C1613130s51 LIZ(C1613130s51 c1613130s51, C627660Ojc c627660Ojc, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, AbstractC1623806Xk abstractC1623806Xk3, CollectionDetailModel collectionDetailModel, C291001Au c291001Au, boolean z, boolean z2, int i) {
        int i2;
        boolean z3 = z2;
        boolean z4 = z;
        C291001Au c291001Au2 = c291001Au;
        CollectionDetailModel collectionDetailModel2 = collectionDetailModel;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk3;
        AbstractC1623806Xk abstractC1623806Xk5 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk6 = abstractC1623806Xk;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1613130s51.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk6 = c1613130s51.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk5 = c1613130s51.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk4 = c1613130s51.LLILZ;
        }
        if ((i & 16) != 0) {
            collectionDetailModel2 = c1613130s51.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au2 = c1613130s51.LLILZLL;
        }
        if ((i & 64) != 0) {
            z4 = c1613130s51.LLIZ;
        }
        if ((i & 128) != 0) {
            z3 = c1613130s51.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            i2 = c1613130s51.LLJ;
        } else {
            i2 = 0;
        }
        c1613130s51.getClass();
        return new C1613130s51(c627660Ojc2, abstractC1623806Xk6, abstractC1623806Xk5, abstractC1623806Xk4, collectionDetailModel2, c291001Au2, z4, z3, i2);
    }
}
