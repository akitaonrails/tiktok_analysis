package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0hlu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216880hlu {
    public static EnumC1208400hYE LIZ(int i) {
        EnumC1208400hYE next;
        Iterator<EnumC1208400hYE> it2 = EnumC1208400hYE.getEntries().iterator();
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
        EnumC1208400hYE enumC1208400hYE = next;
        if (enumC1208400hYE == null) {
            return EnumC1208400hYE.Unknown;
        }
        return enumC1208400hYE;
    }
}
