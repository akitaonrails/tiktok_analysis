package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Rps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707980Rps {
    public String LIZ;
    public Map<String, ? extends Object> LIZIZ;

    public C707980Rps() {
        this(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(message:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", info:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C707980Rps(Object obj) {
        this.LIZ = null;
        this.LIZIZ = null;
    }
}
