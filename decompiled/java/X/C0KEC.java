package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0KEC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KEC {
    public static EnumC514030KDx LIZ(long j) {
        EnumC514030KDx next;
        Iterator<EnumC514030KDx> it2 = EnumC514030KDx.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC514030KDx enumC514030KDx = next;
        if (enumC514030KDx == null) {
            return EnumC514030KDx.UNKNOWN;
        }
        return enumC514030KDx;
    }
}
