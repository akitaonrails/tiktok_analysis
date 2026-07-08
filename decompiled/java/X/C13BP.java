package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.13BP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BP {
    public static final List<String> LIZIZ(C13BS c13bs) {
        Integer numValueOf;
        String string = C13LN.LJLZ(c13bs.LIZIZ()).toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < string.length()) {
            int i4 = i3 + 1;
            if (string.charAt(i2) == '0' && (numValueOf = Integer.valueOf(i3)) != null) {
                arrayList.add(numValueOf);
            }
            i2++;
            i3 = i4;
        }
        Map<String, C13BQ> map = c13bs.LIZ;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator<Map.Entry<String, C13BQ>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().getValue().LIZ);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            int i5 = i + 1;
            if (i >= 0) {
                if (arrayList.contains(Integer.valueOf(i))) {
                    arrayList3.add(obj);
                }
                i = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList3;
    }

    public static final C13BR LIZ(C13BS c13bs, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3 = c13bs.LIZJ;
        boolean z4 = false;
        if ((i3 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i3 & (i >>> 1)) == 0) {
            z2 = true;
        } else {
            z2 = false;
            if (!(!c13bs.LJ.isEmpty())) {
                z3 = false;
            }
            i2 = c13bs.LIZJ;
            if ((i2 & i) == 0 && (i2 & (i << 1)) != 0) {
                z4 = true;
            }
            return new C13BR(z, z2, z4, z3);
        }
        z3 = true;
        i2 = c13bs.LIZJ;
        if ((i2 & i) == 0) {
            z4 = true;
        }
        return new C13BR(z, z2, z4, z3);
    }
}
