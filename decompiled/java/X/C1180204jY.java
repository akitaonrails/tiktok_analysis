package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.04jY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1180204jY {
    public static final int LIZ(List<Integer> list) {
        Object obj;
        Object next;
        if (((ArrayList) list).isEmpty()) {
            return 1;
        }
        ArrayList arrayList = (ArrayList) list;
        Iterator it2 = arrayList.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (((Number) next).intValue() == 8) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            num.intValue();
            return 8;
        }
        for (Object obj2 : arrayList) {
            int iIntValue = ((Number) obj2).intValue();
            if (iIntValue == 2 || iIntValue == 32 || iIntValue == 1) {
                obj = obj2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            num2.intValue();
            return 2;
        }
        return 16;
    }
}
