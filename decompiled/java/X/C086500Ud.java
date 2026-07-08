package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.00Ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C086500Ud {
    public static List LIZ(int i, List list, List list2) {
        if (i <= 0) {
            return C13BV.INSTANCE;
        }
        int iMin = Math.min(i - Math.min(i / 2, list.size()), list2.size());
        int iMin2 = Math.min(i - iMin, list.size());
        if (iMin2 == 0 && iMin == 0) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(iMin2 + iMin);
        if (iMin2 > 0) {
            C19719612Di.LJJI(list.subList(0, iMin2), arrayList);
        }
        if (iMin > 0) {
            C19719612Di.LJJI(list2.subList(0, iMin), arrayList);
        }
        return arrayList;
    }
}
