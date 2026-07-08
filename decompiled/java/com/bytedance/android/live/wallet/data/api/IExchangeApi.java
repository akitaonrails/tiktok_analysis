package com.bytedance.android.live.wallet.data.api;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.model.exchange.DefaultLocationData;
import com.bytedance.android.live.wallet.data.model.exchange.ExchangeThresholdInfoData;
import com.bytedance.android.live.wallet.data.model.exchange.ExchangeUpdateAddressRequest;
import com.bytedance.android.live.wallet.data.model.exchange.UpdateBillingAddressData;
import com.bytedance.android.livesdk.wallet.BaseCustomErrorExtra;

/* JADX INFO: loaded from: classes18.dex */
public interface IExchangeApi {
    @InterfaceC1501160pAQ("/webcast/wallet_api/exchange_kyc/")
    C11NZ<BaseResponse<Object, BaseCustomErrorExtra>> checkExchangeKyc(@InterfaceC1501070pAH("source") int i, @InterfaceC1501070pAH("sub_source") int i2);

    @InterfaceC1501160pAQ("/webcast/wallet_api_tiktok/get_default_location")
    AbstractC19484711Kz<C470590Icr<DefaultLocationData>> getDefaultLocation();

    @InterfaceC1501160pAQ("/webcast/wallet_api_tiktok/get_exchange_threshold_info")
    AbstractC19484711Kz<C470590Icr<ExchangeThresholdInfoData>> getExchangeThresholdInfo(@InterfaceC1501070pAH("source") int i, @InterfaceC1501070pAH("diamond_id") int i2, @InterfaceC1501070pAH("way") int i3, @InterfaceC1501070pAH("currency") String str, @InterfaceC1501070pAH("pay_source") int i4, @InterfaceC1501070pAH("coins_count") long j, @InterfaceC1501070pAH("local_amount") long j2, @InterfaceC1501070pAH("currency_dot") long j3, @InterfaceC1501070pAH("is_auto_exchange") boolean z, @InterfaceC1501070pAH("is_auto_exchange_enable") boolean z2);

    @InterfaceC1501170pAR("/webcast/wallet_api_tiktok/update_billing_address")
    C11NZ<C470590Icr<UpdateBillingAddressData>> updateBillingAddress(@InterfaceC1485405rg ExchangeUpdateAddressRequest exchangeUpdateAddressRequest);
}
