package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C01IB;
import X.C941700ac4;
import X.C948700anM;
import X.InterfaceC938530aWx;
import X.InterfaceC941720ac6;
import X.InterfaceC941900acO;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition.GuestShowdownOngoingCondition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class GuestShowdownOngoingCondition extends AbstractC20358214lI {
    public final C948700anM LJFF = new InterfaceC941900acO() { // from class: X.0anM
        @Override // X.InterfaceC941900acO
        public final void LIZJ(C01EL c01el, String str) {
            boolean z;
            if (Intrinsics.LJFF(str, "guest_showdown")) {
                if (c01el == C01EL.START) {
                    z = true;
                } else {
                    z = false;
                }
                GuestShowdownOngoingCondition guestShowdownOngoingCondition = this.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("status listener, ongoing: ");
                sbLIZ.append(z);
                guestShowdownOngoingCondition.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC946300ajU interfaceC946300ajU = this.LL.LJ;
                if (interfaceC946300ajU != null) {
                    interfaceC946300ajU.LIZ(z, false);
                }
            }
        }
    };

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "guest_showdown_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        InterfaceC938530aWx interfaceC938530aWxLIZ;
        InterfaceC938530aWx interfaceC938530aWxLIZ2;
        InterfaceC938530aWx interfaceC938530aWxLIZ3 = C01IB.LIZ();
        if ((interfaceC938530aWxLIZ3 == null || interfaceC938530aWxLIZ3.LLLL() != 0) && (((interfaceC938530aWxLIZ = C01IB.LIZ()) == null || interfaceC938530aWxLIZ.LLLL() != 5) && (interfaceC938530aWxLIZ2 = C01IB.LIZ()) != null && Integer.valueOf(interfaceC938530aWxLIZ2.LLLL()) != null)) {
            LJIIIZ("getStatus in startConditionObserver");
            InterfaceC946300ajU interfaceC946300ajU = this.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
            }
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LIZ(this.LJFF);
        }
        LIZ();
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIIJJI(this.LJFF);
        }
    }
}
