package com.bytedance.android.live.effect.playcondition;

import X.AbstractC20358214lI;
import com.bytedance.android.livesdk.dataChannel.ShareJoinInGoodyBag;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveSharedCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "live_shared";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, ShareJoinInGoodyBag.class, new AwS610S0100000_31(this, 21));
        }
        LIZ();
    }
}
