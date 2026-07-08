package com.bytedance.android.live.wallet.data.model.wallet;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.livesdk.model.Extra;
import java.util.Map;
import webcast.data.RechargeRetentionPopupConfig;

/* JADX INFO: loaded from: classes13.dex */
public final class RechargeCancelFrequency extends Extra {

    @C09CT("recharge_retention_popup_config")
    public final Map<String, RechargeRetentionPopupConfig> rechargeRetentionConfig = C2097608Jq.LJ();

    public final Map<String, RechargeRetentionPopupConfig> getRechargeRetentionConfig() {
        return this.rechargeRetentionConfig;
    }
}
