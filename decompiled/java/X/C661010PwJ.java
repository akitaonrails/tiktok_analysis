package X;

import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.GeccContentSellingPoint;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661010PwJ implements InterfaceC655260Pn2, InterfaceC435460H5s, InterfaceC655680Pni, InterfaceC655700Pnk, InterfaceC645880PVa {
    public final SearchMixFeedBase LL;
    public final Aweme LLILLJJLI;
    public final EnumC646330PWt LLILLL;
    public final C650430PfF LLILZ = new C650430PfF(new AwS589S0100000_10(this, 638));
    public final boolean LLILZIL = true;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1306));

    @Override // X.InterfaceC655680Pni
    public final boolean LLJLIL() {
        Integer num;
        List listLJIIJJI = C1697810uHb.LJIIJJI(2, 3, 4);
        EComShopCardStruct eComShopCardStruct = this.LL.shopCard;
        return listLJIIJJI.contains(Integer.valueOf((eComShopCardStruct == null || (num = eComShopCardStruct.shopCardLiveStyle) == null) ? -1 : num.intValue()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C661010PwJ)) {
            return false;
        }
        C661010PwJ c661010PwJ = (C661010PwJ) obj;
        return Intrinsics.LJFF(this.LL, c661010PwJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c661010PwJ.LLILLJJLI) && this.LLILLL == c661010PwJ.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        EnumC646330PWt enumC646330PWt = this.LLILLL;
        return iHashCode + (enumC646330PWt == null ? 0 : enumC646330PWt.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreCardRenderData(searchMixFeedBase=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EnumC662880PzK LIZIZ() {
        return (EnumC662880PzK) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC655680Pni
    public final String LJLLL() {
        String str;
        EComShopCardStruct eComShopCardStruct = this.LL.shopCard;
        return (eComShopCardStruct == null || (str = eComShopCardStruct.liveUserCountFormatted) == null) ? "" : str;
    }

    @Override // X.InterfaceC655680Pni
    public final GeccContentSellingPoint LLJJIJI() {
        return new GeccContentSellingPoint(null, null, null);
    }

    @Override // X.InterfaceC655700Pnk
    public final User getCurrentUser() {
        EComShopCardStruct eComShopCardStruct = this.LL.shopCard;
        if (eComShopCardStruct != null) {
            return eComShopCardStruct.userInfo;
        }
        return null;
    }

    public final String LIZ() {
        String metricsName;
        EnumC662880PzK enumC662880PzKLIZIZ = LIZIZ();
        return (enumC662880PzKLIZIZ == null || (metricsName = enumC662880PzKLIZIZ.getMetricsName()) == null) ? "" : metricsName;
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

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C661010PwJ(SearchMixFeedBase searchMixFeedBase, Aweme aweme, EnumC646330PWt enumC646330PWt) {
        this.LL = searchMixFeedBase;
        this.LLILLJJLI = aweme;
        this.LLILLL = enumC646330PWt;
    }
}
