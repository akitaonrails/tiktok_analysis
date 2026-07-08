package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QT8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QT8 {
    public static int LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static long LIZ() {
        long j;
        synchronized (C0QTY.LIZ) {
            try {
                j = C0QTY.LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (j <= 0) {
            return 0L;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (jElapsedRealtime > 0) {
            return jElapsedRealtime;
        }
        return 0L;
    }

    public static int LJ() {
        int i;
        if (!C0QXC.LIZ().enable) {
            return 0;
        }
        synchronized (C0QTY.LIZ) {
            try {
                i = C0QTY.LJ;
                C0QTY.LJ = 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    public static void LIZIZ(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        int length = 0;
        boolean z = true;
        if (LIZ <= 1) {
            z = false;
        }
        jSONObject.put("is_re_search", z);
        if (str != null) {
            length = str.length();
        }
        jSONObject.put("word_length", length);
        jSONObject.put("click_type", "back");
        jSONObject.put("click_dur", LIZ());
        jSONObject.put("stop_cnt", LJ());
        jSONObject.put("root_enter_from_type", i);
        jSONObject.put("is_could_start", LIZJ ? 1 : 0);
        try {
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("ec_search_sug_trace", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZJ(int i, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int length = 0;
        boolean z = true;
        if (LIZ <= 1) {
            z = false;
        }
        jSONObject.put("is_re_search", z);
        if (str != null) {
            length = str.length();
        }
        jSONObject.put("word_length", length);
        jSONObject.put("click_type", "key_board_confirm");
        jSONObject.put("click_dur", LIZ());
        jSONObject.put("stop_cnt", LJ());
        jSONObject.put("root_enter_from_type", i);
        jSONObject.put("is_could_start", LIZJ ? 1 : 0);
        try {
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("ec_search_sug_trace", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZLLL(C0QUT c0qut, C0QUT c0qut2) {
        boolean z;
        C0QUT c0qut3 = C0QUT.SUG;
        boolean z2 = false;
        if (c0qut2 == c0qut3) {
            if (!LIZIZ) {
                LIZJ = true;
                LIZIZ = true;
            } else {
                LIZJ = false;
            }
        }
        if (c0qut == c0qut3 && c0qut2 != c0qut3) {
            LIZJ = false;
        }
        if (c0qut == c0qut3) {
            z = true;
        } else {
            z = false;
        }
        if (c0qut2 == c0qut3) {
            z2 = true;
        }
        if (!z && z2) {
            LIZ++;
        }
    }
}
