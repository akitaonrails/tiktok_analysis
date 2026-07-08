package X;

import java.util.Iterator;
import java.util.Set;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0hkh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1216130hkh {
    public static boolean LIZ(String str, Set set) {
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(str, (String) it2.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
