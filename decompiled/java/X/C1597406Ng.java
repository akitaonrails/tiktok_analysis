package X;

import java.util.Map;

/* JADX INFO: renamed from: X.06Ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1597406Ng {
    public final boolean LIZ;
    public final Map<String, Object> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImmersiveBaseParam(inSelfImmersion=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", expandParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1597406Ng(boolean z, Map<String, ? extends Object> map) {
        this.LIZ = z;
        this.LIZIZ = map;
    }
}
