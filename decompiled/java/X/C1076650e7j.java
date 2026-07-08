package X;

import android.app.Activity;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS581S0100000_2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0e7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076650e7j extends AbstractC1076660e7k {
    public final JSONArray LIZJ(List<? extends Object> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Float) {
                jSONArray.put(((Number) obj).floatValue());
            } else if (obj instanceof Long) {
                jSONArray.put(((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                jSONArray.put(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                jSONArray.put(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                jSONArray.put(obj);
            } else if (obj instanceof Boolean) {
                jSONArray.put(((Boolean) obj).booleanValue());
            } else if (obj instanceof Map) {
                try {
                    jSONArray.put(LIZLLL((Map) obj));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (obj instanceof List) {
                try {
                    jSONArray.put(LIZJ((List) obj));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return jSONArray;
    }

    public final JSONObject LIZLLL(Map<String, ? extends Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                jSONObject.put(key, ((Number) value).longValue());
            } else {
                boolean z = true;
                if (value instanceof Float) {
                    if (Math.abs(((Number) value).floatValue()) > Float.MAX_VALUE) {
                        z = false;
                    }
                    if (z) {
                        jSONObject.put(key, r7.floatValue());
                    }
                } else if (value instanceof Integer) {
                    jSONObject.put(key, ((Number) value).intValue());
                } else if (value instanceof Double) {
                    Number number = (Number) value;
                    if (Math.abs(number.doubleValue()) > Double.MAX_VALUE) {
                        z = false;
                    }
                    if (z) {
                        jSONObject.put(key, number.doubleValue());
                    }
                } else if (value instanceof String) {
                    jSONObject.put(key, value);
                } else if (value instanceof Boolean) {
                    jSONObject.put(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Map) {
                    try {
                        jSONObject.put(key, LIZLLL((Map) value));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else if (value instanceof List) {
                    try {
                        jSONObject.put(key, LIZJ((List) value));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
        }
        return jSONObject;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String str;
        String str2;
        Object obj;
        PageFinder pageFinderVia;
        C1059860dge c1059860dge;
        InterfaceC1076710e7p interfaceC1076710e7p;
        Activity activityLIZLLL;
        InterfaceC1076670e7l interfaceC1076670e7l = (InterfaceC1076670e7l) xBaseParamModel;
        InterfaceC1166580gSm interfaceC1166580gSm = C1076680e7m.LIZ.get(interfaceC1076670e7l.getPageId());
        String containerID = null;
        if (interfaceC1166580gSm == null) {
            C2382909Vj.LIZ(completionBlock, 0, "empty GlobalContext", null, 4);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(interfaceC1166580gSm.LIZLLL(0));
        Map<String, Object> params = interfaceC1076670e7l.getParams();
        if (params != null) {
            linkedHashMap.putAll(params);
        }
        Object obj2 = linkedHashMap.get("btm");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        Object obj3 = linkedHashMap.get("btm_show_id");
        if (obj3 instanceof String) {
            str2 = (String) obj3;
        } else {
            str2 = null;
        }
        if (C770702zh.LIZIZ(str) && (str2 == null || str2.length() == 0)) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC == null || (pageFinderVia = (PageFinder) interfaceC634840OvC.LIZIZ(PageFinder.class)) == null) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null && (c1059860dge = (C1059860dge) interfaceC634840OvC2.LIZIZ(C1059860dge.class)) != null && (interfaceC1076710e7p = (InterfaceC1076710e7p) c1059860dge.LIZ(InterfaceC1076710e7p.class)) != null) {
                    obj = interfaceC1076710e7p.get("page_finder");
                } else {
                    obj = null;
                }
                if (obj instanceof PageFinder) {
                    pageFinderVia = (PageFinder) obj;
                } else {
                    pageFinderVia = null;
                }
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            if (pageFinderVia == null) {
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    activityLIZLLL = interfaceC634840OvC3.LIZLLL();
                } else {
                    activityLIZLLL = null;
                }
                pageFinderVia = PageFinder.via(activityLIZLLL);
            }
            for (Map.Entry entry : BtmSDK.createReportParams$default(btmSDK, str, pageFinderVia, null, 4, null).entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
        }
        interfaceC1076670e7l.getEventName();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj4 : linkedHashMap.keySet()) {
            Object obj5 = linkedHashMap.get(obj4);
            if (obj5 instanceof Boolean) {
                linkedHashMap2.put(obj4, String.valueOf(((Boolean) obj5).booleanValue()));
            } else if (obj5 instanceof Integer) {
                linkedHashMap2.put(obj4, String.valueOf(((Number) obj5).intValue()));
            } else if (obj5 instanceof Long) {
                linkedHashMap2.put(obj4, String.valueOf(((Number) obj5).longValue()));
            } else if (obj5 instanceof Number) {
                Number number = (Number) obj5;
                if (Math.abs(number.doubleValue()) <= Double.MAX_VALUE) {
                    linkedHashMap2.put(obj4, String.valueOf(number.doubleValue()));
                } else {
                    linkedHashMap3.put(obj4, obj5);
                }
            } else if (obj5 instanceof String) {
                linkedHashMap2.put(obj4, obj5);
            } else if (obj5 instanceof Map) {
                linkedHashMap2.put(obj4, C786410Ut5.J3(LIZLLL((Map) obj5)));
            } else if (obj5 instanceof List) {
                linkedHashMap2.put(obj4, LIZJ((List) obj5).toString());
            } else {
                linkedHashMap3.put(obj4, obj5);
            }
        }
        C1018703yb.LIZLLL(interfaceC1076670e7l.getEventName(), new AwS581S0100000_2((Map) linkedHashMap2, (Map<String, String>) 515));
        InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
        if (interfaceC634840OvC4 != null) {
            containerID = interfaceC634840OvC4.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1076690e7n.class, containerID), "");
    }
}
