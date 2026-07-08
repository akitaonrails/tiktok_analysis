package X;

import com.bytedance.keva.Keva;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.07hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1933207hi {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1933307hj());
    public static String LIZIZ;

    public static void LIZ(Set set) {
        HashSet hashSet = new HashSet(set);
        StringBuilder sb = new StringBuilder();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            sb.append(((Long) it2.next()).longValue());
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        LIZIZ = sb.toString();
        ((Keva) LIZ.getValue()).storeString("discard_cid_list_key", LIZIZ);
    }
}
