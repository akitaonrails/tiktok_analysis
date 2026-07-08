package X;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546330Lbj {
    public static final C546230LbZ LIZ(InterfaceC546090LbL interfaceC546090LbL) {
        C547860LeC.LIZ.getClass();
        return C547860LeC.LIZIZ().LJ(interfaceC546090LbL);
    }

    public static final C547200Ld8 LIZIZ(InterfaceC546090LbL interfaceC546090LbL) {
        C546230LbZ next;
        C547250LdD c547250LdD;
        C547200Ld8 c547200Ld8;
        C547860LeC.LIZ.getClass();
        Iterator<C546230LbZ> it2 = C547860LeC.LIZIZ().LJFF(true).iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!Intrinsics.LJFF(next.LIZ, interfaceC546090LbL));
        C546230LbZ c546230LbZ = next;
        if (c546230LbZ != null && (c547250LdD = (C547250LdD) c546230LbZ.LJ.getValue()) != null && (c547200Ld8 = c547250LdD.LIZ) != null) {
            return c547200Ld8;
        }
        return C547300LdI.LIZ;
    }
}
