package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.04h3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1164704h3 {
    public final List<String> LIZ;
    public final Map<String, Integer> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CellData(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cellTypes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1164704h3(List<String> list, Map<String, Integer> map) {
        this.LIZ = list;
        this.LIZIZ = map;
    }
}
