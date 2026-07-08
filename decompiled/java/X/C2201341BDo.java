package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.1BDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2201341BDo {
    public static final C2201341BDo LIZIZ = new C2201341BDo();
    public static final Set<InterfaceC2201351BDp> LIZJ = new HashSet();
    public C2201341BDo LIZ;

    public void LIZ(C2204041BNy c2204041BNy) {
        Iterator it2 = ((HashSet) LIZJ).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC2201351BDp) it2.next()).LJJJLZIJ()) {
                return;
            }
        }
        C2201341BDo c2201341BDo = this.LIZ;
        if (c2201341BDo != null) {
            c2201341BDo.LIZ(c2204041BNy);
        }
    }
}
