package X;

import com.bytedance.android.live.wallet.data.model.wallet.CustomRechargeParams;
import com.bytedance.android.live.wallet.model.CurrencyPriceItem;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.tracking.TrackingEventV3Data;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.profit.ListV3Result;
import webcast.data.FXRate;

/* JADX INFO: renamed from: X.0x4K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804900x4K {
    public static final CustomRechargeParams LIZ(Diamond diamond, int i, ListV3Result.Extra extra, TrackingEventV3Data trackingEventV3Data) {
        String str;
        CurrencyPriceItem currencyPriceItem;
        FXRate fXRate = null;
        if (extra == null) {
            return null;
        }
        if (extra.needDisplayMultiCurrency) {
            Iterator<FXRate> it2 = extra.multiCurrencyDisplayFxRateList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                FXRate next = it2.next();
                String str2 = next.fromCurrency;
                List<CurrencyPriceItem> list = diamond.currencyPrice;
                if (list != null && (currencyPriceItem = (CurrencyPriceItem) C13LP.LJJJLL(list)) != null) {
                    str = currencyPriceItem.currency;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    fXRate = next;
                    break;
                }
            }
            fXRate = fXRate;
        }
        return new CustomRechargeParams(String.valueOf(diamond.id), i, (CurrencyPriceItem) C13LP.LJJJLL(diamond.currencyPrice), extra.minCustomizedDiamondCnt, extra.maxCustomizedDiamondCnt, extra.voucherListV3, extra.frequentDiamondCounts, extra.frequentDiamondCurrencyAmount, trackingEventV3Data, fXRate);
    }
}
