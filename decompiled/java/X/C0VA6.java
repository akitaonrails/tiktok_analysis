package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VA6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VA6 {
    public final String LIZ;
    public List<Integer> LIZIZ = new ArrayList();
    public List<Long> LIZJ = new ArrayList();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CpuClusterInfo{name='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", affectedCpuList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", freqList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VA6(String str) {
        this.LIZ = str;
    }
}
