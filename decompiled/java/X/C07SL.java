package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.07SL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07SL {
    public static final HashMap<String, C07T8> LIZ;
    public static final C07SN LIZIZ;
    public static List<String> LIZJ;

    static {
        HashMap<String, C07T8> map = new HashMap<>();
        LIZ = map;
        LIZIZ = new C07SN(map);
        LIZJ = C13BV.INSTANCE;
    }

    public static void LIZ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C07T8 c07t8 = (C07T8) it2.next();
            LIZ.put(c07t8.getEventName(), c07t8);
        }
    }
}
