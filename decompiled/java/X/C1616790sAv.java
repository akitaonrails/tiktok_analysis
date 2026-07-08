package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0sAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616790sAv {
    public static EnumC1616780sAu LIZ(int i) {
        EnumC1616780sAu next;
        Iterator<EnumC1616780sAu> it2 = EnumC1616780sAu.getEntries().iterator();
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
        EnumC1616780sAu enumC1616780sAu = next;
        if (enumC1616780sAu == null) {
            return EnumC1616780sAu.UNSPECIFIED;
        }
        return enumC1616780sAu;
    }
}
