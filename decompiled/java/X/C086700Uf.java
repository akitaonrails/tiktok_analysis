package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00Uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C086700Uf {
    public static final Map<String, List<String>> LIZ = C2097608Jq.LJIIJ(new Pair("local_notify_4_non_login_users", C1697810uHb.LJIIJJI("71367915", "71367916")));
    public static List<String> LIZIZ;

    public static String LIZ(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        if (LIZIZ == null) {
            Collection<List> collectionValues = ((LinkedHashMap) LIZ).values();
            ArrayList arrayList = new ArrayList();
            for (List list : collectionValues) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((String) obj).length() > 0) {
                        arrayList2.add(obj);
                    }
                }
                C19719612Di.LJJI(arrayList2, arrayList);
            }
            LIZIZ = arrayList;
        }
        if (LIZIZ != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listLJJLIIIJILLIZJL) {
                if (!((ArrayList) r3).contains(obj2)) {
                    arrayList3.add(obj2);
                }
            }
            return C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
