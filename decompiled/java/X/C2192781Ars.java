package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.1Ars, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192781Ars {
    public static EnumC2192761Arq LIZ(int i) {
        EnumC2192761Arq next;
        Iterator<EnumC2192761Arq> it2 = EnumC2192761Arq.getEntries().iterator();
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
        EnumC2192761Arq enumC2192761Arq = next;
        if (enumC2192761Arq == null) {
            return EnumC2192761Arq.Unknown;
        }
        return enumC2192761Arq;
    }
}
