package X;

import Y.ARunnableS113S0100000_13;
import android.os.SystemClock;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.NetworkConfig;
import com.bytedance.helios.network.api.consumer.OperateHistory;
import com.bytedance.helios.network.api.consumer.OperatePairs;
import com.bytedance.helios.network.api.consumer.ReportParam;
import com.bytedance.helios.network.api.service.INetworkApiService;
import com.bytedance.helios.network.pipeline.ModifyConfig;
import com.bytedance.helios.network.pipeline.OperationConfig;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.bytedance.pumbaa.ruler.base.models.RuleModel;
import com.bytedance.pumbaa.utility.utils.CostTimeline;
import com.bytedance.pumbaa.utility.worker.PumbaaEfficientThread;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS14S2300000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840670WyP {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(InterfaceC823460WSa interfaceC823460WSa, String str, CostTimeline costTimeline) {
        String str2;
        n nVarLJIILIIL;
        k kVarLJJIIZ;
        k kVarLJJIIZ2;
        k kVarLJJIIZ3;
        boolean zLJ;
        Set<String> setLJJIJIL;
        boolean zLJ2;
        OperationConfig operationConfig;
        List<String> list;
        k kVarLJJIIZ4;
        ModifyConfig modifyConfig;
        k kVarLJJIIZ5;
        k kVar;
        k kVarLJJIIZ6;
        n nVarLJIILIIL2;
        Integer numValueOf;
        String strLJIL;
        C840660WyO c840660WyO;
        INetworkApiService iNetworkApiService;
        n nVarLJIILIIL3;
        String strLJIL2;
        k kVarLJJIIZ7;
        boolean zLJ3;
        k kVarLJJIIZ8;
        k kVarLJJIIZ9;
        NetworkComponent networkComponent = NetworkComponent.INSTANCE;
        NetworkConfig networkConfigNetworkConfigOrNull = networkComponent.networkConfigOrNull();
        n nVarLJIILIIL4 = null;
        if ((Intrinsics.LJFF(str, "fuse") && (networkConfigNetworkConfigOrNull == null || !networkConfigNetworkConfigOrNull.enableFuseEngineControl)) || ((Intrinsics.LJFF(str, "guard") && (networkConfigNetworkConfigOrNull == null || !networkConfigNetworkConfigOrNull.enableGuardEngineControl)) || ((interfaceC823460WSa instanceof C840660WyO) && (interfaceC823460WSa.LIZ().LJJIFFI.LIZ || interfaceC823460WSa.LIZ().LJJIFFI.LIZLLL)))) {
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Invoke", new C840810Wyd(interfaceC823460WSa, str, networkConfigNetworkConfigOrNull), 3, null);
            return;
        }
        IRuleEngineService iRuleEngineServicePolicyEngine = networkComponent.policyEngine();
        if (iRuleEngineServicePolicyEngine != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (Intrinsics.LJFF(str, "fuse")) {
                str2 = "network_fuse";
            } else {
                str2 = "network";
            }
            linkedHashMap.put("source", str2);
            linkedHashMap.put("api_id", Integer.valueOf(interfaceC823460WSa.LIZ().LIZ.LIZ));
            boolean z = interfaceC823460WSa instanceof C840660WyO;
            if (z) {
                C840660WyO c840660WyO2 = (C840660WyO) interfaceC823460WSa;
                if (c840660WyO2.LIZIZ != null) {
                    linkedHashMap.put("scheme", c840660WyO2.LJIILJJIL());
                    linkedHashMap.put("domain", c840660WyO2.LJFF());
                    linkedHashMap.put("path", c840660WyO2.LJIIIIZZ());
                    linkedHashMap.put("event_source", interfaceC823460WSa.LIZ().LIZJ);
                    linkedHashMap.put("event_type", interfaceC823460WSa.LIZ().LIZIZ);
                    linkedHashMap.put("method", c840660WyO2.LJII());
                }
            } else if (interfaceC823460WSa instanceof C840780Wya) {
                C840780Wya c840780Wya = (C840780Wya) interfaceC823460WSa;
                String str3 = c840780Wya.LJ;
                if (str3 != null && !a0.LJJJIL(str3)) {
                    linkedHashMap.put("content_type", c840780Wya.LJ);
                }
                String str4 = c840780Wya.LJFF;
                if (str4 != null && !a0.LJJJIL(str4)) {
                    linkedHashMap.put("content_sub_type", c840780Wya.LJFF);
                }
            }
            linkedHashMap.putAll(interfaceC823460WSa.LIZ().LJIJJ);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Invoke", new C840890Wyl(interfaceC823460WSa, str, linkedHashMap), 3, null);
            costTimeline.logCostTime("RuleEngine.generateParams", null, SystemClock.elapsedRealtimeNanos(), null);
            C2097608Jq.LJ();
            C0WLX c0wlxLIZLLL = iRuleEngineServicePolicyEngine.LIZLLL(linkedHashMap);
            C0WSW.LIZ("Helios:Network-Invoke", new C840940Wyq(interfaceC823460WSa, str, c0wlxLIZLLL), 3, null);
            costTimeline.logCostTime("RuleEngine.validate", null, SystemClock.elapsedRealtimeNanos(), null);
            if (c0wlxLIZLLL.LIZ == 0 && (!c0wlxLIZLLL.LIZJ.isEmpty()) && (!c0wlxLIZLLL.LJI.isEmpty())) {
                Map<String, Object> map = interfaceC823460WSa.LIZ().LJIIZILJ;
                Set setLIZLLL = C19719512Dh.LIZLLL(interfaceC823460WSa.LIZ().LJIIZILJ.get("strategyNames"));
                if (setLIZLLL == null) {
                    setLIZLLL = new LinkedHashSet();
                }
                setLIZLLL.addAll(c0wlxLIZLLL.LIZJ);
                map.put("strategyNames", setLIZLLL);
                ArrayList<C0WLW> arrayList = new ArrayList();
                for (C0WLW c0wlw : c0wlxLIZLLL.LJI) {
                    RuleModel ruleModel = c0wlw.LIZJ;
                    k kVar2 = c0wlw.LJ;
                    if (kVar2 != null) {
                        nVarLJIILIIL4 = kVar2.LJIILIIL();
                    }
                    if (c0wlw.LIZ == 0 && ruleModel != null) {
                        if (nVarLJIILIIL4 != null && (kVarLJJIIZ9 = nVarLJIILIIL4.LJJIIZ("check_modify_config_hit")) != null) {
                            zLJ3 = kVarLJJIIZ9.LJ();
                        } else {
                            zLJ3 = false;
                        }
                        interfaceC823460WSa.LIZ().LJIL.add(ruleModel);
                        if (!zLJ3) {
                            String str5 = ruleModel.key;
                            if (str5 != null && !a0.LJJJIL(str5)) {
                                interfaceC823460WSa.LIZ().LJIJ.add(str5);
                                interfaceC823460WSa.LIZ().LJJIFFI.LIZIZ = true;
                                if (nVarLJIILIIL4 != null && (kVarLJJIIZ8 = nVarLJIILIIL4.LJJIIZ("need_stack")) != null && kVarLJJIIZ8.LJ()) {
                                    interfaceC823460WSa.LIZ().LJIJJLI.add(new ReportParam("stack", C082P.LIZIZ(new Throwable()), "log_extra", true, true));
                                }
                            }
                        } else {
                            arrayList.add(c0wlw);
                        }
                    } else {
                        Throwable th = c0wlxLIZLLL.LJFF;
                        if (th != null) {
                            C786410Ut5.LJJZZIII(PumbaaEfficientThread.getHandler(), new ARunnableS113S0100000_13(th, 163));
                        }
                    }
                    nVarLJIILIIL4 = null;
                }
                costTimeline.logCostTime("RuleEngine.handleRuleResult", nVarLJIILIIL4, SystemClock.elapsedRealtimeNanos(), nVarLJIILIIL4);
                if (Intrinsics.LJFF(str, "fuse")) {
                    C840710WyT c840710WyTLIZ = interfaceC823460WSa.LIZ();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (RuleModel ruleModel2 : c840710WyTLIZ.LJIL) {
                        k kVar3 = ruleModel2.conf;
                        if (kVar3 != null) {
                            nVarLJIILIIL3 = kVar3.LJIILIIL();
                        } else {
                            nVarLJIILIIL3 = null;
                        }
                        if (nVarLJIILIIL3 != null && (kVarLJJIIZ7 = nVarLJIILIIL3.LJJIIZ("action")) != null) {
                            strLJIL2 = kVarLJJIIZ7.LJIL();
                        } else {
                            strLJIL2 = null;
                        }
                        if (Intrinsics.LJFF(strLJIL2, "fuse")) {
                            arrayList2.add(ruleModel2);
                        } else if (Intrinsics.LJFF(strLJIL2, "modify")) {
                            arrayList3.add(ruleModel2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        C840970Wyt c840970Wyt = c840710WyTLIZ.LJJIFFI;
                        c840970Wyt.LIZLLL = true;
                        c840970Wyt.LJ = C826580Wbg.LIZ(c840710WyTLIZ.LIZ.LJI);
                        if (z && (kVar = ((RuleModel) C13LP.LJJJJZI(arrayList2)).conf) != null && (kVarLJJIIZ6 = kVar.LJIILIIL().LJJIIZ("fuse_config")) != null && (nVarLJIILIIL2 = kVarLJJIIZ6.LJIILIIL()) != null) {
                            k kVarLJJIIZ10 = nVarLJIILIIL2.LJJIIZ("code");
                            if (kVarLJJIIZ10 != null) {
                                numValueOf = Integer.valueOf(kVarLJJIIZ10.LJIIJJI());
                            } else {
                                numValueOf = null;
                            }
                            k kVarLJJIIZ11 = nVarLJIILIIL2.LJJIIZ("message");
                            if (kVarLJJIIZ11 != null) {
                                strLJIL = kVarLJJIIZ11.LJIL();
                            } else {
                                strLJIL = null;
                            }
                            if (numValueOf != null && strLJIL != null && strLJIL.length() != 0 && (iNetworkApiService = (c840660WyO = (C840660WyO) interfaceC823460WSa).LIZIZ) != null) {
                                iNetworkApiService.dropRequest(c840660WyO, numValueOf.intValue(), strLJIL);
                            }
                        }
                    } else if (!arrayList3.isEmpty()) {
                        k kVar4 = ((RuleModel) C13LP.LJJJJZI(arrayList3)).conf;
                        if (kVar4 != null && (kVarLJJIIZ5 = kVar4.LJIILIIL().LJJIIZ("is_ignore_case")) != null) {
                            zLJ2 = kVarLJJIIZ5.LJ();
                        } else {
                            zLJ2 = true;
                        }
                        ModifyConfig modifyConfig2 = new ModifyConfig(null, null, null, null, null, null, null);
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            k kVar5 = ((RuleModel) it2.next()).conf;
                            if (kVar5 != null) {
                                kVarLJJIIZ4 = kVar5.LJIILIIL().LJJIIZ("modify_config");
                            } else {
                                kVarLJJIIZ4 = null;
                            }
                            if (kVarLJJIIZ4 == null) {
                                modifyConfig = null;
                            } else {
                                n nVarLJIILIIL5 = kVarLJJIIZ4.LJIILIIL();
                                modifyConfig = new ModifyConfig(C840730WyV.LIZ(nVarLJIILIIL5.LJJIIZ("query")), C840730WyV.LIZ(nVarLJIILIIL5.LJJIIZ("header")), C840730WyV.LIZ(nVarLJIILIIL5.LJJIIZ("cookie")), C840730WyV.LIZ(nVarLJIILIIL5.LJJIIZ("content")), C840730WyV.LIZ(nVarLJIILIIL5.LJJIIZ("scheme")), C840730WyV.LIZ(nVarLJIILIIL5.LJJIIZ("domain")), C840730WyV.LIZ(nVarLJIILIIL5.LJJIIZ("path")));
                            }
                            modifyConfig2.LIZ(modifyConfig);
                        }
                        if (z) {
                            modifyConfig2.LIZIZ((C840660WyO) interfaceC823460WSa, zLJ2);
                        } else if ((interfaceC823460WSa instanceof C840780Wya) && (operationConfig = modifyConfig2.content) != null && (list = operationConfig.remove) != null) {
                            C840780Wya c840780Wya2 = (C840780Wya) interfaceC823460WSa;
                            OperateHistory operateHistoryLIZJ = C1488905sF.LIZJ(c840780Wya2.LIZIZ, C13LP.LLIIJI(list), zLJ2);
                            List<OperatePairs> list2 = operateHistoryLIZJ.pairs;
                            if (list2 != null && !list2.isEmpty()) {
                                interfaceC823460WSa.LIZ().LJJ.add(operateHistoryLIZJ);
                            }
                            OperateHistory operateHistoryLIZLLL = C1488905sF.LIZLLL(C13LP.LLIIJI(list), c840780Wya2.LIZJ, zLJ2);
                            List<OperatePairs> list3 = operateHistoryLIZLLL.pairs;
                            if (list3 != null && !list3.isEmpty()) {
                                interfaceC823460WSa.LIZ().LJJ.add(operateHistoryLIZLLL);
                            }
                        }
                    }
                }
                costTimeline.logCostTime("RuleEngine.handleFuse", null, SystemClock.elapsedRealtimeNanos(), null);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C19719512Dh.LIZ(interfaceC823460WSa.LIZ().LJIL).remove(((C0WLW) it3.next()).LIZJ);
                }
                List<OperateHistory> list4 = interfaceC823460WSa.LIZ().LJJ;
                if (!list4.isEmpty()) {
                    for (OperateHistory operateHistory : list4) {
                        List<OperatePairs> list5 = operateHistory.pairs;
                        if (list5 != null) {
                            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                            Iterator<OperatePairs> it4 = list5.iterator();
                            while (it4.hasNext()) {
                                arrayList4.add(it4.next().originKey);
                            }
                            if (!arrayList4.isEmpty() && (Intrinsics.LJFF(operateHistory.operator, "remove") || Intrinsics.LJFF(operateHistory.operator, "replace"))) {
                                for (C0WLW c0wlw2 : arrayList) {
                                    k kVar6 = c0wlw2.LJ;
                                    if (kVar6 != null && (nVarLJIILIIL = kVar6.LJIILIIL()) != null && (kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("modify_config")) != null && (kVarLJJIIZ2 = kVarLJJIIZ.LJIILIIL().LJJIIZ(operateHistory.target)) != null && (kVarLJJIIZ3 = kVarLJJIIZ2.LJIILIIL().LJJIIZ(operateHistory.operator)) != null) {
                                        k kVarLJJIIZ12 = nVarLJIILIIL.LJJIIZ("is_ignore_case");
                                        if (kVarLJJIIZ12 != null) {
                                            zLJ = kVarLJJIIZ12.LJ();
                                        } else {
                                            zLJ = true;
                                        }
                                        if (Intrinsics.LJFF(operateHistory.operator, "remove") && (kVarLJJIIZ3 instanceof h)) {
                                            Iterator<k> it5 = kVarLJJIIZ3.LJIIL().iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    k next = it5.next();
                                                    next.getClass();
                                                    if (next instanceof q) {
                                                        q qVar = (q) next;
                                                        if (qVar.LL instanceof String) {
                                                            String strLJIL3 = qVar.LJIL();
                                                            Iterator it6 = arrayList4.iterator();
                                                            while (it6.hasNext()) {
                                                                if (u.LJIJI((String) it6.next(), strLJIL3, zLJ)) {
                                                                    LIZIZ(interfaceC823460WSa, c0wlw2, nVarLJIILIIL, operateHistory, strLJIL3);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (Intrinsics.LJFF(operateHistory.operator, "replace") && (kVarLJJIIZ3 instanceof n) && (setLJJIJIL = kVarLJJIIZ3.LJIILIIL().LJJIJIL()) != null) {
                                            Iterator<T> it7 = setLJJIJIL.iterator();
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    String str6 = (String) it7.next();
                                                    Iterator it8 = arrayList4.iterator();
                                                    while (it8.hasNext()) {
                                                        if (u.LJIJI((String) it8.next(), str6, zLJ)) {
                                                            LIZIZ(interfaceC823460WSa, c0wlw2, nVarLJIILIIL, operateHistory, str6);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                costTimeline.logCostTime("RuleEngine.handleCheckHitRuleResult", null, SystemClock.elapsedRealtimeNanos(), null);
            } else {
                Throwable th2 = c0wlxLIZLLL.LJFF;
                if (th2 != null) {
                    C786410Ut5.LJJZZIII(PumbaaEfficientThread.getHandler(), new ARunnableS113S0100000_13(th2, 163));
                }
            }
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList3 = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Invoke", new C840910Wyn(interfaceC823460WSa, str), 3, null);
        }
    }

    public static void LIZIZ(InterfaceC823460WSa interfaceC823460WSa, C0WLW c0wlw, n nVar, OperateHistory operateHistory, String str) {
        RuleModel ruleModel = c0wlw.LIZJ;
        if (ruleModel != null) {
            k kVarLJJIIZ = nVar.LJJIIZ("is_report");
            if (kVarLJJIIZ == null || kVarLJJIIZ.LJ()) {
                interfaceC823460WSa.LIZ().LJJIFFI.LIZIZ = true;
            }
            String str2 = ruleModel.key;
            if (str2 != null && !a0.LJJJIL(str2)) {
                interfaceC823460WSa.LIZ().LJIJ.add(str2);
            }
            if (!interfaceC823460WSa.LIZ().LJIL.contains(ruleModel)) {
                interfaceC823460WSa.LIZ().LJIL.add(ruleModel);
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Invoke", new AwS14S2300000_13(interfaceC823460WSa, str2, operateHistory, str, ruleModel, 0), 3, null);
            }
        }
    }
}
