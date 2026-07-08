package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.09ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2424909ep {
    public final Set LIZ = new HashSet();

    public final synchronized void LIZ(AbstractC2457909k9 abstractC2457909k9) {
        Iterator it2 = ((HashSet) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2425409eu) it2.next()).LIZ(abstractC2457909k9);
        }
    }
}
