package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0pue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529820pue {
    public final int LIZ;
    public final String LIZIZ;
    public final HashMap<String, Object> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errorCode: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMessage: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", category: ");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1529820pue(int i, String str, HashMap<String, Object> map) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}
