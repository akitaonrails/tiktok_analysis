package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2347509Ht {
    public static final JSONObject LIZ(Map<String, String> map) {
        C543670LTx c543670LTx = new C543670LTx();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c543670LTx.LIZLLL(entry.getKey(), entry.getValue());
        }
        return c543670LTx.LJ();
    }
}
