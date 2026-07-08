package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0TVC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TVC {
    public static final C0XGR LIZ(HashMap<String, String> map) {
        C0XGR c0xgr = new C0XGR();
        if (map == null) {
            return c0xgr;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c0xgr.LIZJ(entry.getKey(), entry.getValue());
        }
        return c0xgr;
    }
}
