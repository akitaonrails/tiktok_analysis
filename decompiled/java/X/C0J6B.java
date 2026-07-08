package X;

import com.bytedance.android.live.dynamicstrategy.refactor.model.SceneConfig;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.ExtraT;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkEPIData;
import com.bytedance.android.livesdk.signaling.model.downlink.EPIFeatureData;
import com.bytedance.android.livesdk.signaling.model.uplink.UplinkEPIData;
import com.bytedance.android.livesdkapi.depend.model.live.match.ServerDataV2Structure;
import com.bytedance.android.livesdkapi.host.IHostSignalService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J6B, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J6B {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(335));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(334));
    public static final Map<String, C0J6D> LIZJ = new LinkedHashMap();
    public static final C0J6A LIZLLL = new C0CW2<DownlinkEPIData>() { // from class: X.0J6A
        @Override // X.C0CW2
        public final void LJII(BaseDownlinkData baseDownlinkData, UplinkMessageResponse uplinkMessageResponse, AwS125S0110000_7 awS125S0110000_7) {
            String str;
            String str2;
            Object next;
            C0J0Q featureLifecycle;
            DownlinkEPIData downlinkEPIData = (DownlinkEPIData) baseDownlinkData;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleSignal type = ");
            sbLIZ.append(downlinkEPIData.getScene());
            sbLIZ.append(" data=");
            sbLIZ.append(downlinkEPIData);
            sbLIZ.append(" uniqId=");
            ExtraT extraT = uplinkMessageResponse.extra;
            if (extraT != null) {
                str = extraT.uniqId;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            C20441214yg.LIZIZ("EPISignal", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleSignal type = ");
            sbLIZ2.append(downlinkEPIData.getScene());
            sbLIZ2.append(" data=");
            sbLIZ2.append(downlinkEPIData);
            sbLIZ2.append(" uniqId=");
            ExtraT extraT2 = uplinkMessageResponse.extra;
            if (extraT2 != null) {
                str2 = extraT2.uniqId;
            } else {
                str2 = null;
            }
            sbLIZ2.append(str2);
            C2188811AlT.LIZIZ(sbLIZ2);
            C0J6D c0j6d = (C0J6D) ((LinkedHashMap) C0J6B.LIZJ).get(downlinkEPIData.getScene());
            if (c0j6d != null) {
                c0j6d.LIZIZ(downlinkEPIData);
            }
            String scene = downlinkEPIData.getScene();
            if (!Intrinsics.LJFF(scene, "epi_trigger") && !Intrinsics.LJFF(scene, "epi_host_trigger") && !Intrinsics.LJFF(scene, "enter_room") && !Intrinsics.LJFF(scene, "create_room") && (C963140bAe.LIZIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - downlinkEPIData.getTs() < ((Number) C0J6B.LIZ.getValue()).longValue()) {
                String scene2 = downlinkEPIData.getScene();
                synchronized (C0J0C.LIZIZ) {
                    try {
                        Iterator it2 = ((ArrayList) C0J0C.LIZ).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(((SceneConfig) next).getSceneName(), scene2)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        SceneConfig sceneConfig = (SceneConfig) next;
                        if (sceneConfig == null || (featureLifecycle = sceneConfig.getFeatureLifecycle()) == null) {
                            featureLifecycle = C0J0Q.APP;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                Map<String, String> decisions = downlinkEPIData.getDecisions();
                if (decisions != null) {
                    for (Map.Entry<String, String> entry : decisions.entrySet()) {
                        try {
                            ServerDataV2Structure serverDataV2Structure = (ServerDataV2Structure) C2348809Ig.LJII(ServerDataV2Structure.class, entry.getValue());
                            if (serverDataV2Structure != null) {
                                ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).bg(featureLifecycle, entry.getKey(), serverDataV2Structure.value, EnumC467180ITs.SERVER_DECISION_GROUP.getGroupName(), false);
                                C1093270eYX.LIZ(new C473440IhS(entry.getKey(), EnumC1093260eYW.SERVER, C2097608Jq.LJIIJ(new Pair("decision_value", serverDataV2Structure.value), new Pair("decision_life_cycle", featureLifecycle), new Pair("source", serverDataV2Structure.source), new Pair("rule_name", serverDataV2Structure.decisionName), new Pair("decision_id", serverDataV2Structure.decisionId))));
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C0J6C.LIZIZ("parse server decision error");
                        }
                    }
                }
                EPIFeatureData features = downlinkEPIData.getFeatures();
                if (features != null) {
                    Map<String, Long> map = features.intFeature;
                    if (map != null) {
                        for (Map.Entry<String, Long> entry2 : map.entrySet()) {
                            C0J0E c0j0eLIZ = C0J0F.LIZ(entry2.getKey());
                            if (c0j0eLIZ != null) {
                                ((ILiveDecisionService) C0J6B.LIZIZ.getValue()).bg(featureLifecycle, c0j0eLIZ.LIZ, entry2.getValue(), c0j0eLIZ.LIZJ, false);
                            }
                        }
                    }
                    Map<String, Float> map2 = features.floatFeature;
                    if (map2 != null) {
                        for (Map.Entry<String, Float> entry3 : map2.entrySet()) {
                            C0J0E c0j0eLIZ2 = C0J0F.LIZ(entry3.getKey());
                            if (c0j0eLIZ2 != null) {
                                ((ILiveDecisionService) C0J6B.LIZIZ.getValue()).bg(featureLifecycle, c0j0eLIZ2.LIZ, entry3.getValue(), c0j0eLIZ2.LIZJ, false);
                            }
                        }
                    }
                    Map<String, String> map3 = features.stringFeature;
                    if (map3 != null) {
                        for (Map.Entry<String, String> entry4 : map3.entrySet()) {
                            C0J0E c0j0eLIZ3 = C0J0F.LIZ(entry4.getKey());
                            if (c0j0eLIZ3 != null) {
                                ((ILiveDecisionService) C0J6B.LIZIZ.getValue()).bg(featureLifecycle, c0j0eLIZ3.LIZ, entry4.getValue(), c0j0eLIZ3.LIZJ, false);
                            }
                        }
                    }
                }
            }
        }
    };

    public static void LIZ(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C0J0C.LIZ(str, linkedHashMap);
        ((IHostSignalService) C1161920gLG.LIZJ(IHostSignalService.class)).uplinkEPIData("data_update", new UplinkEPIData(str, linkedHashMap));
    }
}
