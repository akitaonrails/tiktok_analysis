package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0FSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390420FSm {
    public final Map<String, Object> LIZ = new LinkedHashMap();

    public final Object LIZ(String str) throws Exception {
        Object obj = ((LinkedHashMap) this.LIZ).get(str);
        if (obj != null) {
            return obj;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" has not been registered");
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Object LIZIZ(C19719912Dl c19719912Dl) throws Exception {
        Object obj = ((LinkedHashMap) this.LIZ).get(c19719912Dl.LIZLLL());
        if (obj != null) {
            C1300150jwD.LIZ(c19719912Dl, obj);
            return obj;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19719912Dl);
        sbLIZ.append(" has not been registered");
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Object LIZJ(C19719912Dl c19719912Dl) {
        Object obj = ((LinkedHashMap) this.LIZ).get(c19719912Dl.LIZLLL());
        if (obj != null) {
            C1300150jwD.LIZ(c19719912Dl, obj);
            return obj;
        }
        return null;
    }

    public final <T> void LIZLLL(T t) {
        String strLIZLLL = C13LE.LIZ(t.getClass()).LIZLLL();
        if (strLIZLLL != null) {
            this.LIZ.put(strLIZLLL, t);
        }
    }
}
