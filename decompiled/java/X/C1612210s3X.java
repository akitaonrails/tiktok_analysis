package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.iap.component.api.PaymentComponentResponse;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PaywallInfoModel;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s3X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612210s3X implements InterfaceC636340Oxc<C1612210s3X, C1611880s30> {
    public final C627660Ojc<C1611880s30> LL;
    public final AbstractC1623806Xk<C626160OhC> LLILLJJLI;
    public final AbstractC1623806Xk<C626160OhC> LLILLL;
    public final AbstractC1623806Xk<C626160OhC> LLILZ;
    public final AbstractC1623806Xk<PaidCollectionDetailResponse> LLILZIL;
    public final CollectionDetailModel LLILZLL;
    public final Integer LLIZ;
    public final List<PurchaseOption> LLIZLLLIL;
    public final Integer LLJ;
    public final String LLJI;
    public final C291001Au<Unit> LLJIJIL;
    public final Boolean LLJILJIL;
    public final Integer LLJILJILJ;
    public final String LLJILLL;
    public final Boolean LLJJ;
    public final C291001Au<Boolean> LLJJI;
    public final boolean LLJJIII;
    public final boolean LLJJIJI;
    public final int LLJJIJIIJIL;
    public final AbstractC1623806Xk<C626160OhC> LLJJIJIL;
    public final Integer LLJJJ;
    public final String LLJJJIL;
    public final boolean LLJJJJ;
    public final List<C1613030s4r> LLJJJJJIL;
    public final PaywallInfoModel LLJJJJLIIL;
    public final C1613030s4r LLJJL;
    public final String LLJJLIIIJLLLLLLLZ;
    public final List<VipSubscriptionPurchaseOption> LLJL;
    public final boolean LLJLIL;
    public final Aweme LLJLILLLLZIIL;
    public final C291001Au<Boolean> LLJLL;
    public final PaymentComponentResponse LLJLLIL;

    public C1612210s3X() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1612210s3X)) {
            return false;
        }
        C1612210s3X c1612210s3X = (C1612210s3X) obj;
        return Intrinsics.LJFF(this.LL, c1612210s3X.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1612210s3X.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1612210s3X.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1612210s3X.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1612210s3X.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1612210s3X.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1612210s3X.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1612210s3X.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1612210s3X.LLJ) && Intrinsics.LJFF(this.LLJI, c1612210s3X.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1612210s3X.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1612210s3X.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1612210s3X.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1612210s3X.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1612210s3X.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1612210s3X.LLJJI) && this.LLJJIII == c1612210s3X.LLJJIII && this.LLJJIJI == c1612210s3X.LLJJIJI && this.LLJJIJIIJIL == c1612210s3X.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, c1612210s3X.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c1612210s3X.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c1612210s3X.LLJJJIL) && this.LLJJJJ == c1612210s3X.LLJJJJ && Intrinsics.LJFF(this.LLJJJJJIL, c1612210s3X.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c1612210s3X.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c1612210s3X.LLJJL) && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c1612210s3X.LLJJLIIIJLLLLLLLZ) && Intrinsics.LJFF(this.LLJL, c1612210s3X.LLJL) && this.LLJLIL == c1612210s3X.LLJLIL && Intrinsics.LJFF(this.LLJLILLLLZIIL, c1612210s3X.LLJLILLLLZIIL) && Intrinsics.LJFF(this.LLJLL, c1612210s3X.LLJLL) && Intrinsics.LJFF(this.LLJLLIL, c1612210s3X.LLJLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        CollectionDetailModel collectionDetailModel = this.LLILZLL;
        int iHashCode2 = (iHashCode + (collectionDetailModel == null ? 0 : collectionDetailModel.hashCode())) * 31;
        Integer num = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<PurchaseOption> list = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.LLJ;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LLJI;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        C291001Au<Unit> c291001Au = this.LLJIJIL;
        int iHashCode7 = (iHashCode6 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        Boolean bool = this.LLJILJIL;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.LLJILJILJ;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.LLJILLL;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.LLJJ;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLJJI;
        int iHashCode12 = (((((((iHashCode11 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31) + this.LLJJIJIIJIL) * 31;
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = this.LLJJIJIL;
        int iHashCode13 = (iHashCode12 + (abstractC1623806Xk == null ? 0 : abstractC1623806Xk.hashCode())) * 31;
        Integer num4 = this.LLJJJ;
        int iHashCode14 = (iHashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.LLJJJIL;
        int iHashCode15 = (((iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJJ)) * 31;
        List<C1613030s4r> list2 = this.LLJJJJJIL;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PaywallInfoModel paywallInfoModel = this.LLJJJJLIIL;
        int iHashCode17 = (iHashCode16 + (paywallInfoModel == null ? 0 : paywallInfoModel.hashCode())) * 31;
        C1613030s4r c1613030s4r = this.LLJJL;
        int iHashCode18 = (iHashCode17 + (c1613030s4r == null ? 0 : c1613030s4r.hashCode())) * 31;
        String str4 = this.LLJJLIIIJLLLLLLLZ;
        int iHashCode19 = (iHashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<VipSubscriptionPurchaseOption> list3 = this.LLJL;
        int iHashCode20 = (((iHashCode19 + (list3 == null ? 0 : list3.hashCode())) * 31) + C786410Ut5.Z2(this.LLJLIL)) * 31;
        Aweme aweme = this.LLJLILLLLZIIL;
        int iHashCode21 = (iHashCode20 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLJLL;
        int iHashCode22 = (iHashCode21 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        PaymentComponentResponse paymentComponentResponse = this.LLJLLIL;
        return iHashCode22 + (paymentComponentResponse != null ? paymentComponentResponse.hashCode() : 0);
    }

    public final String toString() {
        return "PaidContentDetailVideoListFeedState(listState=" + this.LL + ", loadMoreState=" + this.LLILLJJLI + ", loadLatestState=" + this.LLILLL + ", refreshState=" + this.LLILZ + ", collectionDetailResponse=" + this.LLILZIL + ", collectionDetail=" + this.LLILZLL + ", firstUnpurchasedSeqId=" + this.LLIZ + ", purchaseOptions=" + this.LLIZLLLIL + ", preselectIndex=" + this.LLJ + ", preselectedAid=" + this.LLJI + ", miniDramaPurchaseClickEvent=" + this.LLJIJIL + ", hasIntroVideo=" + this.LLJILJIL + ", playingVideoIndex=" + this.LLJILJILJ + ", playingVideoAid=" + this.LLJILLL + ", isFirstVideoPlayed=" + this.LLJJ + ", showFavoriteToastEvent=" + this.LLJJI + ", isFavorite=" + this.LLJJIII + ", refund=" + this.LLJJIJI + ", orderSubmissionExpGroup=" + this.LLJJIJIIJIL + ", urlLessRequestState=" + this.LLJJIJIL + ", bizCode=" + this.LLJJJ + ", bizMessage=" + this.LLJJJIL + ", isNewPurchase=" + this.LLJJJJ + ", purchaseOptionMarketplacePrices=" + this.LLJJJJJIL + ", paywallInfoModel=" + this.LLJJJJLIIL + ", paywallInfoMarketplacePrice=" + this.LLJJL + ", purchaseSchema=" + this.LLJJLIIIJLLLLLLLZ + ", vipSubOptions=" + this.LLJL + ", shouldShowPurchasedExitFeedPopup=" + this.LLJLIL + ", curAweme=" + this.LLJLILLLLZIIL + ", updateDataListEvent=" + this.LLJLL + ", paymentComponentResponse=" + this.LLJLLIL + ')';
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1611880s30> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C1611880s30> getListState() {
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

    public /* synthetic */ C1612210s3X(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C491101vh c491101vh = C491101vh.LIZ;
        this(c627660Ojc, c491101vh, c491101vh, c491101vh, c491101vh, null, null, null, null, null, null, null, null, null, null, null, false, false, 1, null, 0, "", false, null, null, null, null, null, false, null, null, null);
    }

    public C1612210s3X(C627660Ojc<C1611880s30> c627660Ojc, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk3, AbstractC1623806Xk<PaidCollectionDetailResponse> abstractC1623806Xk4, CollectionDetailModel collectionDetailModel, Integer num, List<PurchaseOption> list, Integer num2, String str, C291001Au<Unit> c291001Au, Boolean bool, Integer num3, String str2, Boolean bool2, C291001Au<Boolean> c291001Au2, boolean z, boolean z2, int i, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk5, Integer num4, String str3, boolean z3, List<C1613030s4r> list2, PaywallInfoModel paywallInfoModel, C1613030s4r c1613030s4r, String str4, List<VipSubscriptionPurchaseOption> list3, boolean z4, Aweme aweme, C291001Au<Boolean> c291001Au3, PaymentComponentResponse paymentComponentResponse) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
        this.LLILZ = abstractC1623806Xk3;
        this.LLILZIL = abstractC1623806Xk4;
        this.LLILZLL = collectionDetailModel;
        this.LLIZ = num;
        this.LLIZLLLIL = list;
        this.LLJ = num2;
        this.LLJI = str;
        this.LLJIJIL = c291001Au;
        this.LLJILJIL = bool;
        this.LLJILJILJ = num3;
        this.LLJILLL = str2;
        this.LLJJ = bool2;
        this.LLJJI = c291001Au2;
        this.LLJJIII = z;
        this.LLJJIJI = z2;
        this.LLJJIJIIJIL = i;
        this.LLJJIJIL = abstractC1623806Xk5;
        this.LLJJJ = num4;
        this.LLJJJIL = str3;
        this.LLJJJJ = z3;
        this.LLJJJJJIL = list2;
        this.LLJJJJLIIL = paywallInfoModel;
        this.LLJJL = c1613030s4r;
        this.LLJJLIIIJLLLLLLLZ = str4;
        this.LLJL = list3;
        this.LLJLIL = z4;
        this.LLJLILLLLZIIL = aweme;
        this.LLJLL = c291001Au3;
        this.LLJLLIL = paymentComponentResponse;
    }

    public static C1612210s3X LIZ(C1612210s3X c1612210s3X, C627660Ojc c627660Ojc, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, AbstractC1623806Xk abstractC1623806Xk3, AbstractC1623806Xk abstractC1623806Xk4, CollectionDetailModel collectionDetailModel, Integer num, List list, Integer num2, String str, C291001Au c291001Au, Boolean bool, Integer num3, String str2, Boolean bool2, boolean z, boolean z2, AbstractC1623806Xk abstractC1623806Xk5, Integer num4, String str3, boolean z3, List list2, PaywallInfoModel paywallInfoModel, C1613030s4r c1613030s4r, String str4, List list3, boolean z4, Aweme aweme, C291001Au c291001Au2, PaymentComponentResponse paymentComponentResponse, int i) {
        C291001Au<Boolean> c291001Au3;
        int i2;
        PaymentComponentResponse paymentComponentResponse2 = paymentComponentResponse;
        Aweme aweme2 = aweme;
        boolean z5 = z4;
        String str5 = str4;
        String str6 = str;
        boolean z6 = z3;
        Integer num5 = num4;
        boolean z7 = z2;
        Boolean bool3 = bool2;
        CollectionDetailModel collectionDetailModel2 = collectionDetailModel;
        AbstractC1623806Xk abstractC1623806Xk6 = abstractC1623806Xk5;
        C1613030s4r c1613030s4r2 = c1613030s4r;
        String str7 = str2;
        PaywallInfoModel paywallInfoModel2 = paywallInfoModel;
        Integer num6 = num3;
        Boolean bool4 = bool;
        C291001Au c291001Au4 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk7 = abstractC1623806Xk;
        boolean z8 = z;
        String str8 = str3;
        Integer num7 = num2;
        List list4 = list;
        Integer num8 = num;
        C291001Au c291001Au5 = c291001Au2;
        AbstractC1623806Xk abstractC1623806Xk8 = abstractC1623806Xk4;
        List list5 = list2;
        AbstractC1623806Xk abstractC1623806Xk9 = abstractC1623806Xk3;
        AbstractC1623806Xk abstractC1623806Xk10 = abstractC1623806Xk2;
        List list6 = list3;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1612210s3X.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk7 = c1612210s3X.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk10 = c1612210s3X.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk9 = c1612210s3X.LLILZ;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk8 = c1612210s3X.LLILZIL;
        }
        if ((i & 32) != 0) {
            collectionDetailModel2 = c1612210s3X.LLILZLL;
        }
        if ((i & 64) != 0) {
            num8 = c1612210s3X.LLIZ;
        }
        if ((i & 128) != 0) {
            list4 = c1612210s3X.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            num7 = c1612210s3X.LLJ;
        }
        if ((i & 512) != 0) {
            str6 = c1612210s3X.LLJI;
        }
        if ((i & 1024) != 0) {
            c291001Au4 = c1612210s3X.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool4 = c1612210s3X.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num6 = c1612210s3X.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            str7 = c1612210s3X.LLJILLL;
        }
        if ((i & 16384) != 0) {
            bool3 = c1612210s3X.LLJJ;
        }
        if ((32768 & i) != 0) {
            c291001Au3 = c1612210s3X.LLJJI;
        } else {
            c291001Au3 = null;
        }
        if ((65536 & i) != 0) {
            z8 = c1612210s3X.LLJJIII;
        }
        if ((131072 & i) != 0) {
            z7 = c1612210s3X.LLJJIJI;
        }
        if ((262144 & i) != 0) {
            i2 = c1612210s3X.LLJJIJIIJIL;
        } else {
            i2 = 0;
        }
        if ((524288 & i) != 0) {
            abstractC1623806Xk6 = c1612210s3X.LLJJIJIL;
        }
        if ((1048576 & i) != 0) {
            num5 = c1612210s3X.LLJJJ;
        }
        if ((2097152 & i) != 0) {
            str8 = c1612210s3X.LLJJJIL;
        }
        if ((4194304 & i) != 0) {
            z6 = c1612210s3X.LLJJJJ;
        }
        if ((8388608 & i) != 0) {
            list5 = c1612210s3X.LLJJJJJIL;
        }
        if ((16777216 & i) != 0) {
            paywallInfoModel2 = c1612210s3X.LLJJJJLIIL;
        }
        if ((33554432 & i) != 0) {
            c1613030s4r2 = c1612210s3X.LLJJL;
        }
        if ((67108864 & i) != 0) {
            str5 = c1612210s3X.LLJJLIIIJLLLLLLLZ;
        }
        if ((134217728 & i) != 0) {
            list6 = c1612210s3X.LLJL;
        }
        if ((268435456 & i) != 0) {
            z5 = c1612210s3X.LLJLIL;
        }
        if ((536870912 & i) != 0) {
            aweme2 = c1612210s3X.LLJLILLLLZIIL;
        }
        if ((1073741824 & i) != 0) {
            c291001Au5 = c1612210s3X.LLJLL;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            paymentComponentResponse2 = c1612210s3X.LLJLLIL;
        }
        c1612210s3X.getClass();
        String str9 = str8;
        boolean z9 = z6;
        List list7 = list5;
        PaywallInfoModel paywallInfoModel3 = paywallInfoModel2;
        C1613030s4r c1613030s4r3 = c1613030s4r2;
        String str10 = str5;
        List list8 = list6;
        boolean z10 = z5;
        Aweme aweme3 = aweme2;
        C291001Au c291001Au6 = c291001Au5;
        PaymentComponentResponse paymentComponentResponse3 = paymentComponentResponse2;
        return new C1612210s3X(c627660Ojc2, abstractC1623806Xk7, abstractC1623806Xk10, abstractC1623806Xk9, abstractC1623806Xk8, collectionDetailModel2, num8, list4, num7, str6, c291001Au4, bool4, num6, str7, bool3, c291001Au3, z8, z7, i2, abstractC1623806Xk6, num5, str9, z9, list7, paywallInfoModel3, c1613030s4r3, str10, list8, z10, aweme3, c291001Au6, paymentComponentResponse3);
    }
}
