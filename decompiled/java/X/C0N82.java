package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0N82, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N82 {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, Float> LIZLLL;
    public final long LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0N82(Map<String, Float> map) {
        this.LIZLLL = map;
        String strLIZ = C588890N7v.LIZ(map);
        this.LIZIZ = strLIZ;
        this.LIZJ = C588890N7v.LIZJ(strLIZ);
        this.LIZ = C588890N7v.LIZIZ(strLIZ);
        this.LJ = System.currentTimeMillis() / 1000;
    }
}
