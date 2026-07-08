package X;

import com.bytedance.android.livesdk.livesetting.barrage.TtliveGameSpeedTestPreFetchSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783670Uof {
    public static final Map<Long, C783680Uog> LIZ = new LinkedHashMap();
    public static final boolean LIZIZ;
    public static final long LIZJ;
    public static final long LIZLLL;

    static {
        try {
            JSONObject jSONObject = new JSONObject(TtliveGameSpeedTestPreFetchSetting.INSTANCE.getValue());
            LIZIZ = jSONObject.optBoolean("enable_prefetch", false);
            LIZJ = jSONObject.optLong("game_tab_expire_time", 0L);
            LIZLLL = jSONObject.optLong("prefetch_result_expire_time", 0L);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("GameSpeedTestPrefetchHelper", e);
        }
    }

    public static C783680Uog LIZ() {
        C20441214yg.LIZIZ("GameSpeedTestPrefetchHelper", "getMemoryCacheData");
        long curUserId = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId();
        return (C783680Uog) ((LinkedHashMap) LIZ).get(Long.valueOf(curUserId));
    }

    public static boolean LIZIZ() {
        if (!LIZIZ) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Long lLIZIZ = InterfaceC772390URp.v.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLastPreScheduleTime: ");
        sbLIZ.append(lLIZIZ);
        C20441214yg.LIZIZ("GameSpeedTestPrefetchHelper", C2188811AlT.LIZIZ(sbLIZ));
        long jLongValue = lLIZIZ.longValue() / 1000;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("since last preSchedule: ");
        long j = jCurrentTimeMillis - jLongValue;
        sbLIZ2.append(j);
        C20441214yg.LIZIZ("GameSpeedTestPrefetchHelper", C2188811AlT.LIZIZ(sbLIZ2));
        if (j > LIZJ) {
            C20441214yg.LIZIZ("GameSpeedTestPrefetchHelper", "last preSchedule time > game_tab_expire_time");
            return false;
        }
        if (j <= LIZLLL) {
            return true;
        }
        C20441214yg.LIZIZ("GameSpeedTestPrefetchHelper", "last preSchedule time > prefetch_result_expire_time");
        return false;
    }

    public static void LIZJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeLastSpeedTestTime: ");
        sbLIZ.append(jCurrentTimeMillis);
        C20441214yg.LIZIZ("GameSpeedTestPrefetchHelper", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC772390URp.v.LJFF(Long.valueOf(jCurrentTimeMillis));
    }

    public static void LIZLLL(C783680Uog c783680Uog) {
        C20441214yg.LIZIZ("GameSpeedTestPrefetchHelper", "storeMemoryCacheData");
        long curUserId = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId();
        if (c783680Uog != null) {
            LIZ.put(Long.valueOf(curUserId), c783680Uog);
        }
    }
}
