package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0lIM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352320lIM {
    public static final C1352320lIM LIZ = new C1352320lIM();
    public static final Map<String, C1352330lIN> LIZIZ = new LinkedHashMap();

    public static C1352330lIN LIZ(String str) {
        Map<String, C1352330lIN> map = LIZIZ;
        C1352330lIN c1352330lIN = (C1352330lIN) ((LinkedHashMap) map).get(str);
        if (c1352330lIN != null) {
            return c1352330lIN;
        }
        C1352330lIN c1352330lIN2 = new C1352330lIN(0);
        map.put(str, c1352330lIN2);
        return c1352330lIN2;
    }
}
