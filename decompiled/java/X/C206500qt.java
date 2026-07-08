package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.00qt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C206500qt {
    public static final List<String> LIZ;
    public static final List<String> LIZIZ;
    public static final Map<String, List<String>> LIZJ;
    public static final Map<String, List<String>> LIZLLL;
    public static final HashMap<String, String> LJ;

    static {
        String str = C0UD4.LJFF;
        List<String> listSingletonList = Collections.singletonList(str);
        LIZ = listSingletonList;
        List<String> listSingletonList2 = Collections.singletonList("liveguestbeauty");
        LIZIZ = listSingletonList2;
        Map<String, List<String>> mapLIZJ = C2097908Jt.LIZJ(new Pair("beauty_group", C13LP.LJLIL(listSingletonList2, listSingletonList)));
        LIZJ = mapLIZJ;
        LIZLLL = C2097608Jq.LJIIIIZZ(new Pair("broadcast", Collections.singletonList(str)), new Pair("guest_linkmic", Collections.singletonList("liveguestbeauty")));
        LJ = new HashMap<>();
        for (Object obj : mapLIZJ.keySet()) {
            List<String> list = LIZJ.get(obj);
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    LJ.put(it2.next(), (String) obj);
                }
            }
        }
    }

    public static Set LIZ(String str) {
        List<String> list;
        Map<String, List<String>> map = LIZLLL;
        if (!map.containsKey(str)) {
            return C08CX.INSTANCE;
        }
        List<String> list2 = map.get(str);
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            String str2 = LJ.get(it2.next());
            if (str2 != null && (list = LIZJ.get(str2)) != null) {
                linkedHashSet.addAll(list);
            }
        }
        linkedHashSet.addAll(list2);
        return linkedHashSet;
    }
}
