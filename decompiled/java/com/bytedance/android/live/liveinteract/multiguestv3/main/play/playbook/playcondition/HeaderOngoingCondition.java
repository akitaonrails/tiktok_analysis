package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C972040bP0;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ApplyingTextHeaderFromServerSideChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class HeaderOngoingCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "header_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        Object objGg0;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel == null || (objGg0 = dataChannel.gg0(ApplyingTextHeaderFromServerSideChannel.class)) == null || Intrinsics.LJFF(objGg0, C972040bP0.LIZ)) {
            DataChannel dataChannel2 = this.LIZIZ;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(this.LIZLLL, ApplyingTextHeaderFromServerSideChannel.class, new AwS594S0100000_15(this, 389));
            }
            LIZ();
            return;
        }
        InterfaceC946300ajU interfaceC946300ajU = this.LJ;
        if (interfaceC946300ajU != null) {
            interfaceC946300ajU.LIZ(true, false);
        }
    }
}
