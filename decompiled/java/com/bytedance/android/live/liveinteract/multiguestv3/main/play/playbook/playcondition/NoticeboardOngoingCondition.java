package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C01GW;
import X.C176600m4;
import X.C452501pT;
import X.C941700ac4;
import X.C986320bm2;
import X.InterfaceC941720ac6;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class NoticeboardOngoingCondition extends AbstractC20358214lI {
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS559S0100000_15(this, 311));

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "noticeboard_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (!C176600m4.LIZIZ(interfaceC941720ac6LIZIZ != null ? Boolean.valueOf(interfaceC941720ac6LIZIZ.LJIIJ("notice_board")) : null)) {
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ2 != null) {
                interfaceC941720ac6LIZIZ2.LIZ((C986320bm2) this.LJFF.getValue());
            }
            LIZ();
            return;
        }
        LJIIIZ("in getStatus");
        InterfaceC946300ajU interfaceC946300ajU = this.LJ;
        if (interfaceC946300ajU != null) {
            interfaceC946300ajU.LIZ(true, false);
        }
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIIJJI((C986320bm2) this.LJFF.getValue());
        }
    }
}
