package X;

import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.13EP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13EP extends C19719612Di {
    public static final int LJJIJIIJIL(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Element index ");
        sbLIZ.append(i);
        sbLIZ.append(" must be in range [");
        sbLIZ.append(new IntRange(0, list.size() - 1));
        sbLIZ.append("].");
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final int LJJIJIL(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Position index ");
        sbLIZ.append(i);
        sbLIZ.append(" must be in range [");
        sbLIZ.append(new IntRange(0, list.size()));
        sbLIZ.append("].");
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
