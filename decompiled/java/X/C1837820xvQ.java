package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0xvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837820xvQ {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(C1404610meh c1404610meh, Class cls) {
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (cls.isInstance(next)) {
                if (next != null) {
                    return next;
                }
            }
        }
        return null;
    }
}
