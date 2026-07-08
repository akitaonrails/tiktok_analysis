package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VMO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VMO {
    public final C0VMP LIZ = new C0VMP();

    public static C0VMQ LIZ(String str, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C0VMI c0vmi = (C0VMI) it2.next();
            if (Intrinsics.LJFF(c0vmi.LIZ, str)) {
                return new C0VMQ(c0vmi.LIZ, c0vmi.LIZIZ, c0vmi.LIZJ, c0vmi.LJ);
            }
        }
        return null;
    }
}
