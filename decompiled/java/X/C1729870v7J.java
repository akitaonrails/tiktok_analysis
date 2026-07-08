package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TopBannerInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v7J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729870v7J implements InterfaceC636340Oxc<C1729870v7J, InterfaceC1891350zJl> {
    public final AbstractC1623806Xk<Boolean> LL;
    public final AbstractC1623806Xk<Boolean> LLILLJJLI;
    public final C627660Ojc<InterfaceC1891350zJl> LLILLL;
    public final String LLILZ;
    public final AbstractC1623806Xk<Boolean> LLILZIL;
    public final TopBannerInfo LLILZLL;
    public final AbstractC1623806Xk<Boolean> LLIZ;

    public C1729870v7J() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1729870v7J)) {
            return false;
        }
        C1729870v7J c1729870v7J = (C1729870v7J) obj;
        return Intrinsics.LJFF(this.LL, c1729870v7J.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1729870v7J.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1729870v7J.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1729870v7J.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1729870v7J.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1729870v7J.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1729870v7J.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        TopBannerInfo topBannerInfo = this.LLILZLL;
        return ((iHashCode2 + (topBannerInfo != null ? topBannerInfo.hashCode() : 0)) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplatesState(useEffectStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cancelDisplayStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", toastContent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", loadingStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", bannerInfo=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", useBannerStatus=");
        sbLIZ.append(this.LLIZ);
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
        return this.LLILLL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1729870v7J(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, new C627660Ojc(null, null, null, null, 15), null, c491101vh, null, c491101vh);
    }

    public C1729870v7J(AbstractC1623806Xk<Boolean> abstractC1623806Xk, AbstractC1623806Xk<Boolean> abstractC1623806Xk2, C627660Ojc<InterfaceC1891350zJl> c627660Ojc, String str, AbstractC1623806Xk<Boolean> abstractC1623806Xk3, TopBannerInfo topBannerInfo, AbstractC1623806Xk<Boolean> abstractC1623806Xk4) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = c627660Ojc;
        this.LLILZ = str;
        this.LLILZIL = abstractC1623806Xk3;
        this.LLILZLL = topBannerInfo;
        this.LLIZ = abstractC1623806Xk4;
    }

    public static C1729870v7J LIZ(C1729870v7J c1729870v7J, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, C627660Ojc c627660Ojc, String str, AbstractC1623806Xk abstractC1623806Xk3, TopBannerInfo topBannerInfo, C1623606Xi c1623606Xi, int i) {
        AbstractC1623806Xk<Boolean> abstractC1623806Xk4 = c1623606Xi;
        TopBannerInfo topBannerInfo2 = topBannerInfo;
        AbstractC1623806Xk abstractC1623806Xk5 = abstractC1623806Xk3;
        String str2 = str;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        AbstractC1623806Xk abstractC1623806Xk6 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk7 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk7 = c1729870v7J.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk6 = c1729870v7J.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c627660Ojc2 = c1729870v7J.LLILLL;
        }
        if ((i & 8) != 0) {
            str2 = c1729870v7J.LLILZ;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk5 = c1729870v7J.LLILZIL;
        }
        if ((i & 32) != 0) {
            topBannerInfo2 = c1729870v7J.LLILZLL;
        }
        if ((i & 64) != 0) {
            abstractC1623806Xk4 = c1729870v7J.LLIZ;
        }
        c1729870v7J.getClass();
        return new C1729870v7J(abstractC1623806Xk7, abstractC1623806Xk6, c627660Ojc2, str2, abstractC1623806Xk5, topBannerInfo2, abstractC1623806Xk4);
    }
}
