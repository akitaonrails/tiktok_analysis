package X;

import android.util.LruCache;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSIService;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityLynxService;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityNetworkService;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebNavigationService;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebRouterService;
import com.bytedance.hybrid.spark.security.impl.SparkSecurityEventTracingSampleControlSettings;
import com.bytedance.hybrid.spark.security.impl.SparkSecurityJSBDomainReporter;
import com.bytedance.hybrid.spark.security.impl.SparkSecurityJSBParamReportService;
import com.bytedance.hybrid.spark.security.impl.SparkSecurityJSBParamReportSettings;
import com.bytedance.hybrid.spark.security.impl.p001switch.SparkSecurityDynamicActionsSwitch;
import com.bytedance.hybrid.spark.security.impl.service.FE.FESparkInjectExt;
import com.bytedance.hybrid.spark.security.impl.service.InlineJsInjectServiceTool;
import com.bytedance.hybrid.spark.security.impl.service.SparkSecurityLynxServiceImpl;
import com.bytedance.hybrid.spark.security.impl.service.SparkSecurityWebViewExt;
import com.bytedance.hybrid.spark.security.web_js.core.JSInjectionProviderExt;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.v8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842100X1s {
    public static volatile boolean LIZ;
    public static final List<AbstractC2286101Ee0> LIZIZ = new ArrayList();

    public static void LIZ() {
        SparkSecurityServiceCenter sparkSecurityServiceCenter = SparkSecurityServiceCenter.INSTANCE;
        if (!sparkSecurityServiceCenter.getEnable()) {
            C1490740otc.LIZ.LIZ("SparkSecurityService disable", EnumC1490770otf.I, "SecurityRegister");
            return;
        }
        if (LIZ) {
            return;
        }
        LIZ = true;
        sparkSecurityServiceCenter.setReportHelper(new InterfaceC828450Weh() { // from class: X.0Wec
            public final LruCache<String, C828410Wed> LIZ = new LruCache<>(10);

            public static String LJFF(String str) {
                int iLJJJ = a0.LJJJ(str, "?", 0, false, 6);
                if (iLJJJ != -1) {
                    return str.substring(0, iLJJJ);
                }
                return str;
            }

            @Override // X.InterfaceC828450Weh
            public final void LIZLLL(C821850WLv c821850WLv) throws JSONException {
                String str;
                C828410Wed c828410WedRemove;
                if (c821850WLv != null && (str = c821850WLv.LIZJ) != null && (c828410WedRemove = this.LIZ.remove(str)) != null) {
                    LJII(c828410WedRemove.LIZ, c828410WedRemove.LIZIZ, c828410WedRemove.LIZJ, c821850WLv, c828410WedRemove.LIZLLL, "1");
                }
            }

            @Override // X.InterfaceC828450Weh
            public final void LIZ(Class<? extends SparkSecurityService> cls, String str, C828420Wee c828420Wee, Throwable th) throws JSONException {
                C1520360pfO c1520360pfO = new C1520360pfO("spark_security_exception");
                c1520360pfO.LIZIZ = "hybridkit_default_bid";
                JSONObject jSONObject = new JSONObject();
                if (c828420Wee != null) {
                    jSONObject.put("source", c828420Wee.LIZ);
                    jSONObject.put("target", c828420Wee.LIZIZ);
                    jSONObject.put("channel", c828420Wee.LIZJ);
                    jSONObject.put("payload", c828420Wee.LJFF.toString());
                }
                jSONObject.put("service", cls.getClass().getName());
                jSONObject.put("api", str);
                jSONObject.put("sss_platform", "Android");
                jSONObject.put("error", th.getMessage());
                c1520360pfO.LIZLLL = jSONObject;
                c1520360pfO.LIZIZ(0);
                c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                C1520080pew.LIZ(null, c1520360pfO.LIZ());
            }

            @Override // X.InterfaceC828450Weh
            public final void LIZIZ(Class<? extends SparkSecurityService> cls, String str, C828420Wee c828420Wee, C821850WLv c821850WLv, String str2) throws JSONException {
                String str3 = c828420Wee.LIZLLL;
                if (str3 != null) {
                    this.LIZ.put(str3, new C828410Wed(cls, str, c828420Wee, str2));
                } else {
                    LJII(cls, str, c828420Wee, c821850WLv, str2, CardStruct.IStatusCode.DEFAULT);
                }
            }

            public static void LJII(Class cls, String str, C828420Wee c828420Wee, C821850WLv c821850WLv, String str2, String str3) throws JSONException {
                Map map;
                Object obj;
                Map<?, ?> map2;
                String str4;
                EnumC843700X7w enumC843700X7w;
                Boolean bool;
                Boolean bool2;
                boolean zBooleanValue;
                Boolean bool3;
                Object obj2;
                boolean zBooleanValue2;
                InterfaceC821860WLw interfaceC821860WLw;
                Boolean intercept;
                String str5;
                String str6;
                Map map3;
                C821880WLy c821880WLy;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Object obj3 = c828420Wee.LJFF.get("hybrid_info");
                Object obj4 = null;
                if (C19719512Dh.LJII(obj3)) {
                    map = (Map) obj3;
                } else {
                    map = null;
                }
                Object obj5 = "";
                if (map == null || (obj = map.get("source_location")) == null) {
                    obj = "";
                }
                linkedHashMap.put("source_location", obj);
                linkedHashMap.put("sss_platform", "Android");
                linkedHashMap.put("is_async_callback", str3);
                if (c821850WLv != null) {
                    Map<String, String> map4 = c821850WLv.LJI;
                    if (map4 != null) {
                        for (Map.Entry entry : ((LinkedHashMap) map4).entrySet()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    C821780WLo c821780WLo = c821850WLv.LJ;
                    if (c821780WLo != null) {
                        linkedHashMap.put("action_code", Integer.valueOf(c821780WLo.LIZ.getCode()));
                        linkedHashMap.put("action_message", c821780WLo.LIZ.getDescription());
                    }
                }
                if (c821850WLv != null) {
                    C821880WLy c821880WLy2 = c821850WLv.LIZLLL;
                    if (c821880WLy2 != null) {
                        linkedHashMap.put("error_code", Integer.valueOf(c821880WLy2.LIZ));
                        linkedHashMap.put("error_msg", c821880WLy2.LIZIZ);
                    }
                    map2 = c821850WLv.LIZIZ;
                } else {
                    map2 = null;
                }
                if ((map2 instanceof Map) && map2 != null) {
                    for (Map.Entry<?, ?> entry2 : map2.entrySet()) {
                        String str7 = (String) entry2.getKey();
                        int iHashCode = str7.hashCode();
                        if (iHashCode != -934521548) {
                            if (iHashCode != 96784904) {
                                if (iHashCode == 433386628 && str7.equals("trace_timing")) {
                                    Object value = entry2.getValue();
                                    if ((value instanceof Map) && (map3 = (Map) value) != null) {
                                        for (Map.Entry entry3 : map3.entrySet()) {
                                            linkedHashMap.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                }
                            } else if (str7.equals("error")) {
                                Object value2 = entry2.getValue();
                                if ((value2 instanceof C821880WLy) && (c821880WLy = (C821880WLy) value2) != null) {
                                    linkedHashMap.put("error_code", Integer.valueOf(c821880WLy.LIZ));
                                    linkedHashMap.put("error_msg", c821880WLy.LIZIZ);
                                }
                            }
                        } else if (str7.equals("report")) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                Object obj6 = c828420Wee.LJFF.get("URL");
                if ((obj6 instanceof String) && (str6 = (String) obj6) != null) {
                    linkedHashMap.put("URL", LJFF(C1520080pew.LIZIZ(str6)));
                }
                if (map != null) {
                    obj4 = map.get("URL");
                }
                if ((obj4 instanceof String) && (str5 = (String) obj4) != null) {
                    linkedHashMap.put("URL", LJFF(str5));
                }
                if (SparkSecurityJSIService.class.isAssignableFrom(cls)) {
                    linkedHashMap.put("jsi_name", c828420Wee.LJFF.get("jsi_name"));
                } else if (SparkSecurityJSBService.class.isAssignableFrom(cls)) {
                    linkedHashMap.put("JSBName", c828420Wee.LJFF.get("JSBName"));
                } else if (SparkSecurityNetworkService.class.isAssignableFrom(cls)) {
                    if (map != null && (obj2 = map.get("hybrid_channel")) != null) {
                        obj5 = obj2;
                    }
                    linkedHashMap.put("hybrid_channel", obj5);
                    Object obj7 = c828420Wee.LJFF.get("can_rewrite");
                    if ((obj7 instanceof Boolean) && (bool2 = (Boolean) obj7) != null) {
                        linkedHashMap.put("can_rewrite", Boolean.valueOf(bool2.booleanValue()));
                        Object obj8 = c828420Wee.LJFF.get("need_rewrite");
                        if ((obj8 instanceof Boolean) && (bool3 = (Boolean) obj8) != null) {
                            zBooleanValue = bool3.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        linkedHashMap.put("need_rewrite", Boolean.valueOf(zBooleanValue));
                    }
                } else if (SparkSecurityWebRouterService.class.isAssignableFrom(cls)) {
                    int iIntValue = ((Integer) c828420Wee.LJFF.get("web_runtime")).intValue();
                    EnumC822170WNb.Companion.getClass();
                    EnumC822170WNb[] enumC822170WNbArrValues = EnumC822170WNb.values();
                    int length = enumC822170WNbArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        EnumC822170WNb enumC822170WNb = enumC822170WNbArrValues[i];
                        if (enumC822170WNb.ordinal() == iIntValue) {
                            String strName = enumC822170WNb.name();
                            if (strName != null) {
                                obj5 = strName;
                            }
                        } else {
                            i++;
                        }
                    }
                    linkedHashMap.put("web_runtime", obj5);
                } else if (SparkSecurityLynxService.class.isAssignableFrom(cls) && Intrinsics.LJFF(str, "handleLynxTemplateVerify")) {
                    Object obj9 = c828420Wee.LJFF.get("verified");
                    if ((obj9 instanceof Boolean) && (bool = (Boolean) obj9) != null) {
                        linkedHashMap.put("verified", Boolean.valueOf(bool.booleanValue()));
                    }
                    Object obj10 = c828420Wee.LJFF.get("error_code");
                    if ((obj10 instanceof EnumC843700X7w) && (enumC843700X7w = (EnumC843700X7w) obj10) != null) {
                        linkedHashMap.put("error_code", Integer.valueOf(enumC843700X7w.getCode()));
                    }
                    Object obj11 = c828420Wee.LJFF.get("error_msg");
                    if ((obj11 instanceof String) && obj11 != null) {
                        linkedHashMap.put("error_msg", obj11);
                    }
                } else if (SparkSecurityWebNavigationService.class.isAssignableFrom(cls)) {
                    Object obj12 = c828420Wee.LJFF.get("iframe_redirect");
                    Boolean bool4 = Boolean.TRUE;
                    if (Intrinsics.LJFF(obj12, bool4)) {
                        linkedHashMap.put("iframe_redirect", bool4);
                        Object obj13 = c828420Wee.LJFF.get("origin_http_url");
                        if ((obj13 instanceof String) && (str4 = (String) obj13) != null) {
                            linkedHashMap.put("origin_http_url", LJFF(str4));
                        }
                    }
                }
                String string = c828420Wee.LIZ.toString();
                String string2 = c828420Wee.LIZIZ.toString();
                String string3 = c828420Wee.LIZJ.toString();
                if (c821850WLv != null) {
                    C821780WLo c821780WLo2 = c821850WLv.LJ;
                    if (c821780WLo2 != null && (interfaceC821860WLw = c821780WLo2.LIZ) != null && (intercept = interfaceC821860WLw.getIntercept()) != null) {
                        zBooleanValue2 = intercept.booleanValue();
                    } else {
                        zBooleanValue2 = c821850WLv.LIZ;
                    }
                } else {
                    zBooleanValue2 = false;
                }
                LJI(string, string2, string3, c821850WLv, zBooleanValue2, cls.getName(), str, str2, linkedHashMap);
            }

            @Override // X.InterfaceC828450Weh
            public final void LIZJ(String str, String str2, String str3, boolean z, boolean z2, String str4, C821850WLv c821850WLv) throws JSONException {
                C821780WLo c821780WLo;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("API", str);
                jSONObject.put("duration", str3);
                jSONObject.put("dur_dynamic_handler", str4);
                jSONObject.put("have_dynamic_handler", z ? 1 : 0);
                jSONObject.put("dynamic_handler_handled", z2 ? 1 : 0);
                if (c821850WLv != null && (c821780WLo = c821850WLv.LJ) != null) {
                    jSONObject.put("action_code", c821780WLo.LIZ.getCode());
                    jSONObject.put("action_message", c821780WLo.LIZ.getDescription());
                }
                SparkSecurityEventTracingSampleControlSettings.SampleConfig sampleConfig = SparkSecurityEventTracingSampleControlSettings.LIZ().pipeline_sample;
                int iIntValue = sampleConfig.overall_sample_rate;
                Integer num = sampleConfig.sample_channels.get(str2);
                if (num != null) {
                    iIntValue *= num.intValue();
                }
                Integer num2 = sampleConfig.sample_apis.get(str);
                if (num2 != null) {
                    iIntValue *= num2.intValue();
                }
                if (C13LZ.LJIIJ(AbstractC19994813Le.Default, C13LZ.LJIILJJIL(0, iIntValue)) < 1) {
                    C1520360pfO c1520360pfO = new C1520360pfO("spark_security_event_pipeline");
                    c1520360pfO.LIZIZ = "hybridkit_default_bid";
                    c1520360pfO.LIZLLL = jSONObject;
                    c1520360pfO.LIZIZ(0);
                    c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                    C1520080pew.LIZ(null, c1520360pfO.LIZ());
                }
            }

            @Override // X.InterfaceC828450Weh
            public final void LJ(String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z) throws JSONException {
                Map map2 = map;
                if (C19719512Dh.LJII(map2)) {
                    if (map2 != null) {
                        map2.put("sss_platform", "FE");
                    }
                } else {
                    map2 = null;
                }
                LJI(str, str2, str3, null, z, str4, str5, str6, map2);
            }

            public static void LJI(String str, String str2, String str3, C821850WLv c821850WLv, boolean z, String str4, String str5, String str6, Map map) throws JSONException {
                Map map2;
                String str7;
                Map map3;
                C0WLP c0wlp;
                JSONObject jSONObject;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("source", str);
                jSONObject2.put("target", str2);
                jSONObject2.put("channel", str3);
                jSONObject2.put("service", str4);
                jSONObject2.put("API", str5);
                jSONObject2.put("time_cost", str6);
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject2.put((String) entry.getKey(), entry.getValue());
                    }
                }
                if (z) {
                    C1520360pfO c1520360pfO = new C1520360pfO("spark_security_intercepted");
                    c1520360pfO.LIZIZ = "hybridkit_default_bid";
                    c1520360pfO.LIZLLL = jSONObject2;
                    c1520360pfO.LIZIZ(0);
                    c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                    C1520080pew.LIZ(null, c1520360pfO.LIZ());
                }
                SparkSecurityEventTracingSampleControlSettings.SampleConfig sampleConfig = SparkSecurityEventTracingSampleControlSettings.LIZ().event_handle_sample;
                int iIntValue = sampleConfig.overall_sample_rate;
                Integer num = sampleConfig.sample_channels.get(str3);
                if (num != null) {
                    iIntValue *= num.intValue();
                }
                Integer num2 = sampleConfig.sample_apis.get(str5);
                if (num2 != null) {
                    iIntValue *= num2.intValue();
                }
                if (C13LZ.LJIIJ(AbstractC19994813Le.Default, C13LZ.LJIILJJIL(0, iIntValue)) < 1) {
                    jSONObject2.put("need_intercept", z);
                    C1520360pfO c1520360pfO2 = new C1520360pfO("spark_security_handle");
                    c1520360pfO2.LIZIZ = "hybridkit_default_bid";
                    c1520360pfO2.LIZLLL = jSONObject2;
                    c1520360pfO2.LIZIZ(0);
                    c1520360pfO2.LJIIJJI = EnumC993170bx5.Tea;
                    C1520080pew.LIZ(null, c1520360pfO2.LIZ());
                }
                if (c821850WLv != null && (c0wlp = c821850WLv.LJFF) != null) {
                    C1520360pfO c1520360pfO3 = new C1520360pfO(c0wlp.LIZ);
                    c1520360pfO3.LIZIZ = "hybridkit_default_bid";
                    Map<String, Object> map4 = c0wlp.LIZIZ;
                    if ((map4 instanceof Map) && map4 != null) {
                        jSONObject = new JSONObject(map4);
                    } else {
                        jSONObject = null;
                    }
                    c1520360pfO3.LIZLLL = jSONObject;
                    c1520360pfO3.LIZIZ(0);
                    c1520360pfO3.LJIIJJI = EnumC993170bx5.Tea;
                    C1520080pew.LIZ(null, c1520360pfO3.LIZ());
                }
                if (map != null) {
                    for (Map.Entry entry2 : map.entrySet()) {
                        Object key = entry2.getKey();
                        Object value = entry2.getValue();
                        if (Intrinsics.LJFF(key, "report")) {
                            if ((value instanceof Map) && (map2 = (Map) value) != null) {
                                Object obj = map2.get("event_name");
                                if ((obj instanceof String) && (str7 = (String) obj) != null) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    Object obj2 = map2.get("params");
                                    if ((obj2 instanceof Map) && (map3 = (Map) obj2) != null) {
                                        for (Map.Entry entry3 : map3.entrySet()) {
                                            jSONObject3.put((String) entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    C1520360pfO c1520360pfO4 = new C1520360pfO(str7);
                                    c1520360pfO4.LIZIZ = "hybridkit_default_bid";
                                    c1520360pfO4.LIZLLL = jSONObject3;
                                    c1520360pfO4.LIZIZ(0);
                                    c1520360pfO4.LJIIJJI = EnumC993170bx5.Tea;
                                    C1520080pew.LIZ(null, c1520360pfO4.LIZ());
                                }
                            }
                        } else {
                            Intrinsics.LJFF(key, "debug");
                        }
                    }
                }
                Iterator it2 = ((ArrayList) C842100X1s.LIZIZ).iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        });
        C1534070q1V.LJIILJJIL = AFwS247S0000000_13.get$arr$(2);
        C1534070q1V.LJIILL = AFwS247S0000000_13.get$arr$(3);
        WebViewHooker.LJ(new JSInjectionProviderExt());
        InlineJsInjectServiceTool inlineJsInjectServiceTool = new InlineJsInjectServiceTool();
        C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
        C1075530e5v.LIZIZ().LIZ(inlineJsInjectServiceTool.getBid(), InterfaceC842120X1u.class, inlineJsInjectServiceTool);
        sparkSecurityServiceCenter.registerService(SparkSecurityLynxService.class, new SparkSecurityLynxServiceImpl());
        sparkSecurityServiceCenter.registerService(SparkSecurityJSBService.class, new SparkSecurityJSBDomainReporter());
        if (SparkSecurityJSBParamReportSettings.LIZ().enable) {
            sparkSecurityServiceCenter.registerService(SparkSecurityJSBService.class, new SparkSecurityJSBParamReportService());
        }
        C1543490qGh.LIZIZ(C1875930yut.class, null, 6);
        C1543490qGh.LIZIZ(C1875960yuw.class, null, 6);
        WebViewHooker.LIZLLL(new FESparkInjectExt());
        WebViewHooker.LIZLLL(new SparkSecurityWebViewExt());
        C1054720dYM.LIZ = C1055810da7.LIZ;
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        v8 v8Var = new v8();
        c1537900q7g.getClass();
        C1537900q7g.LJIIIIZZ(v8Var);
        C821780WLo.LIZJ = new C04PY() { // from class: X.0X1t
            @Override // X.C04PY
            public final Map<String, Map<Integer, List<Object>>> getValue() {
                if (SparkSecurityDynamicActionsSwitch.LIZIZ == null) {
                    SparkSecurityDynamicActionsSwitch.LIZIZ = (SparkSecurityDynamicActionsSwitch.SparkSecurityDynamicActionsModel) C0C64.LJIILLIIL().LJJII(SparkSecurityDynamicActionsSwitch.SparkSecurityDynamicActionsModel.class, SparkSecurityDynamicActionsSwitch.LIZ, "spark_security_dynamic_actions", true);
                }
                SparkSecurityDynamicActionsSwitch.SparkSecurityDynamicActionsModel sparkSecurityDynamicActionsModel = SparkSecurityDynamicActionsSwitch.LIZIZ;
                if (sparkSecurityDynamicActionsModel == null) {
                    sparkSecurityDynamicActionsModel = SparkSecurityDynamicActionsSwitch.LIZ;
                }
                return sparkSecurityDynamicActionsModel.dynamicActions;
            }
        };
        C1490740otc.LIZ.LIZ("SparkSecurityRegister init successfully", EnumC1490770otf.I, "SecurityRegister");
    }
}
