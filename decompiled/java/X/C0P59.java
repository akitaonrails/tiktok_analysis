package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0P59, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P59 {
    public static final Map<String, C639290P5r> LIZ = new HashMap();

    public static C639290P5r LIZ(String str) {
        C639290P5r c639290P5r = (C639290P5r) ((HashMap) LIZ).get(str);
        if (c639290P5r == null) {
            return C639170P5f.LIZ;
        }
        return c639290P5r;
    }
}
