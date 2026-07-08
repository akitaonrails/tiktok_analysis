package com.bytedance.android.live.wallet.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public class PipoBuyDetails {

    @C09CT("biz_content")
    public String bizContent;

    @C09CT("iap_client_request_body")
    public String iapBizContent;

    @C09CT("backup_sku_recharge")
    public boolean isBackUpSKU;

    @C09CT("merchant_id")
    public String merchantId;

    @C09CT("method")
    public String method;

    @C09CT("money_platform_url")
    public String moneyPlatformUrl = "";

    @C09CT("need_change_pipo_url")
    public boolean needChangePipoUrl;

    @C09CT("sign")
    public String sign;

    @C09CT("timestamp")
    public Long timeStamp;
}
