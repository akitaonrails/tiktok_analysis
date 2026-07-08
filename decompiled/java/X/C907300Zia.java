package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0Zia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907300Zia {
    public static EnumC907290ZiZ LIZ(int i) {
        EnumC907290ZiZ next;
        Iterator<EnumC907290ZiZ> it2 = EnumC907290ZiZ.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getImSearchContentType() == i) {
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
