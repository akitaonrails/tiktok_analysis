package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0iQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242280iQs {
    public final List<C1242250iQp> LIZ;
    public final List<C1242250iQp> LIZIZ;
    public final List<MusNotice> LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public long LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LIZ.size());
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZIZ.size());
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZJ.size());
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1242280iQs(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.LIZ = arrayList;
        this.LIZIZ = arrayList2;
        this.LIZJ = arrayList3;
        this.LIZLLL = false;
        this.LJ = 0L;
        this.LJFF = 0L;
    }
}
