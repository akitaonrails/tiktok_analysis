package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0n6T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421830n6T {
    public static EnumC1421840n6U LIZ(Integer num) {
        EnumC1421840n6U next;
        Iterator<EnumC1421840n6U> it2 = EnumC1421840n6U.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                int value = next.getValue();
                if (num != null && value == num.intValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC1421840n6U enumC1421840n6U = next;
        if (enumC1421840n6U == null) {
            return EnumC1421840n6U.VERTICAL;
        }
        return enumC1421840n6U;
    }
}
