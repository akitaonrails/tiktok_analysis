package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C01EE;
import X.C01EG;
import X.C473410IhP;
import X.C979350ban;
import X.InterfaceC421301kR;
import Y.ARunnableS115S0100000_15;
import com.bytedance.android.live.liveinteract.api.CountDownServiceInitEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class CountdownFinishedOneCondition extends AbstractC20358214lI {
    public final ARunnableS115S0100000_15 LJFF = new ARunnableS115S0100000_15(this, 53);
    public final C979350ban LJI = new C01EE() { // from class: X.0ban
        @Override // X.C01EE
        public final void LIZ(C01E9 c01e9) {
        }

        @Override // X.C01EE
        public final void LIZJ(C299601Ec c299601Ec) {
        }

        @Override // X.C01EE
        public final void LIZIZ(C299601Ec c299601Ec) {
            this.LIZ.LJIIIZ("observe toStateIdle");
            InterfaceC946300ajU interfaceC946300ajU = this.LIZ.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
            }
        }

        @Override // X.C01EE
        public final void LIZLLL(C299601Ec c299601Ec) {
            this.LIZ.LJIIIZ("observe toStateFinish");
            InterfaceC946300ajU interfaceC946300ajU = this.LIZ.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
            }
        }
    };

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "countdown_finished_one";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        C473410IhP.LIZ().removeCallbacks(this.LJFF);
        if (C01EG.LIZIZ() != null) {
            this.LJFF.run();
            return;
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, CountDownServiceInitEvent.class, new AwS594S0100000_15(this, 383));
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
