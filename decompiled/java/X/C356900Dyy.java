package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Dyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C356900Dyy {
    public final int LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MagicError(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C356900Dyy(int i, String str) {
        this(i, str, new LinkedHashMap());
    }

    public C356900Dyy(int i, String str, Map<String, String> map) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = map;
    }
}
