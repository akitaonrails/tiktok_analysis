package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847410XMd {
    public static JSONObject LIZ = null;
    public static boolean LIZIZ = false;
    public static boolean LIZJ = false;
    public static boolean LIZLLL = false;
    public static boolean LJ = false;
    public static int LJFF = 1000;
    public static boolean LJI = true;
    public static final C847430XMf LJII = new C847430XMf(null, true);
    public static final C847430XMf LJIIIIZZ = new C847430XMf(null, false);
    public static final C847430XMf LJIIIZ = new C847430XMf(null, true);
    public static final C847430XMf LJIIJ = new C847430XMf(null, true);
    public static final C847430XMf LJIIJJI = new C847430XMf(null, true);
    public static final C847430XMf LJIIL = new C847430XMf(null, false);
    public static final C847430XMf LJIILIIL = new C847430XMf(new HashSet(Arrays.asList("/aweme/v1/create/", "/api/v1/item/", "/aweme/v1/commit/item/", "/webcast/gift/", "/aweme/v1/commit/follow/")), true);

    public static void LIZ() {
        JSONObject jSONObjectLJFF = C847400XMc.LJFF();
        JSONObject jSONObjectOptJSONObject = jSONObjectLJFF != null ? jSONObjectLJFF.optJSONObject("token_guard_config") : null;
        if (LIZ != jSONObjectOptJSONObject) {
            LIZ = jSONObjectOptJSONObject;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("settings=");
            sbLIZ.append(LIZ);
            C847400XMc.LJIIIZ("TokenGuardSettingManage", C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = LIZ;
            if (jSONObject == null) {
                LJII.LIZLLL(null);
                LJIIIIZZ.LIZLLL(null);
                LJIIIZ.LIZLLL(null);
                LIZIZ = false;
                LJIIJ.LIZLLL(null);
                LJIIJJI.LIZLLL(null);
                LJIIL.LIZLLL(null);
                LIZJ = false;
                LIZLLL = false;
                LJ = false;
                LJFF = LSPassThroughRecordSizeConfig.DEFAULT;
                return;
            }
            C847430XMf c847430XMf = LJII;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("token_guard_paths");
            if (c847430XMf.LJ) {
                synchronized (c847430XMf) {
                    try {
                        c847430XMf.LIZJ(C847430XMf.LIZIZ(jSONArrayOptJSONArray));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                c847430XMf.LIZJ(C847430XMf.LIZIZ(jSONArrayOptJSONArray));
            }
            LJIIIIZZ.LIZLLL(LIZ.optJSONArray("token_guard_path_prefix"));
            LJIIIZ.LJ(LIZ.optJSONArray("exclude_token_guard_paths"));
            LIZIZ = LIZ.optBoolean("enable_token_guard", false);
            LJIIJ.LIZLLL(LIZ.optJSONArray("exclude_get_token_domains"));
            LJIIJJI.LIZLLL(LIZ.optJSONArray("exclude_get_token_paths"));
            LJIIL.LIZLLL(LIZ.optJSONArray("exclude_get_token_prefix"));
            LIZJ = LIZ.optBoolean("enable_full_path_track", false);
            LIZLLL = LIZ.optBoolean("enable_token_launch", false);
            LJ = LIZ.optBoolean("enable_waiting_init", false);
            LJFF = LIZ.optInt("waiting_timeout", LSPassThroughRecordSizeConfig.DEFAULT);
        }
    }
}
