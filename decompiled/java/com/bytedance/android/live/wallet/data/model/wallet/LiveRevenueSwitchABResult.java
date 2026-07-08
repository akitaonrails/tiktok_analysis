package com.bytedance.android.live.wallet.data.model.wallet;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveRevenueSwitchABResult extends Extra {

    @C09CT("data")
    public final LiveRevenueSwitch data = new LiveRevenueSwitch(this);

    public final LiveRevenueSwitch getData() {
        return this.data;
    }

    public final class LiveRevenueSwitch {

        @C09CT("should_show_live_rewards_settings")
        public final boolean shouldShowLiveRewardsSettings;

        public LiveRevenueSwitch(LiveRevenueSwitchABResult liveRevenueSwitchABResult) {
        }
    }
}
