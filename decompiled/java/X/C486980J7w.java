package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableTimeCostSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0J7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486980J7w {
    public static boolean LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final ConcurrentHashMap<String, Long> LJFF;
    public static final ConcurrentHashMap<String, Long> LJI;

    static {
        if (LiveMonitorSampleSetting.INSTANCE.isDolphinExperiment()) {
            LIZ = LiveEnableTimeCostSetting.INSTANCE.enable();
        }
        LIZIZ = "ttlive_feed_base_performance_monitor_all";
        LIZJ = "ttlive_create_room_base_performance_monitor_all";
        LIZLLL = "ttlive_enter_room_base_performance_monitor_all";
        LJ = "ttlive_pk_watch_room_base_performance_monitor_all";
        LJFF = new ConcurrentHashMap<>(200);
        LJI = new ConcurrentHashMap<>(200);
    }

    public static void LIZJ(EnumC486990J7x enumC486990J7x) {
        if (enumC486990J7x == null) {
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = LJFF;
        if (concurrentHashMap.containsKey(enumC486990J7x.name())) {
            concurrentHashMap.remove(enumC486990J7x.name());
        }
        ConcurrentHashMap<String, Long> concurrentHashMap2 = LJI;
        if (concurrentHashMap2.containsKey(enumC486990J7x.name())) {
            concurrentHashMap2.remove(enumC486990J7x.name());
        }
    }

    public static void LIZLLL(EnumC486990J7x enumC486990J7x) {
        if (!LIZ) {
            return;
        }
        LJ(enumC486990J7x, null);
    }

    public static void LJFF(EnumC486990J7x enumC486990J7x) {
        if (!LIZ) {
            return;
        }
        LJFF.put(enumC486990J7x.name(), Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.EnumC486990J7x r9, java.util.HashMap<java.lang.String, java.lang.String> r10) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C486980J7w.LJ(X.0J7x, java.util.HashMap):void");
    }

    public static void LIZ(String str, long j, JSONObject jSONObject) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("TimeCostUtil", "", e);
        }
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("TimeCostUtil", "", e);
        }
    }
}
