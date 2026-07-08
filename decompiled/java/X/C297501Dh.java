package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01Dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C297501Dh {
    public String LIZ;
    public final Map<String, String> LIZIZ = new LinkedHashMap();

    public C297501Dh(String str) {
        Pair pair;
        String strLIZ;
        this.LIZ = "";
        int iLJJJ = a0.LJJJ(str, "://", 0, false, 6);
        if (iLJJJ > 0) {
            String strSubstring = str.substring(iLJJJ + 3);
            int iLJJIZ = a0.LJJIZ(strSubstring, '?', 0, false, 6);
            if (iLJJIZ == -1) {
                pair = new Pair(strSubstring, "");
            } else {
                pair = new Pair(C13LN.LJZL(iLJJIZ, strSubstring), strSubstring.substring(iLJJIZ + 1));
            }
            String str2 = (String) pair.getFirst();
            String str3 = (String) pair.getSecond();
            this.LIZ = str2;
            if (!a0.LJJJIL(str3)) {
                List listLJJLIIIJ = a0.LJJLIIIJ(str3, new char[]{'&'}, false, 0, 6);
                ArrayList<List> arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
                Iterator it2 = listLJJLIIIJ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(a0.LJJLIIIJ((String) it2.next(), new char[]{'='}, false, 2, 2));
                }
                for (List list : arrayList) {
                    String strLIZ2 = C297601Di.LIZ((String) ListProtector.get(list, 0));
                    if (list.size() != 2) {
                        strLIZ = "";
                    } else {
                        strLIZ = C297601Di.LIZ((String) ListProtector.get(list, 1));
                    }
                    this.LIZIZ.put(strLIZ2, strLIZ);
                }
            }
        }
    }
}
