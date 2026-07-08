package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vT6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743380vT6 extends AbstractC1743400vT8 {
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r22, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r23, X.EnumC1063300dmC r24) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1743380vT6.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
