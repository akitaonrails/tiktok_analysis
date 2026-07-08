package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0omv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486590omv {
    public final C1486600omw LIZ;
    public final C1486600omw LIZIZ;
    public final C1486600omw LIZJ;
    public final AtomicBoolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public final AtomicInteger LJII;

    public final void LIZIZ(String str) {
        JSONObject jSONObject;
        C1486600omw c1486600omw = this.LIZIZ;
        if (c1486600omw != null && (jSONObject = c1486600omw.LJI) != null) {
            try {
                JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(jSONObject, "InputSettingsParam"), "PRDSettings"), "BaselineParams").put("DefaultResolution", str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateDefaultResolution JSONException: ");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZIZ();
            }
        }
    }

    public static JSONObject LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (jSONObject2.has(next)) {
                Object obj = jSONObject.get(next);
                Object obj2 = jSONObject2.get(next);
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    jSONObject3.put(next, LIZ((JSONObject) obj, (JSONObject) obj2));
                } else {
                    jSONObject3.put(next, obj);
                }
            } else {
                jSONObject3.put(next, jSONObject.get(next));
            }
        }
        Iterator<String> itKeys2 = jSONObject2.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            if (!jSONObject.has(next2)) {
                jSONObject3.put(next2, jSONObject2.get(next2));
            }
        }
        return jSONObject3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C1486590omv(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.LIZLLL = atomicBoolean;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = false;
        AtomicInteger atomicInteger = new AtomicInteger(1);
        this.LJII = atomicInteger;
        if (jSONObject == null) {
            if (!z) {
                atomicInteger.set(0);
                atomicBoolean.set(true);
            } else {
                atomicInteger.set(2);
            }
        } else {
            EnumC1486610omx enumC1486610omx = EnumC1486610omx.LLILZLL;
            if ((!jSONObject.has(enumC1486610omx.LL) || !jSONObject.has(EnumC1486610omx.LLIZ.LL)) && ((jSONObject.has(enumC1486610omx.LL) || jSONObject.has(EnumC1486610omx.LLIZ.LL) || z) && !jSONObject.has(enumC1486610omx.LL))) {
                EnumC1486610omx enumC1486610omx2 = EnumC1486610omx.LLIZ;
                if (!jSONObject.has(enumC1486610omx2.LL)) {
                    if (!jSONObject.has(enumC1486610omx.LL) && !jSONObject.has(enumC1486610omx2.LL) && z) {
                        atomicInteger.set(2);
                    }
                }
            }
            atomicInteger.set(0);
            atomicBoolean.set(true);
        }
        if (!atomicBoolean.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("disable preset config because disable reason type is ");
            sbLIZ.append(atomicInteger.get());
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZ();
            return;
        }
        C1698940uJQ.LIZ();
        for (EnumC1486610omx enumC1486610omx3 : EnumC1486610omx.values()) {
            C1486600omw c1486600omw = new C1486600omw();
            String str2 = enumC1486610omx3.LL;
            c1486600omw.LIZ = str2;
            c1486600omw.LIZIZ = C1486300omS.LJI(str2);
            c1486600omw.LIZJ = 1;
            c1486600omw.LIZLLL = enumC1486610omx3.LLILLJJLI;
            c1486600omw.LJ = enumC1486610omx3.LLILZ ? 1 : 0;
            c1486600omw.LJFF = enumC1486610omx3.LLILLL;
            c1486600omw.LJII = 0L;
            try {
                c1486600omw.LJI = new JSONObject(enumC1486610omx3.LLILZIL);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("initAbrStrategyItem JSONException: ");
                sbLIZ2.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ2);
                C1698940uJQ.LIZIZ();
            }
            String str3 = enumC1486610omx3.LL;
            str3.getClass();
            switch (str3.hashCode()) {
                case -1019015374:
                    if (str3.equals("live_stream_strategy_bandwidth_estimator")) {
                        this.LIZJ = c1486600omw;
                    }
                    break;
                case -992152071:
                    if (str3.equals("live_stream_strategy_abr_predict_bitrate")) {
                        this.LIZ = c1486600omw;
                    }
                    break;
                case 533689349:
                    if (str3.equals("live_stream_strategy_startup_bitrate_predict")) {
                        this.LIZIZ = c1486600omw;
                        if (str.equals("game") && (jSONObject2 = c1486600omw.LJI) != null) {
                            try {
                                JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(jSONObject2, "InputSettingsParam"), "PRDSettings"), "BweToBitrateParams").put("BottomLineParams", new JSONObject("{\n  \"SourceCCTK-NoPreview\": {\n    \"default\": {\n      \"hd_60\": 3132000,\n      \"uhd_60\": 16000000,\n      \"uhd\": 14000000,\n      \"hd\": 1927000,\n      \"sd\": 1204000\n    }\n  },\n  \"SourceCCTK-Preview\": {\n    \"default\": {\n      \"hd_60\": 3132000,\n      \"uhd_60\": 16000000,\n      \"uhd\": 14000000,\n      \"hd\": 1927000,\n      \"sd\": 1204000\n    }\n  },\n  \"SourceVoD-NoPreview\": {\n    \"default\": {\n      \"hd_60\": 3466000,\n      \"uhd_60\": 5333000,\n      \"uhd\": 4500000,\n      \"hd\": 980000,\n      \"sd\": 4800000\n    }\n  },\n  \"SourceVoD-Preview\": {\n    \"default\": {\n      \"hd_60\": 3466000,\n      \"uhd_60\": 5333000,\n      \"uhd\": 4500000,\n      \"hd\": 980000,\n      \"sd\": 4800000\n    }\n  }\n}"));
                            } catch (JSONException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("LiveABRParamModel JSONException: ");
                                sbLIZ3.append(e2.getMessage());
                                C2188811AlT.LIZIZ(sbLIZ3);
                                C1698940uJQ.LIZIZ();
                            }
                        }
                    }
                    break;
            }
        }
    }
}
