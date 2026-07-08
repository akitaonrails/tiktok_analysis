package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0ofw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482260ofw {
    public String LIZJ;
    public int LIZ = -1;
    public int LIZIZ = -1;
    public final HashMap<String, Object> LIZLLL = new HashMap<>();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoResponseInfo(isSuccess=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", customMap=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", callback=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(HashMap map) {
        if (map != null) {
            for (Object obj : map.keySet()) {
                Object obj2 = map.get(obj);
                if (obj2 != null) {
                    this.LIZLLL.put((String) obj, obj2);
                }
            }
        }
    }
}
