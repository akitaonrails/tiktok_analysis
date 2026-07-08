package com.bytedance.android.live.liveinteract.cohost.playcondition;

import X.AbstractC20358214lI;
import X.C2188811AlT;
import X.C975230bU9;
import X.C975240bUA;
import X.EnumC919170a1j;
import X.EnumC964170bCJ;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.competition.event.CompetitionStateEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CatchBeansOngoingCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "catch_beans_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        C975240bUA c975240bUA;
        Unit unit;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (c975240bUA = (C975240bUA) dataChannel.gg0(CompetitionStateEvent.class)) != null) {
            if (c975240bUA.LIZ == EnumC919170a1j.MATCH_TYPE_CATCH_BEANS && c975240bUA.LIZIZ == EnumC964170bCJ.MATCH_START) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("get status, bizStatus: ");
                sbLIZ.append(c975240bUA.LIZIZ);
                LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC946300ajU interfaceC946300ajU = this.LJ;
                if (interfaceC946300ajU != null) {
                    interfaceC946300ajU.LIZ(true, false);
                    unit = Unit.LIZ;
                }
            } else {
                C975230bU9.LJII(this.LIZIZ, this, new AwS645S0100000_31(this, 3));
                LIZ();
                unit = Unit.LIZ;
            }
            if (unit != null) {
                return;
            }
        }
        C975230bU9.LJII(this.LIZIZ, this, new AwS645S0100000_31(this, 4));
        LIZ();
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        super.LJIIIIZZ();
    }
}
