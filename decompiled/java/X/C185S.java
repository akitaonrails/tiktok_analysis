package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.185S, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185S {
    public final Map<Integer, C212275185h> LIZ = new LinkedHashMap();

    public final Map<String, String> LIZIZ(int i) {
        C212275185h c212275185h = (C212275185h) ((LinkedHashMap) this.LIZ).get(Integer.valueOf(i));
        if (c212275185h != null) {
            if (c212275185h.LIZIZ) {
                return c212275185h.LIZ.LIZ();
            }
            return c212275185h.LIZ.LIZIZ();
        }
        return null;
    }

    public final void LIZ(int i, C185Z c185z, boolean z) {
        this.LIZ.put(Integer.valueOf(i), new C212275185h(c185z, z));
    }
}
