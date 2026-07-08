package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0DUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339970DUl {
    public static EnumC339980DUm LIZ(int i) {
        EnumC339980DUm next;
        Iterator<EnumC339980DUm> it2 = EnumC339980DUm.getEntries().iterator();
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
        EnumC339980DUm enumC339980DUm = next;
        if (enumC339980DUm == null) {
            return EnumC339980DUm.NONE;
        }
        return enumC339980DUm;
    }
}
