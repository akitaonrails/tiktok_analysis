package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0QVY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QVY {
    public static final C0QVY LIZ = new C0QVY();
    public static final Map<String, C671430QVh> LIZIZ = new LinkedHashMap();
    public static final Integer LIZJ = 0;
    public static long LIZLLL;
    public static long LJ;

    public static String LIZ(String str) {
        HashMap<?, ?> map;
        C671430QVh c671430QVh = (C671430QVh) ((LinkedHashMap) LIZIZ).get(str);
        if (c671430QVh != null && (map = c671430QVh.LIZIZ) != null && !map.isEmpty()) {
            return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), map);
        }
        return "[]";
    }
}
