package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08F8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08F8 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(957));

    public static List LIZ(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(j);
        String string = ((Keva) LIZ.getValue()).getString("exposed_aids", "");
        if (a0.LJJJIL(string)) {
            return new ArrayList();
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            C08F9 c08f9LIZIZ = LIZIZ((String) it2.next());
            if (c08f9LIZIZ != null) {
                arrayList.add(c08f9LIZIZ);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C08F9) obj).LIZIZ >= jCurrentTimeMillis) {
                arrayList2.add(obj);
            }
        }
        return new ArrayList(arrayList2);
    }

    public static C08F9 LIZIZ(String str) {
        Long lLJIILIIL;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{":"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() == 2 && (lLJIILIIL = C2095008Iq.LJIILIIL((String) ListProtector.get(listLJJLIIIJILLIZJL, 0))) != null) {
            long jLongValue = lLJIILIIL.longValue();
            Long lLJIILIIL2 = C2095008Iq.LJIILIIL((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
            if (lLJIILIIL2 != null) {
                return new C08F9(jLongValue, lLJIILIIL2.longValue());
            }
        }
        return null;
    }
}
