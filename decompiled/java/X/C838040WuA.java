package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838040WuA {
    public int LIZ;
    public String LIZIZ;
    public Object LIZJ;
    public final Map<String, Object> LIZLLL;

    public C838040WuA() {
        this(0, null, 7);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckResult(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msg='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', needAbnormalHandler=");
        sbLIZ.append(false);
        sbLIZ.append(", intercept=");
        sbLIZ.append(false);
        sbLIZ.append(", extraMap=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C838040WuA(int i, String str, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        str = (i2 & 2) != 0 ? "" : str;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = null;
        this.LIZLLL = new LinkedHashMap();
    }
}
