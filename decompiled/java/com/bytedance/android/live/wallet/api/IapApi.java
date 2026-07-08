package com.bytedance.android.live.wallet.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501350pAj;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.model.AutoExchangeData;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.CheckSubOrderResultStruct;
import com.bytedance.android.live.wallet.model.CreateSubOrderResult;
import com.bytedance.android.live.wallet.model.ExchangeExtra;
import com.bytedance.android.live.wallet.model.UgEmailConsentResult;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import java.util.Map;
import tikcast.api.wallet.tiktok.GetABSStatusResponse;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;
import webcast.api.sub.RecoverContractInAppResponse;

/* JADX INFO: loaded from: classes28.dex */
public interface IapApi {
    @InterfaceC1501160pAQ("/webcast/sub/contract/status/")
    C11NZ<C470590Icr<CheckSubOrderResultStruct>> checkSubOrder(@InterfaceC1501070pAH("to_uid") String str, @InterfaceC1501070pAH("contract_id") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/wallet_api/diamond_exchange/")
    C11NZ<BaseResponse<Object, ExchangeExtra>> exchangeCoins(@InterfaceC1501050pAF("diamond_id") int i, @InterfaceC1501050pAF("way") int i2, @InterfaceC1501050pAF("currency") String str, @InterfaceC1501050pAF("source") int i3, @InterfaceC1501050pAF("coins_count") long j, @InterfaceC1501050pAF("local_amount") long j2, @InterfaceC1501050pAF("currency_dot") long j3, @InterfaceC1501050pAF("skip_kyc_reminder") boolean z, @InterfaceC1501050pAF("penalty_warning_skip") String str2, @InterfaceC1501050pAF("is_first_recharge") boolean z2, @InterfaceC1501050pAF("show_exchange_tooltip") boolean z3, @InterfaceC1501050pAF("show_exchange_amount_adjusted_text") boolean z4, @InterfaceC1501050pAF("exchange_input_option") int i4, @InterfaceC1501050pAF("sub_source") int i5, @InterfaceC1501050pAF("campaign_type") int i6);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/recharge/base_package/")
    C11NZ<C470590Icr<BalanceStructExtra>> getBasePackage(@InterfaceC1501050pAF("currency") String str, @InterfaceC1501050pAF("package_region") String str2, @InterfaceC1501050pAF("type") long j, @InterfaceC1501050pAF("balance") long j2, @InterfaceC1501050pAF("real_dot") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/recharge/base_package/")
    C11NZ<C470590Icr<BalanceStructExtra>> getBasePackageWithHeaders(@InterfaceC1501350pAj("x-tt-request-page") String str, @InterfaceC1501350pAj("x-tt-request-scenario") String str2, @InterfaceC1501050pAF("currency") String str3, @InterfaceC1501050pAF("package_region") String str4, @InterfaceC1501050pAF("type") long j, @InterfaceC1501050pAF("balance") long j2, @InterfaceC1501050pAF("real_dot") int i);

    @InterfaceC1501160pAQ("/webcast/wallet_api_tiktok/get_abs_status")
    C11NZ<GetABSStatusResponse> getGoogleABSStatus(@InterfaceC1501070pAH("payment_type") int i, @InterfaceC1501070pAH("iap_currency") String str);

    @InterfaceC1501160pAQ("/webcast/wallet_api_tiktok/notifycenter/notices")
    C11NZ<C470590Icr<NoticesResult.Data>> getNotifications(@InterfaceC1501070pAH("view_name") String str, @InterfaceC1501070pAH("currency") String str2, @InterfaceC1501070pAH("app_store_region") String str3);

    @InterfaceC1501160pAQ("/edm/user/properties/")
    C11NZ<C470590Icr<UgEmailConsentResult>> getUgEmailConsent();

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/contract/recover_in_app/")
    C11NZ<C470590Icr<RecoverContractInAppResponse.RecoverContractInAppResult>> resubscribeOrder(@InterfaceC1501050pAF("to_uid") String str, @InterfaceC1501050pAF("room_id") String str2, @InterfaceC1501050pAF("client_param") String str3);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/sub/contract/create/")
    C11NZ<C470590Icr<CreateSubOrderResult>> subscribeOrder(@InterfaceC1501050pAF("to_uid") String str, @InterfaceC1501050pAF("tpl_id") String str2, @InterfaceC1501050pAF("sku_name") String str3, @InterfaceC1501050pAF("device_tz") String str4, @InterfaceC1501050pAF("offer_id") String str5, @InterfaceC1501050pAF("offer_token") String str6, @InterfaceC1501050pAF("comm_migrate") Boolean bool, @InterfaceC1501050pAF("sub_circle") int i, @InterfaceC1501050pAF("create_contract_intent") int i2, @InterfaceC1501050pAF("channel_order_ids_str") String str7, @InterfaceC1501050pAF("prefetch_senario") int i3, @InterfaceC1501050pAF("use_prefetched_data") int i4, @InterfaceC1501150pAP Map<String, Object> map);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast/first_recharge/info_v2/")
    C11NZ<C470590Icr<GetFirstRechargeInfoV2Resp.Data>> syncFirstRechargeInfoV2(@InterfaceC1501050pAF("live_id") long j, @InterfaceC1501050pAF("currency") String str, @InterfaceC1501050pAF("room_id") long j2, @InterfaceC1501050pAF("req_scene") int i);

    @InterfaceC1501170pAR("/webcast/wallet_api_tiktok/auto_exchange/")
    C11NZ<C470590Icr<AutoExchangeData>> updateAutoExchange(@InterfaceC1501070pAH("auto_exchange") boolean z, @InterfaceC1501070pAH("type") int i);
}
