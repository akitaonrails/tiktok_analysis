package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllAtLeastOneUsersReachTargetEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CountdownForAllReachGoalOneCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "countdown_for_all_reach_goal_one";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, CountDownForAllAtLeastOneUsersReachTargetEvent.class, new AwS610S0100000_31(this, 48));
        }
        LIZ();
    }
}
