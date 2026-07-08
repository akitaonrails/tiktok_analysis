package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Wee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828420Wee {
    public final C1E6N LIZ;
    public final C1E6N LIZIZ;
    public final C1E6B LIZJ;
    public String LIZLLL;
    public final long LJ = System.currentTimeMillis();
    public Map<String, Object> LJFF = new LinkedHashMap();

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkSecurityEvent(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", target=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", channel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C828420Wee(C1E6N c1e6n, C1E6N c1e6n2, C1E6B c1e6b) {
        this.LIZ = c1e6n;
        this.LIZIZ = c1e6n2;
        this.LIZJ = c1e6b;
    }
}
