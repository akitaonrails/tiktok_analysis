package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C01FQ;
import X.C01GW;
import X.C176600m4;
import X.C452501pT;
import X.C948430amv;
import X.InterfaceC302601Fg;
import X.InterfaceC946300ajU;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveShowOngoingCondition extends AbstractC20358214lI {
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS559S0100000_15(this, 308));

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "liveshow_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (!C176600m4.LIZIZ(interfaceC302601FgLIZ != null ? Boolean.valueOf(interfaceC302601FgLIZ.LJIJI()) : null)) {
            InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
            if (interfaceC302601FgLIZ2 != null) {
                interfaceC302601FgLIZ2.LJFF((C948430amv) this.LJFF.getValue());
            }
            LIZ();
            return;
        }
        LJIIIZ("getStatus");
        InterfaceC946300ajU interfaceC946300ajU = this.LJ;
        if (interfaceC946300ajU != null) {
            interfaceC946300ajU.LIZ(true, false);
        }
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            interfaceC302601FgLIZ.LJIIIZ((C948430amv) this.LJFF.getValue());
        }
    }
}
