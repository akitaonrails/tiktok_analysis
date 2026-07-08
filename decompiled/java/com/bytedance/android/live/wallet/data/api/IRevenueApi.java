package com.bytedance.android.live.wallet.data.api;

import X.AbstractC19484711Kz;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.live.wallet.data.model.wallet.LiveRevenueSwitchABResult;
import com.bytedance.android.live.wallet.data.model.wallet.LiveTransactionSwitchABResult;

/* JADX INFO: loaded from: classes28.dex */
public interface IRevenueApi {
    @InterfaceC1501160pAQ("/webcast/wallet_api_tiktok/get_live_rewards_notification_settings")
    AbstractC19484711Kz<LiveRevenueSwitchABResult> getLiveRevenueSwitchAB();

    @InterfaceC1501160pAQ("/webcast/wallet_api_tiktok/coin_solution_ab_enabled")
    AbstractC19484711Kz<LiveTransactionSwitchABResult> getLiveTransactionSwitchAB();
}
