package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C176600m4;
import X.C310401Ig;
import X.C941700ac4;
import X.C946290ajT;
import X.InterfaceC927690aFT;
import X.InterfaceC941720ac6;
import X.InterfaceC941900acO;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition.CountdownForAllOngoingCondition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class CountdownForAllOngoingCondition extends AbstractC20358214lI {
    public final C946290ajT LJFF = new InterfaceC941900acO() { // from class: X.0ajT
        @Override // X.InterfaceC941900acO
        public final void LIZJ(C01EL c01el, String str) {
            boolean z;
            if (Intrinsics.LJFF(str, "count_down_for_all")) {
                if (c01el == C01EL.START) {
                    z = true;
                } else {
                    z = false;
                }
                CountdownForAllOngoingCondition countdownForAllOngoingCondition = this.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ongoing: ");
                sbLIZ.append(z);
                countdownForAllOngoingCondition.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC946300ajU interfaceC946300ajU = this.LL.LJ;
                if (interfaceC946300ajU != null) {
                    interfaceC946300ajU.LIZ(z, false);
                }
            }
        }
    };

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "countdown_for_all_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        InterfaceC927690aFT interfaceC927690aFTLIZ = C310401Ig.LIZ();
        if (C176600m4.LIZIZ(interfaceC927690aFTLIZ != null ? Boolean.valueOf(interfaceC927690aFTLIZ.LJFF()) : null)) {
            LJIIIZ("in startCondition true");
            InterfaceC946300ajU interfaceC946300ajU = this.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
                return;
            }
            return;
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
