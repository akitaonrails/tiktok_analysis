package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C01EE;
import X.C01EG;
import X.C979210baZ;
import X.InterfaceC421301kR;

/* JADX INFO: loaded from: classes16.dex */
public final class CountdownReachGoalOneCondition extends AbstractC20358214lI {
    public final C979210baZ LJFF = new C01EE() { // from class: X.0baZ
        @Override // X.C01EE
        public final void LIZIZ(C299601Ec c299601Ec) {
        }

        @Override // X.C01EE
        public final void LIZJ(C299601Ec c299601Ec) {
        }

        @Override // X.C01EE
        public final void LIZLLL(C299601Ec c299601Ec) {
        }

        @Override // X.C01EE
        public final void LIZ(C01E9 c01e9) {
            if (c01e9.LJ >= c01e9.LIZLLL) {
                this.LIZ.LJIIIZ("match score");
                InterfaceC946300ajU interfaceC946300ajU = this.LIZ.LJ;
                if (interfaceC946300ajU != null) {
                    interfaceC946300ajU.LIZ(true, false);
                }
            }
        }
    };

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "countdown_reach_goal_one";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        LIZ();
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null) {
            interfaceC421301kRLIZIZ.LJIL(this.LJFF);
        }
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null) {
            interfaceC421301kRLIZIZ.LJIILL(this.LJFF);
        }
    }
}
