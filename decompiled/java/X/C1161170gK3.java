package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gK3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161170gK3 {
    public static C1161180gK4 LIZ(String str, String str2) {
        List listLLIIII;
        Object next;
        C1161200gK6 c1161200gK6LIZ = C1161190gK5.LIZ(str);
        if (c1161200gK6LIZ != null && (listLLIIII = C13LP.LLIIII(c1161200gK6LIZ.LIZIZ.keySet())) != null) {
            Iterator it2 = listLLIIII.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C1161180gK4) next).LIZ, str2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1161180gK4 c1161180gK4 = (C1161180gK4) next;
            if (c1161180gK4 != null) {
                return c1161180gK4;
            }
        }
        return new C1161180gK4("unknown");
    }
}
