package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0zVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898870zVt {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(C1896810zSZ c1896810zSZ, List list) {
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (!((AbstractC1898880zVu) it2.next()).LIZ(c1896810zSZ)) {
                    return false;
                }
            }
        }
        return true;
    }
}
