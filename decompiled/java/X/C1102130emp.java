package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0emp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102130emp {
    public final List<C1102210emx> LIZ;
    public final List<C1102200emw> LIZIZ;
    public final int LIZJ;

    public final String LIZ() {
        C1102200emw c1102200emw;
        C1102210emx c1102210emx;
        String str;
        List<C1102210emx> list = this.LIZ;
        if (list != null && (c1102210emx = (C1102210emx) C13LP.LJJJLL(list)) != null && (str = c1102210emx.LIZ) != null) {
            return str;
        }
        List<C1102200emw> list2 = this.LIZIZ;
        if (list2 == null || (c1102200emw = (C1102200emw) C13LP.LJJJLL(list2)) == null) {
            return null;
        }
        return c1102200emw.LIZ;
    }

    public final List<String> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        List<C1102210emx> list = this.LIZ;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1102210emx> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().LIZ);
            }
            arrayList.addAll(arrayList2);
        }
        List<C1102200emw> list2 = this.LIZIZ;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C1102200emw> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next().LIZ);
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public C1102130emp(List<C1102210emx> list, List<C1102200emw> list2, int i) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = i;
    }
}
