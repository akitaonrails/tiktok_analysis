package X;

import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00jo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C162600jo {
    public static final Object LIZ(String str, Map map) {
        if (map.isEmpty()) {
            return null;
        }
        Object obj = map.get(str);
        if (obj == null) {
            Set<Map.Entry> setEntrySet = map.entrySet();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            for (Map.Entry entry : setEntrySet) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (Intrinsics.LJFF(str2.toLowerCase(Locale.ROOT), lowerCase)) {
                    return value;
                }
            }
            return null;
        }
        return obj;
    }
}
