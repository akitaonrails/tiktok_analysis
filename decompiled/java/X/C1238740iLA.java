package X;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0iLA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238740iLA {
    public static C19633311rf LIZ() {
        return LIZJ(C089Y.LIZ);
    }

    public static C19633311rf LIZIZ() {
        return LIZJ("guide");
    }

    public static C19633311rf LIZLLL() {
        return LIZJ("search");
    }

    public static C19633311rf LIZJ(String str) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        HashMap<String, C19633311rf> map = C1213480hgQ.LIZ;
        C19633311rf c19633311rf = map.get(str);
        if (c19633311rf == null) {
            C19633311rf c19633311rf2 = new C19633311rf(contextLIZ, str);
            map.put(str, c19633311rf2);
            return c19633311rf2;
        }
        return c19633311rf;
    }
}
