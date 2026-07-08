package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00jd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C161500jd {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        String str;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() >= 2 && (str = (String) C13LP.LJJJLZIJ(1, list)) != null && a0.LJJIIZI(str, "|", false)) {
            String string = a0.LJLIIIL(u.LJJIFFI(u.LJJIFFI(str, "|", "", false), ":", "", false)).toString();
            if (string.length() > 0) {
                for (int i = 0; i < string.length(); i++) {
                    char cCharAt = string.charAt(i);
                    if (cCharAt == '-' || cCharAt == ' ') {
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                List listLIZIZ = LIZIZ((String) ListProtector.get(list, 0));
                ArrayList arrayList3 = (ArrayList) listLIZIZ;
                if (arrayList3.isEmpty()) {
                    return null;
                }
                arrayList2.add(listLIZIZ);
                int size = arrayList3.size();
                int size2 = arrayList.size();
                for (int i2 = 2; i2 < size2; i2++) {
                    List listLIZIZ2 = LIZIZ((String) ListProtector.get(list, i2));
                    ArrayList arrayList4 = (ArrayList) listLIZIZ2;
                    if (!arrayList4.isEmpty()) {
                        if (arrayList4.size() < size) {
                            int size3 = size - arrayList4.size();
                            ArrayList arrayList5 = new ArrayList(size3);
                            for (int i3 = 0; i3 < size3; i3++) {
                                arrayList5.add("");
                            }
                            listLIZIZ2 = C13LP.LJLIL(arrayList5, listLIZIZ2);
                        } else if (arrayList4.size() > size) {
                            listLIZIZ2 = C13LP.LL(listLIZIZ2, size);
                        }
                        arrayList2.add(listLIZIZ2);
                    }
                }
                if (arrayList2.size() < 2) {
                    return null;
                }
                return arrayList2;
            }
        }
        return null;
    }

    public static List LIZIZ(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"|"}, 0, 6);
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
}
