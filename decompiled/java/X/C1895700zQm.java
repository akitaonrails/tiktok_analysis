package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895700zQm {
    public static Aweme LIZIZ;
    public static final C1895700zQm LIZ = new C1895700zQm();
    public static final Map<String, String> LIZJ = new LinkedHashMap();
    public static final HashSet<String> LIZLLL = new HashSet<>();
    public static String LJ = "";

    public static String LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        try {
            String strOptString = new JSONObject(str).optString("task_event_key");
            if (strOptString == null) {
                return "";
            }
            return strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
