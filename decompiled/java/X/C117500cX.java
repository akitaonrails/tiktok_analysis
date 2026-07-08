package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00cX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C117500cX {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(90));

    public static List LIZ(String str) {
        Pair pair;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{":"}, 0, 6);
            if (listLJJLIIIJILLIZJL2.size() == 2) {
                pair = new Pair(a0.LJLIIIL((String) ListProtector.get(listLJJLIIIJILLIZJL2, 0)).toString(), a0.LJLIIIL((String) ListProtector.get(listLJJLIIIJILLIZJL2, 1)).toString());
            } else {
                pair = null;
            }
            arrayList.add(pair);
        }
        List listLJJJJLI = C13LP.LJJJJLI(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (ArrayList) listLJJJJLI) {
            if (((List) LIZ.getValue()).contains(((Pair) obj).getFirst())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
