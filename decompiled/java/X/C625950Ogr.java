package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0Ogr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625950Ogr {
    public static final C625950Ogr LIZ = new C625950Ogr();
    public static final Object LIZIZ = new Object();
    public static volatile boolean LIZJ;

    public static Set LIZ() {
        Set<String> stringSet = C625720OgU.LIZIZ().getStringSet("day_low_net_days", new LinkedHashSet());
        return stringSet == null ? new LinkedHashSet() : stringSet;
    }

    public static final void LIZLLL() {
        Set<String> setLIZ = LIZ();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / ((long) 86400000));
        setLIZ.add(String.valueOf(iCurrentTimeMillis));
        if (setLIZ.size() <= 30) {
            C625720OgU.LIZIZ().LJIIIZ("day_low_net_days", setLIZ);
            return;
        }
        int i = iCurrentTimeMillis - 90;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = setLIZ.iterator();
        while (it2.hasNext()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
            if (numLJIIJJI != null) {
                arrayList.add(numLJIIJJI);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue < i || iIntValue > iCurrentTimeMillis) {
                arrayList2.add(obj);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            LIZJ(setLIZ, ((Number) it3.next()).intValue());
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = setLIZ.iterator();
        while (it4.hasNext()) {
            Integer numLJIIJJI2 = C2095008Iq.LJIIJJI((String) it4.next());
            if (numLJIIJJI2 != null) {
                arrayList3.add(numLJIIJJI2);
            }
        }
        List listLJLLJ = C13LP.LJLLJ(C13LP.LJJJJI(arrayList3));
        int size = listLJLLJ.size() - 30;
        if (size > 0) {
            Iterator it5 = C13LP.LL(listLJLLJ, size).iterator();
            while (it5.hasNext()) {
                LIZJ(setLIZ, ((Number) it5.next()).intValue());
            }
        }
        C625720OgU.LIZIZ().LJIIIZ("day_low_net_days", setLIZ);
    }

    public static String LIZIZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(Set set, int i) {
        C625720OgU.LIZIZ().LIZ(LIZIZ(i, "day_low_net_request_count_"));
        C625720OgU.LIZIZ().LIZ(LIZIZ(i, "day_low_net_wifi_request_count_"));
        C625720OgU.LIZIZ().LIZ(LIZIZ(i, "day_low_net_low_net_request_count_"));
        set.remove(String.valueOf(i));
    }
}
