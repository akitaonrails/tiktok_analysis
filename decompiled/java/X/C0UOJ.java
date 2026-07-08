package X;

import Y.AComparatorS31S0000000_12;
import com.bytedance.android.livesdk.broadcast.dynamic.DynamicChildSwitch;
import com.bytedance.android.livesdk.broadcast.dynamic.DynamicStrategy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UOJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UOJ {
    public static int LIZJ;
    public static boolean LJI;
    public static long LJII;
    public static boolean LJIIIIZZ;
    public static final Map<Integer, DynamicChildSwitch> LIZ = new HashMap();
    public static int LIZIZ = -2;
    public static long LIZLLL = -2;
    public static int LJ = -1;
    public static long LJFF = -1;

    public static boolean LIZIZ() {
        if (LJI) {
            return LJII == 0 || LJIIIIZZ;
        }
        return false;
    }

    public static boolean LIZJ() {
        return LIZLLL > 0;
    }

    public static DynamicChildSwitch LIZLLL(JSONObject jSONObject) {
        int iOptInt;
        try {
            String strOptString = jSONObject.optString("name", "");
            if (strOptString.length() == 0 || (iOptInt = jSONObject.optInt(FollowStatusChangeMethod.PARAM_UID, -1)) == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("strategy");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new DynamicStrategy(jSONObjectOptJSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1), jSONObjectOptJSONObject.optInt("register_time_limit", Integer.MAX_VALUE), jSONObjectOptJSONObject.optInt("priority", 0), jSONObjectOptJSONObject.optInt("rehearsal_time", 30)));
                }
            }
            if (arrayList.size() > 1) {
                C08XD.LJJ(arrayList, new AComparatorS31S0000000_12(8));
            }
            return new DynamicChildSwitch(strOptString, iOptInt, arrayList);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LJ(long j, Function0 function0) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("firsttimestamp, ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("test_lzk_dynamic_GameStartLiveDynamicStrategyManager", C2188811AlT.LIZIZ(sbLIZ));
        if (j <= 0) {
            return;
        }
        int days = (int) TimeUnit.SECONDS.toDays((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - j);
        LIZLLL = j;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("catch GameRoomCreateInfoChannel registerDay: ");
        sbLIZ2.append(days);
        C20441214yg.LIZIZ("test_lzk_dynamic_GameStartLiveDynamicStrategyManager", C2188811AlT.LIZIZ(sbLIZ2));
        LIZIZ = days;
        boolean z = true;
        if (days >= 0 && days <= LIZJ && (i = LJ) != -1) {
            if (i == 0) {
                z = false;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("use_game_live_dynamic_strategy");
            c474500IjALIZ.LJJII(Integer.valueOf(LJ), "dynamic_strategy_id");
            c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_use");
            c474500IjALIZ.LJJII(Integer.valueOf(LIZIZ), "live_day");
            c474500IjALIZ.LJJII(Long.valueOf(LJFF), "anchor_id");
            c474500IjALIZ.LIZ();
            function0.invoke();
        }
    }

    public static boolean LIZ(int i, int i2, boolean z) {
        DynamicChildSwitch dynamicChildSwitch;
        List<DynamicStrategy> list;
        boolean z2;
        if (LIZIZ()) {
            HashMap map = (HashMap) LIZ;
            if (map.containsKey(Integer.valueOf(i)) && i2 >= 0 && (dynamicChildSwitch = (DynamicChildSwitch) map.get(Integer.valueOf(i))) != null && (list = dynamicChildSwitch.mStrategyList) != null) {
                for (DynamicStrategy dynamicStrategy : list) {
                    if (i2 <= dynamicStrategy.mRegisterTimeLimit) {
                        if (dynamicStrategy.mSwitchStatus == -1) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("type: ");
                            sbLIZ.append(i);
                            sbLIZ.append(" status: ");
                            sbLIZ.append(z);
                            C20441214yg.LIZIZ("test_lzk_dynamic_GameStartLiveDynamicStrategyManager", C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("type: ");
                            sbLIZ2.append(i);
                            sbLIZ2.append(" status: ");
                            z = false;
                            if (dynamicStrategy.mSwitchStatus == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            sbLIZ2.append(z2);
                            C20441214yg.LIZIZ("test_lzk_dynamic_GameStartLiveDynamicStrategyManager", C2188811AlT.LIZIZ(sbLIZ2));
                            if (dynamicStrategy.mSwitchStatus == 1) {
                                return true;
                            }
                        }
                    }
                }
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("type: ");
            sbLIZ3.append(i);
            sbLIZ3.append(" status: ");
            sbLIZ3.append(z);
            C20441214yg.LIZIZ("test_lzk_dynamic_GameStartLiveDynamicStrategyManager", C2188811AlT.LIZIZ(sbLIZ3));
            return z;
        }
        return z;
    }
}
