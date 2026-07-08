package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C01GW;
import X.C2188811AlT;
import X.C307001Gy;
import X.C915980Zwa;
import X.C927600aFK;
import X.C930540aK4;
import X.InterfaceC946300ajU;
import X.InterfaceC954180awC;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MaxGuestCountReachedCondition extends AbstractC20358214lI {
    public final AwS559S0100000_15 LJFF = new AwS559S0100000_15(this, 309);

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "max_guest_count_reached";
    }

    public final boolean LJIIJJI() {
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJIILLIIL()) {
            LJIIIZ("currentGuestCount >= getCurrentLayoutMaxGuestCount()");
            InterfaceC946300ajU interfaceC946300ajU = this.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
            }
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("not match: conditionMatch - ");
        sbLIZ.append("max_guest_count_reached");
        sbLIZ.append(": max guest count not reached");
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC946300ajU interfaceC946300ajU2 = this.LJ;
        if (interfaceC946300ajU2 != null) {
            interfaceC946300ajU2.LIZ(false, false);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        if (!C930540aK4.LIZJ()) {
            LJIIIZ("!currentSelfIsAnchor()");
            InterfaceC946300ajU interfaceC946300ajU = this.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
                return;
            }
            return;
        }
        if (LJIIJJI()) {
            return;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LLIILII(this.LJFF);
        }
        LIZ();
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJLIL(this.LJFF);
        }
    }
}
