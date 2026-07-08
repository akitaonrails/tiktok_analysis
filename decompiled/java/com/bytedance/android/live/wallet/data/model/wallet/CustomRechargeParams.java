package com.bytedance.android.live.wallet.data.model.wallet;

import X.C09CT;
import com.bytedance.android.live.wallet.model.CurrencyPriceItem;
import com.bytedance.tracking.TrackingEventV3Data;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import webcast.api.profit.IapListResult;
import webcast.data.FXRate;

/* JADX INFO: loaded from: classes28.dex */
public final class CustomRechargeParams {

    @C09CT("combo_index")
    public final int comboIndex;

    @C09CT("currency_price_item")
    public final CurrencyPriceItem currencyPriceItem;

    @C09CT("event_data")
    public final TrackingEventV3Data eventData;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("max_customized_diamond_cnt")
    public final int maxCustomizedDiamondCnt;

    @C09CT("min_customized_diamond_cnt")
    public final int minCustomizedDiamondCnt;

    @C09CT("multi_currency_display_fx_rate")
    public final FXRate multiCurrencyDisplayFxRate;

    @C09CT("recently_picked_coin_counts")
    public final List<Integer> recentlyPickedCoinCounts;

    @C09CT("recently_picked_coin_currency_amount")
    public final List<String> recentlyPickedCoinCurrencyAmount;

    @C09CT("voucher_list")
    public final List<IapListResult.VoucherItem> voucherList;

    public CustomRechargeParams(String str, int i, CurrencyPriceItem currencyPriceItem, int i2, int i3, List<IapListResult.VoucherItem> list, List<Integer> list2, List<String> list3, TrackingEventV3Data trackingEventV3Data, FXRate fXRate) {
        this.id = str;
        this.comboIndex = i;
        this.currencyPriceItem = currencyPriceItem;
        this.minCustomizedDiamondCnt = i2;
        this.maxCustomizedDiamondCnt = i3;
        this.voucherList = list;
        this.recentlyPickedCoinCounts = list2;
        this.recentlyPickedCoinCurrencyAmount = list3;
        this.eventData = trackingEventV3Data;
        this.multiCurrencyDisplayFxRate = fXRate;
    }
}
