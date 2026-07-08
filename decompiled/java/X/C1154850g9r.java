package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0g9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154850g9r {
    public EnumC1154840g9q LIZ;
    public final Map<String, Object> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SSRRequest(bundleSrc=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1154850g9r(EnumC1154840g9q enumC1154840g9q, Map<String, ? extends Object> map) {
        this.LIZ = enumC1154840g9q;
        this.LIZIZ = map;
    }
}
