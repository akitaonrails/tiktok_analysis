package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0xI7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813450xI7 {
    public static EnumC1813530xIF LIZ(Integer num) {
        EnumC1813530xIF next;
        Iterator<EnumC1813530xIF> it2 = EnumC1813530xIF.getEntries().iterator();
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
        EnumC1813530xIF enumC1813530xIF = next;
        if (enumC1813530xIF == null) {
            return EnumC1813530xIF.PUBLIC;
        }
        return enumC1813530xIF;
    }
}
