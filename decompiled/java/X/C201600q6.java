package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import webcast.data.host_board.DisplayPosition;

/* JADX INFO: renamed from: X.00q6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C201600q6 {
    public List<C2757014x> LIZ;
    public DisplayPosition LIZIZ;
    public boolean LIZJ;

    public C201600q6() {
        this(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillboardData(boardPageList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", updateByIM=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        List<C2757014x> list = this.LIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C2757014x> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LIZ.nonDeletable) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LIZIZ() {
        List<C2757014x> list = this.LIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C2757014x> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ.nonFoldable) {
                    return false;
                }
            }
        }
        return true;
    }

    public C201600q6(Object obj) {
        this.LIZ = new ArrayList();
        this.LIZIZ = null;
        this.LIZJ = false;
    }
}
