package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0eYA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093040eYA {
    public final String LIZ;
    public final Object LIZIZ;
    public final Map<String, Object> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SResult(business=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", decisionValue=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1093040eYA(String str, Object obj, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = obj;
        this.LIZJ = map;
    }
}
