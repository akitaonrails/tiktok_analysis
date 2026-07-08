package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.AbstractC922600a7G;
import X.C01GW;
import X.C452501pT;
import X.C473410IhP;
import X.C930540aK4;
import X.C946310ajV;
import X.C948450amx;
import X.InterfaceC946300ajU;
import Y.ARunnableS115S0100000_15;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorUserManangerEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class GuestNewJoinedCondition extends AbstractC20358214lI {
    public int LJFF;
    public final ARunnableS115S0100000_15 LJI = new ARunnableS115S0100000_15(this, 56);
    public final C01GW LJII = C452501pT.LIZIZ(new AwS559S0100000_15(this, 306));

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "guest_new_joined";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        if (!C930540aK4.LIZJ()) {
            LJIIIZ("!currentSelfIsAnchor");
            InterfaceC946300ajU interfaceC946300ajU = this.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
                return;
            }
            return;
        }
        C473410IhP.LIZ().removeCallbacks(this.LJI);
        if (C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER") != null) {
            this.LJI.run();
            return;
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, MultiGuestAnchorUserManangerEvent.class, new AwS594S0100000_15(this, 386));
        }
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        this.LJFF = 0;
        AbstractC922600a7G abstractC922600a7G = (AbstractC922600a7G) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (abstractC922600a7G != null) {
            abstractC922600a7G.LJJIIJ((C946310ajV) this.LJII.getValue());
        }
    }
}
