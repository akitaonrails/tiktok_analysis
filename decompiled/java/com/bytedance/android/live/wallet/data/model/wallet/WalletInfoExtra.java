package com.bytedance.android.live.wallet.data.model.wallet;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;
import java.util.HashMap;
import java.util.Map;
import webcast.data.RechargeRetentionPopupConfig;

/* JADX INFO: loaded from: classes13.dex */
public final class WalletInfoExtra extends Extra {

    @C09CT("recharge_retention_popup_config")
    public final Map<String, RechargeRetentionPopupConfig> rechargeRetentionPopupConfig = new HashMap();

    public final Map<String, RechargeRetentionPopupConfig> getRechargeRetentionPopupConfig() {
        return this.rechargeRetentionPopupConfig;
    }
}
