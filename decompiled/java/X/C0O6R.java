package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0O6R, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O6R {
    public static C0O68 LIZ = C0O68.UNKNOWN;
    public static final List<C0O6S> LIZIZ = new ArrayList();

    public static void LIZ(C0O68 c0o68) {
        if (LIZ != c0o68) {
            LIZ = c0o68;
            Iterator it2 = ((ArrayList) LIZIZ).iterator();
            while (it2.hasNext()) {
                ((C0O6S) it2.next()).LIZIZ(LIZ);
            }
        }
    }
}
