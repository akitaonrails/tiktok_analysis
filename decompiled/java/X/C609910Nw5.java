package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Nw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609910Nw5 {
    public static long LIZIZ;
    public static final C609910Nw5 LIZ = new C609910Nw5();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C609240Nv0());

    public static boolean LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Keva kevaLIZ = C0R1F.LIZ();
        return jCurrentTimeMillis - (kevaLIZ != null ? kevaLIZ.getLong("KEY_LAST_UPLOAD_TIME", 0L) : 0L) > ((Number) C0BHS.LIZ.getValue()).longValue();
    }

    public static void LIZIZ(int i, JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        Keva kevaLIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Double dValueOf = null;
        if (jSONObject2 != null) {
            dValueOf = Double.valueOf(jSONObject2.optDouble("dynamic_perf_stable_score"));
        }
        if (dValueOf != null) {
            z = true;
        } else {
            z = false;
        }
        if (!LIZ() || !z) {
            C1510170pOx c1510170pOx = C1510170pOx.LIZ;
            float f = C609920Nw6.LIZ().monitorRate;
            c1510170pOx.getClass();
            if (!C1510170pOx.LIZJ(f) || jCurrentTimeMillis - LIZIZ <= C609920Nw6.LIZ().monitorInterval) {
                return;
            }
        }
        LIZIZ = jCurrentTimeMillis;
        JSONObject jSONObject3 = new JSONObject();
        if (C609920Nw6.LIZ().monitorFeatures && jSONObject != null) {
            jSONObject3.put("input_features", C786410Ut5.J3(jSONObject));
        }
        if (C609920Nw6.LIZ().monitroScore) {
            if (jSONObject2 != null) {
                jSONObject3.put("score", C786410Ut5.J3(jSONObject2));
                if (z && (kevaLIZ = C0R1F.LIZ()) != null) {
                    kevaLIZ.storeLong("KEY_LAST_UPLOAD_TIME", jCurrentTimeMillis);
                }
            }
            jSONObject3.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        }
        C20684815ws.LJIJ("pythia_feature", jSONObject3);
    }
}
