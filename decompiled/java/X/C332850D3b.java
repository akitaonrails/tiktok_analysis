package X;

import Y.AComparatorS21S0000000_2;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332850D3b {
    public static final EnumC333530D5r LIZIZ(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (!a0.LJJIIZI(lowerCase, "timed out", false) && !a0.LJJIIZI(lowerCase, "timeout", false)) {
            if (!a0.LJJIIZI(lowerCase, "unable to resolve", false) && !a0.LJJIIZI(lowerCase, "unable to connect", false)) {
                if (!a0.LJJIIZI(lowerCase, "connection", false) && !a0.LJJIIZI(lowerCase, "socket", false)) {
                    if (!a0.LJJIIZI(lowerCase, "io", false) && !a0.LJJIIZI(lowerCase, "network", false)) {
                        if (!a0.LJJIIZI(lowerCase, "404", false) && !a0.LJJIIZI(lowerCase, "not found", false)) {
                            if (a0.LJJIIZI(lowerCase, "ucp fetch failed", false)) {
                                return EnumC333530D5r.UNAVAILABLE;
                            }
                            if (!a0.LJJIIZI(lowerCase, "500", false) && !a0.LJJIIZI(lowerCase, "502", false) && !a0.LJJIIZI(lowerCase, "503", false) && !a0.LJJIIZI(lowerCase, "504", false)) {
                                return EnumC333530D5r.SERVER;
                            }
                            return EnumC333530D5r.SERVER;
                        }
                        return EnumC333530D5r.UNAVAILABLE;
                    }
                    return EnumC333530D5r.NETWORK;
                }
                return EnumC333530D5r.NETWORK;
            }
            return EnumC333530D5r.NETWORK;
        }
        return EnumC333530D5r.NETWORK;
    }

    public static final String LIZJ(Map<String, String> map) {
        return C13LP.LJJLIIIJ(C13LP.LJLLLL(new AComparatorS21S0000000_2(3), map.entrySet()), "&", null, null, 0, null, AFwS229S0000000_2.get$arr$(137), 30);
    }

    public static final C0D3K LIZ(C0D3K c0d3k, boolean z) {
        C332840D3a c332840D3a = c0d3k.bottomBar;
        if (c332840D3a == null) {
            return c0d3k;
        }
        return c0d3k.copy(c0d3k.productId, c0d3k.entrySpuImageUrls, c0d3k.shopHeader, c0d3k.productMedia, c0d3k.priceInfo, c0d3k.titleRating, c0d3k.skuSelection, c0d3k.descriptionInfo, c0d3k.logisticsInfo, c0d3k.dealsInfo, c0d3k.reviewInfo, c0d3k.moreFromShop, c332840D3a.copy(c332840D3a.visible, z, c332840D3a.buyNowButtonLabel, c332840D3a.buyNowButtonTextType, c332840D3a.buyNowButtonBgColor, c332840D3a.buyNowButtonTextColor, c332840D3a.disclaimerText, c332840D3a.showDisclaimerInfoIcon, C333010D3r.INSTANCE));
    }
}
