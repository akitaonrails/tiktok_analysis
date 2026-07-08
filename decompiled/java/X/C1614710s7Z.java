package X;

import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s7Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614710s7Z implements InterfaceC636340Oxc<C1614710s7Z, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final VipSubscriptionDetailResponse LLILLJJLI;
    public final EnumC1614730s7b LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public final EnumC1614900s7s LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final Map<String, String> LLJ;
    public final Map<String, IapSubscriptionProduct> LLJI;
    public final Map<String, String> LLJIJIL;
    public final Map<String, String> LLJILJIL;
    public final List<C1573110r2T> LLJILJILJ;
    public final List<C1612820s4W> LLJILLL;
    public final C291001Au<InterfaceC1615120s8E> LLJJ;
    public final AbstractC1623806Xk<C626160OhC> LLJJI;
    public final boolean LLJJIII;
    public final String LLJJIJI;
    public final String LLJJIJIIJIL;

    public C1614710s7Z() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1614710s7Z)) {
            return false;
        }
        C1614710s7Z c1614710s7Z = (C1614710s7Z) obj;
        return Intrinsics.LJFF(this.LL, c1614710s7Z.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1614710s7Z.LLILLJJLI) && this.LLILLL == c1614710s7Z.LLILLL && Intrinsics.LJFF(this.LLILZ, c1614710s7Z.LLILZ) && this.LLILZIL == c1614710s7Z.LLILZIL && this.LLILZLL == c1614710s7Z.LLILZLL && this.LLIZ == c1614710s7Z.LLIZ && this.LLIZLLLIL == c1614710s7Z.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1614710s7Z.LLJ) && Intrinsics.LJFF(this.LLJI, c1614710s7Z.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1614710s7Z.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1614710s7Z.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1614710s7Z.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1614710s7Z.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1614710s7Z.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1614710s7Z.LLJJI) && this.LLJJIII == c1614710s7Z.LLJJIII && Intrinsics.LJFF(this.LLJJIJI, c1614710s7Z.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1614710s7Z.LLJJIJIIJIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = this.LLILLJJLI;
        int iHashCode2 = (((((((iHashCode + (vipSubscriptionDetailResponse == null ? 0 : vipSubscriptionDetailResponse.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        EnumC1614900s7s enumC1614900s7s = this.LLILZLL;
        int iHashCode3 = (((((((((((((((((iHashCode2 + (enumC1614900s7s == null ? 0 : enumC1614900s7s.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + this.LLJILLL.hashCode()) * 31;
        C291001Au<InterfaceC1615120s8E> c291001Au = this.LLJJ;
        return ((((((((iHashCode3 + (c291001Au != null ? c291001Au.hashCode() : 0)) * 31) + this.LLJJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + this.LLJJIJI.hashCode()) * 31) + this.LLJJIJIIJIL.hashCode();
    }

    public final String toString() {
        return "SeriesVipSubscriptionState(listState=" + this.LL + ", response=" + this.LLILLJJLI + ", pageState=" + this.LLILLL + ", selectedPlanId=" + this.LLILZ + ", ctaLoading=" + this.LLILZIL + ", ctaLoadingType=" + this.LLILZLL + ", cancelLoading=" + this.LLIZ + ", manageActionsDisabled=" + this.LLIZLLLIL + ", marketplacePriceMap=" + this.LLJ + ", marketplaceMatchedOfferMap=" + this.LLJI + ", marketplaceCurrencyCodeMap=" + this.LLJIJIL + ", marketplaceClientParamMap=" + this.LLJILJIL + ", trending=" + this.LLJILJILJ + ", marketplaceSubscriptionOptions=" + this.LLJILLL + ", uiEvent=" + this.LLJJ + ", statusRefreshState=" + this.LLJJI + ", awaitingMarketplacePrices=" + this.LLJJIII + ", enterFrom=" + this.LLJJIJI + ", collectionId=" + this.LLJJIJIIJIL + ')';
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

    public C1614710s7Z(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        EnumC1614730s7b enumC1614730s7b = EnumC1614730s7b.NEW_USER;
        Map mapLJ = C2097608Jq.LJ();
        Map mapLJ2 = C2097608Jq.LJ();
        Map mapLJ3 = C2097608Jq.LJ();
        Map mapLJ4 = C2097608Jq.LJ();
        C13BV c13bv = C13BV.INSTANCE;
        this(c627660Ojc, null, enumC1614730s7b, "", false, null, false, false, mapLJ, mapLJ2, mapLJ3, mapLJ4, c13bv, c13bv, null, C491101vh.LIZ, false, "", "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1614710s7Z(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, VipSubscriptionDetailResponse vipSubscriptionDetailResponse, EnumC1614730s7b enumC1614730s7b, String str, boolean z, EnumC1614900s7s enumC1614900s7s, boolean z2, boolean z3, Map<String, String> map, Map<String, IapSubscriptionProduct> map2, Map<String, String> map3, Map<String, String> map4, List<C1573110r2T> list, List<C1612820s4W> list2, C291001Au<? extends InterfaceC1615120s8E> c291001Au, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk, boolean z4, String str2, String str3) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = vipSubscriptionDetailResponse;
        this.LLILLL = enumC1614730s7b;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = enumC1614900s7s;
        this.LLIZ = z2;
        this.LLIZLLLIL = z3;
        this.LLJ = map;
        this.LLJI = map2;
        this.LLJIJIL = map3;
        this.LLJILJIL = map4;
        this.LLJILJILJ = list;
        this.LLJILLL = list2;
        this.LLJJ = c291001Au;
        this.LLJJI = abstractC1623806Xk;
        this.LLJJIII = z4;
        this.LLJJIJI = str2;
        this.LLJJIJIIJIL = str3;
    }

    public static C1614710s7Z LIZ(C1614710s7Z c1614710s7Z, C627660Ojc c627660Ojc, VipSubscriptionDetailResponse vipSubscriptionDetailResponse, EnumC1614730s7b enumC1614730s7b, String str, boolean z, EnumC1614900s7s enumC1614900s7s, boolean z2, boolean z3, Map map, Map map2, Map map3, Map map4, List list, List list2, C291001Au c291001Au, boolean z4, String str2, String str3, int i) {
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk;
        String str4 = str3;
        String str5 = str2;
        List list3 = list;
        boolean z5 = z4;
        Map map5 = map4;
        Map map6 = map3;
        Map map7 = map2;
        Map map8 = map;
        boolean z6 = z3;
        boolean z7 = z2;
        EnumC1614900s7s enumC1614900s7s2 = enumC1614900s7s;
        boolean z8 = z;
        C291001Au c291001Au2 = c291001Au;
        String str6 = str;
        EnumC1614730s7b enumC1614730s7b2 = enumC1614730s7b;
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse2 = vipSubscriptionDetailResponse;
        List list4 = list2;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1614710s7Z.LL;
        }
        if ((i & 2) != 0) {
            vipSubscriptionDetailResponse2 = c1614710s7Z.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            enumC1614730s7b2 = c1614710s7Z.LLILLL;
        }
        if ((i & 8) != 0) {
            str6 = c1614710s7Z.LLILZ;
        }
        if ((i & 16) != 0) {
            z8 = c1614710s7Z.LLILZIL;
        }
        if ((i & 32) != 0) {
            enumC1614900s7s2 = c1614710s7Z.LLILZLL;
        }
        if ((i & 64) != 0) {
            z7 = c1614710s7Z.LLIZ;
        }
        if ((i & 128) != 0) {
            z6 = c1614710s7Z.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            map8 = c1614710s7Z.LLJ;
        }
        if ((i & 512) != 0) {
            map7 = c1614710s7Z.LLJI;
        }
        if ((i & 1024) != 0) {
            map6 = c1614710s7Z.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            map5 = c1614710s7Z.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            list3 = c1614710s7Z.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            list4 = c1614710s7Z.LLJILLL;
        }
        if ((i & 16384) != 0) {
            c291001Au2 = c1614710s7Z.LLJJ;
        }
        if ((32768 & i) != 0) {
            abstractC1623806Xk = c1614710s7Z.LLJJI;
        } else {
            abstractC1623806Xk = null;
        }
        if ((i & 65536) != 0) {
            z5 = c1614710s7Z.LLJJIII;
        }
        if ((i & 131072) != 0) {
            str5 = c1614710s7Z.LLJJIJI;
        }
        if ((i & 262144) != 0) {
            str4 = c1614710s7Z.LLJJIJIIJIL;
        }
        c1614710s7Z.getClass();
        String str7 = str6;
        boolean z9 = z8;
        return new C1614710s7Z(c627660Ojc2, vipSubscriptionDetailResponse2, enumC1614730s7b2, str7, z9, enumC1614900s7s2, z7, z6, map8, map7, map6, map5, list3, list4, c291001Au2, abstractC1623806Xk, z5, str5, str4);
    }
}
