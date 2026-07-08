package X;

import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.15r1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20648515r1 {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;
    public transient AbstractC1781520wSc LIZLLL;
    public transient AbstractC20652915rj LJ;
    public transient C20652515rf LJFF;
    public int LJI;
    public int LJII;
    public final CopyOnWriteArrayList<OutreachRecordData> LJIIIIZZ = new CopyOnWriteArrayList<>();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rule: ruleId = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", quota = ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", sceneDimension:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", timeWindowDimension = ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", outreachTypeDimension: ");
        sbLIZ.append(this.LJFF);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20648515r1(String str, List<String> list, List<String> list2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = list2;
    }
}
