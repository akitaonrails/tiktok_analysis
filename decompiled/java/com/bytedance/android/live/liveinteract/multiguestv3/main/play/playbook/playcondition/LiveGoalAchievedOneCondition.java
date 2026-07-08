package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C1125830fP3;
import X.C1125860fP6;
import X.C1125920fPC;
import X.InterfaceC946300ajU;
import com.bytedance.android.livesdkapi.depend.event.LiveCurrentGoalGlobalData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveGoalAchievedOneCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "live_goal_achieved_one";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (!LJIIJJI((C1125830fP3) dataChannelGlobal.gg0(LiveCurrentGoalGlobalData.class))) {
            dataChannelGlobal.CQ2(LiveCurrentGoalGlobalData.class, this, new AwS610S0100000_31(this, 55));
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

    public static boolean LJIIJJI(C1125830fP3 c1125830fP3) {
        HashMap<Integer, C1125860fP6> map;
        if (c1125830fP3 != null && (map = c1125830fP3.LIZLLL) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, C1125860fP6> entry : map.entrySet()) {
                if (entry.getKey().intValue() == 1) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Collection<C1125860fP6> collectionValues = linkedHashMap.values();
            if (collectionValues != null) {
                for (C1125860fP6 c1125860fP6 : collectionValues) {
                    List<C1125920fPC> list = c1125860fP6.LIZJ;
                    if (list != null) {
                        Iterator<C1125920fPC> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (c1125860fP6.LJ(Long.valueOf(it2.next().LIZ))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
