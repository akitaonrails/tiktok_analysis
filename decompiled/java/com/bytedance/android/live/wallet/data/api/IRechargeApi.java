package com.bytedance.android.live.wallet.data.api;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra;
import com.bytedance.android.live.wallet.model.DiamondBuyResult;
import tikcast.api.wallet.tiktok.QueryOrderResult;
import tikcast.api.wallet.tiktok.UnlockVoucherParams;
import tikcast.api.wallet.tiktok.UnlockVoucherResult;
import webcast.api.profit.IapListResult;

/* JADX INFO: loaded from: classes28.dex */
public interface IRechargeApi {
    @InterfaceC1501170pAR("/webcast/wallet_api_tiktok/coins_socket_ack")
    C11NZ<Object> ackCoinsSocket(@InterfaceC1501070pAH("order_id") String str);

    @InterfaceC1501160pAQ("/webcast/wallet_api/query_order/")
    C11NZ<BaseResponse<QueryOrderResult.ChargeOrderData, QueryOrderResult.ChargeOrderExtra>> checkOrderResult(@InterfaceC1501070pAH("order_id") String str, @InterfaceC1501070pAH("iap_country_code") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/wallet_api/diamond_buy/")
    C11NZ<BaseResponse<DiamondBuyResult, CreateOrderExtra>> createAmazonOrder(@InterfaceC1501050pAF("way") int i, @InterfaceC1501050pAF("diamond_id") int i2, @InterfaceC1501050pAF("currency") String str, @InterfaceC1501050pAF("price_amount_micros") long j, @InterfaceC1501050pAF("iap_country_code") String str2, @InterfaceC1501050pAF("amazon_id") String str3, @InterfaceC1501050pAF("source") int i3, @InterfaceC1501050pAF("order_id") String str4, @InterfaceC1501050pAF("trade_type") int i4, @InterfaceC1501050pAF("business_type") int i5, @InterfaceC1501050pAF("skip_kyc_reminder") boolean z, @InterfaceC1501050pAF("penalty_warning_skip") String str5, @InterfaceC1501050pAF("voucher_token_list") String str6, @InterfaceC1501050pAF("bundle_id") String str7);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/wallet_api/diamond_buy/")
    C11NZ<BaseResponse<DiamondBuyResult, CreateOrderExtra>> createOrder(@InterfaceC1501050pAF("way") int i, @InterfaceC1501050pAF("diamond_id") int i2, @InterfaceC1501050pAF("currency") String str, @InterfaceC1501050pAF("price_amount_micros") long j, @InterfaceC1501050pAF("first_recharge") boolean z, @InterfaceC1501050pAF("source") int i3, @InterfaceC1501050pAF("order_id") String str2, @InterfaceC1501050pAF("trade_type") int i4, @InterfaceC1501050pAF("business_type") int i5, @InterfaceC1501050pAF("skip_kyc_reminder") boolean z2, @InterfaceC1501050pAF("penalty_warning_skip") String str3, @InterfaceC1501050pAF("voucher_token_list") String str4, @InterfaceC1501050pAF("room_id") Long l, @InterfaceC1501050pAF("campaign_type") int i6, @InterfaceC1501050pAF("mode") int i7, @InterfaceC1501050pAF("sub_source") Integer num, @InterfaceC1501050pAF("client_params") String str5, @InterfaceC1501050pAF("iap_country_code") String str6, @InterfaceC1501050pAF("vault_gift_id") Integer num2, @InterfaceC1501050pAF("bundle_id") String str7, @InterfaceC1501050pAF("pending_iap_id_list") String str8);

    @InterfaceC1501160pAQ("/webcast/diamond/iap_list/")
    C11NZ<IapListResult> fetchDiamondPackage(@InterfaceC1501070pAH("currency") String str, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("type") long j3, @InterfaceC1501070pAH("entrance") int i, @InterfaceC1501070pAH("fetch_full_packages") boolean z, @InterfaceC1501070pAH("recommend_strategy_param") String str2, @InterfaceC1501070pAH("campaign_type") int i2, @InterfaceC1501070pAH("iap_country_code") String str3, @InterfaceC1501070pAH("bundle_id") String str4);

    @InterfaceC1501170pAR("/webcast/wallet_api_tiktok/voucher/unlock")
    C11NZ<UnlockVoucherResult> unlockVoucher(@InterfaceC1485405rg UnlockVoucherParams unlockVoucherParams);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/wallet_api_tiktok/payment_status")
    C11NZ<Object> uploadECLEligibilityStatus(@InterfaceC1501050pAF("iap_country_code") String str, @InterfaceC1501050pAF("google_billing_program_ecl_available") boolean z);
}
