package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0mfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405110mfV {
    public static EnumC1405120mfW LIZ(int i) {
        EnumC1405120mfW next;
        Iterator<EnumC1405120mfW> it2 = EnumC1405120mfW.getEntries().iterator();
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
        EnumC1405120mfW enumC1405120mfW = next;
        if (enumC1405120mfW == null) {
            return EnumC1405120mfW.DEFAULT;
        }
        return enumC1405120mfW;
    }
}
