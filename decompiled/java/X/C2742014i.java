package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.014i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2742014i {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(String str) {
        int iLJJIZ = a0.LJJIZ(str, '?', 0, false, 6);
        if (iLJJIZ == -1) {
            return C2097608Jq.LJ();
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str.substring(iLJJIZ + 1), new String[]{"&"}, 0, 6);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
            if (listLJJLIIIJILLIZJL2.size() == 2) {
                linkedHashMap.put(ListProtector.get(listLJJLIIIJILLIZJL2, 0), URLDecoder.decode((String) ListProtector.get(listLJJLIIIJILLIZJL2, 1)));
            }
        }
        return linkedHashMap;
    }

    public static String LIZIZ(String str) {
        if (str.length() == 0) {
            return null;
        }
        return (String) LIZ(str).get("resource_id");
    }
}
