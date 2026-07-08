package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0ft6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144460ft6 {
    public static String LIZ(int i) {
        EnumC1144450ft5 next;
        Iterator<EnumC1144450ft5> it2 = EnumC1144450ft5.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getId() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC1144450ft5 enumC1144450ft5 = next;
        if (enumC1144450ft5 == null) {
            return null;
        }
        return enumC1144450ft5.getTypeKey();
    }
}
