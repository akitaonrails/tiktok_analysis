package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714100uhs {
    public static final C1714100uhs LIZ = new C1714100uhs();
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static long LJI;
    public static long LJII;

    public static Map LIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", LIZIZ), new Pair("previous_page_id", LIZJ), new Pair("trace_id", LIZLLL), new Pair("merchant_user_id", LJFF), new Pair("biz_merchant_id", LJ), new Pair("page_id", "giftcard-send/checkout"), new Pair("busi_line", "giftcard"), new Pair("country_code", C1717770unn.LJIIIIZZ().getPriorityRegion()), new Pair("device_source", "Android"), new Pair("os_version", Build.VERSION.RELEASE), new Pair("app_version", C1717770unn.LIZJ().getVersionInfo().LIZ), new Pair("device_id", C1717770unn.LIZJ().getDeviceId()), new Pair("timestamp_collect", String.valueOf(System.currentTimeMillis())));
    }

    public static void LIZLLL(String str) {
        LIZIZ("pipo_button_show", C2097608Jq.LJIIJ(new Pair("event_type", "show"), new Pair("button_id", str)));
    }

    public static void LIZIZ(String str, Map map) {
        try {
            JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIL(map, LIZ()));
            C1716310ulR.LIZ.getClass();
            C1716310ulR.LJ(str, jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZJ(String str, String str2) {
        LIZIZ("pipo_button_click", C2097608Jq.LJIIJ(new Pair("event_type", "click"), new Pair("button_id", str), new Pair("popup_id", str2)));
    }

    public static void LJ(long j, String str, boolean z) {
        Pair[] pairArr = new Pair[4];
        int i = 0;
        pairArr[0] = new Pair("event_type", "leave");
        if (z) {
            i = 1;
        }
        pairArr[1] = new Pair("is_load_data", Integer.valueOf(i));
        pairArr[2] = new Pair("quit_type", str);
        pairArr[3] = new Pair("stay_time", Long.valueOf(j));
        LIZIZ("pipo_page_stay", C2097608Jq.LJIIJ(pairArr));
    }
}
