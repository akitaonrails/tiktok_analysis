package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0WLX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WLX {
    public final int LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final C0WLY LIZLLL;
    public final Map<String, ? extends Object> LJ;
    public final Throwable LJFF;
    public final ArrayList<C0WLW> LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[code = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msg = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", error = ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", strategyNames=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", result = ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", params = ");
        Map<String, ? extends Object> map = this.LJ;
        sbLIZ.append(map != null ? map.toString() : null);
        sbLIZ.append(", performance = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0WLX(int i, List list, ArrayList arrayList, int i2) {
        C0WLY c0wly;
        i = (i2 & 1) != 0 ? -1 : i;
        list = (i2 & 8) != 0 ? new ArrayList() : list;
        if ((i2 & 16) != 0) {
            c0wly = new Object() { // from class: X.0WLY
            };
        } else {
            c0wly = 0;
        }
        arrayList = (i2 & 128) != 0 ? new ArrayList() : arrayList;
        this.LIZ = i;
        this.LIZIZ = null;
        this.LIZJ = list;
        this.LIZLLL = c0wly;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = arrayList;
    }
}
