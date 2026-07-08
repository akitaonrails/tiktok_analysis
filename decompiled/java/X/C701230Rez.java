package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Rez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701230Rez {
    public static final String LIZ(C700950ReX c700950ReX) {
        String str;
        List<C700970ReZ> list = c700950ReX.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<C700970ReZ> it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = it2.next().LIZJ;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        List<C700970ReZ> list2 = c700950ReX.LIZJ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<C700970ReZ> it3 = list2.iterator();
        while (it3.hasNext()) {
            String str3 = it3.next().LIZJ;
            if (str3 != null) {
                arrayList2.add(str3);
            }
        }
        List<C700970ReZ> list3 = c700950ReX.LIZLLL;
        ArrayList arrayList3 = new ArrayList();
        Iterator<C700970ReZ> it4 = list3.iterator();
        while (it4.hasNext()) {
            String str4 = it4.next().LIZJ;
            if (str4 != null) {
                arrayList3.add(str4);
            }
        }
        AbstractC701310Rf7 abstractC701310Rf7 = c700950ReX.LJ;
        if (abstractC701310Rf7 instanceof C701320Rf8) {
            str = "release";
        } else if (abstractC701310Rf7 instanceof C701300Rf6) {
            str = "apply";
        } else {
            str = "unknown";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("behavior=");
        sbLIZ.append(str);
        sbLIZ.append(", output=");
        sbLIZ.append(arrayList);
        sbLIZ.append(", avoid=");
        sbLIZ.append(arrayList2);
        sbLIZ.append(", invalid=");
        sbLIZ.append(arrayList3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
