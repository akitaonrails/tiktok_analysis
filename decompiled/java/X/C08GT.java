package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08GT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08GT {
    public static C08GS LIZ(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        int size = listLJJLIIIJILLIZJL.size();
        if (size != 2) {
            if (size != 4) {
                listLJJLIIIJILLIZJL.size();
                return null;
            }
            return LIZIZ(listLJJLIIIJILLIZJL, true);
        }
        return LIZIZ(listLJJLIIIJILLIZJL, false);
    }

    public static C08GS LIZIZ(List list, boolean z) {
        Pair pair;
        int iIntValue;
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJJJJZ("X", (String) ListProtector.get(list, 0)));
        if (numLJIIJJI != null) {
            int iIntValue2 = numLJIIJJI.intValue();
            Object obj = ListProtector.get(list, 1);
            if (((String) obj).length() <= 0) {
                obj = null;
            }
            String str = (String) obj;
            if (str == null) {
                return null;
            }
            if (z) {
                Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(a0.LJJJJZ("F", (String) ListProtector.get(list, 2)));
                if (numLJIIJJI2 != null && (iIntValue = numLJIIJJI2.intValue()) >= 0 && iIntValue < C08GV.values().length) {
                    C08GV c08gv = C08GV.values()[numLJIIJJI2.intValue()];
                    if (c08gv != null) {
                        Object obj2 = ListProtector.get(list, 3);
                        if (((String) obj2).length() <= 0 || obj2 == null) {
                            return null;
                        }
                        pair = new Pair(c08gv, obj2);
                    }
                }
                Objects.toString(ListProtector.get(list, 2));
                return null;
            }
            pair = new Pair(null, null);
            return new C08GS(iIntValue2, str, (C08GV) pair.getFirst(), (String) pair.getSecond());
        }
        Objects.toString(ListProtector.get(list, 0));
        return null;
    }
}
