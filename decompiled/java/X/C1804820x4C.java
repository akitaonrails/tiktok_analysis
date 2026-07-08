package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.CurrencyPriceItem;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.profit.IapListResult;
import webcast.api.profit.ListV3Result;
import webcast.data.FXRate;

/* JADX INFO: renamed from: X.0x4C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804820x4C extends C1804840x4E {
    public final List<Diamond> LJFF;
    public final IapListResult.ListResultExtra LJI;
    public final List<Diamond> LJII;
    public final List<Diamond> LJIIIIZZ;
    public final ListV3Result.Extra LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1804820x4C)) {
            return false;
        }
        C1804820x4C c1804820x4C = (C1804820x4C) obj;
        return Intrinsics.LJFF(this.LJFF, c1804820x4C.LJFF) && Intrinsics.LJFF(this.LJI, c1804820x4C.LJI) && Intrinsics.LJFF(this.LJII, c1804820x4C.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1804820x4C.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1804820x4C.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1804820x4C.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = this.LJFF.hashCode() * 31;
        IapListResult.ListResultExtra listResultExtra = this.LJI;
        int iHashCode2 = (((iHashCode + (listResultExtra == null ? 0 : listResultExtra.hashCode())) * 31) + this.LJII.hashCode()) * 31;
        List<Diamond> list = this.LJIIIIZZ;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ListV3Result.Extra extra = this.LJIIIZ;
        return ((iHashCode3 + (extra != null ? extra.hashCode() : 0)) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiamondQueryDataV3(diamonds=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", invalidDiamonds=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", diamondsV3=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", extraV3=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", initPanelChannel=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1804840x4E
    public final Diamond LIZJ() {
        Diamond diamond;
        List<Diamond> list = this.LJIIIIZZ;
        if (list == null || (diamond = (Diamond) C13LP.LJJLIIIJL(list)) == null || !diamond.LIZ()) {
            return null;
        }
        return diamond;
    }

    @Override // X.C1804840x4E
    public final int LJIILIIL() {
        List<Diamond> list = this.LJIIIIZZ;
        return Math.max(list != null ? list.size() : 0, this.LJFF.size());
    }

    @Override // X.C1804840x4E
    public final Long LJIILJJIL() {
        ListV3Result.Extra extra = this.LJIIIZ;
        if (extra != null) {
            return Long.valueOf(extra.recentlyPurchasedPacketId);
        }
        return null;
    }

    @Override // X.C1804840x4E
    public final boolean LJIIZILJ() {
        List<Diamond> list = this.LJIIIIZZ;
        return (list == null || list.isEmpty()) && this.LJFF.isEmpty();
    }

    @Override // X.C1804840x4E
    public final boolean LJIJ() {
        ListV3Result.Extra extra = this.LJIIIZ;
        if (extra != null) {
            return extra.isNewRecommendPackage;
        }
        return false;
    }

    @Override // X.C1804840x4E
    public final boolean LJIJI() {
        ListV3Result.Extra extra = this.LJIIIZ;
        return C500260Jjc.LJJJI(extra != null ? Boolean.valueOf(extra.isRechargeV3) : null);
    }

    @Override // X.C1804840x4E
    public final boolean LJIJJLI() {
        if (this.LJIIIIZZ == null || !(!r0.isEmpty()) || !(!this.LJFF.isEmpty()) || !LJIJI()) {
            return false;
        }
        ListV3Result.Extra extra = this.LJIIIZ;
        return C500260Jjc.LJJJI(extra != null ? Boolean.valueOf(extra.isIapEnabled) : null);
    }

    public final Integer LJIL() {
        ListV3Result.Extra extra = this.LJIIIZ;
        if (extra != null) {
            return Integer.valueOf(extra.rechargeV3Version);
        }
        return null;
    }

    public final boolean LJJ() {
        ListV3Result.Extra extra = this.LJIIIZ;
        return C500260Jjc.LJJJI(extra != null ? Boolean.valueOf(extra.hasPipoRechargeBefore) : null);
    }

    @Override // X.C1804840x4E
    public final String LJIIIIZZ() {
        InterfaceC1803290x1j rechargeService;
        String strLIZ;
        if (LJIJJLI()) {
            IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
            return (iWalletService == null || (rechargeService = iWalletService.getRechargeService()) == null || (strLIZ = rechargeService.LIZ()) == null) ? this.LJIIJ : strLIZ;
        }
        if (!this.LJFF.isEmpty()) {
            ListV3Result.Extra extra = this.LJIIIZ;
            if (!C500260Jjc.LJJIFFI(extra != null ? Boolean.valueOf(extra.isIapEnabled) : null)) {
                return "google_play";
            }
        }
        List<Diamond> list = this.LJIIIIZZ;
        return C500260Jjc.LJJJI(list != null ? Boolean.valueOf(list.isEmpty() ^ true) : null) ? "tiktok" : "google_play";
    }

    @Override // X.C1804840x4E
    public final boolean LJIJJ() {
        if (!LJIJJLI()) {
            return false;
        }
        C1804190x3B c1804190x3B = EnumC1804200x3C.Companion;
        Integer numLJIL = LJIL();
        c1804190x3B.getClass();
        return C1804190x3B.LIZ(numLJIL);
    }

    @Override // X.C1804840x4E
    public final List<Diamond> LJ() {
        return this.LJFF;
    }

    @Override // X.C1804840x4E
    public final IapListResult.ListResultExtra LJII() {
        return this.LJI;
    }

    @Override // X.C1804840x4E
    public final List<Diamond> LJIIIZ() {
        return this.LJII;
    }

    @Override // X.C1804840x4E
    public final Diamond LIZLLL(String str) {
        List<Diamond> list = this.LJIIIIZZ;
        if (list != null) {
            for (Diamond diamond : list) {
                if (C2093608Ic.LIZJ(diamond.iapId, str)) {
                    return diamond;
                }
            }
        }
        for (Diamond diamond2 : this.LJFF) {
            if (C2093608Ic.LIZJ(diamond2.iapId, str)) {
                return diamond2;
            }
        }
        return null;
    }

    @Override // X.C1804840x4E
    public final List<Diamond> LJIIJ(String str) {
        if (!LJIJI()) {
            return LJ();
        }
        if (Intrinsics.LJFF(str, "tiktok")) {
            return this.LJIIIIZZ;
        }
        return this.LJFF;
    }

    @Override // X.C1804840x4E
    public final Long LJIILL(String str) {
        if (!LJIJI()) {
            return super.LJIILL(str);
        }
        if (Intrinsics.LJFF(str, "tiktok")) {
            ListV3Result.Extra extra = this.LJIIIZ;
            if (extra == null) {
                return null;
            }
            return Long.valueOf(extra.recommendedPacketIdV3);
        }
        ListV3Result.Extra extra2 = this.LJIIIZ;
        if (extra2 == null) {
            return null;
        }
        return Long.valueOf(extra2.recommendedPacketId);
    }

    @Override // X.C1804840x4E
    public final List<IapListResult.VoucherItem> LJIILLIIL(String str) {
        if (!LJIJI()) {
            return super.LJIILLIIL(str);
        }
        if (Intrinsics.LJFF(str, "tiktok")) {
            ListV3Result.Extra extra = this.LJIIIZ;
            if (extra == null) {
                return null;
            }
            return extra.voucherListV3;
        }
        ListV3Result.Extra extra2 = this.LJIIIZ;
        if (extra2 == null) {
            return null;
        }
        return extra2.voucherList;
    }

    @Override // X.C1804840x4E
    public final String LIZ(Diamond diamond, String str) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        List<FXRate> list = null;
        if (Intrinsics.LJFF(str, "google_play")) {
            BigDecimal bigDecimalDivide = BigDecimal.valueOf(diamond.LIZJ).divide(new BigDecimal(String.valueOf(1000000.0f)));
            String str2 = diamond.price;
            String str3 = diamond.LIZIZ;
            float fFloatValue = bigDecimalDivide.floatValue();
            ListV3Result.Extra extra = this.LJIIIZ;
            if (extra != null) {
                boolValueOf2 = Boolean.valueOf(extra.needDisplayMultiCurrency);
            } else {
                boolValueOf2 = null;
            }
            ListV3Result.Extra extra2 = this.LJIIIZ;
            if (extra2 != null) {
                list = extra2.multiCurrencyDisplayFxRateList;
            }
            return C1804840x4E.LIZIZ(diamond, str2, str3, fFloatValue, boolValueOf2, list);
        }
        CurrencyPriceItem currencyPriceItem = (CurrencyPriceItem) C13LP.LJJJLL(diamond.currencyPrice);
        if (currencyPriceItem == null) {
            return "";
        }
        float fLongValue = currencyPriceItem.price.longValue() / ((float) Math.pow(10.0f, currencyPriceItem.priceDot.intValue()));
        String strLJI = C1804850x4F.LJI(diamond);
        String str4 = currencyPriceItem.currency;
        ListV3Result.Extra extra3 = this.LJIIIZ;
        if (extra3 != null) {
            boolValueOf = Boolean.valueOf(extra3.needDisplayMultiCurrency);
        } else {
            boolValueOf = null;
        }
        ListV3Result.Extra extra4 = this.LJIIIZ;
        if (extra4 != null) {
            list = extra4.multiCurrencyDisplayFxRateList;
        }
        return C1804840x4E.LIZIZ(diamond, strLJI, str4, fLongValue, boolValueOf, list);
    }

    @Override // X.C1804840x4E
    public final String LJFF(Diamond diamond, String str) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        if (diamond == null) {
            return "";
        }
        List<FXRate> list = null;
        if (Intrinsics.LJFF(str, "google_play")) {
            BigDecimal bigDecimalDivide = BigDecimal.valueOf(diamond.LIZJ).divide(new BigDecimal(String.valueOf(1000000.0f)));
            String str2 = diamond.price;
            String str3 = diamond.LIZIZ;
            float fFloatValue = bigDecimalDivide.floatValue();
            ListV3Result.Extra extra = this.LJIIIZ;
            if (extra != null) {
                boolValueOf2 = Boolean.valueOf(extra.needDisplayMultiCurrency);
            } else {
                boolValueOf2 = null;
            }
            ListV3Result.Extra extra2 = this.LJIIIZ;
            if (extra2 != null) {
                list = extra2.multiCurrencyDisplayFxRateList;
            }
            return C1804840x4E.LJI(diamond, str2, str3, fFloatValue, boolValueOf2, list);
        }
        CurrencyPriceItem currencyPriceItem = (CurrencyPriceItem) C13LP.LJJJLL(diamond.currencyPrice);
        if (currencyPriceItem == null) {
            return "";
        }
        float fLongValue = currencyPriceItem.price.longValue() / ((float) Math.pow(10.0f, currencyPriceItem.priceDot.intValue()));
        String strLJI = C1804850x4F.LJI(diamond);
        String str4 = currencyPriceItem.currency;
        ListV3Result.Extra extra3 = this.LJIIIZ;
        if (extra3 != null) {
            boolValueOf = Boolean.valueOf(extra3.needDisplayMultiCurrency);
        } else {
            boolValueOf = null;
        }
        ListV3Result.Extra extra4 = this.LJIIIZ;
        if (extra4 != null) {
            list = extra4.multiCurrencyDisplayFxRateList;
        }
        return C1804840x4E.LJI(diamond, strLJI, str4, fLongValue, boolValueOf, list);
    }

    @Override // X.C1804840x4E
    public final List<Diamond> LJIIJJI(String str, boolean z) {
        if (!LJIJI()) {
            return this.LJFF;
        }
        if (Intrinsics.LJFF(str, "google_play")) {
            return this.LJFF;
        }
        if (z) {
            List<Diamond> list = this.LJIIIIZZ;
            if (list == null || list.isEmpty() || list == null) {
                return this.LJFF;
            }
            return list;
        }
        List<Diamond> list2 = this.LJIIIIZZ;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Diamond diamond : list2) {
                if (diamond.LIZ == 0) {
                    arrayList.add(diamond);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return this.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1804820x4C(List<? extends Diamond> list, IapListResult.ListResultExtra listResultExtra, List<? extends Diamond> list2, List<? extends Diamond> list3, ListV3Result.Extra extra, String str) {
        super(list, list2, listResultExtra);
        this.LJFF = list;
        this.LJI = listResultExtra;
        this.LJII = list2;
        this.LJIIIIZZ = list3;
        this.LJIIIZ = extra;
        this.LJIIJ = str;
    }
}
