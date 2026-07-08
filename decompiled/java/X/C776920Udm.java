package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Udm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776920Udm {
    public static final Map<String, AbstractC776850Udf> LIZ = new HashMap();
    public static final String LIZIZ = "live_default_window";

    public static AbstractC776850Udf LIZ(String str) {
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        return (AbstractC776850Udf) ((HashMap) LIZ).get(str);
    }
}
