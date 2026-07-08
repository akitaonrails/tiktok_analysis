package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowNextGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowTransitionStartEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveShowChangeUserCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "liveshow_change_user";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, LiveShowNextGuestEvent.class, new AwS610S0100000_31(this, 58));
            dataChannel.BQ2(this.LIZLLL, LiveShowTransitionStartEvent.class, new AwS610S0100000_31(this, 59));
        }
        LIZ();
    }
}
