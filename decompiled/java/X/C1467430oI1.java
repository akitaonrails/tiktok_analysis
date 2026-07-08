package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oI1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467430oI1 {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;

    public final Map LIZ() {
        HashMap map = new HashMap();
        map.put("avg_pow", Integer.valueOf(this.LIZIZ));
        map.put("max_pow", Integer.valueOf(this.LIZ));
        int i = this.LIZJ;
        if (i > 0) {
            map.put("over_pow", Integer.valueOf(i));
        }
        return map;
    }
}
