package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ExJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381350ExJ {
    public final int LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;

    public C381350ExJ() {
        this(0, null, 7);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskError(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', extraMap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C381350ExJ(int i, String str, int i2) {
        LinkedHashMap linkedHashMap;
        i = (i2 & 1) != 0 ? 0 : i;
        str = (i2 & 2) != 0 ? "" : str;
        if ((i2 & 4) != 0) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = null;
        }
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = linkedHashMap;
    }
}
