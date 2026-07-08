package com.bytedance.android.live.liveinteract.cohost.playcondition;

import X.AbstractC20358214lI;
import X.C975230bU9;
import X.EnumC964170bCJ;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchOngoingCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "match_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannel dataChannel = this.LIZIZ;
        Object objGg0 = dataChannel != null ? dataChannel.gg0(BattleStateChannel.class) : null;
        if (!C975230bU9.LIZJ().isMatch() || objGg0 != EnumC964170bCJ.MATCH_START) {
            DataChannel dataChannel2 = this.LIZIZ;
            if (dataChannel2 != null) {
                C975230bU9.LJII(dataChannel2, this, new AwS645S0100000_31(this, 6));
            }
            LIZ();
            return;
        }
        LJIIIZ("get status");
        InterfaceC946300ajU interfaceC946300ajU = this.LJ;
        if (interfaceC946300ajU != null) {
            interfaceC946300ajU.LIZ(true, false);
        }
    }
}
