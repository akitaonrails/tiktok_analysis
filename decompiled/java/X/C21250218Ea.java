package X;

import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21250218Ea {
    public static final C21250218Ea LIZ = new C21250218Ea();
    public static final String LIZIZ;
    public static final String LIZJ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HybridContainerFinder_");
        sbLIZ.append("find");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZJ = "finder";
    }

    public static boolean LIZ(Object obj) {
        if (obj == null) {
            return false;
        }
        C18IP c18ip = C18IP.LIZ;
        c18ip.getClass();
        for (C1206720hVW c1206720hVW : (CopyOnWriteArraySet) C18IP.LJJII.getValue(c18ip, C18IP.LIZIZ[21])) {
            if (Intrinsics.LJFF(c1206720hVW.LIZ, obj.getClass()) || obj.getClass().getName().equals(c1206720hVW.LIZIZ)) {
                return true;
            }
        }
        return false;
    }
}
