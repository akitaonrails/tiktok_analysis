package com.bytedance.android.live.effect.playcondition;

import X.AbstractC20358214lI;
import com.bytedance.android.live.dynamicstrategy.PanelStateEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ShareOpenPanelCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "share_panel_open";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, PanelStateEvent.class, new AwS610S0100000_31(this, 22));
        }
        LIZ();
    }
}
