package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0FGI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FGI {
    public int LIZ;
    public final Map<Integer, List<Integer>> LIZIZ = new LinkedHashMap();
    public final Map<Integer, List<Integer>> LIZJ = new LinkedHashMap();
    public C0FGH LIZLLL;
    public boolean LJ;

    public final void LIZ(int i, int i2, int i3) {
        if (this.LIZ != i) {
            List list = (List) ((LinkedHashMap) this.LIZIZ).get(Integer.valueOf(i));
            if (list != null) {
                list.clear();
            }
            List list2 = (List) ((LinkedHashMap) this.LIZJ).get(Integer.valueOf(i));
            if (list2 != null) {
                list2.clear();
            }
        }
        ArrayList arrayList = new ArrayList();
        int i4 = i3 + 1;
        while (i2 < i4) {
            arrayList.add(Integer.valueOf(i2));
            i2++;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            List list3 = (List) ((LinkedHashMap) this.LIZIZ).get(Integer.valueOf(i));
            if (list3 == null || !list3.contains(Integer.valueOf(iIntValue))) {
                arrayList2.add(Integer.valueOf(iIntValue));
            }
        }
        this.LIZ = i;
        this.LIZIZ.put(Integer.valueOf(i), new ArrayList());
        List list4 = (List) ((LinkedHashMap) this.LIZIZ).get(Integer.valueOf(i));
        if (list4 != null) {
            list4.addAll(arrayList);
        }
        if (this.LJ) {
            Object arrayList3 = ((LinkedHashMap) this.LIZJ).get(Integer.valueOf(i));
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                this.LIZJ.put(Integer.valueOf(i), (List<Integer>) arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                int iIntValue2 = ((Number) it3.next()).intValue();
                if (!((List) arrayList3).contains(Integer.valueOf(iIntValue2))) {
                    arrayList4.add(Integer.valueOf(iIntValue2));
                }
            }
            List list5 = (List) ((LinkedHashMap) this.LIZJ).get(Integer.valueOf(i));
            if (list5 != null) {
                list5.addAll(arrayList4);
            }
            C0FGH c0fgh = this.LIZLLL;
            if (c0fgh != null) {
                c0fgh.LIZ(i, arrayList4);
                return;
            }
            return;
        }
        C0FGH c0fgh2 = this.LIZLLL;
        if (c0fgh2 != null) {
            c0fgh2.LIZ(i, arrayList2);
        }
    }
}
