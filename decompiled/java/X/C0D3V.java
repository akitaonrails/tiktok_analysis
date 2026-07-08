package X;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3V, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3V implements Serializable {
    public final boolean availableForSale;
    public final Map<String, String> defaultSkuOptions;
    public final boolean isAcpScene;
    public final boolean isVariantLoading;
    public final Map<String, String> optionImageUrls;
    public final Boolean renderVisualColor;
    public final Map<String, String> selectedSkuOptions;
    public final String selectedVariantId;
    public final boolean showSkuDialog;
    public final List<C332830D2z> skuOptions;
    public final Map<String, String> variantCompareAtPrices;
    public final Map<String, String> variantPrices;
    public final List<C332820D2y> variants;

    public final C0D3V copy(List<C332830D2z> list, List<C332820D2y> list2, Map<String, String> map, Map<String, String> map2, boolean z, Map<String, String> map3, Map<String, String> map4, String str, boolean z2, boolean z3, Map<String, String> map5, boolean z4, Boolean bool) {
        return new C0D3V(list, list2, map, map2, z, map3, map4, str, z2, z3, map5, z4, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D3V)) {
            return false;
        }
        C0D3V c0d3v = (C0D3V) obj;
        return Intrinsics.LJFF(this.skuOptions, c0d3v.skuOptions) && Intrinsics.LJFF(this.variants, c0d3v.variants) && Intrinsics.LJFF(this.selectedSkuOptions, c0d3v.selectedSkuOptions) && Intrinsics.LJFF(this.defaultSkuOptions, c0d3v.defaultSkuOptions) && this.showSkuDialog == c0d3v.showSkuDialog && Intrinsics.LJFF(this.optionImageUrls, c0d3v.optionImageUrls) && Intrinsics.LJFF(this.variantCompareAtPrices, c0d3v.variantCompareAtPrices) && Intrinsics.LJFF(this.selectedVariantId, c0d3v.selectedVariantId) && this.isVariantLoading == c0d3v.isVariantLoading && this.availableForSale == c0d3v.availableForSale && Intrinsics.LJFF(this.variantPrices, c0d3v.variantPrices) && this.isAcpScene == c0d3v.isAcpScene && Intrinsics.LJFF(this.renderVisualColor, c0d3v.renderVisualColor);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.skuOptions.hashCode() * 31) + this.variants.hashCode()) * 31) + this.selectedSkuOptions.hashCode()) * 31) + this.defaultSkuOptions.hashCode()) * 31) + C786410Ut5.Z2(this.showSkuDialog)) * 31) + this.optionImageUrls.hashCode()) * 31) + this.variantCompareAtPrices.hashCode()) * 31;
        String str = this.selectedVariantId;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.isVariantLoading)) * 31) + C786410Ut5.Z2(this.availableForSale)) * 31) + this.variantPrices.hashCode()) * 31) + C786410Ut5.Z2(this.isAcpScene)) * 31;
        Boolean bool = this.renderVisualColor;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "PdpSkuState(skuOptions=" + this.skuOptions + ", variants=" + this.variants + ", selectedSkuOptions=" + this.selectedSkuOptions + ", defaultSkuOptions=" + this.defaultSkuOptions + ", showSkuDialog=" + this.showSkuDialog + ", optionImageUrls=" + this.optionImageUrls + ", variantCompareAtPrices=" + this.variantCompareAtPrices + ", selectedVariantId=" + this.selectedVariantId + ", isVariantLoading=" + this.isVariantLoading + ", availableForSale=" + this.availableForSale + ", variantPrices=" + this.variantPrices + ", isAcpScene=" + this.isAcpScene + ", renderVisualColor=" + this.renderVisualColor + ')';
    }

    public final boolean isSingleSku() {
        if (this.skuOptions.isEmpty()) {
            return true;
        }
        Iterator<C332830D2z> it2 = this.skuOptions.iterator();
        while (it2.hasNext()) {
            if (it2.next().options.size() > 1) {
                return false;
            }
        }
        return true;
    }

    public final boolean isAcpScene() {
        return this.isAcpScene;
    }

    public final boolean isVariantLoading() {
        return this.isVariantLoading;
    }

    public C0D3V(List<C332830D2z> list, List<C332820D2y> list2, Map<String, String> map, Map<String, String> map2, boolean z, Map<String, String> map3, Map<String, String> map4, String str, boolean z2, boolean z3, Map<String, String> map5, boolean z4, Boolean bool) {
        this.skuOptions = list;
        this.variants = list2;
        this.selectedSkuOptions = map;
        this.defaultSkuOptions = map2;
        this.showSkuDialog = z;
        this.optionImageUrls = map3;
        this.variantCompareAtPrices = map4;
        this.selectedVariantId = str;
        this.isVariantLoading = z2;
        this.availableForSale = z3;
        this.variantPrices = map5;
        this.isAcpScene = z4;
        this.renderVisualColor = bool;
    }
}
