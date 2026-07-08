package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289430jev {
    public final Map<String, C1311670kEn> LIZ;
    public Map<String, C1311670kEn> LIZIZ;

    public C1289430jev() {
        this.LIZ = new HashMap();
    }

    public C1289430jev(Map<String, C1311670kEn> map) {
        if (map == null) {
            this.LIZ = new HashMap();
        } else {
            this.LIZ = new HashMap(map);
        }
    }

    public final void LIZ(C1311670kEn c1311670kEn) {
        if (c1311670kEn == null) {
            return;
        }
        String str = c1311670kEn.LIZ;
        ((HashMap) this.LIZ).get(str);
        ((HashMap) this.LIZ).put(str, c1311670kEn);
    }

    public final C1311670kEn LIZIZ(String str) {
        C1311670kEn c1311670kEn;
        Map<String, C1311670kEn> map = this.LIZIZ;
        if ((map == null || (c1311670kEn = (C1311670kEn) ((HashMap) map).get(str)) == null) && (c1311670kEn = (C1311670kEn) ((HashMap) this.LIZ).get(str)) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No BehaviorController defined for class ");
            sbLIZ.append(str);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return c1311670kEn;
    }
}
