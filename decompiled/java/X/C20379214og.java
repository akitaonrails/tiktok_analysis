package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.14og, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20379214og {
    public static final C20426414wI LIZ(Long l, List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                long j = ((C20426414wI) next).LIZ;
                if (l != null && j == l.longValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C20426414wI) next;
    }

    public static final C20425114w5 LIZIZ(Long l, List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                long j = ((C20425114w5) next).LIZ;
                if (l != null && j == l.longValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C20425114w5) next;
    }
}
