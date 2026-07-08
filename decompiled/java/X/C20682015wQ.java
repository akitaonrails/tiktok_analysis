package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.fetch.OutreachCategoryParams;
import com.ss.android.ugc.aweme.fetch.OutreachFetchRequestBody;
import com.ss.android.ugc.aweme.fetch.OutreachFetchResponse;
import com.ss.android.ugc.aweme.outreach.signal.model.OutreachDecisionConfig;
import com.ss.android.ugc.aweme.outreach.signal.model.OutreachPathEventConfig;
import com.ss.android.ugc.aweme.outreach.signal.model.PSPOutreachActionResult;
import com.ss.android.ugc.aweme.outreach.signal.model.TimingAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS1S1500100_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15wQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20682015wQ extends AbstractC20655215s6 {
    public final Map<String, Map<String, TimingAction>> LIZIZ = new LinkedHashMap();

    @Override // X.AbstractC20655215s6
    public final String LIZJ() {
        return "timing_dispatch";
    }

    @Override // X.AbstractC20655215s6
    public final void LIZIZ() {
        String str;
        ((LinkedHashMap) this.LIZIZ).clear();
        List<TimingAction> list = ((OutreachDecisionConfig) C20682715wX.LIZIZ.getValue()).timingActionConfig;
        if (list != null) {
            for (TimingAction timingAction : list) {
                if (timingAction != null && (str = timingAction.timing) != null) {
                    Map<String, TimingAction> linkedHashMap = (Map) ((LinkedHashMap) this.LIZIZ).get(str);
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap<>();
                    }
                    String str2 = timingAction.outreachType;
                    if (str2 != null) {
                        linkedHashMap.put(str2, timingAction);
                        this.LIZIZ.put(str, linkedHashMap);
                    }
                }
            }
        }
    }

    public static Map LJFF(Map map) {
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                Object key = entry.getKey();
                OutreachCategoryParams outreachCategoryParamsLIZ = ((AbstractC637410OzL) entry.getValue()).LIZ();
                if (outreachCategoryParamsLIZ != null) {
                    linkedHashMap.put(key, outreachCategoryParamsLIZ);
                }
            }
            return linkedHashMap;
        }
        return null;
    }

    public final void LJII(PSPOutreachActionResult pSPOutreachActionResult) {
        boolean z;
        String str = pSPOutreachActionResult.outreachTimingKey;
        Map<String, Object> map = pSPOutreachActionResult.outreachCondition;
        try {
            String str2 = null;
            C080A.LIZIZ("new_timing_parse", str, null, null, LJ(pSPOutreachActionResult.bizCondition, null));
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("signal: onNewTimingComing: ");
            sbLIZ.append(pSPOutreachActionResult);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZJ(strLIZIZ);
            OutreachPathEventConfig outreachPathEventConfigLIZ = C20682815wY.LIZ();
            if (outreachPathEventConfigLIZ == null || !outreachPathEventConfigLIZ.outreachTimingComing) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C20684815ws.LJIILLIIL("outreach_timing_coming", C2097608Jq.LJIIJ(new Pair("outreach_timing_key", str), new Pair("outreach_conditions", map.toString())));
            }
            if (pSPOutreachActionResult.outreachTypes.isEmpty()) {
                C080G.LIZLLL("new_timing_filter", str, null, 20006, "new timing result has no outreach_types", null, LJ(pSPOutreachActionResult.bizCondition, "empty_outreach_types"), 76);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("signal: handleNewTiming stop, timing=");
                sbLIZ2.append(str);
                sbLIZ2.append(", reason=empty outreachTypes");
                C20571615ec.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            Map map2 = (Map) ((LinkedHashMap) this.LIZIZ).get(str);
            if (map2 != null && !map2.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ArrayList arrayList = new ArrayList();
                for (String str3 : pSPOutreachActionResult.outreachTypes) {
                    TimingAction timingAction = (TimingAction) map2.get(str3);
                    if (timingAction == null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("timing action not found for ");
                        sbLIZ3.append(str3);
                        C080G.LIZLLL("new_timing_filter", str, str3, 20003, C2188811AlT.LIZIZ(sbLIZ3), null, LJ(pSPOutreachActionResult.bizCondition, "timing_action_not_found"), 72);
                        C20571615ec c20571615ec2 = C20571615ec.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("signal: handleNewTiming skip outreachType=");
                        sbLIZ4.append(str3);
                        sbLIZ4.append(", timing=");
                        sbLIZ4.append(str);
                        sbLIZ4.append(", reason=timing action not found");
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                        c20571615ec2.getClass();
                        C20571615ec.LIZJ(strLIZIZ2);
                    } else {
                        EnumC20654715s1 enumC20654715s1LIZ = C20654615s0.LIZ(str3);
                        if (enumC20654715s1LIZ == null) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("OutreachType not found: ");
                            sbLIZ5.append(str3);
                            C080G.LIZLLL("new_timing_filter", str, str3, 20003, C2188811AlT.LIZIZ(sbLIZ5), null, LJ(pSPOutreachActionResult.bizCondition, "outreach_type_not_found"), 72);
                            C20571615ec c20571615ec3 = C20571615ec.LIZ;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("signal: handleNewTiming skip outreachType=");
                            sbLIZ6.append(str3);
                            sbLIZ6.append(", timing=");
                            sbLIZ6.append(str);
                            sbLIZ6.append(", reason=outreachType not found");
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
                            c20571615ec3.getClass();
                            C20571615ec.LIZJ(strLIZIZ3);
                        } else {
                            ((C20654815s2) LIZ().LJFF.getValue()).LIZLLL(enumC20654715s1LIZ);
                            String str4 = timingAction.actionType;
                            if (Intrinsics.LJFF(str4, "fetch")) {
                                InterfaceC20684015wk interfaceC20684015wk = (InterfaceC20684015wk) ((LinkedHashMap) LIZ().LIZ().LJ).get(enumC20654715s1LIZ);
                                if (interfaceC20684015wk != null && interfaceC20684015wk.LIZ(str)) {
                                    C080G.LIZLLL("new_timing_filter", str, enumC20654715s1LIZ.getTypeName(), 20005, "biz fetch interceptor returned true", null, LJ(pSPOutreachActionResult.bizCondition, "biz_intercept"), 72);
                                    C20571615ec c20571615ec4 = C20571615ec.LIZ;
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append("signal: handleNewTiming skip outreachType=");
                                    sbLIZ7.append(enumC20654715s1LIZ.getTypeName());
                                    sbLIZ7.append(", timing=");
                                    sbLIZ7.append(str);
                                    sbLIZ7.append(", reason=fetch intercepted");
                                    String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ7);
                                    c20571615ec4.getClass();
                                    C20571615ec.LIZJ(strLIZIZ4);
                                } else {
                                    AbstractC637050Oyl abstractC637050Oyl = (AbstractC637050Oyl) ((LinkedHashMap) LIZ().LIZ().LIZIZ).get(enumC20654715s1LIZ);
                                    if (abstractC637050Oyl == null) {
                                        String typeName = enumC20654715s1LIZ.getTypeName();
                                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                        sbLIZ8.append("no fetch callback for ");
                                        sbLIZ8.append(str);
                                        C080G.LIZLLL("new_timing_filter", str, typeName, 20004, C2188811AlT.LIZIZ(sbLIZ8), null, LJ(pSPOutreachActionResult.bizCondition, "fetch_callback_not_registered"), 72);
                                        C20571615ec c20571615ec5 = C20571615ec.LIZ;
                                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                        sbLIZ9.append("signal: handleNewTiming skip outreachType=");
                                        sbLIZ9.append(enumC20654715s1LIZ.getTypeName());
                                        sbLIZ9.append(", timing=");
                                        sbLIZ9.append(str);
                                        sbLIZ9.append(", reason=fetch callback not registered");
                                        String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ9);
                                        c20571615ec5.getClass();
                                        C20571615ec.LIZJ(strLIZIZ5);
                                    } else {
                                        AbstractC637410OzL abstractC637410OzL = (AbstractC637410OzL) ((LinkedHashMap) LIZ().LIZ().LIZLLL).get(enumC20654715s1LIZ);
                                        if (abstractC637410OzL != null) {
                                            linkedHashMap2.put(enumC20654715s1LIZ.getTypeName(), abstractC637410OzL);
                                        }
                                        linkedHashMap.put(enumC20654715s1LIZ.getTypeName(), abstractC637050Oyl);
                                        arrayList.add(enumC20654715s1LIZ.getTypeName());
                                        C080A.LIZIZ("new_timing_filter", str, enumC20654715s1LIZ.getTypeName(), null, LJ(pSPOutreachActionResult.bizCondition, null));
                                        C080A.LIZIZ("decision_make", str, enumC20654715s1LIZ.getTypeName(), null, null);
                                        C080A.LIZIZ("fetch_request", str, enumC20654715s1LIZ.getTypeName(), null, null);
                                    }
                                }
                            } else if (Intrinsics.LJFF(str4, "trigger")) {
                                InterfaceC1273504yb interfaceC1273504yb = (InterfaceC1273504yb) ((LinkedHashMap) LIZ().LIZ().LIZJ).get(enumC20654715s1LIZ);
                                if (interfaceC1273504yb == null) {
                                    String typeName2 = enumC20654715s1LIZ.getTypeName();
                                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                    sbLIZ10.append("trigger callback not registered for ");
                                    sbLIZ10.append(str);
                                    C080G.LIZLLL("new_timing_filter", str, typeName2, 20004, C2188811AlT.LIZIZ(sbLIZ10), null, LJ(pSPOutreachActionResult.bizCondition, "trigger_callback_not_registered"), 72);
                                    C20571615ec c20571615ec6 = C20571615ec.LIZ;
                                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                    sbLIZ11.append("signal: handleNewTiming skip outreachType=");
                                    sbLIZ11.append(enumC20654715s1LIZ.getTypeName());
                                    sbLIZ11.append(", timing=");
                                    sbLIZ11.append(str);
                                    sbLIZ11.append(", reason=trigger callback not registered");
                                    String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ11);
                                    c20571615ec6.getClass();
                                    C20571615ec.LIZJ(strLIZIZ6);
                                } else {
                                    C080A.LIZIZ("new_timing_filter", str, enumC20654715s1LIZ.getTypeName(), null, LJ(pSPOutreachActionResult.bizCondition, null));
                                    C080A.LIZIZ("decision_make", str, enumC20654715s1LIZ.getTypeName(), null, null);
                                    C080A.LIZIZ("trigger_dispatch", str, enumC20654715s1LIZ.getTypeName(), null, null);
                                    interfaceC1273504yb.ac(str, map);
                                    OutreachPathEventConfig outreachPathEventConfigLIZ2 = C20682815wY.LIZ();
                                    if (outreachPathEventConfigLIZ2 != null && outreachPathEventConfigLIZ2.outreachCallback) {
                                        C20684815ws.LJIILLIIL("outreach_callback", C2097608Jq.LJIIJ(new Pair("outreach_type", enumC20654715s1LIZ.getTypeName()), new Pair("action_type", "trigger"), new Pair("outreach_timing_key", str), new Pair("outreach_conditions", map.toString()), new Pair("is_active", CardStruct.IStatusCode.DEFAULT)));
                                    }
                                }
                            } else {
                                String typeName3 = enumC20654715s1LIZ.getTypeName();
                                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                sbLIZ12.append("unsupported action type: ");
                                sbLIZ12.append(timingAction.actionType);
                                C080G.LIZLLL("new_timing_filter", str, typeName3, 20003, C2188811AlT.LIZIZ(sbLIZ12), null, LJ(pSPOutreachActionResult.bizCondition, "unsupported_action_type"), 72);
                                C20571615ec c20571615ec7 = C20571615ec.LIZ;
                                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                sbLIZ13.append("signal: handleNewTiming skip outreachType=");
                                sbLIZ13.append(enumC20654715s1LIZ.getTypeName());
                                sbLIZ13.append(", timing=");
                                sbLIZ13.append(str);
                                sbLIZ13.append(", reason=unsupported actionType ");
                                sbLIZ13.append(timingAction.actionType);
                                String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ13);
                                c20571615ec7.getClass();
                                C20571615ec.LIZJ(strLIZIZ7);
                            }
                        }
                    }
                    str2 = null;
                }
                if (pSPOutreachActionResult.processorCosts.isEmpty()) {
                    C080G.LIZLLL("processor_cost_report", str, str2, 20008, "processor_costs is empty or invalid", str2, LJ(pSPOutreachActionResult.bizCondition, "empty_processor_costs"), 76);
                } else {
                    for (Map.Entry<String, Long> entry : pSPOutreachActionResult.processorCosts.entrySet()) {
                        C080A.LIZLLL(entry.getValue().longValue(), str, entry.getKey());
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    C080A.LIZIZ("no_action", str, str2, str2, LJ(pSPOutreachActionResult.bizCondition, "no_fetch_action"));
                    C20571615ec c20571615ec8 = C20571615ec.LIZ;
                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                    sbLIZ14.append("signal: handleNewTiming stop, timing=");
                    sbLIZ14.append(str);
                    sbLIZ14.append(", reason=no fetch action to dispatch");
                    String strLIZIZ8 = C2188811AlT.LIZIZ(sbLIZ14);
                    c20571615ec8.getClass();
                    C20571615ec.LIZJ(strLIZIZ8);
                    return;
                }
                OutreachFetchRequestBody outreachFetchRequestBodyLIZLLL = LIZLLL(str, arrayList, map, linkedHashMap2, pSPOutreachActionResult.bizCondition);
                long jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC595380NWu interfaceC595380NWu = C595350NWr.LIZ;
                C595350NWr.LIZ(outreachFetchRequestBodyLIZLLL, new C20682515wV(this, str, arrayList, map, linkedHashMap, jCurrentTimeMillis), new C20682215wS(this, str, arrayList, map, linkedHashMap));
                return;
            }
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append("no timing action config for ");
            sbLIZ15.append(str);
            C080G.LIZLLL("decision_make", str, null, 20001, C2188811AlT.LIZIZ(sbLIZ15), null, null, 204);
            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
            sbLIZ16.append("signal: handleNewTiming stop, timing=");
            sbLIZ16.append(str);
            sbLIZ16.append(", reason=no timing action config");
            C20571615ec.LIZJ(C2188811AlT.LIZIZ(sbLIZ16));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20571615ec c20571615ec9 = C20571615ec.LIZ;
            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
            sbLIZ17.append("signal: onNewTimingComing ");
            sbLIZ17.append(str);
            sbLIZ17.append(" Error; ");
            sbLIZ17.append(e);
            String strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ17);
            c20571615ec9.getClass();
            C20571615ec.LIZIZ(strLIZIZ9);
        }
    }

    public static String LJ(n nVar, String str) throws JSONException {
        int length;
        String string;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("processor_name", (Object) null);
        jSONObject.put("processor_cost_ms", (Object) null);
        jSONObject.put("filtered_reason", str);
        if (nVar != null && (string = nVar.toString()) != null) {
            length = string.length();
        } else {
            length = 0;
        }
        jSONObject.put("biz_condition_size", length);
        jSONObject.put("is_new_timing", true);
        return C786410Ut5.J3(jSONObject);
    }

    public static OutreachFetchRequestBody LIZLLL(String str, List list, Map map, Map map2, n nVar) {
        String string;
        OutreachFetchRequestBody outreachFetchRequestBody = new OutreachFetchRequestBody(null, null, null, null, null);
        outreachFetchRequestBody.setFetchTiming(str);
        outreachFetchRequestBody.setEnableOutreachTypes(list);
        String json = GsonProtectorUtils.toJson(new Gson(), map);
        json.toString();
        outreachFetchRequestBody.setCrossOutreachSignal(json);
        outreachFetchRequestBody.setSingleOutreachSignal(LJFF(map2));
        if (nVar != null) {
            string = nVar.toString();
        } else {
            string = null;
        }
        outreachFetchRequestBody.setBizCondition(string);
        return outreachFetchRequestBody;
    }

    public final void LJI(String str, EnumC20654715s1 enumC20654715s1, Map<String, Object> map, AbstractC637050Oyl abstractC637050Oyl, n nVar) {
        try {
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("signal: trigger fetchTiming, ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(enumC20654715s1.getTypeName());
            sbLIZ.append(", conditionParam: ");
            sbLIZ.append(map);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZJ(strLIZIZ);
            List listLJIILJJIL = C1697810uHb.LJIILJJIL(enumC20654715s1.getTypeName());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC637410OzL abstractC637410OzL = (AbstractC637410OzL) ((LinkedHashMap) LIZ().LIZ().LIZLLL).get(enumC20654715s1);
            if (abstractC637410OzL != null) {
                linkedHashMap.put(enumC20654715s1.getTypeName(), abstractC637410OzL);
            }
            OutreachFetchRequestBody outreachFetchRequestBodyLIZLLL = LIZLLL(str, listLJIILJJIL, map, linkedHashMap, nVar);
            OutreachPathEventConfig outreachPathEventConfigLIZ = C20682815wY.LIZ();
            if (outreachPathEventConfigLIZ != null && outreachPathEventConfigLIZ.outreachFetchRequest) {
                C20684815ws.LJIILLIIL("outreach_fetch_request", C2097608Jq.LJIIJ(new Pair("outreach_types", listLJIILJJIL.toString()), new Pair("outreach_timing_key", str), new Pair("outreach_conditions", map.toString()), new Pair("is_active", "1")));
            }
            C080A.LIZIZ("fetch_request", str, enumC20654715s1.getTypeName(), null, null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC595380NWu interfaceC595380NWu = C595350NWr.LIZ;
            C595350NWr.LIZ(outreachFetchRequestBodyLIZLLL, new AwS1S1500100_31(this, (C20682015wQ) str, (String) listLJIILJJIL, (List<String>) map, (Map<String, Object>) enumC20654715s1, (EnumC20654715s1) abstractC637050Oyl, (AbstractC637050Oyl) jCurrentTimeMillis, 1L), new C20682315wT(this, str, listLJIILJJIL, map, enumC20654715s1, abstractC637050Oyl));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20571615ec c20571615ec2 = C20571615ec.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("signal: trigger fetchTiming error: ");
            sbLIZ2.append(e);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c20571615ec2.getClass();
            C20571615ec.LIZIZ(strLIZIZ2);
        }
    }

    public static void LJIIIIZZ(String str, List list, OutreachFetchResponse outreachFetchResponse, Map map, int i, String str2) {
        Map<String, String> map2;
        OutreachPathEventConfig outreachPathEventConfigLIZ = C20682815wY.LIZ();
        if (outreachPathEventConfigLIZ != null && outreachPathEventConfigLIZ.outreachFetchResponse) {
            ArrayList arrayList = new ArrayList();
            if (outreachFetchResponse != null && (map2 = outreachFetchResponse.switchMap) != null) {
                Iterator<Map.Entry<String, String>> it2 = map2.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getKey());
                }
            }
            C20684815ws.LJIILLIIL("outreach_fetch_response", C2097608Jq.LJIIJ(new Pair("outreach_types", list.toString()), new Pair("outreach_contents", arrayList.toString()), new Pair("outreach_timing_key", str), new Pair("outreach_conditions", map.toString()), new Pair("is_active", String.valueOf(i)), new Pair("error_info", str2)));
        }
    }
}
