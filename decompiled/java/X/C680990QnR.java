package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0QnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680990QnR {
    public final Map<String, String> LIZ = new HashMap();

    public final void LIZIZ(Map map) {
        if (map != null) {
            ((HashMap) this.LIZ).putAll(map);
        }
    }

    public final void LIZ(int i, String str) {
        LIZJ(str, String.valueOf(i));
    }

    public final void LIZJ(String str, String str2) {
        ((HashMap) this.LIZ).put(str, C2344109Gl.LIZ(str2));
    }
}
