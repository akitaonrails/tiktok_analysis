package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.081V, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C081V implements InterfaceC205300qh {
    TRUE,
    FALSE,
    NULL;

    public static final Map<String, C081V> LL = new HashMap(128);

    static {
        for (C081V c081v : values()) {
            LL.put(c081v.name().toLowerCase(), c081v);
        }
    }

    public static C081V getKeyWord(String str) {
        return (C081V) ((HashMap) LL).get(str.toLowerCase());
    }

    public static C081V valueOf(String str) {
        return (C081V) C08FF.LIZ(C081V.class, str);
    }
}
