package X;

import Y.ARunnableS2S1101000_13;
import android.os.SystemClock;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.service.INetworkApiService;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import com.bytedance.helios.network.pipeline.recognize.NetworkDomainRecognize;
import com.bytedance.pumbaa.utility.utils.CostTimeline;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Wyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840790Wyb {
    public static final Set<EnumC841380WzY> LIZ;
    public static final Set<EnumC841390WzZ> LIZIZ;
    public static final List<InterfaceC841560Wzq> LIZJ;
    public static final List<InterfaceC841560Wzq> LIZLLL;
    public static final List<C840650WyN> LJ;
    public static final List<InterfaceC841560Wzq> LJFF;
    public static final List<InterfaceC841560Wzq> LJI;
    public static final List<InterfaceC841560Wzq> LJII;
    public static final C840880Wyk LJIIIIZZ;

    static {
        Set<EnumC841380WzY> setLJLIIL = C13LQ.LJLIIL(EnumC841380WzY.values());
        LIZ = setLJLIIL;
        Set<EnumC841390WzZ> setLJLIIL2 = C13LQ.LJLIIL(EnumC841390WzZ.values());
        LIZIZ = setLJLIIL2;
        InterfaceC841560Wzq interfaceC841560Wzq = new InterfaceC841560Wzq() { // from class: X.0WyL
            /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
            /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC841560Wzq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C840860Wyi r9) {
                /*
                    Method dump skipped, instruction units count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C840630WyL.LIZ(X.0Wyi):void");
            }
        };
        InterfaceC841560Wzq interfaceC841560Wzq2 = new InterfaceC841560Wzq() { // from class: X.0WyR
            /* JADX WARN: Removed duplicated region for block: B:121:0x035a  */
            /* JADX WARN: Removed duplicated region for block: B:129:0x0372  */
            /* JADX WARN: Removed duplicated region for block: B:196:0x04f4  */
            /* JADX WARN: Removed duplicated region for block: B:212:0x0541  */
            /* JADX WARN: Removed duplicated region for block: B:245:0x0614  */
            @Override // X.InterfaceC841560Wzq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C840860Wyi r27) {
                /*
                    Method dump skipped, instruction units count: 1695
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C840690WyR.LIZ(X.0Wyi):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:124:0x01db A[EDGE_INSN: B:124:0x01db->B:125:0x01dc BREAK  A[LOOP:3: B:93:0x015f->B:274:0x015f]] */
            /* JADX WARN: Removed duplicated region for block: B:126:0x01de A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:130:0x01ea  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x01f0  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x01f9  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x0257  */
            /* JADX WARN: Removed duplicated region for block: B:171:0x026b  */
            /* JADX WARN: Removed duplicated region for block: B:186:0x02aa  */
            /* JADX WARN: Removed duplicated region for block: B:211:0x0304 A[EDGE_INSN: B:211:0x0304->B:212:0x0305 BREAK  A[LOOP:7: B:197:0x02c8->B:300:0x02c8]] */
            /* JADX WARN: Removed duplicated region for block: B:213:0x0307 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:217:0x0318  */
            /* JADX WARN: Removed duplicated region for block: B:220:0x031e  */
            /* JADX WARN: Removed duplicated region for block: B:222:0x032d  */
            /* JADX WARN: Removed duplicated region for block: B:225:0x0334  */
            /* JADX WARN: Removed duplicated region for block: B:228:0x033e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static X.C0WSU LIZIZ(X.InterfaceC823460WSa r19, java.lang.String r20) {
                /*
                    Method dump skipped, instruction units count: 879
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C840690WyR.LIZIZ(X.0WSa, java.lang.String):X.0WSU");
            }

            public static final void LIZJ(CostTimeline costTimeline, String str) {
                costTimeline.logCostTime(str, null, SystemClock.elapsedRealtimeNanos(), null);
            }
        };
        InterfaceC841560Wzq interfaceC841560Wzq3 = new InterfaceC841560Wzq() { // from class: X.0WzF
            @Override // X.InterfaceC841560Wzq
            public final void LIZ(C840860Wyi c840860Wyi) {
                if (c840860Wyi.LIZ == EnumC841300WzQ.BEFORE_CALL && !c840860Wyi.LJI) {
                    C840670WyP.LIZ(c840860Wyi.LIZIZ(), "fuse", c840860Wyi.LIZJ);
                }
            }
        };
        InterfaceC841560Wzq interfaceC841560Wzq4 = new InterfaceC841560Wzq() { // from class: X.0WyS
            /* JADX WARN: Removed duplicated region for block: B:83:0x018a  */
            @Override // X.InterfaceC841560Wzq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C840860Wyi r17) {
                /*
                    Method dump skipped, instruction units count: 642
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C840700WyS.LIZ(X.0Wyi):void");
            }
        };
        InterfaceC841560Wzq interfaceC841560Wzq5 = new InterfaceC841560Wzq() { // from class: X.0WyZ
            @Override // X.InterfaceC841560Wzq
            public final void LIZ(C840860Wyi c840860Wyi) {
                if (c840860Wyi.LIZ == EnumC841300WzQ.BEFORE_CALL && !c840860Wyi.LJI) {
                    InterfaceC823460WSa interfaceC823460WSaLIZIZ = c840860Wyi.LIZIZ();
                    C823750WTd.LIZ.getClass();
                    C823750WTd.LIZ(2, interfaceC823460WSaLIZIZ);
                    c840860Wyi.LIZJ.logCostTime("stageAfterFuse", null, SystemClock.elapsedRealtimeNanos(), null);
                    C840640WyM.LIZ.getClass();
                    C840640WyM.LJFF(interfaceC823460WSaLIZIZ, "fuse");
                    c840860Wyi.LIZJ.logCostTime("handleReport", null, SystemClock.elapsedRealtimeNanos(), null);
                    CostTimeline costTimeline = c840860Wyi.LIZJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("id: ");
                    sbLIZ.append(interfaceC823460WSaLIZIZ.LIZ().LIZ.LIZ);
                    sbLIZ.append(" memberName:");
                    sbLIZ.append(interfaceC823460WSaLIZIZ.LIZ().LIZ.LIZLLL);
                    sbLIZ.append(" uuid:");
                    sbLIZ.append(interfaceC823460WSaLIZIZ.LIZ().LJJIII);
                    costTimeline.logTotal("fuseCost", C2188811AlT.LIZIZ(sbLIZ));
                    costTimeline.printLog("Helios:Network-Cost");
                    C786410Ut5.LJJZZIII(PumbaaWorkerThread.getHandler(), new ARunnableS2S1101000_13(interfaceC823460WSaLIZIZ.LIZ().LIZ.LIZ, "fuse", c840860Wyi.LIZJ, 3));
                }
            }
        };
        InterfaceC841560Wzq interfaceC841560Wzq6 = new InterfaceC841560Wzq() { // from class: X.0WyN
            /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0185 A[PHI: r4
              0x0185: PHI (r4v2 com.bytedance.helios.network.api.config.InventoryConfig) = 
              (r4v1 com.bytedance.helios.network.api.config.InventoryConfig)
              (r4v3 com.bytedance.helios.network.api.config.InventoryConfig)
             binds: [B:37:0x009d, B:86:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC841560Wzq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C840860Wyi r9) {
                /*
                    Method dump skipped, instruction units count: 471
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C840650WyN.LIZ(X.0Wyi):void");
            }
        };
        InterfaceC841560Wzq interfaceC841560Wzq7 = new InterfaceC841560Wzq() { // from class: X.0Wys
            @Override // X.InterfaceC841560Wzq
            public final void LIZ(C840860Wyi c840860Wyi) {
                C840660WyO c840660WyOLIZ = c840860Wyi.LIZ();
                if (c840660WyOLIZ == null) {
                    return;
                }
                Object obj = ((LinkedHashMap) c840860Wyi.LJ).get("aspect_feature_overrides");
                if (obj == null) {
                    obj = null;
                }
                Map linkedHashMap = (Map) obj;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    c840860Wyi.LJ.put("aspect_feature_overrides", linkedHashMap);
                }
                String strSandboxState = NetworkComponent.INSTANCE.sandboxState();
                if (strSandboxState == null) {
                    strSandboxState = "pns-null";
                }
                linkedHashMap.put("sandbox_state", strSandboxState);
                linkedHashMap.put("hybrid_channel", c840660WyOLIZ.LJJIIZI);
                linkedHashMap.put("hybrid_origin_url", c840660WyOLIZ.LJJIJ);
            }
        };
        InterfaceC841560Wzq interfaceC841560Wzq8 = new InterfaceC841560Wzq() { // from class: X.0WyK
            @Override // X.InterfaceC841560Wzq
            public final void LIZ(C840860Wyi c840860Wyi) {
                boolean z;
                String strSubstring;
                Object obj;
                Map<String, List<String>> mapLJI;
                Object objLJJJLL;
                List<String> list;
                Object objSingletonList;
                String str;
                String str2;
                String str3;
                String str4;
                String host;
                Map<String, String> responseCookies;
                String string;
                Integer responseCode;
                List<String> list2;
                C840660WyO c840660WyOLIZ = c840860Wyi.LIZ();
                if (c840660WyOLIZ == null) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (c840860Wyi.LIZ == EnumC841300WzQ.BEFORE_CALL) {
                    z = true;
                } else {
                    z = false;
                }
                String strLJIIIIZZ = c840660WyOLIZ.LJIIIIZZ();
                if (strLJIIIIZZ != null && a0.LJJIJIIJIL(strLJIIIIZZ, '/')) {
                    strSubstring = strLJIIIIZZ.substring(0, strLJIIIIZZ.length() - 1);
                } else {
                    strSubstring = strLJIIIIZZ;
                }
                Map<Integer, Integer> map = C842060X1o.LIZ;
                linkedHashMap.putAll(C2097608Jq.LJIIJ(new Pair("url", c840660WyOLIZ.LJIILL()), new Pair("scheme", c840660WyOLIZ.LJIILJJIL()), new Pair("domain", c840660WyOLIZ.LJFF()), new Pair("path", strLJIIIIZZ), new Pair("query", c840660WyOLIZ.LJIIIZ()), new Pair("header", c840660WyOLIZ.LJI()), new Pair("cookie", c840660WyOLIZ.LJ()), new Pair("method", c840660WyOLIZ.LJII()), new Pair("event_type", c840660WyOLIZ.LIZ.LIZIZ), new Pair("function_sig_name", Integer.valueOf(C842060X1o.LIZ(c840660WyOLIZ.LIZ.LIZ.LIZ))), new Pair("performance_tag", c840660WyOLIZ.LJJJJJ)));
                Pair[] pairArr = new Pair[15];
                pairArr[0] = new Pair("cal_path", strSubstring);
                pairArr[1] = new Pair("event_source", c840660WyOLIZ.LIZ.LIZJ);
                String str5 = "1";
                if (c840660WyOLIZ.LJJIJLIJ) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[2] = new Pair("hybrid_is_isolate", obj);
                pairArr[3] = new Pair("webview_url", c840660WyOLIZ.LJJIL);
                pairArr[4] = new Pair("webview_channel", c840660WyOLIZ.LJJIZ);
                pairArr[5] = new Pair("dfid", c840660WyOLIZ.LJJIIJZLJL);
                Map<String, List<String>> mapLJI2 = c840660WyOLIZ.LJI();
                Object obj2 = null;
                String str6 = "pns-null";
                if ((mapLJI2 == null || (list2 = mapLJI2.get("User-Agent")) == null || (objLJJJLL = C13LP.LJJJLL(list2)) == null) && ((mapLJI = c840660WyOLIZ.LJI()) == null || (list = mapLJI.get("user-agent")) == null || (objLJJJLL = C13LP.LJJJLL(list)) == null)) {
                    objLJJJLL = "pns-null";
                }
                pairArr[6] = new Pair("user_agent", objLJJJLL);
                pairArr[7] = new Pair("dynamic_request_id", c840660WyOLIZ.LJJIJIL);
                String str7 = c840660WyOLIZ.LJJI;
                if (str7 == null) {
                    objSingletonList = "pns-null";
                } else {
                    objSingletonList = Collections.singletonList(str7);
                }
                pairArr[8] = new Pair("exempted_id_list", objSingletonList);
                C0WZW c0wzw = (C0WZW) c840660WyOLIZ.LIZ.LIZ.LJIIIZ;
                if (c0wzw != null) {
                    str = c0wzw.LIZLLL;
                } else {
                    str = null;
                }
                pairArr[9] = new Pair("call_site", str);
                pairArr[10] = new Pair("is_third_party", Boolean.valueOf(C841090Wz5.LIZ(c840660WyOLIZ)));
                pairArr[11] = new Pair("isolation_zone", c840660WyOLIZ.LJJJJI);
                NetworkComponent networkComponent = NetworkComponent.INSTANCE;
                Set<String> setTtpRegionsOrNull = networkComponent.ttpRegionsOrNull();
                if (setTtpRegionsOrNull == null || !setTtpRegionsOrNull.contains(C840430Wy1.LIZ)) {
                    Set<String> setTtpRegionsOrNull2 = networkComponent.ttpRegionsOrNull();
                    if (setTtpRegionsOrNull2 == null || setTtpRegionsOrNull2.contains(C840430Wy1.LIZ)) {
                        str5 = "pns-null";
                    } else {
                        str5 = CardStruct.IStatusCode.DEFAULT;
                    }
                }
                pairArr[12] = new Pair("is_in_sandbox_region", str5);
                String str8 = "";
                pairArr[13] = new Pair("sandbox_region_criteria", "");
                String strSandboxState = networkComponent.sandboxState();
                if (strSandboxState == null) {
                    strSandboxState = "pns-null";
                }
                pairArr[14] = new Pair("sandbox_state", strSandboxState);
                linkedHashMap2.putAll(C2097608Jq.LJIIJ(pairArr));
                if (c840660WyOLIZ.LIZ.LIZ.LIZ != 400001) {
                    linkedHashMap.put("network_event", c840660WyOLIZ);
                    if (!z) {
                        linkedHashMap.put("resp_header", c840660WyOLIZ.LJIILIIL());
                        Map<String, String> map2 = c840660WyOLIZ.LJIJI;
                        if (map2 == null || map2.isEmpty()) {
                            try {
                                INetworkApiService iNetworkApiService = c840660WyOLIZ.LIZIZ;
                                if (iNetworkApiService != null) {
                                    responseCookies = iNetworkApiService.getResponseCookies(c840660WyOLIZ);
                                } else {
                                    responseCookies = null;
                                }
                                c840660WyOLIZ.LJIJI = responseCookies;
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                        linkedHashMap.put("resp_cookie", c840660WyOLIZ.LJIJI);
                        INetworkApiService iNetworkApiService2 = c840660WyOLIZ.LIZIZ;
                        if (iNetworkApiService2 != null && (responseCode = iNetworkApiService2.getResponseCode(c840660WyOLIZ)) != null) {
                            string = responseCode.toString();
                        } else {
                            string = null;
                        }
                        linkedHashMap.put("response_code", string);
                    }
                }
                if (z) {
                    String strLJFF = c840660WyOLIZ.LJFF();
                    if (strLJFF != null) {
                        str8 = strLJFF;
                    }
                    linkedHashMap2.put("domain_type", NetworkDomainRecognize.domainIdentityRecognize(str8));
                } else {
                    String strLJFF2 = c840660WyOLIZ.LJJIII;
                    if (strLJFF2 != null || (strLJFF2 = c840660WyOLIZ.LJJIIJ) != null || (strLJFF2 = c840660WyOLIZ.LJFF()) != null) {
                        str6 = strLJFF2;
                    }
                    linkedHashMap.put("domain_after_tnc", str6);
                    linkedHashMap2.put("domain_type", NetworkDomainRecognize.domainIdentityRecognize(str6));
                }
                C840710WyT c840710WyT = c840660WyOLIZ.LIZ;
                int i = c840710WyT.LIZ.LIZ;
                if (i != 400001) {
                    if (i != 400101) {
                        if (i != 400203) {
                            return;
                        }
                        linkedHashMap2.put("ttnet_task_id", c840710WyT.LJJIII);
                        if (z) {
                            str4 = "4097(pre)";
                        } else {
                            str4 = "4097";
                        }
                        linkedHashMap2.put("trigger_id", str4);
                        linkedHashMap2.put("hybrid_channel", c840660WyOLIZ.LJJIIZI);
                        linkedHashMap2.put("hybrid_origin_url", c840660WyOLIZ.LJJIJ);
                        linkedHashMap2.put("hybrid_reason", c840660WyOLIZ.LJJJ);
                        linkedHashMap2.put("hybrid_router_dataflow_id", c840660WyOLIZ.LJJIJIIJI);
                        if (c840660WyOLIZ.LJJIJ != null) {
                            try {
                                host = new URL(c840660WyOLIZ.LJJIJ).getHost();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                host = null;
                            }
                            linkedHashMap2.put("hybrid_origin_url_domain", host);
                        }
                    } else {
                        if (z) {
                            str3 = "4387(pre)";
                        } else {
                            str3 = "4387";
                        }
                        linkedHashMap2.put("trigger_id", str3);
                        linkedHashMap.put("domain_after_tnc", c840660WyOLIZ.LJFF());
                    }
                } else {
                    if (z) {
                        str2 = "4388(pre)";
                    } else {
                        str2 = "4388";
                    }
                    linkedHashMap2.put("trigger_id", str2);
                    linkedHashMap.put("domain_after_tnc", c840660WyOLIZ.LJFF());
                }
                Object obj3 = ((LinkedHashMap) c840860Wyi.LJ).get("aspect_feature_overrides");
                if (obj3 != null) {
                    obj2 = obj3;
                }
                Map map3 = (Map) obj2;
                if (map3 != null && !map3.isEmpty()) {
                    linkedHashMap2.putAll(map3);
                }
                c840860Wyi.LJ.put("aspect_action", C839870Wx7.LIZ(linkedHashMap, linkedHashMap2));
            }
        };
        InterfaceC841560Wzq interfaceC841560Wzq9 = new InterfaceC841560Wzq() { // from class: X.0WyU
            @Override // X.InterfaceC841560Wzq
            public final void LIZ(C840860Wyi c840860Wyi) {
                Map mapLJ;
                List<String> list;
                Map<String, String> mapLJ2;
                List list2;
                Map mapLJ3;
                INetworkApiService iNetworkApiService;
                INetworkApiService iNetworkApiService2;
                C841010Wyx c841010Wyx;
                C840660WyO c840660WyO;
                INetworkApiService iNetworkApiService3;
                INetworkApiService iNetworkApiService4;
                String str;
                INetworkApiService iNetworkApiService5;
                Integer num;
                C840660WyO c840660WyOLIZ = c840860Wyi.LIZ();
                if (c840660WyOLIZ == null) {
                    return;
                }
                Object obj = ((LinkedHashMap) c840860Wyi.LJ).get("aspect_action");
                if (obj == null) {
                    obj = null;
                }
                InterfaceC1259504wL interfaceC1259504wL = (InterfaceC1259504wL) obj;
                C841170WzD c841170WzD = c840860Wyi.LIZLLL;
                int iIntValue = 1;
                if (interfaceC1259504wL instanceof C840150WxZ) {
                    Map<String, Object> map = ((C840150WxZ) interfaceC1259504wL).LIZIZ;
                    Object obj2 = map.get("errorCode");
                    if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                        iIntValue = num.intValue();
                    }
                    Object obj3 = map.get("msg");
                    if (!(obj3 instanceof String) || (str = (String) obj3) == null) {
                        str = "pns default error msg";
                    }
                    C841010Wyx c841010Wyx2 = c841170WzD.LIZ;
                    C840660WyO c840660WyO2 = c841010Wyx2.LIZIZ;
                    if (c840660WyO2 != null && (iNetworkApiService5 = c841010Wyx2.LIZJ) != null) {
                        iNetworkApiService5.dropRequest(c840660WyO2, iIntValue, str);
                        return;
                    }
                    return;
                }
                if (!(interfaceC1259504wL instanceof C823490WSd)) {
                    return;
                }
                C823490WSd c823490WSd = (C823490WSd) interfaceC1259504wL;
                Object obj4 = c823490WSd.LIZJ.get("update");
                if (!(obj4 instanceof Map) || (mapLJ = (Map) obj4) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                if (!mapLJ.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : mapLJ.entrySet()) {
                        linkedHashMap.put(entry.getKey(), new ReplaceConfig((String) entry.getValue(), "key"));
                    }
                    C841010Wyx c841010Wyx3 = c841170WzD.LIZ;
                    C840660WyO c840660WyO3 = c841010Wyx3.LIZIZ;
                    if (c840660WyO3 != null && (iNetworkApiService4 = c841010Wyx3.LIZJ) != null) {
                        iNetworkApiService4.replaceScheme(c840660WyO3, linkedHashMap);
                    }
                }
                Object obj5 = c823490WSd.LIZ.get("remove");
                if (!(obj5 instanceof List) || (list = (List) obj5) == null) {
                    list = C13BV.INSTANCE;
                }
                if ((!list.isEmpty()) && (c840660WyO = (c841010Wyx = c841170WzD.LIZ).LIZIZ) != null && (iNetworkApiService3 = c841010Wyx.LIZJ) != null) {
                    iNetworkApiService3.removeQueries(c840660WyO, list, true);
                }
                Object obj6 = c823490WSd.LIZ.get("update");
                if (!(obj6 instanceof Map) || (mapLJ2 = (Map) obj6) == null) {
                    mapLJ2 = C2097608Jq.LJ();
                }
                if (!mapLJ2.isEmpty()) {
                    List<String> listLLIIII = C13LP.LLIIII(mapLJ2.keySet());
                    C841010Wyx c841010Wyx4 = c841170WzD.LIZ;
                    C840660WyO c840660WyO4 = c841010Wyx4.LIZIZ;
                    if (c840660WyO4 != null && (iNetworkApiService2 = c841010Wyx4.LIZJ) != null) {
                        iNetworkApiService2.removeQueries(c840660WyO4, listLLIIII, true);
                    }
                    C841010Wyx c841010Wyx5 = c841170WzD.LIZ;
                    C840660WyO c840660WyO5 = c841010Wyx5.LIZIZ;
                    if (c840660WyO5 != null && (iNetworkApiService = c841010Wyx5.LIZJ) != null) {
                        iNetworkApiService.addQueries(c840660WyO5, mapLJ2);
                    }
                }
                Object obj7 = c823490WSd.LIZIZ.get("remove");
                if (!(obj7 instanceof List) || (list2 = (List) obj7) == null) {
                    list2 = C13BV.INSTANCE;
                }
                if (!list2.isEmpty()) {
                    C841170WzD.LIZIZ(c841170WzD, list2);
                }
                Object obj8 = c823490WSd.LIZIZ.get("update");
                if (!(obj8 instanceof Map) || (mapLJ3 = (Map) obj8) == null) {
                    mapLJ3 = C2097608Jq.LJ();
                }
                if (!(!mapLJ3.isEmpty())) {
                    return;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : mapLJ3.entrySet()) {
                    Object key = entry2.getKey();
                    String str2 = (String) entry2.getValue();
                    if (!a0.LJJLIIIJJIZ(str2, '$') || !Intrinsics.LJFF(str2, "$hybrid_origin_url") || (str2 = c840660WyOLIZ.LJJIJ) != null) {
                        linkedHashMap2.put(key, str2);
                    }
                }
                C841170WzD.LIZIZ(c841170WzD, C13LP.LLIIII(linkedHashMap2.keySet()));
                c841170WzD.LIZ(linkedHashMap2);
            }
        };
        InterfaceC841560Wzq interfaceC841560Wzq10 = new InterfaceC841560Wzq() { // from class: X.0Wyc
            @Override // X.InterfaceC841560Wzq
            public final void LIZ(C840860Wyi c840860Wyi) {
                WeakReference<C840660WyO> weakReferenceRemove;
                C840660WyO c840660WyOLIZ = c840860Wyi.LIZ();
                if (c840660WyOLIZ == null) {
                    return;
                }
                if (c840860Wyi.LIZ == EnumC841300WzQ.BEFORE_CALL) {
                    if (c840860Wyi.LJI) {
                        return;
                    }
                    C840710WyT c840710WyT = c840660WyOLIZ.LIZ;
                    if (!c840710WyT.LJJIFFI.LIZLLL && c840710WyT.LIZ.LIZ == 400203) {
                        String str = c840710WyT.LJJIII;
                        INetworkApiService iNetworkApiService = c840660WyOLIZ.LIZIZ;
                        if (iNetworkApiService != null) {
                            iNetworkApiService.addHeaders(c840660WyOLIZ, C2097908Jt.LIZJ(new Pair("x-metasec-pns-event-id", str)));
                        }
                        C840400Wxy.LIZ.put(str, new WeakReference<>(c840660WyOLIZ));
                        return;
                    }
                    return;
                }
                String str2 = c840660WyOLIZ.LIZ.LJJIII;
                if (str2 != null && (weakReferenceRemove = C840400Wxy.LIZ.remove(str2)) != null) {
                    weakReferenceRemove.get();
                }
            }
        };
        InterfaceC841560Wzq interfaceC841560Wzq11 = new InterfaceC841560Wzq() { // from class: X.0Wyj
            @Override // X.InterfaceC841560Wzq
            public final void LIZ(C840860Wyi c840860Wyi) {
                if (c840860Wyi.LIZ != EnumC841300WzQ.AFTER_CALL) {
                    return;
                }
                InterfaceC823460WSa interfaceC823460WSaLIZIZ = c840860Wyi.LIZIZ();
                if (c840860Wyi.LJII) {
                    return;
                }
                C840990Wyv c840990Wyv = interfaceC823460WSaLIZIZ.LIZ().LJI;
                if (c840990Wyv.LIZ || c840990Wyv.LIZIZ) {
                    C823750WTd.LIZ.getClass();
                    C823750WTd.LIZ(5, interfaceC823460WSaLIZIZ);
                    c840860Wyi.LIZJ.logCostTime("stageBeforeGuardAfterSample", null, SystemClock.elapsedRealtimeNanos(), null);
                    C840670WyP.LIZ(interfaceC823460WSaLIZIZ, "guard", c840860Wyi.LIZJ);
                }
            }
        };
        InterfaceC841560Wzq interfaceC841560Wzq12 = new InterfaceC841560Wzq() { // from class: X.0Wyg
            @Override // X.InterfaceC841560Wzq
            public final void LIZ(C840860Wyi c840860Wyi) {
                if (c840860Wyi.LIZ != EnumC841300WzQ.AFTER_CALL) {
                    return;
                }
                InterfaceC823460WSa interfaceC823460WSaLIZIZ = c840860Wyi.LIZIZ();
                if (c840860Wyi.LJII) {
                    return;
                }
                C840990Wyv c840990Wyv = interfaceC823460WSaLIZIZ.LIZ().LJI;
                if (c840990Wyv.LIZ || c840990Wyv.LIZIZ) {
                    C823750WTd.LIZ.getClass();
                    C823750WTd.LIZ(6, interfaceC823460WSaLIZIZ);
                    c840860Wyi.LIZJ.logCostTime("stageAfterGuard", null, SystemClock.elapsedRealtimeNanos(), null);
                    C840640WyM.LIZ.getClass();
                    C840640WyM.LJFF(interfaceC823460WSaLIZIZ, "guard");
                    c840860Wyi.LIZJ.logCostTime("handleReport", null, SystemClock.elapsedRealtimeNanos(), null);
                }
                C840640WyM.LIZ.getClass();
                C840640WyM.LJFF(interfaceC823460WSaLIZIZ, "inventory");
            }
        };
        List<InterfaceC841560Wzq> listLJIIJJI = C1697810uHb.LJIIJJI(interfaceC841560Wzq, interfaceC841560Wzq2, interfaceC841560Wzq3, interfaceC841560Wzq4, interfaceC841560Wzq5, interfaceC841560Wzq10);
        LIZJ = listLJIIJJI;
        List<InterfaceC841560Wzq> listLJIIJJI2 = C1697810uHb.LJIIJJI(interfaceC841560Wzq7, interfaceC841560Wzq8, interfaceC841560Wzq9);
        LIZLLL = listLJIIJJI2;
        List<C840650WyN> listSingletonList = Collections.singletonList(interfaceC841560Wzq6);
        LJ = listSingletonList;
        List<InterfaceC841560Wzq> listLJIIJJI3 = C1697810uHb.LJIIJJI(interfaceC841560Wzq7, interfaceC841560Wzq8, interfaceC841560Wzq9, interfaceC841560Wzq10);
        LJFF = listLJIIJJI3;
        List<InterfaceC841560Wzq> listLJIIJJI4 = C1697810uHb.LJIIJJI(interfaceC841560Wzq2, interfaceC841560Wzq11, interfaceC841560Wzq12);
        LJI = listLJIIJJI4;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(listLJIIJJI);
        linkedHashSet.addAll(listLJIIJJI2);
        linkedHashSet.addAll(listSingletonList);
        linkedHashSet.addAll(listLJIIJJI3);
        linkedHashSet.addAll(listLJIIJJI4);
        List<InterfaceC841560Wzq> listLLIIII = C13LP.LLIIII(linkedHashSet);
        LJII = listLLIIII;
        LJIIIIZZ = new C840880Wyk(listLLIIII, setLJLIIL, setLJLIIL2, new C840930Wyp(EnumC841300WzQ.BEFORE_CALL, C13LP.LJLIL(listLJIIJJI2, listLJIIJJI), C13BV.INSTANCE), new C840930Wyp(EnumC841300WzQ.AFTER_CALL, C13LP.LJLIL(listLJIIJJI3, listSingletonList), listLJIIJJI4));
    }
}
