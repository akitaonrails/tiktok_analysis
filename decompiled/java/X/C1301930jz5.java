package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0jz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301930jz5 {
    public static EnumC1301920jz4 LIZ(int i) {
        EnumC1301920jz4 next;
        Iterator<EnumC1301920jz4> it2 = EnumC1301920jz4.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getCode() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }
}
