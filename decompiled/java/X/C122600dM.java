package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00dM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C122600dM {
    public static List LIZ(String str) {
        if (str != null && str.length() != 0) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJLIIIL((String) it2.next()).toString());
                if (numLJIIJJI != null) {
                    arrayList.add(numLJIIJJI);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
