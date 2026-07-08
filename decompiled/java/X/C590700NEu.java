package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0NEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590700NEu {
    public static EnumC590690NEt LIZ(int i) {
        EnumC590690NEt next;
        Iterator<EnumC590690NEt> it2 = EnumC590690NEt.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC590690NEt enumC590690NEt = next;
        if (enumC590690NEt == null) {
            return EnumC590690NEt.NO_SORT;
        }
        return enumC590690NEt;
    }
}
