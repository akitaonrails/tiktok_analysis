package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0o5Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459700o5Y {
    public static List LIZ(List list) {
        if (C1428540nHI.LIZ()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            Integer numValueOf = null;
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (((C1460620o72) obj).LIZ == 25) {
                        numValueOf = Integer.valueOf(i);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_put_save_local_to_bottom", true, false)) {
                    ListProtector.add(arrayList, 0, ListProtector.remove(arrayList, iIntValue));
                    ListProtector.add(arrayList, 1, ListProtector.remove(arrayList, iIntValue + 1));
                } else {
                    ListProtector.remove(arrayList, iIntValue + 1);
                    arrayList.add(ListProtector.remove(arrayList, iIntValue));
                    return arrayList;
                }
            }
            return arrayList;
        }
        return list;
    }
}
