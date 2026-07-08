package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0aGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928420aGe {
    public static final Set<C928440aGg> LIZ = new LinkedHashSet();

    public static void LIZ() {
        Set<C928440aGg> set = LIZ;
        if (set.size() > 5) {
            Iterator<C928440aGg> it2 = set.iterator();
            for (int i = 0; it2.hasNext() && i < LIZ.size() - 5; i++) {
                it2.next();
                it2.remove();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cleared old shown invite records, remaining: ");
            sbLIZ.append(LIZ.size());
            C20441214yg.LIZIZ("MgBubbleShowUtils", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static boolean LIZIZ(long j, long j2) {
        Set<C928440aGg> set = LIZ;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (C928440aGg c928440aGg : set) {
                if (c928440aGg.LIZ == j && c928440aGg.LIZIZ == j2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LIZJ(long j, long j2) {
        Set<C928440aGg> set = LIZ;
        set.add(new C928440aGg(j, j2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Record shown invite: roomId=");
        sbLIZ.append(j);
        sbLIZ.append(", time=");
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("MgBubbleShowUtils", C2188811AlT.LIZIZ(sbLIZ));
        if (set.size() > 10) {
            Iterator<C928440aGg> it2 = set.iterator();
            for (int size = set.size() - 10; it2.hasNext() && size > 0; size--) {
                it2.next();
                it2.remove();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Trimmed shown invite records to max size, remaining: ");
            sbLIZ2.append(LIZ.size());
            C20441214yg.LIZIZ("MgBubbleShowUtils", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
