package com.bytedance.android.live.wallet.base.subscribe;

import X.C09CT;
import com.bytedance.android.livesdk.subscribe.model.WebappSubInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateContractResult {

    @C09CT("order_platform")
    public int orderPlatform;

    @C09CT("pay_channel")
    public int payChannel;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sub_circle")
    public int subCircle;

    @C09CT("tpl_type")
    public int tplType;

    @C09CT("webapp_sub_info")
    public WebappSubInfo webappSubInfo;

    @C09CT("tpl_id")
    public String tplId = "";

    @C09CT("iap_id")
    public String iapId = "";

    @C09CT("biz_content")
    public String bizContent = "";

    @C09CT("timestamp")
    public String timestamp = "";

    @C09CT("merchant_id")
    public String merchantId = "";

    @C09CT("sign")
    public String sign = "";

    @C09CT("method")
    public String method = "";

    @C09CT("client_pipo_url")
    public String clientPipoUrl = "";

    @C09CT("contract_id")
    public String contractId = "";

    @C09CT("client_mp_url")
    public String clientMpUrl = "";

    @C09CT("pb_request_body")
    public String pbRequestBody = "";

    @C09CT("pb_generic_product_id")
    public String pbGenericProductId = "";
}
