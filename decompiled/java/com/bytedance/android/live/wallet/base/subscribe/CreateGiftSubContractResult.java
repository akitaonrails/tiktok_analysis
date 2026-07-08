package com.bytedance.android.live.wallet.base.subscribe;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateGiftSubContractResult {

    @C09CT("sent_all_by_quota")
    public boolean sentAllByQuota;

    @C09CT("success_contract_ids")
    public List<String> successContractIds = new ArrayList();

    @C09CT("biz_content")
    public String bizContent = "";

    @C09CT("timestamp")
    public String timestamp = "";

    @C09CT("merchant_id")
    public String merchantId = "";

    @C09CT("client_mp_url")
    public String clientMpUrl = "";

    @C09CT("pb_request_body")
    public String pbRequestBody = "";

    @C09CT("pb_generic_product_id")
    public String pbGenericProductId = "";

    @C09CT("gift_sub_id")
    public String giftSubId = "";

    @C09CT("failed_receiver_ids")
    public List<Long> failedReceiverIds = new ArrayList();
}
