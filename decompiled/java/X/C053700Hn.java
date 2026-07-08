package X;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: X.00Hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C053700Hn {
    public final C1D82[] LIZ;
    public final Map<String, AnonymousClass0027> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaveNetParams(startNodes=");
        sbLIZ.append(Arrays.toString(this.LIZ));
        sbLIZ.append(", taskConfigParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C053700Hn(Map map, C1D82[] c1d82Arr) {
        this.LIZ = c1d82Arr;
        this.LIZIZ = map;
    }
}
