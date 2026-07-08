package X;

import Y.ARunnableS0S2000000_3;
import Y.ARunnableS21S1200000_17;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0frD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1143290frD {
    public static void LJIIIIZZ(Runnable runnable) {
        if (LiveInnerDowngradeAdaptExp.INSTANCE.isDisableAlog() || ScalableDowngradeSetting.disableAlog() || LiveHostAutoAdaptiveParams.disableALog()) {
            return;
        }
        C823050WQl.LIZIZ().submit(runnable);
    }

    public static JSONObject LJIIIZ(Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }

    public static void LIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LJIIIIZZ(new ARunnableS0S2000000_3(str, str2, 3));
        }
    }

    public static void LIZLLL(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LJIIIIZZ(new ARunnableS0S2000000_3(str, str2, 1));
        }
    }

    public static void LJI(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            LJIIIIZZ(new ARunnableS0S2000000_3(str, str2, 2));
        }
    }

    public static void LJIIJ(StackTraceElement[] stackTraceElementArr, int i) {
        C20441214yg.LJIIJ(i, "ttlive_exception", stackTraceElementArr);
    }

    public final void LIZIZ(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            LJIIIIZZ(new ARunnableS21S1200000_17((C1143300frE) this, str, map, 1));
        }
    }

    public final void LIZJ(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            LJIIIIZZ(new ARunnableS21S1200000_17((C1143300frE) this, str, jSONObject, 4));
        }
    }

    public final void LJ(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            LJIIIIZZ(new ARunnableS21S1200000_17((C1143300frE) this, str, map, 3));
        }
    }

    public final String LJFF(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        long jLongValue;
        C0IXL c0ixl;
        Long l;
        JSONObject jSONObject3 = new JSONObject();
        C1143300frE c1143300frE = (C1143300frE) this;
        w.LIZ.getClass();
        long jLJIJJ = w.LJIJJ();
        Pair<Long, JSONObject> pair = c1143300frE.LIZ.get();
        if (pair != null && pair.getFirst().longValue() == jLJIJJ) {
            jSONObject2 = pair.getSecond();
        } else {
            jSONObject2 = new JSONObject();
            String strValueOf = String.valueOf(w.LJIJJ());
            String strValueOf2 = String.valueOf(w.LJ());
            C0IR5 c0ir5LJJIII = w.LJJIII();
            if (c0ir5LJJIII != null && (c0ixl = c0ir5LJJIII.LJFF) != null && (l = c0ixl.LJJJLL) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            try {
                jSONObject2.put("user_id", String.valueOf(jLongValue));
                jSONObject2.put("room_id", strValueOf);
                jSONObject2.put("anchor_id", strValueOf2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c1143300frE.LIZ.set(new Pair<>(Long.valueOf(jLJIJJ), jSONObject2));
        }
        try {
            jSONObject3.put("tag", str);
            if (jSONObject2 != null) {
                jSONObject3.put("params", jSONObject2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject3.put("data", jSONObject);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return C786410Ut5.J3(jSONObject3);
    }

    public final void LJII(String str, Map<String, ?> map) {
        if (!TextUtils.isEmpty(str) && map != null) {
            LJIIIIZZ(new ARunnableS21S1200000_17((C1143300frE) this, str, map, 2));
        }
    }
}
