package com.bytedance.android.live.wallet.data.api;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.model.wallet.WalletInfoExtra;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import com.bytedance.scene.Scene;
import java.util.List;
import tikcast.api.wallet.tiktok.CheckEmailNotificationEligibilityResult;
import tikcast.api.wallet.tiktok.GetTotalBalanceResponse;
import tikcast.api.wallet.tiktok.ProfileBannerStatusResult;
import tikcast.api.wallet.tiktok.UpdateRechargeResultResponse;
import webcast.api.profit.FirstChargeV2Result;

/* JADX INFO: loaded from: classes28.dex */
public interface IWalletApi {
    @InterfaceC1501170pAR("/webcast/wallet_api_tiktok/email_notif_eligibility")
    C11NZ<C470590Icr<CheckEmailNotificationEligibilityResult.Data>> emailCampaignEligibility();

    @InterfaceC1501160pAQ("/webcast/wallet_api_tiktok/exchange_info")
    C11NZ<C470590Icr<ExchangeDisplayInfo>> getExchangeInfo();

    @InterfaceC1501160pAQ("/webcast/wallet_api_tiktok/exchange_info")
    C11NZ<C470590Icr<ExchangeDisplayInfo>> getExchangeInfoWithHeader(@InterfaceC1501350pAj("x-tt-request-page") String str, @InterfaceC1501350pAj("x-tt-request-scenario") String str2);

    @InterfaceC1501160pAQ("/webcast/diamond/first_charge/v2")
    C11NZ<FirstChargeV2Result> getFirstChargeResultV2();

    @InterfaceC1501160pAQ("/webcast/wallet_api_tiktok/wallet/info/")
    C11NZ<BaseResponse<WalletStruct, WalletInfoExtra>> getLiveBalanceInfoWithHeader(@InterfaceC1501350pAj("x-tt-request-page") String str, @InterfaceC1501350pAj("x-tt-request-scenario") String str2, @InterfaceC1501070pAH("retention_popup_config_dialog_ids") List<String> list);

    @InterfaceC1501160pAQ("/webcast/wallet_api_tiktok/notifycenter/notices")
    C11NZ<C470590Icr<NoticesResult.Data>> getNotifications(@InterfaceC1501070pAH("view_name") String str, @InterfaceC1501070pAH("currency") String str2, @InterfaceC1501070pAH("app_store_region") String str3);

    @InterfaceC1501160pAQ("/webcast/wallet_api/get_total_balance")
    C11NZ<GetTotalBalanceResponse> getTotalExchangeableBalance();

    @InterfaceC1501160pAQ("/webcast/wallet_api/get_total_balance")
    C11NZ<GetTotalBalanceResponse> getTotalExchangeableBalanceWithHeaders(@InterfaceC1501350pAj("x-tt-request-page") String str, @InterfaceC1501350pAj("x-tt-request-scenario") String str2);

    @InterfaceC1501160pAQ("/luckycat/tiktokm/v1/user/balance/get")
    C11NZ<C470590Icr<BalanceStruct>> getUGBalanceInfo(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501160pAQ("/luckycat/tiktokm/v1/user/balance/get")
    C11NZ<C470590Icr<BalanceStruct>> getUGBalanceInfoWithHeader(@InterfaceC1501350pAj("x-tt-request-page") String str, @InterfaceC1501350pAj("x-tt-request-scenario") String str2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501160pAQ("/webcast/wallet_api_tiktok/wallet/info/")
    C11NZ<BaseResponse<WalletStruct, WalletInfoExtra>> getWalletInfoNew(@InterfaceC1501070pAH("retention_popup_config_dialog_ids") List<String> list);

    @InterfaceC1501160pAQ("/webcast/wallet_api_tiktok/profile_banner_status")
    C11NZ<ProfileBannerStatusResult> queryShouldShowWebappProfileBanner();

    @InterfaceC1501170pAR("/webcast/wallet_api_tiktok/update_recharge_result")
    AbstractC19484711Kz<UpdateRechargeResultResponse> updateRechargeResult(@InterfaceC1501070pAH("order_id") String str, @InterfaceC1501070pAH("success") boolean z, @InterfaceC1501070pAH("error_code") String str2, @InterfaceC1501070pAH("error_message") String str3, @InterfaceC1501070pAH("error_detail") String str4);
}
