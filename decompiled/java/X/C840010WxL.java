package X;

import Y.ARunnableS82S0200000_13;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pumbaa.pipeline.EventPipeline;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0WxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840010WxL implements InterfaceC839880Wx8 {
    public static final C840010WxL LIZ = new C840010WxL();

    public static PrivacyEvent LIZIZ(Map map, Map map2) {
        String str;
        C0WSC c0wsc;
        Map map3;
        Object objLJJJLL;
        Map map4;
        Object objLJJJLL2;
        C0WRC c0wrc = PrivacyEvent.Companion;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
        Object obj = linkedHashMap.get("trigger_id");
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "pns-null";
        }
        c0wrc.getClass();
        PrivacyEvent privacyEventLIZ = C0WRC.LIZ(str, "Network");
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
        Object obj2 = linkedHashMap2.get("PumbaaPerf");
        if (obj2 instanceof C0WSC) {
            c0wsc = (C0WSC) obj2;
        } else {
            c0wsc = null;
        }
        privacyEventLIZ.setPerformanceNode(c0wsc);
        Object obj3 = linkedHashMap2.get("scheme");
        if (obj3 != null) {
            privacyEventLIZ.addCallSiteInfo("scheme", new C0WQ8(EnumC823400WRu.String, obj3));
        }
        Object obj4 = linkedHashMap2.get("domain");
        if (obj4 != null) {
            privacyEventLIZ.addCallSiteInfo("domain", new C0WQ8(EnumC823400WRu.String, obj4));
        }
        Object obj5 = linkedHashMap2.get("domain_after_tnc");
        if (obj5 != null) {
            privacyEventLIZ.addCallSiteInfo("domain_after_tnc", new C0WQ8(EnumC823400WRu.String, obj5));
        }
        Object obj6 = linkedHashMap2.get("path");
        if (obj6 != null) {
            privacyEventLIZ.addCallSiteInfo("path", new C0WQ8(EnumC823400WRu.String, obj6));
        }
        Object obj7 = linkedHashMap.get("cal_path");
        if (obj7 != null) {
            privacyEventLIZ.addCallSiteInfo("cal_path", new C0WQ8(EnumC823400WRu.String, obj7));
        }
        Object obj8 = linkedHashMap2.get("query_mss");
        if (obj8 != null) {
            privacyEventLIZ.addCallSiteInfo("query_fields", new C0WR8(EnumC823400WRu.String, new C840120WxW(obj8)));
            privacyEventLIZ.addCallSiteInfo("query", new C0WQ8(EnumC823400WRu.Any, obj8));
        }
        Object obj9 = linkedHashMap2.get("query_str");
        if (obj9 != null) {
            privacyEventLIZ.addCallSiteInfo("query_fields", new C0WR8(EnumC823400WRu.String, new C840020WxM(obj9)));
            privacyEventLIZ.addCallSiteInfo("query", new C0WR8(EnumC823400WRu.Any, new C839990WxJ(obj9)));
        }
        Object obj10 = linkedHashMap2.get("query");
        if (obj10 != null) {
            privacyEventLIZ.addCallSiteInfo("query_fields", new C0WR8(EnumC823400WRu.String, new C840070WxR(obj10)));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            if ((obj10 instanceof Map) && (map4 = (Map) obj10) != null) {
                for (Map.Entry entry : map4.entrySet()) {
                    List list = (List) entry.getValue();
                    if (list != null && (objLJJJLL2 = C13LP.LJJJLL(list)) != null) {
                        linkedHashMap3.put(entry.getKey(), objLJJJLL2);
                    }
                }
            }
            privacyEventLIZ.addCallSiteInfo("query", new C0WQ8(EnumC823400WRu.Any, linkedHashMap3));
        }
        Object obj11 = linkedHashMap2.get("query_fields");
        if (obj11 != null) {
            privacyEventLIZ.addCallSiteInfo("query_fields", new C0WQ8(EnumC823400WRu.String, obj11));
        }
        Object obj12 = linkedHashMap2.get("header_mss");
        if (obj12 != null) {
            privacyEventLIZ.addCallSiteInfo("header_fields", new C0WR8(EnumC823400WRu.String, new C840110WxV(obj12)));
            privacyEventLIZ.addCallSiteInfo("header", new C0WQ8(EnumC823400WRu.Any, obj12));
        }
        Object obj13 = linkedHashMap2.get("header");
        if (obj13 != null) {
            privacyEventLIZ.addCallSiteInfo("header_fields", new C0WR8(EnumC823400WRu.String, new C840050WxP(obj13)));
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            if ((obj13 instanceof Map) && (map3 = (Map) obj13) != null) {
                for (Map.Entry entry2 : map3.entrySet()) {
                    List list2 = (List) entry2.getValue();
                    if (list2 != null && (objLJJJLL = C13LP.LJJJLL(list2)) != null) {
                        linkedHashMap4.put(entry2.getKey(), objLJJJLL);
                    }
                }
            }
            privacyEventLIZ.addCallSiteInfo("header", new C0WQ8(EnumC823400WRu.Any, linkedHashMap4));
        }
        Object obj14 = linkedHashMap2.get("header_fields");
        if (obj14 != null) {
            privacyEventLIZ.addCallSiteInfo("header_fields", new C0WQ8(EnumC823400WRu.String, obj14));
        }
        Object obj15 = linkedHashMap2.get("resp_header");
        if (obj15 != null) {
            EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
            privacyEventLIZ.addCallSiteInfo("resp_header_fields", new C0WR8(enumC823400WRu, new C840060WxQ(obj15)));
            privacyEventLIZ.addCallSiteInfo("resp_header", new C0WQ8(EnumC823400WRu.Any, obj15));
            privacyEventLIZ.addCallSiteInfo("x_tt_logid", new C0WR8(enumC823400WRu, new C839980WxI(obj15)));
            privacyEventLIZ.addCallSiteInfo("x_tt_traceflag", new C0WR8(enumC823400WRu, new C840000WxK(obj15)));
        }
        Object obj16 = linkedHashMap2.get("cookie");
        if (obj16 != null) {
            privacyEventLIZ.addCallSiteInfo("cookie_fields", new C0WR8(EnumC823400WRu.String, new C840130WxX(obj16)));
        }
        Object obj17 = linkedHashMap2.get("resp_cookie");
        if (obj17 != null) {
            privacyEventLIZ.addCallSiteInfo("resp_cookie_fields", new C0WR8(EnumC823400WRu.String, new C840140WxY(obj17)));
        }
        Object obj18 = linkedHashMap2.get("response_code");
        if (obj18 != null) {
            privacyEventLIZ.addCallSiteInfo("response_code", new C0WQ8(EnumC823400WRu.String, obj18));
        }
        Object obj19 = linkedHashMap2.get("network_event");
        if (obj19 != null) {
            EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.String;
            privacyEventLIZ.addCallSiteInfo("body_fields", new C0WR8(enumC823400WRu2, new C840080WxS(obj19)));
            if (NetworkComponent.INSTANCE.isOfflineEnv()) {
                privacyEventLIZ.addCallSiteInfo("resp_body_fields", new C0WR8(enumC823400WRu2, new C840090WxT(obj19)));
                privacyEventLIZ.addCallSiteInfo("body_string", new C0WR8(enumC823400WRu2, new C840100WxU(obj19)));
            }
        }
        Object obj20 = linkedHashMap2.get("method");
        if (obj20 != null) {
            privacyEventLIZ.addCallSiteInfo("method", new C0WQ8(EnumC823400WRu.String, obj20));
        }
        Object obj21 = linkedHashMap2.get("sandbox_method");
        if (obj21 != null) {
            privacyEventLIZ.addCallSiteInfo("sandbox_method", new C0WQ8(EnumC823400WRu.String, obj21));
        }
        Object obj22 = linkedHashMap2.get("event_type");
        if (obj22 != null) {
            privacyEventLIZ.addCallSiteInfo("event_type", new C0WQ8(EnumC823400WRu.String, obj22));
        }
        Object obj23 = linkedHashMap.get("domain_type");
        if (obj23 != null) {
            privacyEventLIZ.addCallSiteInfo("domain_type", new C0WQ8(EnumC823400WRu.String, obj23));
        }
        Object obj24 = linkedHashMap.get("event_source");
        if (obj24 != null) {
            privacyEventLIZ.addCallSiteInfo("event_source", new C0WQ8(EnumC823400WRu.String, obj24));
        }
        Object obj25 = linkedHashMap.get("hybrid_is_isolate");
        if (obj25 != null) {
            privacyEventLIZ.addCallSiteInfo("hybrid_is_isolate", new C0WQ8(EnumC823400WRu.String, obj25));
        }
        Object obj26 = linkedHashMap.get("webview_url");
        if (obj26 != null) {
            privacyEventLIZ.addCallSiteInfo("webview_url", new C0WQ8(EnumC823400WRu.String, obj26));
        }
        Object obj27 = linkedHashMap.get("webview_channel");
        if (obj27 != null) {
            privacyEventLIZ.addCallSiteInfo("webview_channel", new C0WQ8(EnumC823400WRu.String, obj27));
        }
        Object obj28 = linkedHashMap.get("dfid");
        if (obj28 != null) {
            privacyEventLIZ.addCallSiteInfo("dfid", new C0WQ8(EnumC823400WRu.String, obj28));
        }
        Object obj29 = linkedHashMap.get("transition_dfid");
        if (obj29 != null) {
            privacyEventLIZ.addCallSiteInfo("transition_dfid", new C0WQ8(EnumC823400WRu.String, obj29));
        }
        Object obj30 = linkedHashMap.get("user_agent");
        if (obj30 != null) {
            privacyEventLIZ.addCallSiteInfo("user_agent", new C0WQ8(EnumC823400WRu.String, obj30));
        }
        Object obj31 = linkedHashMap.get("dynamic_request_id");
        if (obj31 != null) {
            privacyEventLIZ.addCallSiteInfo("dynamic_request_id", new C0WQ8(EnumC823400WRu.String, obj31));
        }
        Object obj32 = linkedHashMap.get("exempted_id_list");
        if (obj32 != null) {
            privacyEventLIZ.addCallSiteInfo("exempted_id_list", new C0WQ8(EnumC823400WRu.String, obj32.toString()));
        }
        Object obj33 = linkedHashMap.get("call_site");
        if (obj33 != null) {
            privacyEventLIZ.addCallSiteInfo("call_site", new C0WQ8(EnumC823400WRu.String, obj33));
        }
        Object obj34 = linkedHashMap.get("is_third_party");
        if (obj34 != null) {
            privacyEventLIZ.addCallSiteInfo("is_third_party", new C0WQ8(EnumC823400WRu.String, obj34));
        }
        Object obj35 = linkedHashMap.get("hybrid_channel");
        if (obj35 != null) {
            privacyEventLIZ.addCallSiteInfo("hybrid_channel", new C0WQ8(EnumC823400WRu.String, obj35));
        }
        Object obj36 = linkedHashMap.get("hybrid_origin_url");
        if (obj36 != null) {
            privacyEventLIZ.addCallSiteInfo("hybrid_origin_url", new C0WQ8(EnumC823400WRu.String, obj36));
        }
        Object obj37 = linkedHashMap.get("hybrid_origin_url_domain");
        if (obj37 != null) {
            privacyEventLIZ.addCallSiteInfo("hybrid_origin_url_domain", new C0WQ8(EnumC823400WRu.String, obj37));
        }
        Object obj38 = linkedHashMap.get("hybrid_router_dataflow_id");
        if (obj38 != null) {
            privacyEventLIZ.addCallSiteInfo("hybrid_router_dataflow_id", new C0WQ8(EnumC823400WRu.String, obj38));
        }
        Object obj39 = linkedHashMap.get("hybrid_reason");
        if (obj39 != null) {
            privacyEventLIZ.addCallSiteInfo("hybrid_reason", new C0WQ8(EnumC823400WRu.String, obj39));
        }
        Object obj40 = linkedHashMap.get("ttnet_task_id");
        if (obj40 != null) {
            privacyEventLIZ.addCallSiteInfo("ttnet_task_id", new C0WQ8(EnumC823400WRu.String, obj40));
        }
        Object obj41 = linkedHashMap.get("is_in_sandbox_region");
        if (obj41 != null) {
            privacyEventLIZ.addCallSiteInfo("is_in_sandbox_region", new C0WQ8(EnumC823400WRu.String, obj41));
        }
        Object obj42 = linkedHashMap.get("sandbox_region_criteria");
        if (obj42 != null) {
            privacyEventLIZ.addCallSiteInfo("sandbox_region_criteria", new C0WQ8(EnumC823400WRu.String, obj42));
        }
        Object obj43 = linkedHashMap.get("sandbox_state");
        if (obj43 != null) {
            privacyEventLIZ.addCallSiteInfo("sandbox_state", new C0WQ8(EnumC823400WRu.String, obj43));
        }
        Object obj44 = linkedHashMap.get("report_reason");
        if (obj44 != null) {
            privacyEventLIZ.addCallSiteInfo("report_reason", new C0WQ8(EnumC823400WRu.String, obj44));
        }
        Object obj45 = linkedHashMap.get("content_type");
        if (obj45 != null) {
            privacyEventLIZ.addCallSiteInfo("content_type", new C0WQ8(EnumC823400WRu.String, obj45));
        }
        Object obj46 = linkedHashMap.get("hybrid_router_dataflow_id");
        if (obj46 != null) {
            privacyEventLIZ.addCallSiteInfo("hybrid_router_dataflow_id", new C0WQ8(EnumC823400WRu.String, obj46));
        }
        Object obj47 = linkedHashMap.get("sandbox_channel");
        if (obj47 != null) {
            privacyEventLIZ.addCallSiteInfo("sandbox_channel", new C0WQ8(EnumC823400WRu.String, obj47));
        }
        Object obj48 = linkedHashMap.get("sandbox_result");
        if (obj48 != null) {
            privacyEventLIZ.addCallSiteInfo("sandbox_result", new C0WQ8(EnumC823400WRu.String, obj48));
        }
        Object obj49 = linkedHashMap.get("function_sig_name");
        if (obj49 != null) {
            privacyEventLIZ.addCallSiteInfo("function_sig_name", new C0WQ8(EnumC823400WRu.String, obj49));
        }
        Object obj50 = linkedHashMap.get("isolation_zone");
        if (obj50 != null) {
            privacyEventLIZ.addCallSiteInfo("isolation_zone", new C0WQ8(EnumC823400WRu.String, obj50));
        }
        Object obj51 = linkedHashMap.get("dynamic_cdn_domain");
        if (obj51 != null) {
            privacyEventLIZ.addCallSiteInfo("dynamic_cdn_domain", new C0WQ8(EnumC823400WRu.String, obj51));
        }
        Object obj52 = linkedHashMap.get("x_tt_logid");
        if (obj52 != null) {
            privacyEventLIZ.addCallSiteInfo("x_tt_logid", new C0WQ8(EnumC823400WRu.String, obj52));
        }
        Object obj53 = linkedHashMap.get("x_tt_traceflag");
        if (obj53 != null) {
            privacyEventLIZ.addCallSiteInfo("x_tt_traceflag", new C0WQ8(EnumC823400WRu.String, obj53));
        }
        return privacyEventLIZ;
    }

    @Override // X.InterfaceC839880Wx8
    public final InterfaceC1259504wL LIZ(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        Object objLIZ;
        try {
            PrivacyEvent privacyEventLIZIZ = LIZIZ(map, map2);
            List<C0WRN> listHandleEvent = EventPipeline.handleEvent(privacyEventLIZIZ, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (C0WRN c0wrn : listHandleEvent) {
                C0WRX c0wrx = c0wrn.LIZ;
                Map<String, Object> map7 = c0wrx.LIZJ;
                String str = c0wrx.LIZIZ;
                if (Intrinsics.LJFF(str, "modify")) {
                    boolean z = false;
                    if (map7.containsKey("header")) {
                        JSONObject jSONObject = (JSONObject) map7.get("header");
                        if (jSONObject.has("update")) {
                            if (!linkedHashMap2.containsKey("update")) {
                                linkedHashMap2.put("update", new LinkedHashMap());
                            }
                            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "update");
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String string = JSONObjectProtectorUtils.getString(jSONObject2, next);
                                if (u.LJJIIJZLJL(string, e3.c, z) && string.length() > 1) {
                                    C0WR6 c0wr6Query = privacyEventLIZIZ.contextInfo().query(string.substring(1));
                                    if (c0wr6Query != null) {
                                        objLIZ = c0wr6Query.LIZ();
                                    } else {
                                        objLIZ = null;
                                    }
                                    string = String.valueOf(objLIZ);
                                }
                                Object obj = ((LinkedHashMap) map).get("header");
                                if (C19719512Dh.LJII(obj) && (map6 = (Map) obj) != null) {
                                    map6.put(next, Collections.singletonList(string));
                                }
                                C19719512Dh.LIZJ(linkedHashMap2.get("update")).put(next, string);
                                z = false;
                            }
                        }
                        if (jSONObject.has("remove")) {
                            if (!linkedHashMap2.containsKey("remove")) {
                                linkedHashMap2.put("remove", new ArrayList());
                            }
                            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "remove");
                            int length = jSONArray.length();
                            for (int i = 0; i < length; i++) {
                                String string2 = JSONArrayProtectorUtils.getString(jSONArray, i);
                                Object obj2 = ((LinkedHashMap) map).get("header");
                                if (C19719512Dh.LJII(obj2) && (map5 = (Map) obj2) != null) {
                                    map5.remove(string2);
                                }
                                C19719512Dh.LIZIZ(linkedHashMap2.get("remove")).add(string2);
                            }
                        }
                        privacyEventLIZIZ.addCallSiteInfo("header_fields", new C0WR8(EnumC823400WRu.String, new C840030WxN(map)));
                    }
                    if (map7.containsKey("query")) {
                        JSONObject jSONObject3 = (JSONObject) map7.get("query");
                        if (jSONObject3.has("update")) {
                            if (!linkedHashMap.containsKey("update")) {
                                linkedHashMap.put("update", new LinkedHashMap());
                            }
                            JSONObject jSONObject4 = JSONObjectProtectorUtils.getJSONObject(jSONObject3, "update");
                            Iterator<String> itKeys2 = jSONObject4.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                String string3 = JSONObjectProtectorUtils.getString(jSONObject4, next2);
                                Object obj3 = ((LinkedHashMap) map).get("query");
                                if (C19719512Dh.LJII(obj3) && (map4 = (Map) obj3) != null) {
                                    map4.put(next2, Collections.singletonList(string3));
                                }
                                C19719512Dh.LIZJ(linkedHashMap.get("update")).put(next2, string3);
                            }
                        }
                        if (jSONObject3.has("remove")) {
                            if (!linkedHashMap.containsKey("remove")) {
                                linkedHashMap.put("remove", new ArrayList());
                            }
                            JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject3, "remove");
                            int length2 = jSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                String string4 = JSONArrayProtectorUtils.getString(jSONArray2, i2);
                                Object obj4 = ((LinkedHashMap) map).get("query");
                                if (C19719512Dh.LJII(obj4) && (map3 = (Map) obj4) != null) {
                                    map3.remove(string4);
                                }
                                C19719512Dh.LIZIZ(linkedHashMap.get("remove")).add(string4);
                            }
                        }
                        privacyEventLIZIZ.addCallSiteInfo("query_fields", new C0WR8(EnumC823400WRu.String, new C840040WxO(map)));
                    }
                    if (map7.containsKey("scheme")) {
                        JSONObject jSONObject5 = (JSONObject) map7.get("scheme");
                        if (jSONObject5.has("update")) {
                            JSONObject jSONObject6 = JSONObjectProtectorUtils.getJSONObject(jSONObject5, "update");
                            Iterator<String> itKeys3 = jSONObject6.keys();
                            while (itKeys3.hasNext()) {
                                String next3 = itKeys3.next();
                                if (Intrinsics.LJFF(((LinkedHashMap) map).get("scheme"), next3)) {
                                    if (!linkedHashMap3.containsKey("update")) {
                                        linkedHashMap3.put("update", new LinkedHashMap());
                                    }
                                    String string5 = JSONObjectProtectorUtils.getString(jSONObject6, next3);
                                    privacyEventLIZIZ.addCallSiteInfo("scheme", new C0WQ8(EnumC823400WRu.String, string5));
                                    C19719512Dh.LIZJ(linkedHashMap3.get("update")).put(next3, string5);
                                }
                            }
                        }
                    }
                } else if (Intrinsics.LJFF(str, "fuse")) {
                    return new C840150WxZ(c0wrn.LIZ.LIZ, map7);
                }
            }
            if (!(!linkedHashMap.isEmpty()) && !(!linkedHashMap2.isEmpty()) && !(!linkedHashMap3.isEmpty())) {
                return null;
            }
            return new C823490WSd(linkedHashMap, linkedHashMap2, linkedHashMap3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.LJJZZIII(PumbaaWorkerThread.getHandler(), new ARunnableS82S0200000_13(e, new Throwable(), 100));
            return null;
        }
    }
}
