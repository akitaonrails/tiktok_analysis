package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveDropsRoomInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.search.GeccContentSellingPoint;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655000Pmc implements InterfaceC435460H5s, InterfaceC655680Pni, InterfaceC655730Pnn, InterfaceC645880PVa, InterfaceC655260Pn2, InterfaceC655340PnA {
    public final SearchMixFeed LL;
    public final Aweme LLILLJJLI;
    public final InterfaceC655070Pmj LLILLL;
    public final C650430PfF LLILZ = new C650430PfF(new AwS589S0100000_10(this, 582));
    public final boolean LLILZIL = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C655000Pmc)) {
            return false;
        }
        C655000Pmc c655000Pmc = (C655000Pmc) obj;
        return Intrinsics.LJFF(this.LL, c655000Pmc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c655000Pmc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c655000Pmc.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        InterfaceC655070Pmj interfaceC655070Pmj = this.LLILLL;
        return iHashCode + (interfaceC655070Pmj == null ? 0 : interfaceC655070Pmj.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchMixLiveCardRenderData(searchMixFeed=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC655680Pni
    public final String LJLLL() {
        return C656400Pos.LIZ(this.LLILLJJLI);
    }

    @Override // X.InterfaceC655680Pni
    public final GeccContentSellingPoint LLJJIJI() {
        GeccContentSellingPoint geccContentSellingPoint = this.LLILLJJLI.getGeccContentSellingPoint();
        return geccContentSellingPoint == null ? new GeccContentSellingPoint(null, null, null) : geccContentSellingPoint;
    }

    @Override // X.InterfaceC655680Pni
    public final boolean LLJLIL() {
        return this.LLILLJJLI.getIsLiveHasProduct();
    }

    @Override // X.InterfaceC655730Pnn
    public final InterfaceC655080Pmk getAnchorType() {
        List<Product> productsInfo;
        LiveDropsRoomInfo liveDropsRoomInfo;
        Aweme aweme = this.LLILLJJLI;
        if (aweme.isAd() || ((productsInfo = aweme.getProductsInfo()) != null && productsInfo.size() > 0)) {
            return C655090Pml.LIZ;
        }
        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        return (newLiveRoomDataExt == null || (liveDropsRoomInfo = newLiveRoomDataExt.dropsRoomInfo) == null) ? C655090Pml.LIZ : new C655100Pmm(liveDropsRoomInfo);
    }

    @Override // X.InterfaceC655260Pn2
    public final SearchMixFeedBase LJJIIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC645880PVa
    public final C650430PfF LLIZLLLIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC645880PVa
    public final boolean LLJJJIL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC435460H5s
    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC655340PnA
    public final InterfaceC655070Pmj getReason() {
        return this.LLILLL;
    }

    public final void LIZLLL(C07XJ c07xj) {
        if (C0PI4.LJ(this.LLILLJJLI)) {
            LIZIZ(c07xj, this.LLILLJJLI, "is_inner");
            LIZIZ(c07xj, this.LLILLJJLI, "inner_search_id");
            LIZIZ(c07xj, this.LLILLJJLI, "rank_inner");
            c07xj.LIZ("is_slide", CardStruct.IStatusCode.DEFAULT);
            c07xj.LIZ("slide_rank", CardStruct.IStatusCode.DEFAULT);
        }
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public static String LIZ(C655000Pmc c655000Pmc, Aweme aweme) {
        Product product;
        int iLIZ = C293650Bf9.LIZ();
        c655000Pmc.getClass();
        List<Product> productsInfo = aweme.getProductsInfo();
        if (productsInfo != null && (product = (Product) C13LP.LJJJLL(productsInfo)) != null && ((IEcomGeneralSearchService) ServiceManager.get().getService(IEcomGeneralSearchService.class)).LJIIL(product)) {
            if (((IEcomGeneralSearchService) ServiceManager.get().getService(IEcomGeneralSearchService.class)).LIZ(product)) {
                return "search_live_single_entrance_with_discount";
            }
            return "search_live_single_entrance_without_discount";
        }
        List<Product> productsInfo2 = aweme.getProductsInfo();
        if (productsInfo2 != null && !productsInfo2.isEmpty() && C0BT5.LIZ() && !aweme.isAd()) {
            if (iLIZ != 4 && iLIZ != 5) {
                if (iLIZ == 6) {
                    return "search_live_shownow_banner";
                }
                if (iLIZ == 8) {
                    return "search_live_single_entrance";
                }
                return "search_live_merge_entrance";
            }
            return "search_live_single_anchor";
        }
        return "";
    }

    public C655000Pmc(SearchMixFeed searchMixFeed, Aweme aweme, InterfaceC655070Pmj interfaceC655070Pmj) {
        this.LL = searchMixFeed;
        this.LLILLJJLI = aweme;
        this.LLILLL = interfaceC655070Pmj;
    }

    public static final void LIZIZ(C07XJ c07xj, Aweme aweme, String str) {
        String str2;
        HashMap<String, String> mobParams = aweme.getMobParams();
        if (mobParams != null && (str2 = mobParams.get(str)) != null) {
            c07xj.LIZ(str, str2);
        }
    }
}
