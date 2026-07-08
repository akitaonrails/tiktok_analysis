package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3Y, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3Y implements Serializable {
    public final String currency;
    public final String currencySymbol;
    public final String discountRate;
    public final C00E3 displayMode;
    public final boolean isRange;
    public final String originalPrice;
    public final String price;
    public final String promotionText;
    public final Double rangeMaxPrice;
    public final Double rangeMinPrice;
    public final Double rawCurrentPrice;
    public final Double rawOriginalPrice;
    public final String shippingStrategy;
    public final boolean showCurrencySpace;
    public final int symbolPosition;

    public final C0D3Y copy(String str, String str2, Double d, String str3, String str4, String str5, String str6, int i, boolean z, String str7, boolean z2, Double d2, Double d3, Double d4, C00E3 c00e3) {
        return new C0D3Y(str, str2, d, str3, str4, str5, str6, i, z, str7, z2, d2, d3, d4, c00e3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D3Y)) {
            return false;
        }
        C0D3Y c0d3y = (C0D3Y) obj;
        return Intrinsics.LJFF(this.price, c0d3y.price) && Intrinsics.LJFF(this.originalPrice, c0d3y.originalPrice) && Intrinsics.LJFF(this.rawOriginalPrice, c0d3y.rawOriginalPrice) && Intrinsics.LJFF(this.discountRate, c0d3y.discountRate) && Intrinsics.LJFF(this.promotionText, c0d3y.promotionText) && Intrinsics.LJFF(this.shippingStrategy, c0d3y.shippingStrategy) && Intrinsics.LJFF(this.currency, c0d3y.currency) && this.symbolPosition == c0d3y.symbolPosition && this.showCurrencySpace == c0d3y.showCurrencySpace && Intrinsics.LJFF(this.currencySymbol, c0d3y.currencySymbol) && this.isRange == c0d3y.isRange && Intrinsics.LJFF(this.rangeMinPrice, c0d3y.rangeMinPrice) && Intrinsics.LJFF(this.rangeMaxPrice, c0d3y.rangeMaxPrice) && Intrinsics.LJFF(this.rawCurrentPrice, c0d3y.rawCurrentPrice) && this.displayMode == c0d3y.displayMode;
    }

    public int hashCode() {
        int iHashCode = this.price.hashCode() * 31;
        String str = this.originalPrice;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.rawOriginalPrice;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.discountRate;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.promotionText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shippingStrategy;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int iHashCode7 = (((((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.symbolPosition) * 31) + C786410Ut5.Z2(this.showCurrencySpace)) * 31;
        String str6 = this.currencySymbol;
        int iHashCode8 = (((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Z2(this.isRange)) * 31;
        Double d2 = this.rangeMinPrice;
        int iHashCode9 = (iHashCode8 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.rangeMaxPrice;
        int iHashCode10 = (iHashCode9 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.rawCurrentPrice;
        return ((iHashCode10 + (d4 != null ? d4.hashCode() : 0)) * 31) + this.displayMode.hashCode();
    }

    public String toString() {
        return "PdpPriceState(price=" + this.price + ", originalPrice=" + this.originalPrice + ", rawOriginalPrice=" + this.rawOriginalPrice + ", discountRate=" + this.discountRate + ", promotionText=" + this.promotionText + ", shippingStrategy=" + this.shippingStrategy + ", currency=" + this.currency + ", symbolPosition=" + this.symbolPosition + ", showCurrencySpace=" + this.showCurrencySpace + ", currencySymbol=" + this.currencySymbol + ", isRange=" + this.isRange + ", rangeMinPrice=" + this.rangeMinPrice + ", rangeMaxPrice=" + this.rangeMaxPrice + ", rawCurrentPrice=" + this.rawCurrentPrice + ", displayMode=" + this.displayMode + ')';
    }

    public final boolean isRange() {
        return this.isRange;
    }

    public C0D3Y(String str, String str2, Double d, String str3, String str4, String str5, String str6, int i, boolean z, String str7, boolean z2, Double d2, Double d3, Double d4, C00E3 c00e3) {
        this.price = str;
        this.originalPrice = str2;
        this.rawOriginalPrice = d;
        this.discountRate = str3;
        this.promotionText = str4;
        this.shippingStrategy = str5;
        this.currency = str6;
        this.symbolPosition = i;
        this.showCurrencySpace = z;
        this.currencySymbol = str7;
        this.isRange = z2;
        this.rangeMinPrice = d2;
        this.rangeMaxPrice = d3;
        this.rawCurrentPrice = d4;
        this.displayMode = c00e3;
    }
}
