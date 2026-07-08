package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0nMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431990nMr {
    public final Set<InterfaceC1432000nMs> LIZ = new LinkedHashSet();

    public final String LIZ(EnumC1434770nRL enumC1434770nRL) {
        InterfaceC1432000nMs next;
        Iterator<InterfaceC1432000nMs> it2 = this.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ() == enumC1434770nRL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1432000nMs interfaceC1432000nMs = next;
        if (interfaceC1432000nMs == null) {
            return null;
        }
        return interfaceC1432000nMs.LIZIZ();
    }
}
