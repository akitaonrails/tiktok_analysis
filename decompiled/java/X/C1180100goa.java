package X;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0goa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180100goa {
    public static C1180090goZ LIZ(String str) {
        Object next;
        Iterator it2 = C13LP.LLIIII(C1180170goh.LIZIZ.keySet()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C1180090goZ) next).LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1180090goZ c1180090goZ = (C1180090goZ) next;
        if (c1180090goZ == null) {
            return new C1180090goZ("unknown");
        }
        return c1180090goZ;
    }
}
