package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C01EB;
import X.C01EE;
import X.C01EG;
import X.C979230bab;
import X.InterfaceC421301kR;
import X.InterfaceC946300ajU;
import Y.ARunnableS115S0100000_15;
import com.bytedance.android.live.liveinteract.api.CountDownServiceInitEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition.CountdownOngoingOneCondition;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class CountdownOngoingOneCondition extends AbstractC20358214lI {
    public final ARunnableS115S0100000_15 LJFF = new ARunnableS115S0100000_15(this, 54);
    public final C979230bab LJI = new C01EE() { // from class: X.0bab
        @Override // X.C01EE
        public final void LIZ(C01E9 c01e9) {
        }

        public final void LJ() {
            InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
            if ((interfaceC421301kRLIZIZ != null ? interfaceC421301kRLIZIZ.LJIIIZ() : null) != C01EB.ONGOING) {
                this.LIZ.LJIIIZ("toStateIdle, false");
                InterfaceC946300ajU interfaceC946300ajU = this.LIZ.LJ;
                if (interfaceC946300ajU != null) {
                    interfaceC946300ajU.LIZ(false, false);
                }
            }
        }

        @Override // X.C01EE
        public final void LIZIZ(C299601Ec c299601Ec) {
            LJ();
        }

        @Override // X.C01EE
        public final void LIZJ(C299601Ec c299601Ec) {
            CountdownOngoingOneCondition countdownOngoingOneCondition = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("conditionMatch - ");
            this.LIZ.getClass();
            sbLIZ.append("countdown_ongoing_one");
            sbLIZ.append(" toStateOnGoing");
            countdownOngoingOneCondition.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC946300ajU interfaceC946300ajU = this.LIZ.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
            }
        }

        @Override // X.C01EE
        public final void LIZLLL(C299601Ec c299601Ec) {
            LJ();
        }
    };

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "countdown_ongoing_one";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if ((interfaceC421301kRLIZIZ != null ? interfaceC421301kRLIZIZ.LJIIIZ() : null) == C01EB.ONGOING) {
            LJIIIZ("startConditionObserver, true");
            InterfaceC946300ajU interfaceC946300ajU = this.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
                return;
            }
            return;
        }
        if (C01EG.LIZIZ() != null) {
            this.LJFF.run();
            return;
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, CountDownServiceInitEvent.class, new AwS594S0100000_15(this, 384));
        }
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null) {
            interfaceC421301kRLIZIZ.LJIILL(this.LJI);
        }
    }
}
