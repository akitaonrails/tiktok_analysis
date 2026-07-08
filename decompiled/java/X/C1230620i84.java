package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0i84, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230620i84 {
    public static final Map<String, C1230610i83> LIZ = new LinkedHashMap();
    public static final Set<String> LIZIZ = new LinkedHashSet();

    public static String LIZ(String str) {
        C1230610i83 c1230610i83 = (C1230610i83) ((LinkedHashMap) LIZ).get(str);
        if (c1230610i83 != null) {
            return c1230610i83.LIZIZ;
        }
        return null;
    }
}
