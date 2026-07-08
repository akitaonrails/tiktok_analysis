package X;

import Y.ARunnableS10S1100000_4;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NDE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NDE {
    public static final C0NDE LIZ = new C0NDE();

    public static int LIZLLL() {
        C590420NDs.LIZ.getClass();
        long jLIZJ = C590420NDs.LIZJ();
        String strLJIIJ = C590420NDs.LJIIJ();
        long jLIZ = C0NEU.LIZ();
        if (jLIZ <= 0) {
            return 4;
        }
        if (TextUtils.isEmpty(strLJIIJ)) {
            return 2;
        }
        return System.currentTimeMillis() - jLIZJ >= jLIZ ? 3 : 1;
    }

    public static void LIZ(String str, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        int i = 1;
        c2344009Gk.LIZJ(1, "is_success");
        c2344009Gk.LJIIIIZZ("enter_method", str);
        if (!z) {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_background");
        try {
            C10SV.LIZ(c2344009Gk);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        LJ("cache_video_request", c2344009Gk.LIZ);
    }

    public static void LJ(String str, Map map) {
        try {
            C20684815ws.LJFF().execute(new ARunnableS10S1100000_4(map, str, 0));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJFF(final int i, final int i2, final Integer num) {
        C15O7.LIZJ(new Callable() { // from class: X.0ND8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("ColdCacheReportUtils@940c.statCacheSuccess$1");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("is_cache", i);
                    jSONObject.put("is_timeout", i2);
                    jSONObject.put("cache_num", num);
                    C590420NDs.LIZ.getClass();
                    jSONObject.put("from_type", C590420NDs.LJI().getString("feed_cache_source", "def"));
                    AppLogNewUtils.onEventV3("pull_out_cache_video", jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ColdCacheReportUtils@940c.statCacheSuccess$1");
                return unit;
            }
        });
    }

    public static void LIZIZ(int i, String str, String str2, int i2, long j, boolean z) {
        String str3;
        int i3 = 1;
        if (C590610NEl.LIZ()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, "is_success");
            c2344009Gk.LIZJ(i2, "errorCode");
            if (!z) {
                i3 = 0;
            }
            c2344009Gk.LIZJ(i3, "is_background");
            ConcurrentHashMap<String, Integer> concurrentHashMap = C0NDF.LIZ;
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            c2344009Gk.LJ(concurrentHashMap.get(str3), "internet_speed");
            c2344009Gk.LIZLLL(j, "duration");
            ConcurrentHashMap<String, Integer> concurrentHashMap2 = C0NDF.LIZIZ;
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJ(concurrentHashMap2.get(str), "bitrate");
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            try {
                C10SV.LIZ(c2344009Gk);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            LJ("cache_video_request_response", c2344009Gk.LIZ);
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LIZJ(i, "is_success");
        c2344009Gk2.LIZJ(i2, "errorCode");
        if (!z) {
            i3 = 0;
        }
        c2344009Gk2.LIZJ(i3, "is_background");
        try {
            C10SV.LIZ(c2344009Gk2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        LJ("cache_video_request_response", c2344009Gk2.LIZ);
    }
}
