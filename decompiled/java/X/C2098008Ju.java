package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2098008Ju {
    public static final <K, V> JSONObject LIZ(Map<K, ? extends V> map) {
        try {
            if (map == null) {
                return new JSONObject();
            }
            return new JSONObject(map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR_JSON_EXP_ERROR, e, null);
            return new JSONObject();
        }
    }
}
