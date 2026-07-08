package X;

import android.view.View;
import com.ss.android.ugc.airemix.api.IAIRemixService;
import com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService;
import com.ss.android.ugc.airemix.api.service.IAIRemixFeedMultiAnchorSuppression;
import com.ss.android.ugc.aweme.feed.model.AIRemixInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0M72, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M72 extends AbstractC1066890drz {
    public final C0M70 LLJ = C0M70.ANCHOR;

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C0M72();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.AI_REMIX_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.isEmpty()) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null && !creativeToolsBizPluginServiceLIZ.LIZ()) {
            CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ2 = C0LOV.LIZ();
            if (creativeToolsBizPluginServiceLIZ2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("airemix_");
                sbLIZ.append(C0M70.ANCHOR.getMobName());
                creativeToolsBizPluginServiceLIZ2.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), false);
            }
            return EnumC1050190dR3.NOT_FOUND;
        }
        IAIRemixService.LIZ.getClass();
        InterfaceC563140M6u interfaceC563140M6uLJIIIZ = C563030M6j.LIZ().LJIIIZ();
        if (interfaceC563140M6uLJIIIZ != null && interfaceC563140M6uLJIIIZ.LIZIZ()) {
            IAIRemixFeedMultiAnchorSuppression iAIRemixFeedMultiAnchorSuppression = (IAIRemixFeedMultiAnchorSuppression) PluggableExtentionKt.pluggableSpi$default(IAIRemixFeedMultiAnchorSuppression.class, false, false, false, 14, null);
            if (iAIRemixFeedMultiAnchorSuppression != null) {
                InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
                if (interfaceC1392640mLO == null) {
                    interfaceC1392640mLO = null;
                }
                if (iAIRemixFeedMultiAnchorSuppression.LIZ(interfaceC1392640mLO.LJIIIZ())) {
                    return EnumC1050190dR3.NOT_FOUND;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                list.remove(it3.next());
            }
            return super.LJJJJLL(list);
        }
        return EnumC1050190dR3.NOT_FOUND;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        String firstGid;
        String gamePlay;
        String firstGid2;
        super.p1(c2344009Gk);
        Aweme awemeLJIIZILJ = LJIIZILJ();
        IAIRemixEntranceMobService.LIZ.getClass();
        IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        String gamePlay2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String strCf = interfaceC1392640mLO.Cf();
        String mobName = this.LLJ.getMobName();
        String aid = awemeLJIIZILJ.getAid();
        AIRemixInfo aIRemixInfo = awemeLJIIZILJ.aiRemixInfo;
        if (aIRemixInfo != null) {
            firstGid = aIRemixInfo.getFirstGid();
        } else {
            firstGid = null;
        }
        AIRemixInfo aIRemixInfo2 = awemeLJIIZILJ.aiRemixInfo;
        if (aIRemixInfo2 != null) {
            gamePlay = aIRemixInfo2.getGamePlay();
        } else {
            gamePlay = null;
        }
        awemeLJIIZILJ.getAwemeType();
        iAIRemixEntranceMobServiceLIZ.LJIIL(strCf, true, mobName, aid, firstGid, gamePlay, awemeLJIIZILJ);
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        String strCf2 = interfaceC1392640mLO2.Cf();
        String mobName2 = this.LLJ.getMobName();
        String aid2 = awemeLJIIZILJ.getAid();
        AIRemixInfo aIRemixInfo3 = awemeLJIIZILJ.aiRemixInfo;
        if (aIRemixInfo3 != null) {
            firstGid2 = aIRemixInfo3.getFirstGid();
        } else {
            firstGid2 = null;
        }
        AIRemixInfo aIRemixInfo4 = awemeLJIIZILJ.aiRemixInfo;
        if (aIRemixInfo4 != null) {
            gamePlay2 = aIRemixInfo4.getGamePlay();
        }
        awemeLJIIZILJ.getAwemeType();
        iAIRemixEntranceMobServiceLIZ.LJFF(strCf2, true, mobName2, aid2, firstGid2, gamePlay2, awemeLJIIZILJ);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String firstGid;
        String gamePlay;
        Aweme awemeLJIIZILJ = LJIIZILJ();
        IAIRemixEntranceMobService.LIZ.getClass();
        IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String strCf = interfaceC1392640mLO.Cf();
        String mobName = this.LLJ.getMobName();
        String aid = awemeLJIIZILJ.getAid();
        AIRemixInfo aIRemixInfo = awemeLJIIZILJ.aiRemixInfo;
        if (aIRemixInfo != null) {
            firstGid = aIRemixInfo.getFirstGid();
        } else {
            firstGid = null;
        }
        AIRemixInfo aIRemixInfo2 = awemeLJIIZILJ.aiRemixInfo;
        if (aIRemixInfo2 != null) {
            gamePlay = aIRemixInfo2.getGamePlay();
        } else {
            gamePlay = null;
        }
        awemeLJIIZILJ.getAwemeType();
        iAIRemixEntranceMobServiceLIZ.LIZIZ(strCf, true, mobName, aid, firstGid, gamePlay, awemeLJIIZILJ);
        C23250099c.LIZLLL(providerCoroutineScope(), null, null, new C563180M6y(this, null), 3);
    }
}
