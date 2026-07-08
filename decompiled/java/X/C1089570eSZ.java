package X;

import com.bytedance.android.live.dynamicstrategy.strategy.Strategy;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEpiFeatureMigrateToFeatureCenterSetting;
import com.bytedance.android.livesdk.model.message.EpiDecision;
import com.bytedance.android.livesdkapi.depend.model.live.match.ServerDataV2Structure;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS418S0200000_17;

/* JADX INFO: renamed from: X.0eSZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089570eSZ implements InterfaceC1089740eSq {
    public final long LIZ;
    public final C1089550eSX LIZIZ;
    public final InterfaceC1089790eSv LIZJ;

    @Override // X.InterfaceC1089740eSq
    public final void LIZ(C1089610eSd c1089610eSd) {
    }

    @Override // X.InterfaceC1089740eSq
    public final void onDestroy() {
    }

    @Override // X.InterfaceC1089740eSq
    public final Strategy LIZIZ() {
        Strategy strategy = new Strategy() { // from class: X.0eSt
        };
        strategy.name = "server_reach_strategy";
        strategy.decisionKey = "server_reach_strategy";
        strategy.relativeFactors = Collections.singletonList(C1089110eRp.LIZLLL.LIZ);
        return strategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Object] */
    @Override // X.InterfaceC1089740eSq
    public final void LIZJ(C1089610eSd c1089610eSd) {
        Object obj;
        EpiDecision epiDecision;
        Unit unit;
        Unit unit2;
        C1089610eSd c1089610eSdLIZ;
        C0J0Q c0j0q;
        C0J0Q c0j0q2;
        if ((c1089610eSd instanceof C1280304zh) && (obj = ((C1280304zh) c1089610eSd).LIZLLL.get(C1089110eRp.LIZLLL.LIZ)) != null) {
            if ((obj instanceof EpiDecision) && (epiDecision = (EpiDecision) obj) != null) {
                long jLIZIZ = C963140bAe.LIZIZ();
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                if ((jLIZIZ / j) - epiDecision.ts < this.LIZ) {
                    C1089550eSX c1089550eSX = this.LIZIZ;
                    c1089550eSX.getClass();
                    for (Map.Entry<String, String> entry : epiDecision.dataV2.entrySet()) {
                        try {
                            ServerDataV2Structure serverDataV2Structure = (ServerDataV2Structure) C2348809Ig.LJII(ServerDataV2Structure.class, entry.getValue());
                            if (serverDataV2Structure != null && serverDataV2Structure.value != null) {
                                if (LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE.getValue()) {
                                    ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
                                    if (C500260Jjc.LJIIZILJ(c1089550eSX.LIZ)) {
                                        c0j0q = C0J0Q.ANCHOR;
                                    } else {
                                        c0j0q = C0J0Q.ROOM;
                                    }
                                    iLiveDecisionService.bg(c0j0q, entry.getKey(), serverDataV2Structure.value, EnumC467180ITs.SERVER_DECISION_GROUP.getGroupName(), false);
                                    String key = entry.getKey();
                                    EnumC1093260eYW enumC1093260eYW = EnumC1093260eYW.SERVER;
                                    Pair[] pairArr = new Pair[5];
                                    pairArr[0] = new Pair("decision_value", serverDataV2Structure.value);
                                    if (C500260Jjc.LJIIZILJ(c1089550eSX.LIZ)) {
                                        c0j0q2 = C0J0Q.ANCHOR;
                                    } else {
                                        c0j0q2 = C0J0Q.ROOM;
                                    }
                                    pairArr[1] = new Pair("decision_life_cycle", c0j0q2);
                                    pairArr[2] = new Pair("source", serverDataV2Structure.source);
                                    pairArr[3] = new Pair("rule_name", serverDataV2Structure.decisionName);
                                    pairArr[4] = new Pair("decision_id", serverDataV2Structure.decisionId);
                                    C1093270eYX.LIZ(new C473440IhS(key, enumC1093260eYW, C2097608Jq.LJIIJ(pairArr)));
                                }
                                AbstractC1089560eSY abstractC1089560eSY = (AbstractC1089560eSY) ((LinkedHashMap) c1089550eSX.LIZJ).get(entry.getKey());
                                if (abstractC1089560eSY != 0) {
                                    String str = serverDataV2Structure.value;
                                    DataChannel dataChannel = c1089550eSX.LIZ;
                                    ?? r6 = abstractC1089560eSY.LIZ.parse(str);
                                    if (r6 != 0) {
                                        if (abstractC1089560eSY.LIZJ(r6) && ((c1089610eSdLIZ = abstractC1089560eSY.LIZJ.LIZ(abstractC1089560eSY.LIZIZ())) == null || c1089610eSdLIZ.LIZJ)) {
                                            abstractC1089560eSY.LIZ(dataChannel, r6);
                                            abstractC1089560eSY.LIZLLL = r6;
                                            unit2 = Unit.LIZ;
                                        } else {
                                            InterfaceC1089790eSv interfaceC1089790eSv = abstractC1089560eSY.LIZIZ;
                                            if (interfaceC1089790eSv != null) {
                                                String.valueOf(abstractC1089560eSY.getClass());
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("value validity check failed, current value is ");
                                                sbLIZ.append((Object) r6);
                                                C2188811AlT.LIZIZ(sbLIZ);
                                                interfaceC1089790eSv.LIZ();
                                                unit2 = Unit.LIZ;
                                            }
                                        }
                                        if (unit2 == null) {
                                        }
                                    }
                                    InterfaceC1089790eSv interfaceC1089790eSv2 = abstractC1089560eSY.LIZIZ;
                                    if (interfaceC1089790eSv2 != null) {
                                        interfaceC1089790eSv2.LIZ();
                                    }
                                } else {
                                    InterfaceC1089790eSv interfaceC1089790eSv3 = c1089550eSX.LIZIZ;
                                    if (interfaceC1089790eSv3 != null) {
                                        entry.getKey();
                                        entry.getValue();
                                        interfaceC1089790eSv3.LIZIZ();
                                    }
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            InterfaceC1089790eSv interfaceC1089790eSv4 = c1089550eSX.LIZIZ;
                            if (interfaceC1089790eSv4 != null) {
                                e.toString();
                                interfaceC1089790eSv4.LIZIZ();
                            }
                        }
                    }
                    unit = Unit.LIZ;
                } else {
                    InterfaceC1089790eSv interfaceC1089790eSv5 = this.LIZJ;
                    if (interfaceC1089790eSv5 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("timeout，ts: ");
                        sbLIZ2.append(epiDecision.ts);
                        sbLIZ2.append("  expiration: ");
                        sbLIZ2.append(this.LIZ);
                        sbLIZ2.append(" currentTime: ");
                        sbLIZ2.append(C963140bAe.LIZIZ() / j);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        interfaceC1089790eSv5.LIZ();
                        unit = Unit.LIZ;
                    }
                }
                if (unit != null) {
                    return;
                }
            }
            new AwS418S0200000_17(this, obj, 54);
        }
    }

    public C1089570eSZ(long j, C1089550eSX c1089550eSX, InterfaceC1089790eSv interfaceC1089790eSv) {
        this.LIZ = j;
        this.LIZIZ = c1089550eSX;
        this.LIZJ = interfaceC1089790eSv;
    }
}
