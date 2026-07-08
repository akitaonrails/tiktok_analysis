package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07hS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1931607hS {
    public static final C1931607hS LIZ = new C1931607hS();

    public static boolean LIZ(int i, C1931707hT c1931707hT) {
        int iIntValue;
        if (c1931707hT == null) {
            return false;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C0C64.LJIILLIIL().LJJ(31744, "studio_hw_encode_fallback_target", "", true), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = -1;
            }
            arrayList.add(Integer.valueOf(iIntValue));
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_hw_encode_auto_fallback", true, false) || !arrayList.contains(Integer.valueOf(i)) || c1931707hT.LIZ >= C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_failure_auto_retry_count", true)) {
            return false;
        }
        c1931707hT.LIZ++;
        return true;
    }
}
