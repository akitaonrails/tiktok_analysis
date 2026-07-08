package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.ECGuidanceCard;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612590O0z implements InterfaceC636340Oxc<C612590O0z, InterfaceC1891350zJl> {
    public final AbstractC1623806Xk<Boolean> LL;
    public final C627660Ojc<InterfaceC1891350zJl> LLILLJJLI;
    public final Integer LLILLL;
    public final C291001Au<ECGuidanceCard> LLILZ;
    public final AbstractC1623806Xk<Boolean> LLILZIL;

    public C612590O0z() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C612590O0z)) {
            return false;
        }
        C612590O0z c612590O0z = (C612590O0z) obj;
        return Intrinsics.LJFF(this.LL, c612590O0z.LL) && Intrinsics.LJFF(this.LLILLJJLI, c612590O0z.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c612590O0z.LLILLL) && Intrinsics.LJFF(this.LLILZ, c612590O0z.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c612590O0z.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        Integer num = this.LLILLL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C291001Au<ECGuidanceCard> c291001Au = this.LLILZ;
        return ((iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightsState(isEmptyList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", downloadProgress=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", highlightAutoPostGuide=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", autoPostSwitchReqState=");
        sbLIZ.append(this.LLILZIL);
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
        return this.LLILLJJLI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C612590O0z(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, new C627660Ojc(null, null, null, null, 15), null, null, c491101vh);
    }

    public C612590O0z(AbstractC1623806Xk<Boolean> abstractC1623806Xk, C627660Ojc<InterfaceC1891350zJl> c627660Ojc, Integer num, C291001Au<ECGuidanceCard> c291001Au, AbstractC1623806Xk<Boolean> abstractC1623806Xk2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = c627660Ojc;
        this.LLILLL = num;
        this.LLILZ = c291001Au;
        this.LLILZIL = abstractC1623806Xk2;
    }

    public static C612590O0z LIZ(C612590O0z c612590O0z, AbstractC1623806Xk abstractC1623806Xk, C627660Ojc c627660Ojc, Integer num, C291001Au c291001Au, AbstractC1623806Xk abstractC1623806Xk2, int i) {
        AbstractC1623806Xk abstractC1623806Xk3 = abstractC1623806Xk2;
        C291001Au c291001Au2 = c291001Au;
        Integer num2 = num;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk4 = c612590O0z.LL;
        }
        if ((i & 2) != 0) {
            c627660Ojc2 = c612590O0z.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            num2 = c612590O0z.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c612590O0z.LLILZ;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk3 = c612590O0z.LLILZIL;
        }
        c612590O0z.getClass();
        return new C612590O0z(abstractC1623806Xk4, c627660Ojc2, num2, c291001Au2, abstractC1623806Xk3);
    }
}
