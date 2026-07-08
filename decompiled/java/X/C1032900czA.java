package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0czA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032900czA {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static final /* synthetic */ int LJFF = 0;

    public static void LJ() {
        long j = LIZLLL;
        if (j > 0) {
            LJ += System.currentTimeMillis() - j;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("monitorContainerOnPause, accumulated stayDuration = ");
            sbLIZ.append(LJ);
            C2188811AlT.LIZIZ(sbLIZ);
            LIZLLL = 0L;
        }
    }

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

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.InterfaceC1032120cxu r5) throws org.json.JSONException {
        /*
            LJ()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = X.C1032900czA.LIZJ
            long r3 = r3 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "duration"
            r2.putOpt(r0, r1)
            long r0 = X.C1032900czA.LJ
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "stay_duration"
            r2.putOpt(r0, r1)
            if (r5 == 0) goto L4c
            int r0 = r5.getRewardAdDataStatus()
        L29:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "success"
            r2.putOpt(r0, r1)
            if (r5 == 0) goto L4a
            boolean r1 = r5.getRewardAdHasShow()
            r0 = 1
            if (r1 != r0) goto L4a
        L3b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "ad_has_show"
            r2.putOpt(r0, r1)
            java.lang.String r0 = "reward_container_stay_duration"
            LIZ(r5, r0, r2)
            return
        L4a:
            r0 = 0
            goto L3b
        L4c:
            r0 = -1
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1032900czA.LJFF(X.0cxu):void");
    }

    public static void LIZ(InterfaceC1032120cxu interfaceC1032120cxu, String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectLIZJ;
        if (interfaceC1032120cxu == null) {
            return;
        }
        HashMap<String, Object> customAdExtraDataParams = interfaceC1032120cxu.getCustomAdExtraDataParams();
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
        interfaceC1032120cxu.trackUserEvent(str, jSONObjectLIZJ);
    }

    public static void LJII(int i, InterfaceC1033150czZ interfaceC1033150czZ, String str) {
        LIZ = System.currentTimeMillis();
        if (interfaceC1033150czZ != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("tag", "reward_ad");
            jSONObject.putOpt("task_id", str);
            jSONObject.putOpt("task_sum", Integer.valueOf(i));
            jSONObject.putOpt("is_pre_request", 1);
            interfaceC1033150czZ.trackUserEvent("reward_load_start", jSONObject);
        }
    }

    public static void LJIIIIZZ(InterfaceC1032120cxu interfaceC1032120cxu, String str, Boolean bool, Boolean bool2) throws JSONException {
        LIZ = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("tag", "reward_ad");
        jSONObject.putOpt("task_id", str);
        jSONObject.putOpt("task_sum", 1);
        Boolean bool3 = Boolean.TRUE;
        jSONObject.putOpt("is_pre_request", Integer.valueOf(Intrinsics.LJFF(bool, bool3) ? 1 : 0));
        jSONObject.putOpt("is_after_show", Integer.valueOf(Intrinsics.LJFF(bool2, bool3) ? 1 : 0));
        LIZ(interfaceC1032120cxu, "reward_load_start", jSONObject);
    }

    public static void LJIIJ(InterfaceC1032120cxu interfaceC1032120cxu, boolean z, String str, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("tag", "reward_ad");
        jSONObject.putOpt("success", Integer.valueOf(z ? 1 : 0));
        jSONObject.putOpt("duration", Long.valueOf(System.currentTimeMillis() - LIZ));
        jSONObject.putOpt("fail_reason", str);
        jSONObject.putOpt("failed_detail_reason", null);
        LIZ(interfaceC1032120cxu, "reward_video_render_result", jSONObject);
    }

    public static void LJIIJJI(InterfaceC1032120cxu interfaceC1032120cxu, String str, String str2, boolean z) {
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
        LIZ(interfaceC1032120cxu, "reward_result_check", jSONObject);
    }

    public static void LIZLLL(InterfaceC1032120cxu interfaceC1032120cxu, int i, int i2, long j, String str) throws JSONException {
        if (interfaceC1032120cxu == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", "reward_ad");
        jSONObject.put("success", i);
        jSONObject.put("code", i2);
        jSONObject.put("duration", j);
        if (str != null) {
            jSONObject.put("fail_reason", str);
        }
        LIZ(interfaceC1032120cxu, "reward_coin_claim_result", jSONObject);
    }

    public static void LJIIIZ(InterfaceC1033070czR interfaceC1033070czR, int i, String str, boolean z, int i2, String str2, String str3) throws JSONException {
        if (interfaceC1033070czR != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("tag", "reward_ad");
            jSONObject.putOpt(Scene.SCENE_SERVICE, Integer.valueOf(i));
            jSONObject.putOpt("tasks", str);
            jSONObject.putOpt("success", Integer.valueOf(z ? 1 : 0));
            jSONObject.putOpt("duration", Long.valueOf(System.currentTimeMillis() - LIZIZ));
            jSONObject.putOpt("code", Integer.valueOf(i2));
            if (str2 != null) {
                jSONObject.putOpt("failed_detail_reason", str2);
            }
            if (str3 != null) {
                jSONObject.putOpt("trigger_source", str3);
            }
            interfaceC1033070czR.trackUserEvent("reward_coin_pre_req_load_result", jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    public static void LJI(InterfaceC1032120cxu interfaceC1032120cxu, boolean z, String str, String str2, String str3, boolean z2, Integer num, Integer num2, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        ?? r10 = z2;
        if ((i & 32) != 0) {
            r10 = 0;
        }
        if ((i & 64) != 0) {
            num = null;
        }
        if ((i & 128) != 0) {
            num2 = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("tag", "reward_ad");
        jSONObject.putOpt("task_id", str3);
        jSONObject.putOpt("is_pre_request", Integer.valueOf((int) r10));
        jSONObject.putOpt("success", Integer.valueOf(z ? 1 : 0));
        jSONObject.putOpt("duration", Long.valueOf(System.currentTimeMillis() - LIZ));
        jSONObject.putOpt("fail_reason", str);
        jSONObject.putOpt("failed_detail_reason", str2);
        jSONObject.putOpt("scene_type", num);
        jSONObject.putOpt("aweme_list_size", num2);
        LIZ(interfaceC1032120cxu, "reward_load_result", jSONObject);
    }
}
