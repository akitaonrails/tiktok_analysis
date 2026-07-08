package X;

import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogMonitorExperiment;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210341Bf6 {
    public static final C2210341Bf6 LIZ = new C2210341Bf6();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"api send log failed", "api send config failed", "high frequency events detected"});

    public static void LIZLLL() {
        C2210331Bf5 c2210331Bf5 = C2210331Bf5.LJ;
        AppLogMonitorExperiment appLogMonitorExperiment = AppLogMonitorExperiment.INSTANCE;
        long j = appLogMonitorExperiment.getValue().highFrequencyPeroid;
        long j2 = appLogMonitorExperiment.getValue().highFrequencyThreshold;
        if (j <= 0 || j2 <= 0) {
            c2210331Bf5.LIZJ = null;
        } else {
            c2210331Bf5.LIZJ = new C2210351Bf7(j, j2, new C2211001BgA());
        }
        long j3 = appLogMonitorExperiment.getValue().bigEventPeroid;
        long j4 = appLogMonitorExperiment.getValue().bigEventThreshold;
        if (j3 <= 0 || j4 <= 0) {
            c2210331Bf5.LIZLLL = null;
        } else {
            c2210331Bf5.LIZLLL = new C2210361Bf8(j3, j4, new C2211011BgB());
        }
        c2210331Bf5.LIZ = true;
        c2210331Bf5.LIZIZ = LIZ;
    }

    public static String LIZ(EnumC2210371Bf9 enumC2210371Bf9) {
        String strName;
        if (enumC2210371Bf9 != null) {
            switch (C2210381BfA.LIZ[enumC2210371Bf9.ordinal()]) {
                case 1:
                    return "InterruptionInvalidDid";
                case 2:
                    return "OutOfDataBoundary";
                case 3:
                    return "CacheOverflow";
                case 4:
                    return "CommonError";
                case 5:
                    return "HighFrequency";
                case 6:
                    return "LargeSize";
                default:
                    if (enumC2210371Bf9 != null && (strName = enumC2210371Bf9.name()) != null) {
                        return strName;
                    }
                    break;
            }
        }
        return "null";
    }

    public static final void LIZIZ(EnumC2210541BfQ enumC2210541BfQ, EnumC2210371Bf9 enumC2210371Bf9, EnumC2210591BfV enumC2210591BfV, String str, Map<String, ?> map) throws JSONException {
        String strValueOf;
        boolean z;
        String strName;
        String strName2;
        Object obj;
        Map map2;
        Set<Map.Entry> setEntrySet;
        Map map3;
        Set<Map.Entry> setEntrySet2;
        if (enumC2210371Bf9 != EnumC2210371Bf9.InterruptionBlockList && enumC2210371Bf9 != EnumC2210371Bf9.InterruptionEventList && enumC2210371Bf9 != EnumC2210371Bf9.InterruptionSampling && enumC2210371Bf9 != EnumC2210371Bf9.InterruptionTouristMode) {
            Object obj2 = null;
            if (enumC2210371Bf9 == EnumC2210371Bf9.HighFrequency) {
                if (map != null) {
                    obj2 = ((HashMap) map).get("events");
                }
                if ((obj2 instanceof Map) && (map3 = (Map) obj2) != null && (setEntrySet2 = map3.entrySet()) != null) {
                    for (Map.Entry entry : setEntrySet2) {
                        if (((Number) entry.getValue()).intValue() >= AppLogMonitorExperiment.INSTANCE.getValue().highFrequencyReportThreshold) {
                            C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
                            if (!c2213981Bky.isOffline()) {
                                c2213981Bky.isRegressionTest();
                            }
                            String str2 = (String) C13LP.LJJJLZIJ(1, a0.LJJLIIIJILLIZJL((CharSequence) entry.getKey(), new String[]{":"}, 0, 6));
                            if (str2 == null) {
                                str2 = (String) entry.getKey();
                            }
                            String str3 = (String) C13LP.LJJJLZIJ(0, a0.LJJLIIIJILLIZJL((CharSequence) entry.getKey(), new String[]{":"}, 0, 6));
                            if (str3 == null) {
                                str3 = (String) entry.getKey();
                            }
                            LIZJ(str2, str3, ((Number) entry.getValue()).intValue(), 0L, enumC2210541BfQ, enumC2210371Bf9, enumC2210591BfV, str);
                        }
                    }
                    return;
                }
                return;
            }
            if (enumC2210371Bf9 == EnumC2210371Bf9.LargeSize) {
                if (map != null) {
                    obj2 = ((HashMap) map).get("events");
                }
                if ((obj2 instanceof Map) && (map2 = (Map) obj2) != null && (setEntrySet = map2.entrySet()) != null) {
                    for (Map.Entry entry2 : setEntrySet) {
                        if (((C20018913Ul) entry2.getValue()).LIZJ >= AppLogMonitorExperiment.INSTANCE.getValue().bigEventReportThreshold) {
                            String str4 = (String) C13LP.LJJJLZIJ(1, a0.LJJLIIIJILLIZJL((CharSequence) entry2.getKey(), new String[]{":"}, 0, 6));
                            if (str4 == null) {
                                str4 = (String) entry2.getKey();
                            }
                            String str5 = (String) C13LP.LJJJLZIJ(0, a0.LJJLIIIJILLIZJL((CharSequence) entry2.getKey(), new String[]{":"}, 0, 6));
                            if (str5 == null) {
                                str5 = (String) entry2.getKey();
                            }
                            LIZJ(str4, str5, ((C20018913Ul) entry2.getValue()).LIZIZ, ((C20018913Ul) entry2.getValue()).LIZJ, enumC2210541BfQ, enumC2210371Bf9, enumC2210591BfV, str);
                        }
                    }
                    return;
                }
                return;
            }
            if (enumC2210371Bf9 == EnumC2210371Bf9.OutOfDataBoundary) {
                if (map != null) {
                    obj = ((HashMap) map).get("tag");
                } else {
                    obj = null;
                }
                strValueOf = String.valueOf(obj);
            } else {
                strValueOf = null;
            }
            if (enumC2210371Bf9 == EnumC2210371Bf9.CommonError && C13LP.LJJJJ(str, LIZIZ)) {
                return;
            }
            C2213981Bky c2213981Bky2 = C2213981Bky.LIZIZ;
            if (!c2213981Bky2.isOffline() && !c2213981Bky2.isRegressionTest()) {
                z = false;
            } else {
                z = true;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("online", !z);
            if (enumC2210541BfQ != null) {
                strName = enumC2210541BfQ.name();
            } else {
                strName = null;
            }
            jSONObject.put(Scene.SCENE_SERVICE, strName);
            jSONObject.put("type", LIZ(enumC2210371Bf9));
            if (enumC2210591BfV != null) {
                strName2 = enumC2210591BfV.name();
            } else {
                strName2 = null;
            }
            jSONObject.put("level", strName2);
            jSONObject.put("errorMsg", str);
            jSONObject.put("event", strValueOf);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("count", 0);
            JSONObject jSONObject3 = new JSONObject();
            if (map != null) {
                jSONObject3.put("commit_id", c2213981Bky2.LJFF());
                obj2 = map;
            }
            jSONObject3.put("extra", obj2);
            C793770VBv.LJII("applog_exception", jSONObject, jSONObject2, jSONObject3);
        }
    }

    public static void LIZJ(String str, String str2, int i, long j, EnumC2210541BfQ enumC2210541BfQ, EnumC2210371Bf9 enumC2210371Bf9, EnumC2210591BfV enumC2210591BfV, String str3) throws JSONException {
        boolean z;
        String strName;
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        if (!c2213981Bky.isOffline() && !c2213981Bky.isRegressionTest()) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("online", !z);
        String strName2 = null;
        if (enumC2210541BfQ != null) {
            strName = enumC2210541BfQ.name();
        } else {
            strName = null;
        }
        jSONObject.put(Scene.SCENE_SERVICE, strName);
        jSONObject.put("type", LIZ(enumC2210371Bf9));
        jSONObject.put("log_type", str2);
        if (enumC2210591BfV != null) {
            strName2 = enumC2210591BfV.name();
        }
        jSONObject.put("level", strName2);
        jSONObject.put("errorMsg", str3);
        jSONObject.put("event", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("count", i);
        jSONObject2.put("size", j);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("commit_id", c2213981Bky.LJFF());
        jSONObject3.put("extra", jSONObject4);
        C793770VBv.LJII("applog_exception", jSONObject, jSONObject2, jSONObject3);
    }
}
