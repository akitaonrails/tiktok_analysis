package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0btt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991190btt {
    public static final Map<String, Integer> LIZ = new LinkedHashMap();

    public static int LIZ(String str) {
        Integer numRemove = LIZ.remove(str);
        if (numRemove != null) {
            return numRemove.intValue();
        }
        return -1;
    }
}
