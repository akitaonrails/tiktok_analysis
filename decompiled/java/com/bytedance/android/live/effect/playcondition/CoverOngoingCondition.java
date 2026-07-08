package com.bytedance.android.live.effect.playcondition;

import X.AbstractC20358214lI;
import X.C1161920gLG;
import X.C500260Jjc;
import X.C771680UOw;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.broadcast.api.IBroadcastService;

/* JADX INFO: loaded from: classes32.dex */
public final class CoverOngoingCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "cover_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastKit().getClass();
        String str = C771680UOw.LJIIJJI;
        if (str == null) {
            str = "";
        }
        if (C500260Jjc.LJJIIZ(str)) {
            LJIIIZ("cover is not empty");
            InterfaceC946300ajU interfaceC946300ajU = this.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
            }
        }
    }
}
