package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vuy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813060Vuy {
    public static final C813080Vv0 LIZJ = new AbstractC813070Vuz<C813060Vuy>() { // from class: X.0Vv0
    };
    public final Map<String, AbstractC813050Vux> LIZ = new HashMap();
    public JSONObject LIZIZ;

    public static C813060Vuy LIZ() {
        C813060Vuy c813060Vuy;
        C813080Vv0 c813080Vv0 = LIZJ;
        synchronized (c813080Vv0) {
            try {
                if (c813080Vv0.LIZ == null) {
                    c813080Vv0.LIZ = new C813060Vuy();
                }
                c813060Vuy = c813080Vv0.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c813060Vuy;
    }
}
