package com.bytedance.android.live.liveinteract.cohost.playcondition;

import X.AbstractC20358214lI;
import X.C974320bSg;
import X.C986420bmC;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.api.InteractUnifiedStateChangeChannel;
import com.bytedance.android.live.liveinteract.api.MultiMatchAnchorWidgetLoadedValueChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CohostOngoingCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "cohost_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        C974320bSg c974320bSg;
        Unit unit;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (c974320bSg = (C974320bSg) dataChannel.gg0(InteractUnifiedStateChangeChannel.class)) != null) {
            if (C986420bmC.LIZ(c974320bSg)) {
                LJIIIZ("in getStatus");
                InterfaceC946300ajU interfaceC946300ajU = this.LJ;
                if (interfaceC946300ajU != null) {
                    interfaceC946300ajU.LIZ(true, false);
                    unit = Unit.LIZ;
                }
            } else {
                DataChannel dataChannel2 = this.LIZIZ;
                if (dataChannel2 != null) {
                    dataChannel2.BQ2(this.LIZLLL, InteractUnifiedStateChangeChannel.class, new AwS610S0100000_31(this, 26));
                }
                DataChannel dataChannel3 = this.LIZIZ;
                if (dataChannel3 != null) {
                    dataChannel3.BQ2(this.LIZLLL, MultiMatchAnchorWidgetLoadedValueChannel.class, new AwS610S0100000_31(this, 27));
                }
                LIZ();
                unit = Unit.LIZ;
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
