package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00cW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C117400cW {
    public static List LIZ(String str) {
        List listLJJLIIIJILLIZJL;
        if (str != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return null;
    }
}
