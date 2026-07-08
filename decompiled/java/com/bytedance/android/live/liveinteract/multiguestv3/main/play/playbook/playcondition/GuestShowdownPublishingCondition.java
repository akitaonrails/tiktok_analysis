package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C01IB;
import X.InterfaceC938530aWx;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayStatusChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class GuestShowdownPublishingCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "guest_showdown_publishing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
        if (interfaceC938530aWxLIZ == null || interfaceC938530aWxLIZ.LLLL() != 4) {
            DataChannel dataChannel = this.LIZIZ;
            if (dataChannel != null) {
                dataChannel.BQ2(this.LIZLLL, PlayStatusChangeEvent.class, new AwS594S0100000_15(this, 387));
            }
            LIZ();
            return;
        }
        LJIIIZ("in getStatus");
        InterfaceC946300ajU interfaceC946300ajU = this.LJ;
        if (interfaceC946300ajU != null) {
            interfaceC946300ajU.LIZ(true, false);
        }
    }
}
