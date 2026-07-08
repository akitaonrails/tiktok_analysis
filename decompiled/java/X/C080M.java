package X;

import Y.ARunnableS9S1100000_3;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.080M, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C080M {
    public static boolean LIZ;
    public static List<String> LIZIZ;
    public static List<String> LIZJ;
    public static AnonymousClass0956 LJFF;
    public static List<Integer> LIZLLL = C13BV.INSTANCE;
    public static final C054G LJ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1450));

    public static JSONObject LIZ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("last_strategy_result", 1);
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("al_event_key", "video_play");
        jSONArray2.put(jSONObject);
        jSONArray.put(jSONArray2);
        jSONObject2.put("last_strategy_match_events", jSONArray);
        return jSONObject2;
    }

    public static void LIZIZ(JSONObject jSONObject) throws JSONException {
        if (LIZLLL.isEmpty()) {
            C20571615ec.LIZ.getClass();
            C20571615ec.LIZIZ("startTimer return. timing list is empty");
            return;
        }
        ((Handler) LJI.getValue()).removeMessages(1);
        JSONObject jSONObjectLIZ = LIZ(jSONObject);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Iterator<Integer> it2 = LIZLLL.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            long j = ((((long) iIntValue) * 1000) + jUptimeMillis) - jUptimeMillis;
            if (j < 0) {
                j = 0;
            }
            JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObjectLIZ));
            JSONObject jSONObject3 = new JSONObject();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("opt_video_play_");
            sbLIZ.append(iIntValue);
            jSONObject3.put("timing", C2188811AlT.LIZIZ(sbLIZ));
            jSONObject2.put("strategy_extra_key", jSONObject3);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = jSONObject2;
            C786410Ut5.LJLJLJ((Handler) LJI.getValue(), messageObtain, j);
        }
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        List<String> list;
        if (!LIZ) {
            return;
        }
        List<String> list2 = LIZJ;
        if ((list2 != null && list2.contains(str)) || ((list = LIZIZ) != null && list.contains(str))) {
            if (((Number) C080F.LIZ.getValue()).intValue() == 1) {
                C786410Ut5.LJJZZIII((Handler) LJI.getValue(), new ARunnableS9S1100000_3(jSONObject, str, 20));
            } else {
                C23250099c.LIZLLL(LJ, null, null, new C08VT(str, null, jSONObject), 3);
            }
        }
    }
}
