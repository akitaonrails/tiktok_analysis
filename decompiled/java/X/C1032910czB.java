package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0czB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032910czB {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static JSONArray LIZIZ(List list) throws JSONException {
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
                    jSONArray.put(LIZJ((Map) obj));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (obj instanceof List) {
                try {
                    jSONArray.put(LIZIZ((List) obj));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject LIZJ(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                jSONObject.put(str, ((Number) value).longValue());
            } else {
                boolean z = true;
                if (value instanceof Float) {
                    if (Math.abs(((Number) value).floatValue()) > Float.MAX_VALUE) {
                        z = false;
                    }
                    if (z) {
                        jSONObject.put(str, r7.floatValue());
                    }
                } else if (value instanceof Integer) {
                    jSONObject.put(str, ((Number) value).intValue());
                } else if (value instanceof Double) {
                    Number number = (Number) value;
                    if (Math.abs(number.doubleValue()) > Double.MAX_VALUE) {
                        z = false;
                    }
                    if (z) {
                        jSONObject.put(str, number.doubleValue());
                    }
                } else if (value instanceof String) {
                    jSONObject.put(str, value);
                } else if (value instanceof Boolean) {
                    jSONObject.put(str, ((Boolean) value).booleanValue());
                } else if (value instanceof Map) {
                    try {
                        jSONObject.put(str, LIZJ((Map) value));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else if (value instanceof List) {
                    try {
                        jSONObject.put(str, LIZIZ((List) value));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
        }
        return jSONObject;
    }

    public static void LIZ(InterfaceC1031540cwy interfaceC1031540cwy, String str, JSONObject jSONObject) {
        JSONObject jSONObjectLIZJ;
        if (interfaceC1031540cwy == null) {
            return;
        }
        HashMap<String, Object> customAdExtraDataParams = interfaceC1031540cwy.getCustomAdExtraDataParams();
        if (customAdExtraDataParams.isEmpty()) {
            jSONObjectLIZJ = new JSONObject();
        } else {
            jSONObjectLIZJ = LIZJ(customAdExtraDataParams);
        }
        if (jSONObject.length() >= 1) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectLIZJ.put(next, jSONObject.opt(next));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        interfaceC1031540cwy.trackUserEvent(str, jSONObjectLIZJ);
    }

    public static void LJ(int i, InterfaceC1033130czX interfaceC1033130czX, String str) throws JSONException {
        LIZ = System.currentTimeMillis();
        if (interfaceC1033130czX != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("tag", "reward_ad");
            jSONObject.putOpt("task_id", str);
            jSONObject.putOpt("task_sum", Integer.valueOf(i));
            jSONObject.putOpt("is_pre_request", 1);
            interfaceC1033130czX.trackUserEvent("reward_load_start", jSONObject);
        }
    }

    public static void LJFF(InterfaceC1031540cwy interfaceC1031540cwy, String str, Boolean bool, Boolean bool2) {
        LIZ = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("tag", "reward_ad");
        jSONObject.putOpt("task_id", str);
        jSONObject.putOpt("task_sum", 1);
        Boolean bool3 = Boolean.TRUE;
        jSONObject.putOpt("is_pre_request", Integer.valueOf(Intrinsics.LJFF(bool, bool3) ? 1 : 0));
        jSONObject.putOpt("is_after_show", Integer.valueOf(Intrinsics.LJFF(bool2, bool3) ? 1 : 0));
        LIZ(interfaceC1031540cwy, "reward_load_start", jSONObject);
    }

    public static void LJI(InterfaceC1031540cwy interfaceC1031540cwy, boolean z, String str, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("tag", "reward_ad");
        jSONObject.putOpt("success", Integer.valueOf(z ? 1 : 0));
        jSONObject.putOpt("duration", Long.valueOf(System.currentTimeMillis() - LIZ));
        jSONObject.putOpt("fail_reason", str);
        jSONObject.putOpt("failed_detail_reason", null);
        LIZ(interfaceC1031540cwy, "reward_video_render_result", jSONObject);
    }

    public static void LJII(InterfaceC1031540cwy interfaceC1031540cwy, String str, String str2, boolean z) {
        int i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("tag", "reward_ad");
        jSONObject.putOpt("task_id", str);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.putOpt("is_cache", Integer.valueOf(i));
        jSONObject.putOpt("no_use_cache_reason", str2);
        LIZ(interfaceC1031540cwy, "reward_result_check", jSONObject);
    }

    public static void LIZLLL(InterfaceC1031540cwy interfaceC1031540cwy, boolean z, String str, String str2, String str3, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("tag", "reward_ad");
        jSONObject.putOpt("task_id", str3);
        jSONObject.putOpt("is_pre_request", Integer.valueOf(z2 ? 1 : 0));
        jSONObject.putOpt("success", Integer.valueOf(z ? 1 : 0));
        jSONObject.putOpt("duration", Long.valueOf(System.currentTimeMillis() - LIZ));
        jSONObject.putOpt("fail_reason", str);
        jSONObject.putOpt("failed_detail_reason", str2);
        LIZ(interfaceC1031540cwy, "reward_load_result", jSONObject);
    }
}
