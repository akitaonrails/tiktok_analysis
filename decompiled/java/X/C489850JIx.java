package X;

import com.bytedance.android.livesdk.chatroom.api.PriceTier;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePriceInfo;

/* JADX INFO: renamed from: X.0JIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489850JIx {
    public static final PriceTier LIZ(SubPackagePriceInfo subPackagePriceInfo) {
        PriceTier priceTier = new PriceTier();
        priceTier.priceTierGrade = subPackagePriceInfo.priceTierId;
        priceTier.usdPrice = subPackagePriceInfo.usdMoneySymbolDisplay;
        priceTier.localPrice = subPackagePriceInfo.customDisplay;
        priceTier.priceGroup = subPackagePriceInfo.priceGroup;
        priceTier.localCurrencyName = subPackagePriceInfo.localCurrency;
        priceTier.localPriceAmount = subPackagePriceInfo.localPriceAmountMicros / 1000000.0f;
        return priceTier;
    }
}
