package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.03oi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C957403oi {
    public final Map<String, Object> LIZ = new HashMap();

    public final boolean LIZ(String str) {
        return ((HashMap) this.LIZ).containsKey(str);
    }

    public final void LJ(Map<String, ? extends Object> map) {
        ((HashMap) this.LIZ).putAll(map);
    }

    public final void LIZIZ(String str, Object obj) {
        if (obj != null) {
            ((HashMap) this.LIZ).put(str, obj);
        }
    }

    public final void LIZJ(String str, Object obj) {
        if (obj != null) {
            ((HashMap) this.LIZ).put(str, obj);
        }
    }

    public final void LIZLLL(String str, Object obj) {
        ((HashMap) this.LIZ).put(str, obj);
    }
}
