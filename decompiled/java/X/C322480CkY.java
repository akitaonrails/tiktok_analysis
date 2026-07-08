package X;

import java.util.List;

/* JADX INFO: renamed from: X.0CkY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322480CkY {
    public final List<String> LIZ;
    public final String LIZIZ;
    public final Exception LIZJ = null;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCArchWorkflowOutput(results=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C322480CkY(List list, String str, String str2) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZLLL = str2;
    }
}
