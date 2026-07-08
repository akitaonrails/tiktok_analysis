package com.bytedance.android.live.liveinteract.cohost.playcondition;

import X.AbstractC20358214lI;
import X.C974320bSg;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.api.InteractUnifiedStateChangeChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class CohostFinishedCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "cohost_finished";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        C974320bSg c974320bSg;
        Unit unit;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (c974320bSg = (C974320bSg) dataChannel.gg0(InteractUnifiedStateChangeChannel.class)) != null) {
            if (!Intrinsics.LJFF(c974320bSg.LIZ, "cohost") || c974320bSg.LIZIZ || Intrinsics.LJFF(c974320bSg.LIZJ, "LINKED") || Intrinsics.LJFF(c974320bSg.LIZJ, "PREPARED")) {
                DataChannel dataChannel2 = this.LIZIZ;
                if (dataChannel2 != null) {
                    dataChannel2.BQ2(this.LIZLLL, InteractUnifiedStateChangeChannel.class, new AwS594S0100000_15(this, 94));
                }
                LIZ();
                unit = Unit.LIZ;
            } else {
                LJIIIZ("in getStatus");
                InterfaceC946300ajU interfaceC946300ajU = this.LJ;
                if (interfaceC946300ajU != null) {
                    interfaceC946300ajU.LIZ(true, false);
                    unit = Unit.LIZ;
                }
            }
            if (unit != null) {
                return;
            }
        }
        LJIIIZ("dataChannel is null");
        InterfaceC946300ajU interfaceC946300ajU2 = this.LJ;
        if (interfaceC946300ajU2 != null) {
            interfaceC946300ajU2.LIZ(true, false);
        }
    }
}
