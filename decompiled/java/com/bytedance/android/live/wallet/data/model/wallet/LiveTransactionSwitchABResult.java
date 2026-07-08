package com.bytedance.android.live.wallet.data.model.wallet;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveTransactionSwitchABResult extends Extra {

    @C09CT("data")
    public final LiveTransactionSwitch data = new LiveTransactionSwitch(this);

    public final LiveTransactionSwitch getData() {
        return this.data;
    }

    public final class LiveTransactionSwitch {

        @C09CT("coin_solution_ab_enabled")
        public final boolean shouldShowLiveTransactionSettings;

        public LiveTransactionSwitch(LiveTransactionSwitchABResult liveTransactionSwitchABResult) {
        }
    }
}
