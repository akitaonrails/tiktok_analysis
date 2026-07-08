package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C1125830fP3;
import X.C1125910fPB;
import X.InterfaceC946300ajU;
import com.bytedance.android.livesdkapi.depend.event.LiveCurrentGoalGlobalData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveGoalOngoingCondition extends AbstractC20358214lI {
    public static final /* synthetic */ int LJFF = 0;

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "live_goal_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (!C1125910fPB.LIZ((C1125830fP3) dataChannelGlobal.gg0(LiveCurrentGoalGlobalData.class))) {
            dataChannelGlobal.CQ2(LiveCurrentGoalGlobalData.class, this, new AwS610S0100000_31(this, 57));
            LIZ();
            return;
        }
        LJIIIZ("get status");
        InterfaceC946300ajU interfaceC946300ajU = this.LJ;
        if (interfaceC946300ajU != null) {
            interfaceC946300ajU.LIZ(true, false);
        }
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        DataChannelGlobal.LLILZ.zQ2(this);
        super.LJIIIIZZ();
    }
}
